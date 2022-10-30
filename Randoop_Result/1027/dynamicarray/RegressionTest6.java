package dynamicarray;

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
    public void test3002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3002");
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
    public void test3003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3003");
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
    public void test3004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3004");
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
    public void test3005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3005");
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
    public void test3006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3006");
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
    public void test3007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3007");
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
    public void test3008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3008");
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
    public void test3009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3009");
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
    public void test3010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3010");
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
    public void test3011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3011");
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
    public void test3012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3012");
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
    public void test3013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3013");
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
    public void test3014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3014");
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

    @Test
    public void test3015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3015");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableDynamicArray0.getSize();
        int int7 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[]");
        java.util.Iterator iterator10 = strComparableDynamicArray0.iterator();
        java.lang.Comparable<java.lang.String> strComparable12 = strComparableDynamicArray0.get(0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertNull(strComparable12);
    }

    @Test
    public void test3016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3016");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator iterator6 = strComparableDynamicArray0.iterator();
        boolean boolean7 = strComparableDynamicArray0.isEmpty();
        java.lang.String str8 = strComparableDynamicArray0.toString();
        java.lang.String str9 = strComparableDynamicArray0.toString();
        java.lang.Comparable<java.lang.String> strComparable11 = strComparableDynamicArray0.get((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[hi!]" + "'", str8, "[hi!]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[hi!]" + "'", str9, "[hi!]");
        org.junit.Assert.assertNull(strComparable11);
    }

    @Test
    public void test3017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3017");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.AutoCloseable> autoCloseableDynamicArray1 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.AutoCloseable>(4);
    }

    @Test
    public void test3018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3018");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator4 = strComparableDynamicArray0.spliterator();
        java.util.Iterator iterator5 = strComparableDynamicArray0.iterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator6 = strComparableDynamicArray0.spliterator();
        java.lang.Class<?> wildcardClass7 = strComparableDynamicArray0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertNotNull(strComparableSpliterator6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3019");
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
        int int21 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.put(3, (java.lang.Comparable<java.lang.String>) "[hi!, [hi!, hi!]]");
        // The following exception was thrown during execution in test generation
        try {
            strComparableDynamicArray0.put((-1), (java.lang.Comparable<java.lang.String>) "[hi!, [[hi!]]]");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 16");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertNotNull(strComparableSpliterator5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertNotNull(strComparableSpliterator14);
        org.junit.Assert.assertNotNull(strComparableSpliterator17);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4 + "'", int21 == 4);
    }

    @Test
    public void test3020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3020");
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
        java.util.Iterator iterator17 = strComparableDynamicArray0.iterator();
        java.util.Iterator iterator18 = strComparableDynamicArray0.iterator();
        boolean boolean19 = strComparableDynamicArray0.isEmpty();
        int int20 = strComparableDynamicArray0.getSize();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator9);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertNotNull(iterator17);
        org.junit.Assert.assertNotNull(iterator18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 5 + "'", int20 == 5);
    }

    @Test
    public void test3021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3021");
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
        java.lang.String str18 = strComparableDynamicArray0.toString();
        strComparableDynamicArray0.put((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "[, hi!, , hi!]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNull(strComparable8);
        org.junit.Assert.assertNotNull(strComparableStream9);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertNull(strComparable12);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[hi!, [[], hi!, , ]]" + "'", str18, "[hi!, [[], hi!, , ]]");
    }

    @Test
    public void test3022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3022");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableDynamicArray0.isEmpty();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream4 = strComparableDynamicArray0.stream();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator5 = strComparableDynamicArray0.spliterator();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[hi!]");
        java.lang.String str8 = strComparableDynamicArray0.toString();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[hi!, hi!]");
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream11 = strComparableDynamicArray0.stream();
        strComparableDynamicArray0.put(10, (java.lang.Comparable<java.lang.String>) "[[], hi!, [[hi!]]]");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(strComparableStream4);
        org.junit.Assert.assertNotNull(strComparableSpliterator5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[hi!, [hi!]]" + "'", str8, "[hi!, [hi!]]");
        org.junit.Assert.assertNotNull(strComparableStream11);
    }

    @Test
    public void test3023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3023");
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
        java.util.Iterator iterator13 = strComparableDynamicArray0.iterator();
        strComparableDynamicArray0.put((int) (short) 0, (java.lang.Comparable<java.lang.String>) "[[[], hi!], []]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertNotNull(strComparableSpliterator5);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertNull(strComparable8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertNotNull(strComparableStream12);
        org.junit.Assert.assertNotNull(iterator13);
    }

    @Test
    public void test3024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3024");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray1 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>(100);
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream2 = strComparableDynamicArray1.stream();
        strComparableDynamicArray1.add((java.lang.Comparable<java.lang.String>) "");
        java.util.Iterator iterator5 = strComparableDynamicArray1.iterator();
        strComparableDynamicArray1.put((int) '4', (java.lang.Comparable<java.lang.String>) "[]");
        java.lang.Comparable<java.lang.String> strComparable10 = strComparableDynamicArray1.get(3);
        java.util.Iterator iterator11 = strComparableDynamicArray1.iterator();
        org.junit.Assert.assertNotNull(strComparableStream2);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertNull(strComparable10);
        org.junit.Assert.assertNotNull(iterator11);
    }

    @Test
    public void test3025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3025");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "");
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDynamicArray0.put((int) (short) 0, (java.lang.Comparable<java.lang.String>) "[]");
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream8 = strComparableDynamicArray0.stream();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator9 = strComparableDynamicArray0.spliterator();
        boolean boolean10 = strComparableDynamicArray0.isEmpty();
        strComparableDynamicArray0.put((int) (short) 10, (java.lang.Comparable<java.lang.String>) "[hi!, [hi!]]");
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[[[hi!]]]");
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[[hi!]]");
        org.junit.Assert.assertNotNull(strComparableStream8);
        org.junit.Assert.assertNotNull(strComparableSpliterator9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3026");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableDynamicArray0.isEmpty();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableDynamicArray0.get(5);
        int int6 = strComparableDynamicArray0.getSize();
        int int7 = strComparableDynamicArray0.getSize();
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableDynamicArray0.get(0);
        boolean boolean10 = strComparableDynamicArray0.isEmpty();
        java.lang.Class<?> wildcardClass11 = strComparableDynamicArray0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(strComparable5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + strComparable9 + "' != '" + "hi!" + "'", strComparable9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3027");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        boolean boolean3 = strComparableDynamicArray0.isEmpty();
        java.lang.String str4 = strComparableDynamicArray0.toString();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator5 = strComparableDynamicArray0.spliterator();
        java.util.Iterator iterator6 = strComparableDynamicArray0.iterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator7 = strComparableDynamicArray0.spliterator();
        strComparableDynamicArray0.put((int) (short) 0, (java.lang.Comparable<java.lang.String>) "[hi!, [hi!]]");
        java.lang.Class<?> wildcardClass11 = strComparableDynamicArray0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertNotNull(strComparableSpliterator5);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertNotNull(strComparableSpliterator7);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3028");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableDynamicArray0.isEmpty();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream2 = strComparableDynamicArray0.stream();
        java.lang.Comparable<java.lang.String> strComparable4 = strComparableDynamicArray0.get(1);
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableDynamicArray0.remove(10);
        java.util.Iterator iterator9 = strComparableDynamicArray0.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable11 = strComparableDynamicArray0.get((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 16");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(strComparableStream2);
        org.junit.Assert.assertNull(strComparable4);
        org.junit.Assert.assertNull(strComparable8);
        org.junit.Assert.assertNotNull(iterator9);
    }

    @Test
    public void test3029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3029");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableDynamicArray0.getSize();
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableDynamicArray0.get((int) (byte) 10);
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream9 = strComparableDynamicArray0.stream();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream10 = strComparableDynamicArray0.stream();
        boolean boolean11 = strComparableDynamicArray0.isEmpty();
        strComparableDynamicArray0.put((int) (short) 1, (java.lang.Comparable<java.lang.String>) "[[[], hi!, , ], hi!]");
        java.lang.Comparable<java.lang.String> strComparable16 = strComparableDynamicArray0.get(0);
        java.util.Iterator iterator17 = strComparableDynamicArray0.iterator();
        java.util.Iterator iterator18 = strComparableDynamicArray0.iterator();
        int int19 = strComparableDynamicArray0.getSize();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable21 = strComparableDynamicArray0.get((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 16");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNull(strComparable8);
        org.junit.Assert.assertNotNull(strComparableStream9);
        org.junit.Assert.assertNotNull(strComparableStream10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(strComparable16);
        org.junit.Assert.assertNotNull(iterator17);
        org.junit.Assert.assertNotNull(iterator18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
    }

    @Test
    public void test3030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3030");
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
        java.lang.Class<?> wildcardClass12 = strComparableDynamicArray0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3031");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        java.lang.Comparable<java.lang.String> strComparable4 = strComparableDynamicArray0.get(4);
        java.util.Iterator iterator5 = strComparableDynamicArray0.iterator();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream6 = strComparableDynamicArray0.stream();
        strComparableDynamicArray0.put((int) (byte) 10, (java.lang.Comparable<java.lang.String>) "[[, ]]");
        strComparableDynamicArray0.put((int) (short) 1, (java.lang.Comparable<java.lang.String>) "[[[[hi!]]], , [hi!, []], [[hi!]]]");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator13 = strComparableDynamicArray0.spliterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable15 = strComparableDynamicArray0.get(100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 16");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(strComparable4);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertNotNull(strComparableStream6);
        org.junit.Assert.assertNotNull(strComparableSpliterator13);
    }

    @Test
    public void test3032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3032");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableDynamicArray0.getSize();
        int int7 = strComparableDynamicArray0.getSize();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream8 = strComparableDynamicArray0.stream();
        boolean boolean9 = strComparableDynamicArray0.isEmpty();
        int int10 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[hi!, [hi!, []]]");
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[hi!, [[[[hi!]]], , [hi!, []], [[hi!]]]]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNotNull(strComparableStream8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
    }

    @Test
    public void test3033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3033");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator4 = strComparableDynamicArray0.spliterator();
        boolean boolean5 = strComparableDynamicArray0.isEmpty();
        java.util.Iterator iterator6 = strComparableDynamicArray0.iterator();
        java.util.Iterator iterator7 = strComparableDynamicArray0.iterator();
        java.util.Iterator iterator8 = strComparableDynamicArray0.iterator();
        java.lang.Comparable<java.lang.String> strComparable10 = strComparableDynamicArray0.remove(10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = strComparable10.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNull(strComparable10);
    }

    @Test
    public void test3034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3034");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable17 = strComparableDynamicArray0.remove((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 16");
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
        org.junit.Assert.assertEquals("'" + strComparable15 + "' != '" + "" + "'", strComparable15, "");
    }

    @Test
    public void test3035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3035");
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
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[hi!, hi!, [hi!], [hi!]]");
        java.lang.Comparable<java.lang.String> strComparable15 = strComparableDynamicArray0.remove(0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[hi!, []]" + "'", str11, "[hi!, []]");
        org.junit.Assert.assertNull(strComparable15);
    }

    @Test
    public void test3036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3036");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        boolean boolean3 = strComparableDynamicArray0.isEmpty();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[]");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator6 = strComparableDynamicArray0.spliterator();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[hi!, [hi!]]");
        java.lang.Comparable<java.lang.String> strComparable10 = strComparableDynamicArray0.get((int) (byte) 0);
        boolean boolean11 = strComparableDynamicArray0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable13 = strComparableDynamicArray0.get((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 52 out of bounds for length 16");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator6);
        org.junit.Assert.assertNull(strComparable10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3037");
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
        java.util.Iterator iterator12 = strComparableDynamicArray0.iterator();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[hi!]" + "'", str7, "[hi!]");
        org.junit.Assert.assertNull(strComparable9);
        org.junit.Assert.assertNotNull(strComparableSpliterator10);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertNotNull(iterator12);
    }

    @Test
    public void test3038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3038");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.reflect.Type> typeDynamicArray1 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.reflect.Type>((int) (short) 1);
    }

    @Test
    public void test3039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3039");
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
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream13 = strComparableDynamicArray0.stream();
        java.lang.String str14 = strComparableDynamicArray0.toString();
        java.lang.Class<?> wildcardClass15 = strComparableDynamicArray0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator9);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertNotNull(strComparableStream13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[, [hi!]]" + "'", str14, "[, [hi!]]");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3040");
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
        java.lang.Comparable<java.lang.String> strComparable16 = strComparableDynamicArray0.get(0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable18 = strComparableDynamicArray0.get((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 16");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNull(strComparable10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(strComparable16);
    }

    @Test
    public void test3041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3041");
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
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator16 = strComparableDynamicArray0.spliterator();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[[hi!, hi!, [hi!], [hi!]]]");
        java.lang.Comparable<java.lang.String> strComparable20 = strComparableDynamicArray0.remove(2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNull(strComparable8);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertNotNull(strComparableStream12);
        org.junit.Assert.assertEquals("'" + strComparable14 + "' != '" + "hi!" + "'", strComparable14, "hi!");
        org.junit.Assert.assertNotNull(strComparableStream15);
        org.junit.Assert.assertNotNull(strComparableSpliterator16);
        org.junit.Assert.assertEquals("'" + strComparable20 + "' != '" + "hi!" + "'", strComparable20, "hi!");
    }

    @Test
    public void test3042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3042");
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
        java.util.Iterator iterator11 = strComparableDynamicArray0.iterator();
        int int12 = strComparableDynamicArray0.getSize();
        java.lang.Class<?> wildcardClass13 = strComparableDynamicArray0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3043");
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
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[[[], [hi!, hi!, [hi!], [hi!]]], hi!, hi!, [hi!], [hi!]]");
        java.lang.Comparable<java.lang.String> strComparable26 = strComparableDynamicArray0.get(4);
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
        org.junit.Assert.assertEquals("'" + strComparable26 + "' != '" + "[[[], [hi!, hi!, [hi!], [hi!]]], hi!, hi!, [hi!], [hi!]]" + "'", strComparable26, "[[[], [hi!, hi!, [hi!], [hi!]]], hi!, hi!, [hi!], [hi!]]");
    }

    @Test
    public void test3044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3044");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray1 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>((int) 'a');
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream2 = strComparableDynamicArray1.stream();
        java.lang.String str3 = strComparableDynamicArray1.toString();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator4 = strComparableDynamicArray1.spliterator();
        int int5 = strComparableDynamicArray1.getSize();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable7 = strComparableDynamicArray1.remove((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strComparableStream2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[]" + "'", str3, "[]");
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test3045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3045");
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
        java.lang.Comparable<java.lang.String> strComparable20 = strComparableDynamicArray0.remove(5);
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[[hi!, hi!]]");
        java.util.Iterator iterator23 = strComparableDynamicArray0.iterator();
        org.junit.Assert.assertNotNull(strComparableSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNotNull(strComparableStream15);
        org.junit.Assert.assertNull(strComparable17);
        org.junit.Assert.assertNotNull(iterator18);
        org.junit.Assert.assertNull(strComparable20);
        org.junit.Assert.assertNotNull(iterator23);
    }

    @Test
    public void test3046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3046");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        boolean boolean4 = strComparableDynamicArray0.isEmpty();
        strComparableDynamicArray0.put(2, (java.lang.Comparable<java.lang.String>) "[hi!]");
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[, []]");
        java.lang.String str10 = strComparableDynamicArray0.toString();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream11 = strComparableDynamicArray0.stream();
        java.lang.String str12 = strComparableDynamicArray0.toString();
        int int13 = strComparableDynamicArray0.getSize();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[[, []], [hi!]]" + "'", str10, "[[, []], [hi!]]");
        org.junit.Assert.assertNotNull(strComparableStream11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[[, []], [hi!]]" + "'", str12, "[[, []], [hi!]]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
    }

    @Test
    public void test3047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3047");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        boolean boolean4 = strComparableDynamicArray0.isEmpty();
        boolean boolean5 = strComparableDynamicArray0.isEmpty();
        int int6 = strComparableDynamicArray0.getSize();
        java.lang.String str7 = strComparableDynamicArray0.toString();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[hi!, [[], hi!, , ]]");
        java.lang.Comparable<java.lang.String> strComparable11 = strComparableDynamicArray0.remove(1);
        boolean boolean12 = strComparableDynamicArray0.isEmpty();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[[hi!, [], [hi!]]]");
        java.lang.Class<?> wildcardClass15 = strComparableDynamicArray0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertEquals("'" + strComparable11 + "' != '" + "[hi!, [[], hi!, , ]]" + "'", strComparable11, "[hi!, [[], hi!, , ]]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3048");
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.reflect.GenericDeclaration> genericDeclarationDynamicArray1 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.reflect.GenericDeclaration>((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3049");
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
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream11 = strComparableDynamicArray0.stream();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream12 = strComparableDynamicArray0.stream();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNull(strComparable7);
        org.junit.Assert.assertNotNull(strComparableStream8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertNotNull(strComparableSpliterator10);
        org.junit.Assert.assertNotNull(strComparableStream11);
        org.junit.Assert.assertNotNull(strComparableStream12);
    }

    @Test
    public void test3050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3050");
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
        boolean boolean16 = strComparableDynamicArray0.isEmpty();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream17 = strComparableDynamicArray0.stream();
        strComparableDynamicArray0.put(4, (java.lang.Comparable<java.lang.String>) "[[], hi!]");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable22 = strComparableDynamicArray0.get((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 32 out of bounds for length 16");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strComparableSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNotNull(strComparableStream15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strComparableStream17);
    }

    @Test
    public void test3051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3051");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        boolean boolean4 = strComparableDynamicArray0.isEmpty();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableDynamicArray0.get(4);
        strComparableDynamicArray0.put(0, (java.lang.Comparable<java.lang.String>) "[[], hi!, , ]");
        int int12 = strComparableDynamicArray0.getSize();
        boolean boolean13 = strComparableDynamicArray0.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(strComparable8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3052");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        boolean boolean4 = strComparableDynamicArray0.isEmpty();
        boolean boolean5 = strComparableDynamicArray0.isEmpty();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator6 = strComparableDynamicArray0.spliterator();
        java.lang.Class<?> wildcardClass7 = strComparableSpliterator6.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3053");
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
        java.lang.Comparable<java.lang.String> strComparable17 = strComparableDynamicArray0.get(3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass18 = strComparable17.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNull(strComparable8);
        org.junit.Assert.assertNotNull(strComparableStream9);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(strComparable13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertNull(strComparable17);
    }

    @Test
    public void test3054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3054");
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
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator19 = strComparableDynamicArray0.spliterator();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNull(strComparable8);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(strComparable17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator19);
    }

    @Test
    public void test3055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3055");
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
        java.util.Iterator iterator18 = strComparableDynamicArray0.iterator();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[, []]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNull(strComparable8);
        org.junit.Assert.assertNotNull(strComparableStream9);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertNull(strComparable12);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[hi!]" + "'", str15, "[hi!]");
        org.junit.Assert.assertNotNull(iterator18);
    }

    @Test
    public void test3056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3056");
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
        java.lang.Comparable<java.lang.String> strComparable13 = null;
        strComparableDynamicArray0.put((int) (byte) 10, strComparable13);
        int int15 = strComparableDynamicArray0.getSize();
        int int16 = strComparableDynamicArray0.getSize();
        java.lang.Class<?> wildcardClass17 = strComparableDynamicArray0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertEquals("'" + strComparable9 + "' != '" + "[]" + "'", strComparable9, "[]");
        org.junit.Assert.assertNotNull(strComparableSpliterator10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3057");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator iterator6 = strComparableDynamicArray0.iterator();
        java.lang.String str7 = strComparableDynamicArray0.toString();
        strComparableDynamicArray0.put(10, (java.lang.Comparable<java.lang.String>) "[[hi!]]");
        strComparableDynamicArray0.put((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "[[], [hi!, hi!, [hi!], [hi!]]]");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator14 = strComparableDynamicArray0.spliterator();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[hi!]" + "'", str7, "[hi!]");
        org.junit.Assert.assertNotNull(strComparableSpliterator14);
    }

    @Test
    public void test3058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3058");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        boolean boolean4 = strComparableDynamicArray0.isEmpty();
        boolean boolean5 = strComparableDynamicArray0.isEmpty();
        int int6 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[, ]");
        boolean boolean9 = strComparableDynamicArray0.isEmpty();
        java.lang.Comparable<java.lang.String> strComparable11 = strComparableDynamicArray0.get(3);
        int int12 = strComparableDynamicArray0.getSize();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(strComparable11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
    }

    @Test
    public void test3059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3059");
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
        java.lang.String str21 = strComparableDynamicArray0.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNull(strComparable8);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertNull(strComparable13);
        org.junit.Assert.assertNull(strComparable15);
        org.junit.Assert.assertNotNull(strComparableStream20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "[hi!, hi!, [hi!], [hi!]]" + "'", str21, "[hi!, hi!, [hi!], [hi!]]");
    }

    @Test
    public void test3060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3060");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray1 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>(100);
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream2 = strComparableDynamicArray1.stream();
        strComparableDynamicArray1.add((java.lang.Comparable<java.lang.String>) "");
        java.util.Iterator iterator5 = strComparableDynamicArray1.iterator();
        strComparableDynamicArray1.put((int) '4', (java.lang.Comparable<java.lang.String>) "[]");
        int int9 = strComparableDynamicArray1.getSize();
        java.lang.String str10 = strComparableDynamicArray1.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable12 = strComparableDynamicArray1.get(100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strComparableStream2);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[, []]" + "'", str10, "[, []]");
    }

    @Test
    public void test3061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3061");
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
        int int21 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.put(3, (java.lang.Comparable<java.lang.String>) "[hi!, [hi!, hi!]]");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator25 = strComparableDynamicArray0.spliterator();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertNotNull(strComparableSpliterator5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertNotNull(strComparableSpliterator14);
        org.junit.Assert.assertNotNull(strComparableSpliterator17);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4 + "'", int21 == 4);
        org.junit.Assert.assertNotNull(strComparableSpliterator25);
    }

    @Test
    public void test3062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3062");
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
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[[[hi!, hi!, [hi!]]], [, ]]");
        java.util.Iterator iterator15 = strComparableDynamicArray0.iterator();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream16 = strComparableDynamicArray0.stream();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNotNull(strComparableSpliterator10);
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertNotNull(strComparableStream16);
    }

    @Test
    public void test3063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3063");
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
        strComparableDynamicArray0.put((int) (byte) 1, (java.lang.Comparable<java.lang.String>) "");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator19 = strComparableDynamicArray0.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator20 = strComparableDynamicArray0.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator21 = strComparableDynamicArray0.spliterator();
        java.lang.String str22 = strComparableDynamicArray0.toString();
        strComparableDynamicArray0.put((int) (byte) 10, (java.lang.Comparable<java.lang.String>) "[[hi!, []]]");
        java.lang.Class<?> wildcardClass26 = strComparableDynamicArray0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNull(strComparable8);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertNotNull(strComparableSpliterator19);
        org.junit.Assert.assertNotNull(strComparableSpliterator20);
        org.junit.Assert.assertNotNull(strComparableSpliterator21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "[, hi!, , hi!]" + "'", str22, "[, hi!, , hi!]");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test3064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3064");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray1 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>((int) (byte) 10);
        boolean boolean2 = strComparableDynamicArray1.isEmpty();
        strComparableDynamicArray1.add((java.lang.Comparable<java.lang.String>) "[, [hi!]]");
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableDynamicArray1.remove(5);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(strComparable6);
    }

    @Test
    public void test3065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3065");
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
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator23 = strComparableDynamicArray0.spliterator();
        java.lang.String str24 = strComparableDynamicArray0.toString();
        boolean boolean25 = strComparableDynamicArray0.isEmpty();
        java.lang.Comparable<java.lang.String> strComparable27 = strComparableDynamicArray0.remove(0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(strComparableStream4);
        org.junit.Assert.assertNotNull(strComparableSpliterator5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[hi!, [hi!]]" + "'", str8, "[hi!, [hi!]]");
        org.junit.Assert.assertNotNull(strComparableStream14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(strComparable20);
        org.junit.Assert.assertNotNull(iterator21);
        org.junit.Assert.assertNotNull(iterator22);
        org.junit.Assert.assertNotNull(strComparableSpliterator23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "[[, ], [hi!], [hi!, hi!], [[], hi!]]" + "'", str24, "[[, ], [hi!], [hi!, hi!], [[], hi!]]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + strComparable27 + "' != '" + "[, ]" + "'", strComparable27, "[, ]");
    }

    @Test
    public void test3066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3066");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableDynamicArray0.getSize();
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableDynamicArray0.get((int) (byte) 10);
        strComparableDynamicArray0.put((int) (short) 10, (java.lang.Comparable<java.lang.String>) "[]");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator12 = strComparableDynamicArray0.spliterator();
        java.lang.Comparable<java.lang.String> strComparable14 = strComparableDynamicArray0.get((int) (byte) 0);
        boolean boolean15 = strComparableDynamicArray0.isEmpty();
        java.util.Iterator iterator16 = strComparableDynamicArray0.iterator();
        java.util.Iterator iterator17 = strComparableDynamicArray0.iterator();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNull(strComparable8);
        org.junit.Assert.assertNotNull(strComparableSpliterator12);
        org.junit.Assert.assertNull(strComparable14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(iterator16);
        org.junit.Assert.assertNotNull(iterator17);
    }

    @Test
    public void test3067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3067");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableDynamicArray0.isEmpty();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableDynamicArray0.get(5);
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream6 = strComparableDynamicArray0.stream();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream7 = strComparableDynamicArray0.stream();
        java.lang.String str8 = strComparableDynamicArray0.toString();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(strComparable5);
        org.junit.Assert.assertNotNull(strComparableStream6);
        org.junit.Assert.assertNotNull(strComparableStream7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[hi!]" + "'", str8, "[hi!]");
    }

    @Test
    public void test3068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3068");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableDynamicArray0.isEmpty();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream4 = strComparableDynamicArray0.stream();
        int int5 = strComparableDynamicArray0.getSize();
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableDynamicArray0.remove((int) (byte) 10);
        strComparableDynamicArray0.put(1, (java.lang.Comparable<java.lang.String>) "[]");
        int int11 = strComparableDynamicArray0.getSize();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(strComparableStream4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(strComparable7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test3069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3069");
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
        java.util.Iterator iterator18 = strComparableDynamicArray0.iterator();
        boolean boolean19 = strComparableDynamicArray0.isEmpty();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[hi!, [], [hi!]]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNull(strComparable8);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertNull(strComparable13);
        org.junit.Assert.assertNotNull(strComparableStream14);
        org.junit.Assert.assertNotNull(strComparableStream15);
        org.junit.Assert.assertNull(strComparable17);
        org.junit.Assert.assertNotNull(iterator18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test3070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3070");
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
        java.lang.Comparable<java.lang.String> strComparable17 = strComparableDynamicArray0.get(2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable19 = strComparableDynamicArray0.remove((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 16");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[hi!, []]" + "'", str11, "[hi!, []]");
        org.junit.Assert.assertNotNull(strComparableSpliterator12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[hi!, []]" + "'", str13, "[hi!, []]");
        org.junit.Assert.assertEquals("'" + strComparable17 + "' != '" + "[]" + "'", strComparable17, "[]");
    }

    @Test
    public void test3071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3071");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "");
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator5 = strComparableDynamicArray0.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator6 = strComparableDynamicArray0.spliterator();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[[hi!]]");
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[hi!, hi!, [hi!], [hi!]]");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable12 = strComparableDynamicArray0.remove((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 16");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strComparableSpliterator5);
        org.junit.Assert.assertNotNull(strComparableSpliterator6);
    }

    @Test
    public void test3072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3072");
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
        java.lang.String str18 = strComparableDynamicArray0.toString();
        java.lang.Class<?> wildcardClass19 = strComparableDynamicArray0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNull(strComparable8);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertNull(strComparable13);
        org.junit.Assert.assertNull(strComparable15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[hi!, hi!, [hi!]]" + "'", str18, "[hi!, hi!, [hi!]]");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3073");
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
        java.lang.Comparable<java.lang.String> strComparable15 = strComparableDynamicArray0.remove((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNotNull(strComparableSpliterator7);
        org.junit.Assert.assertEquals("'" + strComparable9 + "' != '" + "hi!" + "'", strComparable9, "hi!");
        org.junit.Assert.assertNull(strComparable11);
        org.junit.Assert.assertNull(strComparable15);
    }

    @Test
    public void test3074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3074");
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
        boolean boolean12 = strComparableDynamicArray0.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[hi!]" + "'", str8, "[hi!]");
        org.junit.Assert.assertNull(strComparable10);
        org.junit.Assert.assertNotNull(strComparableStream11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3075");
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
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream20 = strComparableDynamicArray0.stream();
        java.lang.Comparable<java.lang.String> strComparable22 = strComparableDynamicArray0.remove(0);
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
        org.junit.Assert.assertNotNull(strComparableStream20);
        org.junit.Assert.assertNull(strComparable22);
    }

    @Test
    public void test3076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3076");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableDynamicArray0.getSize();
        java.util.Iterator iterator7 = strComparableDynamicArray0.iterator();
        java.lang.String str8 = strComparableDynamicArray0.toString();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[hi!, []]");
        java.lang.String str11 = strComparableDynamicArray0.toString();
        java.util.Iterator iterator12 = strComparableDynamicArray0.iterator();
        java.lang.Comparable<java.lang.String> strComparable14 = strComparableDynamicArray0.remove((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[hi!]" + "'", str8, "[hi!]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[hi!, [hi!, []]]" + "'", str11, "[hi!, [hi!, []]]");
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertNull(strComparable14);
    }

    @Test
    public void test3077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3077");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator iterator6 = strComparableDynamicArray0.iterator();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream7 = strComparableDynamicArray0.stream();
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableDynamicArray0.remove(4);
        java.util.Iterator iterator10 = strComparableDynamicArray0.iterator();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[[hi!], [hi!, hi!]]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertNotNull(strComparableStream7);
        org.junit.Assert.assertNull(strComparable9);
        org.junit.Assert.assertNotNull(iterator10);
    }

    @Test
    public void test3078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3078");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableDynamicArray0.isEmpty();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream2 = strComparableDynamicArray0.stream();
        java.lang.Comparable<java.lang.String> strComparable4 = strComparableDynamicArray0.get(1);
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean9 = strComparableDynamicArray0.isEmpty();
        java.lang.String str10 = strComparableDynamicArray0.toString();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator11 = strComparableDynamicArray0.spliterator();
        java.lang.Class<?> wildcardClass12 = strComparableSpliterator11.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(strComparableStream2);
        org.junit.Assert.assertNull(strComparable4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[hi!, hi!]" + "'", str10, "[hi!, hi!]");
        org.junit.Assert.assertNotNull(strComparableSpliterator11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3079");
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
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream13 = strComparableDynamicArray0.stream();
        java.lang.String str14 = strComparableDynamicArray0.toString();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream15 = strComparableDynamicArray0.stream();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable17 = strComparableDynamicArray0.remove((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 52 out of bounds for length 16");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertNotNull(strComparableSpliterator11);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertNotNull(strComparableStream13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[hi!, []]" + "'", str14, "[hi!, []]");
        org.junit.Assert.assertNotNull(strComparableStream15);
    }

    @Test
    public void test3080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3080");
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
        int int12 = strComparableDynamicArray0.getSize();
        java.util.Iterator iterator13 = strComparableDynamicArray0.iterator();
        java.lang.Class<?> wildcardClass14 = iterator13.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableStream6);
        org.junit.Assert.assertNotNull(strComparableStream7);
        org.junit.Assert.assertNotNull(strComparableSpliterator8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3081");
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
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[]");
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[, [hi!, [[], hi!], [[hi!, hi!, [hi!]]]]]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[]" + "'", str12, "[]");
    }

    @Test
    public void test3082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3082");
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
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[hi!, [hi!], [hi!, hi!], [[], hi!]]");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(strComparableStream4);
        org.junit.Assert.assertNotNull(strComparableSpliterator5);
        org.junit.Assert.assertEquals("'" + strComparable9 + "' != '" + "[hi!]" + "'", strComparable9, "[hi!]");
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3083");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "");
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDynamicArray0.put((int) (short) 0, (java.lang.Comparable<java.lang.String>) "[]");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator8 = strComparableDynamicArray0.spliterator();
        int int9 = strComparableDynamicArray0.getSize();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream10 = strComparableDynamicArray0.stream();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[hi!, , [[], hi!, [[hi!]]]]");
        org.junit.Assert.assertNotNull(strComparableSpliterator8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertNotNull(strComparableStream10);
    }

    @Test
    public void test3084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3084");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableDynamicArray0.isEmpty();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator2 = strComparableDynamicArray0.spliterator();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream3 = strComparableDynamicArray0.stream();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator4 = strComparableDynamicArray0.spliterator();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[[], hi!]");
        java.util.Iterator iterator7 = strComparableDynamicArray0.iterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator8 = strComparableDynamicArray0.spliterator();
        java.lang.String str9 = strComparableDynamicArray0.toString();
        int int10 = strComparableDynamicArray0.getSize();
        java.lang.Comparable<java.lang.String> strComparable12 = strComparableDynamicArray0.get((int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(strComparableSpliterator2);
        org.junit.Assert.assertNotNull(strComparableStream3);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(strComparableSpliterator8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[[[], hi!]]" + "'", str9, "[[[], hi!]]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + strComparable12 + "' != '" + "[[], hi!]" + "'", strComparable12, "[[], hi!]");
    }

    @Test
    public void test3085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3085");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        boolean boolean4 = strComparableDynamicArray0.isEmpty();
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableDynamicArray0.remove((int) (short) 0);
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator7 = strComparableDynamicArray0.spliterator();
        java.util.Iterator iterator8 = strComparableDynamicArray0.iterator();
        boolean boolean9 = strComparableDynamicArray0.isEmpty();
        boolean boolean10 = strComparableDynamicArray0.isEmpty();
        java.util.Iterator iterator11 = strComparableDynamicArray0.iterator();
        int int12 = strComparableDynamicArray0.getSize();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator13 = strComparableDynamicArray0.spliterator();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(strComparable6);
        org.junit.Assert.assertNotNull(strComparableSpliterator7);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(strComparableSpliterator13);
    }

    @Test
    public void test3086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3086");
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
        strComparableDynamicArray0.put((int) (byte) 1, (java.lang.Comparable<java.lang.String>) "");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator19 = strComparableDynamicArray0.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator20 = strComparableDynamicArray0.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator21 = strComparableDynamicArray0.spliterator();
        java.lang.String str22 = strComparableDynamicArray0.toString();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[, [hi!]]");
        java.lang.Comparable<java.lang.String> strComparable26 = strComparableDynamicArray0.get(4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNull(strComparable8);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertNotNull(strComparableSpliterator19);
        org.junit.Assert.assertNotNull(strComparableSpliterator20);
        org.junit.Assert.assertNotNull(strComparableSpliterator21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "[, hi!, , hi!]" + "'", str22, "[, hi!, , hi!]");
        org.junit.Assert.assertEquals("'" + strComparable26 + "' != '" + "hi!" + "'", strComparable26, "hi!");
    }

    @Test
    public void test3087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3087");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator iterator6 = strComparableDynamicArray0.iterator();
        java.lang.String str7 = strComparableDynamicArray0.toString();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator8 = strComparableDynamicArray0.spliterator();
        // The following exception was thrown during execution in test generation
        try {
            strComparableDynamicArray0.put((int) 'a', (java.lang.Comparable<java.lang.String>) "[hi!, [, hi!, , hi!]]");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97 out of bounds for length 16");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[hi!]" + "'", str7, "[hi!]");
        org.junit.Assert.assertNotNull(strComparableSpliterator8);
    }

    @Test
    public void test3088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3088");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray1 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>(100);
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream2 = strComparableDynamicArray1.stream();
        strComparableDynamicArray1.add((java.lang.Comparable<java.lang.String>) "");
        java.util.Iterator iterator5 = strComparableDynamicArray1.iterator();
        // The following exception was thrown during execution in test generation
        try {
            strComparableDynamicArray1.put((int) (byte) 100, (java.lang.Comparable<java.lang.String>) "[hi!, [hi!, hi!, , hi!]]");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strComparableStream2);
        org.junit.Assert.assertNotNull(iterator5);
    }

    @Test
    public void test3089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3089");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator4 = strComparableDynamicArray0.spliterator();
        java.lang.String str5 = strComparableDynamicArray0.toString();
        int int6 = strComparableDynamicArray0.getSize();
        boolean boolean7 = strComparableDynamicArray0.isEmpty();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator8 = strComparableDynamicArray0.spliterator();
        java.util.Iterator iterator9 = strComparableDynamicArray0.iterator();
        int int10 = strComparableDynamicArray0.getSize();
        int int11 = strComparableDynamicArray0.getSize();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator12 = strComparableDynamicArray0.spliterator();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator8);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator12);
    }

    @Test
    public void test3090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3090");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator4 = strComparableDynamicArray0.spliterator();
        java.lang.String str5 = strComparableDynamicArray0.toString();
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableDynamicArray0.remove((int) (short) 10);
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream8 = strComparableDynamicArray0.stream();
        java.lang.String str9 = strComparableDynamicArray0.toString();
        boolean boolean10 = strComparableDynamicArray0.isEmpty();
        boolean boolean11 = strComparableDynamicArray0.isEmpty();
        java.lang.String str12 = strComparableDynamicArray0.toString();
        boolean boolean13 = strComparableDynamicArray0.isEmpty();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[[[[[hi!]]], , [hi!, []], [[hi!]]], [[]]]");
        boolean boolean16 = strComparableDynamicArray0.isEmpty();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream17 = strComparableDynamicArray0.stream();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[[[, ]]]");
        java.util.Iterator iterator20 = strComparableDynamicArray0.iterator();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[[], [hi!, hi!, [hi!], [hi!]]]");
        int int23 = strComparableDynamicArray0.getSize();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNull(strComparable7);
        org.junit.Assert.assertNotNull(strComparableStream8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[]" + "'", str12, "[]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strComparableStream17);
        org.junit.Assert.assertNotNull(iterator20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 3 + "'", int23 == 3);
    }

    @Test
    public void test3091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3091");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str3 = strComparableDynamicArray0.toString();
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableDynamicArray0.remove(0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[]" + "'", str3, "[]");
        org.junit.Assert.assertEquals("'" + strComparable5 + "' != '" + "" + "'", strComparable5, "");
    }

    @Test
    public void test3092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3092");
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
        strComparableDynamicArray0.put(10, (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean17 = strComparableDynamicArray0.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(strComparable6);
        org.junit.Assert.assertNotNull(strComparableSpliterator7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(strComparableStream10);
        org.junit.Assert.assertNull(strComparable12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test3093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3093");
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
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[[[hi!]]]");
        int int22 = strComparableDynamicArray0.getSize();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNull(strComparable8);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertNull(strComparable13);
        org.junit.Assert.assertNull(strComparable15);
        org.junit.Assert.assertNotNull(strComparableStream18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[hi!, hi!, [hi!]]" + "'", str19, "[hi!, hi!, [hi!]]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 5 + "'", int22 == 5);
    }

    @Test
    public void test3094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3094");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "");
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDynamicArray0.put((int) (short) 0, (java.lang.Comparable<java.lang.String>) "[]");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator8 = strComparableDynamicArray0.spliterator();
        strComparableDynamicArray0.put(10, (java.lang.Comparable<java.lang.String>) "");
        java.util.Iterator iterator12 = strComparableDynamicArray0.iterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator13 = strComparableDynamicArray0.spliterator();
        int int14 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.put((int) (short) 1, (java.lang.Comparable<java.lang.String>) "[hi!, [hi!, []]]");
        java.lang.String str18 = strComparableDynamicArray0.toString();
        int int19 = strComparableDynamicArray0.getSize();
        java.lang.Class<?> wildcardClass20 = strComparableDynamicArray0.getClass();
        org.junit.Assert.assertNotNull(strComparableSpliterator8);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertNotNull(strComparableSpliterator13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[[], [hi!, [hi!, []]], ]" + "'", str18, "[[], [hi!, [hi!, []]], ]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3095");
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
        java.lang.Comparable<java.lang.String> strComparable12 = strComparableDynamicArray0.get(2);
        java.lang.Comparable<java.lang.String> strComparable14 = strComparableDynamicArray0.get((int) (short) 10);
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator15 = strComparableDynamicArray0.spliterator();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream16 = strComparableDynamicArray0.stream();
        boolean boolean17 = strComparableDynamicArray0.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNull(strComparable7);
        org.junit.Assert.assertNotNull(strComparableStream8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertNotNull(strComparableSpliterator10);
        org.junit.Assert.assertNull(strComparable12);
        org.junit.Assert.assertNull(strComparable14);
        org.junit.Assert.assertNotNull(strComparableSpliterator15);
        org.junit.Assert.assertNotNull(strComparableStream16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test3096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3096");
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
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream14 = strComparableDynamicArray0.stream();
        java.util.Iterator iterator15 = strComparableDynamicArray0.iterator();
        // The following exception was thrown during execution in test generation
        try {
            strComparableDynamicArray0.put((int) (short) 100, (java.lang.Comparable<java.lang.String>) "[[[[hi!, hi!, [hi!]]], [, ]]]");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 16");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNull(strComparable8);
        org.junit.Assert.assertNotNull(strComparableStream9);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(strComparable13);
        org.junit.Assert.assertNotNull(strComparableStream14);
        org.junit.Assert.assertNotNull(iterator15);
    }

    @Test
    public void test3097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3097");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        boolean boolean3 = strComparableDynamicArray0.isEmpty();
        java.lang.String str4 = strComparableDynamicArray0.toString();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator5 = strComparableDynamicArray0.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator6 = strComparableDynamicArray0.spliterator();
        int int7 = strComparableDynamicArray0.getSize();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable9 = strComparableDynamicArray0.remove((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97 out of bounds for length 16");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertNotNull(strComparableSpliterator5);
        org.junit.Assert.assertNotNull(strComparableSpliterator6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test3098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3098");
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
        int int16 = strComparableDynamicArray0.getSize();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator17 = strComparableDynamicArray0.spliterator();
        boolean boolean18 = strComparableDynamicArray0.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNull(strComparable8);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertNotNull(strComparableStream12);
        org.junit.Assert.assertEquals("'" + strComparable14 + "' != '" + "hi!" + "'", strComparable14, "hi!");
        org.junit.Assert.assertNotNull(strComparableStream15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertNotNull(strComparableSpliterator17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test3099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3099");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        boolean boolean4 = strComparableDynamicArray0.isEmpty();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableDynamicArray0.get(4);
        java.lang.String str9 = strComparableDynamicArray0.toString();
        boolean boolean10 = strComparableDynamicArray0.isEmpty();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator11 = strComparableDynamicArray0.spliterator();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(strComparable8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[hi!]" + "'", str9, "[hi!]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator11);
    }

    @Test
    public void test3100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3100");
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
        java.util.Iterator iterator17 = strComparableDynamicArray0.iterator();
        java.lang.Class<?> wildcardClass18 = iterator17.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNull(strComparable8);
        org.junit.Assert.assertNotNull(strComparableStream9);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(strComparable13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNotNull(iterator17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3101");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator4 = strComparableDynamicArray0.spliterator();
        java.lang.String str5 = strComparableDynamicArray0.toString();
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableDynamicArray0.remove((int) (short) 10);
        boolean boolean8 = strComparableDynamicArray0.isEmpty();
        java.lang.String str9 = strComparableDynamicArray0.toString();
        java.lang.Comparable<java.lang.String> strComparable11 = strComparableDynamicArray0.get((int) (byte) 1);
        boolean boolean12 = strComparableDynamicArray0.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNull(strComparable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertNull(strComparable11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test3102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3102");
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
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream12 = strComparableDynamicArray0.stream();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[[, ]]");
        java.lang.Comparable<java.lang.String> strComparable16 = strComparableDynamicArray0.get(3);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertNull(strComparable11);
        org.junit.Assert.assertNotNull(strComparableStream12);
        org.junit.Assert.assertNull(strComparable16);
    }

    @Test
    public void test3103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3103");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableDynamicArray0.isEmpty();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator2 = strComparableDynamicArray0.spliterator();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream3 = strComparableDynamicArray0.stream();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator4 = strComparableDynamicArray0.spliterator();
        int int5 = strComparableDynamicArray0.getSize();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator6 = strComparableDynamicArray0.spliterator();
        boolean boolean7 = strComparableDynamicArray0.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(strComparableSpliterator2);
        org.junit.Assert.assertNotNull(strComparableStream3);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(strComparableSpliterator6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test3104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3104");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator4 = strComparableDynamicArray0.spliterator();
        int int5 = strComparableDynamicArray0.getSize();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator6 = strComparableDynamicArray0.spliterator();
        java.lang.String str7 = strComparableDynamicArray0.toString();
        java.lang.Class<?> wildcardClass8 = strComparableDynamicArray0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3105");
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
        int int21 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[, [hi!, [[], hi!], [[hi!, hi!, [hi!]]]]]");
        org.junit.Assert.assertNotNull(strComparableSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strComparableStream13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertNotNull(iterator19);
        org.junit.Assert.assertNotNull(strComparableSpliterator20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4 + "'", int21 == 4);
    }

    @Test
    public void test3106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3106");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.String str1 = strComparableDynamicArray0.toString();
        strComparableDynamicArray0.put(0, (java.lang.Comparable<java.lang.String>) "[hi!]");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator5 = strComparableDynamicArray0.spliterator();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream6 = strComparableDynamicArray0.stream();
        int int7 = strComparableDynamicArray0.getSize();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "[]" + "'", str1, "[]");
        org.junit.Assert.assertNotNull(strComparableSpliterator5);
        org.junit.Assert.assertNotNull(strComparableStream6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test3107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3107");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator4 = strComparableDynamicArray0.spliterator();
        java.lang.String str5 = strComparableDynamicArray0.toString();
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableDynamicArray0.remove((int) (short) 10);
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator8 = strComparableDynamicArray0.spliterator();
        boolean boolean9 = strComparableDynamicArray0.isEmpty();
        java.util.Iterator iterator10 = strComparableDynamicArray0.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable12 = strComparableDynamicArray0.remove((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 16");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNull(strComparable7);
        org.junit.Assert.assertNotNull(strComparableSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(iterator10);
    }

    @Test
    public void test3108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3108");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableDynamicArray0.isEmpty();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator2 = strComparableDynamicArray0.spliterator();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream3 = strComparableDynamicArray0.stream();
        strComparableDynamicArray0.put(1, (java.lang.Comparable<java.lang.String>) "[hi!, []]");
        strComparableDynamicArray0.put(0, (java.lang.Comparable<java.lang.String>) "");
        java.lang.String str10 = strComparableDynamicArray0.toString();
        java.lang.String str11 = strComparableDynamicArray0.toString();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[hi!, [hi!, hi!, [, ], [[], hi!]]]");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(strComparableSpliterator2);
        org.junit.Assert.assertNotNull(strComparableStream3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[, [hi!, []]]" + "'", str10, "[, [hi!, []]]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[, [hi!, []]]" + "'", str11, "[, [hi!, []]]");
    }

    @Test
    public void test3109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3109");
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
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[[], hi!, [[hi!]]]");
        java.lang.Comparable<java.lang.String> strComparable20 = strComparableDynamicArray0.get(4);
        boolean boolean21 = strComparableDynamicArray0.isEmpty();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream22 = strComparableDynamicArray0.stream();
        org.junit.Assert.assertNotNull(strComparableSpliterator8);
        org.junit.Assert.assertNotNull(strComparableStream9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertNull(strComparable20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(strComparableStream22);
    }

    @Test
    public void test3110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3110");
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
        strComparableDynamicArray0.put((int) (short) 10, (java.lang.Comparable<java.lang.String>) "[hi!, [], [hi!]]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[hi!, []]" + "'", str10, "[hi!, []]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[hi!, []]" + "'", str11, "[hi!, []]");
        org.junit.Assert.assertNotNull(strComparableStream12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3111");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableDynamicArray0.isEmpty();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream2 = strComparableDynamicArray0.stream();
        java.lang.Comparable<java.lang.String> strComparable4 = strComparableDynamicArray0.get(1);
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int9 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[[hi!, [hi!]]]");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator12 = strComparableDynamicArray0.spliterator();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(strComparableStream2);
        org.junit.Assert.assertNull(strComparable4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertNotNull(strComparableSpliterator12);
    }

    @Test
    public void test3112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3112");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable14 = strComparableDynamicArray0.remove((int) (byte) 100);
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
    }

    @Test
    public void test3113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3113");
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
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator18 = strComparableDynamicArray0.spliterator();
        java.lang.Comparable<java.lang.String> strComparable20 = strComparableDynamicArray0.remove((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNull(strComparable8);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertNull(strComparable13);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertNotNull(strComparableSpliterator18);
        org.junit.Assert.assertEquals("'" + strComparable20 + "' != '" + "hi!" + "'", strComparable20, "hi!");
    }

    @Test
    public void test3114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3114");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream6 = strComparableDynamicArray0.stream();
        java.lang.Comparable<java.lang.String> strComparable8 = null;
        strComparableDynamicArray0.put(1, strComparable8);
        java.lang.Class<?> wildcardClass10 = strComparableDynamicArray0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableStream6);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3115");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.put(0, (java.lang.Comparable<java.lang.String>) "[hi!]");
        java.util.Iterator iterator7 = strComparableDynamicArray0.iterator();
        java.util.Iterator iterator8 = strComparableDynamicArray0.iterator();
        java.lang.Class<?> wildcardClass9 = iterator8.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3116");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator4 = strComparableDynamicArray0.spliterator();
        java.lang.String str5 = strComparableDynamicArray0.toString();
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableDynamicArray0.remove((int) (short) 10);
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream8 = strComparableDynamicArray0.stream();
        java.lang.String str9 = strComparableDynamicArray0.toString();
        boolean boolean10 = strComparableDynamicArray0.isEmpty();
        boolean boolean11 = strComparableDynamicArray0.isEmpty();
        java.lang.String str12 = strComparableDynamicArray0.toString();
        boolean boolean13 = strComparableDynamicArray0.isEmpty();
        java.util.Iterator iterator14 = strComparableDynamicArray0.iterator();
        boolean boolean15 = strComparableDynamicArray0.isEmpty();
        boolean boolean16 = strComparableDynamicArray0.isEmpty();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[hi!, hi!, [[hi!, hi!, [hi!], [hi!]]]]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNull(strComparable7);
        org.junit.Assert.assertNotNull(strComparableStream8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[]" + "'", str12, "[]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test3117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3117");
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
        java.lang.Comparable<java.lang.String> strComparable15 = strComparableDynamicArray0.remove((int) (short) 10);
        int int16 = strComparableDynamicArray0.getSize();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertNotNull(strComparableSpliterator11);
        org.junit.Assert.assertNull(strComparable13);
        org.junit.Assert.assertNull(strComparable15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
    }

    @Test
    public void test3118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3118");
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
        strComparableDynamicArray0.put((int) (short) 0, (java.lang.Comparable<java.lang.String>) "[[hi!, []]]");
        java.util.Iterator iterator18 = strComparableDynamicArray0.iterator();
        strComparableDynamicArray0.put((int) (short) 1, (java.lang.Comparable<java.lang.String>) "[[[hi!, [hi!]]], [[[[hi!]]], , [hi!, []], [[hi!]]]]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertNotNull(strComparableSpliterator14);
        org.junit.Assert.assertNotNull(iterator18);
    }

    @Test
    public void test3119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3119");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator4 = strComparableDynamicArray0.spliterator();
        java.lang.String str5 = strComparableDynamicArray0.toString();
        int int6 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[hi!, hi!, [[], hi!]]");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable10 = strComparableDynamicArray0.get((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 52 out of bounds for length 16");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test3120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3120");
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
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream18 = strComparableDynamicArray0.stream();
        java.util.Iterator iterator19 = strComparableDynamicArray0.iterator();
        java.lang.Class<?> wildcardClass20 = strComparableDynamicArray0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[hi!, []]" + "'", str11, "[hi!, []]");
        org.junit.Assert.assertNotNull(strComparableStream18);
        org.junit.Assert.assertNotNull(iterator19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3121");
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
        java.lang.String str15 = strComparableDynamicArray0.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertNotNull(strComparableSpliterator14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[, [hi!, hi!]]" + "'", str15, "[, [hi!, hi!]]");
    }

    @Test
    public void test3122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3122");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator4 = strComparableDynamicArray0.spliterator();
        java.util.Iterator iterator5 = strComparableDynamicArray0.iterator();
        java.util.Iterator iterator6 = strComparableDynamicArray0.iterator();
        int int7 = strComparableDynamicArray0.getSize();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator8 = strComparableDynamicArray0.spliterator();
        java.lang.Class<?> wildcardClass9 = strComparableSpliterator8.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3123");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator4 = strComparableDynamicArray0.spliterator();
        boolean boolean5 = strComparableDynamicArray0.isEmpty();
        java.util.Iterator iterator6 = strComparableDynamicArray0.iterator();
        java.util.Iterator iterator7 = strComparableDynamicArray0.iterator();
        java.util.Iterator iterator8 = strComparableDynamicArray0.iterator();
        java.lang.Comparable<java.lang.String> strComparable10 = strComparableDynamicArray0.remove(10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable12 = strComparableDynamicArray0.get((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 16");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNull(strComparable10);
    }

    @Test
    public void test3124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3124");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray1 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>((int) 'a');
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream2 = strComparableDynamicArray1.stream();
        int int3 = strComparableDynamicArray1.getSize();
        java.lang.String str4 = strComparableDynamicArray1.toString();
        java.lang.String str5 = strComparableDynamicArray1.toString();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator6 = strComparableDynamicArray1.spliterator();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream7 = strComparableDynamicArray1.stream();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable9 = strComparableDynamicArray1.remove((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strComparableStream2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(strComparableSpliterator6);
        org.junit.Assert.assertNotNull(strComparableStream7);
    }

    @Test
    public void test3125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3125");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableDynamicArray0.getSize();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator7 = strComparableDynamicArray0.spliterator();
        java.util.Iterator iterator8 = strComparableDynamicArray0.iterator();
        java.lang.Comparable<java.lang.String> strComparable10 = strComparableDynamicArray0.remove(10);
        java.lang.String str11 = strComparableDynamicArray0.toString();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[hi!, , [[], hi!, [[hi!]]]]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNotNull(strComparableSpliterator7);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNull(strComparable10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
    }

    @Test
    public void test3126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3126");
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
        strComparableDynamicArray0.put((int) (short) 0, (java.lang.Comparable<java.lang.String>) "[[hi!, []]]");
        java.util.Iterator iterator18 = strComparableDynamicArray0.iterator();
        java.lang.Class<?> wildcardClass19 = iterator18.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertNotNull(strComparableSpliterator14);
        org.junit.Assert.assertNotNull(iterator18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3127");
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
        java.util.Iterator iterator13 = strComparableDynamicArray0.iterator();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[hi!, [hi!, [hi!]], [hi!, [], [hi!]]]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertNotNull(strComparableSpliterator5);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertNull(strComparable8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertNotNull(strComparableStream12);
        org.junit.Assert.assertNotNull(iterator13);
    }

    @Test
    public void test3128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3128");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "");
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDynamicArray0.put((int) (short) 0, (java.lang.Comparable<java.lang.String>) "[]");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator8 = strComparableDynamicArray0.spliterator();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream9 = strComparableDynamicArray0.stream();
        int int10 = strComparableDynamicArray0.getSize();
        java.lang.Comparable<java.lang.String> strComparable11 = null;
        strComparableDynamicArray0.add(strComparable11);
        strComparableDynamicArray0.put((int) (short) 1, (java.lang.Comparable<java.lang.String>) "[[hi!, hi!, [hi!], [hi!]]]");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator16 = strComparableDynamicArray0.spliterator();
        org.junit.Assert.assertNotNull(strComparableSpliterator8);
        org.junit.Assert.assertNotNull(strComparableStream9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertNotNull(strComparableSpliterator16);
    }

    @Test
    public void test3129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3129");
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
        java.util.Iterator iterator13 = strComparableDynamicArray0.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable15 = strComparableDynamicArray0.remove((int) (byte) 100);
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
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertNotNull(iterator13);
    }

    @Test
    public void test3130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3130");
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
        java.lang.Comparable<java.lang.String> strComparable14 = strComparableDynamicArray0.get(1);
        java.lang.Comparable<java.lang.String> strComparable16 = strComparableDynamicArray0.get((int) (byte) 1);
        java.util.Iterator iterator17 = strComparableDynamicArray0.iterator();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator9);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertEquals("'" + strComparable14 + "' != '" + "" + "'", strComparable14, "");
        org.junit.Assert.assertEquals("'" + strComparable16 + "' != '" + "" + "'", strComparable16, "");
        org.junit.Assert.assertNotNull(iterator17);
    }

    @Test
    public void test3131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3131");
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
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[[, ]]");
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream13 = strComparableDynamicArray0.stream();
        boolean boolean14 = strComparableDynamicArray0.isEmpty();
        java.lang.String str15 = strComparableDynamicArray0.toString();
        int int16 = strComparableDynamicArray0.getSize();
        java.util.Iterator iterator17 = strComparableDynamicArray0.iterator();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertNotNull(strComparableSpliterator5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertNotNull(strComparableStream10);
        org.junit.Assert.assertNotNull(strComparableStream13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[, [[, ]]]" + "'", str15, "[, [[, ]]]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertNotNull(iterator17);
    }

    @Test
    public void test3132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3132");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable20 = strComparableDynamicArray0.remove((int) (short) -1);
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
    }

    @Test
    public void test3133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3133");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray1 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>((int) (short) 10);
        strComparableDynamicArray1.add((java.lang.Comparable<java.lang.String>) "[, ]");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator4 = strComparableDynamicArray1.spliterator();
        int int5 = strComparableDynamicArray1.getSize();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator6 = strComparableDynamicArray1.spliterator();
        strComparableDynamicArray1.add((java.lang.Comparable<java.lang.String>) "[[[], hi!], []]");
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator6);
    }

    @Test
    public void test3134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3134");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable4 = strComparableDynamicArray0.get((int) (byte) 1);
        boolean boolean5 = strComparableDynamicArray0.isEmpty();
        org.junit.Assert.assertNull(strComparable4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test3135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3135");
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
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream13 = strComparableDynamicArray0.stream();
        java.lang.String str14 = strComparableDynamicArray0.toString();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[, hi!, , hi!]");
        java.util.Iterator iterator17 = strComparableDynamicArray0.iterator();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[hi!, []]" + "'", str11, "[hi!, []]");
        org.junit.Assert.assertNotNull(strComparableSpliterator12);
        org.junit.Assert.assertNotNull(strComparableStream13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[hi!, []]" + "'", str14, "[hi!, []]");
        org.junit.Assert.assertNotNull(iterator17);
    }

    @Test
    public void test3136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3136");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator4 = strComparableDynamicArray0.spliterator();
        java.lang.String str5 = strComparableDynamicArray0.toString();
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableDynamicArray0.remove((int) (short) 10);
        boolean boolean8 = strComparableDynamicArray0.isEmpty();
        boolean boolean9 = strComparableDynamicArray0.isEmpty();
        java.lang.Class<?> wildcardClass10 = strComparableDynamicArray0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNull(strComparable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3137");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableDynamicArray0.isEmpty();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator2 = strComparableDynamicArray0.spliterator();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream3 = strComparableDynamicArray0.stream();
        int int4 = strComparableDynamicArray0.getSize();
        java.util.Iterator iterator5 = strComparableDynamicArray0.iterator();
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableDynamicArray0.get((int) (byte) 10);
        java.util.Iterator iterator8 = strComparableDynamicArray0.iterator();
        strComparableDynamicArray0.put((int) (byte) 10, (java.lang.Comparable<java.lang.String>) "[[[], hi!, , ], hi!]");
        java.lang.Class<?> wildcardClass12 = strComparableDynamicArray0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(strComparableSpliterator2);
        org.junit.Assert.assertNotNull(strComparableStream3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertNull(strComparable7);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3138");
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
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream18 = strComparableDynamicArray0.stream();
        java.lang.Comparable<java.lang.String> strComparable20 = strComparableDynamicArray0.remove((int) (byte) 10);
        int int21 = strComparableDynamicArray0.getSize();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNull(strComparable8);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertNull(strComparable13);
        org.junit.Assert.assertNotNull(strComparableStream14);
        org.junit.Assert.assertNotNull(strComparableStream15);
        org.junit.Assert.assertNull(strComparable17);
        org.junit.Assert.assertNotNull(strComparableStream18);
        org.junit.Assert.assertNull(strComparable20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
    }

    @Test
    public void test3139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3139");
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
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator19 = strComparableDynamicArray0.spliterator();
        org.junit.Assert.assertNotNull(strComparableSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strComparableStream13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertNotNull(strComparableSpliterator19);
    }

    @Test
    public void test3140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3140");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "");
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDynamicArray0.put((int) (short) 0, (java.lang.Comparable<java.lang.String>) "[]");
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[[hi!]]");
        java.lang.String str10 = strComparableDynamicArray0.toString();
        boolean boolean11 = strComparableDynamicArray0.isEmpty();
        java.lang.Comparable<java.lang.String> strComparable13 = strComparableDynamicArray0.get((int) (byte) 0);
        java.lang.String str14 = strComparableDynamicArray0.toString();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[[], hi!, [[hi!]]]" + "'", str10, "[[], hi!, [[hi!]]]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + strComparable13 + "' != '" + "[]" + "'", strComparable13, "[]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[[], hi!, [[hi!]]]" + "'", str14, "[[], hi!, [[hi!]]]");
    }

    @Test
    public void test3141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3141");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableDynamicArray0.isEmpty();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream2 = strComparableDynamicArray0.stream();
        java.lang.Comparable<java.lang.String> strComparable4 = strComparableDynamicArray0.get(1);
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator iterator7 = strComparableDynamicArray0.iterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator8 = strComparableDynamicArray0.spliterator();
        java.lang.String str9 = strComparableDynamicArray0.toString();
        int int10 = strComparableDynamicArray0.getSize();
        java.lang.String str11 = strComparableDynamicArray0.toString();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(strComparableStream2);
        org.junit.Assert.assertNull(strComparable4);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(strComparableSpliterator8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[hi!]" + "'", str9, "[hi!]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[hi!]" + "'", str11, "[hi!]");
    }

    @Test
    public void test3142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3142");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableDynamicArray0.isEmpty();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator2 = strComparableDynamicArray0.spliterator();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream3 = strComparableDynamicArray0.stream();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator4 = strComparableDynamicArray0.spliterator();
        boolean boolean5 = strComparableDynamicArray0.isEmpty();
        boolean boolean6 = strComparableDynamicArray0.isEmpty();
        int int7 = strComparableDynamicArray0.getSize();
        boolean boolean8 = strComparableDynamicArray0.isEmpty();
        boolean boolean9 = strComparableDynamicArray0.isEmpty();
        boolean boolean10 = strComparableDynamicArray0.isEmpty();
        int int11 = strComparableDynamicArray0.getSize();
        java.lang.String str12 = strComparableDynamicArray0.toString();
        boolean boolean13 = strComparableDynamicArray0.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(strComparableSpliterator2);
        org.junit.Assert.assertNotNull(strComparableStream3);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[]" + "'", str12, "[]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test3143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3143");
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.constant.ConstantDesc> constantDescDynamicArray1 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.constant.ConstantDesc>((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3144");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "");
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDynamicArray0.put((int) (short) 0, (java.lang.Comparable<java.lang.String>) "[]");
        int int8 = strComparableDynamicArray0.getSize();
        java.lang.String str9 = strComparableDynamicArray0.toString();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator10 = strComparableDynamicArray0.spliterator();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream11 = strComparableDynamicArray0.stream();
        int int12 = strComparableDynamicArray0.getSize();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[[], hi!]" + "'", str9, "[[], hi!]");
        org.junit.Assert.assertNotNull(strComparableSpliterator10);
        org.junit.Assert.assertNotNull(strComparableStream11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
    }

    @Test
    public void test3145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3145");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        boolean boolean4 = strComparableDynamicArray0.isEmpty();
        boolean boolean5 = strComparableDynamicArray0.isEmpty();
        boolean boolean6 = strComparableDynamicArray0.isEmpty();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream7 = strComparableDynamicArray0.stream();
        java.util.Iterator iterator8 = strComparableDynamicArray0.iterator();
        int int9 = strComparableDynamicArray0.getSize();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strComparableStream7);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test3146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3146");
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
        java.lang.String str15 = strComparableDynamicArray0.toString();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(strComparableStream4);
        org.junit.Assert.assertNotNull(strComparableSpliterator5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[hi!, [hi!]]" + "'", str8, "[hi!, [hi!]]");
        org.junit.Assert.assertNull(strComparable12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[hi!, [hi!], [[hi!, hi!, [hi!], [hi!]]]]" + "'", str15, "[hi!, [hi!], [[hi!, hi!, [hi!], [hi!]]]]");
    }

    @Test
    public void test3147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3147");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>> wildcardClassOfFieldDynamicArray1 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>(100);
    }

    @Test
    public void test3148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3148");
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
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator17 = strComparableDynamicArray0.spliterator();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertNotNull(strComparableSpliterator16);
        org.junit.Assert.assertNotNull(strComparableSpliterator17);
    }

    @Test
    public void test3149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3149");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.put(0, (java.lang.Comparable<java.lang.String>) "[hi!]");
        boolean boolean7 = strComparableDynamicArray0.isEmpty();
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableDynamicArray0.get(1);
        java.util.Iterator iterator10 = strComparableDynamicArray0.iterator();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream11 = strComparableDynamicArray0.stream();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(strComparable9);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertNotNull(strComparableStream11);
    }

    @Test
    public void test3150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3150");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableDynamicArray0.isEmpty();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator2 = strComparableDynamicArray0.spliterator();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream3 = strComparableDynamicArray0.stream();
        int int4 = strComparableDynamicArray0.getSize();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator5 = strComparableDynamicArray0.spliterator();
        strComparableDynamicArray0.put(4, (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean9 = strComparableDynamicArray0.isEmpty();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator10 = strComparableDynamicArray0.spliterator();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(strComparableSpliterator2);
        org.junit.Assert.assertNotNull(strComparableStream3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(strComparableSpliterator5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(strComparableSpliterator10);
    }

    @Test
    public void test3151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3151");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "");
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDynamicArray0.put((int) (short) 0, (java.lang.Comparable<java.lang.String>) "[]");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator8 = strComparableDynamicArray0.spliterator();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream9 = strComparableDynamicArray0.stream();
        int int10 = strComparableDynamicArray0.getSize();
        boolean boolean11 = strComparableDynamicArray0.isEmpty();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[hi!, hi!, [hi!], [hi!]]");
        boolean boolean14 = strComparableDynamicArray0.isEmpty();
        java.lang.String str15 = strComparableDynamicArray0.toString();
        java.lang.Class<?> wildcardClass16 = strComparableDynamicArray0.getClass();
        org.junit.Assert.assertNotNull(strComparableSpliterator8);
        org.junit.Assert.assertNotNull(strComparableStream9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[[], hi!, [hi!, hi!, [hi!], [hi!]]]" + "'", str15, "[[], hi!, [hi!, hi!, [hi!], [hi!]]]");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3152");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator4 = strComparableDynamicArray0.spliterator();
        java.lang.String str5 = strComparableDynamicArray0.toString();
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableDynamicArray0.remove((int) (short) 10);
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream8 = strComparableDynamicArray0.stream();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream9 = strComparableDynamicArray0.stream();
        strComparableDynamicArray0.put((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "[[[hi!]]]");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator13 = strComparableDynamicArray0.spliterator();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[[, ]]");
        java.util.Iterator iterator16 = strComparableDynamicArray0.iterator();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNull(strComparable7);
        org.junit.Assert.assertNotNull(strComparableStream8);
        org.junit.Assert.assertNotNull(strComparableStream9);
        org.junit.Assert.assertNotNull(strComparableSpliterator13);
        org.junit.Assert.assertNotNull(iterator16);
    }

    @Test
    public void test3153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3153");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableDynamicArray0.isEmpty();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream2 = strComparableDynamicArray0.stream();
        boolean boolean3 = strComparableDynamicArray0.isEmpty();
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableDynamicArray0.get((int) (byte) 1);
        boolean boolean6 = strComparableDynamicArray0.isEmpty();
        int int7 = strComparableDynamicArray0.getSize();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream8 = strComparableDynamicArray0.stream();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[[hi!, [], [hi!]]]");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable12 = strComparableDynamicArray0.get(100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 16");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(strComparableStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(strComparable5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(strComparableStream8);
    }

    @Test
    public void test3154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3154");
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
        java.lang.String str19 = strComparableDynamicArray0.toString();
        java.lang.String str20 = strComparableDynamicArray0.toString();
        int int21 = strComparableDynamicArray0.getSize();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertNotNull(strComparableSpliterator11);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertEquals("'" + strComparable15 + "' != '" + "hi!" + "'", strComparable15, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[[], ]" + "'", str19, "[[], ]");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "[[], ]" + "'", str20, "[[], ]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
    }

    @Test
    public void test3155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3155");
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
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[[, ]]");
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream13 = strComparableDynamicArray0.stream();
        boolean boolean14 = strComparableDynamicArray0.isEmpty();
        java.lang.String str15 = strComparableDynamicArray0.toString();
        java.util.Iterator iterator16 = strComparableDynamicArray0.iterator();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertNotNull(strComparableSpliterator5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertNotNull(strComparableStream10);
        org.junit.Assert.assertNotNull(strComparableStream13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[, [[, ]]]" + "'", str15, "[, [[, ]]]");
        org.junit.Assert.assertNotNull(iterator16);
    }

    @Test
    public void test3156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3156");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableDynamicArray0.isEmpty();
        java.util.Iterator iterator2 = strComparableDynamicArray0.iterator();
        int int3 = strComparableDynamicArray0.getSize();
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableDynamicArray0.get((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(strComparable5);
    }

    @Test
    public void test3157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3157");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableDynamicArray0.getSize();
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableDynamicArray0.get((int) (byte) 10);
        java.lang.String str9 = strComparableDynamicArray0.toString();
        boolean boolean10 = strComparableDynamicArray0.isEmpty();
        boolean boolean11 = strComparableDynamicArray0.isEmpty();
        java.lang.Class<?> wildcardClass12 = strComparableDynamicArray0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNull(strComparable8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[hi!]" + "'", str9, "[hi!]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3158");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator4 = strComparableDynamicArray0.spliterator();
        boolean boolean5 = strComparableDynamicArray0.isEmpty();
        boolean boolean6 = strComparableDynamicArray0.isEmpty();
        java.lang.String str7 = strComparableDynamicArray0.toString();
        int int8 = strComparableDynamicArray0.getSize();
        java.lang.Comparable<java.lang.String> strComparable10 = strComparableDynamicArray0.get((int) (byte) 0);
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream11 = strComparableDynamicArray0.stream();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(strComparable10);
        org.junit.Assert.assertNotNull(strComparableStream11);
    }

    @Test
    public void test3159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3159");
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
        java.util.Iterator iterator20 = strComparableDynamicArray0.iterator();
        int int21 = strComparableDynamicArray0.getSize();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNull(strComparable8);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertNull(strComparable13);
        org.junit.Assert.assertNull(strComparable15);
        org.junit.Assert.assertNotNull(strComparableStream18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 4 + "'", int19 == 4);
        org.junit.Assert.assertNotNull(iterator20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4 + "'", int21 == 4);
    }

    @Test
    public void test3160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3160");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "");
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDynamicArray0.put((int) (short) 0, (java.lang.Comparable<java.lang.String>) "[]");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator8 = strComparableDynamicArray0.spliterator();
        java.util.Iterator iterator9 = strComparableDynamicArray0.iterator();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[hi!, []]");
        java.lang.Comparable<java.lang.String> strComparable13 = strComparableDynamicArray0.get(10);
        // The following exception was thrown during execution in test generation
        try {
            strComparableDynamicArray0.put((int) (byte) 100, (java.lang.Comparable<java.lang.String>) "[[hi!, []], hi!, ]");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 16");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strComparableSpliterator8);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNull(strComparable13);
    }

    @Test
    public void test3161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3161");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator4 = strComparableDynamicArray0.spliterator();
        java.lang.String str5 = strComparableDynamicArray0.toString();
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableDynamicArray0.remove((int) (short) 10);
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream8 = strComparableDynamicArray0.stream();
        java.lang.String str9 = strComparableDynamicArray0.toString();
        boolean boolean10 = strComparableDynamicArray0.isEmpty();
        boolean boolean11 = strComparableDynamicArray0.isEmpty();
        java.lang.String str12 = strComparableDynamicArray0.toString();
        java.lang.Comparable<java.lang.String> strComparable14 = strComparableDynamicArray0.get(1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNull(strComparable7);
        org.junit.Assert.assertNotNull(strComparableStream8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[]" + "'", str12, "[]");
        org.junit.Assert.assertNull(strComparable14);
    }

    @Test
    public void test3162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3162");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableDynamicArray0.isEmpty();
        java.util.Iterator iterator2 = strComparableDynamicArray0.iterator();
        java.lang.String str3 = strComparableDynamicArray0.toString();
        int int4 = strComparableDynamicArray0.getSize();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[]" + "'", str3, "[]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test3163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3163");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableDynamicArray0.isEmpty();
        java.util.Iterator iterator2 = strComparableDynamicArray0.iterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator3 = strComparableDynamicArray0.spliterator();
        strComparableDynamicArray0.put((int) (short) 10, (java.lang.Comparable<java.lang.String>) "[[], hi!, , ]");
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream7 = strComparableDynamicArray0.stream();
        java.lang.String str8 = strComparableDynamicArray0.toString();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator9 = strComparableDynamicArray0.spliterator();
        java.lang.Comparable<java.lang.String> strComparable11 = null;
        // The following exception was thrown during execution in test generation
        try {
            strComparableDynamicArray0.put((int) '#', strComparable11);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 16");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertNotNull(strComparableSpliterator3);
        org.junit.Assert.assertNotNull(strComparableStream7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[[[], hi!, , ]]" + "'", str8, "[[[], hi!, , ]]");
        org.junit.Assert.assertNotNull(strComparableSpliterator9);
    }

    @Test
    public void test3164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3164");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream6 = strComparableDynamicArray0.stream();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream7 = strComparableDynamicArray0.stream();
        int int8 = strComparableDynamicArray0.getSize();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator9 = strComparableDynamicArray0.spliterator();
        java.lang.Comparable<java.lang.String> strComparable11 = strComparableDynamicArray0.remove(4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableStream6);
        org.junit.Assert.assertNotNull(strComparableStream7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertNotNull(strComparableSpliterator9);
        org.junit.Assert.assertNull(strComparable11);
    }

    @Test
    public void test3165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3165");
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
        java.lang.Class<?> wildcardClass19 = strComparableDynamicArray0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertNotNull(strComparableSpliterator5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertNotNull(strComparableSpliterator14);
        org.junit.Assert.assertNotNull(strComparableSpliterator17);
        org.junit.Assert.assertNotNull(iterator18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3166");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableDynamicArray0.isEmpty();
        java.util.Iterator iterator2 = strComparableDynamicArray0.iterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator3 = strComparableDynamicArray0.spliterator();
        java.lang.String str4 = strComparableDynamicArray0.toString();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[hi!, [], [hi!]]");
        java.util.Iterator iterator7 = strComparableDynamicArray0.iterator();
        strComparableDynamicArray0.put(0, (java.lang.Comparable<java.lang.String>) "[hi!, [], , [[, ], [hi!], [hi!, hi!], [[], hi!]]]");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertNotNull(strComparableSpliterator3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertNotNull(iterator7);
    }

    @Test
    public void test3167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3167");
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
        java.lang.Comparable<java.lang.String> strComparable24 = strComparableDynamicArray0.get((int) (short) 0);
        strComparableDynamicArray0.put(0, (java.lang.Comparable<java.lang.String>) "[[[hi!, [hi!]]], [[[[hi!]]], , [hi!, []], [[hi!]]]]");
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream28 = strComparableDynamicArray0.stream();
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
        org.junit.Assert.assertNull(strComparable24);
        org.junit.Assert.assertNotNull(strComparableStream28);
    }

    @Test
    public void test3168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3168");
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
        java.lang.String str14 = strComparableDynamicArray0.toString();
        java.lang.String str15 = strComparableDynamicArray0.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strComparableStream12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[]" + "'", str14, "[]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[]" + "'", str15, "[]");
    }

    @Test
    public void test3169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3169");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableDynamicArray0.getSize();
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableDynamicArray0.get((int) (byte) 10);
        strComparableDynamicArray0.put(0, (java.lang.Comparable<java.lang.String>) "[[], hi!, [[hi!]]]");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator12 = strComparableDynamicArray0.spliterator();
        java.lang.String str13 = strComparableDynamicArray0.toString();
        strComparableDynamicArray0.put(3, (java.lang.Comparable<java.lang.String>) "[[, ], [hi!], [hi!, hi!], [[], hi!]]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNull(strComparable8);
        org.junit.Assert.assertNotNull(strComparableSpliterator12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[[[], hi!, [[hi!]]], hi!]" + "'", str13, "[[[], hi!, [[hi!]]], hi!]");
    }

    @Test
    public void test3170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3170");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray1 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>((int) (short) 10);
        strComparableDynamicArray1.add((java.lang.Comparable<java.lang.String>) "[[[[[hi!]]], , [hi!, []], [[hi!]]], [[]]]");
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream4 = strComparableDynamicArray1.stream();
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableDynamicArray1.remove((int) (short) 0);
        org.junit.Assert.assertNotNull(strComparableStream4);
        org.junit.Assert.assertEquals("'" + strComparable6 + "' != '" + "[[[[[hi!]]], , [hi!, []], [[hi!]]], [[]]]" + "'", strComparable6, "[[[[[hi!]]], , [hi!, []], [[hi!]]], [[]]]");
    }

    @Test
    public void test3171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3171");
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
        strComparableDynamicArray0.put(4, (java.lang.Comparable<java.lang.String>) "[, [[hi!]]]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertNotNull(strComparableSpliterator11);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertEquals("'" + strComparable15 + "' != '" + "hi!" + "'", strComparable15, "hi!");
    }

    @Test
    public void test3172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3172");
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
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[, [hi!]]");
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[[hi!, [], [hi!]]]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNotNull(strComparableSpliterator10);
        org.junit.Assert.assertNotNull(strComparableSpliterator11);
    }

    @Test
    public void test3173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3173");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator4 = strComparableDynamicArray0.spliterator();
        strComparableDynamicArray0.put((int) (byte) 10, (java.lang.Comparable<java.lang.String>) "");
        java.util.Iterator iterator8 = strComparableDynamicArray0.iterator();
        java.lang.String str9 = strComparableDynamicArray0.toString();
        java.util.Iterator iterator10 = strComparableDynamicArray0.iterator();
        java.lang.String str11 = strComparableDynamicArray0.toString();
        java.util.Iterator iterator12 = strComparableDynamicArray0.iterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator13 = strComparableDynamicArray0.spliterator();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertNotNull(strComparableSpliterator13);
    }

    @Test
    public void test3174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3174");
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
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[hi!, []]");
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream17 = strComparableDynamicArray0.stream();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream18 = strComparableDynamicArray0.stream();
        java.lang.Class<?> wildcardClass19 = strComparableStream18.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNull(strComparable8);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertNull(strComparable13);
        org.junit.Assert.assertNotNull(strComparableStream14);
        org.junit.Assert.assertNotNull(strComparableStream17);
        org.junit.Assert.assertNotNull(strComparableStream18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3175");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator4 = strComparableDynamicArray0.spliterator();
        int int5 = strComparableDynamicArray0.getSize();
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableDynamicArray0.remove(0);
        boolean boolean8 = strComparableDynamicArray0.isEmpty();
        java.lang.String str9 = strComparableDynamicArray0.toString();
        java.lang.Comparable<java.lang.String> strComparable11 = strComparableDynamicArray0.get((int) (byte) 10);
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream12 = strComparableDynamicArray0.stream();
        boolean boolean13 = strComparableDynamicArray0.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(strComparable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertNull(strComparable11);
        org.junit.Assert.assertNotNull(strComparableStream12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test3176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3176");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableDynamicArray0.getSize();
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableDynamicArray0.get((int) (byte) 10);
        strComparableDynamicArray0.put(0, (java.lang.Comparable<java.lang.String>) "[[], hi!, [[hi!]]]");
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[[hi!], [hi!, hi!]]");
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream14 = strComparableDynamicArray0.stream();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNull(strComparable8);
        org.junit.Assert.assertNotNull(strComparableStream14);
    }

    @Test
    public void test3177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3177");
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
        boolean boolean14 = strComparableDynamicArray0.isEmpty();
        int int15 = strComparableDynamicArray0.getSize();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator16 = strComparableDynamicArray0.spliterator();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream17 = strComparableDynamicArray0.stream();
        int int18 = strComparableDynamicArray0.getSize();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNull(strComparable8);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertNotNull(strComparableStream12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertNotNull(strComparableSpliterator16);
        org.junit.Assert.assertNotNull(strComparableStream17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
    }

    @Test
    public void test3178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3178");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "");
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDynamicArray0.put((int) (short) 0, (java.lang.Comparable<java.lang.String>) "[]");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator8 = strComparableDynamicArray0.spliterator();
        java.util.Iterator iterator9 = strComparableDynamicArray0.iterator();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[hi!, []]");
        java.lang.Comparable<java.lang.String> strComparable13 = strComparableDynamicArray0.get(10);
        java.lang.Comparable<java.lang.String> strComparable15 = strComparableDynamicArray0.get(4);
        org.junit.Assert.assertNotNull(strComparableSpliterator8);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNull(strComparable13);
        org.junit.Assert.assertNull(strComparable15);
    }

    @Test
    public void test3179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3179");
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
        java.lang.String str15 = strComparableDynamicArray0.toString();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[hi!, hi!, [[hi!, hi!, [hi!]]]]");
        java.lang.Comparable<java.lang.String> strComparable19 = strComparableDynamicArray0.remove(4);
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream20 = strComparableDynamicArray0.stream();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[, [hi!, []]]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator8);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[[hi!]]" + "'", str12, "[[hi!]]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[[hi!, hi!, [hi!], [hi!]]]" + "'", str15, "[[hi!, hi!, [hi!], [hi!]]]");
        org.junit.Assert.assertNull(strComparable19);
        org.junit.Assert.assertNotNull(strComparableStream20);
    }

    @Test
    public void test3180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3180");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        boolean boolean4 = strComparableDynamicArray0.isEmpty();
        boolean boolean5 = strComparableDynamicArray0.isEmpty();
        boolean boolean6 = strComparableDynamicArray0.isEmpty();
        int int7 = strComparableDynamicArray0.getSize();
        boolean boolean8 = strComparableDynamicArray0.isEmpty();
        java.lang.String str9 = strComparableDynamicArray0.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable11 = strComparableDynamicArray0.remove((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 16");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
    }

    @Test
    public void test3181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3181");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray1 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>(0);
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator2 = strComparableDynamicArray1.spliterator();
        int int3 = strComparableDynamicArray1.getSize();
        java.util.Iterator iterator4 = strComparableDynamicArray1.iterator();
        java.util.Iterator iterator5 = strComparableDynamicArray1.iterator();
        // The following exception was thrown during execution in test generation
        try {
            strComparableDynamicArray1.put((-1), (java.lang.Comparable<java.lang.String>) "[[hi!, []], [[hi!], hi!]]");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strComparableSpliterator2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertNotNull(iterator5);
    }

    @Test
    public void test3182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3182");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator4 = strComparableDynamicArray0.spliterator();
        strComparableDynamicArray0.put((int) (byte) 10, (java.lang.Comparable<java.lang.String>) "");
        java.util.Iterator iterator8 = strComparableDynamicArray0.iterator();
        java.lang.String str9 = strComparableDynamicArray0.toString();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream10 = strComparableDynamicArray0.stream();
        int int11 = strComparableDynamicArray0.getSize();
        java.lang.String str12 = strComparableDynamicArray0.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertNotNull(strComparableStream10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[]" + "'", str12, "[]");
    }

    @Test
    public void test3183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3183");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        boolean boolean4 = strComparableDynamicArray0.isEmpty();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[[hi!, [], [hi!]]]");
        java.util.Iterator iterator9 = strComparableDynamicArray0.iterator();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(iterator9);
    }

    @Test
    public void test3184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3184");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable18 = strComparableDynamicArray0.remove((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 16");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNull(strComparable8);
        org.junit.Assert.assertNotNull(strComparableStream9);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
    }

    @Test
    public void test3185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3185");
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
        java.lang.Comparable<java.lang.String> strComparable16 = strComparableDynamicArray0.get(2);
        java.lang.Comparable<java.lang.String> strComparable18 = strComparableDynamicArray0.remove(4);
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream19 = strComparableDynamicArray0.stream();
        boolean boolean20 = strComparableDynamicArray0.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator9);
        org.junit.Assert.assertNull(strComparable14);
        org.junit.Assert.assertNull(strComparable16);
        org.junit.Assert.assertNull(strComparable18);
        org.junit.Assert.assertNotNull(strComparableStream19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test3186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3186");
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
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[[[[[hi!]]], , [hi!, []], [[hi!]]], [[]]]");
        java.lang.Comparable<java.lang.String> strComparable18 = strComparableDynamicArray0.remove(0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertNotNull(strComparableSpliterator5);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertNull(strComparable8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertNotNull(strComparableSpliterator10);
        org.junit.Assert.assertNotNull(strComparableStream11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(strComparable18);
    }

    @Test
    public void test3187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3187");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator4 = strComparableDynamicArray0.spliterator();
        boolean boolean5 = strComparableDynamicArray0.isEmpty();
        java.lang.String str6 = strComparableDynamicArray0.toString();
        strComparableDynamicArray0.put(2, (java.lang.Comparable<java.lang.String>) "[[[], hi!, , ]]");
        java.lang.String str10 = strComparableDynamicArray0.toString();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream11 = strComparableDynamicArray0.stream();
        java.util.Iterator iterator12 = strComparableDynamicArray0.iterator();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[[[[], hi!, , ]]]" + "'", str10, "[[[[], hi!, , ]]]");
        org.junit.Assert.assertNotNull(strComparableStream11);
        org.junit.Assert.assertNotNull(iterator12);
    }

    @Test
    public void test3188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3188");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray1 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>((int) (short) 100);
        strComparableDynamicArray1.put((int) (byte) 1, (java.lang.Comparable<java.lang.String>) "[[], hi!, [[hi!]]]");
        strComparableDynamicArray1.add((java.lang.Comparable<java.lang.String>) "[, hi!, , hi!]");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator7 = strComparableDynamicArray1.spliterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable9 = strComparableDynamicArray1.get((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strComparableSpliterator7);
    }

    @Test
    public void test3189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3189");
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
        boolean boolean21 = strComparableDynamicArray0.isEmpty();
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
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + strComparable20 + "' != '" + "hi!" + "'", strComparable20, "hi!");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(iterator22);
    }

    @Test
    public void test3190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3190");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        boolean boolean3 = strComparableDynamicArray0.isEmpty();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[]");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator6 = strComparableDynamicArray0.spliterator();
        int int7 = strComparableDynamicArray0.getSize();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator8 = strComparableDynamicArray0.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator9 = strComparableDynamicArray0.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator10 = strComparableDynamicArray0.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator11 = strComparableDynamicArray0.spliterator();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNotNull(strComparableSpliterator8);
        org.junit.Assert.assertNotNull(strComparableSpliterator9);
        org.junit.Assert.assertNotNull(strComparableSpliterator10);
        org.junit.Assert.assertNotNull(strComparableSpliterator11);
    }

    @Test
    public void test3191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3191");
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
        java.lang.Comparable<java.lang.String> strComparable15 = null;
        strComparableDynamicArray0.put((int) (short) 1, strComparable15);
        java.lang.Comparable<java.lang.String> strComparable18 = strComparableDynamicArray0.get((int) (short) 10);
        java.lang.String str19 = strComparableDynamicArray0.toString();
        boolean boolean20 = strComparableDynamicArray0.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[hi!, []]" + "'", str11, "[hi!, []]");
        org.junit.Assert.assertNotNull(strComparableSpliterator12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[hi!, []]" + "'", str13, "[hi!, []]");
        org.junit.Assert.assertNull(strComparable18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[[]]" + "'", str19, "[[]]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test3192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3192");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "");
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDynamicArray0.put((int) (short) 0, (java.lang.Comparable<java.lang.String>) "[]");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator8 = strComparableDynamicArray0.spliterator();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream9 = strComparableDynamicArray0.stream();
        java.util.Iterator iterator10 = strComparableDynamicArray0.iterator();
        strComparableDynamicArray0.put(2, (java.lang.Comparable<java.lang.String>) "[[], hi!, [[hi!]]]");
        java.lang.Comparable<java.lang.String> strComparable15 = strComparableDynamicArray0.remove(0);
        org.junit.Assert.assertNotNull(strComparableSpliterator8);
        org.junit.Assert.assertNotNull(strComparableStream9);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertEquals("'" + strComparable15 + "' != '" + "[]" + "'", strComparable15, "[]");
    }

    @Test
    public void test3193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3193");
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
        int int17 = strComparableDynamicArray0.getSize();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNull(strComparable8);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertNotNull(strComparableStream12);
        org.junit.Assert.assertEquals("'" + strComparable14 + "' != '" + "hi!" + "'", strComparable14, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
    }

    @Test
    public void test3194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3194");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator4 = strComparableDynamicArray0.spliterator();
        int int5 = strComparableDynamicArray0.getSize();
        int int6 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[[], ]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test3195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3195");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableDynamicArray0.getSize();
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableDynamicArray0.remove((int) (byte) 10);
        strComparableDynamicArray0.put(10, (java.lang.Comparable<java.lang.String>) "");
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[hi!, hi!, [[], hi!]]");
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream14 = strComparableDynamicArray0.stream();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNull(strComparable8);
        org.junit.Assert.assertNotNull(strComparableStream14);
    }

    @Test
    public void test3196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3196");
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
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream23 = strComparableDynamicArray0.stream();
        java.lang.String str24 = strComparableDynamicArray0.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNull(strComparable8);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertNull(strComparable13);
        org.junit.Assert.assertNull(strComparable15);
        org.junit.Assert.assertNotNull(strComparableStream20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 5 + "'", int21 == 5);
        org.junit.Assert.assertNotNull(strComparableStream22);
        org.junit.Assert.assertNotNull(strComparableStream23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "[hi!, hi!, [hi!], [hi!]]" + "'", str24, "[hi!, hi!, [hi!], [hi!]]");
    }

    @Test
    public void test3197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3197");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator4 = strComparableDynamicArray0.spliterator();
        boolean boolean5 = strComparableDynamicArray0.isEmpty();
        java.util.Iterator iterator6 = strComparableDynamicArray0.iterator();
        boolean boolean7 = strComparableDynamicArray0.isEmpty();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator8 = strComparableDynamicArray0.spliterator();
        java.lang.Comparable<java.lang.String> strComparable10 = strComparableDynamicArray0.get(3);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator8);
        org.junit.Assert.assertNull(strComparable10);
    }

    @Test
    public void test3198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3198");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "");
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream5 = strComparableDynamicArray0.stream();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream6 = strComparableDynamicArray0.stream();
        boolean boolean7 = strComparableDynamicArray0.isEmpty();
        int int8 = strComparableDynamicArray0.getSize();
        boolean boolean9 = strComparableDynamicArray0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            strComparableDynamicArray0.put((int) '4', (java.lang.Comparable<java.lang.String>) "[[[hi!, hi!, [hi!]]], [, ]]");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 52 out of bounds for length 16");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strComparableStream5);
        org.junit.Assert.assertNotNull(strComparableStream6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3199");
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
        int int11 = strComparableDynamicArray0.getSize();
        int int12 = strComparableDynamicArray0.getSize();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertNotNull(strComparableSpliterator5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertNotNull(strComparableStream10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
    }

    @Test
    public void test3200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3200");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableDynamicArray0.isEmpty();
        java.util.Iterator iterator2 = strComparableDynamicArray0.iterator();
        int int3 = strComparableDynamicArray0.getSize();
        java.lang.String str4 = strComparableDynamicArray0.toString();
        // The following exception was thrown during execution in test generation
        try {
            strComparableDynamicArray0.put((int) (byte) -1, (java.lang.Comparable<java.lang.String>) "[[[], hi!, , ]]");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 16");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
    }

    @Test
    public void test3201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3201");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator4 = strComparableDynamicArray0.spliterator();
        java.lang.String str5 = strComparableDynamicArray0.toString();
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableDynamicArray0.remove((int) (short) 10);
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream8 = strComparableDynamicArray0.stream();
        java.lang.String str9 = strComparableDynamicArray0.toString();
        boolean boolean10 = strComparableDynamicArray0.isEmpty();
        boolean boolean11 = strComparableDynamicArray0.isEmpty();
        java.lang.String str12 = strComparableDynamicArray0.toString();
        boolean boolean13 = strComparableDynamicArray0.isEmpty();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[[[[[hi!]]], , [hi!, []], [[hi!]]], [[]]]");
        boolean boolean16 = strComparableDynamicArray0.isEmpty();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream17 = strComparableDynamicArray0.stream();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[[[, ]]]");
        java.util.Iterator iterator20 = strComparableDynamicArray0.iterator();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream21 = strComparableDynamicArray0.stream();
        java.lang.Class<?> wildcardClass22 = strComparableStream21.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNull(strComparable7);
        org.junit.Assert.assertNotNull(strComparableStream8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[]" + "'", str12, "[]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strComparableStream17);
        org.junit.Assert.assertNotNull(iterator20);
        org.junit.Assert.assertNotNull(strComparableStream21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3202");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "");
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator5 = strComparableDynamicArray0.spliterator();
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableDynamicArray0.remove(2);
        java.util.Iterator iterator8 = strComparableDynamicArray0.iterator();
        boolean boolean9 = strComparableDynamicArray0.isEmpty();
        java.util.Iterator iterator10 = strComparableDynamicArray0.iterator();
        org.junit.Assert.assertNotNull(strComparableSpliterator5);
        org.junit.Assert.assertNull(strComparable7);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(iterator10);
    }

    @Test
    public void test3203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3203");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableDynamicArray0.isEmpty();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream4 = strComparableDynamicArray0.stream();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream5 = strComparableDynamicArray0.stream();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[[[[hi!]]], , [hi!, []], [[hi!]]]");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator8 = strComparableDynamicArray0.spliterator();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(strComparableStream4);
        org.junit.Assert.assertNotNull(strComparableStream5);
        org.junit.Assert.assertNotNull(strComparableSpliterator8);
    }

    @Test
    public void test3204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3204");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableDynamicArray0.isEmpty();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator2 = strComparableDynamicArray0.spliterator();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream3 = strComparableDynamicArray0.stream();
        int int4 = strComparableDynamicArray0.getSize();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream5 = strComparableDynamicArray0.stream();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream6 = strComparableDynamicArray0.stream();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream7 = strComparableDynamicArray0.stream();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator8 = strComparableDynamicArray0.spliterator();
        java.util.Iterator iterator9 = strComparableDynamicArray0.iterator();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(strComparableSpliterator2);
        org.junit.Assert.assertNotNull(strComparableStream3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(strComparableStream5);
        org.junit.Assert.assertNotNull(strComparableStream6);
        org.junit.Assert.assertNotNull(strComparableStream7);
        org.junit.Assert.assertNotNull(strComparableSpliterator8);
        org.junit.Assert.assertNotNull(iterator9);
    }

    @Test
    public void test3205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3205");
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
        java.lang.String str15 = strComparableDynamicArray0.toString();
        java.util.Iterator iterator16 = strComparableDynamicArray0.iterator();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator10);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[]" + "'", str12, "[]");
        org.junit.Assert.assertNull(strComparable14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[]" + "'", str15, "[]");
        org.junit.Assert.assertNotNull(iterator16);
    }

    @Test
    public void test3206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3206");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean6 = strComparableDynamicArray0.isEmpty();
        java.util.Iterator iterator7 = strComparableDynamicArray0.iterator();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream8 = strComparableDynamicArray0.stream();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[[, ]]");
        java.lang.String str11 = strComparableDynamicArray0.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(strComparableStream8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[hi!, [[, ]]]" + "'", str11, "[hi!, [[, ]]]");
    }

    @Test
    public void test3207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3207");
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
        boolean boolean17 = strComparableDynamicArray0.isEmpty();
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
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test3208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3208");
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.constant.ConstantDesc> constantDescDynamicArray1 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.constant.ConstantDesc>((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3209");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableDynamicArray0.isEmpty();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator2 = strComparableDynamicArray0.spliterator();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream3 = strComparableDynamicArray0.stream();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator4 = strComparableDynamicArray0.spliterator();
        boolean boolean5 = strComparableDynamicArray0.isEmpty();
        boolean boolean6 = strComparableDynamicArray0.isEmpty();
        int int7 = strComparableDynamicArray0.getSize();
        boolean boolean8 = strComparableDynamicArray0.isEmpty();
        boolean boolean9 = strComparableDynamicArray0.isEmpty();
        boolean boolean10 = strComparableDynamicArray0.isEmpty();
        int int11 = strComparableDynamicArray0.getSize();
        java.lang.Comparable<java.lang.String> strComparable13 = strComparableDynamicArray0.get(5);
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream14 = strComparableDynamicArray0.stream();
        java.util.Iterator iterator15 = strComparableDynamicArray0.iterator();
        java.lang.Class<?> wildcardClass16 = strComparableDynamicArray0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(strComparableSpliterator2);
        org.junit.Assert.assertNotNull(strComparableStream3);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(strComparable13);
        org.junit.Assert.assertNotNull(strComparableStream14);
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3210");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableDynamicArray0.spliterator();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[hi!, [], , [[, ], [hi!], [hi!, hi!], [[], hi!]]]");
        boolean boolean4 = strComparableDynamicArray0.isEmpty();
        java.lang.String str5 = strComparableDynamicArray0.toString();
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[[hi!, [], , [[, ], [hi!], [hi!, hi!], [[], hi!]]]]" + "'", str5, "[[hi!, [], , [[, ], [hi!], [hi!, hi!], [[], hi!]]]]");
    }

    @Test
    public void test3211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3211");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray1 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>((int) (byte) 0);
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator2 = strComparableDynamicArray1.spliterator();
        boolean boolean3 = strComparableDynamicArray1.isEmpty();
        java.util.Iterator iterator4 = strComparableDynamicArray1.iterator();
        org.junit.Assert.assertNotNull(strComparableSpliterator2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(iterator4);
    }

    @Test
    public void test3212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3212");
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
        java.lang.Comparable<java.lang.String> strComparable17 = strComparableDynamicArray0.remove(4);
        boolean boolean18 = strComparableDynamicArray0.isEmpty();
        java.lang.String str19 = strComparableDynamicArray0.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(strComparable12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[]" + "'", str14, "[]");
        org.junit.Assert.assertNotNull(strComparableSpliterator15);
        org.junit.Assert.assertNull(strComparable17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[]" + "'", str19, "[]");
    }

    @Test
    public void test3213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3213");
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
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator15 = strComparableDynamicArray0.spliterator();
        java.lang.String str16 = strComparableDynamicArray0.toString();
        java.util.Iterator iterator17 = strComparableDynamicArray0.iterator();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[hi!, [hi!, hi!]]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(strComparable6);
        org.junit.Assert.assertNotNull(strComparableSpliterator7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertNotNull(strComparableSpliterator15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[[hi!, hi!]]" + "'", str16, "[[hi!, hi!]]");
        org.junit.Assert.assertNotNull(iterator17);
    }

    @Test
    public void test3214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3214");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableDynamicArray0.isEmpty();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableDynamicArray0.isEmpty();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator5 = strComparableDynamicArray0.spliterator();
        boolean boolean6 = strComparableDynamicArray0.isEmpty();
        boolean boolean7 = strComparableDynamicArray0.isEmpty();
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableDynamicArray0.get(10);
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator10 = strComparableDynamicArray0.spliterator();
        java.util.Iterator iterator11 = strComparableDynamicArray0.iterator();
        boolean boolean12 = strComparableDynamicArray0.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(strComparable9);
        org.junit.Assert.assertNotNull(strComparableSpliterator10);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3215");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.String str1 = strComparableDynamicArray0.toString();
        strComparableDynamicArray0.put(0, (java.lang.Comparable<java.lang.String>) "[hi!]");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator5 = strComparableDynamicArray0.spliterator();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream6 = strComparableDynamicArray0.stream();
        java.util.Iterator iterator7 = strComparableDynamicArray0.iterator();
        boolean boolean8 = strComparableDynamicArray0.isEmpty();
        java.lang.String str9 = strComparableDynamicArray0.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable11 = strComparableDynamicArray0.get((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 16");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "[]" + "'", str1, "[]");
        org.junit.Assert.assertNotNull(strComparableSpliterator5);
        org.junit.Assert.assertNotNull(strComparableStream6);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[[hi!]]" + "'", str9, "[[hi!]]");
    }

    @Test
    public void test3216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3216");
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
        java.lang.String str15 = strComparableDynamicArray0.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[hi!, []]" + "'", str11, "[hi!, []]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[hi!, [], [hi!]]" + "'", str15, "[hi!, [], [hi!]]");
    }

    @Test
    public void test3217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3217");
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
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream13 = strComparableDynamicArray0.stream();
        java.lang.String str14 = strComparableDynamicArray0.toString();
        java.util.Iterator iterator15 = strComparableDynamicArray0.iterator();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[, ]");
        // The following exception was thrown during execution in test generation
        try {
            strComparableDynamicArray0.put(100, (java.lang.Comparable<java.lang.String>) "[[[[], hi!, , ]]]");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 16");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertNotNull(strComparableSpliterator5);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertNull(strComparable8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertNotNull(strComparableStream12);
        org.junit.Assert.assertNotNull(strComparableStream13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[[, ]]" + "'", str14, "[[, ]]");
        org.junit.Assert.assertNotNull(iterator15);
    }

    @Test
    public void test3218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3218");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Object> objDynamicArray1 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Object>((int) (short) 1);
    }

    @Test
    public void test3219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3219");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        boolean boolean4 = strComparableDynamicArray0.isEmpty();
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableDynamicArray0.remove((int) (short) 0);
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator7 = strComparableDynamicArray0.spliterator();
        java.util.Iterator iterator8 = strComparableDynamicArray0.iterator();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDynamicArray0.put(0, (java.lang.Comparable<java.lang.String>) "[[], ]");
        java.util.Iterator iterator14 = strComparableDynamicArray0.iterator();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(strComparable6);
        org.junit.Assert.assertNotNull(strComparableSpliterator7);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(iterator14);
    }

    @Test
    public void test3220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3220");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator4 = strComparableDynamicArray0.spliterator();
        strComparableDynamicArray0.put((int) (byte) 10, (java.lang.Comparable<java.lang.String>) "");
        java.util.Iterator iterator8 = strComparableDynamicArray0.iterator();
        java.lang.String str9 = strComparableDynamicArray0.toString();
        java.lang.Comparable<java.lang.String> strComparable11 = strComparableDynamicArray0.remove(2);
        boolean boolean12 = strComparableDynamicArray0.isEmpty();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[[hi!, hi!, [hi!]]]");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator15 = strComparableDynamicArray0.spliterator();
        boolean boolean16 = strComparableDynamicArray0.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertNull(strComparable11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(strComparableSpliterator15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3221");
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
        java.lang.Comparable<java.lang.String> strComparable14 = strComparableDynamicArray0.get(0);
        java.lang.Comparable<java.lang.String> strComparable16 = strComparableDynamicArray0.get(10);
        int int17 = strComparableDynamicArray0.getSize();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream18 = strComparableDynamicArray0.stream();
        java.util.Iterator iterator19 = strComparableDynamicArray0.iterator();
        int int20 = strComparableDynamicArray0.getSize();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator9);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertNull(strComparable14);
        org.junit.Assert.assertNull(strComparable16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertNotNull(strComparableStream18);
        org.junit.Assert.assertNotNull(iterator19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
    }

    @Test
    public void test3222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3222");
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
        int int14 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[hi!, [hi!]]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(strComparable6);
        org.junit.Assert.assertNotNull(strComparableSpliterator7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(strComparableSpliterator10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test3223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3223");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableDynamicArray0.isEmpty();
        java.lang.String str2 = strComparableDynamicArray0.toString();
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDynamicArray0.add(strComparable3);
        java.util.Iterator iterator5 = strComparableDynamicArray0.iterator();
        boolean boolean6 = strComparableDynamicArray0.isEmpty();
        java.util.Iterator iterator7 = strComparableDynamicArray0.iterator();
        java.lang.Class<?> wildcardClass8 = iterator7.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3224");
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
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator13 = strComparableDynamicArray0.spliterator();
        java.lang.Class<?> wildcardClass14 = strComparableSpliterator13.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(strComparable9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertNotNull(strComparableSpliterator13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3225");
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.invoke.TypeDescriptor> typeDescriptorDynamicArray1 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.invoke.TypeDescriptor>((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3226");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator4 = strComparableDynamicArray0.spliterator();
        strComparableDynamicArray0.put((int) (byte) 10, (java.lang.Comparable<java.lang.String>) "");
        java.util.Iterator iterator8 = strComparableDynamicArray0.iterator();
        java.lang.String str9 = strComparableDynamicArray0.toString();
        java.lang.Comparable<java.lang.String> strComparable11 = strComparableDynamicArray0.remove(2);
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator12 = strComparableDynamicArray0.spliterator();
        boolean boolean13 = strComparableDynamicArray0.isEmpty();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[hi!, [hi!, []]]");
        java.lang.String str16 = strComparableDynamicArray0.toString();
        java.lang.Comparable<java.lang.String> strComparable17 = null;
        strComparableDynamicArray0.add(strComparable17);
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator19 = strComparableDynamicArray0.spliterator();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertNull(strComparable11);
        org.junit.Assert.assertNotNull(strComparableSpliterator12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[[hi!, [hi!, []]], ]" + "'", str16, "[[hi!, [hi!, []]], ]");
        org.junit.Assert.assertNotNull(strComparableSpliterator19);
    }

    @Test
    public void test3227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3227");
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
        strComparableDynamicArray0.put(4, (java.lang.Comparable<java.lang.String>) "[hi!, [hi!, []]]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(strComparableStream14);
    }

    @Test
    public void test3228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3228");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableDynamicArray0.isEmpty();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableDynamicArray0.isEmpty();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator5 = strComparableDynamicArray0.spliterator();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator iterator8 = strComparableDynamicArray0.iterator();
        java.lang.Class<?> wildcardClass9 = strComparableDynamicArray0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator5);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3229");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.String str1 = strComparableDynamicArray0.toString();
        strComparableDynamicArray0.put(0, (java.lang.Comparable<java.lang.String>) "[hi!]");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator5 = strComparableDynamicArray0.spliterator();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream6 = strComparableDynamicArray0.stream();
        java.util.Iterator iterator7 = strComparableDynamicArray0.iterator();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDynamicArray0.put(10, (java.lang.Comparable<java.lang.String>) "[[, []], [hi!]]");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "[]" + "'", str1, "[]");
        org.junit.Assert.assertNotNull(strComparableSpliterator5);
        org.junit.Assert.assertNotNull(strComparableStream6);
        org.junit.Assert.assertNotNull(iterator7);
    }

    @Test
    public void test3230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3230");
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
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator14 = strComparableDynamicArray0.spliterator();
        java.lang.Class<?> wildcardClass15 = strComparableSpliterator14.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(strComparable12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertNotNull(strComparableSpliterator14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3231");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray1 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable3 = strComparableDynamicArray1.remove(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3232");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableDynamicArray0.getSize();
        int int7 = strComparableDynamicArray0.getSize();
        boolean boolean8 = strComparableDynamicArray0.isEmpty();
        java.lang.Comparable<java.lang.String> strComparable10 = strComparableDynamicArray0.get(2);
        java.util.Iterator iterator11 = strComparableDynamicArray0.iterator();
        strComparableDynamicArray0.put(1, (java.lang.Comparable<java.lang.String>) "[[[hi!]]]");
        java.lang.Class<?> wildcardClass15 = strComparableDynamicArray0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(strComparable10);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3233");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray1 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>((int) (byte) 10);
        strComparableDynamicArray1.put((int) (byte) 1, (java.lang.Comparable<java.lang.String>) "[[hi!]]");
        java.lang.String str5 = strComparableDynamicArray1.toString();
        java.lang.String str6 = strComparableDynamicArray1.toString();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream7 = strComparableDynamicArray1.stream();
        java.util.Iterator iterator8 = strComparableDynamicArray1.iterator();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream9 = strComparableDynamicArray1.stream();
        java.util.Iterator iterator10 = strComparableDynamicArray1.iterator();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[[[hi!]]]" + "'", str5, "[[[hi!]]]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[[[hi!]]]" + "'", str6, "[[[hi!]]]");
        org.junit.Assert.assertNotNull(strComparableStream7);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(strComparableStream9);
        org.junit.Assert.assertNotNull(iterator10);
    }

    @Test
    public void test3234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3234");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.io.Serializable> serializableDynamicArray1 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.io.Serializable>((int) 'a');
    }

    @Test
    public void test3235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3235");
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
        int int10 = strComparableDynamicArray0.getSize();
        java.lang.Comparable<java.lang.String> strComparable12 = strComparableDynamicArray0.remove((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable14 = strComparableDynamicArray0.remove((int) (byte) -1);
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
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNull(strComparable12);
    }

    @Test
    public void test3236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3236");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        boolean boolean3 = strComparableDynamicArray0.isEmpty();
        java.lang.String str4 = strComparableDynamicArray0.toString();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator5 = strComparableDynamicArray0.spliterator();
        java.util.Iterator iterator6 = strComparableDynamicArray0.iterator();
        java.lang.String str7 = strComparableDynamicArray0.toString();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator8 = strComparableDynamicArray0.spliterator();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream9 = strComparableDynamicArray0.stream();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream10 = strComparableDynamicArray0.stream();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[hi!, hi!, [hi!], [hi!]]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertNotNull(strComparableSpliterator5);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertNotNull(strComparableSpliterator8);
        org.junit.Assert.assertNotNull(strComparableStream9);
        org.junit.Assert.assertNotNull(strComparableStream10);
    }

    @Test
    public void test3237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3237");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableDynamicArray0.isEmpty();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream4 = strComparableDynamicArray0.stream();
        int int5 = strComparableDynamicArray0.getSize();
        int int6 = strComparableDynamicArray0.getSize();
        java.lang.Class<?> wildcardClass7 = strComparableDynamicArray0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(strComparableStream4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3238");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableDynamicArray0.isEmpty();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream4 = strComparableDynamicArray0.stream();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator5 = strComparableDynamicArray0.spliterator();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[hi!]");
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableDynamicArray0.remove((int) (short) 1);
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator10 = strComparableDynamicArray0.spliterator();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream11 = strComparableDynamicArray0.stream();
        boolean boolean12 = strComparableDynamicArray0.isEmpty();
        java.lang.Comparable<java.lang.String> strComparable14 = strComparableDynamicArray0.get(4);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(strComparableStream4);
        org.junit.Assert.assertNotNull(strComparableSpliterator5);
        org.junit.Assert.assertEquals("'" + strComparable9 + "' != '" + "[hi!]" + "'", strComparable9, "[hi!]");
        org.junit.Assert.assertNotNull(strComparableSpliterator10);
        org.junit.Assert.assertNotNull(strComparableStream11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(strComparable14);
    }

    @Test
    public void test3239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3239");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.reflect.GenericDeclaration> genericDeclarationDynamicArray1 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.reflect.GenericDeclaration>((int) (byte) 0);
    }

    @Test
    public void test3240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3240");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator4 = strComparableDynamicArray0.spliterator();
        strComparableDynamicArray0.put((int) (byte) 10, (java.lang.Comparable<java.lang.String>) "");
        java.util.Iterator iterator8 = strComparableDynamicArray0.iterator();
        java.lang.Comparable<java.lang.String> strComparable9 = null;
        strComparableDynamicArray0.add(strComparable9);
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream11 = strComparableDynamicArray0.stream();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable13 = strComparableDynamicArray0.remove((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97 out of bounds for length 16");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(strComparableStream11);
    }

    @Test
    public void test3241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3241");
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
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream16 = strComparableDynamicArray0.stream();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[hi!, []]" + "'", str11, "[hi!, []]");
        org.junit.Assert.assertNotNull(strComparableSpliterator15);
        org.junit.Assert.assertNotNull(strComparableStream16);
    }

    @Test
    public void test3242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3242");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray1 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>((int) (short) 10);
        strComparableDynamicArray1.add((java.lang.Comparable<java.lang.String>) "[, ]");
        int int4 = strComparableDynamicArray1.getSize();
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableDynamicArray1.remove(1);
        java.lang.String str7 = strComparableDynamicArray1.toString();
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableDynamicArray1.get(1);
        java.util.Iterator iterator10 = strComparableDynamicArray1.iterator();
        java.lang.Comparable<java.lang.String> strComparable12 = strComparableDynamicArray1.get((int) (byte) 1);
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator13 = strComparableDynamicArray1.spliterator();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream14 = strComparableDynamicArray1.stream();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNull(strComparable6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertNull(strComparable9);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertNull(strComparable12);
        org.junit.Assert.assertNotNull(strComparableSpliterator13);
        org.junit.Assert.assertNotNull(strComparableStream14);
    }

    @Test
    public void test3243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3243");
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
        java.lang.String str18 = strComparableDynamicArray0.toString();
        java.lang.String str19 = strComparableDynamicArray0.toString();
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[[]]" + "'", str18, "[[]]");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[[]]" + "'", str19, "[[]]");
    }

    @Test
    public void test3244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3244");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        boolean boolean3 = strComparableDynamicArray0.isEmpty();
        java.lang.String str4 = strComparableDynamicArray0.toString();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableDynamicArray0.isEmpty();
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableDynamicArray0.get((int) (byte) 1);
        java.lang.String str10 = strComparableDynamicArray0.toString();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + strComparable9 + "' != '" + "hi!" + "'", strComparable9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[hi!]" + "'", str10, "[hi!]");
    }

    @Test
    public void test3245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3245");
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
        strComparableDynamicArray0.put((int) (byte) 1, (java.lang.Comparable<java.lang.String>) "");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator19 = strComparableDynamicArray0.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator20 = strComparableDynamicArray0.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator21 = strComparableDynamicArray0.spliterator();
        java.lang.String str22 = strComparableDynamicArray0.toString();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[, [hi!]]");
        boolean boolean25 = strComparableDynamicArray0.isEmpty();
        boolean boolean26 = strComparableDynamicArray0.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNull(strComparable8);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertNotNull(strComparableSpliterator19);
        org.junit.Assert.assertNotNull(strComparableSpliterator20);
        org.junit.Assert.assertNotNull(strComparableSpliterator21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "[, hi!, , hi!]" + "'", str22, "[, hi!, , hi!]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test3246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3246");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        boolean boolean4 = strComparableDynamicArray0.isEmpty();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream7 = strComparableDynamicArray0.stream();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[hi!, [[], hi!, , ]]");
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[, hi!, , hi!]");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable13 = strComparableDynamicArray0.remove((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97 out of bounds for length 16");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strComparableStream7);
    }

    @Test
    public void test3247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3247");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableDynamicArray0.getSize();
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableDynamicArray0.get((int) (byte) 10);
        strComparableDynamicArray0.put((int) (short) 10, (java.lang.Comparable<java.lang.String>) "[]");
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream12 = strComparableDynamicArray0.stream();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNull(strComparable8);
        org.junit.Assert.assertNotNull(strComparableStream12);
    }

    @Test
    public void test3248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3248");
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
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator11 = strComparableDynamicArray0.spliterator();
        java.lang.Class<?> wildcardClass12 = strComparableSpliterator11.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(strComparable6);
        org.junit.Assert.assertNotNull(strComparableSpliterator7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(strComparableStream10);
        org.junit.Assert.assertNotNull(strComparableSpliterator11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3249");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator4 = strComparableDynamicArray0.spliterator();
        strComparableDynamicArray0.put((int) (byte) 10, (java.lang.Comparable<java.lang.String>) "");
        java.util.Iterator iterator8 = strComparableDynamicArray0.iterator();
        java.lang.String str9 = strComparableDynamicArray0.toString();
        java.lang.Comparable<java.lang.String> strComparable11 = strComparableDynamicArray0.remove(2);
        int int12 = strComparableDynamicArray0.getSize();
        java.util.Iterator iterator13 = strComparableDynamicArray0.iterator();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[[[], hi!, , ], hi!]");
        java.lang.Comparable<java.lang.String> strComparable17 = strComparableDynamicArray0.remove((int) (short) 0);
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[[[], hi!, , ]]");
        java.lang.Class<?> wildcardClass20 = strComparableDynamicArray0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertNull(strComparable11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertEquals("'" + strComparable17 + "' != '" + "[[[], hi!, , ], hi!]" + "'", strComparable17, "[[[], hi!, , ], hi!]");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3250");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        boolean boolean3 = strComparableDynamicArray0.isEmpty();
        java.lang.String str4 = strComparableDynamicArray0.toString();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[hi!, []]");
        int int9 = strComparableDynamicArray0.getSize();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream10 = strComparableDynamicArray0.stream();
        java.lang.Comparable<java.lang.String> strComparable12 = strComparableDynamicArray0.remove((int) (short) 1);
        java.lang.String str13 = strComparableDynamicArray0.toString();
        // The following exception was thrown during execution in test generation
        try {
            strComparableDynamicArray0.put((int) (short) -1, (java.lang.Comparable<java.lang.String>) "[[hi!, hi!, [, ], [[], hi!]]]");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 16");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNotNull(strComparableStream10);
        org.junit.Assert.assertEquals("'" + strComparable12 + "' != '" + "hi!" + "'", strComparable12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[[hi!, []]]" + "'", str13, "[[hi!, []]]");
    }

    @Test
    public void test3251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3251");
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
        java.lang.String str19 = strComparableDynamicArray0.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNull(strComparable8);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(strComparable17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[hi!, hi!, [[], hi!]]" + "'", str19, "[hi!, hi!, [[], hi!]]");
    }

    @Test
    public void test3252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3252");
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
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator14 = strComparableDynamicArray0.spliterator();
        java.lang.String str15 = strComparableDynamicArray0.toString();
        strComparableDynamicArray0.put(0, (java.lang.Comparable<java.lang.String>) "[[hi!, [hi!]], , []]");
        java.util.Iterator iterator19 = strComparableDynamicArray0.iterator();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(strComparableStream4);
        org.junit.Assert.assertNotNull(strComparableSpliterator5);
        org.junit.Assert.assertEquals("'" + strComparable9 + "' != '" + "[hi!]" + "'", strComparable9, "[hi!]");
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[hi!, ]" + "'", str15, "[hi!, ]");
        org.junit.Assert.assertNotNull(iterator19);
    }

    @Test
    public void test3253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3253");
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
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator11 = strComparableDynamicArray0.spliterator();
        boolean boolean12 = strComparableDynamicArray0.isEmpty();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream13 = strComparableDynamicArray0.stream();
        java.lang.String str14 = strComparableDynamicArray0.toString();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator15 = strComparableDynamicArray0.spliterator();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[hi!]" + "'", str10, "[hi!]");
        org.junit.Assert.assertNotNull(strComparableSpliterator11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strComparableStream13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[hi!]" + "'", str14, "[hi!]");
        org.junit.Assert.assertNotNull(strComparableSpliterator15);
    }

    @Test
    public void test3254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3254");
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
        java.lang.Comparable<java.lang.String> strComparable17 = strComparableDynamicArray0.remove(3);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(strComparableStream4);
        org.junit.Assert.assertNotNull(strComparableSpliterator5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[hi!, [hi!]]" + "'", str8, "[hi!, [hi!]]");
        org.junit.Assert.assertNotNull(strComparableStream14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[hi!, [hi!], [hi!, hi!], [[], hi!]]" + "'", str15, "[hi!, [hi!], [hi!, hi!], [[], hi!]]");
        org.junit.Assert.assertNull(strComparable17);
    }

    @Test
    public void test3255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3255");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator4 = strComparableDynamicArray0.spliterator();
        java.lang.String str5 = strComparableDynamicArray0.toString();
        int int6 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[hi!, hi!, [[], hi!]]");
        boolean boolean9 = strComparableDynamicArray0.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3256");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator4 = strComparableDynamicArray0.spliterator();
        java.lang.String str5 = strComparableDynamicArray0.toString();
        int int6 = strComparableDynamicArray0.getSize();
        boolean boolean7 = strComparableDynamicArray0.isEmpty();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator8 = strComparableDynamicArray0.spliterator();
        java.lang.String str9 = strComparableDynamicArray0.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
    }

    @Test
    public void test3257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3257");
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
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator23 = strComparableDynamicArray0.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator24 = strComparableDynamicArray0.spliterator();
        int int25 = strComparableDynamicArray0.getSize();
        java.lang.Comparable<java.lang.String> strComparable27 = strComparableDynamicArray0.get((int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(strComparableStream4);
        org.junit.Assert.assertNotNull(strComparableSpliterator5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[hi!, [hi!]]" + "'", str8, "[hi!, [hi!]]");
        org.junit.Assert.assertNotNull(strComparableStream14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(strComparable20);
        org.junit.Assert.assertNotNull(iterator21);
        org.junit.Assert.assertNotNull(iterator22);
        org.junit.Assert.assertNotNull(strComparableSpliterator23);
        org.junit.Assert.assertNotNull(strComparableSpliterator24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 3 + "'", int25 == 3);
        org.junit.Assert.assertNull(strComparable27);
    }

    @Test
    public void test3258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3258");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable20 = strComparableDynamicArray0.remove((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 16");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNull(strComparable8);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertEquals("'" + strComparable16 + "' != '" + "[[], hi!]" + "'", strComparable16, "[[], hi!]");
        org.junit.Assert.assertEquals("'" + strComparable18 + "' != '" + "[[], hi!]" + "'", strComparable18, "[[], hi!]");
    }

    @Test
    public void test3259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3259");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator4 = strComparableDynamicArray0.spliterator();
        int int5 = strComparableDynamicArray0.getSize();
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableDynamicArray0.remove(0);
        java.util.Iterator iterator8 = strComparableDynamicArray0.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable10 = strComparableDynamicArray0.remove(100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 16");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(strComparable7);
        org.junit.Assert.assertNotNull(iterator8);
    }

    @Test
    public void test3260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3260");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator4 = strComparableDynamicArray0.spliterator();
        java.lang.String str5 = strComparableDynamicArray0.toString();
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableDynamicArray0.remove((int) (short) 10);
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator8 = strComparableDynamicArray0.spliterator();
        java.util.Iterator iterator9 = strComparableDynamicArray0.iterator();
        int int10 = strComparableDynamicArray0.getSize();
        java.util.Iterator iterator11 = strComparableDynamicArray0.iterator();
        java.lang.Class<?> wildcardClass12 = iterator11.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNull(strComparable7);
        org.junit.Assert.assertNotNull(strComparableSpliterator8);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3261");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        boolean boolean4 = strComparableDynamicArray0.isEmpty();
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableDynamicArray0.remove((int) (short) 0);
        java.util.Iterator iterator7 = strComparableDynamicArray0.iterator();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream8 = strComparableDynamicArray0.stream();
        boolean boolean9 = strComparableDynamicArray0.isEmpty();
        java.lang.Comparable<java.lang.String> strComparable11 = strComparableDynamicArray0.get(1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(strComparable6);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(strComparableStream8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(strComparable11);
    }

    @Test
    public void test3262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3262");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableDynamicArray0.isEmpty();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream4 = strComparableDynamicArray0.stream();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator5 = strComparableDynamicArray0.spliterator();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[hi!]");
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableDynamicArray0.remove((int) (short) 1);
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator10 = strComparableDynamicArray0.spliterator();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream11 = strComparableDynamicArray0.stream();
        java.lang.String str12 = strComparableDynamicArray0.toString();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(strComparableStream4);
        org.junit.Assert.assertNotNull(strComparableSpliterator5);
        org.junit.Assert.assertEquals("'" + strComparable9 + "' != '" + "[hi!]" + "'", strComparable9, "[hi!]");
        org.junit.Assert.assertNotNull(strComparableSpliterator10);
        org.junit.Assert.assertNotNull(strComparableStream11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[hi!]" + "'", str12, "[hi!]");
    }

    @Test
    public void test3263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3263");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableDynamicArray0.getSize();
        java.util.Iterator iterator7 = strComparableDynamicArray0.iterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator8 = strComparableDynamicArray0.spliterator();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream9 = strComparableDynamicArray0.stream();
        java.lang.Comparable<java.lang.String> strComparable11 = strComparableDynamicArray0.get((int) (short) 1);
        strComparableDynamicArray0.put((int) (byte) 10, (java.lang.Comparable<java.lang.String>) "[[[], hi!, [[hi!]]], hi!]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(strComparableSpliterator8);
        org.junit.Assert.assertNotNull(strComparableStream9);
        org.junit.Assert.assertEquals("'" + strComparable11 + "' != '" + "hi!" + "'", strComparable11, "hi!");
    }

    @Test
    public void test3264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3264");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        boolean boolean3 = strComparableDynamicArray0.isEmpty();
        java.lang.String str4 = strComparableDynamicArray0.toString();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator5 = strComparableDynamicArray0.spliterator();
        boolean boolean6 = strComparableDynamicArray0.isEmpty();
        java.util.Iterator iterator7 = strComparableDynamicArray0.iterator();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[[[[hi!, hi!, [hi!], [hi!]], ]]]");
        java.lang.Comparable<java.lang.String> strComparable11 = strComparableDynamicArray0.get((int) (short) 10);
        java.lang.Comparable<java.lang.String> strComparable13 = strComparableDynamicArray0.get((int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertNotNull(strComparableSpliterator5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNull(strComparable11);
        org.junit.Assert.assertNull(strComparable13);
    }

    @Test
    public void test3265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3265");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableDynamicArray0.getSize();
        java.util.Iterator iterator7 = strComparableDynamicArray0.iterator();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[hi!, [hi!]]");
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream10 = strComparableDynamicArray0.stream();
        java.lang.Comparable<java.lang.String> strComparable12 = strComparableDynamicArray0.remove((int) (short) 0);
        java.lang.Comparable<java.lang.String> strComparable14 = strComparableDynamicArray0.get(2);
        java.lang.Comparable<java.lang.String> strComparable16 = strComparableDynamicArray0.remove(2);
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream17 = strComparableDynamicArray0.stream();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(strComparableStream10);
        org.junit.Assert.assertNull(strComparable12);
        org.junit.Assert.assertNull(strComparable14);
        org.junit.Assert.assertNull(strComparable16);
        org.junit.Assert.assertNotNull(strComparableStream17);
    }

    @Test
    public void test3266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3266");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream6 = strComparableDynamicArray0.stream();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream7 = strComparableDynamicArray0.stream();
        int int8 = strComparableDynamicArray0.getSize();
        java.util.Iterator iterator9 = strComparableDynamicArray0.iterator();
        boolean boolean10 = strComparableDynamicArray0.isEmpty();
        java.util.Iterator iterator11 = strComparableDynamicArray0.iterator();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableStream6);
        org.junit.Assert.assertNotNull(strComparableStream7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(iterator11);
    }

    @Test
    public void test3267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3267");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator iterator6 = strComparableDynamicArray0.iterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator7 = strComparableDynamicArray0.spliterator();
        int int8 = strComparableDynamicArray0.getSize();
        int int9 = strComparableDynamicArray0.getSize();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator10 = strComparableDynamicArray0.spliterator();
        java.lang.Class<?> wildcardClass11 = strComparableSpliterator10.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertNotNull(strComparableSpliterator7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertNotNull(strComparableSpliterator10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3268");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableDynamicArray0.getSize();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator7 = strComparableDynamicArray0.spliterator();
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableDynamicArray0.remove(1);
        java.lang.Comparable<java.lang.String> strComparable11 = strComparableDynamicArray0.remove(5);
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream12 = strComparableDynamicArray0.stream();
        java.util.Iterator iterator13 = strComparableDynamicArray0.iterator();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[[[[hi!, hi!, [hi!]]], [, ]]]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNotNull(strComparableSpliterator7);
        org.junit.Assert.assertEquals("'" + strComparable9 + "' != '" + "hi!" + "'", strComparable9, "hi!");
        org.junit.Assert.assertNull(strComparable11);
        org.junit.Assert.assertNotNull(strComparableStream12);
        org.junit.Assert.assertNotNull(iterator13);
    }

    @Test
    public void test3269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3269");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator4 = strComparableDynamicArray0.spliterator();
        java.lang.String str5 = strComparableDynamicArray0.toString();
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableDynamicArray0.remove((int) (short) 10);
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream8 = strComparableDynamicArray0.stream();
        java.lang.String str9 = strComparableDynamicArray0.toString();
        boolean boolean10 = strComparableDynamicArray0.isEmpty();
        strComparableDynamicArray0.put(0, (java.lang.Comparable<java.lang.String>) "[hi!, hi!, [hi!], [hi!]]");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator14 = strComparableDynamicArray0.spliterator();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[[[hi!]]]");
        strComparableDynamicArray0.put((int) (short) 10, (java.lang.Comparable<java.lang.String>) "[[], hi!, ]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNull(strComparable7);
        org.junit.Assert.assertNotNull(strComparableStream8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strComparableSpliterator14);
    }

    @Test
    public void test3270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3270");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableDynamicArray0.getSize();
        boolean boolean7 = strComparableDynamicArray0.isEmpty();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream8 = strComparableDynamicArray0.stream();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream9 = strComparableDynamicArray0.stream();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strComparableStream8);
        org.junit.Assert.assertNotNull(strComparableStream9);
    }

    @Test
    public void test3271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3271");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator4 = strComparableDynamicArray0.spliterator();
        java.lang.String str5 = strComparableDynamicArray0.toString();
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableDynamicArray0.remove((int) (short) 10);
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator8 = strComparableDynamicArray0.spliterator();
        boolean boolean9 = strComparableDynamicArray0.isEmpty();
        int int10 = strComparableDynamicArray0.getSize();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream11 = strComparableDynamicArray0.stream();
        java.lang.Class<?> wildcardClass12 = strComparableDynamicArray0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNull(strComparable7);
        org.junit.Assert.assertNotNull(strComparableSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(strComparableStream11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3272");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableDynamicArray0.getSize();
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableDynamicArray0.get((int) (byte) 10);
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream9 = strComparableDynamicArray0.stream();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream10 = strComparableDynamicArray0.stream();
        java.lang.Class<?> wildcardClass11 = strComparableStream10.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNull(strComparable8);
        org.junit.Assert.assertNotNull(strComparableStream9);
        org.junit.Assert.assertNotNull(strComparableStream10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3273");
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
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[hi!, []]");
        java.lang.Comparable<java.lang.String> strComparable23 = strComparableDynamicArray0.get(0);
        java.lang.String str24 = strComparableDynamicArray0.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNull(strComparable8);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertNull(strComparable13);
        org.junit.Assert.assertNull(strComparable15);
        org.junit.Assert.assertNotNull(strComparableStream18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[hi!, hi!, [hi!]]" + "'", str19, "[hi!, hi!, [hi!]]");
        org.junit.Assert.assertNull(strComparable23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "[hi!, hi!, [hi!], [hi!, []]]" + "'", str24, "[hi!, hi!, [hi!], [hi!, []]]");
    }

    @Test
    public void test3274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3274");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableDynamicArray0.isEmpty();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream4 = strComparableDynamicArray0.stream();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator5 = strComparableDynamicArray0.spliterator();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[hi!]");
        java.lang.String str8 = strComparableDynamicArray0.toString();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[hi!, hi!]");
        java.lang.Comparable<java.lang.String> strComparable12 = strComparableDynamicArray0.remove((int) (byte) 10);
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[[], hi!]");
        strComparableDynamicArray0.put((int) (short) 10, (java.lang.Comparable<java.lang.String>) "[[hi!, hi!, [hi!], [hi!]], ]");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable19 = strComparableDynamicArray0.remove((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 16");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(strComparableStream4);
        org.junit.Assert.assertNotNull(strComparableSpliterator5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[hi!, [hi!]]" + "'", str8, "[hi!, [hi!]]");
        org.junit.Assert.assertNull(strComparable12);
    }

    @Test
    public void test3275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3275");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray1 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>((int) (byte) 100);
        strComparableDynamicArray1.add((java.lang.Comparable<java.lang.String>) "[[[hi!]]]");
        strComparableDynamicArray1.put(5, (java.lang.Comparable<java.lang.String>) "[, [[, ]]]");
    }

    @Test
    public void test3276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3276");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableDynamicArray0.isEmpty();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator2 = strComparableDynamicArray0.spliterator();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream3 = strComparableDynamicArray0.stream();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator4 = strComparableDynamicArray0.spliterator();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[[], hi!]");
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[[, [[hi!]]], [hi!, hi!]]");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(strComparableSpliterator2);
        org.junit.Assert.assertNotNull(strComparableStream3);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
    }

    @Test
    public void test3277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3277");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[hi!, []]");
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream5 = strComparableDynamicArray0.stream();
        strComparableDynamicArray0.put((int) (short) 1, (java.lang.Comparable<java.lang.String>) "[[[hi!, [hi!]]], [[[[hi!]]], , [hi!, []], [[hi!]]]]");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable10 = strComparableDynamicArray0.remove((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 16");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strComparableStream5);
    }

    @Test
    public void test3278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3278");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray1 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>((int) (byte) 10);
        strComparableDynamicArray1.put((int) (byte) 1, (java.lang.Comparable<java.lang.String>) "[[hi!]]");
        int int5 = strComparableDynamicArray1.getSize();
        java.lang.String str6 = strComparableDynamicArray1.toString();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[[[hi!]]]" + "'", str6, "[[[hi!]]]");
    }

    @Test
    public void test3279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3279");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "");
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDynamicArray0.put((int) (short) 0, (java.lang.Comparable<java.lang.String>) "[]");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator8 = strComparableDynamicArray0.spliterator();
        java.lang.String str9 = strComparableDynamicArray0.toString();
        int int10 = strComparableDynamicArray0.getSize();
        java.lang.Comparable<java.lang.String> strComparable12 = strComparableDynamicArray0.remove((int) (byte) 0);
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream13 = strComparableDynamicArray0.stream();
        java.lang.Class<?> wildcardClass14 = strComparableStream13.getClass();
        org.junit.Assert.assertNotNull(strComparableSpliterator8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[[], hi!]" + "'", str9, "[[], hi!]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertEquals("'" + strComparable12 + "' != '" + "[]" + "'", strComparable12, "[]");
        org.junit.Assert.assertNotNull(strComparableStream13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3280");
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
        java.lang.Class<?> wildcardClass18 = strComparableStream17.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3281");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray1 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>((int) (byte) 10);
        strComparableDynamicArray1.put((int) (byte) 1, (java.lang.Comparable<java.lang.String>) "[[hi!]]");
        java.lang.String str5 = strComparableDynamicArray1.toString();
        java.lang.String str6 = strComparableDynamicArray1.toString();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream7 = strComparableDynamicArray1.stream();
        java.util.Iterator iterator8 = strComparableDynamicArray1.iterator();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream9 = strComparableDynamicArray1.stream();
        java.lang.String str10 = strComparableDynamicArray1.toString();
        java.util.Iterator iterator11 = strComparableDynamicArray1.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable13 = strComparableDynamicArray1.remove((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[[[hi!]]]" + "'", str5, "[[[hi!]]]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[[[hi!]]]" + "'", str6, "[[[hi!]]]");
        org.junit.Assert.assertNotNull(strComparableStream7);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(strComparableStream9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[[[hi!]]]" + "'", str10, "[[[hi!]]]");
        org.junit.Assert.assertNotNull(iterator11);
    }

    @Test
    public void test3282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3282");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.util.Spliterator<java.lang.Comparable<java.lang.String>>> strComparableSpliteratorDynamicArray1 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.util.Spliterator<java.lang.Comparable<java.lang.String>>>((int) (byte) 10);
    }

    @Test
    public void test3283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3283");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableDynamicArray0.getSize();
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableDynamicArray0.get((int) (byte) 10);
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream11 = strComparableDynamicArray0.stream();
        java.lang.String str12 = strComparableDynamicArray0.toString();
        java.lang.Comparable<java.lang.String> strComparable13 = null;
        strComparableDynamicArray0.add(strComparable13);
        boolean boolean15 = strComparableDynamicArray0.isEmpty();
        java.lang.String str16 = strComparableDynamicArray0.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable18 = strComparableDynamicArray0.remove((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 16");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNull(strComparable8);
        org.junit.Assert.assertNotNull(strComparableStream11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[hi!, hi!]" + "'", str12, "[hi!, hi!]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[hi!, hi!]" + "'", str16, "[hi!, hi!]");
    }

    @Test
    public void test3284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3284");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableDynamicArray0.getSize();
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableDynamicArray0.get((int) (byte) 10);
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream11 = strComparableDynamicArray0.stream();
        java.lang.String str12 = strComparableDynamicArray0.toString();
        java.lang.Comparable<java.lang.String> strComparable13 = null;
        strComparableDynamicArray0.add(strComparable13);
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream15 = strComparableDynamicArray0.stream();
        java.util.Iterator iterator16 = strComparableDynamicArray0.iterator();
        java.lang.String str17 = strComparableDynamicArray0.toString();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream18 = strComparableDynamicArray0.stream();
        boolean boolean19 = strComparableDynamicArray0.isEmpty();
        java.lang.Comparable<java.lang.String> strComparable21 = strComparableDynamicArray0.get(10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNull(strComparable8);
        org.junit.Assert.assertNotNull(strComparableStream11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[hi!, hi!]" + "'", str12, "[hi!, hi!]");
        org.junit.Assert.assertNotNull(strComparableStream15);
        org.junit.Assert.assertNotNull(iterator16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[hi!, hi!]" + "'", str17, "[hi!, hi!]");
        org.junit.Assert.assertNotNull(strComparableStream18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(strComparable21);
    }

    @Test
    public void test3285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3285");
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
        java.lang.String str20 = strComparableDynamicArray0.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNull(strComparable8);
        org.junit.Assert.assertNotNull(strComparableStream9);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertNull(strComparable12);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertNull(strComparable15);
        org.junit.Assert.assertEquals("'" + strComparable17 + "' != '" + "hi!" + "'", strComparable17, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "[hi!, [hi!, []]]" + "'", str20, "[hi!, [hi!, []]]");
    }

    @Test
    public void test3286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3286");
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Class<?>> wildcardClassDynamicArray1 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Class<?>>((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3287");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>> wildcardClassOfFieldDynamicArray1 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>((int) (short) 100);
    }

    @Test
    public void test3288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3288");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray1 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>((int) ' ');
        java.util.Iterator iterator2 = strComparableDynamicArray1.iterator();
        java.lang.Class<?> wildcardClass3 = strComparableDynamicArray1.getClass();
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test3289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3289");
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
        java.util.Iterator iterator17 = strComparableDynamicArray0.iterator();
        java.util.Iterator iterator18 = strComparableDynamicArray0.iterator();
        int int19 = strComparableDynamicArray0.getSize();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator9);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertNotNull(iterator17);
        org.junit.Assert.assertNotNull(iterator18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 5 + "'", int19 == 5);
    }

    @Test
    public void test3290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3290");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        boolean boolean4 = strComparableDynamicArray0.isEmpty();
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableDynamicArray0.remove((int) (short) 0);
        java.util.Iterator iterator7 = strComparableDynamicArray0.iterator();
        boolean boolean8 = strComparableDynamicArray0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable10 = strComparableDynamicArray0.remove(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 16");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(strComparable6);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test3291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3291");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable11 = strComparableDynamicArray0.remove((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 32 out of bounds for length 16");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3292");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableDynamicArray0.getSize();
        java.util.Iterator iterator7 = strComparableDynamicArray0.iterator();
        java.lang.String str8 = strComparableDynamicArray0.toString();
        int int9 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[, hi!, , hi!]");
        strComparableDynamicArray0.put(6, (java.lang.Comparable<java.lang.String>) "[[[[[[hi!]]], , [hi!, []], [[hi!]]], [[]]], hi!, ]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[hi!]" + "'", str8, "[hi!]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
    }

    @Test
    public void test3293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3293");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray1 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>((int) (byte) 0);
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator2 = strComparableDynamicArray1.spliterator();
        boolean boolean3 = strComparableDynamicArray1.isEmpty();
        java.lang.String str4 = strComparableDynamicArray1.toString();
        boolean boolean5 = strComparableDynamicArray1.isEmpty();
        boolean boolean6 = strComparableDynamicArray1.isEmpty();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream7 = strComparableDynamicArray1.stream();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator8 = strComparableDynamicArray1.spliterator();
        org.junit.Assert.assertNotNull(strComparableSpliterator2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strComparableStream7);
        org.junit.Assert.assertNotNull(strComparableSpliterator8);
    }

    @Test
    public void test3294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3294");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator4 = strComparableDynamicArray0.spliterator();
        java.lang.String str5 = strComparableDynamicArray0.toString();
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableDynamicArray0.remove((int) (short) 10);
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator8 = strComparableDynamicArray0.spliterator();
        java.lang.String str9 = strComparableDynamicArray0.toString();
        boolean boolean10 = strComparableDynamicArray0.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNull(strComparable7);
        org.junit.Assert.assertNotNull(strComparableSpliterator8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test3295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3295");
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
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[[], hi!]");
        java.lang.Comparable<java.lang.String> strComparable16 = strComparableDynamicArray0.get(0);
        java.lang.Class<?> wildcardClass17 = strComparableDynamicArray0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNull(strComparable8);
        org.junit.Assert.assertNotNull(strComparableStream9);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertNull(strComparable16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3296");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableDynamicArray0.getSize();
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableDynamicArray0.get((int) (byte) 10);
        java.lang.String str9 = strComparableDynamicArray0.toString();
        boolean boolean10 = strComparableDynamicArray0.isEmpty();
        boolean boolean11 = strComparableDynamicArray0.isEmpty();
        boolean boolean12 = strComparableDynamicArray0.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNull(strComparable8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[hi!]" + "'", str9, "[hi!]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3297");
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
        java.lang.String str19 = strComparableDynamicArray0.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable21 = strComparableDynamicArray0.remove(100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 16");
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[[], ]" + "'", str19, "[[], ]");
    }

    @Test
    public void test3298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3298");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        boolean boolean3 = strComparableDynamicArray0.isEmpty();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[]");
        boolean boolean6 = strComparableDynamicArray0.isEmpty();
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableDynamicArray0.remove((int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(strComparable8);
    }

    @Test
    public void test3299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3299");
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
        strComparableDynamicArray0.put((int) (short) 0, (java.lang.Comparable<java.lang.String>) "[[hi!, []]]");
        boolean boolean18 = strComparableDynamicArray0.isEmpty();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator19 = strComparableDynamicArray0.spliterator();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[[hi!], hi!, [[hi!]]]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertNotNull(strComparableSpliterator14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator19);
    }

    @Test
    public void test3300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3300");
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
        java.util.Iterator iterator11 = strComparableDynamicArray0.iterator();
        java.lang.String str12 = strComparableDynamicArray0.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(strComparable9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[]" + "'", str12, "[]");
    }

    @Test
    public void test3301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3301");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        boolean boolean3 = strComparableDynamicArray0.isEmpty();
        java.lang.String str4 = strComparableDynamicArray0.toString();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator5 = strComparableDynamicArray0.spliterator();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "");
        java.util.Iterator iterator8 = strComparableDynamicArray0.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable10 = strComparableDynamicArray0.remove((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 16");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertNotNull(strComparableSpliterator5);
        org.junit.Assert.assertNotNull(iterator8);
    }

    @Test
    public void test3302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3302");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableDynamicArray0.getSize();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator7 = strComparableDynamicArray0.spliterator();
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableDynamicArray0.remove(1);
        java.lang.Comparable<java.lang.String> strComparable11 = strComparableDynamicArray0.remove(5);
        int int12 = strComparableDynamicArray0.getSize();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable14 = strComparableDynamicArray0.get((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 52 out of bounds for length 16");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNotNull(strComparableSpliterator7);
        org.junit.Assert.assertEquals("'" + strComparable9 + "' != '" + "hi!" + "'", strComparable9, "hi!");
        org.junit.Assert.assertNull(strComparable11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test3303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3303");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.constant.ConstantDesc> constantDescDynamicArray1 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.constant.ConstantDesc>((int) '#');
    }

    @Test
    public void test3304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3304");
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
        boolean boolean18 = strComparableDynamicArray0.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(strComparable6);
        org.junit.Assert.assertNotNull(strComparableStream7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(strComparableStream9);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test3305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3305");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray1 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>((int) (short) 10);
        int int2 = strComparableDynamicArray1.getSize();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream3 = strComparableDynamicArray1.stream();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream4 = strComparableDynamicArray1.stream();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream5 = strComparableDynamicArray1.stream();
        boolean boolean6 = strComparableDynamicArray1.isEmpty();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator7 = strComparableDynamicArray1.spliterator();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(strComparableStream3);
        org.junit.Assert.assertNotNull(strComparableStream4);
        org.junit.Assert.assertNotNull(strComparableStream5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strComparableSpliterator7);
    }

    @Test
    public void test3306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3306");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableDynamicArray0.getSize();
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableDynamicArray0.get((int) (byte) 10);
        strComparableDynamicArray0.put(0, (java.lang.Comparable<java.lang.String>) "[[], hi!, [[hi!]]]");
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[[hi!, []], hi!, ]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNull(strComparable8);
    }

    @Test
    public void test3307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3307");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableDynamicArray0.isEmpty();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream4 = strComparableDynamicArray0.stream();
        strComparableDynamicArray0.put((int) (byte) 1, (java.lang.Comparable<java.lang.String>) "[hi!, [hi!]]");
        int int8 = strComparableDynamicArray0.getSize();
        java.util.Iterator iterator9 = strComparableDynamicArray0.iterator();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(strComparableStream4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(iterator9);
    }

    @Test
    public void test3308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3308");
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
        java.lang.Comparable<java.lang.String> strComparable12 = strComparableDynamicArray0.get(0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable14 = strComparableDynamicArray0.get((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 52 out of bounds for length 16");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertNotNull(strComparableSpliterator5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNotNull(strComparableStream10);
        org.junit.Assert.assertNull(strComparable12);
    }

    @Test
    public void test3309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3309");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        java.lang.Comparable<java.lang.String> strComparable4 = strComparableDynamicArray0.get(5);
        java.util.Iterator iterator5 = strComparableDynamicArray0.iterator();
        java.lang.String str6 = strComparableDynamicArray0.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable8 = strComparableDynamicArray0.remove((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 16");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(strComparable4);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
    }

    @Test
    public void test3310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3310");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.String str1 = strComparableDynamicArray0.toString();
        strComparableDynamicArray0.put(0, (java.lang.Comparable<java.lang.String>) "[hi!]");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator5 = strComparableDynamicArray0.spliterator();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream6 = strComparableDynamicArray0.stream();
        java.util.Iterator iterator7 = strComparableDynamicArray0.iterator();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable11 = strComparableDynamicArray0.remove(3);
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[[hi!, [hi!]]]");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator14 = strComparableDynamicArray0.spliterator();
        java.lang.Comparable<java.lang.String> strComparable16 = strComparableDynamicArray0.remove((int) (short) 0);
        java.util.Iterator iterator17 = strComparableDynamicArray0.iterator();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "[]" + "'", str1, "[]");
        org.junit.Assert.assertNotNull(strComparableSpliterator5);
        org.junit.Assert.assertNotNull(strComparableStream6);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNull(strComparable11);
        org.junit.Assert.assertNotNull(strComparableSpliterator14);
        org.junit.Assert.assertEquals("'" + strComparable16 + "' != '" + "[[hi!, [hi!]]]" + "'", strComparable16, "[[hi!, [hi!]]]");
        org.junit.Assert.assertNotNull(iterator17);
    }

    @Test
    public void test3311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3311");
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
        boolean boolean15 = strComparableDynamicArray0.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNull(strComparable8);
        org.junit.Assert.assertNotNull(strComparableStream9);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[hi!]" + "'", str12, "[hi!]");
        org.junit.Assert.assertNotNull(strComparableStream13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3312");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable21 = strComparableDynamicArray0.get((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 32 out of bounds for length 16");
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[hi!, hi!, [hi!]]" + "'", str19, "[hi!, hi!, [hi!]]");
    }

    @Test
    public void test3313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3313");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator4 = strComparableDynamicArray0.spliterator();
        int int5 = strComparableDynamicArray0.getSize();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream6 = strComparableDynamicArray0.stream();
        java.lang.String str7 = strComparableDynamicArray0.toString();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[hi!, [hi!, hi!]]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(strComparableStream6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
    }

    @Test
    public void test3314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3314");
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
        int int13 = strComparableDynamicArray0.getSize();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertNotNull(strComparableStream10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
    }

    @Test
    public void test3315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3315");
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.invoke.TypeDescriptor> typeDescriptorDynamicArray1 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.invoke.TypeDescriptor>((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3316");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray1 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>((int) (short) 10);
        strComparableDynamicArray1.add((java.lang.Comparable<java.lang.String>) "[, ]");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator4 = strComparableDynamicArray1.spliterator();
        int int5 = strComparableDynamicArray1.getSize();
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableDynamicArray1.get(4);
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator8 = strComparableDynamicArray1.spliterator();
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(strComparable7);
        org.junit.Assert.assertNotNull(strComparableSpliterator8);
    }

    @Test
    public void test3317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3317");
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
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator13 = strComparableDynamicArray0.spliterator();
        java.lang.String str14 = strComparableDynamicArray0.toString();
        java.lang.String str15 = strComparableDynamicArray0.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(strComparable6);
        org.junit.Assert.assertNotNull(strComparableSpliterator7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(strComparableStream10);
        org.junit.Assert.assertNull(strComparable12);
        org.junit.Assert.assertNotNull(strComparableSpliterator13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[]" + "'", str14, "[]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[]" + "'", str15, "[]");
    }

    @Test
    public void test3318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3318");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator4 = strComparableDynamicArray0.spliterator();
        int int5 = strComparableDynamicArray0.getSize();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream6 = strComparableDynamicArray0.stream();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[hi!, hi!, [hi!], [hi!]]");
        java.util.Iterator iterator9 = strComparableDynamicArray0.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable11 = strComparableDynamicArray0.get((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 16");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(strComparableStream6);
        org.junit.Assert.assertNotNull(iterator9);
    }

    @Test
    public void test3319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3319");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable14 = strComparableDynamicArray0.remove((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 16");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(strComparable12);
    }

    @Test
    public void test3320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3320");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        boolean boolean4 = strComparableDynamicArray0.isEmpty();
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableDynamicArray0.remove((int) (short) 0);
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream7 = strComparableDynamicArray0.stream();
        boolean boolean8 = strComparableDynamicArray0.isEmpty();
        java.util.Iterator iterator9 = strComparableDynamicArray0.iterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator10 = strComparableDynamicArray0.spliterator();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(strComparable6);
        org.junit.Assert.assertNotNull(strComparableStream7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNotNull(strComparableSpliterator10);
    }

    @Test
    public void test3321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3321");
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
        java.lang.Comparable<java.lang.String> strComparable13 = strComparableDynamicArray0.remove(1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertEquals("'" + strComparable13 + "' != '" + "" + "'", strComparable13, "");
    }

    @Test
    public void test3322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3322");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator4 = strComparableDynamicArray0.spliterator();
        int int5 = strComparableDynamicArray0.getSize();
        java.util.Iterator iterator6 = strComparableDynamicArray0.iterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator7 = strComparableDynamicArray0.spliterator();
        java.lang.String str8 = strComparableDynamicArray0.toString();
        boolean boolean9 = strComparableDynamicArray0.isEmpty();
        java.lang.Comparable<java.lang.String> strComparable11 = strComparableDynamicArray0.remove(10);
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable15 = strComparableDynamicArray0.remove(10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable17 = strComparableDynamicArray0.get((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 52 out of bounds for length 16");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertNotNull(strComparableSpliterator7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(strComparable11);
        org.junit.Assert.assertNull(strComparable15);
    }

    @Test
    public void test3323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3323");
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
        java.lang.Comparable<java.lang.String> strComparable16 = strComparableDynamicArray0.get(0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable18 = strComparableDynamicArray0.get((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 16");
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
        org.junit.Assert.assertNull(strComparable16);
    }

    @Test
    public void test3324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3324");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.io.Serializable> serializableDynamicArray1 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.io.Serializable>((int) (short) 100);
    }

    @Test
    public void test3325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3325");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableDynamicArray0.isEmpty();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator2 = strComparableDynamicArray0.spliterator();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream3 = strComparableDynamicArray0.stream();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator4 = strComparableDynamicArray0.spliterator();
        boolean boolean5 = strComparableDynamicArray0.isEmpty();
        boolean boolean6 = strComparableDynamicArray0.isEmpty();
        int int7 = strComparableDynamicArray0.getSize();
        boolean boolean8 = strComparableDynamicArray0.isEmpty();
        int int9 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[hi!, [hi!]]");
        strComparableDynamicArray0.put(4, (java.lang.Comparable<java.lang.String>) "[, ]");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(strComparableSpliterator2);
        org.junit.Assert.assertNotNull(strComparableStream3);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test3326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3326");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        boolean boolean3 = strComparableDynamicArray0.isEmpty();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[, ]");
        boolean boolean6 = strComparableDynamicArray0.isEmpty();
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableDynamicArray0.get((int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(strComparable8);
    }

    @Test
    public void test3327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3327");
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
        java.lang.Class<?> wildcardClass17 = strComparableStream16.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertEquals("'" + strComparable9 + "' != '" + "[]" + "'", strComparable9, "[]");
        org.junit.Assert.assertNotNull(strComparableSpliterator10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strComparableStream16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3328");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.String str1 = strComparableDynamicArray0.toString();
        strComparableDynamicArray0.put(0, (java.lang.Comparable<java.lang.String>) "[hi!]");
        int int5 = strComparableDynamicArray0.getSize();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable7 = strComparableDynamicArray0.get((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 16");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "[]" + "'", str1, "[]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test3329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3329");
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
        // The following exception was thrown during execution in test generation
        try {
            strComparableDynamicArray0.put((int) '4', (java.lang.Comparable<java.lang.String>) "[[[[], hi!, , ], hi!]]");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 52 out of bounds for length 16");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[, ]" + "'", str11, "[, ]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[, ]" + "'", str12, "[, ]");
        org.junit.Assert.assertNull(strComparable14);
    }

    @Test
    public void test3330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3330");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator4 = strComparableDynamicArray0.spliterator();
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableDynamicArray0.get((int) (short) 0);
        java.util.Iterator iterator7 = strComparableDynamicArray0.iterator();
        java.util.Iterator iterator8 = strComparableDynamicArray0.iterator();
        java.lang.Class<?> wildcardClass9 = strComparableDynamicArray0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertNull(strComparable6);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3331");
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
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[[], hi!, ]");
        java.lang.Class<?> wildcardClass19 = strComparableDynamicArray0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3332");
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
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[hi!, [hi!, []]]");
        // The following exception was thrown during execution in test generation
        try {
            strComparableDynamicArray0.put((int) (short) -1, (java.lang.Comparable<java.lang.String>) "[hi!, [[]]]");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 16");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNull(strComparable8);
        org.junit.Assert.assertNotNull(strComparableStream9);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(strComparable13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
    }

    @Test
    public void test3333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3333");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        boolean boolean3 = strComparableDynamicArray0.isEmpty();
        java.lang.String str4 = strComparableDynamicArray0.toString();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator5 = strComparableDynamicArray0.spliterator();
        java.util.Iterator iterator6 = strComparableDynamicArray0.iterator();
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableDynamicArray0.get(10);
        java.lang.Comparable<java.lang.String> strComparable10 = strComparableDynamicArray0.get(1);
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator11 = strComparableDynamicArray0.spliterator();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertNotNull(strComparableSpliterator5);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertNull(strComparable8);
        org.junit.Assert.assertNull(strComparable10);
        org.junit.Assert.assertNotNull(strComparableSpliterator11);
    }

    @Test
    public void test3334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3334");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray1 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>(6);
    }

    @Test
    public void test3335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3335");
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
        java.lang.String str13 = strComparableDynamicArray0.toString();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream14 = strComparableDynamicArray0.stream();
        java.lang.String str15 = strComparableDynamicArray0.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNull(strComparable8);
        org.junit.Assert.assertNotNull(strComparableStream9);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertNull(strComparable12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[hi!]" + "'", str13, "[hi!]");
        org.junit.Assert.assertNotNull(strComparableStream14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[hi!]" + "'", str15, "[hi!]");
    }

    @Test
    public void test3336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3336");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableDynamicArray0.isEmpty();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator2 = strComparableDynamicArray0.spliterator();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream3 = strComparableDynamicArray0.stream();
        int int4 = strComparableDynamicArray0.getSize();
        java.util.Iterator iterator5 = strComparableDynamicArray0.iterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator6 = strComparableDynamicArray0.spliterator();
        boolean boolean7 = strComparableDynamicArray0.isEmpty();
        java.util.Iterator iterator8 = strComparableDynamicArray0.iterator();
        strComparableDynamicArray0.put(3, (java.lang.Comparable<java.lang.String>) "[[hi!, []]]");
        java.lang.Class<?> wildcardClass12 = strComparableDynamicArray0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(strComparableSpliterator2);
        org.junit.Assert.assertNotNull(strComparableStream3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertNotNull(strComparableSpliterator6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3337");
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
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream11 = strComparableDynamicArray0.stream();
        java.lang.String str12 = strComparableDynamicArray0.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableStream6);
        org.junit.Assert.assertNotNull(strComparableStream7);
        org.junit.Assert.assertNotNull(strComparableSpliterator8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertNotNull(strComparableSpliterator10);
        org.junit.Assert.assertNotNull(strComparableStream11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[hi!]" + "'", str12, "[hi!]");
    }

    @Test
    public void test3338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3338");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "");
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDynamicArray0.put((int) (short) 0, (java.lang.Comparable<java.lang.String>) "[]");
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[[hi!]]");
        java.lang.String str10 = strComparableDynamicArray0.toString();
        boolean boolean11 = strComparableDynamicArray0.isEmpty();
        java.lang.Comparable<java.lang.String> strComparable13 = strComparableDynamicArray0.get((int) (byte) 0);
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator14 = strComparableDynamicArray0.spliterator();
        java.lang.Comparable<java.lang.String> strComparable16 = strComparableDynamicArray0.get((int) (short) 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[[], hi!, [[hi!]]]" + "'", str10, "[[], hi!, [[hi!]]]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + strComparable13 + "' != '" + "[]" + "'", strComparable13, "[]");
        org.junit.Assert.assertNotNull(strComparableSpliterator14);
        org.junit.Assert.assertEquals("'" + strComparable16 + "' != '" + "[]" + "'", strComparable16, "[]");
    }

    @Test
    public void test3339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3339");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator iterator6 = strComparableDynamicArray0.iterator();
        java.lang.String str7 = strComparableDynamicArray0.toString();
        strComparableDynamicArray0.put(10, (java.lang.Comparable<java.lang.String>) "[[hi!]]");
        strComparableDynamicArray0.put((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "[[], [hi!, hi!, [hi!], [hi!]]]");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable15 = strComparableDynamicArray0.get((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 16");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[hi!]" + "'", str7, "[hi!]");
    }

    @Test
    public void test3340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3340");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.String> strDynamicArray1 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.String>(0);
        java.lang.Class<?> wildcardClass2 = strDynamicArray1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test3341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3341");
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
        java.lang.String str17 = strComparableDynamicArray0.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[hi!, []]" + "'", str11, "[hi!, []]");
        org.junit.Assert.assertNotNull(strComparableSpliterator12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[hi!, []]" + "'", str13, "[hi!, []]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[hi!, [], [hi!]]" + "'", str17, "[hi!, [], [hi!]]");
    }

    @Test
    public void test3342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3342");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator4 = strComparableDynamicArray0.spliterator();
        java.lang.String str5 = strComparableDynamicArray0.toString();
        int int6 = strComparableDynamicArray0.getSize();
        boolean boolean7 = strComparableDynamicArray0.isEmpty();
        strComparableDynamicArray0.put((int) (short) 0, (java.lang.Comparable<java.lang.String>) "[, [, [hi!]]]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test3343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3343");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream6 = strComparableDynamicArray0.stream();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream7 = strComparableDynamicArray0.stream();
        int int8 = strComparableDynamicArray0.getSize();
        java.util.Iterator iterator9 = strComparableDynamicArray0.iterator();
        boolean boolean10 = strComparableDynamicArray0.isEmpty();
        java.lang.String str11 = strComparableDynamicArray0.toString();
        int int12 = strComparableDynamicArray0.getSize();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream13 = strComparableDynamicArray0.stream();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableStream6);
        org.junit.Assert.assertNotNull(strComparableStream7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[hi!]" + "'", str11, "[hi!]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertNotNull(strComparableStream13);
    }

    @Test
    public void test3344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3344");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableDynamicArray0.getSize();
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableDynamicArray0.get((int) (byte) 10);
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream9 = strComparableDynamicArray0.stream();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream10 = strComparableDynamicArray0.stream();
        boolean boolean11 = strComparableDynamicArray0.isEmpty();
        strComparableDynamicArray0.put((int) (short) 1, (java.lang.Comparable<java.lang.String>) "[[[], hi!, , ], hi!]");
        boolean boolean15 = strComparableDynamicArray0.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNull(strComparable8);
        org.junit.Assert.assertNotNull(strComparableStream9);
        org.junit.Assert.assertNotNull(strComparableStream10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3345");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray1 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>((int) (short) 10);
        boolean boolean2 = strComparableDynamicArray1.isEmpty();
        strComparableDynamicArray1.add((java.lang.Comparable<java.lang.String>) "[[[], hi!, , ]]");
        java.lang.Class<?> wildcardClass5 = strComparableDynamicArray1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3346");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableDynamicArray0.getSize();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator7 = strComparableDynamicArray0.spliterator();
        java.util.Iterator iterator8 = strComparableDynamicArray0.iterator();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream9 = strComparableDynamicArray0.stream();
        int int10 = strComparableDynamicArray0.getSize();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream11 = strComparableDynamicArray0.stream();
        java.lang.String str12 = strComparableDynamicArray0.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNotNull(strComparableSpliterator7);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(strComparableStream9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertNotNull(strComparableStream11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[hi!]" + "'", str12, "[hi!]");
    }

    @Test
    public void test3347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3347");
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
        java.lang.String str21 = strComparableDynamicArray0.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNull(strComparable8);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertNull(strComparable13);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertNotNull(iterator18);
        org.junit.Assert.assertNull(strComparable20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "[hi!, hi!, [[hi!]]]" + "'", str21, "[hi!, hi!, [[hi!]]]");
    }

    @Test
    public void test3348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3348");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator4 = strComparableDynamicArray0.spliterator();
        strComparableDynamicArray0.put((int) (byte) 10, (java.lang.Comparable<java.lang.String>) "");
        java.util.Iterator iterator8 = strComparableDynamicArray0.iterator();
        java.lang.String str9 = strComparableDynamicArray0.toString();
        java.lang.Comparable<java.lang.String> strComparable11 = strComparableDynamicArray0.remove(2);
        boolean boolean12 = strComparableDynamicArray0.isEmpty();
        int int13 = strComparableDynamicArray0.getSize();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator14 = strComparableDynamicArray0.spliterator();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertNull(strComparable11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(strComparableSpliterator14);
    }

    @Test
    public void test3349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3349");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        boolean boolean4 = strComparableDynamicArray0.isEmpty();
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableDynamicArray0.remove((int) (short) 0);
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator7 = strComparableDynamicArray0.spliterator();
        int int8 = strComparableDynamicArray0.getSize();
        boolean boolean9 = strComparableDynamicArray0.isEmpty();
        strComparableDynamicArray0.put((int) (byte) 10, (java.lang.Comparable<java.lang.String>) "[[hi!, [hi!]]]");
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[, [[hi!]]]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(strComparable6);
        org.junit.Assert.assertNotNull(strComparableSpliterator7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test3350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3350");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableDynamicArray0.isEmpty();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream4 = strComparableDynamicArray0.stream();
        int int5 = strComparableDynamicArray0.getSize();
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableDynamicArray0.remove((int) (byte) 10);
        java.lang.String str8 = strComparableDynamicArray0.toString();
        java.lang.Comparable<java.lang.String> strComparable10 = strComparableDynamicArray0.get((int) (short) 1);
        java.util.Iterator iterator11 = strComparableDynamicArray0.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable13 = strComparableDynamicArray0.remove(5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 16");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(strComparableStream4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(strComparable7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertNull(strComparable10);
        org.junit.Assert.assertNotNull(iterator11);
    }

    @Test
    public void test3351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3351");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        boolean boolean4 = strComparableDynamicArray0.isEmpty();
        boolean boolean5 = strComparableDynamicArray0.isEmpty();
        int int6 = strComparableDynamicArray0.getSize();
        boolean boolean7 = strComparableDynamicArray0.isEmpty();
        int int8 = strComparableDynamicArray0.getSize();
        java.lang.Comparable<java.lang.String> strComparable10 = strComparableDynamicArray0.remove((int) (byte) 0);
        boolean boolean11 = strComparableDynamicArray0.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(strComparable10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test3352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3352");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray1 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>((int) (short) 10);
        strComparableDynamicArray1.add((java.lang.Comparable<java.lang.String>) "[[[[[hi!]]], , [hi!, []], [[hi!]]], [[]]]");
        boolean boolean4 = strComparableDynamicArray1.isEmpty();
        strComparableDynamicArray1.add((java.lang.Comparable<java.lang.String>) "[[], [[], ]]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test3353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3353");
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
        int int21 = strComparableDynamicArray0.getSize();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNull(strComparable8);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertEquals("'" + strComparable16 + "' != '" + "[[], hi!]" + "'", strComparable16, "[[], hi!]");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[hi!, hi!, [, ], [[], hi!]]" + "'", str19, "[hi!, hi!, [, ], [[], hi!]]");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "[hi!, hi!, [, ], [[], hi!]]" + "'", str20, "[hi!, hi!, [, ], [[], hi!]]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4 + "'", int21 == 4);
    }

    @Test
    public void test3354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3354");
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
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream20 = strComparableDynamicArray0.stream();
        java.lang.Comparable<java.lang.String> strComparable22 = null;
        strComparableDynamicArray0.put((int) (byte) 10, strComparable22);
        strComparableDynamicArray0.put((int) (byte) 10, (java.lang.Comparable<java.lang.String>) "[[], hi!, [hi!, hi!, [hi!], [hi!]]]");
        strComparableDynamicArray0.put((int) (short) 10, (java.lang.Comparable<java.lang.String>) "[, []]");
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
        org.junit.Assert.assertNotNull(strComparableStream20);
    }

    @Test
    public void test3355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3355");
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
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream19 = strComparableDynamicArray0.stream();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream20 = strComparableDynamicArray0.stream();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[, [hi!]]");
        org.junit.Assert.assertNotNull(strComparableSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strComparableStream13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertNotNull(strComparableStream19);
        org.junit.Assert.assertNotNull(strComparableStream20);
    }

    @Test
    public void test3356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3356");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable15 = strComparableDynamicArray0.remove(5);
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
        org.junit.Assert.assertNull(strComparable12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test3357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3357");
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
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[hi!, [hi!, hi!]]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertNotNull(strComparableSpliterator5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertNotNull(strComparableSpliterator14);
        org.junit.Assert.assertNotNull(strComparableSpliterator17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[[[[hi!]]], , [hi!, []], [[hi!]]]" + "'", str18, "[[[[hi!]]], , [hi!, []], [[hi!]]]");
    }

    @Test
    public void test3358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3358");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[hi!, []]");
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream5 = strComparableDynamicArray0.stream();
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableDynamicArray0.get((int) (short) 0);
        boolean boolean8 = strComparableDynamicArray0.isEmpty();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream9 = strComparableDynamicArray0.stream();
        java.util.Iterator iterator10 = strComparableDynamicArray0.iterator();
        java.lang.Class<?> wildcardClass11 = strComparableDynamicArray0.getClass();
        org.junit.Assert.assertNotNull(strComparableStream5);
        org.junit.Assert.assertNull(strComparable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strComparableStream9);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3359");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableDynamicArray0.getSize();
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableDynamicArray0.get((int) (byte) 10);
        strComparableDynamicArray0.put((int) (short) 10, (java.lang.Comparable<java.lang.String>) "[]");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator12 = strComparableDynamicArray0.spliterator();
        int int13 = strComparableDynamicArray0.getSize();
        java.lang.Class<?> wildcardClass14 = strComparableDynamicArray0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNull(strComparable8);
        org.junit.Assert.assertNotNull(strComparableSpliterator12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3360");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        boolean boolean3 = strComparableDynamicArray0.isEmpty();
        java.lang.String str4 = strComparableDynamicArray0.toString();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator5 = strComparableDynamicArray0.spliterator();
        java.util.Iterator iterator6 = strComparableDynamicArray0.iterator();
        java.lang.String str7 = strComparableDynamicArray0.toString();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator8 = strComparableDynamicArray0.spliterator();
        java.lang.String str9 = strComparableDynamicArray0.toString();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream10 = strComparableDynamicArray0.stream();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertNotNull(strComparableSpliterator5);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertNotNull(strComparableSpliterator8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertNotNull(strComparableStream10);
    }

    @Test
    public void test3361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3361");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator4 = strComparableDynamicArray0.spliterator();
        strComparableDynamicArray0.put((int) (byte) 10, (java.lang.Comparable<java.lang.String>) "");
        java.util.Iterator iterator8 = strComparableDynamicArray0.iterator();
        java.lang.String str9 = strComparableDynamicArray0.toString();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[hi!, [hi!, hi!, , hi!]]");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator12 = strComparableDynamicArray0.spliterator();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertNotNull(strComparableSpliterator12);
    }

    @Test
    public void test3362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3362");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable13 = strComparableDynamicArray0.remove((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 52 out of bounds for length 16");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
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
    public void test3363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3363");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray1 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>(0);
        java.lang.String str2 = strComparableDynamicArray1.toString();
        boolean boolean3 = strComparableDynamicArray1.isEmpty();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator4 = strComparableDynamicArray1.spliterator();
        int int5 = strComparableDynamicArray1.getSize();
        // The following exception was thrown during execution in test generation
        try {
            strComparableDynamicArray1.add((java.lang.Comparable<java.lang.String>) "[hi!, [], , [[, ], [hi!], [hi!, hi!], [[], hi!]]]");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test3364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3364");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator4 = strComparableDynamicArray0.spliterator();
        int int5 = strComparableDynamicArray0.getSize();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator6 = strComparableDynamicArray0.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator7 = strComparableDynamicArray0.spliterator();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[hi!, [[hi!]]]");
        boolean boolean10 = strComparableDynamicArray0.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator6);
        org.junit.Assert.assertNotNull(strComparableSpliterator7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3365");
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
        java.lang.Comparable<java.lang.String> strComparable13 = strComparableDynamicArray0.get(4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNull(strComparable13);
    }

    @Test
    public void test3366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3366");
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
        int int10 = strComparableDynamicArray0.getSize();
        java.lang.String str11 = strComparableDynamicArray0.toString();
        boolean boolean12 = strComparableDynamicArray0.isEmpty();
        java.lang.Comparable<java.lang.String> strComparable14 = strComparableDynamicArray0.get(1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(strComparable14);
    }

    @Test
    public void test3367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3367");
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
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator22 = strComparableDynamicArray0.spliterator();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(strComparableStream4);
        org.junit.Assert.assertNotNull(strComparableSpliterator5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[hi!, [hi!]]" + "'", str8, "[hi!, [hi!]]");
        org.junit.Assert.assertNotNull(strComparableStream14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator22);
    }

    @Test
    public void test3368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3368");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator4 = strComparableDynamicArray0.spliterator();
        boolean boolean5 = strComparableDynamicArray0.isEmpty();
        boolean boolean6 = strComparableDynamicArray0.isEmpty();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "");
        strComparableDynamicArray0.put(3, (java.lang.Comparable<java.lang.String>) "[hi!, []]");
        java.util.Iterator iterator12 = strComparableDynamicArray0.iterator();
        java.lang.String str13 = strComparableDynamicArray0.toString();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator14 = strComparableDynamicArray0.spliterator();
        java.lang.Class<?> wildcardClass15 = strComparableDynamicArray0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[, [hi!, []]]" + "'", str13, "[, [hi!, []]]");
        org.junit.Assert.assertNotNull(strComparableSpliterator14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3369");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableDynamicArray0.isEmpty();
        java.util.Iterator iterator2 = strComparableDynamicArray0.iterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator3 = strComparableDynamicArray0.spliterator();
        boolean boolean4 = strComparableDynamicArray0.isEmpty();
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableDynamicArray0.add(strComparable5);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertNotNull(strComparableSpliterator3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test3370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3370");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray1 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>(100);
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator2 = strComparableDynamicArray1.spliterator();
        java.util.Iterator iterator3 = strComparableDynamicArray1.iterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator4 = strComparableDynamicArray1.spliterator();
        int int5 = strComparableDynamicArray1.getSize();
        java.lang.Class<?> wildcardClass6 = strComparableDynamicArray1.getClass();
        org.junit.Assert.assertNotNull(strComparableSpliterator2);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3371");
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
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[[[], hi!, , ]]");
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[hi!, hi!, [hi!], [hi!, []]]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3372");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        boolean boolean3 = strComparableDynamicArray0.isEmpty();
        java.lang.String str4 = strComparableDynamicArray0.toString();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator5 = strComparableDynamicArray0.spliterator();
        java.util.Iterator iterator6 = strComparableDynamicArray0.iterator();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream7 = strComparableDynamicArray0.stream();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator8 = strComparableDynamicArray0.spliterator();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[, [[hi!]]]");
        java.lang.String str11 = strComparableDynamicArray0.toString();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertNotNull(strComparableSpliterator5);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertNotNull(strComparableStream7);
        org.junit.Assert.assertNotNull(strComparableSpliterator8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[[, [[hi!]]]]" + "'", str11, "[[, [[hi!]]]]");
    }

    @Test
    public void test3373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3373");
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
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream12 = strComparableDynamicArray0.stream();
        java.lang.String str13 = strComparableDynamicArray0.toString();
        strComparableDynamicArray0.put((int) (short) 1, (java.lang.Comparable<java.lang.String>) "[hi!, [], , [[, ], [hi!], [hi!, hi!], [[], hi!]]]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertNull(strComparable11);
        org.junit.Assert.assertNotNull(strComparableStream12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[]" + "'", str13, "[]");
    }

    @Test
    public void test3374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3374");
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
        boolean boolean11 = strComparableDynamicArray0.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3375");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray1 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>((int) (byte) 10);
        strComparableDynamicArray1.add((java.lang.Comparable<java.lang.String>) "[hi!, []]");
        int int4 = strComparableDynamicArray1.getSize();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream5 = strComparableDynamicArray1.stream();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream6 = strComparableDynamicArray1.stream();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(strComparableStream5);
        org.junit.Assert.assertNotNull(strComparableStream6);
    }

    @Test
    public void test3376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3376");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableDynamicArray0.getSize();
        int int7 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[]");
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "");
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[[, ], [hi!], [hi!, hi!], [[], hi!]]");
        java.lang.String str14 = strComparableDynamicArray0.toString();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream15 = strComparableDynamicArray0.stream();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[hi!, [], , [[, ], [hi!], [hi!, hi!], [[], hi!]]]" + "'", str14, "[hi!, [], , [[, ], [hi!], [hi!, hi!], [[], hi!]]]");
        org.junit.Assert.assertNotNull(strComparableStream15);
    }

    @Test
    public void test3377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3377");
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
        java.lang.Comparable<java.lang.String> strComparable19 = strComparableDynamicArray0.get(2);
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
        org.junit.Assert.assertNull(strComparable19);
    }

    @Test
    public void test3378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3378");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDynamicArray0.put(4, (java.lang.Comparable<java.lang.String>) "[hi!, [hi!, hi!, [, ], [[], hi!]]]");
        strComparableDynamicArray0.put(3, (java.lang.Comparable<java.lang.String>) "[[hi!, []], hi!, ]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test3379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3379");
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
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[hi!, hi!, [, ], [[], hi!]]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertNull(strComparable11);
        org.junit.Assert.assertNotNull(strComparableSpliterator12);
    }

    @Test
    public void test3380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3380");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "");
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDynamicArray0.put((int) (short) 0, (java.lang.Comparable<java.lang.String>) "[]");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator8 = strComparableDynamicArray0.spliterator();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream9 = strComparableDynamicArray0.stream();
        int int10 = strComparableDynamicArray0.getSize();
        boolean boolean11 = strComparableDynamicArray0.isEmpty();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[hi!, hi!, [hi!], [hi!]]");
        java.lang.String str14 = strComparableDynamicArray0.toString();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator15 = strComparableDynamicArray0.spliterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable17 = strComparableDynamicArray0.get((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97 out of bounds for length 16");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strComparableSpliterator8);
        org.junit.Assert.assertNotNull(strComparableStream9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[[], hi!, [hi!, hi!, [hi!], [hi!]]]" + "'", str14, "[[], hi!, [hi!, hi!, [hi!], [hi!]]]");
        org.junit.Assert.assertNotNull(strComparableSpliterator15);
    }

    @Test
    public void test3381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3381");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray1 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>((int) (byte) 10);
        java.util.Iterator iterator2 = strComparableDynamicArray1.iterator();
        int int3 = strComparableDynamicArray1.getSize();
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        // The following exception was thrown during execution in test generation
        try {
            strComparableDynamicArray1.put((int) '#', strComparable5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test3382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3382");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.CharSequence> charSequenceDynamicArray1 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.CharSequence>((int) (short) 0);
    }

    @Test
    public void test3383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3383");
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
        boolean boolean13 = strComparableDynamicArray0.isEmpty();
        java.lang.Comparable<java.lang.String> strComparable15 = strComparableDynamicArray0.remove(4);
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream16 = strComparableDynamicArray0.stream();
        java.util.Iterator iterator17 = strComparableDynamicArray0.iterator();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNull(strComparable8);
        org.junit.Assert.assertNotNull(strComparableStream9);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(strComparable15);
        org.junit.Assert.assertNotNull(strComparableStream16);
        org.junit.Assert.assertNotNull(iterator17);
    }

    @Test
    public void test3384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3384");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        boolean boolean3 = strComparableDynamicArray0.isEmpty();
        java.lang.String str4 = strComparableDynamicArray0.toString();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator5 = strComparableDynamicArray0.spliterator();
        java.util.Iterator iterator6 = strComparableDynamicArray0.iterator();
        java.lang.String str7 = strComparableDynamicArray0.toString();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator8 = strComparableDynamicArray0.spliterator();
        boolean boolean9 = strComparableDynamicArray0.isEmpty();
        java.lang.Comparable<java.lang.String> strComparable11 = strComparableDynamicArray0.remove(4);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertNotNull(strComparableSpliterator5);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertNotNull(strComparableSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(strComparable11);
    }

    @Test
    public void test3385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3385");
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
        java.lang.String str13 = strComparableDynamicArray0.toString();
        java.lang.String str14 = strComparableDynamicArray0.toString();
        java.lang.Comparable<java.lang.String> strComparable16 = strComparableDynamicArray0.get(1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNull(strComparable8);
        org.junit.Assert.assertNotNull(strComparableStream9);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[hi!]" + "'", str13, "[hi!]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[hi!]" + "'", str14, "[hi!]");
        org.junit.Assert.assertEquals("'" + strComparable16 + "' != '" + "hi!" + "'", strComparable16, "hi!");
    }

    @Test
    public void test3386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3386");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "");
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDynamicArray0.put((int) (short) 0, (java.lang.Comparable<java.lang.String>) "[]");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator8 = strComparableDynamicArray0.spliterator();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream9 = strComparableDynamicArray0.stream();
        int int10 = strComparableDynamicArray0.getSize();
        boolean boolean11 = strComparableDynamicArray0.isEmpty();
        boolean boolean12 = strComparableDynamicArray0.isEmpty();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[[], hi!, , ]");
        // The following exception was thrown during execution in test generation
        try {
            strComparableDynamicArray0.put((int) 'a', (java.lang.Comparable<java.lang.String>) "[hi!, [[hi!]]]");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97 out of bounds for length 16");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strComparableSpliterator8);
        org.junit.Assert.assertNotNull(strComparableStream9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3387");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableDynamicArray0.getSize();
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableDynamicArray0.get((int) (byte) 10);
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream9 = strComparableDynamicArray0.stream();
        java.util.Iterator iterator10 = strComparableDynamicArray0.iterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator11 = strComparableDynamicArray0.spliterator();
        java.lang.String str12 = strComparableDynamicArray0.toString();
        java.lang.Comparable<java.lang.String> strComparable14 = strComparableDynamicArray0.get((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNull(strComparable8);
        org.junit.Assert.assertNotNull(strComparableStream9);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertNotNull(strComparableSpliterator11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[hi!]" + "'", str12, "[hi!]");
        org.junit.Assert.assertNull(strComparable14);
    }

    @Test
    public void test3388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3388");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator4 = strComparableDynamicArray0.spliterator();
        boolean boolean5 = strComparableDynamicArray0.isEmpty();
        boolean boolean6 = strComparableDynamicArray0.isEmpty();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "");
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean11 = strComparableDynamicArray0.isEmpty();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[hi!, [hi!], [hi!, hi!], [[], hi!]]");
        int int14 = strComparableDynamicArray0.getSize();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
    }

    @Test
    public void test3389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3389");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        boolean boolean4 = strComparableDynamicArray0.isEmpty();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream7 = strComparableDynamicArray0.stream();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator8 = strComparableDynamicArray0.spliterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable10 = strComparableDynamicArray0.get((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 16");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strComparableStream7);
        org.junit.Assert.assertNotNull(strComparableSpliterator8);
    }

    @Test
    public void test3390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3390");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray1 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>(100);
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream2 = strComparableDynamicArray1.stream();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator3 = strComparableDynamicArray1.spliterator();
        org.junit.Assert.assertNotNull(strComparableStream2);
        org.junit.Assert.assertNotNull(strComparableSpliterator3);
    }

    @Test
    public void test3391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3391");
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
        strComparableDynamicArray0.put((int) (byte) 1, (java.lang.Comparable<java.lang.String>) "[, [[, ]]]");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable19 = strComparableDynamicArray0.remove((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 16");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNull(strComparable8);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertNull(strComparable13);
        org.junit.Assert.assertNotNull(iterator14);
    }

    @Test
    public void test3392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3392");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "");
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDynamicArray0.put((int) (short) 0, (java.lang.Comparable<java.lang.String>) "[]");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator8 = strComparableDynamicArray0.spliterator();
        strComparableDynamicArray0.put(10, (java.lang.Comparable<java.lang.String>) "");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator12 = strComparableDynamicArray0.spliterator();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream13 = strComparableDynamicArray0.stream();
        org.junit.Assert.assertNotNull(strComparableSpliterator8);
        org.junit.Assert.assertNotNull(strComparableSpliterator12);
        org.junit.Assert.assertNotNull(strComparableStream13);
    }

    @Test
    public void test3393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3393");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream6 = strComparableDynamicArray0.stream();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream7 = strComparableDynamicArray0.stream();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator8 = strComparableDynamicArray0.spliterator();
        java.lang.String str9 = strComparableDynamicArray0.toString();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream10 = strComparableDynamicArray0.stream();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableStream6);
        org.junit.Assert.assertNotNull(strComparableStream7);
        org.junit.Assert.assertNotNull(strComparableSpliterator8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[hi!]" + "'", str9, "[hi!]");
        org.junit.Assert.assertNotNull(strComparableStream10);
    }

    @Test
    public void test3394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3394");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableDynamicArray0.isEmpty();
        java.lang.String str2 = strComparableDynamicArray0.toString();
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDynamicArray0.add(strComparable3);
        java.util.Iterator iterator5 = strComparableDynamicArray0.iterator();
        boolean boolean6 = strComparableDynamicArray0.isEmpty();
        java.util.Iterator iterator7 = strComparableDynamicArray0.iterator();
        boolean boolean8 = strComparableDynamicArray0.isEmpty();
        int int9 = strComparableDynamicArray0.getSize();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test3395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3395");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray1 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>((int) (short) 10);
        strComparableDynamicArray1.add((java.lang.Comparable<java.lang.String>) "[, ]");
        boolean boolean4 = strComparableDynamicArray1.isEmpty();
        boolean boolean5 = strComparableDynamicArray1.isEmpty();
        java.lang.String str6 = strComparableDynamicArray1.toString();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[[, ]]" + "'", str6, "[[, ]]");
    }

    @Test
    public void test3396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3396");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableDynamicArray0.isEmpty();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[hi!]");
        int int6 = strComparableDynamicArray0.getSize();
        int int7 = strComparableDynamicArray0.getSize();
        java.lang.Comparable<java.lang.String> strComparable9 = null;
        strComparableDynamicArray0.put((int) (short) 1, strComparable9);
        int int11 = strComparableDynamicArray0.getSize();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
    }

    @Test
    public void test3397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3397");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableDynamicArray0.getSize();
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableDynamicArray0.get((int) (byte) 10);
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream9 = strComparableDynamicArray0.stream();
        java.util.Iterator iterator10 = strComparableDynamicArray0.iterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator11 = strComparableDynamicArray0.spliterator();
        boolean boolean12 = strComparableDynamicArray0.isEmpty();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream13 = strComparableDynamicArray0.stream();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream14 = strComparableDynamicArray0.stream();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNull(strComparable8);
        org.junit.Assert.assertNotNull(strComparableStream9);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertNotNull(strComparableSpliterator11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strComparableStream13);
        org.junit.Assert.assertNotNull(strComparableStream14);
    }

    @Test
    public void test3398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3398");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        boolean boolean4 = strComparableDynamicArray0.isEmpty();
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableDynamicArray0.remove((int) (short) 0);
        java.util.Iterator iterator7 = strComparableDynamicArray0.iterator();
        boolean boolean8 = strComparableDynamicArray0.isEmpty();
        java.lang.Comparable<java.lang.String> strComparable9 = null;
        strComparableDynamicArray0.add(strComparable9);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(strComparable6);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test3399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3399");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        boolean boolean3 = strComparableDynamicArray0.isEmpty();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[]");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator6 = strComparableDynamicArray0.spliterator();
        java.util.Iterator iterator7 = strComparableDynamicArray0.iterator();
        boolean boolean8 = strComparableDynamicArray0.isEmpty();
        boolean boolean9 = strComparableDynamicArray0.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator6);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3400");
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
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream17 = strComparableDynamicArray0.stream();
        int int18 = strComparableDynamicArray0.getSize();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNull(strComparable8);
        org.junit.Assert.assertNotNull(strComparableStream9);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(strComparable13);
        org.junit.Assert.assertNotNull(strComparableSpliterator14);
        org.junit.Assert.assertNull(strComparable16);
        org.junit.Assert.assertNotNull(strComparableStream17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test3401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3401");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.io.Serializable> serializableDynamicArray1 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.io.Serializable>(10);
    }

    @Test
    public void test3402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3402");
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
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator14 = strComparableDynamicArray0.spliterator();
        java.lang.String str15 = strComparableDynamicArray0.toString();
        strComparableDynamicArray0.put(0, (java.lang.Comparable<java.lang.String>) "[[hi!, [hi!]], , []]");
        strComparableDynamicArray0.put(0, (java.lang.Comparable<java.lang.String>) "[[], ]");
        java.lang.String str22 = strComparableDynamicArray0.toString();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(strComparableStream4);
        org.junit.Assert.assertNotNull(strComparableSpliterator5);
        org.junit.Assert.assertEquals("'" + strComparable9 + "' != '" + "[hi!]" + "'", strComparable9, "[hi!]");
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[hi!, ]" + "'", str15, "[hi!, ]");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "[[[], ], ]" + "'", str22, "[[[], ], ]");
    }

    @Test
    public void test3403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3403");
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
        java.lang.Comparable<java.lang.String> strComparable18 = strComparableDynamicArray0.remove((int) (byte) 10);
        java.util.Iterator iterator19 = strComparableDynamicArray0.iterator();
        java.lang.Comparable<java.lang.String> strComparable21 = strComparableDynamicArray0.get(10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNull(strComparable8);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertEquals("'" + strComparable16 + "' != '" + "[[], hi!]" + "'", strComparable16, "[[], hi!]");
        org.junit.Assert.assertEquals("'" + strComparable18 + "' != '" + "[[], hi!]" + "'", strComparable18, "[[], hi!]");
        org.junit.Assert.assertNotNull(iterator19);
        org.junit.Assert.assertEquals("'" + strComparable21 + "' != '" + "[[], hi!]" + "'", strComparable21, "[[], hi!]");
    }

    @Test
    public void test3404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3404");
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
        java.util.Iterator iterator13 = strComparableDynamicArray0.iterator();
        java.lang.Comparable<java.lang.String> strComparable15 = strComparableDynamicArray0.get(6);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNull(strComparable7);
        org.junit.Assert.assertNotNull(strComparableSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertNull(strComparable15);
    }

    @Test
    public void test3405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3405");
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
        java.lang.Comparable<java.lang.String> strComparable24 = strComparableDynamicArray0.remove((int) (short) 10);
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
        org.junit.Assert.assertNull(strComparable24);
    }

    @Test
    public void test3406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3406");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        boolean boolean3 = strComparableDynamicArray0.isEmpty();
        java.lang.String str4 = strComparableDynamicArray0.toString();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableDynamicArray0.isEmpty();
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableDynamicArray0.remove(1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + strComparable9 + "' != '" + "hi!" + "'", strComparable9, "hi!");
    }

    @Test
    public void test3407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3407");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableDynamicArray0.isEmpty();
        java.util.Iterator iterator2 = strComparableDynamicArray0.iterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator3 = strComparableDynamicArray0.spliterator();
        java.lang.String str4 = strComparableDynamicArray0.toString();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[hi!, [], [hi!]]");
        java.util.Iterator iterator7 = strComparableDynamicArray0.iterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator8 = strComparableDynamicArray0.spliterator();
        java.lang.Comparable<java.lang.String> strComparable10 = strComparableDynamicArray0.get(10);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertNotNull(strComparableSpliterator3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(strComparableSpliterator8);
        org.junit.Assert.assertNull(strComparable10);
    }

    @Test
    public void test3408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3408");
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
        int int15 = strComparableDynamicArray0.getSize();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[hi!]" + "'", str10, "[hi!]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertNull(strComparable13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[hi!]" + "'", str14, "[hi!]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
    }

    @Test
    public void test3409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3409");
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
        int int17 = strComparableDynamicArray0.getSize();
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
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test3410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3410");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        boolean boolean3 = strComparableDynamicArray0.isEmpty();
        java.lang.String str4 = strComparableDynamicArray0.toString();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator5 = strComparableDynamicArray0.spliterator();
        java.util.Iterator iterator6 = strComparableDynamicArray0.iterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator7 = strComparableDynamicArray0.spliterator();
        strComparableDynamicArray0.put((int) (short) 0, (java.lang.Comparable<java.lang.String>) "[hi!, [hi!]]");
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream11 = strComparableDynamicArray0.stream();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertNotNull(strComparableSpliterator5);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertNotNull(strComparableSpliterator7);
        org.junit.Assert.assertNotNull(strComparableStream11);
    }

    @Test
    public void test3411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3411");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "");
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDynamicArray0.put((int) (short) 0, (java.lang.Comparable<java.lang.String>) "[]");
        int int8 = strComparableDynamicArray0.getSize();
        java.lang.String str9 = strComparableDynamicArray0.toString();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator10 = strComparableDynamicArray0.spliterator();
        java.lang.String str11 = strComparableDynamicArray0.toString();
        java.lang.String str12 = strComparableDynamicArray0.toString();
        java.lang.String str13 = strComparableDynamicArray0.toString();
        strComparableDynamicArray0.put(5, (java.lang.Comparable<java.lang.String>) "[hi!, [[[[hi!]]], , [hi!, []], [[hi!]]]]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[[], hi!]" + "'", str9, "[[], hi!]");
        org.junit.Assert.assertNotNull(strComparableSpliterator10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[[], hi!]" + "'", str11, "[[], hi!]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[[], hi!]" + "'", str12, "[[], hi!]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[[], hi!]" + "'", str13, "[[], hi!]");
    }

    @Test
    public void test3412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3412");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableDynamicArray0.isEmpty();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream2 = strComparableDynamicArray0.stream();
        java.lang.Comparable<java.lang.String> strComparable4 = strComparableDynamicArray0.get(1);
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator iterator7 = strComparableDynamicArray0.iterator();
        strComparableDynamicArray0.put((int) (byte) 10, (java.lang.Comparable<java.lang.String>) "[, []]");
        strComparableDynamicArray0.put(0, (java.lang.Comparable<java.lang.String>) "[[[hi!, hi!, [hi!], [hi!]], ]]");
        java.lang.Class<?> wildcardClass14 = strComparableDynamicArray0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(strComparableStream2);
        org.junit.Assert.assertNull(strComparable4);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3413");
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
        java.lang.Comparable<java.lang.String> strComparable20 = strComparableDynamicArray0.get((int) (byte) 0);
        java.lang.Comparable<java.lang.String> strComparable22 = strComparableDynamicArray0.remove(1);
        java.util.Iterator iterator23 = strComparableDynamicArray0.iterator();
        java.lang.Comparable<java.lang.String> strComparable25 = strComparableDynamicArray0.remove((int) (short) 10);
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator26 = strComparableDynamicArray0.spliterator();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNull(strComparable8);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertNotNull(strComparableStream12);
        org.junit.Assert.assertEquals("'" + strComparable14 + "' != '" + "hi!" + "'", strComparable14, "hi!");
        org.junit.Assert.assertNotNull(strComparableStream15);
        org.junit.Assert.assertNotNull(iterator18);
        org.junit.Assert.assertNull(strComparable20);
        org.junit.Assert.assertEquals("'" + strComparable22 + "' != '" + "hi!" + "'", strComparable22, "hi!");
        org.junit.Assert.assertNotNull(iterator23);
        org.junit.Assert.assertNull(strComparable25);
        org.junit.Assert.assertNotNull(strComparableSpliterator26);
    }

    @Test
    public void test3414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3414");
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
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[[, [[hi!]]], [hi!, hi!]]");
        int int20 = strComparableDynamicArray0.getSize();
        int int21 = strComparableDynamicArray0.getSize();
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
    }

    @Test
    public void test3415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3415");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableDynamicArray0.isEmpty();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream2 = strComparableDynamicArray0.stream();
        java.lang.Comparable<java.lang.String> strComparable4 = strComparableDynamicArray0.get(1);
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableDynamicArray0.remove(10);
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[[[], [hi!, hi!, [hi!], [hi!]]], hi!, hi!, [hi!], [hi!]]");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator11 = strComparableDynamicArray0.spliterator();
        java.lang.Class<?> wildcardClass12 = strComparableSpliterator11.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(strComparableStream2);
        org.junit.Assert.assertNull(strComparable4);
        org.junit.Assert.assertNull(strComparable8);
        org.junit.Assert.assertNotNull(strComparableSpliterator11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3416");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray1 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>((int) '4');
        java.util.Iterator iterator2 = strComparableDynamicArray1.iterator();
        boolean boolean3 = strComparableDynamicArray1.isEmpty();
        java.lang.String str4 = strComparableDynamicArray1.toString();
        java.util.Iterator iterator5 = strComparableDynamicArray1.iterator();
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertNotNull(iterator5);
    }

    @Test
    public void test3417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3417");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream6 = strComparableDynamicArray0.stream();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream7 = strComparableDynamicArray0.stream();
        int int8 = strComparableDynamicArray0.getSize();
        java.util.Iterator iterator9 = strComparableDynamicArray0.iterator();
        java.lang.Comparable<java.lang.String> strComparable11 = strComparableDynamicArray0.remove((int) (byte) 1);
        java.lang.String str12 = strComparableDynamicArray0.toString();
        java.lang.Class<?> wildcardClass13 = strComparableDynamicArray0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableStream6);
        org.junit.Assert.assertNotNull(strComparableStream7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertEquals("'" + strComparable11 + "' != '" + "hi!" + "'", strComparable11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[]" + "'", str12, "[]");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3418");
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
        java.lang.Comparable<java.lang.String> strComparable20 = strComparableDynamicArray0.remove(2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNull(strComparable8);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(strComparable17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(strComparable20);
    }

    @Test
    public void test3419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3419");
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
        java.util.Iterator iterator15 = strComparableDynamicArray0.iterator();
        java.lang.Comparable<java.lang.String> strComparable17 = strComparableDynamicArray0.remove((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            strComparableDynamicArray0.put((int) (short) 100, (java.lang.Comparable<java.lang.String>) "[, [hi!, hi!]]");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 16");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNull(strComparable8);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertNull(strComparable17);
    }

    @Test
    public void test3420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3420");
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
        java.lang.Comparable<java.lang.String> strComparable13 = strComparableDynamicArray0.get(3);
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator14 = strComparableDynamicArray0.spliterator();
        int int15 = strComparableDynamicArray0.getSize();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNull(strComparable7);
        org.junit.Assert.assertNotNull(strComparableSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(strComparable13);
        org.junit.Assert.assertNotNull(strComparableSpliterator14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test3421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3421");
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
        strComparableDynamicArray0.put((int) (byte) 10, (java.lang.Comparable<java.lang.String>) "[[], hi!, [hi!, [], hi!], ]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNull(strComparable8);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertNotNull(strComparableStream12);
        org.junit.Assert.assertEquals("'" + strComparable14 + "' != '" + "hi!" + "'", strComparable14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3422");
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
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[[], hi!, [hi!, hi!, [hi!], [hi!]]]");
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[[[], hi!]]");
        java.lang.String str19 = strComparableDynamicArray0.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNull(strComparable8);
        org.junit.Assert.assertNotNull(strComparableStream9);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[hi!]" + "'", str12, "[hi!]");
        org.junit.Assert.assertNotNull(strComparableStream13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[hi!, [[], hi!, [hi!, hi!, [hi!], [hi!]]], [[[], hi!]]]" + "'", str19, "[hi!, [[], hi!, [hi!, hi!, [hi!], [hi!]]], [[[], hi!]]]");
    }

    @Test
    public void test3423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3423");
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
        java.lang.String str12 = strComparableDynamicArray0.toString();
        java.lang.Comparable<java.lang.String> strComparable14 = strComparableDynamicArray0.get((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(strComparableStream9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[]" + "'", str12, "[]");
        org.junit.Assert.assertNull(strComparable14);
    }

    @Test
    public void test3424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3424");
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.io.Serializable> serializableDynamicArray1 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.io.Serializable>((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3425");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.reflect.Type> typeDynamicArray1 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.reflect.Type>(5);
    }

    @Test
    public void test3426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3426");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        boolean boolean4 = strComparableDynamicArray0.isEmpty();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream7 = strComparableDynamicArray0.stream();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator8 = strComparableDynamicArray0.spliterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable10 = strComparableDynamicArray0.get((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 52 out of bounds for length 16");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strComparableStream7);
        org.junit.Assert.assertNotNull(strComparableSpliterator8);
    }

    @Test
    public void test3427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3427");
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
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator13 = strComparableDynamicArray0.spliterator();
        strComparableDynamicArray0.put(1, (java.lang.Comparable<java.lang.String>) "[hi!, [[[[hi!]]], , [hi!, []], [[hi!]]]]");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable18 = strComparableDynamicArray0.get((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 32 out of bounds for length 16");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[hi!, []]" + "'", str10, "[hi!, []]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[hi!, []]" + "'", str11, "[hi!, []]");
        org.junit.Assert.assertNotNull(strComparableStream12);
        org.junit.Assert.assertNotNull(strComparableSpliterator13);
    }

    @Test
    public void test3428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3428");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableDynamicArray0.isEmpty();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str4 = strComparableDynamicArray0.toString();
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableDynamicArray0.get(10);
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator7 = strComparableDynamicArray0.spliterator();
        java.lang.Comparable<java.lang.String> strComparable8 = null;
        strComparableDynamicArray0.add(strComparable8);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[hi!]" + "'", str4, "[hi!]");
        org.junit.Assert.assertNull(strComparable6);
        org.junit.Assert.assertNotNull(strComparableSpliterator7);
    }

    @Test
    public void test3429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3429");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableDynamicArray0.isEmpty();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream4 = strComparableDynamicArray0.stream();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator5 = strComparableDynamicArray0.spliterator();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[hi!]");
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableDynamicArray0.remove((int) (short) 1);
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "");
        int int12 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.put((int) (byte) 10, (java.lang.Comparable<java.lang.String>) "[[[], hi!, , ]]");
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[[[[[[hi!]]], , [hi!, []], [[hi!]]], [[]]], hi!, ]");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(strComparableStream4);
        org.junit.Assert.assertNotNull(strComparableSpliterator5);
        org.junit.Assert.assertEquals("'" + strComparable9 + "' != '" + "[hi!]" + "'", strComparable9, "[hi!]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
    }

    @Test
    public void test3430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3430");
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
        java.lang.Comparable<java.lang.String> strComparable18 = strComparableDynamicArray0.remove((int) (short) 0);
        java.lang.Comparable<java.lang.String> strComparable20 = strComparableDynamicArray0.get(1);
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
        org.junit.Assert.assertNull(strComparable18);
        org.junit.Assert.assertNull(strComparable20);
    }

    @Test
    public void test3431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3431");
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
        java.util.Iterator iterator21 = strComparableDynamicArray0.iterator();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(strComparable12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[]" + "'", str14, "[]");
        org.junit.Assert.assertNotNull(strComparableSpliterator15);
        org.junit.Assert.assertNotNull(iterator21);
    }

    @Test
    public void test3432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3432");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray1 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>((int) (byte) 10);
        strComparableDynamicArray1.put((int) (byte) 1, (java.lang.Comparable<java.lang.String>) "[[hi!]]");
        java.lang.String str5 = strComparableDynamicArray1.toString();
        java.lang.String str6 = strComparableDynamicArray1.toString();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream7 = strComparableDynamicArray1.stream();
        java.util.Iterator iterator8 = strComparableDynamicArray1.iterator();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream9 = strComparableDynamicArray1.stream();
        java.lang.String str10 = strComparableDynamicArray1.toString();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream11 = strComparableDynamicArray1.stream();
        int int12 = strComparableDynamicArray1.getSize();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[[[hi!]]]" + "'", str5, "[[[hi!]]]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[[[hi!]]]" + "'", str6, "[[[hi!]]]");
        org.junit.Assert.assertNotNull(strComparableStream7);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(strComparableStream9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[[[hi!]]]" + "'", str10, "[[[hi!]]]");
        org.junit.Assert.assertNotNull(strComparableStream11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test3433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3433");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "");
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream3 = strComparableDynamicArray0.stream();
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableDynamicArray0.get((int) (short) 0);
        java.lang.String str6 = strComparableDynamicArray0.toString();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream7 = strComparableDynamicArray0.stream();
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableDynamicArray0.get(0);
        // The following exception was thrown during execution in test generation
        try {
            strComparableDynamicArray0.put((int) '4', (java.lang.Comparable<java.lang.String>) "[[[[hi!, hi!, [hi!], [hi!]], ]]]");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 52 out of bounds for length 16");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strComparableStream3);
        org.junit.Assert.assertEquals("'" + strComparable5 + "' != '" + "" + "'", strComparable5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
        org.junit.Assert.assertNotNull(strComparableStream7);
        org.junit.Assert.assertEquals("'" + strComparable9 + "' != '" + "" + "'", strComparable9, "");
    }

    @Test
    public void test3434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3434");
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
        boolean boolean12 = strComparableDynamicArray0.isEmpty();
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test3435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3435");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        boolean boolean4 = strComparableDynamicArray0.isEmpty();
        boolean boolean5 = strComparableDynamicArray0.isEmpty();
        boolean boolean6 = strComparableDynamicArray0.isEmpty();
        int int7 = strComparableDynamicArray0.getSize();
        boolean boolean8 = strComparableDynamicArray0.isEmpty();
        java.lang.String str9 = strComparableDynamicArray0.toString();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator10 = strComparableDynamicArray0.spliterator();
        boolean boolean11 = strComparableDynamicArray0.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertNotNull(strComparableSpliterator10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3436");
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
        java.lang.String str14 = strComparableDynamicArray0.toString();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[, [[hi!]]]");
        int int17 = strComparableDynamicArray0.getSize();
        int int18 = strComparableDynamicArray0.getSize();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(strComparable6);
        org.junit.Assert.assertNotNull(strComparableSpliterator7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[[hi!, hi!]]" + "'", str14, "[[hi!, hi!]]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test3437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3437");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable18 = strComparableDynamicArray0.get((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 16");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNull(strComparable8);
        org.junit.Assert.assertNotNull(strComparableSpliterator14);
        org.junit.Assert.assertNotNull(strComparableSpliterator15);
        org.junit.Assert.assertNotNull(strComparableStream16);
    }

    @Test
    public void test3438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3438");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "");
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator5 = strComparableDynamicArray0.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator6 = strComparableDynamicArray0.spliterator();
        int int7 = strComparableDynamicArray0.getSize();
        int int8 = strComparableDynamicArray0.getSize();
        java.lang.Class<?> wildcardClass9 = strComparableDynamicArray0.getClass();
        org.junit.Assert.assertNotNull(strComparableSpliterator5);
        org.junit.Assert.assertNotNull(strComparableSpliterator6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3439");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        boolean boolean4 = strComparableDynamicArray0.isEmpty();
        boolean boolean5 = strComparableDynamicArray0.isEmpty();
        boolean boolean6 = strComparableDynamicArray0.isEmpty();
        int int7 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[[, ]]");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable11 = strComparableDynamicArray0.get((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 52 out of bounds for length 16");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test3440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3440");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator4 = strComparableDynamicArray0.spliterator();
        java.util.Iterator iterator5 = strComparableDynamicArray0.iterator();
        java.util.Iterator iterator6 = strComparableDynamicArray0.iterator();
        int int7 = strComparableDynamicArray0.getSize();
        boolean boolean8 = strComparableDynamicArray0.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3441");
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
        // The following exception was thrown during execution in test generation
        try {
            strComparableDynamicArray0.put((int) (byte) -1, (java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 16");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[hi!, []]" + "'", str11, "[hi!, []]");
        org.junit.Assert.assertNotNull(strComparableSpliterator12);
        org.junit.Assert.assertNotNull(strComparableStream16);
        org.junit.Assert.assertNull(strComparable18);
    }

    @Test
    public void test3442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3442");
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
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[[[[[hi!]]], , [hi!, []], [[hi!]]], [[hi!, [hi!]]]]");
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
    public void test3443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3443");
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
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream10 = strComparableDynamicArray0.stream();
        java.lang.Comparable<java.lang.String> strComparable12 = strComparableDynamicArray0.get((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = strComparable12.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNotNull(strComparableStream10);
        org.junit.Assert.assertNull(strComparable12);
    }

    @Test
    public void test3444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3444");
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
        java.lang.Class<?> wildcardClass11 = strComparableSpliterator10.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableStream6);
        org.junit.Assert.assertNotNull(strComparableStream7);
        org.junit.Assert.assertNotNull(strComparableSpliterator8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertNotNull(strComparableSpliterator10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3445");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator4 = strComparableDynamicArray0.spliterator();
        strComparableDynamicArray0.put((int) (byte) 10, (java.lang.Comparable<java.lang.String>) "");
        java.util.Iterator iterator8 = strComparableDynamicArray0.iterator();
        java.lang.String str9 = strComparableDynamicArray0.toString();
        java.lang.Comparable<java.lang.String> strComparable11 = strComparableDynamicArray0.remove(2);
        int int12 = strComparableDynamicArray0.getSize();
        java.util.Iterator iterator13 = strComparableDynamicArray0.iterator();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[[[], hi!, , ], hi!]");
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[, [hi!, hi!]]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertNull(strComparable11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(iterator13);
    }

    @Test
    public void test3446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3446");
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
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[hi!, []]");
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[hi!, []]");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator24 = strComparableDynamicArray0.spliterator();
        int int25 = strComparableDynamicArray0.getSize();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNull(strComparable8);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertNull(strComparable13);
        org.junit.Assert.assertNull(strComparable15);
        org.junit.Assert.assertNotNull(strComparableStream18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[hi!, hi!, [hi!]]" + "'", str19, "[hi!, hi!, [hi!]]");
        org.junit.Assert.assertNotNull(strComparableSpliterator24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 6 + "'", int25 == 6);
    }

    @Test
    public void test3447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3447");
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
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream11 = strComparableDynamicArray0.stream();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream12 = strComparableDynamicArray0.stream();
        // The following exception was thrown during execution in test generation
        try {
            strComparableDynamicArray0.put((int) (byte) -1, (java.lang.Comparable<java.lang.String>) "[[hi!, hi!, [hi!], [hi!]], [hi!, hi!, [[hi!, hi!, [hi!]]]]]");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 16");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertNotNull(strComparableStream11);
        org.junit.Assert.assertNotNull(strComparableStream12);
    }

    @Test
    public void test3448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3448");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        boolean boolean4 = strComparableDynamicArray0.isEmpty();
        boolean boolean5 = strComparableDynamicArray0.isEmpty();
        int int6 = strComparableDynamicArray0.getSize();
        java.lang.String str7 = strComparableDynamicArray0.toString();
        java.lang.Class<?> wildcardClass8 = strComparableDynamicArray0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3449");
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
        boolean boolean14 = strComparableDynamicArray0.isEmpty();
        int int15 = strComparableDynamicArray0.getSize();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator16 = strComparableDynamicArray0.spliterator();
        int int17 = strComparableDynamicArray0.getSize();
        java.lang.Comparable<java.lang.String> strComparable19 = strComparableDynamicArray0.get(10);
        int int20 = strComparableDynamicArray0.getSize();
        java.util.Iterator iterator21 = strComparableDynamicArray0.iterator();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNull(strComparable8);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertNotNull(strComparableStream12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertNotNull(strComparableSpliterator16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertNull(strComparable19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertNotNull(iterator21);
    }

    @Test
    public void test3450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3450");
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
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream13 = strComparableDynamicArray0.stream();
        java.lang.String str14 = strComparableDynamicArray0.toString();
        java.util.Iterator iterator15 = strComparableDynamicArray0.iterator();
        java.lang.Class<?> wildcardClass16 = iterator15.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertNotNull(strComparableSpliterator5);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertNull(strComparable8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertNotNull(strComparableStream12);
        org.junit.Assert.assertNotNull(strComparableStream13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[[, ]]" + "'", str14, "[[, ]]");
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3451");
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
        int int18 = strComparableDynamicArray0.getSize();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[[hi!]]" + "'", str13, "[[hi!]]");
        org.junit.Assert.assertNotNull(strComparableStream17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test3452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3452");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator4 = strComparableDynamicArray0.spliterator();
        strComparableDynamicArray0.put((int) (byte) 10, (java.lang.Comparable<java.lang.String>) "");
        java.util.Iterator iterator8 = strComparableDynamicArray0.iterator();
        java.lang.String str9 = strComparableDynamicArray0.toString();
        java.lang.Comparable<java.lang.String> strComparable11 = strComparableDynamicArray0.remove(2);
        boolean boolean12 = strComparableDynamicArray0.isEmpty();
        java.util.Iterator iterator13 = strComparableDynamicArray0.iterator();
        java.util.Iterator iterator14 = strComparableDynamicArray0.iterator();
        java.lang.Class<?> wildcardClass15 = iterator14.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertNull(strComparable11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3453");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableDynamicArray0.getSize();
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableDynamicArray0.get((int) (byte) 10);
        strComparableDynamicArray0.put((int) (short) 10, (java.lang.Comparable<java.lang.String>) "[]");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator12 = strComparableDynamicArray0.spliterator();
        int int13 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[[], hi!, [[hi!]]]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNull(strComparable8);
        org.junit.Assert.assertNotNull(strComparableSpliterator12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
    }

    @Test
    public void test3454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3454");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray1 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>((int) (byte) 0);
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator2 = strComparableDynamicArray1.spliterator();
        boolean boolean3 = strComparableDynamicArray1.isEmpty();
        java.lang.String str4 = strComparableDynamicArray1.toString();
        java.lang.Class<?> wildcardClass5 = strComparableDynamicArray1.getClass();
        org.junit.Assert.assertNotNull(strComparableSpliterator2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3455");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        boolean boolean3 = strComparableDynamicArray0.isEmpty();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[]");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator6 = strComparableDynamicArray0.spliterator();
        int int7 = strComparableDynamicArray0.getSize();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream8 = strComparableDynamicArray0.stream();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNotNull(strComparableStream8);
    }

    @Test
    public void test3456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3456");
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
        strComparableDynamicArray0.put((int) (short) 0, (java.lang.Comparable<java.lang.String>) "[[hi!, []]]");
        boolean boolean18 = strComparableDynamicArray0.isEmpty();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator19 = strComparableDynamicArray0.spliterator();
        java.util.Iterator iterator20 = strComparableDynamicArray0.iterator();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertNotNull(strComparableSpliterator14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator19);
        org.junit.Assert.assertNotNull(iterator20);
    }

    @Test
    public void test3457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3457");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator iterator6 = strComparableDynamicArray0.iterator();
        boolean boolean7 = strComparableDynamicArray0.isEmpty();
        java.lang.String str8 = strComparableDynamicArray0.toString();
        java.lang.Comparable<java.lang.String> strComparable10 = strComparableDynamicArray0.get(2);
        java.lang.String str11 = strComparableDynamicArray0.toString();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator12 = strComparableDynamicArray0.spliterator();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[hi!]" + "'", str8, "[hi!]");
        org.junit.Assert.assertNull(strComparable10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[hi!]" + "'", str11, "[hi!]");
        org.junit.Assert.assertNotNull(strComparableSpliterator12);
    }

    @Test
    public void test3458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3458");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableDynamicArray0.isEmpty();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator2 = strComparableDynamicArray0.spliterator();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream3 = strComparableDynamicArray0.stream();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator4 = strComparableDynamicArray0.spliterator();
        boolean boolean5 = strComparableDynamicArray0.isEmpty();
        boolean boolean6 = strComparableDynamicArray0.isEmpty();
        int int7 = strComparableDynamicArray0.getSize();
        boolean boolean8 = strComparableDynamicArray0.isEmpty();
        int int9 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[hi!, [hi!]]");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator12 = strComparableDynamicArray0.spliterator();
        int int13 = strComparableDynamicArray0.getSize();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(strComparableSpliterator2);
        org.junit.Assert.assertNotNull(strComparableStream3);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(strComparableSpliterator12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test3459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3459");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        boolean boolean4 = strComparableDynamicArray0.isEmpty();
        boolean boolean5 = strComparableDynamicArray0.isEmpty();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator6 = strComparableDynamicArray0.spliterator();
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableDynamicArray0.get(5);
        java.lang.Class<?> wildcardClass9 = strComparableDynamicArray0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator6);
        org.junit.Assert.assertNull(strComparable8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3460");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable21 = strComparableDynamicArray0.get(100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 16");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strComparableSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strComparableStream13);
    }

    @Test
    public void test3461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3461");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray1 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>((int) (byte) 1);
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream2 = strComparableDynamicArray1.stream();
        java.lang.Class<?> wildcardClass3 = strComparableDynamicArray1.getClass();
        org.junit.Assert.assertNotNull(strComparableStream2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test3462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3462");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator4 = strComparableDynamicArray0.spliterator();
        strComparableDynamicArray0.put((int) (byte) 10, (java.lang.Comparable<java.lang.String>) "");
        java.util.Iterator iterator8 = strComparableDynamicArray0.iterator();
        java.lang.String str9 = strComparableDynamicArray0.toString();
        java.util.Iterator iterator10 = strComparableDynamicArray0.iterator();
        java.lang.String str11 = strComparableDynamicArray0.toString();
        java.lang.Comparable<java.lang.String> strComparable13 = strComparableDynamicArray0.remove((int) (short) 0);
        java.util.Iterator iterator14 = strComparableDynamicArray0.iterator();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertNull(strComparable13);
        org.junit.Assert.assertNotNull(iterator14);
    }

    @Test
    public void test3463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3463");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator4 = strComparableDynamicArray0.spliterator();
        int int5 = strComparableDynamicArray0.getSize();
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableDynamicArray0.remove(0);
        boolean boolean8 = strComparableDynamicArray0.isEmpty();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[, ]");
        java.util.Iterator iterator11 = strComparableDynamicArray0.iterator();
        java.util.Iterator iterator12 = strComparableDynamicArray0.iterator();
        java.lang.Class<?> wildcardClass13 = strComparableDynamicArray0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(strComparable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3464");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator4 = strComparableDynamicArray0.spliterator();
        strComparableDynamicArray0.put((int) (byte) 10, (java.lang.Comparable<java.lang.String>) "");
        java.util.Iterator iterator8 = strComparableDynamicArray0.iterator();
        int int9 = strComparableDynamicArray0.getSize();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator10 = strComparableDynamicArray0.spliterator();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream11 = strComparableDynamicArray0.stream();
        int int12 = strComparableDynamicArray0.getSize();
        java.lang.Comparable<java.lang.String> strComparable14 = strComparableDynamicArray0.get((int) (short) 1);
        java.util.Iterator iterator15 = strComparableDynamicArray0.iterator();
        java.lang.Comparable<java.lang.String> strComparable17 = strComparableDynamicArray0.get(5);
        // The following exception was thrown during execution in test generation
        try {
            strComparableDynamicArray0.put((-1), (java.lang.Comparable<java.lang.String>) "[[hi!, [[], hi!, , ]], ]");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 16");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator10);
        org.junit.Assert.assertNotNull(strComparableStream11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNull(strComparable14);
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertNull(strComparable17);
    }

    @Test
    public void test3465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3465");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableDynamicArray0.isEmpty();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream4 = strComparableDynamicArray0.stream();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator5 = strComparableDynamicArray0.spliterator();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[hi!]");
        java.lang.String str8 = strComparableDynamicArray0.toString();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator9 = strComparableDynamicArray0.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator10 = strComparableDynamicArray0.spliterator();
        java.lang.Class<?> wildcardClass11 = strComparableDynamicArray0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(strComparableStream4);
        org.junit.Assert.assertNotNull(strComparableSpliterator5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[hi!, [hi!]]" + "'", str8, "[hi!, [hi!]]");
        org.junit.Assert.assertNotNull(strComparableSpliterator9);
        org.junit.Assert.assertNotNull(strComparableSpliterator10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3466");
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
        java.lang.Comparable<java.lang.String> strComparable17 = strComparableDynamicArray0.get(3);
        java.lang.Comparable<java.lang.String> strComparable19 = strComparableDynamicArray0.remove(10);
        int int20 = strComparableDynamicArray0.getSize();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNull(strComparable8);
        org.junit.Assert.assertNotNull(strComparableStream9);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(strComparable13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertNull(strComparable17);
        org.junit.Assert.assertNull(strComparable19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test3467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3467");
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
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[hi!, hi!, [[], hi!]]");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable18 = strComparableDynamicArray0.get((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 16");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNull(strComparable8);
        org.junit.Assert.assertNotNull(strComparableStream9);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[hi!]" + "'", str12, "[hi!]");
        org.junit.Assert.assertNotNull(strComparableStream13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
    }

    @Test
    public void test3468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3468");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableDynamicArray0.spliterator();
        boolean boolean2 = strComparableDynamicArray0.isEmpty();
        java.util.Iterator iterator3 = strComparableDynamicArray0.iterator();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream4 = strComparableDynamicArray0.stream();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[[[], hi!, [[hi!]]], hi!]");
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertNotNull(strComparableStream4);
    }

    @Test
    public void test3469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3469");
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
        java.lang.Comparable<java.lang.String> strComparable18 = strComparableDynamicArray0.remove((int) (byte) 10);
        java.util.Iterator iterator19 = strComparableDynamicArray0.iterator();
        java.lang.Class<?> wildcardClass20 = strComparableDynamicArray0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNull(strComparable8);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertEquals("'" + strComparable16 + "' != '" + "[[], hi!]" + "'", strComparable16, "[[], hi!]");
        org.junit.Assert.assertEquals("'" + strComparable18 + "' != '" + "[[], hi!]" + "'", strComparable18, "[[], hi!]");
        org.junit.Assert.assertNotNull(iterator19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3470");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray1 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>(0);
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator2 = strComparableDynamicArray1.spliterator();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream3 = strComparableDynamicArray1.stream();
        java.lang.String str4 = strComparableDynamicArray1.toString();
        boolean boolean5 = strComparableDynamicArray1.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable7 = strComparableDynamicArray1.remove((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strComparableSpliterator2);
        org.junit.Assert.assertNotNull(strComparableStream3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test3471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3471");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableDynamicArray0.getSize();
        java.util.Iterator iterator7 = strComparableDynamicArray0.iterator();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[[], hi!, , ]");
        java.lang.Comparable<java.lang.String> strComparable11 = strComparableDynamicArray0.get(10);
        boolean boolean12 = strComparableDynamicArray0.isEmpty();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream13 = strComparableDynamicArray0.stream();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNull(strComparable11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strComparableStream13);
    }

    @Test
    public void test3472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3472");
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
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator15 = strComparableDynamicArray0.spliterator();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertNotNull(strComparableSpliterator5);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertNull(strComparable8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertNotNull(strComparableStream12);
        org.junit.Assert.assertNotNull(strComparableSpliterator15);
    }

    @Test
    public void test3473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3473");
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
        boolean boolean12 = strComparableDynamicArray0.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3474");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray1 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>(0);
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator2 = strComparableDynamicArray1.spliterator();
        int int3 = strComparableDynamicArray1.getSize();
        java.util.Iterator iterator4 = strComparableDynamicArray1.iterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator5 = strComparableDynamicArray1.spliterator();
        java.util.Iterator iterator6 = strComparableDynamicArray1.iterator();
        java.util.Iterator iterator7 = strComparableDynamicArray1.iterator();
        // The following exception was thrown during execution in test generation
        try {
            strComparableDynamicArray1.add((java.lang.Comparable<java.lang.String>) "[hi!, hi!, [hi!]]");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strComparableSpliterator2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertNotNull(strComparableSpliterator5);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertNotNull(iterator7);
    }

    @Test
    public void test3475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3475");
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
        java.lang.Comparable<java.lang.String> strComparable18 = null;
        strComparableDynamicArray0.add(strComparable18);
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[, [hi!]]");
        int int22 = strComparableDynamicArray0.getSize();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNull(strComparable8);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertNull(strComparable13);
        org.junit.Assert.assertNull(strComparable15);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 6 + "'", int22 == 6);
    }

    @Test
    public void test3476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3476");
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
        int int20 = strComparableDynamicArray0.getSize();
        java.lang.Comparable<java.lang.String> strComparable22 = strComparableDynamicArray0.get((int) (byte) 10);
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream23 = strComparableDynamicArray0.stream();
        java.util.Iterator iterator24 = strComparableDynamicArray0.iterator();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNull(strComparable8);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertEquals("'" + strComparable16 + "' != '" + "[[], hi!]" + "'", strComparable16, "[[], hi!]");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[hi!, hi!, [, ], [[], hi!]]" + "'", str19, "[hi!, hi!, [, ], [[], hi!]]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
        org.junit.Assert.assertEquals("'" + strComparable22 + "' != '" + "[[], hi!]" + "'", strComparable22, "[[], hi!]");
        org.junit.Assert.assertNotNull(strComparableStream23);
        org.junit.Assert.assertNotNull(iterator24);
    }

    @Test
    public void test3477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3477");
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
        java.lang.Comparable<java.lang.String> strComparable14 = strComparableDynamicArray0.remove(0);
        java.lang.String str15 = strComparableDynamicArray0.toString();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator16 = strComparableDynamicArray0.spliterator();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNull(strComparable8);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertNull(strComparable14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[hi!, hi!]" + "'", str15, "[hi!, hi!]");
        org.junit.Assert.assertNotNull(strComparableSpliterator16);
    }

    @Test
    public void test3478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3478");
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
        java.lang.Comparable<java.lang.String> strComparable14 = strComparableDynamicArray0.get(0);
        java.lang.Comparable<java.lang.String> strComparable16 = strComparableDynamicArray0.get(10);
        java.lang.Comparable<java.lang.String> strComparable18 = strComparableDynamicArray0.get(10);
        java.lang.Comparable<java.lang.String> strComparable19 = null;
        strComparableDynamicArray0.add(strComparable19);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator9);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertNull(strComparable14);
        org.junit.Assert.assertNull(strComparable16);
        org.junit.Assert.assertNull(strComparable18);
    }

    @Test
    public void test3479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3479");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator4 = strComparableDynamicArray0.spliterator();
        boolean boolean5 = strComparableDynamicArray0.isEmpty();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator6 = strComparableDynamicArray0.spliterator();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream7 = strComparableDynamicArray0.stream();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[[hi!, []]]");
        int int10 = strComparableDynamicArray0.getSize();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator6);
        org.junit.Assert.assertNotNull(strComparableStream7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
    }

    @Test
    public void test3480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3480");
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
        java.lang.String str17 = strComparableDynamicArray0.toString();
        int int18 = strComparableDynamicArray0.getSize();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNull(strComparable8);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertNull(strComparable13);
        org.junit.Assert.assertNotNull(strComparableStream14);
        org.junit.Assert.assertNotNull(strComparableStream15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[hi!, hi!]" + "'", str16, "[hi!, hi!]");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[hi!, hi!]" + "'", str17, "[hi!, hi!]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
    }

    @Test
    public void test3481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3481");
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
        java.util.Iterator iterator19 = strComparableDynamicArray0.iterator();
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
        org.junit.Assert.assertNotNull(iterator19);
    }

    @Test
    public void test3482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3482");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableDynamicArray0.isEmpty();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream4 = strComparableDynamicArray0.stream();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator5 = strComparableDynamicArray0.spliterator();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[hi!]");
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableDynamicArray0.remove((int) (short) 1);
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator10 = strComparableDynamicArray0.spliterator();
        java.util.Iterator iterator11 = strComparableDynamicArray0.iterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator12 = strComparableDynamicArray0.spliterator();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(strComparableStream4);
        org.junit.Assert.assertNotNull(strComparableSpliterator5);
        org.junit.Assert.assertEquals("'" + strComparable9 + "' != '" + "[hi!]" + "'", strComparable9, "[hi!]");
        org.junit.Assert.assertNotNull(strComparableSpliterator10);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertNotNull(strComparableSpliterator12);
    }

    @Test
    public void test3483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3483");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator4 = strComparableDynamicArray0.spliterator();
        boolean boolean5 = strComparableDynamicArray0.isEmpty();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator6 = strComparableDynamicArray0.spliterator();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream7 = strComparableDynamicArray0.stream();
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableDynamicArray0.remove(4);
        java.util.Iterator iterator10 = strComparableDynamicArray0.iterator();
        boolean boolean11 = strComparableDynamicArray0.isEmpty();
        strComparableDynamicArray0.put(3, (java.lang.Comparable<java.lang.String>) "[hi!, [hi!], [hi!, hi!], [[], hi!]]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator6);
        org.junit.Assert.assertNotNull(strComparableStream7);
        org.junit.Assert.assertNull(strComparable9);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test3484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3484");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "");
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDynamicArray0.put((int) (short) 0, (java.lang.Comparable<java.lang.String>) "[]");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator8 = strComparableDynamicArray0.spliterator();
        strComparableDynamicArray0.put(10, (java.lang.Comparable<java.lang.String>) "");
        boolean boolean12 = strComparableDynamicArray0.isEmpty();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream13 = strComparableDynamicArray0.stream();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "");
        java.util.Iterator iterator16 = strComparableDynamicArray0.iterator();
        strComparableDynamicArray0.put(1, (java.lang.Comparable<java.lang.String>) "[[], ]");
        org.junit.Assert.assertNotNull(strComparableSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strComparableStream13);
        org.junit.Assert.assertNotNull(iterator16);
    }

    @Test
    public void test3485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3485");
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
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream21 = strComparableDynamicArray0.stream();
        boolean boolean22 = strComparableDynamicArray0.isEmpty();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[hi!, [], , [[, ], [hi!], [hi!, hi!], [[], hi!]]]");
        java.lang.Comparable<java.lang.String> strComparable26 = strComparableDynamicArray0.remove((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable28 = strComparableDynamicArray0.get((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 32 out of bounds for length 16");
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
        org.junit.Assert.assertNotNull(strComparableStream21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + strComparable26 + "' != '" + "[[[[hi!]]], , [hi!, []], [[hi!]]]" + "'", strComparable26, "[[[[hi!]]], , [hi!, []], [[hi!]]]");
    }

    @Test
    public void test3486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3486");
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
        java.lang.String str13 = strComparableDynamicArray0.toString();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator16 = strComparableDynamicArray0.spliterator();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertNotNull(strComparableSpliterator11);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[hi!, []]" + "'", str13, "[hi!, []]");
        org.junit.Assert.assertNotNull(strComparableSpliterator16);
    }

    @Test
    public void test3487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3487");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableDynamicArray0.isEmpty();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream4 = strComparableDynamicArray0.stream();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator5 = strComparableDynamicArray0.spliterator();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[hi!]");
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableDynamicArray0.remove((int) (short) 1);
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "");
        java.util.Iterator iterator12 = strComparableDynamicArray0.iterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator13 = strComparableDynamicArray0.spliterator();
        java.lang.Comparable<java.lang.String> strComparable15 = strComparableDynamicArray0.get(0);
        java.util.Iterator iterator16 = strComparableDynamicArray0.iterator();
        int int17 = strComparableDynamicArray0.getSize();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(strComparableStream4);
        org.junit.Assert.assertNotNull(strComparableSpliterator5);
        org.junit.Assert.assertEquals("'" + strComparable9 + "' != '" + "[hi!]" + "'", strComparable9, "[hi!]");
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertNotNull(strComparableSpliterator13);
        org.junit.Assert.assertEquals("'" + strComparable15 + "' != '" + "hi!" + "'", strComparable15, "hi!");
        org.junit.Assert.assertNotNull(iterator16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
    }

    @Test
    public void test3488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3488");
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
        strComparableDynamicArray0.put((int) (short) 1, (java.lang.Comparable<java.lang.String>) "[hi!, [hi!]]");
        boolean boolean18 = strComparableDynamicArray0.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNull(strComparable8);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertNull(strComparable13);
        org.junit.Assert.assertNotNull(strComparableStream14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test3489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3489");
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
            java.lang.Comparable<java.lang.String> strComparable17 = strComparableDynamicArray0.remove((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 32 out of bounds for length 16");
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
    public void test3490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3490");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator4 = strComparableDynamicArray0.spliterator();
        boolean boolean5 = strComparableDynamicArray0.isEmpty();
        boolean boolean6 = strComparableDynamicArray0.isEmpty();
        java.lang.String str7 = strComparableDynamicArray0.toString();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream8 = strComparableDynamicArray0.stream();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[hi!, , []]");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator11 = strComparableDynamicArray0.spliterator();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[hi!, hi!, [hi!], [hi!]]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertNotNull(strComparableStream8);
        org.junit.Assert.assertNotNull(strComparableSpliterator11);
    }

    @Test
    public void test3491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3491");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray1 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>(0);
        java.lang.String str2 = strComparableDynamicArray1.toString();
        boolean boolean3 = strComparableDynamicArray1.isEmpty();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator4 = strComparableDynamicArray1.spliterator();
        int int5 = strComparableDynamicArray1.getSize();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable7 = strComparableDynamicArray1.get(10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test3492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3492");
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
        strComparableDynamicArray0.put((int) (byte) 1, (java.lang.Comparable<java.lang.String>) "");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator19 = strComparableDynamicArray0.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator20 = strComparableDynamicArray0.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator21 = strComparableDynamicArray0.spliterator();
        boolean boolean22 = strComparableDynamicArray0.isEmpty();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream23 = strComparableDynamicArray0.stream();
        java.lang.Comparable<java.lang.String> strComparable25 = strComparableDynamicArray0.remove((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNull(strComparable8);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertNotNull(strComparableSpliterator19);
        org.junit.Assert.assertNotNull(strComparableSpliterator20);
        org.junit.Assert.assertNotNull(strComparableSpliterator21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(strComparableStream23);
        org.junit.Assert.assertNull(strComparable25);
    }

    @Test
    public void test3493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3493");
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
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[[, ], [hi!], [hi!, hi!], [[], hi!]]");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable18 = strComparableDynamicArray0.get((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 52 out of bounds for length 16");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNull(strComparable8);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertNotNull(iterator14);
    }

    @Test
    public void test3494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3494");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableDynamicArray0.getSize();
        java.util.Iterator iterator7 = strComparableDynamicArray0.iterator();
        java.lang.String str8 = strComparableDynamicArray0.toString();
        java.lang.String str9 = strComparableDynamicArray0.toString();
        java.lang.Comparable<java.lang.String> strComparable11 = strComparableDynamicArray0.get(2);
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator12 = strComparableDynamicArray0.spliterator();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream13 = strComparableDynamicArray0.stream();
        java.lang.String str14 = strComparableDynamicArray0.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[hi!]" + "'", str8, "[hi!]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[hi!]" + "'", str9, "[hi!]");
        org.junit.Assert.assertNull(strComparable11);
        org.junit.Assert.assertNotNull(strComparableSpliterator12);
        org.junit.Assert.assertNotNull(strComparableStream13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[hi!]" + "'", str14, "[hi!]");
    }

    @Test
    public void test3495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3495");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator4 = strComparableDynamicArray0.spliterator();
        java.lang.String str5 = strComparableDynamicArray0.toString();
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableDynamicArray0.remove((int) (short) 10);
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream8 = strComparableDynamicArray0.stream();
        java.lang.String str9 = strComparableDynamicArray0.toString();
        boolean boolean10 = strComparableDynamicArray0.isEmpty();
        boolean boolean11 = strComparableDynamicArray0.isEmpty();
        java.lang.String str12 = strComparableDynamicArray0.toString();
        boolean boolean13 = strComparableDynamicArray0.isEmpty();
        java.lang.String str14 = strComparableDynamicArray0.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNull(strComparable7);
        org.junit.Assert.assertNotNull(strComparableStream8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[]" + "'", str12, "[]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[]" + "'", str14, "[]");
    }

    @Test
    public void test3496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3496");
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
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[[[], hi!, , ]]");
        java.util.Iterator iterator14 = strComparableDynamicArray0.iterator();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(iterator14);
    }

    @Test
    public void test3497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3497");
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
        strComparableDynamicArray0.put((int) (byte) 1, (java.lang.Comparable<java.lang.String>) "");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator19 = strComparableDynamicArray0.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator20 = strComparableDynamicArray0.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator21 = strComparableDynamicArray0.spliterator();
        java.lang.String str22 = strComparableDynamicArray0.toString();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[, [hi!]]");
        boolean boolean25 = strComparableDynamicArray0.isEmpty();
        int int26 = strComparableDynamicArray0.getSize();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable28 = strComparableDynamicArray0.remove((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 16");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNull(strComparable8);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertNotNull(strComparableSpliterator19);
        org.junit.Assert.assertNotNull(strComparableSpliterator20);
        org.junit.Assert.assertNotNull(strComparableSpliterator21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "[, hi!, , hi!]" + "'", str22, "[, hi!, , hi!]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 6 + "'", int26 == 6);
    }

    @Test
    public void test3498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3498");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray1 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>(100);
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream2 = strComparableDynamicArray1.stream();
        strComparableDynamicArray1.add((java.lang.Comparable<java.lang.String>) "");
        java.util.Iterator iterator5 = strComparableDynamicArray1.iterator();
        strComparableDynamicArray1.put((int) '4', (java.lang.Comparable<java.lang.String>) "[]");
        java.lang.String str9 = strComparableDynamicArray1.toString();
        java.lang.String str10 = strComparableDynamicArray1.toString();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator11 = strComparableDynamicArray1.spliterator();
        org.junit.Assert.assertNotNull(strComparableStream2);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[, []]" + "'", str9, "[, []]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[, []]" + "'", str10, "[, []]");
        org.junit.Assert.assertNotNull(strComparableSpliterator11);
    }

    @Test
    public void test3499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3499");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray1 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>(0);
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator2 = strComparableDynamicArray1.spliterator();
        int int3 = strComparableDynamicArray1.getSize();
        java.util.Iterator iterator4 = strComparableDynamicArray1.iterator();
        int int5 = strComparableDynamicArray1.getSize();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream6 = strComparableDynamicArray1.stream();
        boolean boolean7 = strComparableDynamicArray1.isEmpty();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream8 = strComparableDynamicArray1.stream();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator9 = strComparableDynamicArray1.spliterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable11 = strComparableDynamicArray1.get(3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 3 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strComparableSpliterator2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(strComparableStream6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strComparableStream8);
        org.junit.Assert.assertNotNull(strComparableSpliterator9);
    }

    @Test
    public void test3500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3500");
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
        boolean boolean12 = strComparableDynamicArray0.isEmpty();
        int int13 = strComparableDynamicArray0.getSize();
        java.lang.Comparable<java.lang.String> strComparable15 = strComparableDynamicArray0.remove(0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertNotNull(strComparableSpliterator5);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertNull(strComparable8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertNotNull(strComparableSpliterator10);
        org.junit.Assert.assertNotNull(strComparableStream11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNull(strComparable15);
    }
}

