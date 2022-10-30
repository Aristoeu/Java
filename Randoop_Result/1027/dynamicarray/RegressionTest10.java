package dynamicarray;

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
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableDynamicArray0.isEmpty();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream4 = strComparableDynamicArray0.stream();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator5 = strComparableDynamicArray0.spliterator();
        int int6 = strComparableDynamicArray0.getSize();
        boolean boolean7 = strComparableDynamicArray0.isEmpty();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream8 = strComparableDynamicArray0.stream();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator9 = strComparableDynamicArray0.spliterator();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(strComparableStream4);
        org.junit.Assert.assertNotNull(strComparableSpliterator5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strComparableStream8);
        org.junit.Assert.assertNotNull(strComparableSpliterator9);
    }

    @Test
    public void test5002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5002");
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
        java.lang.Class<?> wildcardClass20 = strComparableDynamicArray0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator8);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[[hi!]]" + "'", str12, "[[hi!]]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[[hi!, hi!, [hi!], [hi!]]]" + "'", str15, "[[hi!, hi!, [hi!], [hi!]]]");
        org.junit.Assert.assertNull(strComparable19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test5003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5003");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator4 = strComparableDynamicArray0.spliterator();
        strComparableDynamicArray0.put((int) (byte) 10, (java.lang.Comparable<java.lang.String>) "");
        java.util.Iterator iterator8 = strComparableDynamicArray0.iterator();
        java.lang.String str9 = strComparableDynamicArray0.toString();
        java.lang.Comparable<java.lang.String> strComparable11 = strComparableDynamicArray0.remove(2);
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[[hi!]]");
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[[], hi!, [[hi!]]]");
        boolean boolean16 = strComparableDynamicArray0.isEmpty();
        int int17 = strComparableDynamicArray0.getSize();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertNull(strComparable11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
    }

    @Test
    public void test5004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5004");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable14 = strComparableDynamicArray0.get(100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertNotNull(strComparableSpliterator5);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertNull(strComparable8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertNotNull(strComparableSpliterator10);
        org.junit.Assert.assertNotNull(strComparableStream11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[]" + "'", str12, "[]");
    }

    @Test
    public void test5005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5005");
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
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator23 = strComparableDynamicArray0.spliterator();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNull(strComparable8);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertNull(strComparable13);
        org.junit.Assert.assertNull(strComparable15);
        org.junit.Assert.assertNotNull(strComparableStream18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[hi!, hi!, [hi!]]" + "'", str19, "[hi!, hi!, [hi!]]");
        org.junit.Assert.assertNotNull(iterator22);
        org.junit.Assert.assertNotNull(strComparableSpliterator23);
    }

    @Test
    public void test5006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5006");
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
        boolean boolean11 = strComparableDynamicArray0.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(strComparable9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test5007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5007");
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
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[[hi!, [hi!, []]], ]");
        org.junit.Assert.assertNotNull(strComparableSpliterator8);
        org.junit.Assert.assertNotNull(strComparableStream9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertNotNull(strComparableStream14);
        org.junit.Assert.assertNotNull(strComparableSpliterator15);
    }

    @Test
    public void test5008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5008");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream6 = strComparableDynamicArray0.stream();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream7 = strComparableDynamicArray0.stream();
        int int8 = strComparableDynamicArray0.getSize();
        java.lang.String str9 = strComparableDynamicArray0.toString();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream10 = strComparableDynamicArray0.stream();
        int int11 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[, [hi!, []]]");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable15 = strComparableDynamicArray0.remove((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 16");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableStream6);
        org.junit.Assert.assertNotNull(strComparableStream7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[hi!]" + "'", str9, "[hi!]");
        org.junit.Assert.assertNotNull(strComparableStream10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
    }

    @Test
    public void test5009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5009");
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
        java.lang.String str16 = strComparableDynamicArray0.toString();
        java.lang.String str17 = strComparableDynamicArray0.toString();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator18 = strComparableDynamicArray0.spliterator();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[hi!, []]" + "'", str11, "[hi!, []]");
        org.junit.Assert.assertNotNull(strComparableSpliterator12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[hi!, []]" + "'", str13, "[hi!, []]");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[hi!, [], [hi!]]" + "'", str16, "[hi!, [], [hi!]]");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[hi!, [], [hi!]]" + "'", str17, "[hi!, [], [hi!]]");
        org.junit.Assert.assertNotNull(strComparableSpliterator18);
    }

    @Test
    public void test5010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5010");
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
        java.lang.Comparable<java.lang.String> strComparable12 = null;
        strComparableDynamicArray0.add(strComparable12);
        int int14 = strComparableDynamicArray0.getSize();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream15 = strComparableDynamicArray0.stream();
        java.util.Iterator iterator16 = strComparableDynamicArray0.iterator();
        java.lang.String str17 = strComparableDynamicArray0.toString();
        java.util.Iterator iterator18 = strComparableDynamicArray0.iterator();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertNotNull(strComparableStream15);
        org.junit.Assert.assertNotNull(iterator16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[]" + "'", str17, "[]");
        org.junit.Assert.assertNotNull(iterator18);
    }

    @Test
    public void test5011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5011");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableDynamicArray0.isEmpty();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream2 = strComparableDynamicArray0.stream();
        boolean boolean3 = strComparableDynamicArray0.isEmpty();
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableDynamicArray0.get((int) (byte) 1);
        boolean boolean6 = strComparableDynamicArray0.isEmpty();
        int int7 = strComparableDynamicArray0.getSize();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream8 = strComparableDynamicArray0.stream();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable10 = strComparableDynamicArray0.remove((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 16");
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
    public void test5012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5012");
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
        boolean boolean17 = strComparableDynamicArray0.isEmpty();
        java.util.Iterator iterator18 = strComparableDynamicArray0.iterator();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream19 = strComparableDynamicArray0.stream();
        java.lang.Comparable<java.lang.String> strComparable21 = strComparableDynamicArray0.get((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNull(strComparable8);
        org.junit.Assert.assertNotNull(strComparableStream9);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertNull(strComparable15);
        org.junit.Assert.assertNotNull(iterator16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(iterator18);
        org.junit.Assert.assertNotNull(strComparableStream19);
        org.junit.Assert.assertEquals("'" + strComparable21 + "' != '" + "hi!" + "'", strComparable21, "hi!");
    }

    @Test
    public void test5013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5013");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.util.Spliterator<java.lang.Comparable<java.lang.String>>> strComparableSpliteratorDynamicArray1 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.util.Spliterator<java.lang.Comparable<java.lang.String>>>((int) '#');
    }

    @Test
    public void test5014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5014");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableDynamicArray0.getSize();
        int int7 = strComparableDynamicArray0.getSize();
        java.lang.String str8 = strComparableDynamicArray0.toString();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream9 = strComparableDynamicArray0.stream();
        int int10 = strComparableDynamicArray0.getSize();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator11 = strComparableDynamicArray0.spliterator();
        java.lang.Comparable<java.lang.String> strComparable13 = strComparableDynamicArray0.remove((int) (byte) 1);
        boolean boolean14 = strComparableDynamicArray0.isEmpty();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[[hi!, []], [hi!, [hi!]]]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[hi!]" + "'", str8, "[hi!]");
        org.junit.Assert.assertNotNull(strComparableStream9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertNotNull(strComparableSpliterator11);
        org.junit.Assert.assertEquals("'" + strComparable13 + "' != '" + "hi!" + "'", strComparable13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test5015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5015");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableDynamicArray0.isEmpty();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableDynamicArray0.isEmpty();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator5 = strComparableDynamicArray0.spliterator();
        boolean boolean6 = strComparableDynamicArray0.isEmpty();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[[], hi!, , ]");
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[[[hi!, [hi!]]], [[[[hi!]]], , [hi!, []], [[hi!]]]]");
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[, [[hi!]]]");
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[[, [hi!], [[], hi!, , ], [[, ]]], [hi!]]");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test5016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5016");
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
        java.lang.String str18 = strComparableDynamicArray0.toString();
        org.junit.Assert.assertNotNull(strComparableSpliterator8);
        org.junit.Assert.assertNotNull(strComparableStream9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertNotNull(strComparableStream16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[[hi!], hi!, [[hi!]]]" + "'", str17, "[[hi!], hi!, [[hi!]]]");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[[hi!], hi!, [[hi!]]]" + "'", str18, "[[hi!], hi!, [[hi!]]]");
    }

    @Test
    public void test5017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5017");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.put(0, (java.lang.Comparable<java.lang.String>) "[hi!]");
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[hi!, hi!]");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator9 = strComparableDynamicArray0.spliterator();
        java.lang.String str10 = strComparableDynamicArray0.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[[hi!], [hi!, hi!]]" + "'", str10, "[[hi!], [hi!, hi!]]");
    }

    @Test
    public void test5018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5018");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableDynamicArray0.isEmpty();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream2 = strComparableDynamicArray0.stream();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator3 = strComparableDynamicArray0.spliterator();
        boolean boolean4 = strComparableDynamicArray0.isEmpty();
        boolean boolean5 = strComparableDynamicArray0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable7 = strComparableDynamicArray0.get((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(strComparableStream2);
        org.junit.Assert.assertNotNull(strComparableSpliterator3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test5019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5019");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator4 = strComparableDynamicArray0.spliterator();
        int int5 = strComparableDynamicArray0.getSize();
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableDynamicArray0.get((int) (byte) 0);
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream8 = strComparableDynamicArray0.stream();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(strComparable7);
        org.junit.Assert.assertNotNull(strComparableStream8);
    }

    @Test
    public void test5020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5020");
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
        strComparableDynamicArray0.put((int) (short) 1, (java.lang.Comparable<java.lang.String>) "[hi!, hi!]");
        int int17 = strComparableDynamicArray0.getSize();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator18 = strComparableDynamicArray0.spliterator();
        int int19 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[[, ]]");
        int int22 = strComparableDynamicArray0.getSize();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertNotNull(strComparableSpliterator11);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertNotNull(strComparableStream13);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertNotNull(strComparableSpliterator18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 4 + "'", int22 == 4);
    }

    @Test
    public void test5021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5021");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableDynamicArray0.isEmpty();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator2 = strComparableDynamicArray0.spliterator();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream3 = strComparableDynamicArray0.stream();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator4 = strComparableDynamicArray0.spliterator();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[hi!, []]");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator7 = strComparableDynamicArray0.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator8 = strComparableDynamicArray0.spliterator();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(strComparableSpliterator2);
        org.junit.Assert.assertNotNull(strComparableStream3);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertNotNull(strComparableSpliterator7);
        org.junit.Assert.assertNotNull(strComparableSpliterator8);
    }

    @Test
    public void test5022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5022");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator4 = strComparableDynamicArray0.spliterator();
        boolean boolean5 = strComparableDynamicArray0.isEmpty();
        java.util.Iterator iterator6 = strComparableDynamicArray0.iterator();
        java.util.Iterator iterator7 = strComparableDynamicArray0.iterator();
        java.util.Iterator iterator8 = strComparableDynamicArray0.iterator();
        java.lang.Comparable<java.lang.String> strComparable10 = strComparableDynamicArray0.get(4);
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
    public void test5023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5023");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream6 = strComparableDynamicArray0.stream();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream7 = strComparableDynamicArray0.stream();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator8 = strComparableDynamicArray0.spliterator();
        int int9 = strComparableDynamicArray0.getSize();
        java.lang.String str10 = strComparableDynamicArray0.toString();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator11 = strComparableDynamicArray0.spliterator();
        java.lang.Comparable<java.lang.String> strComparable13 = strComparableDynamicArray0.remove(3);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableStream6);
        org.junit.Assert.assertNotNull(strComparableStream7);
        org.junit.Assert.assertNotNull(strComparableSpliterator8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[hi!]" + "'", str10, "[hi!]");
        org.junit.Assert.assertNotNull(strComparableSpliterator11);
        org.junit.Assert.assertNull(strComparable13);
    }

    @Test
    public void test5024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5024");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "");
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator5 = strComparableDynamicArray0.spliterator();
        int int6 = strComparableDynamicArray0.getSize();
        boolean boolean7 = strComparableDynamicArray0.isEmpty();
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableDynamicArray0.get((int) (byte) 10);
        org.junit.Assert.assertNotNull(strComparableSpliterator5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(strComparable9);
    }

    @Test
    public void test5025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5025");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray1 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>(0);
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator2 = strComparableDynamicArray1.spliterator();
        int int3 = strComparableDynamicArray1.getSize();
        java.util.Iterator iterator4 = strComparableDynamicArray1.iterator();
        int int5 = strComparableDynamicArray1.getSize();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream6 = strComparableDynamicArray1.stream();
        boolean boolean7 = strComparableDynamicArray1.isEmpty();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream8 = strComparableDynamicArray1.stream();
        java.lang.String str9 = strComparableDynamicArray1.toString();
        org.junit.Assert.assertNotNull(strComparableSpliterator2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(strComparableStream6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strComparableStream8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
    }

    @Test
    public void test5026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5026");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableDynamicArray0.isEmpty();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream2 = strComparableDynamicArray0.stream();
        boolean boolean3 = strComparableDynamicArray0.isEmpty();
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableDynamicArray0.get((int) (byte) 1);
        boolean boolean6 = strComparableDynamicArray0.isEmpty();
        int int7 = strComparableDynamicArray0.getSize();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream8 = strComparableDynamicArray0.stream();
        java.util.Iterator iterator9 = strComparableDynamicArray0.iterator();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream10 = strComparableDynamicArray0.stream();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator11 = strComparableDynamicArray0.spliterator();
        java.lang.Class<?> wildcardClass12 = strComparableDynamicArray0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(strComparableStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(strComparable5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(strComparableStream8);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNotNull(strComparableStream10);
        org.junit.Assert.assertNotNull(strComparableSpliterator11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test5027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5027");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableDynamicArray0.isEmpty();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream4 = strComparableDynamicArray0.stream();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator5 = strComparableDynamicArray0.spliterator();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[hi!]");
        java.lang.String str8 = strComparableDynamicArray0.toString();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[hi!, hi!]");
        boolean boolean11 = strComparableDynamicArray0.isEmpty();
        java.util.Iterator iterator12 = strComparableDynamicArray0.iterator();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(strComparableStream4);
        org.junit.Assert.assertNotNull(strComparableSpliterator5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[hi!, [hi!]]" + "'", str8, "[hi!, [hi!]]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(iterator12);
    }

    @Test
    public void test5028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5028");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        boolean boolean3 = strComparableDynamicArray0.isEmpty();
        java.lang.String str4 = strComparableDynamicArray0.toString();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator5 = strComparableDynamicArray0.spliterator();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "");
        java.util.Iterator iterator8 = strComparableDynamicArray0.iterator();
        java.lang.Class<?> wildcardClass9 = strComparableDynamicArray0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertNotNull(strComparableSpliterator5);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test5029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5029");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray1 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>(0);
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator2 = strComparableDynamicArray1.spliterator();
        int int3 = strComparableDynamicArray1.getSize();
        java.util.Iterator iterator4 = strComparableDynamicArray1.iterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator5 = strComparableDynamicArray1.spliterator();
        int int6 = strComparableDynamicArray1.getSize();
        int int7 = strComparableDynamicArray1.getSize();
        org.junit.Assert.assertNotNull(strComparableSpliterator2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertNotNull(strComparableSpliterator5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test5030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5030");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        boolean boolean4 = strComparableDynamicArray0.isEmpty();
        boolean boolean5 = strComparableDynamicArray0.isEmpty();
        int int6 = strComparableDynamicArray0.getSize();
        java.lang.String str7 = strComparableDynamicArray0.toString();
        int int8 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[[hi!, hi!]]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test5031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5031");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableDynamicArray0.isEmpty();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream2 = strComparableDynamicArray0.stream();
        java.lang.String str3 = strComparableDynamicArray0.toString();
        int int4 = strComparableDynamicArray0.getSize();
        java.lang.String str5 = strComparableDynamicArray0.toString();
        strComparableDynamicArray0.put(5, (java.lang.Comparable<java.lang.String>) "[, []]");
        java.lang.Class<?> wildcardClass9 = strComparableDynamicArray0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(strComparableStream2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[]" + "'", str3, "[]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test5032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5032");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableDynamicArray0.isEmpty();
        java.util.Iterator iterator2 = strComparableDynamicArray0.iterator();
        int int3 = strComparableDynamicArray0.getSize();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator4 = strComparableDynamicArray0.spliterator();
        strComparableDynamicArray0.put((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "[, ]");
        java.lang.Class<?> wildcardClass8 = strComparableDynamicArray0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test5033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5033");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray1 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>((int) (byte) 10);
        strComparableDynamicArray1.put((int) (byte) 1, (java.lang.Comparable<java.lang.String>) "[[hi!]]");
        java.lang.String str5 = strComparableDynamicArray1.toString();
        strComparableDynamicArray1.add((java.lang.Comparable<java.lang.String>) "");
        int int8 = strComparableDynamicArray1.getSize();
        java.lang.String str9 = strComparableDynamicArray1.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable11 = strComparableDynamicArray1.get((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[[[hi!]]]" + "'", str5, "[[[hi!]]]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[, [[hi!]]]" + "'", str9, "[, [[hi!]]]");
    }

    @Test
    public void test5034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5034");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        boolean boolean4 = strComparableDynamicArray0.isEmpty();
        int int5 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.put((int) (short) 10, (java.lang.Comparable<java.lang.String>) "[[], hi!, , ]");
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[[], hi!, , ]");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable12 = strComparableDynamicArray0.remove((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 32 out of bounds for length 16");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test5035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5035");
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
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[[[hi!, hi!, [hi!]]], [, ]]");
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[hi!, [hi!, hi!, [[hi!, hi!, [hi!]]]]]");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(strComparableStream4);
        org.junit.Assert.assertNotNull(strComparableSpliterator5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[hi!, [hi!]]" + "'", str8, "[hi!, [hi!]]");
        org.junit.Assert.assertNull(strComparable12);
    }

    @Test
    public void test5036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5036");
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
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator14 = strComparableDynamicArray0.spliterator();
        java.lang.Class<?> wildcardClass15 = strComparableDynamicArray0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertNotNull(strComparableStream10);
        org.junit.Assert.assertNotNull(strComparableSpliterator14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test5037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5037");
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
        int int16 = strComparableDynamicArray0.getSize();
        java.lang.Comparable<java.lang.String> strComparable18 = null;
        strComparableDynamicArray0.put(2, strComparable18);
        int int20 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[[[hi!, hi!, [hi!], [hi!]]]]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[hi!, []]" + "'", str11, "[hi!, []]");
        org.junit.Assert.assertNotNull(strComparableStream12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertEquals("'" + strComparable15 + "' != '" + "hi!" + "'", strComparable15, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
    }

    @Test
    public void test5038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5038");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableDynamicArray0.getSize();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator7 = strComparableDynamicArray0.spliterator();
        java.util.Iterator iterator8 = strComparableDynamicArray0.iterator();
        java.util.Iterator iterator9 = strComparableDynamicArray0.iterator();
        java.lang.Comparable<java.lang.String> strComparable11 = strComparableDynamicArray0.remove(5);
        java.lang.String str12 = strComparableDynamicArray0.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNotNull(strComparableSpliterator7);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNull(strComparable11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[]" + "'", str12, "[]");
    }

    @Test
    public void test5039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5039");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray1 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>(0);
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator2 = strComparableDynamicArray1.spliterator();
        int int3 = strComparableDynamicArray1.getSize();
        java.lang.String str4 = strComparableDynamicArray1.toString();
        java.util.Iterator iterator5 = strComparableDynamicArray1.iterator();
        java.lang.String str6 = strComparableDynamicArray1.toString();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator7 = strComparableDynamicArray1.spliterator();
        org.junit.Assert.assertNotNull(strComparableSpliterator2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
        org.junit.Assert.assertNotNull(strComparableSpliterator7);
    }

    @Test
    public void test5040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5040");
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
        strComparableDynamicArray0.put(3, (java.lang.Comparable<java.lang.String>) "[hi!, [hi!]]");
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[, ]");
        java.util.Iterator iterator21 = strComparableDynamicArray0.iterator();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream22 = strComparableDynamicArray0.stream();
        strComparableDynamicArray0.put(6, (java.lang.Comparable<java.lang.String>) "[[], hi!]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNull(strComparable8);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertNotNull(strComparableStream12);
        org.junit.Assert.assertEquals("'" + strComparable14 + "' != '" + "hi!" + "'", strComparable14, "hi!");
        org.junit.Assert.assertNotNull(strComparableStream15);
        org.junit.Assert.assertNotNull(iterator21);
        org.junit.Assert.assertNotNull(strComparableStream22);
    }

    @Test
    public void test5041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5041");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator iterator6 = strComparableDynamicArray0.iterator();
        java.lang.String str7 = strComparableDynamicArray0.toString();
        strComparableDynamicArray0.put(10, (java.lang.Comparable<java.lang.String>) "[[hi!]]");
        strComparableDynamicArray0.put((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "[[], [hi!, hi!, [hi!], [hi!]]]");
        java.lang.Comparable<java.lang.String> strComparable15 = strComparableDynamicArray0.get(4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[hi!]" + "'", str7, "[hi!]");
        org.junit.Assert.assertNull(strComparable15);
    }

    @Test
    public void test5042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5042");
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
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream12 = strComparableDynamicArray0.stream();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(strComparableStream4);
        org.junit.Assert.assertNotNull(strComparableSpliterator5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[hi!, [hi!]]" + "'", str8, "[hi!, [hi!]]");
        org.junit.Assert.assertNotNull(strComparableSpliterator9);
        org.junit.Assert.assertNotNull(strComparableSpliterator10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertNotNull(strComparableStream12);
    }

    @Test
    public void test5043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5043");
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
        java.util.Iterator iterator12 = strComparableDynamicArray0.iterator();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(iterator12);
    }

    @Test
    public void test5044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5044");
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
        boolean boolean15 = strComparableDynamicArray0.isEmpty();
        strComparableDynamicArray0.put((int) (byte) 10, (java.lang.Comparable<java.lang.String>) "[hi!, hi!, [[hi!, hi!, [hi!], [hi!]]]]");
        boolean boolean19 = strComparableDynamicArray0.isEmpty();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[[[], hi!]]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNull(strComparable8);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test5045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5045");
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
        java.lang.Comparable<java.lang.String> strComparable12 = strComparableDynamicArray0.get(0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertNull(strComparable12);
    }

    @Test
    public void test5046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5046");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray1 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>(100);
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream2 = strComparableDynamicArray1.stream();
        strComparableDynamicArray1.add((java.lang.Comparable<java.lang.String>) "");
        strComparableDynamicArray1.put(1, (java.lang.Comparable<java.lang.String>) "[[hi!]]");
        strComparableDynamicArray1.put((int) (byte) 10, (java.lang.Comparable<java.lang.String>) "[[], ]");
        java.util.Iterator iterator11 = strComparableDynamicArray1.iterator();
        org.junit.Assert.assertNotNull(strComparableStream2);
        org.junit.Assert.assertNotNull(iterator11);
    }

    @Test
    public void test5047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5047");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableDynamicArray0.isEmpty();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream2 = strComparableDynamicArray0.stream();
        java.lang.String str3 = strComparableDynamicArray0.toString();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[, [[, ]]]");
        strComparableDynamicArray0.put((int) (byte) 1, (java.lang.Comparable<java.lang.String>) "[[[hi!, hi!, [hi!], [hi!]], ]]");
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream9 = strComparableDynamicArray0.stream();
        java.lang.String str10 = strComparableDynamicArray0.toString();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(strComparableStream2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[]" + "'", str3, "[]");
        org.junit.Assert.assertNotNull(strComparableStream9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[[, [[, ]]], [[[hi!, hi!, [hi!], [hi!]], ]]]" + "'", str10, "[[, [[, ]]], [[[hi!, hi!, [hi!], [hi!]], ]]]");
    }

    @Test
    public void test5048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5048");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        boolean boolean3 = strComparableDynamicArray0.isEmpty();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[]");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator6 = strComparableDynamicArray0.spliterator();
        int int7 = strComparableDynamicArray0.getSize();
        int int8 = strComparableDynamicArray0.getSize();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator9 = strComparableDynamicArray0.spliterator();
        strComparableDynamicArray0.put(0, (java.lang.Comparable<java.lang.String>) "[hi!, [hi!]]");
        java.lang.Comparable<java.lang.String> strComparable14 = strComparableDynamicArray0.get(0);
        int int15 = strComparableDynamicArray0.getSize();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertNotNull(strComparableSpliterator9);
        org.junit.Assert.assertEquals("'" + strComparable14 + "' != '" + "[hi!, [hi!]]" + "'", strComparable14, "[hi!, [hi!]]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
    }

    @Test
    public void test5049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5049");
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
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream15 = strComparableDynamicArray0.stream();
        java.lang.String str16 = strComparableDynamicArray0.toString();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream17 = strComparableDynamicArray0.stream();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNull(strComparable8);
        org.junit.Assert.assertNotNull(strComparableStream9);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[hi!]" + "'", str13, "[hi!]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[hi!]" + "'", str14, "[hi!]");
        org.junit.Assert.assertNotNull(strComparableStream15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[hi!]" + "'", str16, "[hi!]");
        org.junit.Assert.assertNotNull(strComparableStream17);
    }

    @Test
    public void test5050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5050");
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
        java.lang.String str13 = strComparableDynamicArray0.toString();
        boolean boolean14 = strComparableDynamicArray0.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[[hi!]]" + "'", str13, "[[hi!]]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test5051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5051");
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
        java.lang.String str11 = strComparableDynamicArray0.toString();
        java.lang.String str12 = strComparableDynamicArray0.toString();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream13 = strComparableDynamicArray0.stream();
        java.util.Iterator iterator14 = strComparableDynamicArray0.iterator();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertNotNull(strComparableSpliterator5);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertNull(strComparable8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertNotNull(strComparableSpliterator10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[]" + "'", str12, "[]");
        org.junit.Assert.assertNotNull(strComparableStream13);
        org.junit.Assert.assertNotNull(iterator14);
    }

    @Test
    public void test5052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5052");
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
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator20 = strComparableDynamicArray0.spliterator();
        boolean boolean21 = strComparableDynamicArray0.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNull(strComparable8);
        org.junit.Assert.assertNotNull(strComparableSpliterator17);
        org.junit.Assert.assertNotNull(strComparableStream18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[[hi!, [hi!]], , []]" + "'", str19, "[[hi!, [hi!]], , []]");
        org.junit.Assert.assertNotNull(strComparableSpliterator20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test5053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5053");
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
        java.lang.String str11 = strComparableDynamicArray0.toString();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertNotNull(strComparableSpliterator5);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertNotNull(strComparableSpliterator8);
        org.junit.Assert.assertNotNull(strComparableStream9);
        org.junit.Assert.assertNotNull(strComparableStream10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
    }

    @Test
    public void test5054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5054");
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
        boolean boolean11 = strComparableDynamicArray0.isEmpty();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream12 = strComparableDynamicArray0.stream();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertNotNull(strComparableSpliterator5);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertNotNull(strComparableSpliterator8);
        org.junit.Assert.assertNotNull(strComparableStream9);
        org.junit.Assert.assertNotNull(strComparableStream10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strComparableStream12);
    }

    @Test
    public void test5055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5055");
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
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[[, []], [hi!]]");
        java.lang.String str16 = strComparableDynamicArray0.toString();
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[[[, []], [hi!]]]" + "'", str16, "[[[, []], [hi!]]]");
    }

    @Test
    public void test5056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5056");
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
        java.lang.Comparable<java.lang.String> strComparable14 = strComparableDynamicArray0.get(2);
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[[], hi!, hi!]");
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[[], hi!]");
        boolean boolean19 = strComparableDynamicArray0.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator9);
        org.junit.Assert.assertNull(strComparable14);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test5057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5057");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray1 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>(0);
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator2 = strComparableDynamicArray1.spliterator();
        int int3 = strComparableDynamicArray1.getSize();
        java.util.Iterator iterator4 = strComparableDynamicArray1.iterator();
        int int5 = strComparableDynamicArray1.getSize();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator6 = strComparableDynamicArray1.spliterator();
        // The following exception was thrown during execution in test generation
        try {
            strComparableDynamicArray1.add((java.lang.Comparable<java.lang.String>) "[hi!, [[], hi!, , ]]");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strComparableSpliterator2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(strComparableSpliterator6);
    }

    @Test
    public void test5058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5058");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "");
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDynamicArray0.put((int) (short) 0, (java.lang.Comparable<java.lang.String>) "[]");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator8 = strComparableDynamicArray0.spliterator();
        strComparableDynamicArray0.put(10, (java.lang.Comparable<java.lang.String>) "");
        boolean boolean12 = strComparableDynamicArray0.isEmpty();
        java.lang.String str13 = strComparableDynamicArray0.toString();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator14 = strComparableDynamicArray0.spliterator();
        java.lang.Comparable<java.lang.String> strComparable16 = strComparableDynamicArray0.remove((int) (byte) 1);
        boolean boolean17 = strComparableDynamicArray0.isEmpty();
        org.junit.Assert.assertNotNull(strComparableSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[[], hi!, ]" + "'", str13, "[[], hi!, ]");
        org.junit.Assert.assertNotNull(strComparableSpliterator14);
        org.junit.Assert.assertEquals("'" + strComparable16 + "' != '" + "hi!" + "'", strComparable16, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test5059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5059");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "");
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator5 = strComparableDynamicArray0.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator6 = strComparableDynamicArray0.spliterator();
        strComparableDynamicArray0.put(2, (java.lang.Comparable<java.lang.String>) "[hi!, hi!, [hi!], [hi!]]");
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream10 = strComparableDynamicArray0.stream();
        java.lang.Class<?> wildcardClass11 = strComparableStream10.getClass();
        org.junit.Assert.assertNotNull(strComparableSpliterator5);
        org.junit.Assert.assertNotNull(strComparableSpliterator6);
        org.junit.Assert.assertNotNull(strComparableStream10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test5060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5060");
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
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream15 = strComparableDynamicArray0.stream();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(strComparableStream10);
        org.junit.Assert.assertNull(strComparable12);
        org.junit.Assert.assertNull(strComparable14);
        org.junit.Assert.assertNotNull(strComparableStream15);
    }

    @Test
    public void test5061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5061");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.constant.Constable> constableDynamicArray1 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.constant.Constable>((int) (short) 10);
    }

    @Test
    public void test5062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5062");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableDynamicArray0.isEmpty();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator2 = strComparableDynamicArray0.spliterator();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream3 = strComparableDynamicArray0.stream();
        java.util.Iterator iterator4 = strComparableDynamicArray0.iterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator5 = strComparableDynamicArray0.spliterator();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[hi!, hi!, [hi!]]");
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableDynamicArray0.get((int) (short) 0);
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream10 = strComparableDynamicArray0.stream();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[hi!, [, [[hi!]]]]");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(strComparableSpliterator2);
        org.junit.Assert.assertNotNull(strComparableStream3);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertNotNull(strComparableSpliterator5);
        org.junit.Assert.assertEquals("'" + strComparable9 + "' != '" + "[hi!, hi!, [hi!]]" + "'", strComparable9, "[hi!, hi!, [hi!]]");
        org.junit.Assert.assertNotNull(strComparableStream10);
    }

    @Test
    public void test5063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5063");
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
        java.util.Iterator iterator12 = strComparableDynamicArray0.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable14 = strComparableDynamicArray0.remove((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 16");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertNotNull(strComparableSpliterator9);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertNotNull(strComparableSpliterator11);
        org.junit.Assert.assertNotNull(iterator12);
    }

    @Test
    public void test5064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5064");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator4 = strComparableDynamicArray0.spliterator();
        java.util.Iterator iterator5 = strComparableDynamicArray0.iterator();
        java.util.Iterator iterator6 = strComparableDynamicArray0.iterator();
        java.util.Iterator iterator7 = strComparableDynamicArray0.iterator();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[[]]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertNotNull(iterator7);
    }

    @Test
    public void test5065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5065");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "");
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDynamicArray0.put((int) (short) 0, (java.lang.Comparable<java.lang.String>) "[]");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator8 = strComparableDynamicArray0.spliterator();
        int int9 = strComparableDynamicArray0.getSize();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream10 = strComparableDynamicArray0.stream();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream11 = strComparableDynamicArray0.stream();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream12 = strComparableDynamicArray0.stream();
        boolean boolean13 = strComparableDynamicArray0.isEmpty();
        strComparableDynamicArray0.put(1, (java.lang.Comparable<java.lang.String>) "[hi!, hi!, [hi!], [hi!, []]]");
        org.junit.Assert.assertNotNull(strComparableSpliterator8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertNotNull(strComparableStream10);
        org.junit.Assert.assertNotNull(strComparableStream11);
        org.junit.Assert.assertNotNull(strComparableStream12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test5066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5066");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableDynamicArray0.getSize();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator7 = strComparableDynamicArray0.spliterator();
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableDynamicArray0.remove(1);
        java.lang.String str10 = strComparableDynamicArray0.toString();
        int int11 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[hi!, [hi!]]");
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream14 = strComparableDynamicArray0.stream();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNotNull(strComparableSpliterator7);
        org.junit.Assert.assertEquals("'" + strComparable9 + "' != '" + "hi!" + "'", strComparable9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(strComparableStream14);
    }

    @Test
    public void test5067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5067");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.String str1 = strComparableDynamicArray0.toString();
        strComparableDynamicArray0.put(0, (java.lang.Comparable<java.lang.String>) "[hi!]");
        int int5 = strComparableDynamicArray0.getSize();
        java.util.Iterator iterator6 = strComparableDynamicArray0.iterator();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream7 = strComparableDynamicArray0.stream();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream8 = strComparableDynamicArray0.stream();
        java.util.Iterator iterator9 = strComparableDynamicArray0.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable11 = strComparableDynamicArray0.get(100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "[]" + "'", str1, "[]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertNotNull(strComparableStream7);
        org.junit.Assert.assertNotNull(strComparableStream8);
        org.junit.Assert.assertNotNull(iterator9);
    }

    @Test
    public void test5068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5068");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        boolean boolean3 = strComparableDynamicArray0.isEmpty();
        java.lang.String str4 = strComparableDynamicArray0.toString();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int7 = strComparableDynamicArray0.getSize();
        boolean boolean8 = strComparableDynamicArray0.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test5069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5069");
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
        java.util.Iterator iterator13 = strComparableDynamicArray0.iterator();
        java.lang.String str14 = strComparableDynamicArray0.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertNotNull(strComparableSpliterator11);
        org.junit.Assert.assertNotNull(strComparableStream12);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[hi!, []]" + "'", str14, "[hi!, []]");
    }

    @Test
    public void test5070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5070");
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
        strComparableDynamicArray0.put(1, (java.lang.Comparable<java.lang.String>) "[[[], [hi!, hi!, [hi!], [hi!]]], hi!, hi!, [hi!], [hi!]]");
        java.lang.Comparable<java.lang.String> strComparable16 = strComparableDynamicArray0.get((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertNotNull(strComparableSpliterator11);
        org.junit.Assert.assertEquals("'" + strComparable16 + "' != '" + "[[[], [hi!, hi!, [hi!], [hi!]]], hi!, hi!, [hi!], [hi!]]" + "'", strComparable16, "[[[], [hi!, hi!, [hi!], [hi!]]], hi!, hi!, [hi!], [hi!]]");
    }

    @Test
    public void test5071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5071");
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
        java.lang.String str18 = strComparableDynamicArray0.toString();
        boolean boolean19 = strComparableDynamicArray0.isEmpty();
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[hi!]" + "'", str18, "[hi!]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test5072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5072");
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
        java.lang.String str19 = strComparableDynamicArray0.toString();
        java.lang.String str20 = strComparableDynamicArray0.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNull(strComparable8);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertNull(strComparable13);
        org.junit.Assert.assertNull(strComparable15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[hi!, hi!, [hi!]]" + "'", str18, "[hi!, hi!, [hi!]]");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[hi!, hi!, [hi!]]" + "'", str19, "[hi!, hi!, [hi!]]");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "[hi!, hi!, [hi!]]" + "'", str20, "[hi!, hi!, [hi!]]");
    }

    @Test
    public void test5073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5073");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.put(0, (java.lang.Comparable<java.lang.String>) "[hi!]");
        java.util.Iterator iterator7 = strComparableDynamicArray0.iterator();
        java.util.Iterator iterator8 = strComparableDynamicArray0.iterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator9 = strComparableDynamicArray0.spliterator();
        java.lang.Comparable<java.lang.String> strComparable11 = strComparableDynamicArray0.get((int) (short) 0);
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[hi!, [], , [[, ], [hi!], [hi!, hi!], [[], hi!]]]");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator14 = strComparableDynamicArray0.spliterator();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(strComparableSpliterator9);
        org.junit.Assert.assertEquals("'" + strComparable11 + "' != '" + "[hi!]" + "'", strComparable11, "[hi!]");
        org.junit.Assert.assertNotNull(strComparableSpliterator14);
    }

    @Test
    public void test5074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5074");
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
        java.lang.Comparable<java.lang.String> strComparable19 = strComparableDynamicArray0.remove((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNull(strComparable8);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[hi!, hi!, , hi!]" + "'", str17, "[hi!, hi!, , hi!]");
        org.junit.Assert.assertNull(strComparable19);
    }

    @Test
    public void test5075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5075");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableDynamicArray0.isEmpty();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream4 = strComparableDynamicArray0.stream();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator5 = strComparableDynamicArray0.spliterator();
        int int6 = strComparableDynamicArray0.getSize();
        boolean boolean7 = strComparableDynamicArray0.isEmpty();
        boolean boolean8 = strComparableDynamicArray0.isEmpty();
        int int9 = strComparableDynamicArray0.getSize();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator10 = strComparableDynamicArray0.spliterator();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(strComparableStream4);
        org.junit.Assert.assertNotNull(strComparableSpliterator5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator10);
    }

    @Test
    public void test5076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5076");
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
        strComparableDynamicArray0.put((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "[hi!, hi!, [hi!]]");
        java.util.Iterator iterator21 = strComparableDynamicArray0.iterator();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNull(strComparable8);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertNull(strComparable13);
        org.junit.Assert.assertNotNull(strComparableStream14);
        org.junit.Assert.assertNotNull(strComparableStream17);
        org.junit.Assert.assertNotNull(iterator21);
    }

    @Test
    public void test5077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5077");
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
        java.lang.Comparable<java.lang.String> strComparable12 = strComparableDynamicArray0.get(1);
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream13 = strComparableDynamicArray0.stream();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[, [hi!], [[[[[hi!]]], , [hi!, []], [[hi!]]]]]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[hi!]" + "'", str8, "[hi!]");
        org.junit.Assert.assertNotNull(strComparableStream9);
        org.junit.Assert.assertNotNull(strComparableStream10);
        org.junit.Assert.assertEquals("'" + strComparable12 + "' != '" + "hi!" + "'", strComparable12, "hi!");
        org.junit.Assert.assertNotNull(strComparableStream13);
    }

    @Test
    public void test5078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5078");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableDynamicArray0.isEmpty();
        java.util.Iterator iterator2 = strComparableDynamicArray0.iterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator3 = strComparableDynamicArray0.spliterator();
        java.lang.String str4 = strComparableDynamicArray0.toString();
        java.util.Iterator iterator5 = strComparableDynamicArray0.iterator();
        java.lang.String str6 = strComparableDynamicArray0.toString();
        java.lang.String str7 = strComparableDynamicArray0.toString();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertNotNull(strComparableSpliterator3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
    }

    @Test
    public void test5079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5079");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator4 = strComparableDynamicArray0.spliterator();
        boolean boolean5 = strComparableDynamicArray0.isEmpty();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator6 = strComparableDynamicArray0.spliterator();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream7 = strComparableDynamicArray0.stream();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[hi!, hi!, [hi!]]");
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[[[[hi!]]], , [hi!, []], [[hi!]]]");
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[hi!, [hi!], [hi!, hi!], [[], hi!]]");
        int int14 = strComparableDynamicArray0.getSize();
        int int15 = strComparableDynamicArray0.getSize();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator6);
        org.junit.Assert.assertNotNull(strComparableStream7);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
    }

    @Test
    public void test5080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5080");
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
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator14 = strComparableDynamicArray0.spliterator();
        org.junit.Assert.assertNotNull(strComparableStream5);
        org.junit.Assert.assertNull(strComparable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strComparableStream9);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertNull(strComparable12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator14);
    }

    @Test
    public void test5081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5081");
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
        int int15 = strComparableDynamicArray0.getSize();
        boolean boolean16 = strComparableDynamicArray0.isEmpty();
        java.lang.Class<?> wildcardClass17 = strComparableDynamicArray0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertNull(strComparable14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test5082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5082");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray1 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>(100);
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream2 = strComparableDynamicArray1.stream();
        java.lang.String str3 = strComparableDynamicArray1.toString();
        java.util.Iterator iterator4 = strComparableDynamicArray1.iterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator5 = strComparableDynamicArray1.spliterator();
        strComparableDynamicArray1.put((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "[[], hi!, [[hi!]]]");
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream9 = strComparableDynamicArray1.stream();
        java.lang.String str10 = strComparableDynamicArray1.toString();
        strComparableDynamicArray1.put((int) 'a', (java.lang.Comparable<java.lang.String>) "[hi!, [], [hi!, hi!, [hi!], [hi!]]]");
        org.junit.Assert.assertNotNull(strComparableStream2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[]" + "'", str3, "[]");
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertNotNull(strComparableSpliterator5);
        org.junit.Assert.assertNotNull(strComparableStream9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[[[], hi!, [[hi!]]]]" + "'", str10, "[[[], hi!, [[hi!]]]]");
    }

    @Test
    public void test5083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5083");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.String str1 = strComparableDynamicArray0.toString();
        strComparableDynamicArray0.put(0, (java.lang.Comparable<java.lang.String>) "[hi!]");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator5 = strComparableDynamicArray0.spliterator();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream6 = strComparableDynamicArray0.stream();
        java.util.Iterator iterator7 = strComparableDynamicArray0.iterator();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream8 = strComparableDynamicArray0.stream();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str11 = strComparableDynamicArray0.toString();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream12 = strComparableDynamicArray0.stream();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream13 = strComparableDynamicArray0.stream();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "[]" + "'", str1, "[]");
        org.junit.Assert.assertNotNull(strComparableSpliterator5);
        org.junit.Assert.assertNotNull(strComparableStream6);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(strComparableStream8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[hi!]" + "'", str11, "[hi!]");
        org.junit.Assert.assertNotNull(strComparableStream12);
        org.junit.Assert.assertNotNull(strComparableStream13);
    }

    @Test
    public void test5084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5084");
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
        java.lang.Comparable<java.lang.String> strComparable18 = strComparableDynamicArray0.remove((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertNull(strComparable12);
        org.junit.Assert.assertNotNull(iterator16);
        org.junit.Assert.assertEquals("'" + strComparable18 + "' != '" + "[[hi!, hi!, [hi!]]]" + "'", strComparable18, "[[hi!, hi!, [hi!]]]");
    }

    @Test
    public void test5085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5085");
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
        java.util.Iterator iterator18 = strComparableDynamicArray0.iterator();
        int int19 = strComparableDynamicArray0.getSize();
        int int20 = strComparableDynamicArray0.getSize();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNull(strComparable8);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertNull(strComparable13);
        org.junit.Assert.assertNotNull(strComparableStream14);
        org.junit.Assert.assertNotNull(iterator18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
    }

    @Test
    public void test5086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5086");
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
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator19 = strComparableDynamicArray0.spliterator();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[[[[[[hi!]]], , [hi!, []], [[hi!]]], [[]]], hi!, ]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNull(strComparable8);
        org.junit.Assert.assertNotNull(strComparableSpliterator17);
        org.junit.Assert.assertNotNull(strComparableStream18);
        org.junit.Assert.assertNotNull(strComparableSpliterator19);
    }

    @Test
    public void test5087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5087");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        boolean boolean3 = strComparableDynamicArray0.isEmpty();
        java.lang.String str4 = strComparableDynamicArray0.toString();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[hi!, []]");
        int int9 = strComparableDynamicArray0.getSize();
        java.lang.Class<?> wildcardClass10 = strComparableDynamicArray0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test5088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5088");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator4 = strComparableDynamicArray0.spliterator();
        int int5 = strComparableDynamicArray0.getSize();
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableDynamicArray0.remove(0);
        boolean boolean8 = strComparableDynamicArray0.isEmpty();
        java.lang.String str9 = strComparableDynamicArray0.toString();
        strComparableDynamicArray0.put(0, (java.lang.Comparable<java.lang.String>) "[[], [hi!, hi!, [hi!], [hi!]]]");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator13 = strComparableDynamicArray0.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator14 = strComparableDynamicArray0.spliterator();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(strComparable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertNotNull(strComparableSpliterator13);
        org.junit.Assert.assertNotNull(strComparableSpliterator14);
    }

    @Test
    public void test5089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5089");
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
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator15 = strComparableDynamicArray0.spliterator();
        int int16 = strComparableDynamicArray0.getSize();
        int int17 = strComparableDynamicArray0.getSize();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream18 = strComparableDynamicArray0.stream();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(strComparableStream14);
        org.junit.Assert.assertNotNull(strComparableSpliterator15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 5 + "'", int17 == 5);
        org.junit.Assert.assertNotNull(strComparableStream18);
    }

    @Test
    public void test5090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5090");
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
        java.util.Iterator iterator14 = strComparableDynamicArray0.iterator();
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
        org.junit.Assert.assertNotNull(iterator14);
    }

    @Test
    public void test5091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5091");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableDynamicArray0.isEmpty();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator2 = strComparableDynamicArray0.spliterator();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream3 = strComparableDynamicArray0.stream();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator4 = strComparableDynamicArray0.spliterator();
        boolean boolean5 = strComparableDynamicArray0.isEmpty();
        boolean boolean6 = strComparableDynamicArray0.isEmpty();
        int int7 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.put((int) (short) 1, (java.lang.Comparable<java.lang.String>) "[[], hi!]");
        java.lang.String str11 = strComparableDynamicArray0.toString();
        int int12 = strComparableDynamicArray0.getSize();
        int int13 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.put(3, (java.lang.Comparable<java.lang.String>) "[[[[[[hi!]]], , [hi!, []], [[hi!]]], [[]]]]");
        boolean boolean17 = strComparableDynamicArray0.isEmpty();
        java.lang.Comparable<java.lang.String> strComparable19 = strComparableDynamicArray0.get((int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(strComparableSpliterator2);
        org.junit.Assert.assertNotNull(strComparableStream3);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[[[], hi!]]" + "'", str11, "[[[], hi!]]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + strComparable19 + "' != '" + "[[], hi!]" + "'", strComparable19, "[[], hi!]");
    }

    @Test
    public void test5092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5092");
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
        boolean boolean12 = strComparableDynamicArray0.isEmpty();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator13 = strComparableDynamicArray0.spliterator();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator13);
    }

    @Test
    public void test5093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5093");
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
        int int12 = strComparableDynamicArray0.getSize();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream13 = strComparableDynamicArray0.stream();
        boolean boolean14 = strComparableDynamicArray0.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(strComparableStream13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test5094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5094");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableDynamicArray0.getSize();
        java.util.Iterator iterator7 = strComparableDynamicArray0.iterator();
        java.lang.String str8 = strComparableDynamicArray0.toString();
        java.lang.String str9 = strComparableDynamicArray0.toString();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator10 = strComparableDynamicArray0.spliterator();
        java.lang.String str11 = strComparableDynamicArray0.toString();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator12 = strComparableDynamicArray0.spliterator();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[hi!]" + "'", str8, "[hi!]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[hi!]" + "'", str9, "[hi!]");
        org.junit.Assert.assertNotNull(strComparableSpliterator10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[hi!]" + "'", str11, "[hi!]");
        org.junit.Assert.assertNotNull(strComparableSpliterator12);
    }

    @Test
    public void test5095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5095");
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
        java.lang.Comparable<java.lang.String> strComparable14 = strComparableDynamicArray0.get(2);
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[[], hi!, hi!]");
        java.lang.Comparable<java.lang.String> strComparable18 = strComparableDynamicArray0.remove(3);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator9);
        org.junit.Assert.assertNull(strComparable14);
        org.junit.Assert.assertNull(strComparable18);
    }

    @Test
    public void test5096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5096");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean6 = strComparableDynamicArray0.isEmpty();
        java.util.Iterator iterator7 = strComparableDynamicArray0.iterator();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream8 = strComparableDynamicArray0.stream();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[[, ]]");
        boolean boolean11 = strComparableDynamicArray0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable13 = strComparableDynamicArray0.get(100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(strComparableStream8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test5097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5097");
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
        java.lang.Comparable<java.lang.String> strComparable17 = strComparableDynamicArray0.get(0);
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[[, [[hi!]]], [hi!, hi!]]");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator20 = strComparableDynamicArray0.spliterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable22 = strComparableDynamicArray0.get((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
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
        org.junit.Assert.assertNull(strComparable17);
        org.junit.Assert.assertNotNull(strComparableSpliterator20);
    }

    @Test
    public void test5098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5098");
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
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[[], hi!, [hi!, hi!, [hi!], [hi!]], [[[hi!, [hi!]]], ]]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[hi!]" + "'", str8, "[hi!]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test5099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5099");
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
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator17 = strComparableDynamicArray0.spliterator();
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
        org.junit.Assert.assertNotNull(strComparableSpliterator17);
    }

    @Test
    public void test5100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5100");
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
        java.util.Iterator iterator19 = strComparableDynamicArray0.iterator();
        java.lang.Comparable<java.lang.String> strComparable21 = strComparableDynamicArray0.get(6);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(strComparableStream4);
        org.junit.Assert.assertNotNull(strComparableSpliterator5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[hi!, [hi!]]" + "'", str8, "[hi!, [hi!]]");
        org.junit.Assert.assertNotNull(strComparableStream14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(iterator19);
        org.junit.Assert.assertNull(strComparable21);
    }

    @Test
    public void test5101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5101");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray1 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>((int) (short) 10);
        strComparableDynamicArray1.add((java.lang.Comparable<java.lang.String>) "[, ]");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator4 = strComparableDynamicArray1.spliterator();
        strComparableDynamicArray1.add((java.lang.Comparable<java.lang.String>) "[[, ]]");
        java.lang.String str7 = strComparableDynamicArray1.toString();
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[[, ], [[, ]]]" + "'", str7, "[[, ], [[, ]]]");
    }

    @Test
    public void test5102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5102");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "");
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator5 = strComparableDynamicArray0.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator6 = strComparableDynamicArray0.spliterator();
        int int7 = strComparableDynamicArray0.getSize();
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableDynamicArray0.remove((int) (byte) 0);
        boolean boolean10 = strComparableDynamicArray0.isEmpty();
        java.lang.Comparable<java.lang.String> strComparable12 = strComparableDynamicArray0.remove((int) (short) 1);
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[[], ]");
        org.junit.Assert.assertNotNull(strComparableSpliterator5);
        org.junit.Assert.assertNotNull(strComparableSpliterator6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertEquals("'" + strComparable9 + "' != '" + "" + "'", strComparable9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(strComparable12);
    }

    @Test
    public void test5103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5103");
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
        int int23 = strComparableDynamicArray0.getSize();
        java.lang.Comparable<java.lang.String> strComparable24 = null;
        strComparableDynamicArray0.add(strComparable24);
        java.util.Iterator iterator26 = strComparableDynamicArray0.iterator();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNull(strComparable8);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertNull(strComparable13);
        org.junit.Assert.assertNull(strComparable15);
        org.junit.Assert.assertNotNull(iterator20);
        org.junit.Assert.assertNotNull(iterator21);
        org.junit.Assert.assertNotNull(strComparableSpliterator22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 5 + "'", int23 == 5);
        org.junit.Assert.assertNotNull(iterator26);
    }

    @Test
    public void test5104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5104");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        boolean boolean3 = strComparableDynamicArray0.isEmpty();
        java.lang.String str4 = strComparableDynamicArray0.toString();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator5 = strComparableDynamicArray0.spliterator();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "");
        int int8 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[hi!, []]");
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[[hi!, [hi!]]]");
        java.util.Iterator iterator13 = strComparableDynamicArray0.iterator();
        java.lang.Class<?> wildcardClass14 = iterator13.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertNotNull(strComparableSpliterator5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test5105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5105");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "");
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator5 = strComparableDynamicArray0.spliterator();
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableDynamicArray0.remove(2);
        boolean boolean8 = strComparableDynamicArray0.isEmpty();
        java.util.Iterator iterator9 = strComparableDynamicArray0.iterator();
        java.util.Iterator iterator10 = strComparableDynamicArray0.iterator();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[hi!, hi!, [[hi!, []]]]");
        org.junit.Assert.assertNotNull(strComparableSpliterator5);
        org.junit.Assert.assertNull(strComparable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNotNull(iterator10);
    }

    @Test
    public void test5106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5106");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableDynamicArray0.getSize();
        int int7 = strComparableDynamicArray0.getSize();
        java.lang.String str8 = strComparableDynamicArray0.toString();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream9 = strComparableDynamicArray0.stream();
        int int10 = strComparableDynamicArray0.getSize();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator11 = strComparableDynamicArray0.spliterator();
        java.util.Iterator iterator12 = strComparableDynamicArray0.iterator();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[hi!]" + "'", str8, "[hi!]");
        org.junit.Assert.assertNotNull(strComparableStream9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertNotNull(strComparableSpliterator11);
        org.junit.Assert.assertNotNull(iterator12);
    }

    @Test
    public void test5107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5107");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableDynamicArray0.getSize();
        java.util.Iterator iterator7 = strComparableDynamicArray0.iterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator8 = strComparableDynamicArray0.spliterator();
        boolean boolean9 = strComparableDynamicArray0.isEmpty();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream10 = strComparableDynamicArray0.stream();
        java.lang.String str11 = strComparableDynamicArray0.toString();
        java.util.Iterator iterator12 = strComparableDynamicArray0.iterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator13 = strComparableDynamicArray0.spliterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable15 = strComparableDynamicArray0.get((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(strComparableSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strComparableStream10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[hi!]" + "'", str11, "[hi!]");
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertNotNull(strComparableSpliterator13);
    }

    @Test
    public void test5108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5108");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        boolean boolean3 = strComparableDynamicArray0.isEmpty();
        java.lang.String str4 = strComparableDynamicArray0.toString();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableDynamicArray0.isEmpty();
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableDynamicArray0.remove(10);
        int int10 = strComparableDynamicArray0.getSize();
        java.util.Iterator iterator11 = strComparableDynamicArray0.iterator();
        java.lang.Class<?> wildcardClass12 = iterator11.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(strComparable9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test5109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5109");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray1 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable3 = strComparableDynamicArray1.remove(1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5110");
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
        java.lang.Comparable<java.lang.String> strComparable13 = null;
        strComparableDynamicArray0.add(strComparable13);
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
    }

    @Test
    public void test5111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5111");
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
        boolean boolean26 = strComparableDynamicArray0.isEmpty();
        java.lang.Comparable<java.lang.String> strComparable28 = strComparableDynamicArray0.remove((int) (short) 1);
        int int29 = strComparableDynamicArray0.getSize();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream30 = strComparableDynamicArray0.stream();
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
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + strComparable28 + "' != '" + "[hi!]" + "'", strComparable28, "[hi!]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2 + "'", int29 == 2);
        org.junit.Assert.assertNotNull(strComparableStream30);
    }

    @Test
    public void test5112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5112");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator4 = strComparableDynamicArray0.spliterator();
        boolean boolean5 = strComparableDynamicArray0.isEmpty();
        boolean boolean6 = strComparableDynamicArray0.isEmpty();
        java.lang.String str7 = strComparableDynamicArray0.toString();
        boolean boolean8 = strComparableDynamicArray0.isEmpty();
        java.util.Iterator iterator9 = strComparableDynamicArray0.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable11 = strComparableDynamicArray0.get((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(iterator9);
    }

    @Test
    public void test5113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5113");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        boolean boolean3 = strComparableDynamicArray0.isEmpty();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[, ]");
        java.util.Iterator iterator6 = strComparableDynamicArray0.iterator();
        java.lang.String str7 = strComparableDynamicArray0.toString();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[[, ]]" + "'", str7, "[[, ]]");
    }

    @Test
    public void test5114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5114");
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
        java.lang.Class<?> wildcardClass14 = strComparableStream13.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[hi!]" + "'", str10, "[hi!]");
        org.junit.Assert.assertNotNull(strComparableSpliterator11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strComparableStream13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test5115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5115");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable14 = strComparableDynamicArray0.get((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test5116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5116");
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
        java.util.Iterator iterator18 = strComparableDynamicArray0.iterator();
        java.util.Iterator iterator19 = strComparableDynamicArray0.iterator();
        boolean boolean20 = strComparableDynamicArray0.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNull(strComparable8);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertNull(strComparable13);
        org.junit.Assert.assertNotNull(strComparableStream14);
        org.junit.Assert.assertNotNull(iterator18);
        org.junit.Assert.assertNotNull(iterator19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test5117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5117");
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
        java.lang.String str18 = strComparableDynamicArray0.toString();
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[[]]" + "'", str18, "[[]]");
    }

    @Test
    public void test5118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5118");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>> strComparableDynamicArrayDynamicArray1 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>>((int) 'a');
    }

    @Test
    public void test5119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5119");
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.reflect.Type> typeDynamicArray1 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.reflect.Type>((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5120");
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
        boolean boolean12 = strComparableDynamicArray0.isEmpty();
        java.util.Iterator iterator13 = strComparableDynamicArray0.iterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator14 = strComparableDynamicArray0.spliterator();
        boolean boolean15 = strComparableDynamicArray0.isEmpty();
        strComparableDynamicArray0.put((int) (short) 1, (java.lang.Comparable<java.lang.String>) "[[, ], [hi!, hi!, [hi!], [hi!]]]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[hi!]" + "'", str8, "[hi!]");
        org.junit.Assert.assertNotNull(strComparableStream9);
        org.junit.Assert.assertNotNull(strComparableStream10);
        org.junit.Assert.assertNotNull(strComparableSpliterator11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertNotNull(strComparableSpliterator14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test5121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5121");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator4 = strComparableDynamicArray0.spliterator();
        int int5 = strComparableDynamicArray0.getSize();
        java.util.Iterator iterator6 = strComparableDynamicArray0.iterator();
        boolean boolean7 = strComparableDynamicArray0.isEmpty();
        java.lang.String str8 = strComparableDynamicArray0.toString();
        java.lang.String str9 = strComparableDynamicArray0.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
    }

    @Test
    public void test5122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5122");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableDynamicArray0.isEmpty();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream4 = strComparableDynamicArray0.stream();
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableDynamicArray0.get(2);
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator7 = strComparableDynamicArray0.spliterator();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream8 = strComparableDynamicArray0.stream();
        java.lang.Comparable<java.lang.String> strComparable10 = strComparableDynamicArray0.get(0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(strComparableStream4);
        org.junit.Assert.assertNull(strComparable6);
        org.junit.Assert.assertNotNull(strComparableSpliterator7);
        org.junit.Assert.assertNotNull(strComparableStream8);
        org.junit.Assert.assertEquals("'" + strComparable10 + "' != '" + "hi!" + "'", strComparable10, "hi!");
    }

    @Test
    public void test5123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5123");
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
        java.lang.Class<?> wildcardClass14 = strComparableDynamicArray0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strComparableStream12);
        org.junit.Assert.assertNotNull(strComparableSpliterator13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test5124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5124");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "");
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDynamicArray0.put((int) (short) 0, (java.lang.Comparable<java.lang.String>) "[]");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator8 = strComparableDynamicArray0.spliterator();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream9 = strComparableDynamicArray0.stream();
        int int10 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.put((int) (short) 0, (java.lang.Comparable<java.lang.String>) "[hi!]");
        java.util.Iterator iterator14 = strComparableDynamicArray0.iterator();
        org.junit.Assert.assertNotNull(strComparableSpliterator8);
        org.junit.Assert.assertNotNull(strComparableStream9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertNotNull(iterator14);
    }

    @Test
    public void test5125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5125");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator4 = strComparableDynamicArray0.spliterator();
        int int5 = strComparableDynamicArray0.getSize();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator6 = strComparableDynamicArray0.spliterator();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[[[[hi!]]], , [hi!, []], [[hi!]]]");
        strComparableDynamicArray0.put(4, (java.lang.Comparable<java.lang.String>) "[, [hi!]]");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator12 = strComparableDynamicArray0.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator13 = strComparableDynamicArray0.spliterator();
        int int14 = strComparableDynamicArray0.getSize();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator15 = strComparableDynamicArray0.spliterator();
        java.lang.Class<?> wildcardClass16 = strComparableSpliterator15.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator6);
        org.junit.Assert.assertNotNull(strComparableSpliterator12);
        org.junit.Assert.assertNotNull(strComparableSpliterator13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNotNull(strComparableSpliterator15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test5126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5126");
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
        java.util.Iterator iterator19 = strComparableDynamicArray0.iterator();
        java.util.Iterator iterator20 = strComparableDynamicArray0.iterator();
        java.lang.Comparable<java.lang.String> strComparable22 = strComparableDynamicArray0.remove((int) (short) 10);
        java.lang.String str23 = strComparableDynamicArray0.toString();
        java.lang.Comparable<java.lang.String> strComparable25 = strComparableDynamicArray0.remove(2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNull(strComparable8);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertEquals("'" + strComparable16 + "' != '" + "[[], hi!]" + "'", strComparable16, "[[], hi!]");
        org.junit.Assert.assertNotNull(iterator19);
        org.junit.Assert.assertNotNull(iterator20);
        org.junit.Assert.assertEquals("'" + strComparable22 + "' != '" + "[[], hi!]" + "'", strComparable22, "[[], hi!]");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "[hi!, hi!, [[], hi!]]" + "'", str23, "[hi!, hi!, [[], hi!]]");
        org.junit.Assert.assertEquals("'" + strComparable25 + "' != '" + "hi!" + "'", strComparable25, "hi!");
    }

    @Test
    public void test5127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5127");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableDynamicArray0.isEmpty();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream4 = strComparableDynamicArray0.stream();
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableDynamicArray0.get(2);
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableDynamicArray0.remove(5);
        strComparableDynamicArray0.put(1, (java.lang.Comparable<java.lang.String>) "[]");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(strComparableStream4);
        org.junit.Assert.assertNull(strComparable6);
        org.junit.Assert.assertNull(strComparable8);
    }

    @Test
    public void test5128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5128");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableDynamicArray0.isEmpty();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator2 = strComparableDynamicArray0.spliterator();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream3 = strComparableDynamicArray0.stream();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator4 = strComparableDynamicArray0.spliterator();
        boolean boolean5 = strComparableDynamicArray0.isEmpty();
        boolean boolean6 = strComparableDynamicArray0.isEmpty();
        int int7 = strComparableDynamicArray0.getSize();
        int int8 = strComparableDynamicArray0.getSize();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(strComparableSpliterator2);
        org.junit.Assert.assertNotNull(strComparableStream3);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test5129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5129");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableDynamicArray0.getSize();
        int int7 = strComparableDynamicArray0.getSize();
        boolean boolean8 = strComparableDynamicArray0.isEmpty();
        boolean boolean9 = strComparableDynamicArray0.isEmpty();
        java.util.Iterator iterator10 = strComparableDynamicArray0.iterator();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[[, ], [[], [hi!, hi!, [hi!], [hi!]]]]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(iterator10);
    }

    @Test
    public void test5130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5130");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray1 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>(0);
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator2 = strComparableDynamicArray1.spliterator();
        int int3 = strComparableDynamicArray1.getSize();
        java.util.Iterator iterator4 = strComparableDynamicArray1.iterator();
        java.util.Iterator iterator5 = strComparableDynamicArray1.iterator();
        java.lang.String str6 = strComparableDynamicArray1.toString();
        // The following exception was thrown during execution in test generation
        try {
            strComparableDynamicArray1.put((int) 'a', (java.lang.Comparable<java.lang.String>) "[[], [hi!, hi!, [hi!], [hi!]]]");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strComparableSpliterator2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
    }

    @Test
    public void test5131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5131");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable19 = strComparableDynamicArray0.remove((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 16");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
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
    public void test5132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5132");
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
        java.lang.Class<?> wildcardClass15 = strComparableStream14.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertEquals("'" + strComparable9 + "' != '" + "[]" + "'", strComparable9, "[]");
        org.junit.Assert.assertNotNull(strComparableSpliterator10);
        org.junit.Assert.assertNotNull(strComparableStream14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test5133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5133");
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
        java.lang.Comparable<java.lang.String> strComparable17 = strComparableDynamicArray0.remove(5);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNull(strComparable8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[hi!]" + "'", str9, "[hi!]");
        org.junit.Assert.assertNotNull(strComparableStream10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strComparableStream12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[hi!]" + "'", str13, "[hi!]");
        org.junit.Assert.assertNull(strComparable17);
    }

    @Test
    public void test5134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5134");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableDynamicArray0.isEmpty();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream4 = strComparableDynamicArray0.stream();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator5 = strComparableDynamicArray0.spliterator();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[hi!]");
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableDynamicArray0.remove((int) (short) 1);
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator10 = strComparableDynamicArray0.spliterator();
        java.util.Iterator iterator11 = strComparableDynamicArray0.iterator();
        strComparableDynamicArray0.put((int) (byte) 1, (java.lang.Comparable<java.lang.String>) "[hi!]");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator15 = strComparableDynamicArray0.spliterator();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(strComparableStream4);
        org.junit.Assert.assertNotNull(strComparableSpliterator5);
        org.junit.Assert.assertEquals("'" + strComparable9 + "' != '" + "[hi!]" + "'", strComparable9, "[hi!]");
        org.junit.Assert.assertNotNull(strComparableSpliterator10);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertNotNull(strComparableSpliterator15);
    }

    @Test
    public void test5135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5135");
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
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[hi!, []]");
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream15 = strComparableDynamicArray0.stream();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[[[[hi!, [hi!]]], [[[[hi!]]], , [hi!, []], [[hi!]]]], [[hi!, hi!, [hi!]]]]");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator18 = strComparableDynamicArray0.spliterator();
        java.lang.Comparable<java.lang.String> strComparable20 = strComparableDynamicArray0.remove((int) (short) 1);
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream21 = strComparableDynamicArray0.stream();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNotNull(strComparableSpliterator7);
        org.junit.Assert.assertEquals("'" + strComparable9 + "' != '" + "hi!" + "'", strComparable9, "hi!");
        org.junit.Assert.assertNull(strComparable11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(strComparableStream15);
        org.junit.Assert.assertNotNull(strComparableSpliterator18);
        org.junit.Assert.assertEquals("'" + strComparable20 + "' != '" + "[[[[hi!, [hi!]]], [[[[hi!]]], , [hi!, []], [[hi!]]]], [[hi!, hi!, [hi!]]]]" + "'", strComparable20, "[[[[hi!, [hi!]]], [[[[hi!]]], , [hi!, []], [[hi!]]]], [[hi!, hi!, [hi!]]]]");
        org.junit.Assert.assertNotNull(strComparableStream21);
    }

    @Test
    public void test5136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5136");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "");
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDynamicArray0.put((int) (short) 0, (java.lang.Comparable<java.lang.String>) "[]");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator8 = strComparableDynamicArray0.spliterator();
        strComparableDynamicArray0.put(10, (java.lang.Comparable<java.lang.String>) "");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator12 = strComparableDynamicArray0.spliterator();
        java.lang.Comparable<java.lang.String> strComparable14 = strComparableDynamicArray0.get(4);
        java.lang.Comparable<java.lang.String> strComparable16 = strComparableDynamicArray0.remove(0);
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[hi!, hi!, [hi!]]");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable20 = strComparableDynamicArray0.get((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strComparableSpliterator8);
        org.junit.Assert.assertNotNull(strComparableSpliterator12);
        org.junit.Assert.assertNull(strComparable14);
        org.junit.Assert.assertEquals("'" + strComparable16 + "' != '" + "[]" + "'", strComparable16, "[]");
    }

    @Test
    public void test5137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5137");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "");
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDynamicArray0.put((int) (short) 0, (java.lang.Comparable<java.lang.String>) "[]");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator8 = strComparableDynamicArray0.spliterator();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream9 = strComparableDynamicArray0.stream();
        java.util.Iterator iterator10 = strComparableDynamicArray0.iterator();
        strComparableDynamicArray0.put(2, (java.lang.Comparable<java.lang.String>) "[[], hi!, [[hi!]]]");
        strComparableDynamicArray0.put((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "[hi!]");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator17 = strComparableDynamicArray0.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator18 = strComparableDynamicArray0.spliterator();
        org.junit.Assert.assertNotNull(strComparableSpliterator8);
        org.junit.Assert.assertNotNull(strComparableStream9);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertNotNull(strComparableSpliterator17);
        org.junit.Assert.assertNotNull(strComparableSpliterator18);
    }

    @Test
    public void test5138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5138");
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
        boolean boolean13 = strComparableDynamicArray0.isEmpty();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream14 = strComparableDynamicArray0.stream();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(strComparableStream4);
        org.junit.Assert.assertNotNull(strComparableSpliterator5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[hi!, [hi!]]" + "'", str8, "[hi!, [hi!]]");
        org.junit.Assert.assertNotNull(strComparableSpliterator9);
        org.junit.Assert.assertNotNull(strComparableSpliterator10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strComparableStream14);
    }

    @Test
    public void test5139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5139");
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
        java.lang.Comparable<java.lang.String> strComparable16 = strComparableDynamicArray0.get((int) (short) 10);
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator17 = strComparableDynamicArray0.spliterator();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream18 = strComparableDynamicArray0.stream();
        int int19 = strComparableDynamicArray0.getSize();
        java.lang.String str20 = strComparableDynamicArray0.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNull(strComparable8);
        org.junit.Assert.assertNotNull(strComparableSpliterator14);
        org.junit.Assert.assertEquals("'" + strComparable16 + "' != '" + "[]" + "'", strComparable16, "[]");
        org.junit.Assert.assertNotNull(strComparableSpliterator17);
        org.junit.Assert.assertNotNull(strComparableStream18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "[hi!, , []]" + "'", str20, "[hi!, , []]");
    }

    @Test
    public void test5140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5140");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        boolean boolean4 = strComparableDynamicArray0.isEmpty();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream7 = strComparableDynamicArray0.stream();
        int int8 = strComparableDynamicArray0.getSize();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strComparableStream7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
    }

    @Test
    public void test5141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5141");
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
        java.util.Iterator iterator14 = strComparableDynamicArray0.iterator();
        java.lang.Class<?> wildcardClass15 = iterator14.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertNull(strComparable11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test5142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5142");
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
        int int17 = strComparableDynamicArray0.getSize();
        boolean boolean18 = strComparableDynamicArray0.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNull(strComparable8);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertEquals("'" + strComparable16 + "' != '" + "[[], hi!]" + "'", strComparable16, "[[], hi!]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test5143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5143");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        boolean boolean4 = strComparableDynamicArray0.isEmpty();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream7 = strComparableDynamicArray0.stream();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[hi!, [[], hi!, , ]]");
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[, hi!, , hi!]");
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[[[], hi!, , ], hi!]");
        java.util.Iterator iterator14 = strComparableDynamicArray0.iterator();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strComparableStream7);
        org.junit.Assert.assertNotNull(iterator14);
    }

    @Test
    public void test5144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5144");
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
        java.lang.String str18 = strComparableDynamicArray0.toString();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[, [hi!, []]]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNull(strComparable8);
        org.junit.Assert.assertNotNull(strComparableStream9);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertNull(strComparable12);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertNull(strComparable15);
        org.junit.Assert.assertEquals("'" + strComparable17 + "' != '" + "hi!" + "'", strComparable17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[hi!]" + "'", str18, "[hi!]");
    }

    @Test
    public void test5145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5145");
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
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[hi!, [[], hi!], [[hi!, hi!, [hi!]]]]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableStream6);
        org.junit.Assert.assertNotNull(strComparableStream7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertNotNull(strComparableStream9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test5146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5146");
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
        // The following exception was thrown during execution in test generation
        try {
            strComparableDynamicArray0.put((int) (byte) 100, (java.lang.Comparable<java.lang.String>) "[, [, [hi!]]]");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 16");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test5147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5147");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "");
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator5 = strComparableDynamicArray0.spliterator();
        int int6 = strComparableDynamicArray0.getSize();
        boolean boolean7 = strComparableDynamicArray0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable9 = strComparableDynamicArray0.remove((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 16");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strComparableSpliterator5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test5148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5148");
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
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream22 = strComparableDynamicArray0.stream();
        strComparableDynamicArray0.put(6, (java.lang.Comparable<java.lang.String>) "[hi!, [hi!, hi!]]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNull(strComparable8);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertNotNull(strComparableSpliterator19);
        org.junit.Assert.assertNotNull(strComparableSpliterator20);
        org.junit.Assert.assertNotNull(strComparableSpliterator21);
        org.junit.Assert.assertNotNull(strComparableStream22);
    }

    @Test
    public void test5149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5149");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray1 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>(0);
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator2 = strComparableDynamicArray1.spliterator();
        int int3 = strComparableDynamicArray1.getSize();
        java.util.Iterator iterator4 = strComparableDynamicArray1.iterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator5 = strComparableDynamicArray1.spliterator();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream6 = strComparableDynamicArray1.stream();
        java.util.Iterator iterator7 = strComparableDynamicArray1.iterator();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream8 = strComparableDynamicArray1.stream();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator9 = strComparableDynamicArray1.spliterator();
        org.junit.Assert.assertNotNull(strComparableSpliterator2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertNotNull(strComparableSpliterator5);
        org.junit.Assert.assertNotNull(strComparableStream6);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(strComparableStream8);
        org.junit.Assert.assertNotNull(strComparableSpliterator9);
    }

    @Test
    public void test5150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5150");
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
        boolean boolean20 = strComparableDynamicArray0.isEmpty();
        org.junit.Assert.assertNotNull(strComparableSpliterator8);
        org.junit.Assert.assertNotNull(strComparableStream9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertNull(strComparable18);
        org.junit.Assert.assertNotNull(iterator19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test5151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5151");
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
        java.lang.String str16 = strComparableDynamicArray0.toString();
        java.util.Iterator iterator17 = strComparableDynamicArray0.iterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator18 = strComparableDynamicArray0.spliterator();
        java.lang.String str19 = strComparableDynamicArray0.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[hi!, []]" + "'", str11, "[hi!, []]");
        org.junit.Assert.assertNotNull(strComparableSpliterator12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[hi!, []]" + "'", str13, "[hi!, []]");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[hi!, [], [hi!]]" + "'", str16, "[hi!, [], [hi!]]");
        org.junit.Assert.assertNotNull(iterator17);
        org.junit.Assert.assertNotNull(strComparableSpliterator18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[hi!, [], [hi!]]" + "'", str19, "[hi!, [], [hi!]]");
    }

    @Test
    public void test5152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5152");
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
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream15 = strComparableDynamicArray0.stream();
        java.lang.String str16 = strComparableDynamicArray0.toString();
        int int17 = strComparableDynamicArray0.getSize();
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
        org.junit.Assert.assertNotNull(strComparableStream15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[]" + "'", str16, "[]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
    }

    @Test
    public void test5153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5153");
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
        java.util.Iterator iterator20 = strComparableDynamicArray0.iterator();
        int int21 = strComparableDynamicArray0.getSize();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNull(strComparable8);
        org.junit.Assert.assertNotNull(strComparableSpliterator17);
        org.junit.Assert.assertNotNull(strComparableStream18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[[hi!, [hi!]], , []]" + "'", str19, "[[hi!, [hi!]], , []]");
        org.junit.Assert.assertNotNull(iterator20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
    }

    @Test
    public void test5154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5154");
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
        java.util.Iterator iterator17 = strComparableDynamicArray0.iterator();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[hi!, []]" + "'", str11, "[hi!, []]");
        org.junit.Assert.assertNotNull(strComparableSpliterator12);
        org.junit.Assert.assertNotNull(strComparableStream16);
        org.junit.Assert.assertNotNull(iterator17);
    }

    @Test
    public void test5155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5155");
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
        strComparableDynamicArray0.put(4, (java.lang.Comparable<java.lang.String>) "[[hi!, [[], hi!, , ]], hi!]");
        // The following exception was thrown during execution in test generation
        try {
            strComparableDynamicArray0.put((int) (short) 100, (java.lang.Comparable<java.lang.String>) "[[, ], [[], [hi!, hi!, [hi!], [hi!]]]]");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 16");
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
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[hi!]" + "'", str15, "[hi!]");
    }

    @Test
    public void test5156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5156");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator4 = strComparableDynamicArray0.spliterator();
        int int5 = strComparableDynamicArray0.getSize();
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableDynamicArray0.get((int) (byte) 0);
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableDynamicArray0.remove(10);
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator10 = strComparableDynamicArray0.spliterator();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[hi!, [[], hi!, [hi!, hi!, [hi!], [hi!]]], [[[], hi!]]]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(strComparable7);
        org.junit.Assert.assertNull(strComparable9);
        org.junit.Assert.assertNotNull(strComparableSpliterator10);
    }

    @Test
    public void test5157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5157");
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
        strComparableDynamicArray0.put(3, (java.lang.Comparable<java.lang.String>) "[hi!, [hi!]]");
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[, ]");
        java.util.Iterator iterator21 = strComparableDynamicArray0.iterator();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[[hi!, [hi!]]]");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator24 = strComparableDynamicArray0.spliterator();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNull(strComparable8);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertNotNull(strComparableStream12);
        org.junit.Assert.assertEquals("'" + strComparable14 + "' != '" + "hi!" + "'", strComparable14, "hi!");
        org.junit.Assert.assertNotNull(strComparableStream15);
        org.junit.Assert.assertNotNull(iterator21);
        org.junit.Assert.assertNotNull(strComparableSpliterator24);
    }

    @Test
    public void test5158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5158");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableDynamicArray0.isEmpty();
        java.util.Iterator iterator2 = strComparableDynamicArray0.iterator();
        int int3 = strComparableDynamicArray0.getSize();
        java.lang.Comparable<java.lang.String> strComparable4 = null;
        strComparableDynamicArray0.add(strComparable4);
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream6 = strComparableDynamicArray0.stream();
        strComparableDynamicArray0.put((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "[[hi!, hi!, [hi!]], hi!, hi!, [hi!, []], [hi!, [[], hi!, , ]]]");
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[[[hi!, hi!, [[], hi!]], []], [hi!, hi!]]");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(strComparableStream6);
    }

    @Test
    public void test5159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5159");
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
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator18 = strComparableDynamicArray0.spliterator();
        java.lang.Class<?> wildcardClass19 = strComparableSpliterator18.getClass();
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
        org.junit.Assert.assertNotNull(strComparableSpliterator18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test5160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5160");
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
        strComparableDynamicArray0.put(5, (java.lang.Comparable<java.lang.String>) "[[], [hi!, hi!, [hi!], [hi!]]]");
        java.lang.Comparable<java.lang.String> strComparable18 = strComparableDynamicArray0.get((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[hi!]" + "'", str8, "[hi!]");
        org.junit.Assert.assertNull(strComparable10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertNull(strComparable18);
    }

    @Test
    public void test5161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5161");
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
        int int19 = strComparableDynamicArray0.getSize();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertNotNull(strComparableSpliterator14);
        org.junit.Assert.assertNotNull(iterator18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
    }

    @Test
    public void test5162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5162");
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
        java.util.Iterator iterator17 = strComparableDynamicArray0.iterator();
        java.lang.Class<?> wildcardClass18 = iterator17.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertNotNull(strComparableSpliterator5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertNotNull(strComparableSpliterator14);
        org.junit.Assert.assertNotNull(iterator17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test5163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5163");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "");
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream5 = strComparableDynamicArray0.stream();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream6 = strComparableDynamicArray0.stream();
        boolean boolean7 = strComparableDynamicArray0.isEmpty();
        int int8 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[[], ]");
        boolean boolean11 = strComparableDynamicArray0.isEmpty();
        org.junit.Assert.assertNotNull(strComparableStream5);
        org.junit.Assert.assertNotNull(strComparableStream6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test5164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5164");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray1 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>((int) (byte) 10);
        java.util.Iterator iterator2 = strComparableDynamicArray1.iterator();
        java.lang.Comparable<java.lang.String> strComparable4 = strComparableDynamicArray1.get(3);
        boolean boolean5 = strComparableDynamicArray1.isEmpty();
        java.util.Iterator iterator6 = strComparableDynamicArray1.iterator();
        java.lang.String str7 = strComparableDynamicArray1.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable9 = strComparableDynamicArray1.remove(4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertNull(strComparable4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
    }

    @Test
    public void test5165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5165");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        java.lang.Comparable<java.lang.String> strComparable4 = strComparableDynamicArray0.get(5);
        boolean boolean5 = strComparableDynamicArray0.isEmpty();
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableDynamicArray0.remove((int) (byte) 10);
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator8 = strComparableDynamicArray0.spliterator();
        int int9 = strComparableDynamicArray0.getSize();
        org.junit.Assert.assertNull(strComparable4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(strComparable7);
        org.junit.Assert.assertNotNull(strComparableSpliterator8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test5166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5166");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>> wildcardClassOfFieldDynamicArray1 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>(0);
    }

    @Test
    public void test5167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5167");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator4 = strComparableDynamicArray0.spliterator();
        java.lang.String str5 = strComparableDynamicArray0.toString();
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableDynamicArray0.remove((int) (short) 10);
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator8 = strComparableDynamicArray0.spliterator();
        java.lang.String str9 = strComparableDynamicArray0.toString();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[, hi!]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNull(strComparable7);
        org.junit.Assert.assertNotNull(strComparableSpliterator8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
    }

    @Test
    public void test5168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5168");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray1 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>((int) (byte) 10);
        strComparableDynamicArray1.put((int) (byte) 1, (java.lang.Comparable<java.lang.String>) "[[hi!]]");
        java.lang.String str5 = strComparableDynamicArray1.toString();
        java.lang.String str6 = strComparableDynamicArray1.toString();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream7 = strComparableDynamicArray1.stream();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream8 = strComparableDynamicArray1.stream();
        java.lang.String str9 = strComparableDynamicArray1.toString();
        strComparableDynamicArray1.add((java.lang.Comparable<java.lang.String>) "[hi!, [hi!, [hi!, []]]]");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator12 = strComparableDynamicArray1.spliterator();
        java.lang.Comparable<java.lang.String> strComparable14 = strComparableDynamicArray1.get((int) (short) 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[[[hi!]]]" + "'", str5, "[[[hi!]]]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[[[hi!]]]" + "'", str6, "[[[hi!]]]");
        org.junit.Assert.assertNotNull(strComparableStream7);
        org.junit.Assert.assertNotNull(strComparableStream8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[[[hi!]]]" + "'", str9, "[[[hi!]]]");
        org.junit.Assert.assertNotNull(strComparableSpliterator12);
        org.junit.Assert.assertEquals("'" + strComparable14 + "' != '" + "[[hi!]]" + "'", strComparable14, "[[hi!]]");
    }

    @Test
    public void test5169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5169");
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
        strComparableDynamicArray0.put((int) (byte) 1, (java.lang.Comparable<java.lang.String>) "[[], hi!, , ]");
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream16 = strComparableDynamicArray0.stream();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator17 = strComparableDynamicArray0.spliterator();
        java.lang.Class<?> wildcardClass18 = strComparableSpliterator17.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNull(strComparable8);
        org.junit.Assert.assertNotNull(strComparableStream9);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertNotNull(strComparableStream16);
        org.junit.Assert.assertNotNull(strComparableSpliterator17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test5170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5170");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator4 = strComparableDynamicArray0.spliterator();
        boolean boolean5 = strComparableDynamicArray0.isEmpty();
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableDynamicArray0.remove(1);
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[[hi!, hi!, [[], hi!]], ]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(strComparable7);
    }

    @Test
    public void test5171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5171");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator iterator6 = strComparableDynamicArray0.iterator();
        java.lang.String str7 = strComparableDynamicArray0.toString();
        strComparableDynamicArray0.put(10, (java.lang.Comparable<java.lang.String>) "[[hi!]]");
        int int11 = strComparableDynamicArray0.getSize();
        java.util.Iterator iterator12 = strComparableDynamicArray0.iterator();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream13 = strComparableDynamicArray0.stream();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[hi!]" + "'", str7, "[hi!]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertNotNull(strComparableStream13);
    }

    @Test
    public void test5172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5172");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        boolean boolean4 = strComparableDynamicArray0.isEmpty();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableDynamicArray0.remove((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + strComparable8 + "' != '" + "hi!" + "'", strComparable8, "hi!");
    }

    @Test
    public void test5173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5173");
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
        java.util.Iterator iterator20 = strComparableDynamicArray0.iterator();
        boolean boolean21 = strComparableDynamicArray0.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNull(strComparable8);
        org.junit.Assert.assertNotNull(strComparableSpliterator17);
        org.junit.Assert.assertNotNull(strComparableStream18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[[hi!, [hi!]], , []]" + "'", str19, "[[hi!, [hi!]], , []]");
        org.junit.Assert.assertNotNull(iterator20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test5174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5174");
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
        int int14 = strComparableDynamicArray0.getSize();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream15 = strComparableDynamicArray0.stream();
        boolean boolean16 = strComparableDynamicArray0.isEmpty();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream17 = strComparableDynamicArray0.stream();
        java.lang.Comparable<java.lang.String> strComparable19 = strComparableDynamicArray0.get((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertNotNull(strComparableSpliterator11);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertNotNull(strComparableStream15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strComparableStream17);
        org.junit.Assert.assertEquals("'" + strComparable19 + "' != '" + "hi!" + "'", strComparable19, "hi!");
    }

    @Test
    public void test5175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5175");
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
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[[[[], hi!, , ]]]");
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[hi!, [hi!], [hi!, hi!]]");
        strComparableDynamicArray0.put(10, (java.lang.Comparable<java.lang.String>) "[[, [[, ]]]]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNull(strComparable8);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertNotNull(strComparableStream12);
        org.junit.Assert.assertEquals("'" + strComparable14 + "' != '" + "hi!" + "'", strComparable14, "hi!");
        org.junit.Assert.assertNotNull(strComparableStream15);
    }

    @Test
    public void test5176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5176");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator4 = strComparableDynamicArray0.spliterator();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[hi!, [hi!]]");
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream7 = strComparableDynamicArray0.stream();
        java.lang.String str8 = strComparableDynamicArray0.toString();
        java.lang.String str9 = strComparableDynamicArray0.toString();
        boolean boolean10 = strComparableDynamicArray0.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertNotNull(strComparableStream7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[[hi!, [hi!]]]" + "'", str8, "[[hi!, [hi!]]]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[[hi!, [hi!]]]" + "'", str9, "[[hi!, [hi!]]]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test5177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5177");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray1 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>(10);
        boolean boolean2 = strComparableDynamicArray1.isEmpty();
        java.util.Iterator iterator3 = strComparableDynamicArray1.iterator();
        int int4 = strComparableDynamicArray1.getSize();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test5178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5178");
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
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[[hi!, hi!, [[], hi!]], []]");
        java.lang.String str17 = strComparableDynamicArray0.toString();
        java.util.Iterator iterator18 = strComparableDynamicArray0.iterator();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNull(strComparable8);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[hi!, hi!, , [[hi!, hi!, [[], hi!]], []]]" + "'", str17, "[hi!, hi!, , [[hi!, hi!, [[], hi!]], []]]");
        org.junit.Assert.assertNotNull(iterator18);
    }

    @Test
    public void test5179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5179");
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
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream12 = strComparableDynamicArray0.stream();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable14 = strComparableDynamicArray0.remove((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 16");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertNotNull(strComparableSpliterator8);
        org.junit.Assert.assertNull(strComparable10);
        org.junit.Assert.assertNotNull(strComparableSpliterator11);
        org.junit.Assert.assertNotNull(strComparableStream12);
    }

    @Test
    public void test5180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5180");
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
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[hi!, []]");
        java.lang.Class<?> wildcardClass15 = strComparableDynamicArray0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNotNull(strComparableSpliterator7);
        org.junit.Assert.assertEquals("'" + strComparable9 + "' != '" + "hi!" + "'", strComparable9, "hi!");
        org.junit.Assert.assertNull(strComparable11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test5181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5181");
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
        java.util.Iterator iterator21 = strComparableDynamicArray0.iterator();
        java.lang.Class<?> wildcardClass22 = strComparableDynamicArray0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNull(strComparable8);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertNotNull(strComparableSpliterator19);
        org.junit.Assert.assertNotNull(strComparableSpliterator20);
        org.junit.Assert.assertNotNull(iterator21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test5182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5182");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableDynamicArray0.isEmpty();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableDynamicArray0.isEmpty();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator5 = strComparableDynamicArray0.spliterator();
        boolean boolean6 = strComparableDynamicArray0.isEmpty();
        boolean boolean7 = strComparableDynamicArray0.isEmpty();
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableDynamicArray0.get(10);
        boolean boolean10 = strComparableDynamicArray0.isEmpty();
        java.lang.Class<?> wildcardClass11 = strComparableDynamicArray0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(strComparable9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test5183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5183");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "");
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDynamicArray0.put((int) (short) 0, (java.lang.Comparable<java.lang.String>) "[]");
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[[hi!]]");
        java.lang.String str10 = strComparableDynamicArray0.toString();
        boolean boolean11 = strComparableDynamicArray0.isEmpty();
        boolean boolean12 = strComparableDynamicArray0.isEmpty();
        java.util.Iterator iterator13 = strComparableDynamicArray0.iterator();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream14 = strComparableDynamicArray0.stream();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator15 = strComparableDynamicArray0.spliterator();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[[], hi!, [[hi!]]]" + "'", str10, "[[], hi!, [[hi!]]]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertNotNull(strComparableStream14);
        org.junit.Assert.assertNotNull(strComparableSpliterator15);
    }

    @Test
    public void test5184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5184");
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
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[hi!, hi!, [hi!]]");
        strComparableDynamicArray0.put((int) (byte) 10, (java.lang.Comparable<java.lang.String>) "[[hi!, hi!, [hi!], [hi!]], ]");
        java.lang.Comparable<java.lang.String> strComparable16 = null;
        strComparableDynamicArray0.add(strComparable16);
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[[[], hi!, , ]]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableStream6);
        org.junit.Assert.assertNotNull(strComparableStream7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test5185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5185");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableDynamicArray0.isEmpty();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream2 = strComparableDynamicArray0.stream();
        boolean boolean3 = strComparableDynamicArray0.isEmpty();
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableDynamicArray0.get((int) (byte) 1);
        boolean boolean6 = strComparableDynamicArray0.isEmpty();
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableDynamicArray0.get((int) (short) 1);
        int int9 = strComparableDynamicArray0.getSize();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator10 = strComparableDynamicArray0.spliterator();
        int int11 = strComparableDynamicArray0.getSize();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(strComparableStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(strComparable5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(strComparable8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(strComparableSpliterator10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test5186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5186");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Object> objDynamicArray1 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Object>(100);
    }

    @Test
    public void test5187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5187");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        boolean boolean4 = strComparableDynamicArray0.isEmpty();
        boolean boolean5 = strComparableDynamicArray0.isEmpty();
        int int6 = strComparableDynamicArray0.getSize();
        java.util.Iterator iterator7 = strComparableDynamicArray0.iterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator8 = strComparableDynamicArray0.spliterator();
        strComparableDynamicArray0.put((int) (byte) 1, (java.lang.Comparable<java.lang.String>) "[, []]");
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream12 = strComparableDynamicArray0.stream();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(strComparableSpliterator8);
        org.junit.Assert.assertNotNull(strComparableStream12);
    }

    @Test
    public void test5188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5188");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        boolean boolean4 = strComparableDynamicArray0.isEmpty();
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableDynamicArray0.remove((int) (short) 0);
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator7 = strComparableDynamicArray0.spliterator();
        int int8 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.put(3, (java.lang.Comparable<java.lang.String>) "[[[[hi!, hi!, [hi!]]], [, ]]]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(strComparable6);
        org.junit.Assert.assertNotNull(strComparableSpliterator7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test5189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5189");
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
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[hi!, [[hi!]]]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNull(strComparable8);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertNotNull(strComparableStream12);
        org.junit.Assert.assertEquals("'" + strComparable14 + "' != '" + "hi!" + "'", strComparable14, "hi!");
        org.junit.Assert.assertNotNull(strComparableStream15);
        org.junit.Assert.assertNotNull(strComparableSpliterator16);
    }

    @Test
    public void test5190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5190");
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
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[, hi!, , hi!]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(strComparableStream10);
        org.junit.Assert.assertNull(strComparable12);
    }

    @Test
    public void test5191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5191");
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
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator17 = strComparableDynamicArray0.spliterator();
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
        org.junit.Assert.assertNotNull(strComparableSpliterator17);
    }

    @Test
    public void test5192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5192");
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
        java.lang.String str12 = strComparableDynamicArray0.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[[, ]]" + "'", str12, "[[, ]]");
    }

    @Test
    public void test5193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5193");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray1 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>((int) (short) 100);
        strComparableDynamicArray1.put(2, (java.lang.Comparable<java.lang.String>) "[hi!, hi!, [, [hi!]]]");
        // The following exception was thrown during execution in test generation
        try {
            strComparableDynamicArray1.put((int) (short) -1, (java.lang.Comparable<java.lang.String>) "[[hi!, [[[[hi!]]], , [hi!, []], [[hi!]]]]]");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5194");
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
        boolean boolean14 = strComparableDynamicArray0.isEmpty();
        java.lang.String str15 = strComparableDynamicArray0.toString();
        java.lang.Comparable<java.lang.String> strComparable17 = strComparableDynamicArray0.remove((int) (short) 1);
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream18 = strComparableDynamicArray0.stream();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator9);
        org.junit.Assert.assertNull(strComparable13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[, [hi!]]" + "'", str15, "[, [hi!]]");
        org.junit.Assert.assertEquals("'" + strComparable17 + "' != '" + "" + "'", strComparable17, "");
        org.junit.Assert.assertNotNull(strComparableStream18);
    }

    @Test
    public void test5195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5195");
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
        java.lang.Class<?> wildcardClass14 = strComparableSpliterator13.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNull(strComparable7);
        org.junit.Assert.assertNotNull(strComparableStream8);
        org.junit.Assert.assertNotNull(strComparableStream9);
        org.junit.Assert.assertNotNull(strComparableSpliterator13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test5196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5196");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator4 = strComparableDynamicArray0.spliterator();
        java.lang.String str5 = strComparableDynamicArray0.toString();
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableDynamicArray0.remove((int) (short) 10);
        boolean boolean8 = strComparableDynamicArray0.isEmpty();
        boolean boolean9 = strComparableDynamicArray0.isEmpty();
        boolean boolean10 = strComparableDynamicArray0.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNull(strComparable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test5197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5197");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator iterator6 = strComparableDynamicArray0.iterator();
        boolean boolean7 = strComparableDynamicArray0.isEmpty();
        java.util.Iterator iterator8 = strComparableDynamicArray0.iterator();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[[[hi!]]]");
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[hi!, [hi!]]");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator13 = strComparableDynamicArray0.spliterator();
        int int14 = strComparableDynamicArray0.getSize();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(strComparableSpliterator13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
    }

    @Test
    public void test5198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5198");
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
        int int19 = strComparableDynamicArray0.getSize();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable21 = strComparableDynamicArray0.remove(100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 16");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test5199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5199");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        boolean boolean4 = strComparableDynamicArray0.isEmpty();
        boolean boolean5 = strComparableDynamicArray0.isEmpty();
        boolean boolean6 = strComparableDynamicArray0.isEmpty();
        int int7 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[[, ]]");
        boolean boolean10 = strComparableDynamicArray0.isEmpty();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator11 = strComparableDynamicArray0.spliterator();
        java.lang.String str12 = strComparableDynamicArray0.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[[[, ]]]" + "'", str12, "[[[, ]]]");
    }

    @Test
    public void test5200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5200");
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
        java.lang.Comparable<java.lang.String> strComparable13 = strComparableDynamicArray0.get(0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertNotNull(strComparableSpliterator5);
        org.junit.Assert.assertNull(strComparable10);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertNull(strComparable13);
    }

    @Test
    public void test5201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5201");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        boolean boolean4 = strComparableDynamicArray0.isEmpty();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableDynamicArray0.get(4);
        strComparableDynamicArray0.put(0, (java.lang.Comparable<java.lang.String>) "[[], hi!, , ]");
        java.lang.Comparable<java.lang.String> strComparable13 = strComparableDynamicArray0.get(0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(strComparable8);
        org.junit.Assert.assertEquals("'" + strComparable13 + "' != '" + "[[], hi!, , ]" + "'", strComparable13, "[[], hi!, , ]");
    }

    @Test
    public void test5202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5202");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray1 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>((int) (byte) 10);
        java.util.Iterator iterator2 = strComparableDynamicArray1.iterator();
        java.lang.Comparable<java.lang.String> strComparable4 = strComparableDynamicArray1.get(3);
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream5 = strComparableDynamicArray1.stream();
        java.util.Iterator iterator6 = strComparableDynamicArray1.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable8 = strComparableDynamicArray1.remove(3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertNull(strComparable4);
        org.junit.Assert.assertNotNull(strComparableStream5);
        org.junit.Assert.assertNotNull(iterator6);
    }

    @Test
    public void test5203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5203");
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
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[, ]");
        java.util.Iterator iterator16 = strComparableDynamicArray0.iterator();
        java.lang.Comparable<java.lang.String> strComparable18 = strComparableDynamicArray0.remove((int) (byte) 10);
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream19 = strComparableDynamicArray0.stream();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(strComparable6);
        org.junit.Assert.assertNotNull(strComparableSpliterator7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(iterator16);
        org.junit.Assert.assertEquals("'" + strComparable18 + "' != '" + "[hi!, hi!]" + "'", strComparable18, "[hi!, hi!]");
        org.junit.Assert.assertNotNull(strComparableStream19);
    }

    @Test
    public void test5204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5204");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator4 = strComparableDynamicArray0.spliterator();
        int int5 = strComparableDynamicArray0.getSize();
        java.util.Iterator iterator6 = strComparableDynamicArray0.iterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator7 = strComparableDynamicArray0.spliterator();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream8 = strComparableDynamicArray0.stream();
        java.lang.Comparable<java.lang.String> strComparable10 = strComparableDynamicArray0.get((int) (byte) 0);
        boolean boolean11 = strComparableDynamicArray0.isEmpty();
        int int12 = strComparableDynamicArray0.getSize();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator13 = strComparableDynamicArray0.spliterator();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertNotNull(strComparableSpliterator7);
        org.junit.Assert.assertNotNull(strComparableStream8);
        org.junit.Assert.assertNull(strComparable10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator13);
    }

    @Test
    public void test5205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5205");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableDynamicArray0.getSize();
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableDynamicArray0.get((int) (byte) 10);
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream9 = strComparableDynamicArray0.stream();
        java.lang.String str10 = strComparableDynamicArray0.toString();
        java.lang.Comparable<java.lang.String> strComparable12 = strComparableDynamicArray0.remove(5);
        int int13 = strComparableDynamicArray0.getSize();
        java.util.Iterator iterator14 = strComparableDynamicArray0.iterator();
        boolean boolean15 = strComparableDynamicArray0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable17 = strComparableDynamicArray0.remove((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 16");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNull(strComparable8);
        org.junit.Assert.assertNotNull(strComparableStream9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[hi!]" + "'", str10, "[hi!]");
        org.junit.Assert.assertNull(strComparable12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test5206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5206");
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
        // The following exception was thrown during execution in test generation
        try {
            strComparableDynamicArray0.put((int) 'a', (java.lang.Comparable<java.lang.String>) "[[, []]]");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97 out of bounds for length 16");
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
    }

    @Test
    public void test5207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5207");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "");
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator5 = strComparableDynamicArray0.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator6 = strComparableDynamicArray0.spliterator();
        strComparableDynamicArray0.put(2, (java.lang.Comparable<java.lang.String>) "[hi!, hi!, [hi!], [hi!]]");
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream10 = strComparableDynamicArray0.stream();
        java.util.Iterator iterator11 = strComparableDynamicArray0.iterator();
        org.junit.Assert.assertNotNull(strComparableSpliterator5);
        org.junit.Assert.assertNotNull(strComparableSpliterator6);
        org.junit.Assert.assertNotNull(strComparableStream10);
        org.junit.Assert.assertNotNull(iterator11);
    }

    @Test
    public void test5208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5208");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator4 = strComparableDynamicArray0.spliterator();
        boolean boolean5 = strComparableDynamicArray0.isEmpty();
        boolean boolean6 = strComparableDynamicArray0.isEmpty();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator9 = strComparableDynamicArray0.spliterator();
        java.lang.Comparable<java.lang.String> strComparable11 = strComparableDynamicArray0.get(2);
        java.util.Iterator iterator12 = strComparableDynamicArray0.iterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator13 = strComparableDynamicArray0.spliterator();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream14 = strComparableDynamicArray0.stream();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator9);
        org.junit.Assert.assertNull(strComparable11);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertNotNull(strComparableSpliterator13);
        org.junit.Assert.assertNotNull(strComparableStream14);
    }

    @Test
    public void test5209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5209");
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
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream14 = strComparableDynamicArray0.stream();
        java.util.Iterator iterator15 = strComparableDynamicArray0.iterator();
        boolean boolean16 = strComparableDynamicArray0.isEmpty();
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
        org.junit.Assert.assertNotNull(strComparableStream14);
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test5210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5210");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray1 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>(0);
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator2 = strComparableDynamicArray1.spliterator();
        int int3 = strComparableDynamicArray1.getSize();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream4 = strComparableDynamicArray1.stream();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream5 = strComparableDynamicArray1.stream();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator6 = strComparableDynamicArray1.spliterator();
        int int7 = strComparableDynamicArray1.getSize();
        org.junit.Assert.assertNotNull(strComparableSpliterator2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(strComparableStream4);
        org.junit.Assert.assertNotNull(strComparableStream5);
        org.junit.Assert.assertNotNull(strComparableSpliterator6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test5211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5211");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableDynamicArray0.isEmpty();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableDynamicArray0.isEmpty();
        int int5 = strComparableDynamicArray0.getSize();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream6 = strComparableDynamicArray0.stream();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(strComparableStream6);
    }

    @Test
    public void test5212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5212");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        boolean boolean3 = strComparableDynamicArray0.isEmpty();
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableDynamicArray0.remove(2);
        boolean boolean6 = strComparableDynamicArray0.isEmpty();
        java.lang.String str7 = strComparableDynamicArray0.toString();
        strComparableDynamicArray0.put(3, (java.lang.Comparable<java.lang.String>) "[[], hi!, , ]");
        strComparableDynamicArray0.put(4, (java.lang.Comparable<java.lang.String>) "[[], hi!, , ]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(strComparable5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
    }

    @Test
    public void test5213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5213");
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
        boolean boolean14 = strComparableDynamicArray0.isEmpty();
        java.lang.String str15 = strComparableDynamicArray0.toString();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator16 = strComparableDynamicArray0.spliterator();
        java.lang.Class<?> wildcardClass17 = strComparableDynamicArray0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[hi!, []]" + "'", str11, "[hi!, []]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[hi!, [], [hi!, hi!, [hi!], [hi!]]]" + "'", str15, "[hi!, [], [hi!, hi!, [hi!], [hi!]]]");
        org.junit.Assert.assertNotNull(strComparableSpliterator16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test5214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5214");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator4 = strComparableDynamicArray0.spliterator();
        boolean boolean5 = strComparableDynamicArray0.isEmpty();
        java.util.Iterator iterator6 = strComparableDynamicArray0.iterator();
        boolean boolean7 = strComparableDynamicArray0.isEmpty();
        java.util.Iterator iterator8 = strComparableDynamicArray0.iterator();
        java.lang.Class<?> wildcardClass9 = strComparableDynamicArray0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test5215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5215");
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
        int int18 = strComparableDynamicArray0.getSize();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator19 = strComparableDynamicArray0.spliterator();
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertNotNull(strComparableSpliterator19);
    }

    @Test
    public void test5216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5216");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray1 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>((int) (short) 10);
        strComparableDynamicArray1.add((java.lang.Comparable<java.lang.String>) "[, ]");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator4 = strComparableDynamicArray1.spliterator();
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableDynamicArray1.get(0);
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator7 = strComparableDynamicArray1.spliterator();
        // The following exception was thrown during execution in test generation
        try {
            strComparableDynamicArray1.put((int) (byte) 100, (java.lang.Comparable<java.lang.String>) "[[, [[hi!]]]]");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertEquals("'" + strComparable6 + "' != '" + "[, ]" + "'", strComparable6, "[, ]");
        org.junit.Assert.assertNotNull(strComparableSpliterator7);
    }

    @Test
    public void test5217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5217");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray1 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>((int) (short) 10);
        strComparableDynamicArray1.put(4, (java.lang.Comparable<java.lang.String>) "[hi!, []]");
        java.lang.String str5 = strComparableDynamicArray1.toString();
        java.lang.String str6 = strComparableDynamicArray1.toString();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream7 = strComparableDynamicArray1.stream();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[[hi!, []]]" + "'", str5, "[[hi!, []]]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[[hi!, []]]" + "'", str6, "[[hi!, []]]");
        org.junit.Assert.assertNotNull(strComparableStream7);
    }

    @Test
    public void test5218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5218");
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
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator13 = strComparableDynamicArray0.spliterator();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strComparableStream10);
        org.junit.Assert.assertNotNull(strComparableSpliterator13);
    }

    @Test
    public void test5219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5219");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableDynamicArray0.getSize();
        java.util.Iterator iterator7 = strComparableDynamicArray0.iterator();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[[], hi!, , ]");
        java.lang.String str10 = strComparableDynamicArray0.toString();
        boolean boolean11 = strComparableDynamicArray0.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[hi!, [[], hi!, , ]]" + "'", str10, "[hi!, [[], hi!, , ]]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test5220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5220");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray1 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>((int) (short) 10);
        strComparableDynamicArray1.add((java.lang.Comparable<java.lang.String>) "[, ]");
        boolean boolean4 = strComparableDynamicArray1.isEmpty();
        java.util.Iterator iterator5 = strComparableDynamicArray1.iterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator6 = strComparableDynamicArray1.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator7 = strComparableDynamicArray1.spliterator();
        boolean boolean8 = strComparableDynamicArray1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertNotNull(strComparableSpliterator6);
        org.junit.Assert.assertNotNull(strComparableSpliterator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test5221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5221");
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
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[hi!, [[hi!]]]");
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
    public void test5222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5222");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray1 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>(100);
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream2 = strComparableDynamicArray1.stream();
        strComparableDynamicArray1.add((java.lang.Comparable<java.lang.String>) "");
        java.util.Iterator iterator5 = strComparableDynamicArray1.iterator();
        boolean boolean6 = strComparableDynamicArray1.isEmpty();
        boolean boolean7 = strComparableDynamicArray1.isEmpty();
        int int8 = strComparableDynamicArray1.getSize();
        org.junit.Assert.assertNotNull(strComparableStream2);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test5223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5223");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableDynamicArray0.getSize();
        java.lang.String str7 = strComparableDynamicArray0.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[hi!]" + "'", str7, "[hi!]");
    }

    @Test
    public void test5224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5224");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableDynamicArray0.isEmpty();
        java.lang.String str2 = strComparableDynamicArray0.toString();
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDynamicArray0.add(strComparable3);
        java.util.Iterator iterator5 = strComparableDynamicArray0.iterator();
        boolean boolean6 = strComparableDynamicArray0.isEmpty();
        java.lang.String str7 = strComparableDynamicArray0.toString();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
    }

    @Test
    public void test5225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5225");
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
        int int14 = strComparableDynamicArray0.getSize();
        int int15 = strComparableDynamicArray0.getSize();
        java.util.Iterator iterator16 = strComparableDynamicArray0.iterator();
        java.lang.Comparable<java.lang.String> strComparable18 = strComparableDynamicArray0.get(5);
        java.util.Iterator iterator19 = strComparableDynamicArray0.iterator();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[[], [hi!, [hi!, []]], ]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[hi!, []]" + "'", str11, "[hi!, []]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertNotNull(iterator16);
        org.junit.Assert.assertNull(strComparable18);
        org.junit.Assert.assertNotNull(iterator19);
    }

    @Test
    public void test5226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5226");
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
        java.util.Iterator iterator19 = strComparableDynamicArray0.iterator();
        java.lang.Comparable<java.lang.String> strComparable21 = strComparableDynamicArray0.remove((int) (short) 10);
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[hi!, [[], hi!, , ]]");
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream24 = strComparableDynamicArray0.stream();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNull(strComparable8);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertEquals("'" + strComparable16 + "' != '" + "[[], hi!]" + "'", strComparable16, "[[], hi!]");
        org.junit.Assert.assertNotNull(iterator19);
        org.junit.Assert.assertEquals("'" + strComparable21 + "' != '" + "[[], hi!]" + "'", strComparable21, "[[], hi!]");
        org.junit.Assert.assertNotNull(strComparableStream24);
    }

    @Test
    public void test5227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5227");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableDynamicArray0.isEmpty();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream2 = strComparableDynamicArray0.stream();
        java.lang.Comparable<java.lang.String> strComparable4 = strComparableDynamicArray0.get(1);
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableDynamicArray0.remove(10);
        java.util.Iterator iterator9 = strComparableDynamicArray0.iterator();
        strComparableDynamicArray0.put((int) (short) 10, (java.lang.Comparable<java.lang.String>) "[hi!]");
        java.lang.Class<?> wildcardClass13 = strComparableDynamicArray0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(strComparableStream2);
        org.junit.Assert.assertNull(strComparable4);
        org.junit.Assert.assertNull(strComparable8);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test5228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5228");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.constant.ConstantDesc> constantDescDynamicArray1 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.constant.ConstantDesc>(5);
    }

    @Test
    public void test5229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5229");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        boolean boolean3 = strComparableDynamicArray0.isEmpty();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[]");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator6 = strComparableDynamicArray0.spliterator();
        int int7 = strComparableDynamicArray0.getSize();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator8 = strComparableDynamicArray0.spliterator();
        int int9 = strComparableDynamicArray0.getSize();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator10 = strComparableDynamicArray0.spliterator();
        int int11 = strComparableDynamicArray0.getSize();
        int int12 = strComparableDynamicArray0.getSize();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNotNull(strComparableSpliterator8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertNotNull(strComparableSpliterator10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
    }

    @Test
    public void test5230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5230");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableDynamicArray0.isEmpty();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableDynamicArray0.isEmpty();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator5 = strComparableDynamicArray0.spliterator();
        boolean boolean6 = strComparableDynamicArray0.isEmpty();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[[], hi!, , ]");
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[[[hi!, [hi!]]], [[[[hi!]]], , [hi!, []], [[hi!]]]]");
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[, [[hi!]]]");
        strComparableDynamicArray0.put((int) (short) 0, (java.lang.Comparable<java.lang.String>) "[[], hi!, [[hi!]]]");
        boolean boolean16 = strComparableDynamicArray0.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test5231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5231");
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
        boolean boolean19 = strComparableDynamicArray0.isEmpty();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator20 = strComparableDynamicArray0.spliterator();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[[hi!], [hi!, hi!]]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertNotNull(strComparableSpliterator14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator20);
    }

    @Test
    public void test5232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5232");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator4 = strComparableDynamicArray0.spliterator();
        strComparableDynamicArray0.put((int) (byte) 10, (java.lang.Comparable<java.lang.String>) "");
        java.util.Iterator iterator8 = strComparableDynamicArray0.iterator();
        int int9 = strComparableDynamicArray0.getSize();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator10 = strComparableDynamicArray0.spliterator();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[[], hi!]");
        strComparableDynamicArray0.put(5, (java.lang.Comparable<java.lang.String>) "[hi!, [], , [[, ], [hi!], [hi!, hi!], [[], hi!]]]");
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream16 = strComparableDynamicArray0.stream();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator10);
        org.junit.Assert.assertNotNull(strComparableStream16);
    }

    @Test
    public void test5233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5233");
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
        java.util.Iterator iterator15 = strComparableDynamicArray0.iterator();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream16 = strComparableDynamicArray0.stream();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(strComparable12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertNotNull(strComparableSpliterator14);
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertNotNull(strComparableStream16);
    }

    @Test
    public void test5234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5234");
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
        java.lang.Comparable<java.lang.String> strComparable14 = strComparableDynamicArray0.get(0);
        java.lang.Comparable<java.lang.String> strComparable16 = strComparableDynamicArray0.get(3);
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator17 = strComparableDynamicArray0.spliterator();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertNotNull(strComparableSpliterator11);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertNull(strComparable14);
        org.junit.Assert.assertNull(strComparable16);
        org.junit.Assert.assertNotNull(strComparableSpliterator17);
    }

    @Test
    public void test5235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5235");
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
        boolean boolean17 = strComparableDynamicArray0.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[hi!, []]" + "'", str10, "[hi!, []]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[hi!, []]" + "'", str11, "[hi!, []]");
        org.junit.Assert.assertNotNull(strComparableStream12);
        org.junit.Assert.assertNotNull(strComparableSpliterator13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test5236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5236");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray1 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>((int) (byte) 10);
        java.util.Iterator iterator2 = strComparableDynamicArray1.iterator();
        strComparableDynamicArray1.add((java.lang.Comparable<java.lang.String>) "[[], hi!]");
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableDynamicArray1.remove((int) (byte) 0);
        int int7 = strComparableDynamicArray1.getSize();
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertEquals("'" + strComparable6 + "' != '" + "[[], hi!]" + "'", strComparable6, "[[], hi!]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test5237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5237");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray1 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>(100);
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream2 = strComparableDynamicArray1.stream();
        strComparableDynamicArray1.add((java.lang.Comparable<java.lang.String>) "");
        strComparableDynamicArray1.put(1, (java.lang.Comparable<java.lang.String>) "[[hi!]]");
        strComparableDynamicArray1.add((java.lang.Comparable<java.lang.String>) "[hi!, []]");
        strComparableDynamicArray1.put(1, (java.lang.Comparable<java.lang.String>) "[hi!, hi!, [hi!], [hi!, []]]");
        org.junit.Assert.assertNotNull(strComparableStream2);
    }

    @Test
    public void test5238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5238");
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
        boolean boolean21 = strComparableDynamicArray0.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNull(strComparable8);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertNull(strComparable13);
        org.junit.Assert.assertNull(strComparable15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(strComparableStream20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test5239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5239");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray1 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>(100);
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream2 = strComparableDynamicArray1.stream();
        strComparableDynamicArray1.add((java.lang.Comparable<java.lang.String>) "");
        java.util.Iterator iterator5 = strComparableDynamicArray1.iterator();
        strComparableDynamicArray1.put((int) '4', (java.lang.Comparable<java.lang.String>) "[]");
        int int9 = strComparableDynamicArray1.getSize();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator10 = strComparableDynamicArray1.spliterator();
        int int11 = strComparableDynamicArray1.getSize();
        java.lang.Comparable<java.lang.String> strComparable13 = strComparableDynamicArray1.get((int) '4');
        org.junit.Assert.assertNotNull(strComparableStream2);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + strComparable13 + "' != '" + "[]" + "'", strComparable13, "[]");
    }

    @Test
    public void test5240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5240");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator4 = strComparableDynamicArray0.spliterator();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator7 = strComparableDynamicArray0.spliterator();
        int int8 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.put(4, (java.lang.Comparable<java.lang.String>) "[hi!, hi!, [hi!, [], [hi!]], [[], hi!]]");
        // The following exception was thrown during execution in test generation
        try {
            strComparableDynamicArray0.put((int) '#', (java.lang.Comparable<java.lang.String>) "[hi!, [], [, hi!, , hi!], [[[[], hi!, , ]]]]");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 16");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertNotNull(strComparableSpliterator7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
    }

    @Test
    public void test5241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5241");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        boolean boolean3 = strComparableDynamicArray0.isEmpty();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[, ]");
        java.util.Iterator iterator6 = strComparableDynamicArray0.iterator();
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableDynamicArray0.remove(3);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertNull(strComparable8);
    }

    @Test
    public void test5242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5242");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "");
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDynamicArray0.put((int) (short) 0, (java.lang.Comparable<java.lang.String>) "[]");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator8 = strComparableDynamicArray0.spliterator();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream9 = strComparableDynamicArray0.stream();
        int int10 = strComparableDynamicArray0.getSize();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream11 = strComparableDynamicArray0.stream();
        // The following exception was thrown during execution in test generation
        try {
            strComparableDynamicArray0.put(100, (java.lang.Comparable<java.lang.String>) "[[[[hi!, [hi!]]], [[[[hi!]]], , [hi!, []], [[hi!]]]], [[hi!, hi!, [hi!]]]]");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 16");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strComparableSpliterator8);
        org.junit.Assert.assertNotNull(strComparableStream9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertNotNull(strComparableStream11);
    }

    @Test
    public void test5243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5243");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "");
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDynamicArray0.put((int) (short) 0, (java.lang.Comparable<java.lang.String>) "[]");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator8 = strComparableDynamicArray0.spliterator();
        strComparableDynamicArray0.put(10, (java.lang.Comparable<java.lang.String>) "");
        boolean boolean12 = strComparableDynamicArray0.isEmpty();
        java.lang.String str13 = strComparableDynamicArray0.toString();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator14 = strComparableDynamicArray0.spliterator();
        java.lang.Comparable<java.lang.String> strComparable16 = strComparableDynamicArray0.remove((int) (byte) 1);
        int int17 = strComparableDynamicArray0.getSize();
        org.junit.Assert.assertNotNull(strComparableSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[[], hi!, ]" + "'", str13, "[[], hi!, ]");
        org.junit.Assert.assertNotNull(strComparableSpliterator14);
        org.junit.Assert.assertEquals("'" + strComparable16 + "' != '" + "hi!" + "'", strComparable16, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test5244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5244");
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
        int int23 = strComparableDynamicArray0.getSize();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream24 = strComparableDynamicArray0.stream();
        org.junit.Assert.assertNotNull(strComparableSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strComparableStream13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[[], hi!, , ]" + "'", str17, "[[], hi!, , ]");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[[], hi!, , ]" + "'", str18, "[[], hi!, , ]");
        org.junit.Assert.assertEquals("'" + strComparable20 + "' != '" + "" + "'", strComparable20, "");
        org.junit.Assert.assertNotNull(strComparableSpliterator21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 3 + "'", int23 == 3);
        org.junit.Assert.assertNotNull(strComparableStream24);
    }

    @Test
    public void test5245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5245");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "");
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDynamicArray0.put((int) (short) 0, (java.lang.Comparable<java.lang.String>) "[]");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator8 = strComparableDynamicArray0.spliterator();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream9 = strComparableDynamicArray0.stream();
        int int10 = strComparableDynamicArray0.getSize();
        java.util.Iterator iterator11 = strComparableDynamicArray0.iterator();
        int int12 = strComparableDynamicArray0.getSize();
        org.junit.Assert.assertNotNull(strComparableSpliterator8);
        org.junit.Assert.assertNotNull(strComparableStream9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
    }

    @Test
    public void test5246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5246");
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
        java.lang.String str11 = strComparableDynamicArray0.toString();
        java.lang.String str12 = strComparableDynamicArray0.toString();
        java.util.Iterator iterator13 = strComparableDynamicArray0.iterator();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertNotNull(strComparableSpliterator5);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertNull(strComparable8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertNotNull(strComparableSpliterator10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[]" + "'", str12, "[]");
        org.junit.Assert.assertNotNull(iterator13);
    }

    @Test
    public void test5247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5247");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableDynamicArray0.isEmpty();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream4 = strComparableDynamicArray0.stream();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream5 = strComparableDynamicArray0.stream();
        boolean boolean6 = strComparableDynamicArray0.isEmpty();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator7 = strComparableDynamicArray0.spliterator();
        java.lang.String str8 = strComparableDynamicArray0.toString();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(strComparableStream4);
        org.junit.Assert.assertNotNull(strComparableStream5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[hi!]" + "'", str8, "[hi!]");
    }

    @Test
    public void test5248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5248");
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
        int int12 = strComparableDynamicArray0.getSize();
        java.lang.Comparable<java.lang.String> strComparable14 = strComparableDynamicArray0.remove((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertNotNull(strComparableStream7);
        org.junit.Assert.assertNull(strComparable9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNull(strComparable14);
    }

    @Test
    public void test5249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5249");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator iterator6 = strComparableDynamicArray0.iterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator7 = strComparableDynamicArray0.spliterator();
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableDynamicArray0.get(0);
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[[hi!, hi!, [hi!], [hi!]]]");
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream12 = strComparableDynamicArray0.stream();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertNotNull(strComparableSpliterator7);
        org.junit.Assert.assertNull(strComparable9);
        org.junit.Assert.assertNotNull(strComparableStream12);
    }

    @Test
    public void test5250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5250");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[hi!, []]");
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream5 = strComparableDynamicArray0.stream();
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableDynamicArray0.get((int) (short) 0);
        boolean boolean8 = strComparableDynamicArray0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable10 = strComparableDynamicArray0.remove((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 52 out of bounds for length 16");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strComparableStream5);
        org.junit.Assert.assertNull(strComparable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test5251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5251");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray1 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>((int) (short) 10);
        strComparableDynamicArray1.add((java.lang.Comparable<java.lang.String>) "[, ]");
        int int4 = strComparableDynamicArray1.getSize();
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableDynamicArray1.remove(1);
        java.lang.String str7 = strComparableDynamicArray1.toString();
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableDynamicArray1.get(1);
        java.util.Iterator iterator10 = strComparableDynamicArray1.iterator();
        java.lang.String str11 = strComparableDynamicArray1.toString();
        java.util.Iterator iterator12 = strComparableDynamicArray1.iterator();
        java.lang.Class<?> wildcardClass13 = strComparableDynamicArray1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNull(strComparable6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertNull(strComparable9);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test5252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5252");
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
        java.lang.Comparable<java.lang.String> strComparable11 = null;
        strComparableDynamicArray0.add(strComparable11);
        java.lang.Comparable<java.lang.String> strComparable14 = strComparableDynamicArray0.remove(0);
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[[hi!, hi!], []]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strComparableStream6);
        org.junit.Assert.assertNotNull(strComparableStream7);
        org.junit.Assert.assertNull(strComparable9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertNull(strComparable14);
    }

    @Test
    public void test5253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5253");
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
        java.lang.String str25 = strComparableDynamicArray0.toString();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[, [hi!, []]]");
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream28 = strComparableDynamicArray0.stream();
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
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "[[, ], [hi!], [hi!, hi!], [[], hi!]]" + "'", str25, "[[, ], [hi!], [hi!, hi!], [[], hi!]]");
        org.junit.Assert.assertNotNull(strComparableStream28);
    }

    @Test
    public void test5254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5254");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableDynamicArray0.isEmpty();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableDynamicArray0.isEmpty();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator5 = strComparableDynamicArray0.spliterator();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream6 = strComparableDynamicArray0.stream();
        java.lang.String str7 = strComparableDynamicArray0.toString();
        java.lang.String str8 = strComparableDynamicArray0.toString();
        java.lang.Class<?> wildcardClass9 = strComparableDynamicArray0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator5);
        org.junit.Assert.assertNotNull(strComparableStream6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[hi!]" + "'", str7, "[hi!]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[hi!]" + "'", str8, "[hi!]");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test5255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5255");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        boolean boolean3 = strComparableDynamicArray0.isEmpty();
        java.lang.String str4 = strComparableDynamicArray0.toString();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator5 = strComparableDynamicArray0.spliterator();
        boolean boolean6 = strComparableDynamicArray0.isEmpty();
        java.util.Iterator iterator7 = strComparableDynamicArray0.iterator();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream8 = strComparableDynamicArray0.stream();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertNotNull(strComparableSpliterator5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(strComparableStream8);
    }

    @Test
    public void test5256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5256");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator4 = strComparableDynamicArray0.spliterator();
        java.lang.String str5 = strComparableDynamicArray0.toString();
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableDynamicArray0.remove((int) (short) 10);
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator8 = strComparableDynamicArray0.spliterator();
        java.lang.String str9 = strComparableDynamicArray0.toString();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[[[], hi!, , ], hi!]");
        int int12 = strComparableDynamicArray0.getSize();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNull(strComparable7);
        org.junit.Assert.assertNotNull(strComparableSpliterator8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test5257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5257");
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
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream11 = strComparableDynamicArray0.stream();
        strComparableDynamicArray0.put(10, (java.lang.Comparable<java.lang.String>) "[[hi!, [hi!, []]], ]");
        java.util.Iterator iterator15 = strComparableDynamicArray0.iterator();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(strComparable9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertNotNull(strComparableStream11);
        org.junit.Assert.assertNotNull(iterator15);
    }

    @Test
    public void test5258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5258");
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
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable16 = strComparableDynamicArray0.get((int) (short) 10);
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator17 = strComparableDynamicArray0.spliterator();
        java.lang.Comparable<java.lang.String> strComparable19 = strComparableDynamicArray0.get((int) (byte) 1);
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream20 = strComparableDynamicArray0.stream();
        int int21 = strComparableDynamicArray0.getSize();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator8);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[[hi!]]" + "'", str12, "[[hi!]]");
        org.junit.Assert.assertNull(strComparable16);
        org.junit.Assert.assertNotNull(strComparableSpliterator17);
        org.junit.Assert.assertEquals("'" + strComparable19 + "' != '" + "" + "'", strComparable19, "");
        org.junit.Assert.assertNotNull(strComparableStream20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
    }

    @Test
    public void test5259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5259");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.reflect.GenericDeclaration> genericDeclarationDynamicArray1 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.reflect.GenericDeclaration>(5);
    }

    @Test
    public void test5260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5260");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "");
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator5 = strComparableDynamicArray0.spliterator();
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableDynamicArray0.remove(2);
        java.util.Iterator iterator8 = strComparableDynamicArray0.iterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator9 = strComparableDynamicArray0.spliterator();
        strComparableDynamicArray0.put((int) (short) 10, (java.lang.Comparable<java.lang.String>) "[[hi!, hi!, [hi!], [hi!]]]");
        java.util.Iterator iterator13 = strComparableDynamicArray0.iterator();
        org.junit.Assert.assertNotNull(strComparableSpliterator5);
        org.junit.Assert.assertNull(strComparable7);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(strComparableSpliterator9);
        org.junit.Assert.assertNotNull(iterator13);
    }

    @Test
    public void test5261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5261");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator4 = strComparableDynamicArray0.spliterator();
        strComparableDynamicArray0.put((int) (byte) 10, (java.lang.Comparable<java.lang.String>) "");
        java.util.Iterator iterator8 = strComparableDynamicArray0.iterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator9 = strComparableDynamicArray0.spliterator();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream10 = strComparableDynamicArray0.stream();
        java.lang.Comparable<java.lang.String> strComparable12 = strComparableDynamicArray0.get((int) (short) 0);
        strComparableDynamicArray0.put((int) (short) 10, (java.lang.Comparable<java.lang.String>) "[hi!, ]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(strComparableSpliterator9);
        org.junit.Assert.assertNotNull(strComparableStream10);
        org.junit.Assert.assertNull(strComparable12);
    }

    @Test
    public void test5262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5262");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator4 = strComparableDynamicArray0.spliterator();
        java.lang.String str5 = strComparableDynamicArray0.toString();
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableDynamicArray0.remove((int) (short) 10);
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator8 = strComparableDynamicArray0.spliterator();
        java.util.Iterator iterator9 = strComparableDynamicArray0.iterator();
        java.lang.Comparable<java.lang.String> strComparable11 = strComparableDynamicArray0.get(4);
        int int12 = strComparableDynamicArray0.getSize();
        java.util.Iterator iterator13 = strComparableDynamicArray0.iterator();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNull(strComparable7);
        org.junit.Assert.assertNotNull(strComparableSpliterator8);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNull(strComparable11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(iterator13);
    }

    @Test
    public void test5263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5263");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.String str1 = strComparableDynamicArray0.toString();
        strComparableDynamicArray0.put(0, (java.lang.Comparable<java.lang.String>) "[hi!]");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator5 = strComparableDynamicArray0.spliterator();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream6 = strComparableDynamicArray0.stream();
        java.util.Iterator iterator7 = strComparableDynamicArray0.iterator();
        int int8 = strComparableDynamicArray0.getSize();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream9 = strComparableDynamicArray0.stream();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "[]" + "'", str1, "[]");
        org.junit.Assert.assertNotNull(strComparableSpliterator5);
        org.junit.Assert.assertNotNull(strComparableStream6);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(strComparableStream9);
    }

    @Test
    public void test5264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5264");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        boolean boolean3 = strComparableDynamicArray0.isEmpty();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[]");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator6 = strComparableDynamicArray0.spliterator();
        int int7 = strComparableDynamicArray0.getSize();
        int int8 = strComparableDynamicArray0.getSize();
        java.lang.Comparable<java.lang.String> strComparable10 = strComparableDynamicArray0.remove((int) (short) 0);
        java.util.Iterator iterator11 = strComparableDynamicArray0.iterator();
        java.lang.Class<?> wildcardClass12 = strComparableDynamicArray0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertNull(strComparable10);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test5265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5265");
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
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator16 = strComparableDynamicArray0.spliterator();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[[[hi!, [hi!]]], ]");
        java.lang.String str19 = strComparableDynamicArray0.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable21 = strComparableDynamicArray0.remove((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 16");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strComparableSpliterator8);
        org.junit.Assert.assertNotNull(strComparableStream9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[[], hi!, [hi!, hi!, [hi!], [hi!]]]" + "'", str14, "[[], hi!, [hi!, hi!, [hi!], [hi!]]]");
        org.junit.Assert.assertNotNull(strComparableSpliterator15);
        org.junit.Assert.assertNotNull(strComparableSpliterator16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[[], hi!, [hi!, hi!, [hi!], [hi!]], [[[hi!, [hi!]]], ]]" + "'", str19, "[[], hi!, [hi!, hi!, [hi!], [hi!]], [[[hi!, [hi!]]], ]]");
    }

    @Test
    public void test5266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5266");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator4 = strComparableDynamicArray0.spliterator();
        boolean boolean5 = strComparableDynamicArray0.isEmpty();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator6 = strComparableDynamicArray0.spliterator();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream7 = strComparableDynamicArray0.stream();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[hi!, hi!, [hi!]]");
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[[[[hi!]]], , [hi!, []], [[hi!]]]");
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[hi!, [hi!], [hi!, hi!], [[], hi!]]");
        int int14 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.put((int) (byte) 10, (java.lang.Comparable<java.lang.String>) "[[hi!, []], [hi!, [hi!]]]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator6);
        org.junit.Assert.assertNotNull(strComparableStream7);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
    }

    @Test
    public void test5267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5267");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray1 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>((int) (byte) 10);
        strComparableDynamicArray1.put((int) (byte) 1, (java.lang.Comparable<java.lang.String>) "[[hi!]]");
        java.lang.String str5 = strComparableDynamicArray1.toString();
        java.lang.String str6 = strComparableDynamicArray1.toString();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream7 = strComparableDynamicArray1.stream();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream8 = strComparableDynamicArray1.stream();
        java.lang.String str9 = strComparableDynamicArray1.toString();
        strComparableDynamicArray1.add((java.lang.Comparable<java.lang.String>) "[hi!, [hi!, [hi!, []]]]");
        java.lang.Comparable<java.lang.String> strComparable12 = null;
        strComparableDynamicArray1.add(strComparable12);
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator14 = strComparableDynamicArray1.spliterator();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[[[hi!]]]" + "'", str5, "[[[hi!]]]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[[[hi!]]]" + "'", str6, "[[[hi!]]]");
        org.junit.Assert.assertNotNull(strComparableStream7);
        org.junit.Assert.assertNotNull(strComparableStream8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[[[hi!]]]" + "'", str9, "[[[hi!]]]");
        org.junit.Assert.assertNotNull(strComparableSpliterator14);
    }

    @Test
    public void test5268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5268");
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
        java.lang.String str17 = strComparableDynamicArray0.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[hi!]" + "'", str8, "[hi!]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator11);
        org.junit.Assert.assertNull(strComparable13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[hi!, [hi!, , []]]" + "'", str16, "[hi!, [hi!, , []]]");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[hi!, [hi!, , []]]" + "'", str17, "[hi!, [hi!, , []]]");
    }

    @Test
    public void test5269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5269");
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
        java.lang.Comparable<java.lang.String> strComparable16 = strComparableDynamicArray0.get(3);
        boolean boolean17 = strComparableDynamicArray0.isEmpty();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[hi!, [hi!], [[], hi!]]");
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream20 = strComparableDynamicArray0.stream();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNull(strComparable8);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertNull(strComparable13);
        org.junit.Assert.assertNotNull(strComparableStream14);
        org.junit.Assert.assertNull(strComparable16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strComparableStream20);
    }

    @Test
    public void test5270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5270");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator4 = strComparableDynamicArray0.spliterator();
        java.lang.String str5 = strComparableDynamicArray0.toString();
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableDynamicArray0.remove((int) (short) 10);
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator8 = strComparableDynamicArray0.spliterator();
        java.util.Iterator iterator9 = strComparableDynamicArray0.iterator();
        java.lang.Comparable<java.lang.String> strComparable11 = strComparableDynamicArray0.get(2);
        java.lang.String str12 = strComparableDynamicArray0.toString();
        java.lang.String str13 = strComparableDynamicArray0.toString();
        int int14 = strComparableDynamicArray0.getSize();
        boolean boolean15 = strComparableDynamicArray0.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNull(strComparable7);
        org.junit.Assert.assertNotNull(strComparableSpliterator8);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNull(strComparable11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[]" + "'", str12, "[]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[]" + "'", str13, "[]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test5271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5271");
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
        java.lang.Class<?> wildcardClass19 = iterator18.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test5272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5272");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray1 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>((int) (short) 10);
        strComparableDynamicArray1.add((java.lang.Comparable<java.lang.String>) "[, ]");
        int int4 = strComparableDynamicArray1.getSize();
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableDynamicArray1.remove(1);
        java.lang.String str7 = strComparableDynamicArray1.toString();
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableDynamicArray1.get(1);
        java.util.Iterator iterator10 = strComparableDynamicArray1.iterator();
        java.lang.Comparable<java.lang.String> strComparable12 = strComparableDynamicArray1.get((int) (byte) 1);
        int int13 = strComparableDynamicArray1.getSize();
        int int14 = strComparableDynamicArray1.getSize();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable16 = strComparableDynamicArray1.get((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNull(strComparable6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertNull(strComparable9);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertNull(strComparable12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test5273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5273");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator iterator6 = strComparableDynamicArray0.iterator();
        java.lang.String str7 = strComparableDynamicArray0.toString();
        strComparableDynamicArray0.put(10, (java.lang.Comparable<java.lang.String>) "[[hi!]]");
        int int11 = strComparableDynamicArray0.getSize();
        java.util.Iterator iterator12 = strComparableDynamicArray0.iterator();
        java.util.Iterator iterator13 = strComparableDynamicArray0.iterator();
        java.lang.Class<?> wildcardClass14 = strComparableDynamicArray0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[hi!]" + "'", str7, "[hi!]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test5274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5274");
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
        // The following exception was thrown during execution in test generation
        try {
            strComparableDynamicArray0.put((int) (short) -1, (java.lang.Comparable<java.lang.String>) "[[hi!, [], , [[, ], [hi!], [hi!, hi!], [[], hi!]]]]");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 16");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[hi!]" + "'", str8, "[hi!]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[hi!]" + "'", str9, "[hi!]");
        org.junit.Assert.assertNull(strComparable11);
        org.junit.Assert.assertNotNull(strComparableSpliterator12);
    }

    @Test
    public void test5275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5275");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable18 = strComparableDynamicArray0.get((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
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
    }

    @Test
    public void test5276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5276");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray1 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>((int) (short) 10);
        strComparableDynamicArray1.add((java.lang.Comparable<java.lang.String>) "[, ]");
        boolean boolean4 = strComparableDynamicArray1.isEmpty();
        boolean boolean5 = strComparableDynamicArray1.isEmpty();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream6 = strComparableDynamicArray1.stream();
        int int7 = strComparableDynamicArray1.getSize();
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableDynamicArray1.get(0);
        java.lang.String str10 = strComparableDynamicArray1.toString();
        strComparableDynamicArray1.put(6, (java.lang.Comparable<java.lang.String>) "[[, [hi!], [[], hi!, , ], [[, ]]], [hi!]]");
        java.lang.Class<?> wildcardClass14 = strComparableDynamicArray1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strComparableStream6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + strComparable9 + "' != '" + "[, ]" + "'", strComparable9, "[, ]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[[, ]]" + "'", str10, "[[, ]]");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test5277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5277");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "");
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator5 = strComparableDynamicArray0.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator6 = strComparableDynamicArray0.spliterator();
        int int7 = strComparableDynamicArray0.getSize();
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableDynamicArray0.remove((int) (byte) 0);
        java.lang.Comparable<java.lang.String> strComparable11 = strComparableDynamicArray0.get((int) (short) 1);
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream12 = strComparableDynamicArray0.stream();
        org.junit.Assert.assertNotNull(strComparableSpliterator5);
        org.junit.Assert.assertNotNull(strComparableSpliterator6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertEquals("'" + strComparable9 + "' != '" + "" + "'", strComparable9, "");
        org.junit.Assert.assertNull(strComparable11);
        org.junit.Assert.assertNotNull(strComparableStream12);
    }

    @Test
    public void test5278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5278");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator4 = strComparableDynamicArray0.spliterator();
        boolean boolean5 = strComparableDynamicArray0.isEmpty();
        java.util.Iterator iterator6 = strComparableDynamicArray0.iterator();
        java.util.Iterator iterator7 = strComparableDynamicArray0.iterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator8 = strComparableDynamicArray0.spliterator();
        // The following exception was thrown during execution in test generation
        try {
            strComparableDynamicArray0.put((int) ' ', (java.lang.Comparable<java.lang.String>) "[[, ]]");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 32 out of bounds for length 16");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(strComparableSpliterator8);
    }

    @Test
    public void test5279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5279");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.String str1 = strComparableDynamicArray0.toString();
        strComparableDynamicArray0.put(0, (java.lang.Comparable<java.lang.String>) "[hi!]");
        int int5 = strComparableDynamicArray0.getSize();
        java.util.Iterator iterator6 = strComparableDynamicArray0.iterator();
        java.util.Iterator iterator7 = strComparableDynamicArray0.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable9 = strComparableDynamicArray0.remove((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 16");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "[]" + "'", str1, "[]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertNotNull(iterator7);
    }

    @Test
    public void test5280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5280");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.util.stream.BaseStream<java.lang.Comparable<java.lang.String>, java.util.stream.Stream<java.lang.Comparable<java.lang.String>>>> strComparableBaseStreamDynamicArray1 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.util.stream.BaseStream<java.lang.Comparable<java.lang.String>, java.util.stream.Stream<java.lang.Comparable<java.lang.String>>>>(3);
    }

    @Test
    public void test5281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5281");
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
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream11 = strComparableDynamicArray0.stream();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream12 = strComparableDynamicArray0.stream();
        java.lang.String str13 = strComparableDynamicArray0.toString();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream14 = strComparableDynamicArray0.stream();
        java.util.Iterator iterator15 = strComparableDynamicArray0.iterator();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(strComparable9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertNotNull(strComparableStream11);
        org.junit.Assert.assertNotNull(strComparableStream12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[]" + "'", str13, "[]");
        org.junit.Assert.assertNotNull(strComparableStream14);
        org.junit.Assert.assertNotNull(iterator15);
    }

    @Test
    public void test5282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5282");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        boolean boolean3 = strComparableDynamicArray0.isEmpty();
        java.lang.String str4 = strComparableDynamicArray0.toString();
        java.util.Iterator iterator5 = strComparableDynamicArray0.iterator();
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableDynamicArray0.remove((int) (short) 10);
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[[[], hi!, , ]]");
        java.lang.Comparable<java.lang.String> strComparable11 = strComparableDynamicArray0.remove((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertNull(strComparable7);
        org.junit.Assert.assertNull(strComparable11);
    }

    @Test
    public void test5283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5283");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray1 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>(100);
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream2 = strComparableDynamicArray1.stream();
        strComparableDynamicArray1.add((java.lang.Comparable<java.lang.String>) "");
        java.util.Iterator iterator5 = strComparableDynamicArray1.iterator();
        strComparableDynamicArray1.put((int) '4', (java.lang.Comparable<java.lang.String>) "[]");
        int int9 = strComparableDynamicArray1.getSize();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator10 = strComparableDynamicArray1.spliterator();
        java.lang.String str11 = strComparableDynamicArray1.toString();
        org.junit.Assert.assertNotNull(strComparableStream2);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[, []]" + "'", str11, "[, []]");
    }

    @Test
    public void test5284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5284");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableDynamicArray0.isEmpty();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator2 = strComparableDynamicArray0.spliterator();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream3 = strComparableDynamicArray0.stream();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator4 = strComparableDynamicArray0.spliterator();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[[], hi!]");
        java.util.Iterator iterator7 = strComparableDynamicArray0.iterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator8 = strComparableDynamicArray0.spliterator();
        java.lang.String str9 = strComparableDynamicArray0.toString();
        strComparableDynamicArray0.put(1, (java.lang.Comparable<java.lang.String>) "[[], hi!, ]");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(strComparableSpliterator2);
        org.junit.Assert.assertNotNull(strComparableStream3);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(strComparableSpliterator8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[[[], hi!]]" + "'", str9, "[[[], hi!]]");
    }

    @Test
    public void test5285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5285");
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
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream15 = strComparableDynamicArray0.stream();
        java.lang.Class<?> wildcardClass16 = strComparableDynamicArray0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNull(strComparable8);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertNotNull(strComparableStream15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test5286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5286");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray1 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>(0);
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator2 = strComparableDynamicArray1.spliterator();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream3 = strComparableDynamicArray1.stream();
        java.lang.String str4 = strComparableDynamicArray1.toString();
        java.util.Iterator iterator5 = strComparableDynamicArray1.iterator();
        java.lang.String str6 = strComparableDynamicArray1.toString();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream7 = strComparableDynamicArray1.stream();
        // The following exception was thrown during execution in test generation
        try {
            strComparableDynamicArray1.put(10, (java.lang.Comparable<java.lang.String>) "[[], hi!, , ]");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strComparableSpliterator2);
        org.junit.Assert.assertNotNull(strComparableStream3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
        org.junit.Assert.assertNotNull(strComparableStream7);
    }

    @Test
    public void test5287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5287");
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
        int int12 = strComparableDynamicArray0.getSize();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[hi!, [[], hi!, , ]]" + "'", str10, "[hi!, [[], hi!, , ]]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[hi!, [[], hi!, , ]]" + "'", str11, "[hi!, [[], hi!, , ]]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
    }

    @Test
    public void test5288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5288");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "");
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDynamicArray0.put((int) (short) 0, (java.lang.Comparable<java.lang.String>) "[]");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator8 = strComparableDynamicArray0.spliterator();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream9 = strComparableDynamicArray0.stream();
        int int10 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.put((int) (short) 0, (java.lang.Comparable<java.lang.String>) "[hi!]");
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[[hi!]]");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator16 = strComparableDynamicArray0.spliterator();
        java.lang.Comparable<java.lang.String> strComparable18 = strComparableDynamicArray0.get((int) (byte) 10);
        org.junit.Assert.assertNotNull(strComparableSpliterator8);
        org.junit.Assert.assertNotNull(strComparableStream9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertNotNull(strComparableSpliterator16);
        org.junit.Assert.assertNull(strComparable18);
    }

    @Test
    public void test5289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5289");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableDynamicArray0.isEmpty();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableDynamicArray0.isEmpty();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator5 = strComparableDynamicArray0.spliterator();
        boolean boolean6 = strComparableDynamicArray0.isEmpty();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[[], hi!, , ]");
        int int9 = strComparableDynamicArray0.getSize();
        java.lang.String str10 = strComparableDynamicArray0.toString();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[hi!, [[], hi!, , ]]" + "'", str10, "[hi!, [[], hi!, , ]]");
    }

    @Test
    public void test5290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5290");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray1 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>(0);
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator2 = strComparableDynamicArray1.spliterator();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream3 = strComparableDynamicArray1.stream();
        java.lang.String str4 = strComparableDynamicArray1.toString();
        boolean boolean5 = strComparableDynamicArray1.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            strComparableDynamicArray1.put(10, (java.lang.Comparable<java.lang.String>) "[[hi!, []]]");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strComparableSpliterator2);
        org.junit.Assert.assertNotNull(strComparableStream3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test5291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5291");
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
        java.lang.Comparable<java.lang.String> strComparable12 = strComparableDynamicArray0.get(1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable14 = strComparableDynamicArray0.get((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[hi!]" + "'", str8, "[hi!]");
        org.junit.Assert.assertNotNull(strComparableStream9);
        org.junit.Assert.assertNotNull(strComparableStream10);
        org.junit.Assert.assertEquals("'" + strComparable12 + "' != '" + "hi!" + "'", strComparable12, "hi!");
    }

    @Test
    public void test5292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5292");
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
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream17 = strComparableDynamicArray0.stream();
        int int18 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[[[[hi!]]], , [hi!, []], [[hi!]]]");
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[hi!, hi!, [[hi!, hi!, [hi!], [hi!]]]]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNull(strComparable8);
        org.junit.Assert.assertNotNull(strComparableStream9);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator12);
        org.junit.Assert.assertNotNull(strComparableStream16);
        org.junit.Assert.assertNotNull(strComparableStream17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
    }

    @Test
    public void test5293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5293");
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
        int int15 = strComparableDynamicArray0.getSize();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator10);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[]" + "'", str12, "[]");
        org.junit.Assert.assertNull(strComparable14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test5294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5294");
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
        boolean boolean21 = strComparableDynamicArray0.isEmpty();
        int int22 = strComparableDynamicArray0.getSize();
        java.util.Iterator iterator23 = strComparableDynamicArray0.iterator();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNull(strComparable8);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertNull(strComparable13);
        org.junit.Assert.assertNull(strComparable15);
        org.junit.Assert.assertNotNull(iterator20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 5 + "'", int22 == 5);
        org.junit.Assert.assertNotNull(iterator23);
    }

    @Test
    public void test5295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5295");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator4 = strComparableDynamicArray0.spliterator();
        java.lang.String str5 = strComparableDynamicArray0.toString();
        int int6 = strComparableDynamicArray0.getSize();
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableDynamicArray0.get(0);
        java.lang.Comparable<java.lang.String> strComparable10 = strComparableDynamicArray0.remove((int) (short) 0);
        strComparableDynamicArray0.put(5, (java.lang.Comparable<java.lang.String>) "[[[], hi!], [[hi!, [hi!]]]]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNull(strComparable8);
        org.junit.Assert.assertNull(strComparable10);
    }

    @Test
    public void test5296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5296");
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
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator18 = strComparableDynamicArray0.spliterator();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNull(strComparable8);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertNotNull(strComparableStream12);
        org.junit.Assert.assertEquals("'" + strComparable14 + "' != '" + "hi!" + "'", strComparable14, "hi!");
        org.junit.Assert.assertNotNull(strComparableStream15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertNotNull(strComparableSpliterator17);
        org.junit.Assert.assertNotNull(strComparableSpliterator18);
    }

    @Test
    public void test5297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5297");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        boolean boolean3 = strComparableDynamicArray0.isEmpty();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[]");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator6 = strComparableDynamicArray0.spliterator();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[hi!, [hi!]]");
        java.lang.Class<?> wildcardClass9 = strComparableDynamicArray0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator6);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test5298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5298");
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
        strComparableDynamicArray0.put(5, (java.lang.Comparable<java.lang.String>) "[[], hi!]");
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream15 = strComparableDynamicArray0.stream();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator16 = strComparableDynamicArray0.spliterator();
        // The following exception was thrown during execution in test generation
        try {
            strComparableDynamicArray0.put(100, (java.lang.Comparable<java.lang.String>) "[[hi!, []], hi!, ]");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 16");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(strComparable11);
        org.junit.Assert.assertNotNull(strComparableStream15);
        org.junit.Assert.assertNotNull(strComparableSpliterator16);
    }

    @Test
    public void test5299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5299");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator4 = strComparableDynamicArray0.spliterator();
        boolean boolean5 = strComparableDynamicArray0.isEmpty();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator6 = strComparableDynamicArray0.spliterator();
        boolean boolean7 = strComparableDynamicArray0.isEmpty();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream8 = strComparableDynamicArray0.stream();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream9 = strComparableDynamicArray0.stream();
        java.lang.Comparable<java.lang.String> strComparable11 = null;
        strComparableDynamicArray0.put(10, strComparable11);
        java.lang.Comparable<java.lang.String> strComparable14 = strComparableDynamicArray0.get((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strComparableStream8);
        org.junit.Assert.assertNotNull(strComparableStream9);
        org.junit.Assert.assertNull(strComparable14);
    }

    @Test
    public void test5300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5300");
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
        boolean boolean19 = strComparableDynamicArray0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            strComparableDynamicArray0.put((int) ' ', (java.lang.Comparable<java.lang.String>) "[[hi!], hi!]");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 32 out of bounds for length 16");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNull(strComparable8);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertNull(strComparable13);
        org.junit.Assert.assertNotNull(strComparableStream14);
        org.junit.Assert.assertNotNull(strComparableStream15);
        org.junit.Assert.assertNull(strComparable17);
        org.junit.Assert.assertNotNull(strComparableSpliterator18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test5301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5301");
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
        java.lang.Comparable<java.lang.String> strComparable16 = strComparableDynamicArray0.remove(4);
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[hi!, hi!, [hi!], [hi!]]");
        int int19 = strComparableDynamicArray0.getSize();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(strComparableStream4);
        org.junit.Assert.assertNotNull(strComparableSpliterator5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[hi!, [hi!]]" + "'", str8, "[hi!, [hi!]]");
        org.junit.Assert.assertNotNull(strComparableStream14);
        org.junit.Assert.assertEquals("'" + strComparable16 + "' != '" + "[[], hi!]" + "'", strComparable16, "[[], hi!]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
    }

    @Test
    public void test5302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5302");
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
        java.lang.Comparable<java.lang.String> strComparable13 = strComparableDynamicArray0.get(0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(strComparable13);
    }

    @Test
    public void test5303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5303");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        java.lang.Comparable<java.lang.String> strComparable4 = strComparableDynamicArray0.get(4);
        java.util.Iterator iterator5 = strComparableDynamicArray0.iterator();
        strComparableDynamicArray0.put((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "[[, [hi!], [[], hi!, , ], [[, ]]], [hi!]]");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator9 = strComparableDynamicArray0.spliterator();
        org.junit.Assert.assertNull(strComparable4);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertNotNull(strComparableSpliterator9);
    }

    @Test
    public void test5304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5304");
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
        java.lang.Comparable<java.lang.String> strComparable18 = strComparableDynamicArray0.remove((int) (short) 10);
        java.util.Iterator iterator19 = strComparableDynamicArray0.iterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator20 = strComparableDynamicArray0.spliterator();
        java.lang.Class<?> wildcardClass21 = strComparableDynamicArray0.getClass();
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
        org.junit.Assert.assertNotNull(iterator19);
        org.junit.Assert.assertNotNull(strComparableSpliterator20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test5305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5305");
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
        boolean boolean20 = strComparableDynamicArray0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            strComparableDynamicArray0.put((int) ' ', (java.lang.Comparable<java.lang.String>) "[hi!, []]");
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
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test5306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5306");
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
        strComparableDynamicArray0.put(10, (java.lang.Comparable<java.lang.String>) "[, [[hi!]]]");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator14 = strComparableDynamicArray0.spliterator();
        boolean boolean15 = strComparableDynamicArray0.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertNotNull(strComparableSpliterator5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertNotNull(strComparableStream10);
        org.junit.Assert.assertNotNull(strComparableSpliterator14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test5307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5307");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray1 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>((int) (byte) 10);
        java.util.Iterator iterator2 = strComparableDynamicArray1.iterator();
        java.lang.Comparable<java.lang.String> strComparable4 = strComparableDynamicArray1.get(0);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertNull(strComparable4);
    }

    @Test
    public void test5308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5308");
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
        strComparableDynamicArray0.put(6, (java.lang.Comparable<java.lang.String>) "[[hi!, [], [hi!]]]");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(strComparableStream4);
        org.junit.Assert.assertNotNull(strComparableSpliterator5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[hi!, [hi!]]" + "'", str8, "[hi!, [hi!]]");
        org.junit.Assert.assertNull(strComparable12);
    }

    @Test
    public void test5309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5309");
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
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream15 = strComparableDynamicArray0.stream();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(strComparableSpliterator2);
        org.junit.Assert.assertNotNull(strComparableStream3);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertEquals("'" + strComparable8 + "' != '" + "[hi!, []]" + "'", strComparable8, "[hi!, []]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(strComparable13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[[hi!, []]]" + "'", str14, "[[hi!, []]]");
        org.junit.Assert.assertNotNull(strComparableStream15);
    }

    @Test
    public void test5310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5310");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray1 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>((int) (byte) 10);
        java.util.Iterator iterator2 = strComparableDynamicArray1.iterator();
        java.lang.Comparable<java.lang.String> strComparable4 = strComparableDynamicArray1.get(3);
        java.util.Iterator iterator5 = strComparableDynamicArray1.iterator();
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertNull(strComparable4);
        org.junit.Assert.assertNotNull(iterator5);
    }

    @Test
    public void test5311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5311");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        java.lang.Comparable<java.lang.String> strComparable4 = strComparableDynamicArray0.get(4);
        int int5 = strComparableDynamicArray0.getSize();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable7 = strComparableDynamicArray0.remove(100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 16");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(strComparable4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test5312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5312");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "");
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDynamicArray0.put((int) (short) 0, (java.lang.Comparable<java.lang.String>) "[]");
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream8 = strComparableDynamicArray0.stream();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator9 = strComparableDynamicArray0.spliterator();
        boolean boolean10 = strComparableDynamicArray0.isEmpty();
        java.lang.Comparable<java.lang.String> strComparable11 = null;
        strComparableDynamicArray0.add(strComparable11);
        java.lang.String str13 = strComparableDynamicArray0.toString();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator14 = strComparableDynamicArray0.spliterator();
        org.junit.Assert.assertNotNull(strComparableStream8);
        org.junit.Assert.assertNotNull(strComparableSpliterator9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[[], hi!]" + "'", str13, "[[], hi!]");
        org.junit.Assert.assertNotNull(strComparableSpliterator14);
    }

    @Test
    public void test5313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5313");
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
        int int12 = strComparableDynamicArray0.getSize();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(strComparableStream4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[hi!]" + "'", str6, "[hi!]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[hi!]" + "'", str7, "[hi!]");
        org.junit.Assert.assertEquals("'" + strComparable9 + "' != '" + "hi!" + "'", strComparable9, "hi!");
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[hi!]" + "'", str11, "[hi!]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test5314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5314");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableDynamicArray0.isEmpty();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream4 = strComparableDynamicArray0.stream();
        int int5 = strComparableDynamicArray0.getSize();
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableDynamicArray0.remove((int) (byte) 1);
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream8 = strComparableDynamicArray0.stream();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(strComparableStream4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(strComparable7);
        org.junit.Assert.assertNotNull(strComparableStream8);
    }

    @Test
    public void test5315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5315");
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
        java.lang.Comparable<java.lang.String> strComparable28 = strComparableDynamicArray0.get(0);
        java.util.Iterator iterator29 = strComparableDynamicArray0.iterator();
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
        org.junit.Assert.assertNotNull(iterator29);
    }

    @Test
    public void test5316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5316");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.String str1 = strComparableDynamicArray0.toString();
        strComparableDynamicArray0.put(0, (java.lang.Comparable<java.lang.String>) "[hi!]");
        int int5 = strComparableDynamicArray0.getSize();
        java.util.Iterator iterator6 = strComparableDynamicArray0.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable8 = strComparableDynamicArray0.get((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "[]" + "'", str1, "[]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(iterator6);
    }

    @Test
    public void test5317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5317");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray1 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>((int) (byte) 100);
        java.lang.Comparable<java.lang.String> strComparable3 = strComparableDynamicArray1.get((int) ' ');
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream4 = strComparableDynamicArray1.stream();
        java.lang.Class<?> wildcardClass5 = strComparableDynamicArray1.getClass();
        org.junit.Assert.assertNull(strComparable3);
        org.junit.Assert.assertNotNull(strComparableStream4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test5318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5318");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray1 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>((int) ' ');
        java.util.Iterator iterator2 = strComparableDynamicArray1.iterator();
        int int3 = strComparableDynamicArray1.getSize();
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test5319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5319");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.constant.ConstantDesc> constantDescDynamicArray1 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.constant.ConstantDesc>((int) (short) 10);
    }

    @Test
    public void test5320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5320");
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
        java.lang.Comparable<java.lang.String> strComparable12 = null;
        strComparableDynamicArray0.add(strComparable12);
        int int14 = strComparableDynamicArray0.getSize();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream15 = strComparableDynamicArray0.stream();
        java.util.Iterator iterator16 = strComparableDynamicArray0.iterator();
        java.lang.String str17 = strComparableDynamicArray0.toString();
        java.lang.Class<?> wildcardClass18 = strComparableDynamicArray0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertNotNull(strComparableStream15);
        org.junit.Assert.assertNotNull(iterator16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[]" + "'", str17, "[]");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test5321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5321");
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
        boolean boolean19 = strComparableDynamicArray0.isEmpty();
        strComparableDynamicArray0.put((int) (short) 1, (java.lang.Comparable<java.lang.String>) "[[hi!, hi!, [hi!], [hi!]], [hi!, hi!, [[hi!, hi!, [hi!]]]]]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNull(strComparable8);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertEquals("'" + strComparable16 + "' != '" + "[[], hi!]" + "'", strComparable16, "[[], hi!]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test5322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5322");
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
        java.lang.String str16 = strComparableDynamicArray0.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNull(strComparable8);
        org.junit.Assert.assertNotNull(strComparableStream9);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertNull(strComparable14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[hi!]" + "'", str15, "[hi!]");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[hi!]" + "'", str16, "[hi!]");
    }

    @Test
    public void test5323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5323");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        boolean boolean3 = strComparableDynamicArray0.isEmpty();
        java.lang.String str4 = strComparableDynamicArray0.toString();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator5 = strComparableDynamicArray0.spliterator();
        boolean boolean6 = strComparableDynamicArray0.isEmpty();
        java.util.Iterator iterator7 = strComparableDynamicArray0.iterator();
        boolean boolean8 = strComparableDynamicArray0.isEmpty();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream9 = strComparableDynamicArray0.stream();
        java.lang.Comparable<java.lang.String> strComparable11 = strComparableDynamicArray0.remove(0);
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream12 = strComparableDynamicArray0.stream();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertNotNull(strComparableSpliterator5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strComparableStream9);
        org.junit.Assert.assertNull(strComparable11);
        org.junit.Assert.assertNotNull(strComparableStream12);
    }

    @Test
    public void test5324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5324");
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
        java.util.Iterator iterator13 = strComparableDynamicArray0.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable15 = strComparableDynamicArray0.get((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNull(strComparable8);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertNotNull(iterator13);
    }

    @Test
    public void test5325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5325");
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
        java.util.Iterator iterator17 = strComparableDynamicArray0.iterator();
        java.lang.String str18 = strComparableDynamicArray0.toString();
        java.lang.String str19 = strComparableDynamicArray0.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNull(strComparable8);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertNotNull(strComparableStream12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertNotNull(strComparableSpliterator16);
        org.junit.Assert.assertNotNull(iterator17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[hi!, hi!]" + "'", str18, "[hi!, hi!]");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[hi!, hi!]" + "'", str19, "[hi!, hi!]");
    }

    @Test
    public void test5326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5326");
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
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream14 = strComparableDynamicArray0.stream();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strComparableStream14);
    }

    @Test
    public void test5327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5327");
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
        java.util.Iterator iterator17 = strComparableDynamicArray0.iterator();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(strComparable16);
        org.junit.Assert.assertNotNull(iterator17);
    }

    @Test
    public void test5328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5328");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator iterator6 = strComparableDynamicArray0.iterator();
        strComparableDynamicArray0.put(3, (java.lang.Comparable<java.lang.String>) "[hi!, [[], hi!, , ]]");
        java.util.Iterator iterator10 = strComparableDynamicArray0.iterator();
        java.util.Iterator iterator11 = strComparableDynamicArray0.iterator();
        java.lang.String str12 = strComparableDynamicArray0.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[hi!, [hi!, [[], hi!, , ]]]" + "'", str12, "[hi!, [hi!, [[], hi!, , ]]]");
    }

    @Test
    public void test5329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5329");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str3 = strComparableDynamicArray0.toString();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator4 = strComparableDynamicArray0.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator5 = strComparableDynamicArray0.spliterator();
        java.lang.Comparable<java.lang.String> strComparable7 = null;
        strComparableDynamicArray0.put((int) (byte) 0, strComparable7);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[]" + "'", str3, "[]");
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertNotNull(strComparableSpliterator5);
    }

    @Test
    public void test5330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5330");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "");
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator5 = strComparableDynamicArray0.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator6 = strComparableDynamicArray0.spliterator();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[[hi!]]");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable10 = strComparableDynamicArray0.get((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strComparableSpliterator5);
        org.junit.Assert.assertNotNull(strComparableSpliterator6);
    }

    @Test
    public void test5331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5331");
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
        java.util.Iterator iterator16 = strComparableDynamicArray0.iterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator17 = strComparableDynamicArray0.spliterator();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertNotNull(strComparableSpliterator5);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertNull(strComparable8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertNotNull(strComparableStream12);
        org.junit.Assert.assertNotNull(strComparableStream15);
        org.junit.Assert.assertNotNull(iterator16);
        org.junit.Assert.assertNotNull(strComparableSpliterator17);
    }

    @Test
    public void test5332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5332");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableDynamicArray0.isEmpty();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableDynamicArray0.isEmpty();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator5 = strComparableDynamicArray0.spliterator();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[[hi!, hi!, [[], hi!]], []]");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator10 = strComparableDynamicArray0.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator11 = strComparableDynamicArray0.spliterator();
        java.lang.String str12 = strComparableDynamicArray0.toString();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator5);
        org.junit.Assert.assertNotNull(strComparableSpliterator10);
        org.junit.Assert.assertNotNull(strComparableSpliterator11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[hi!, hi!, [[hi!, hi!, [[], hi!]], []]]" + "'", str12, "[hi!, hi!, [[hi!, hi!, [[], hi!]], []]]");
    }

    @Test
    public void test5333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5333");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableDynamicArray0.isEmpty();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableDynamicArray0.isEmpty();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator5 = strComparableDynamicArray0.spliterator();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int8 = strComparableDynamicArray0.getSize();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable10 = strComparableDynamicArray0.remove((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 16");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
    }

    @Test
    public void test5334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5334");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableDynamicArray0.getSize();
        java.util.Iterator iterator7 = strComparableDynamicArray0.iterator();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[[], hi!, , ]");
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[hi!, hi!, [hi!]]");
        int int12 = strComparableDynamicArray0.getSize();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
    }

    @Test
    public void test5335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5335");
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
        java.lang.Class<?> wildcardClass14 = strComparableDynamicArray0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertNull(strComparable6);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(strComparable13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test5336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5336");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray1 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>((int) (short) 10);
        strComparableDynamicArray1.add((java.lang.Comparable<java.lang.String>) "[, ]");
        boolean boolean4 = strComparableDynamicArray1.isEmpty();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream5 = strComparableDynamicArray1.stream();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator6 = strComparableDynamicArray1.spliterator();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strComparableStream5);
        org.junit.Assert.assertNotNull(strComparableSpliterator6);
    }

    @Test
    public void test5337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5337");
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
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator12 = strComparableDynamicArray0.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator13 = strComparableDynamicArray0.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator14 = strComparableDynamicArray0.spliterator();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[hi!]" + "'", str8, "[hi!]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator12);
        org.junit.Assert.assertNotNull(strComparableSpliterator13);
        org.junit.Assert.assertNotNull(strComparableSpliterator14);
    }

    @Test
    public void test5338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5338");
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
        strComparableDynamicArray0.put(4, (java.lang.Comparable<java.lang.String>) "[[hi!, []], hi!, ]");
        int int24 = strComparableDynamicArray0.getSize();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNull(strComparable8);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertNull(strComparable13);
        org.junit.Assert.assertNull(strComparable15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(strComparableStream20);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
    }

    @Test
    public void test5339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5339");
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
        int int12 = strComparableDynamicArray0.getSize();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream13 = strComparableDynamicArray0.stream();
        java.lang.Comparable<java.lang.String> strComparable15 = strComparableDynamicArray0.get((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(strComparableStream13);
        org.junit.Assert.assertNull(strComparable15);
    }

    @Test
    public void test5340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5340");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator4 = strComparableDynamicArray0.spliterator();
        java.lang.String str5 = strComparableDynamicArray0.toString();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[]");
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableDynamicArray0.get((int) (short) 1);
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator10 = strComparableDynamicArray0.spliterator();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream11 = strComparableDynamicArray0.stream();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator12 = strComparableDynamicArray0.spliterator();
        int int13 = strComparableDynamicArray0.getSize();
        // The following exception was thrown during execution in test generation
        try {
            strComparableDynamicArray0.put((int) '#', (java.lang.Comparable<java.lang.String>) "[hi!, [], [hi!, hi!]]");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 16");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertEquals("'" + strComparable9 + "' != '" + "[]" + "'", strComparable9, "[]");
        org.junit.Assert.assertNotNull(strComparableSpliterator10);
        org.junit.Assert.assertNotNull(strComparableStream11);
        org.junit.Assert.assertNotNull(strComparableSpliterator12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
    }

    @Test
    public void test5341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5341");
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
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream10 = strComparableDynamicArray0.stream();
        java.lang.Class<?> wildcardClass11 = strComparableDynamicArray0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(strComparableStream10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test5342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5342");
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
        java.lang.Comparable<java.lang.String> strComparable18 = strComparableDynamicArray0.get((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNull(strComparable8);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertNotNull(strComparableStream12);
        org.junit.Assert.assertEquals("'" + strComparable14 + "' != '" + "hi!" + "'", strComparable14, "hi!");
        org.junit.Assert.assertNotNull(strComparableStream15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertNull(strComparable18);
    }

    @Test
    public void test5343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5343");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator4 = strComparableDynamicArray0.spliterator();
        boolean boolean5 = strComparableDynamicArray0.isEmpty();
        java.lang.String str6 = strComparableDynamicArray0.toString();
        strComparableDynamicArray0.put(2, (java.lang.Comparable<java.lang.String>) "[[[], hi!, , ]]");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator10 = strComparableDynamicArray0.spliterator();
        boolean boolean11 = strComparableDynamicArray0.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
        org.junit.Assert.assertNotNull(strComparableSpliterator10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test5344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5344");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator4 = strComparableDynamicArray0.spliterator();
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableDynamicArray0.get((int) (short) 0);
        strComparableDynamicArray0.put(4, (java.lang.Comparable<java.lang.String>) "[[[hi!, hi!, [hi!], [hi!]], ]]");
        int int10 = strComparableDynamicArray0.getSize();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertNull(strComparable6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test5345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5345");
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
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[hi!, hi!, [hi!]]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator8);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test5346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5346");
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
        java.util.Iterator iterator12 = strComparableDynamicArray0.iterator();
        java.util.Iterator iterator13 = strComparableDynamicArray0.iterator();
        java.util.Iterator iterator14 = strComparableDynamicArray0.iterator();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(strComparable6);
        org.junit.Assert.assertNotNull(strComparableSpliterator7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(strComparableStream10);
        org.junit.Assert.assertNotNull(strComparableSpliterator11);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertNotNull(iterator14);
    }

    @Test
    public void test5347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5347");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream6 = strComparableDynamicArray0.stream();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream7 = strComparableDynamicArray0.stream();
        int int8 = strComparableDynamicArray0.getSize();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator9 = strComparableDynamicArray0.spliterator();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream10 = strComparableDynamicArray0.stream();
        java.lang.Comparable<java.lang.String> strComparable11 = null;
        strComparableDynamicArray0.add(strComparable11);
        java.lang.String str13 = strComparableDynamicArray0.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableStream6);
        org.junit.Assert.assertNotNull(strComparableStream7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertNotNull(strComparableSpliterator9);
        org.junit.Assert.assertNotNull(strComparableStream10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[hi!]" + "'", str13, "[hi!]");
    }

    @Test
    public void test5348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5348");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        boolean boolean4 = strComparableDynamicArray0.isEmpty();
        boolean boolean5 = strComparableDynamicArray0.isEmpty();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator6 = strComparableDynamicArray0.spliterator();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream7 = strComparableDynamicArray0.stream();
        int int8 = strComparableDynamicArray0.getSize();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator6);
        org.junit.Assert.assertNotNull(strComparableStream7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test5349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5349");
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
        java.lang.Comparable<java.lang.String> strComparable12 = null;
        strComparableDynamicArray0.add(strComparable12);
        boolean boolean14 = strComparableDynamicArray0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable16 = strComparableDynamicArray0.get((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test5350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5350");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        int int4 = strComparableDynamicArray0.getSize();
        java.lang.String str5 = strComparableDynamicArray0.toString();
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableDynamicArray0.get(10);
        boolean boolean8 = strComparableDynamicArray0.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNull(strComparable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test5351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5351");
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
        java.lang.Comparable<java.lang.String> strComparable13 = strComparableDynamicArray0.get((int) (byte) 0);
        java.lang.Comparable<java.lang.String> strComparable15 = strComparableDynamicArray0.get((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator6);
        org.junit.Assert.assertNotNull(strComparableStream7);
        org.junit.Assert.assertNull(strComparable9);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(strComparable13);
        org.junit.Assert.assertNull(strComparable15);
    }

    @Test
    public void test5352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5352");
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
        java.lang.String str11 = strComparableDynamicArray0.toString();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[[], hi!, [hi!, hi!, [hi!], [hi!]]]");
        strComparableDynamicArray0.put(6, (java.lang.Comparable<java.lang.String>) "[hi!, hi!, [, ], [[], hi!]]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(strComparable9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
    }

    @Test
    public void test5353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5353");
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
        boolean boolean11 = strComparableDynamicArray0.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test5354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5354");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableDynamicArray0.isEmpty();
        java.util.Iterator iterator2 = strComparableDynamicArray0.iterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator3 = strComparableDynamicArray0.spliterator();
        strComparableDynamicArray0.put((int) (short) 10, (java.lang.Comparable<java.lang.String>) "[[], hi!, , ]");
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream7 = strComparableDynamicArray0.stream();
        java.lang.String str8 = strComparableDynamicArray0.toString();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator9 = strComparableDynamicArray0.spliterator();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[[[], hi!, , ], hi!]");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertNotNull(strComparableSpliterator3);
        org.junit.Assert.assertNotNull(strComparableStream7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[[[], hi!, , ]]" + "'", str8, "[[[], hi!, , ]]");
        org.junit.Assert.assertNotNull(strComparableSpliterator9);
    }

    @Test
    public void test5355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5355");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator iterator6 = strComparableDynamicArray0.iterator();
        boolean boolean7 = strComparableDynamicArray0.isEmpty();
        java.lang.String str8 = strComparableDynamicArray0.toString();
        java.lang.String str9 = strComparableDynamicArray0.toString();
        // The following exception was thrown during execution in test generation
        try {
            strComparableDynamicArray0.put((int) (byte) -1, (java.lang.Comparable<java.lang.String>) "[hi!, [hi!, hi!, [hi!]], [[hi!, hi!, [hi!], [hi!]], ]]");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 16");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[hi!]" + "'", str8, "[hi!]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[hi!]" + "'", str9, "[hi!]");
    }

    @Test
    public void test5356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5356");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableDynamicArray0.isEmpty();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator2 = strComparableDynamicArray0.spliterator();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream3 = strComparableDynamicArray0.stream();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator4 = strComparableDynamicArray0.spliterator();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[[], hi!]");
        java.util.Iterator iterator7 = strComparableDynamicArray0.iterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator8 = strComparableDynamicArray0.spliterator();
        java.lang.String str9 = strComparableDynamicArray0.toString();
        java.lang.Comparable<java.lang.String> strComparable11 = strComparableDynamicArray0.get(10);
        java.lang.String str12 = strComparableDynamicArray0.toString();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(strComparableSpliterator2);
        org.junit.Assert.assertNotNull(strComparableStream3);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(strComparableSpliterator8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[[[], hi!]]" + "'", str9, "[[[], hi!]]");
        org.junit.Assert.assertNull(strComparable11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[[[], hi!]]" + "'", str12, "[[[], hi!]]");
    }

    @Test
    public void test5357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5357");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator4 = strComparableDynamicArray0.spliterator();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[hi!, [hi!]]");
        int int7 = strComparableDynamicArray0.getSize();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream8 = strComparableDynamicArray0.stream();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[[[[], hi!, , ]]]");
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[hi!, [hi!, [hi!]]]");
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[hi!, [hi!, [[], hi!, , ]]]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNotNull(strComparableStream8);
    }

    @Test
    public void test5358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5358");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableDynamicArray0.isEmpty();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator2 = strComparableDynamicArray0.spliterator();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream3 = strComparableDynamicArray0.stream();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator4 = strComparableDynamicArray0.spliterator();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[hi!, []]");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableDynamicArray0.get(0);
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator9 = strComparableDynamicArray0.spliterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable11 = strComparableDynamicArray0.remove((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 16");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(strComparableSpliterator2);
        org.junit.Assert.assertNotNull(strComparableStream3);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertEquals("'" + strComparable8 + "' != '" + "[hi!, []]" + "'", strComparable8, "[hi!, []]");
        org.junit.Assert.assertNotNull(strComparableSpliterator9);
    }

    @Test
    public void test5359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5359");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        boolean boolean4 = strComparableDynamicArray0.isEmpty();
        strComparableDynamicArray0.put(2, (java.lang.Comparable<java.lang.String>) "[hi!]");
        boolean boolean8 = strComparableDynamicArray0.isEmpty();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream9 = strComparableDynamicArray0.stream();
        int int10 = strComparableDynamicArray0.getSize();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream11 = strComparableDynamicArray0.stream();
        boolean boolean12 = strComparableDynamicArray0.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strComparableStream9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(strComparableStream11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test5360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5360");
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
        strComparableDynamicArray0.put(5, (java.lang.Comparable<java.lang.String>) "[[], hi!]");
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream15 = strComparableDynamicArray0.stream();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator16 = strComparableDynamicArray0.spliterator();
        int int17 = strComparableDynamicArray0.getSize();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(strComparable11);
        org.junit.Assert.assertNotNull(strComparableStream15);
        org.junit.Assert.assertNotNull(strComparableSpliterator16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
    }

    @Test
    public void test5361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5361");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableDynamicArray0.isEmpty();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableDynamicArray0.get(5);
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream6 = strComparableDynamicArray0.stream();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream7 = strComparableDynamicArray0.stream();
        java.util.Iterator iterator8 = strComparableDynamicArray0.iterator();
        java.lang.String str9 = strComparableDynamicArray0.toString();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(strComparable5);
        org.junit.Assert.assertNotNull(strComparableStream6);
        org.junit.Assert.assertNotNull(strComparableStream7);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[hi!]" + "'", str9, "[hi!]");
    }

    @Test
    public void test5362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5362");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        boolean boolean3 = strComparableDynamicArray0.isEmpty();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[, ]");
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableDynamicArray0.remove(10);
        java.util.Iterator iterator8 = strComparableDynamicArray0.iterator();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(strComparable7);
        org.junit.Assert.assertNotNull(iterator8);
    }

    @Test
    public void test5363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5363");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableDynamicArray0.isEmpty();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream4 = strComparableDynamicArray0.stream();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator5 = strComparableDynamicArray0.spliterator();
        int int6 = strComparableDynamicArray0.getSize();
        boolean boolean7 = strComparableDynamicArray0.isEmpty();
        boolean boolean8 = strComparableDynamicArray0.isEmpty();
        int int9 = strComparableDynamicArray0.getSize();
        java.lang.Comparable<java.lang.String> strComparable11 = strComparableDynamicArray0.get((int) (byte) 10);
        java.lang.Comparable<java.lang.String> strComparable12 = null;
        strComparableDynamicArray0.add(strComparable12);
        // The following exception was thrown during execution in test generation
        try {
            strComparableDynamicArray0.put((int) (short) 100, (java.lang.Comparable<java.lang.String>) "[[[], hi!, [[hi!]]]]");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 16");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(strComparableStream4);
        org.junit.Assert.assertNotNull(strComparableSpliterator5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNull(strComparable11);
    }

    @Test
    public void test5364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5364");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray1 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>((int) 'a');
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream2 = strComparableDynamicArray1.stream();
        java.lang.String str3 = strComparableDynamicArray1.toString();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator4 = strComparableDynamicArray1.spliterator();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream5 = strComparableDynamicArray1.stream();
        java.util.Iterator iterator6 = strComparableDynamicArray1.iterator();
        org.junit.Assert.assertNotNull(strComparableStream2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[]" + "'", str3, "[]");
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertNotNull(strComparableStream5);
        org.junit.Assert.assertNotNull(iterator6);
    }

    @Test
    public void test5365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5365");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableDynamicArray0.isEmpty();
        java.util.Iterator iterator2 = strComparableDynamicArray0.iterator();
        int int3 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.put(1, (java.lang.Comparable<java.lang.String>) "[[hi!, hi!, [hi!]]]");
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream7 = strComparableDynamicArray0.stream();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[[hi!, [[[[hi!]]], , [hi!, []], [[hi!]]]]]");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator10 = strComparableDynamicArray0.spliterator();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(strComparableStream7);
        org.junit.Assert.assertNotNull(strComparableSpliterator10);
    }

    @Test
    public void test5366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5366");
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
        java.lang.Class<?> wildcardClass20 = strComparableDynamicArray0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test5367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5367");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream6 = strComparableDynamicArray0.stream();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream7 = strComparableDynamicArray0.stream();
        int int8 = strComparableDynamicArray0.getSize();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator9 = strComparableDynamicArray0.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator10 = strComparableDynamicArray0.spliterator();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream11 = strComparableDynamicArray0.stream();
        java.lang.String str12 = strComparableDynamicArray0.toString();
        java.lang.Comparable<java.lang.String> strComparable14 = strComparableDynamicArray0.get((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableStream6);
        org.junit.Assert.assertNotNull(strComparableStream7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertNotNull(strComparableSpliterator9);
        org.junit.Assert.assertNotNull(strComparableSpliterator10);
        org.junit.Assert.assertNotNull(strComparableStream11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[hi!]" + "'", str12, "[hi!]");
        org.junit.Assert.assertNull(strComparable14);
    }

    @Test
    public void test5368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5368");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray1 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>(0);
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator2 = strComparableDynamicArray1.spliterator();
        int int3 = strComparableDynamicArray1.getSize();
        java.lang.String str4 = strComparableDynamicArray1.toString();
        java.util.Iterator iterator5 = strComparableDynamicArray1.iterator();
        java.util.Iterator iterator6 = strComparableDynamicArray1.iterator();
        boolean boolean7 = strComparableDynamicArray1.isEmpty();
        org.junit.Assert.assertNotNull(strComparableSpliterator2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test5369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5369");
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
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator19 = strComparableDynamicArray0.spliterator();
        boolean boolean20 = strComparableDynamicArray0.isEmpty();
        strComparableDynamicArray0.put((int) (short) 0, (java.lang.Comparable<java.lang.String>) "[[hi!, []], hi!, ]");
        java.lang.Comparable<java.lang.String> strComparable25 = strComparableDynamicArray0.get(0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNull(strComparable8);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertEquals("'" + strComparable16 + "' != '" + "[[], hi!]" + "'", strComparable16, "[[], hi!]");
        org.junit.Assert.assertNotNull(strComparableSpliterator19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + strComparable25 + "' != '" + "[[hi!, []], hi!, ]" + "'", strComparable25, "[[hi!, []], hi!, ]");
    }

    @Test
    public void test5370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5370");
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
        boolean boolean17 = strComparableDynamicArray0.isEmpty();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[]");
        java.lang.Comparable<java.lang.String> strComparable21 = strComparableDynamicArray0.get((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertNotNull(strComparableSpliterator11);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertEquals("'" + strComparable15 + "' != '" + "hi!" + "'", strComparable15, "hi!");
        org.junit.Assert.assertNotNull(iterator16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(strComparable21);
    }

    @Test
    public void test5371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5371");
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
        java.util.Iterator iterator18 = strComparableDynamicArray0.iterator();
        java.lang.Comparable<java.lang.String> strComparable19 = null;
        strComparableDynamicArray0.add(strComparable19);
        org.junit.Assert.assertNotNull(strComparableStream8);
        org.junit.Assert.assertNotNull(strComparableSpliterator9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertNotNull(iterator18);
    }

    @Test
    public void test5372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5372");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>> wildcardClassOfFieldDynamicArray1 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>((int) (byte) 10);
    }

    @Test
    public void test5373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5373");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "");
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDynamicArray0.put((int) (short) 0, (java.lang.Comparable<java.lang.String>) "[]");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator8 = strComparableDynamicArray0.spliterator();
        java.util.Iterator iterator9 = strComparableDynamicArray0.iterator();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[hi!, []]");
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream12 = strComparableDynamicArray0.stream();
        java.lang.String str13 = strComparableDynamicArray0.toString();
        org.junit.Assert.assertNotNull(strComparableSpliterator8);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNotNull(strComparableStream12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[[], hi!, [hi!, []]]" + "'", str13, "[[], hi!, [hi!, []]]");
    }

    @Test
    public void test5374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5374");
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
        java.lang.String str14 = strComparableDynamicArray0.toString();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[[, ], [hi!], [hi!, hi!], [[], hi!]]");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator17 = strComparableDynamicArray0.spliterator();
        boolean boolean18 = strComparableDynamicArray0.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strComparableStream12);
        org.junit.Assert.assertNotNull(strComparableSpliterator13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[]" + "'", str14, "[]");
        org.junit.Assert.assertNotNull(strComparableSpliterator17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test5375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5375");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        boolean boolean3 = strComparableDynamicArray0.isEmpty();
        java.lang.String str4 = strComparableDynamicArray0.toString();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator5 = strComparableDynamicArray0.spliterator();
        boolean boolean6 = strComparableDynamicArray0.isEmpty();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream7 = strComparableDynamicArray0.stream();
        java.lang.String str8 = strComparableDynamicArray0.toString();
        java.util.Iterator iterator9 = strComparableDynamicArray0.iterator();
        java.lang.Comparable<java.lang.String> strComparable11 = null;
        strComparableDynamicArray0.put((int) (short) 0, strComparable11);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertNotNull(strComparableSpliterator5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strComparableStream7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertNotNull(iterator9);
    }

    @Test
    public void test5376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5376");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableDynamicArray0.isEmpty();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator2 = strComparableDynamicArray0.spliterator();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream3 = strComparableDynamicArray0.stream();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator4 = strComparableDynamicArray0.spliterator();
        boolean boolean5 = strComparableDynamicArray0.isEmpty();
        boolean boolean6 = strComparableDynamicArray0.isEmpty();
        int int7 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.put((int) (short) 1, (java.lang.Comparable<java.lang.String>) "[[], hi!]");
        java.lang.String str11 = strComparableDynamicArray0.toString();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[[[[hi!]]]]");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(strComparableSpliterator2);
        org.junit.Assert.assertNotNull(strComparableStream3);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[[[], hi!]]" + "'", str11, "[[[], hi!]]");
    }

    @Test
    public void test5377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5377");
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
        java.lang.String str22 = strComparableDynamicArray0.toString();
        java.lang.String str23 = strComparableDynamicArray0.toString();
        int int24 = strComparableDynamicArray0.getSize();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNull(strComparable8);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertNull(strComparable13);
        org.junit.Assert.assertNull(strComparable15);
        org.junit.Assert.assertNotNull(iterator20);
        org.junit.Assert.assertNotNull(iterator21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "[hi!, hi!, [hi!], [hi!]]" + "'", str22, "[hi!, hi!, [hi!], [hi!]]");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "[hi!, hi!, [hi!], [hi!]]" + "'", str23, "[hi!, hi!, [hi!], [hi!]]");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 5 + "'", int24 == 5);
    }

    @Test
    public void test5378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5378");
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
        java.lang.Class<?> wildcardClass17 = strComparableDynamicArray0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test5379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5379");
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
        java.lang.Class<?> wildcardClass19 = strComparableDynamicArray0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(strComparableStream4);
        org.junit.Assert.assertNotNull(strComparableSpliterator5);
        org.junit.Assert.assertEquals("'" + strComparable9 + "' != '" + "[hi!]" + "'", strComparable9, "[hi!]");
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[hi!, ]" + "'", str15, "[hi!, ]");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test5380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5380");
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
        boolean boolean18 = strComparableDynamicArray0.isEmpty();
        int int19 = strComparableDynamicArray0.getSize();
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
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
    }

    @Test
    public void test5381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5381");
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
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator17 = strComparableDynamicArray0.spliterator();
        boolean boolean18 = strComparableDynamicArray0.isEmpty();
        int int19 = strComparableDynamicArray0.getSize();
        java.util.Iterator iterator20 = strComparableDynamicArray0.iterator();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNull(strComparable8);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertEquals("'" + strComparable16 + "' != '" + "[[], hi!]" + "'", strComparable16, "[[], hi!]");
        org.junit.Assert.assertNotNull(strComparableSpliterator17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertNotNull(iterator20);
    }

    @Test
    public void test5382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5382");
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
        java.lang.String str18 = strComparableDynamicArray0.toString();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[[[, []], [hi!]]]");
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[[hi!, hi!]]" + "'", str18, "[[hi!, hi!]]");
    }

    @Test
    public void test5383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5383");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray1 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>(100);
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream2 = strComparableDynamicArray1.stream();
        strComparableDynamicArray1.add((java.lang.Comparable<java.lang.String>) "");
        java.util.Iterator iterator5 = strComparableDynamicArray1.iterator();
        strComparableDynamicArray1.put((int) '4', (java.lang.Comparable<java.lang.String>) "[]");
        int int9 = strComparableDynamicArray1.getSize();
        java.util.Iterator iterator10 = strComparableDynamicArray1.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable12 = strComparableDynamicArray1.remove((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strComparableStream2);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(iterator10);
    }

    @Test
    public void test5384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5384");
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
        strComparableDynamicArray0.put((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "[hi!, hi!, [hi!]]");
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[hi!, [[], hi!, , ]]");
        java.lang.String str23 = strComparableDynamicArray0.toString();
        boolean boolean24 = strComparableDynamicArray0.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNull(strComparable8);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertNull(strComparable13);
        org.junit.Assert.assertNotNull(strComparableStream14);
        org.junit.Assert.assertNotNull(strComparableStream17);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "[[hi!, hi!, [hi!]], hi!, hi!, [hi!, []], [hi!, [[], hi!, , ]]]" + "'", str23, "[[hi!, hi!, [hi!]], hi!, hi!, [hi!, []], [hi!, [[], hi!, , ]]]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test5385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5385");
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
        java.lang.Class<?> wildcardClass25 = strComparableStream24.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test5386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5386");
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
        java.lang.String str17 = strComparableDynamicArray0.toString();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream18 = strComparableDynamicArray0.stream();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator19 = strComparableDynamicArray0.spliterator();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream20 = strComparableDynamicArray0.stream();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(strComparable15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[[, ], [[], [hi!, hi!, [hi!], [hi!]]]]" + "'", str17, "[[, ], [[], [hi!, hi!, [hi!], [hi!]]]]");
        org.junit.Assert.assertNotNull(strComparableStream18);
        org.junit.Assert.assertNotNull(strComparableSpliterator19);
        org.junit.Assert.assertNotNull(strComparableStream20);
    }

    @Test
    public void test5387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5387");
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
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream26 = strComparableDynamicArray0.stream();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNull(strComparable8);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertNotNull(strComparableSpliterator19);
        org.junit.Assert.assertNotNull(strComparableSpliterator20);
        org.junit.Assert.assertNotNull(strComparableSpliterator21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "[, hi!, , hi!]" + "'", str22, "[, hi!, , hi!]");
        org.junit.Assert.assertNotNull(strComparableStream26);
    }

    @Test
    public void test5388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5388");
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
        java.lang.String str10 = strComparableDynamicArray0.toString();
        strComparableDynamicArray0.put((int) (byte) 10, (java.lang.Comparable<java.lang.String>) "[[[], hi!, , ], hi!]");
        int int14 = strComparableDynamicArray0.getSize();
        int int15 = strComparableDynamicArray0.getSize();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(strComparableStream8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test5389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5389");
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
        int int24 = strComparableDynamicArray0.getSize();
        java.util.Iterator iterator25 = strComparableDynamicArray0.iterator();
        java.lang.Class<?> wildcardClass26 = iterator25.getClass();
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
        org.junit.Assert.assertNotNull(iterator25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test5390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5390");
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
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[, ]");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator16 = strComparableDynamicArray0.spliterator();
        java.util.Iterator iterator17 = strComparableDynamicArray0.iterator();
        java.lang.Comparable<java.lang.String> strComparable19 = strComparableDynamicArray0.get((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(strComparable6);
        org.junit.Assert.assertNotNull(strComparableSpliterator7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(strComparableSpliterator16);
        org.junit.Assert.assertNotNull(iterator17);
        org.junit.Assert.assertEquals("'" + strComparable19 + "' != '" + "[hi!, hi!]" + "'", strComparable19, "[hi!, hi!]");
    }

    @Test
    public void test5391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5391");
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
        int int19 = strComparableDynamicArray0.getSize();
        int int20 = strComparableDynamicArray0.getSize();
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
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
    }

    @Test
    public void test5392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5392");
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
        java.util.Iterator iterator13 = strComparableDynamicArray0.iterator();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream14 = strComparableDynamicArray0.stream();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNull(strComparable7);
        org.junit.Assert.assertNotNull(strComparableSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertNotNull(strComparableStream14);
    }

    @Test
    public void test5393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5393");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray1 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>((int) (byte) 1);
        boolean boolean2 = strComparableDynamicArray1.isEmpty();
        int int3 = strComparableDynamicArray1.getSize();
        boolean boolean4 = strComparableDynamicArray1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test5394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5394");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableDynamicArray0.getSize();
        int int7 = strComparableDynamicArray0.getSize();
        java.lang.String str8 = strComparableDynamicArray0.toString();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream9 = strComparableDynamicArray0.stream();
        java.lang.String str10 = strComparableDynamicArray0.toString();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream11 = strComparableDynamicArray0.stream();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[hi!]" + "'", str8, "[hi!]");
        org.junit.Assert.assertNotNull(strComparableStream9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[hi!]" + "'", str10, "[hi!]");
        org.junit.Assert.assertNotNull(strComparableStream11);
    }

    @Test
    public void test5395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5395");
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
        // The following exception was thrown during execution in test generation
        try {
            strComparableDynamicArray0.put((-1), (java.lang.Comparable<java.lang.String>) "[[, ]]");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 16");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator9);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertNull(strComparable14);
        org.junit.Assert.assertNull(strComparable16);
    }

    @Test
    public void test5396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5396");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator4 = strComparableDynamicArray0.spliterator();
        strComparableDynamicArray0.put((int) (byte) 10, (java.lang.Comparable<java.lang.String>) "");
        java.util.Iterator iterator8 = strComparableDynamicArray0.iterator();
        java.lang.String str9 = strComparableDynamicArray0.toString();
        java.lang.Comparable<java.lang.String> strComparable11 = strComparableDynamicArray0.remove(2);
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream12 = strComparableDynamicArray0.stream();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[[, ]]");
        java.util.Iterator iterator15 = strComparableDynamicArray0.iterator();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertNull(strComparable11);
        org.junit.Assert.assertNotNull(strComparableStream12);
        org.junit.Assert.assertNotNull(iterator15);
    }

    @Test
    public void test5397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5397");
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
        java.lang.Class<?> wildcardClass13 = iterator12.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test5398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5398");
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
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator15 = strComparableDynamicArray0.spliterator();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[, [hi!, []]]");
        java.lang.Class<?> wildcardClass18 = strComparableDynamicArray0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNull(strComparable8);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertNull(strComparable13);
        org.junit.Assert.assertNotNull(strComparableStream14);
        org.junit.Assert.assertNotNull(strComparableSpliterator15);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test5399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5399");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableDynamicArray0.getSize();
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableDynamicArray0.get((int) (byte) 10);
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream11 = strComparableDynamicArray0.stream();
        strComparableDynamicArray0.put((int) (byte) 1, (java.lang.Comparable<java.lang.String>) "[hi!, [[], hi!, , ]]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNull(strComparable8);
        org.junit.Assert.assertNotNull(strComparableStream11);
    }

    @Test
    public void test5400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5400");
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
        int int19 = strComparableDynamicArray0.getSize();
        boolean boolean20 = strComparableDynamicArray0.isEmpty();
        strComparableDynamicArray0.put((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "[[hi!], hi!, [[], hi!, [hi!, hi!, [hi!], [hi!]]]]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNull(strComparable8);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertNull(strComparable13);
        org.junit.Assert.assertNull(strComparable15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[hi!, hi!, [hi!]]" + "'", str18, "[hi!, hi!, [hi!]]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 4 + "'", int19 == 4);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test5401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5401");
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
        int int14 = strComparableDynamicArray0.getSize();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream15 = strComparableDynamicArray0.stream();
        java.lang.Comparable<java.lang.String> strComparable17 = strComparableDynamicArray0.get((int) (short) 0);
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[[hi!, [[], hi!, , ]]]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertNotNull(strComparableSpliterator11);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertNotNull(strComparableStream15);
        org.junit.Assert.assertNull(strComparable17);
    }

    @Test
    public void test5402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5402");
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
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator12 = strComparableDynamicArray0.spliterator();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableStream6);
        org.junit.Assert.assertNotNull(strComparableStream7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertEquals("'" + strComparable11 + "' != '" + "hi!" + "'", strComparable11, "hi!");
        org.junit.Assert.assertNotNull(strComparableSpliterator12);
    }

    @Test
    public void test5403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5403");
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
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[hi!]");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(strComparableStream4);
        org.junit.Assert.assertNotNull(strComparableSpliterator5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[hi!, [hi!]]" + "'", str8, "[hi!, [hi!]]");
        org.junit.Assert.assertNotNull(strComparableStream14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(strComparable20);
    }

    @Test
    public void test5404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5404");
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
        java.lang.Comparable<java.lang.String> strComparable13 = strComparableDynamicArray0.remove(0);
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream14 = strComparableDynamicArray0.stream();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNull(strComparable8);
        org.junit.Assert.assertNotNull(strComparableStream9);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertNull(strComparable13);
        org.junit.Assert.assertNotNull(strComparableStream14);
    }

    @Test
    public void test5405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5405");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.String str1 = strComparableDynamicArray0.toString();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream2 = strComparableDynamicArray0.stream();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream3 = strComparableDynamicArray0.stream();
        java.lang.String str4 = strComparableDynamicArray0.toString();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator5 = strComparableDynamicArray0.spliterator();
        int int6 = strComparableDynamicArray0.getSize();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable8 = strComparableDynamicArray0.get((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "[]" + "'", str1, "[]");
        org.junit.Assert.assertNotNull(strComparableStream2);
        org.junit.Assert.assertNotNull(strComparableStream3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertNotNull(strComparableSpliterator5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test5406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5406");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray1 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>((int) (byte) 0);
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator2 = strComparableDynamicArray1.spliterator();
        java.lang.String str3 = strComparableDynamicArray1.toString();
        java.util.Iterator iterator4 = strComparableDynamicArray1.iterator();
        boolean boolean5 = strComparableDynamicArray1.isEmpty();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator6 = strComparableDynamicArray1.spliterator();
        boolean boolean7 = strComparableDynamicArray1.isEmpty();
        org.junit.Assert.assertNotNull(strComparableSpliterator2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[]" + "'", str3, "[]");
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(strComparableSpliterator6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test5407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5407");
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
        strComparableDynamicArray0.put(0, (java.lang.Comparable<java.lang.String>) "[, [[, ]]]");
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
    public void test5408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5408");
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
        strComparableDynamicArray0.put((int) (byte) 1, (java.lang.Comparable<java.lang.String>) "[[], hi!, , ]");
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[[hi!]]");
        int int18 = strComparableDynamicArray0.getSize();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNull(strComparable8);
        org.junit.Assert.assertNotNull(strComparableStream9);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
    }

    @Test
    public void test5409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5409");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "");
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDynamicArray0.put((int) (short) 0, (java.lang.Comparable<java.lang.String>) "[]");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator8 = strComparableDynamicArray0.spliterator();
        strComparableDynamicArray0.put(10, (java.lang.Comparable<java.lang.String>) "");
        boolean boolean12 = strComparableDynamicArray0.isEmpty();
        int int13 = strComparableDynamicArray0.getSize();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator14 = strComparableDynamicArray0.spliterator();
        strComparableDynamicArray0.put(0, (java.lang.Comparable<java.lang.String>) "[[[[[hi!]]], , [hi!, []], [[hi!]]], [[]]]");
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream18 = strComparableDynamicArray0.stream();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream19 = strComparableDynamicArray0.stream();
        java.lang.String str20 = strComparableDynamicArray0.toString();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream21 = strComparableDynamicArray0.stream();
        org.junit.Assert.assertNotNull(strComparableSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertNotNull(strComparableSpliterator14);
        org.junit.Assert.assertNotNull(strComparableStream18);
        org.junit.Assert.assertNotNull(strComparableStream19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "[[[[[[hi!]]], , [hi!, []], [[hi!]]], [[]]], hi!, ]" + "'", str20, "[[[[[[hi!]]], , [hi!, []], [[hi!]]], [[]]], hi!, ]");
        org.junit.Assert.assertNotNull(strComparableStream21);
    }

    @Test
    public void test5410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5410");
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
        java.lang.String str12 = strComparableDynamicArray0.toString();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator13 = strComparableDynamicArray0.spliterator();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[]" + "'", str12, "[]");
        org.junit.Assert.assertNotNull(strComparableSpliterator13);
    }

    @Test
    public void test5411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5411");
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
        java.lang.String str15 = strComparableDynamicArray0.toString();
        java.util.Iterator iterator16 = strComparableDynamicArray0.iterator();
        strComparableDynamicArray0.put(10, (java.lang.Comparable<java.lang.String>) "[hi!, [[hi!]]]");
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[[hi!, [[], hi!, , ]], ]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNull(strComparable8);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertNull(strComparable13);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[hi!, hi!]" + "'", str15, "[hi!, hi!]");
        org.junit.Assert.assertNotNull(iterator16);
    }

    @Test
    public void test5412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5412");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableDynamicArray0.isEmpty();
        java.util.Iterator iterator2 = strComparableDynamicArray0.iterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator3 = strComparableDynamicArray0.spliterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable5 = strComparableDynamicArray0.remove((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 32 out of bounds for length 16");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertNotNull(strComparableSpliterator3);
    }

    @Test
    public void test5413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5413");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray1 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>(10);
        int int2 = strComparableDynamicArray1.getSize();
        boolean boolean3 = strComparableDynamicArray1.isEmpty();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test5414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5414");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableDynamicArray0.isEmpty();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream4 = strComparableDynamicArray0.stream();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator5 = strComparableDynamicArray0.spliterator();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[hi!]");
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableDynamicArray0.remove((int) (short) 1);
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator10 = strComparableDynamicArray0.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator11 = strComparableDynamicArray0.spliterator();
        java.lang.Comparable<java.lang.String> strComparable13 = strComparableDynamicArray0.remove((int) (byte) 10);
        boolean boolean14 = strComparableDynamicArray0.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(strComparableStream4);
        org.junit.Assert.assertNotNull(strComparableSpliterator5);
        org.junit.Assert.assertEquals("'" + strComparable9 + "' != '" + "[hi!]" + "'", strComparable9, "[hi!]");
        org.junit.Assert.assertNotNull(strComparableSpliterator10);
        org.junit.Assert.assertNotNull(strComparableSpliterator11);
        org.junit.Assert.assertNull(strComparable13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test5415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5415");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableDynamicArray0.isEmpty();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[hi!]");
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[hi!, hi!]");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator8 = strComparableDynamicArray0.spliterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable10 = strComparableDynamicArray0.remove((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 52 out of bounds for length 16");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(strComparableSpliterator8);
    }

    @Test
    public void test5416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5416");
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
        java.lang.Comparable<java.lang.String> strComparable18 = strComparableDynamicArray0.get((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNull(strComparable8);
        org.junit.Assert.assertNotNull(strComparableStream11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[hi!, hi!]" + "'", str12, "[hi!, hi!]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[hi!, hi!]" + "'", str16, "[hi!, hi!]");
        org.junit.Assert.assertNull(strComparable18);
    }

    @Test
    public void test5417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5417");
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
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[[[, ]]]");
        boolean boolean14 = strComparableDynamicArray0.isEmpty();
        boolean boolean15 = strComparableDynamicArray0.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNull(strComparable7);
        org.junit.Assert.assertNotNull(strComparableSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test5418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5418");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableDynamicArray0.getSize();
        boolean boolean7 = strComparableDynamicArray0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            strComparableDynamicArray0.put((int) ' ', (java.lang.Comparable<java.lang.String>) "[hi!, [, [[hi!]]]]");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 32 out of bounds for length 16");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test5419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5419");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableDynamicArray0.isEmpty();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream4 = strComparableDynamicArray0.stream();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream5 = strComparableDynamicArray0.stream();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[[[[hi!]]], , [hi!, []], [[hi!]]]");
        strComparableDynamicArray0.put((int) (byte) 1, (java.lang.Comparable<java.lang.String>) "[[hi!, [hi!]]]");
        // The following exception was thrown during execution in test generation
        try {
            strComparableDynamicArray0.put((int) (byte) 100, (java.lang.Comparable<java.lang.String>) "[[hi!, [[], hi!, , ]], hi!]");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 16");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(strComparableStream4);
        org.junit.Assert.assertNotNull(strComparableStream5);
    }

    @Test
    public void test5420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5420");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray1 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>((int) (byte) 100);
        java.lang.Comparable<java.lang.String> strComparable3 = strComparableDynamicArray1.get((int) ' ');
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator4 = strComparableDynamicArray1.spliterator();
        boolean boolean5 = strComparableDynamicArray1.isEmpty();
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableDynamicArray1.get((int) 'a');
        org.junit.Assert.assertNull(strComparable3);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(strComparable7);
    }

    @Test
    public void test5421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5421");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator4 = strComparableDynamicArray0.spliterator();
        java.lang.String str5 = strComparableDynamicArray0.toString();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[]");
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableDynamicArray0.get((int) (short) 1);
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator10 = strComparableDynamicArray0.spliterator();
        java.util.Iterator iterator11 = strComparableDynamicArray0.iterator();
        java.util.Iterator iterator12 = strComparableDynamicArray0.iterator();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[[], [hi!, [[hi!, hi!]]]]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertEquals("'" + strComparable9 + "' != '" + "[]" + "'", strComparable9, "[]");
        org.junit.Assert.assertNotNull(strComparableSpliterator10);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertNotNull(iterator12);
    }

    @Test
    public void test5422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5422");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.String str1 = strComparableDynamicArray0.toString();
        strComparableDynamicArray0.put(0, (java.lang.Comparable<java.lang.String>) "[hi!]");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator5 = strComparableDynamicArray0.spliterator();
        boolean boolean6 = strComparableDynamicArray0.isEmpty();
        int int7 = strComparableDynamicArray0.getSize();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "[]" + "'", str1, "[]");
        org.junit.Assert.assertNotNull(strComparableSpliterator5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test5423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5423");
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
        java.util.Iterator iterator16 = strComparableDynamicArray0.iterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator17 = strComparableDynamicArray0.spliterator();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(strComparableStream4);
        org.junit.Assert.assertNotNull(strComparableSpliterator5);
        org.junit.Assert.assertEquals("'" + strComparable9 + "' != '" + "[hi!]" + "'", strComparable9, "[hi!]");
        org.junit.Assert.assertEquals("'" + strComparable13 + "' != '" + "hi!" + "'", strComparable13, "hi!");
        org.junit.Assert.assertNotNull(strComparableSpliterator14);
        org.junit.Assert.assertNotNull(strComparableSpliterator15);
        org.junit.Assert.assertNotNull(iterator16);
        org.junit.Assert.assertNotNull(strComparableSpliterator17);
    }

    @Test
    public void test5424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5424");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableDynamicArray0.isEmpty();
        java.util.Iterator iterator2 = strComparableDynamicArray0.iterator();
        java.lang.String str3 = strComparableDynamicArray0.toString();
        java.lang.String str4 = strComparableDynamicArray0.toString();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator5 = strComparableDynamicArray0.spliterator();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[]" + "'", str3, "[]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertNotNull(strComparableSpliterator5);
    }

    @Test
    public void test5425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5425");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        boolean boolean4 = strComparableDynamicArray0.isEmpty();
        boolean boolean5 = strComparableDynamicArray0.isEmpty();
        boolean boolean6 = strComparableDynamicArray0.isEmpty();
        int int7 = strComparableDynamicArray0.getSize();
        boolean boolean8 = strComparableDynamicArray0.isEmpty();
        java.lang.Comparable<java.lang.String> strComparable10 = strComparableDynamicArray0.get(1);
        boolean boolean11 = strComparableDynamicArray0.isEmpty();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[hi!, , []]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(strComparable10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test5426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5426");
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
        java.util.Iterator iterator10 = strComparableDynamicArray0.iterator();
        int int11 = strComparableDynamicArray0.getSize();
        java.util.Iterator iterator12 = strComparableDynamicArray0.iterator();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(strComparableStream9);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(iterator12);
    }

    @Test
    public void test5427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5427");
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
        java.util.Iterator iterator24 = strComparableDynamicArray0.iterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator25 = strComparableDynamicArray0.spliterator();
        boolean boolean26 = strComparableDynamicArray0.isEmpty();
        int int27 = strComparableDynamicArray0.getSize();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNull(strComparable8);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertNull(strComparable13);
        org.junit.Assert.assertNull(strComparable15);
        org.junit.Assert.assertNotNull(strComparableStream18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[hi!, hi!, [hi!]]" + "'", str19, "[hi!, hi!, [hi!]]");
        org.junit.Assert.assertNotNull(iterator24);
        org.junit.Assert.assertNotNull(strComparableSpliterator25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 6 + "'", int27 == 6);
    }

    @Test
    public void test5428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5428");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        boolean boolean3 = strComparableDynamicArray0.isEmpty();
        java.lang.String str4 = strComparableDynamicArray0.toString();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator5 = strComparableDynamicArray0.spliterator();
        boolean boolean6 = strComparableDynamicArray0.isEmpty();
        java.util.Iterator iterator7 = strComparableDynamicArray0.iterator();
        boolean boolean8 = strComparableDynamicArray0.isEmpty();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream9 = strComparableDynamicArray0.stream();
        java.util.Iterator iterator10 = strComparableDynamicArray0.iterator();
        java.lang.Comparable<java.lang.String> strComparable12 = strComparableDynamicArray0.get(6);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertNotNull(strComparableSpliterator5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strComparableStream9);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertNull(strComparable12);
    }

    @Test
    public void test5429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5429");
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
        java.lang.String str13 = strComparableDynamicArray0.toString();
        java.util.Iterator iterator14 = strComparableDynamicArray0.iterator();
        // The following exception was thrown during execution in test generation
        try {
            strComparableDynamicArray0.put((int) (byte) 100, (java.lang.Comparable<java.lang.String>) "[[], hi!, [hi!, hi!, [hi!], [hi!]], [[[hi!, [hi!]]], ]]");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 16");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertNotNull(strComparableSpliterator5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertNotNull(strComparableStream10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[, [[, ]]]" + "'", str13, "[, [[, ]]]");
        org.junit.Assert.assertNotNull(iterator14);
    }

    @Test
    public void test5430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5430");
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
        strComparableDynamicArray0.put(10, (java.lang.Comparable<java.lang.String>) "[hi!, [[], hi!, , ]]");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator19 = strComparableDynamicArray0.spliterator();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream20 = strComparableDynamicArray0.stream();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[[hi!], hi!, [[hi!]]]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[hi!, []]" + "'", str11, "[hi!, []]");
        org.junit.Assert.assertNotNull(strComparableSpliterator12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[hi!, []]" + "'", str13, "[hi!, []]");
        org.junit.Assert.assertNotNull(strComparableSpliterator19);
        org.junit.Assert.assertNotNull(strComparableStream20);
    }

    @Test
    public void test5431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5431");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray1 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>((int) (short) 10);
        strComparableDynamicArray1.add((java.lang.Comparable<java.lang.String>) "[, ]");
        boolean boolean4 = strComparableDynamicArray1.isEmpty();
        boolean boolean5 = strComparableDynamicArray1.isEmpty();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream6 = strComparableDynamicArray1.stream();
        int int7 = strComparableDynamicArray1.getSize();
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableDynamicArray1.get(0);
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream10 = strComparableDynamicArray1.stream();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strComparableStream6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + strComparable9 + "' != '" + "[, ]" + "'", strComparable9, "[, ]");
        org.junit.Assert.assertNotNull(strComparableStream10);
    }

    @Test
    public void test5432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5432");
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
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream17 = strComparableDynamicArray0.stream();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator9);
        org.junit.Assert.assertNull(strComparable14);
        org.junit.Assert.assertEquals("'" + strComparable16 + "' != '" + "[hi!, hi!, [hi!], [hi!]]" + "'", strComparable16, "[hi!, hi!, [hi!], [hi!]]");
        org.junit.Assert.assertNotNull(strComparableStream17);
    }

    @Test
    public void test5433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5433");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator4 = strComparableDynamicArray0.spliterator();
        int int5 = strComparableDynamicArray0.getSize();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator6 = strComparableDynamicArray0.spliterator();
        java.lang.String str7 = strComparableDynamicArray0.toString();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream8 = strComparableDynamicArray0.stream();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertNotNull(strComparableStream8);
    }

    @Test
    public void test5434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5434");
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
        java.lang.Comparable<java.lang.String> strComparable16 = strComparableDynamicArray0.get((int) (byte) 0);
        boolean boolean17 = strComparableDynamicArray0.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertNotNull(strComparableSpliterator5);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertNull(strComparable8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertNotNull(strComparableStream12);
        org.junit.Assert.assertNotNull(strComparableStream13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[[, ]]" + "'", str14, "[[, ]]");
        org.junit.Assert.assertNull(strComparable16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test5435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5435");
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
        int int14 = strComparableDynamicArray0.getSize();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable16 = strComparableDynamicArray0.remove((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 16");
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
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test5436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5436");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray1 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>(1);
        boolean boolean2 = strComparableDynamicArray1.isEmpty();
        strComparableDynamicArray1.add((java.lang.Comparable<java.lang.String>) "[[[[hi!, [hi!]]], [[[[hi!]]], , [hi!, []], [[hi!]]]], [[hi!, hi!, [hi!]]]]");
        boolean boolean5 = strComparableDynamicArray1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test5437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5437");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator4 = strComparableDynamicArray0.spliterator();
        java.lang.String str5 = strComparableDynamicArray0.toString();
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableDynamicArray0.remove(0);
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream8 = strComparableDynamicArray0.stream();
        java.util.Iterator iterator9 = strComparableDynamicArray0.iterator();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNull(strComparable7);
        org.junit.Assert.assertNotNull(strComparableStream8);
        org.junit.Assert.assertNotNull(iterator9);
    }

    @Test
    public void test5438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5438");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "");
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDynamicArray0.put((int) (short) 0, (java.lang.Comparable<java.lang.String>) "[]");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator8 = strComparableDynamicArray0.spliterator();
        strComparableDynamicArray0.put(10, (java.lang.Comparable<java.lang.String>) "");
        java.lang.String str12 = strComparableDynamicArray0.toString();
        java.lang.Comparable<java.lang.String> strComparable14 = strComparableDynamicArray0.get(4);
        org.junit.Assert.assertNotNull(strComparableSpliterator8);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[[], hi!, ]" + "'", str12, "[[], hi!, ]");
        org.junit.Assert.assertNull(strComparable14);
    }

    @Test
    public void test5439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5439");
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
        int int12 = strComparableDynamicArray0.getSize();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableStream6);
        org.junit.Assert.assertNotNull(strComparableStream7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNull(strComparable11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test5440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5440");
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
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream17 = strComparableDynamicArray0.stream();
        org.junit.Assert.assertNotNull(strComparableSpliterator8);
        org.junit.Assert.assertNotNull(strComparableStream9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertNotNull(strComparableStream16);
        org.junit.Assert.assertNotNull(strComparableStream17);
    }

    @Test
    public void test5441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5441");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray1 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>((int) (short) 10);
        int int2 = strComparableDynamicArray1.getSize();
        java.lang.String str3 = strComparableDynamicArray1.toString();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator4 = strComparableDynamicArray1.spliterator();
        int int5 = strComparableDynamicArray1.getSize();
        strComparableDynamicArray1.put((int) (short) 0, (java.lang.Comparable<java.lang.String>) "[hi!, [[hi!, hi!]]]");
        strComparableDynamicArray1.add((java.lang.Comparable<java.lang.String>) "[[], [hi!, hi!, [, ], [[], hi!]], ]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[]" + "'", str3, "[]");
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test5442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5442");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableDynamicArray0.isEmpty();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream4 = strComparableDynamicArray0.stream();
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableDynamicArray0.get(10);
        java.lang.String str7 = strComparableDynamicArray0.toString();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream8 = strComparableDynamicArray0.stream();
        java.lang.Comparable<java.lang.String> strComparable10 = strComparableDynamicArray0.get(4);
        java.util.Iterator iterator11 = strComparableDynamicArray0.iterator();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(strComparableStream4);
        org.junit.Assert.assertNull(strComparable6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[hi!]" + "'", str7, "[hi!]");
        org.junit.Assert.assertNotNull(strComparableStream8);
        org.junit.Assert.assertNull(strComparable10);
        org.junit.Assert.assertNotNull(iterator11);
    }

    @Test
    public void test5443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5443");
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
        java.lang.String str21 = strComparableDynamicArray0.toString();
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
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "[[], ]" + "'", str21, "[[], ]");
    }

    @Test
    public void test5444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5444");
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
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[hi!, ]");
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
    }

    @Test
    public void test5445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5445");
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
        java.lang.String str17 = strComparableDynamicArray0.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNull(strComparable8);
        org.junit.Assert.assertNotNull(strComparableStream11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[hi!, hi!]" + "'", str12, "[hi!, hi!]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[hi!, hi!]" + "'", str16, "[hi!, hi!]");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[hi!, hi!]" + "'", str17, "[hi!, hi!]");
    }

    @Test
    public void test5446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5446");
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
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream12 = strComparableDynamicArray0.stream();
        int int13 = strComparableDynamicArray0.getSize();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator14 = strComparableDynamicArray0.spliterator();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator8);
        org.junit.Assert.assertNotNull(strComparableStream12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator14);
    }

    @Test
    public void test5447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5447");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableDynamicArray0.isEmpty();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream4 = strComparableDynamicArray0.stream();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator5 = strComparableDynamicArray0.spliterator();
        int int6 = strComparableDynamicArray0.getSize();
        boolean boolean7 = strComparableDynamicArray0.isEmpty();
        boolean boolean8 = strComparableDynamicArray0.isEmpty();
        int int9 = strComparableDynamicArray0.getSize();
        java.lang.Comparable<java.lang.String> strComparable11 = strComparableDynamicArray0.get((int) (byte) 10);
        java.lang.Comparable<java.lang.String> strComparable12 = null;
        strComparableDynamicArray0.add(strComparable12);
        boolean boolean14 = strComparableDynamicArray0.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(strComparableStream4);
        org.junit.Assert.assertNotNull(strComparableSpliterator5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNull(strComparable11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test5448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5448");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "");
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDynamicArray0.put((int) (short) 0, (java.lang.Comparable<java.lang.String>) "[]");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator8 = strComparableDynamicArray0.spliterator();
        java.lang.String str9 = strComparableDynamicArray0.toString();
        java.lang.String str10 = strComparableDynamicArray0.toString();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream11 = strComparableDynamicArray0.stream();
        java.lang.String str12 = strComparableDynamicArray0.toString();
        java.lang.Comparable<java.lang.String> strComparable14 = strComparableDynamicArray0.remove((int) (short) 0);
        org.junit.Assert.assertNotNull(strComparableSpliterator8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[[], hi!]" + "'", str9, "[[], hi!]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[[], hi!]" + "'", str10, "[[], hi!]");
        org.junit.Assert.assertNotNull(strComparableStream11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[[], hi!]" + "'", str12, "[[], hi!]");
        org.junit.Assert.assertEquals("'" + strComparable14 + "' != '" + "[]" + "'", strComparable14, "[]");
    }

    @Test
    public void test5449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5449");
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
        java.lang.String str17 = strComparableDynamicArray0.toString();
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[[[], hi!]]" + "'", str17, "[[[], hi!]]");
    }

    @Test
    public void test5450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5450");
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
        java.lang.String str18 = strComparableDynamicArray0.toString();
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[, [hi!, hi!]]" + "'", str18, "[, [hi!, hi!]]");
    }

    @Test
    public void test5451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5451");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray1 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>(100);
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream2 = strComparableDynamicArray1.stream();
        strComparableDynamicArray1.add((java.lang.Comparable<java.lang.String>) "");
        strComparableDynamicArray1.put(1, (java.lang.Comparable<java.lang.String>) "[[hi!]]");
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableDynamicArray1.get(0);
        int int10 = strComparableDynamicArray1.getSize();
        java.lang.String str11 = strComparableDynamicArray1.toString();
        strComparableDynamicArray1.add((java.lang.Comparable<java.lang.String>) "[hi!, [hi!, , []]]");
        org.junit.Assert.assertNotNull(strComparableStream2);
        org.junit.Assert.assertEquals("'" + strComparable9 + "' != '" + "" + "'", strComparable9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[, [[hi!]]]" + "'", str11, "[, [[hi!]]]");
    }

    @Test
    public void test5452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5452");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableDynamicArray0.getSize();
        java.util.Iterator iterator7 = strComparableDynamicArray0.iterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator8 = strComparableDynamicArray0.spliterator();
        boolean boolean9 = strComparableDynamicArray0.isEmpty();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream10 = strComparableDynamicArray0.stream();
        java.lang.String str11 = strComparableDynamicArray0.toString();
        java.util.Iterator iterator12 = strComparableDynamicArray0.iterator();
        boolean boolean13 = strComparableDynamicArray0.isEmpty();
        java.util.Iterator iterator14 = strComparableDynamicArray0.iterator();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[, [hi!, []]]");
        strComparableDynamicArray0.put((int) (short) 1, (java.lang.Comparable<java.lang.String>) "[[hi!, [[], hi!, , ]], hi!]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(strComparableSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strComparableStream10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[hi!]" + "'", str11, "[hi!]");
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(iterator14);
    }

    @Test
    public void test5453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5453");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.String str1 = strComparableDynamicArray0.toString();
        strComparableDynamicArray0.put(0, (java.lang.Comparable<java.lang.String>) "[hi!]");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator5 = strComparableDynamicArray0.spliterator();
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableDynamicArray0.get(0);
        int int8 = strComparableDynamicArray0.getSize();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "[]" + "'", str1, "[]");
        org.junit.Assert.assertNotNull(strComparableSpliterator5);
        org.junit.Assert.assertEquals("'" + strComparable7 + "' != '" + "[hi!]" + "'", strComparable7, "[hi!]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test5454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5454");
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
        boolean boolean18 = strComparableDynamicArray0.isEmpty();
        java.util.Iterator iterator19 = strComparableDynamicArray0.iterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator20 = strComparableDynamicArray0.spliterator();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertNotNull(strComparableStream10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[[[hi!, [hi!]]], [[[[hi!]]], , [hi!, []], [[hi!]]]]" + "'", str17, "[[[hi!, [hi!]]], [[[[hi!]]], , [hi!, []], [[hi!]]]]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(iterator19);
        org.junit.Assert.assertNotNull(strComparableSpliterator20);
    }

    @Test
    public void test5455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5455");
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
        java.lang.Class<?> wildcardClass22 = strComparableStream21.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[hi!, []]" + "'", str11, "[hi!, []]");
        org.junit.Assert.assertEquals("'" + strComparable19 + "' != '" + "[[[[], hi!, , ]]]" + "'", strComparable19, "[[[[], hi!, , ]]]");
        org.junit.Assert.assertNotNull(strComparableSpliterator20);
        org.junit.Assert.assertNotNull(strComparableStream21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test5456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5456");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator4 = strComparableDynamicArray0.spliterator();
        int int5 = strComparableDynamicArray0.getSize();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream6 = strComparableDynamicArray0.stream();
        java.lang.String str7 = strComparableDynamicArray0.toString();
        java.lang.String str8 = strComparableDynamicArray0.toString();
        java.util.Iterator iterator9 = strComparableDynamicArray0.iterator();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(strComparableStream6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertNotNull(iterator9);
    }

    @Test
    public void test5457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5457");
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
        // The following exception was thrown during execution in test generation
        try {
            strComparableDynamicArray0.put((int) (byte) 100, (java.lang.Comparable<java.lang.String>) "[[hi!, [[[[hi!]]], , [hi!, []], [[hi!]]]]]");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 16");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
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
    public void test5458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5458");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableDynamicArray0.isEmpty();
        java.lang.String str2 = strComparableDynamicArray0.toString();
        boolean boolean3 = strComparableDynamicArray0.isEmpty();
        java.util.Iterator iterator4 = strComparableDynamicArray0.iterator();
        java.lang.Class<?> wildcardClass5 = strComparableDynamicArray0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test5459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5459");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableDynamicArray0.getSize();
        java.util.Iterator iterator7 = strComparableDynamicArray0.iterator();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[hi!, [hi!]]");
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[hi!, hi!]");
        java.lang.String str12 = strComparableDynamicArray0.toString();
        int int13 = strComparableDynamicArray0.getSize();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[hi!, [hi!, [hi!]], [hi!, hi!]]" + "'", str12, "[hi!, [hi!, [hi!]], [hi!, hi!]]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
    }

    @Test
    public void test5460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5460");
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
        java.util.Iterator iterator24 = strComparableDynamicArray0.iterator();
        boolean boolean25 = strComparableDynamicArray0.isEmpty();
        java.lang.Comparable<java.lang.String> strComparable27 = strComparableDynamicArray0.remove((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            strComparableDynamicArray0.put((int) '4', (java.lang.Comparable<java.lang.String>) "[hi!, hi!, , [[hi!, hi!, [[], hi!]], []]]");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 52 out of bounds for length 16");
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
        org.junit.Assert.assertNull(strComparable23);
        org.junit.Assert.assertNotNull(iterator24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + strComparable27 + "' != '" + "hi!" + "'", strComparable27, "hi!");
    }

    @Test
    public void test5461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5461");
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
        strComparableDynamicArray0.put(0, (java.lang.Comparable<java.lang.String>) "[hi!, [[]]]");
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream16 = strComparableDynamicArray0.stream();
        boolean boolean17 = strComparableDynamicArray0.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(strComparableStream8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertNotNull(strComparableStream16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test5462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5462");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        java.lang.Comparable<java.lang.String> strComparable4 = strComparableDynamicArray0.get(4);
        java.util.Iterator iterator5 = strComparableDynamicArray0.iterator();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream6 = strComparableDynamicArray0.stream();
        strComparableDynamicArray0.put((int) (byte) 10, (java.lang.Comparable<java.lang.String>) "[[, ]]");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable11 = strComparableDynamicArray0.remove((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 16");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(strComparable4);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertNotNull(strComparableStream6);
    }

    @Test
    public void test5463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5463");
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
        int int15 = strComparableDynamicArray0.getSize();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[hi!, []]" + "'", str11, "[hi!, []]");
        org.junit.Assert.assertNotNull(strComparableSpliterator12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
    }

    @Test
    public void test5464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5464");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray1 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>((int) (byte) 0);
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator2 = strComparableDynamicArray1.spliterator();
        boolean boolean3 = strComparableDynamicArray1.isEmpty();
        java.lang.String str4 = strComparableDynamicArray1.toString();
        boolean boolean5 = strComparableDynamicArray1.isEmpty();
        boolean boolean6 = strComparableDynamicArray1.isEmpty();
        java.lang.String str7 = strComparableDynamicArray1.toString();
        int int8 = strComparableDynamicArray1.getSize();
        int int9 = strComparableDynamicArray1.getSize();
        java.util.Iterator iterator10 = strComparableDynamicArray1.iterator();
        java.lang.Class<?> wildcardClass11 = strComparableDynamicArray1.getClass();
        org.junit.Assert.assertNotNull(strComparableSpliterator2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test5465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5465");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.String str1 = strComparableDynamicArray0.toString();
        strComparableDynamicArray0.put(0, (java.lang.Comparable<java.lang.String>) "[hi!]");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator5 = strComparableDynamicArray0.spliterator();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream6 = strComparableDynamicArray0.stream();
        java.util.Iterator iterator7 = strComparableDynamicArray0.iterator();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "");
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream10 = strComparableDynamicArray0.stream();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "[]" + "'", str1, "[]");
        org.junit.Assert.assertNotNull(strComparableSpliterator5);
        org.junit.Assert.assertNotNull(strComparableStream6);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(strComparableStream10);
    }

    @Test
    public void test5466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5466");
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
        strComparableDynamicArray0.put(1, (java.lang.Comparable<java.lang.String>) "[[, ]]");
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[hi!, [], [, hi!, , hi!], [[[[], hi!, , ]]]]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[hi!, []]" + "'", str11, "[hi!, []]");
        org.junit.Assert.assertNotNull(strComparableSpliterator12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[hi!, []]" + "'", str13, "[hi!, []]");
        org.junit.Assert.assertNull(strComparable15);
    }

    @Test
    public void test5467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5467");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray1 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>(0);
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator2 = strComparableDynamicArray1.spliterator();
        int int3 = strComparableDynamicArray1.getSize();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream4 = strComparableDynamicArray1.stream();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream5 = strComparableDynamicArray1.stream();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator6 = strComparableDynamicArray1.spliterator();
        // The following exception was thrown during execution in test generation
        try {
            strComparableDynamicArray1.put(3, (java.lang.Comparable<java.lang.String>) "[hi!, , []]");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 3 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strComparableSpliterator2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(strComparableStream4);
        org.junit.Assert.assertNotNull(strComparableStream5);
        org.junit.Assert.assertNotNull(strComparableSpliterator6);
    }

    @Test
    public void test5468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5468");
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
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream19 = strComparableDynamicArray0.stream();
        java.lang.Comparable<java.lang.String> strComparable21 = null;
        // The following exception was thrown during execution in test generation
        try {
            strComparableDynamicArray0.put(100, strComparable21);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 16");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNull(strComparable8);
        org.junit.Assert.assertNotNull(strComparableSpliterator17);
        org.junit.Assert.assertNotNull(strComparableStream18);
        org.junit.Assert.assertNotNull(strComparableStream19);
    }

    @Test
    public void test5469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5469");
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
        java.lang.String str14 = strComparableDynamicArray0.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertNotNull(strComparableSpliterator11);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[hi!, []]" + "'", str14, "[hi!, []]");
    }

    @Test
    public void test5470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5470");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable25 = strComparableDynamicArray0.remove((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 16");
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
        org.junit.Assert.assertNotNull(iterator22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 5 + "'", int23 == 5);
    }

    @Test
    public void test5471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5471");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableDynamicArray0.isEmpty();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream2 = strComparableDynamicArray0.stream();
        boolean boolean3 = strComparableDynamicArray0.isEmpty();
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableDynamicArray0.get((int) (byte) 1);
        boolean boolean6 = strComparableDynamicArray0.isEmpty();
        int int7 = strComparableDynamicArray0.getSize();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream8 = strComparableDynamicArray0.stream();
        boolean boolean9 = strComparableDynamicArray0.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(strComparableStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(strComparable5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(strComparableStream8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test5472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5472");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "");
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDynamicArray0.put((int) (short) 0, (java.lang.Comparable<java.lang.String>) "[]");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator8 = strComparableDynamicArray0.spliterator();
        strComparableDynamicArray0.put(10, (java.lang.Comparable<java.lang.String>) "");
        java.util.Iterator iterator12 = strComparableDynamicArray0.iterator();
        strComparableDynamicArray0.put((int) (short) 0, (java.lang.Comparable<java.lang.String>) "[hi!, []]");
        java.lang.Comparable<java.lang.String> strComparable17 = strComparableDynamicArray0.get(0);
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator18 = strComparableDynamicArray0.spliterator();
        java.lang.Comparable<java.lang.String> strComparable20 = strComparableDynamicArray0.get(3);
        org.junit.Assert.assertNotNull(strComparableSpliterator8);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertEquals("'" + strComparable17 + "' != '" + "[hi!, []]" + "'", strComparable17, "[hi!, []]");
        org.junit.Assert.assertNotNull(strComparableSpliterator18);
        org.junit.Assert.assertNull(strComparable20);
    }

    @Test
    public void test5473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5473");
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
        java.lang.String str18 = strComparableDynamicArray0.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNull(strComparable8);
        org.junit.Assert.assertNotNull(strComparableStream11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[hi!, hi!]" + "'", str12, "[hi!, hi!]");
        org.junit.Assert.assertNotNull(strComparableStream15);
        org.junit.Assert.assertNotNull(iterator16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[hi!, hi!]" + "'", str17, "[hi!, hi!]");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[hi!, hi!]" + "'", str18, "[hi!, hi!]");
    }

    @Test
    public void test5474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5474");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        java.lang.Comparable<java.lang.String> strComparable4 = strComparableDynamicArray0.get(4);
        java.util.Iterator iterator5 = strComparableDynamicArray0.iterator();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream6 = strComparableDynamicArray0.stream();
        strComparableDynamicArray0.put((int) (byte) 10, (java.lang.Comparable<java.lang.String>) "[[, ]]");
        java.util.Iterator iterator10 = strComparableDynamicArray0.iterator();
        java.lang.Class<?> wildcardClass11 = iterator10.getClass();
        org.junit.Assert.assertNull(strComparable4);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertNotNull(strComparableStream6);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test5475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5475");
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
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream14 = strComparableDynamicArray0.stream();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream15 = strComparableDynamicArray0.stream();
        // The following exception was thrown during execution in test generation
        try {
            strComparableDynamicArray0.put((int) (byte) 100, (java.lang.Comparable<java.lang.String>) "[]");
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
        org.junit.Assert.assertNotNull(strComparableStream13);
        org.junit.Assert.assertNotNull(strComparableStream14);
        org.junit.Assert.assertNotNull(strComparableStream15);
    }

    @Test
    public void test5476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5476");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        boolean boolean4 = strComparableDynamicArray0.isEmpty();
        boolean boolean5 = strComparableDynamicArray0.isEmpty();
        int int6 = strComparableDynamicArray0.getSize();
        java.lang.String str7 = strComparableDynamicArray0.toString();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator8 = strComparableDynamicArray0.spliterator();
        boolean boolean9 = strComparableDynamicArray0.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertNotNull(strComparableSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test5477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5477");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        boolean boolean4 = strComparableDynamicArray0.isEmpty();
        boolean boolean5 = strComparableDynamicArray0.isEmpty();
        int int6 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[, ]");
        boolean boolean9 = strComparableDynamicArray0.isEmpty();
        java.lang.String str10 = strComparableDynamicArray0.toString();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator11 = strComparableDynamicArray0.spliterator();
        java.util.Iterator iterator12 = strComparableDynamicArray0.iterator();
        java.util.Iterator iterator13 = strComparableDynamicArray0.iterator();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[[, ]]" + "'", str10, "[[, ]]");
        org.junit.Assert.assertNotNull(strComparableSpliterator11);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertNotNull(iterator13);
    }

    @Test
    public void test5478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5478");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable16 = strComparableDynamicArray0.remove((int) (short) 100);
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
    }

    @Test
    public void test5479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5479");
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
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[hi!, [], [hi!]]");
        java.lang.String str26 = strComparableDynamicArray0.toString();
        strComparableDynamicArray0.put((int) (short) 10, (java.lang.Comparable<java.lang.String>) "[hi!, [hi!, hi!, [hi!]], [[hi!, hi!, [hi!], [hi!]], ]]");
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
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "[hi!, hi!, [hi!, [], [hi!]], [[], hi!]]" + "'", str26, "[hi!, hi!, [hi!, [], [hi!]], [[], hi!]]");
    }

    @Test
    public void test5480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5480");
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
        int int17 = strComparableDynamicArray0.getSize();
        java.lang.Class<?> wildcardClass18 = strComparableDynamicArray0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(strComparableStream4);
        org.junit.Assert.assertNotNull(strComparableSpliterator5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[hi!, [hi!]]" + "'", str8, "[hi!, [hi!]]");
        org.junit.Assert.assertNull(strComparable12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test5481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5481");
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
        boolean boolean12 = strComparableDynamicArray0.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableStream6);
        org.junit.Assert.assertNotNull(strComparableStream7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertEquals("'" + strComparable11 + "' != '" + "hi!" + "'", strComparable11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test5482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5482");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableDynamicArray0.getSize();
        java.util.Iterator iterator7 = strComparableDynamicArray0.iterator();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[hi!, [hi!]]");
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream10 = strComparableDynamicArray0.stream();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream11 = strComparableDynamicArray0.stream();
        java.util.Iterator iterator12 = strComparableDynamicArray0.iterator();
        int int13 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.put(0, (java.lang.Comparable<java.lang.String>) "[hi!, [], [hi!]]");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator17 = strComparableDynamicArray0.spliterator();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(strComparableStream10);
        org.junit.Assert.assertNotNull(strComparableStream11);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertNotNull(strComparableSpliterator17);
    }

    @Test
    public void test5483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5483");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray1 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>((int) (byte) 0);
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator2 = strComparableDynamicArray1.spliterator();
        boolean boolean3 = strComparableDynamicArray1.isEmpty();
        java.lang.String str4 = strComparableDynamicArray1.toString();
        boolean boolean5 = strComparableDynamicArray1.isEmpty();
        boolean boolean6 = strComparableDynamicArray1.isEmpty();
        java.lang.String str7 = strComparableDynamicArray1.toString();
        int int8 = strComparableDynamicArray1.getSize();
        java.lang.Class<?> wildcardClass9 = strComparableDynamicArray1.getClass();
        org.junit.Assert.assertNotNull(strComparableSpliterator2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test5484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5484");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray1 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>(100);
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream2 = strComparableDynamicArray1.stream();
        strComparableDynamicArray1.add((java.lang.Comparable<java.lang.String>) "");
        strComparableDynamicArray1.put(1, (java.lang.Comparable<java.lang.String>) "[[hi!]]");
        java.util.Iterator iterator8 = strComparableDynamicArray1.iterator();
        strComparableDynamicArray1.put((int) '#', (java.lang.Comparable<java.lang.String>) "[[[hi!, [hi!]]], [[[[hi!]]], , [hi!, []], [[hi!]]]]");
        java.lang.Comparable<java.lang.String> strComparable13 = strComparableDynamicArray1.remove(0);
        org.junit.Assert.assertNotNull(strComparableStream2);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertEquals("'" + strComparable13 + "' != '" + "" + "'", strComparable13, "");
    }

    @Test
    public void test5485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5485");
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
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream15 = strComparableDynamicArray0.stream();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream16 = strComparableDynamicArray0.stream();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertNotNull(strComparableStream15);
        org.junit.Assert.assertNotNull(strComparableStream16);
    }

    @Test
    public void test5486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5486");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray1 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>(100);
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream2 = strComparableDynamicArray1.stream();
        strComparableDynamicArray1.add((java.lang.Comparable<java.lang.String>) "");
        strComparableDynamicArray1.put(1, (java.lang.Comparable<java.lang.String>) "[[hi!]]");
        java.util.Iterator iterator8 = strComparableDynamicArray1.iterator();
        strComparableDynamicArray1.put((int) '#', (java.lang.Comparable<java.lang.String>) "[[[hi!, [hi!]]], [[[[hi!]]], , [hi!, []], [[hi!]]]]");
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream12 = strComparableDynamicArray1.stream();
        org.junit.Assert.assertNotNull(strComparableStream2);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(strComparableStream12);
    }

    @Test
    public void test5487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5487");
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
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator17 = strComparableDynamicArray1.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator18 = strComparableDynamicArray1.spliterator();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNull(strComparable6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertNull(strComparable9);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertNull(strComparable12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(iterator16);
        org.junit.Assert.assertNotNull(strComparableSpliterator17);
        org.junit.Assert.assertNotNull(strComparableSpliterator18);
    }

    @Test
    public void test5488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5488");
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
        strComparableDynamicArray0.put(1, (java.lang.Comparable<java.lang.String>) "[[[], hi!]]");
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[[hi!, []], [[hi!], hi!]]");
        org.junit.Assert.assertNotNull(strComparableSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNotNull(strComparableStream15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test5489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5489");
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
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator13 = strComparableDynamicArray0.spliterator();
        java.util.Iterator iterator14 = strComparableDynamicArray0.iterator();
        java.lang.Comparable<java.lang.String> strComparable16 = strComparableDynamicArray0.remove((int) (byte) 10);
        boolean boolean17 = strComparableDynamicArray0.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertNotNull(strComparableSpliterator5);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertNull(strComparable8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator13);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertNull(strComparable16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test5490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5490");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray1 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>((int) (byte) 0);
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator2 = strComparableDynamicArray1.spliterator();
        java.lang.String str3 = strComparableDynamicArray1.toString();
        java.lang.String str4 = strComparableDynamicArray1.toString();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator5 = strComparableDynamicArray1.spliterator();
        org.junit.Assert.assertNotNull(strComparableSpliterator2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[]" + "'", str3, "[]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertNotNull(strComparableSpliterator5);
    }

    @Test
    public void test5491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5491");
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
        strComparableDynamicArray0.put(4, (java.lang.Comparable<java.lang.String>) "[[, ]]");
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream19 = strComparableDynamicArray0.stream();
        strComparableDynamicArray0.put((int) (short) 0, (java.lang.Comparable<java.lang.String>) "[[], ]");
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[[], hi!, [[hi!]]]");
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
    public void test5492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5492");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray1 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>((int) (short) 1);
        strComparableDynamicArray1.add((java.lang.Comparable<java.lang.String>) "[[hi!, hi!]]");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator4 = strComparableDynamicArray1.spliterator();
        int int5 = strComparableDynamicArray1.getSize();
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test5493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5493");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray1 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>((int) (short) 10);
        int int2 = strComparableDynamicArray1.getSize();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream3 = strComparableDynamicArray1.stream();
        strComparableDynamicArray1.put(1, (java.lang.Comparable<java.lang.String>) "[, [[, ]]]");
        boolean boolean7 = strComparableDynamicArray1.isEmpty();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream8 = strComparableDynamicArray1.stream();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream9 = strComparableDynamicArray1.stream();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(strComparableStream3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strComparableStream8);
        org.junit.Assert.assertNotNull(strComparableStream9);
    }

    @Test
    public void test5494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5494");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableDynamicArray0.getSize();
        int int7 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[]");
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator12 = strComparableDynamicArray0.spliterator();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNotNull(strComparableSpliterator12);
    }

    @Test
    public void test5495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5495");
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
        strComparableDynamicArray0.put(3, (java.lang.Comparable<java.lang.String>) "[hi!, [hi!]]");
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[, ]");
        int int21 = strComparableDynamicArray0.getSize();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNull(strComparable8);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertNotNull(strComparableStream12);
        org.junit.Assert.assertEquals("'" + strComparable14 + "' != '" + "hi!" + "'", strComparable14, "hi!");
        org.junit.Assert.assertNotNull(strComparableStream15);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4 + "'", int21 == 4);
    }

    @Test
    public void test5496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5496");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        boolean boolean3 = strComparableDynamicArray0.isEmpty();
        java.lang.String str4 = strComparableDynamicArray0.toString();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[hi!, []]");
        java.lang.Comparable<java.lang.String> strComparable10 = strComparableDynamicArray0.remove(4);
        java.util.Iterator iterator11 = strComparableDynamicArray0.iterator();
        java.lang.Class<?> wildcardClass12 = iterator11.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertNull(strComparable10);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test5497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5497");
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
        java.lang.String str15 = strComparableDynamicArray0.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertNotNull(strComparableSpliterator11);
        org.junit.Assert.assertNull(strComparable13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[hi!, []]" + "'", str15, "[hi!, []]");
    }

    @Test
    public void test5498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5498");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator4 = strComparableDynamicArray0.spliterator();
        java.lang.String str5 = strComparableDynamicArray0.toString();
        int int6 = strComparableDynamicArray0.getSize();
        java.util.Iterator iterator7 = strComparableDynamicArray0.iterator();
        strComparableDynamicArray0.put(10, (java.lang.Comparable<java.lang.String>) "[, [hi!]]");
        boolean boolean11 = strComparableDynamicArray0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable13 = strComparableDynamicArray0.get((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test5499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5499");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.put(0, (java.lang.Comparable<java.lang.String>) "[hi!]");
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[hi!, hi!]");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator9 = strComparableDynamicArray0.spliterator();
        java.util.Iterator iterator10 = strComparableDynamicArray0.iterator();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator9);
        org.junit.Assert.assertNotNull(iterator10);
    }

    @Test
    public void test5500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5500");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableDynamicArray0.getSize();
        java.util.Iterator iterator7 = strComparableDynamicArray0.iterator();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[[], hi!]");
        strComparableDynamicArray0.put(10, (java.lang.Comparable<java.lang.String>) "[[, ]]");
        java.lang.Comparable<java.lang.String> strComparable14 = strComparableDynamicArray0.remove(10);
        java.lang.Comparable<java.lang.String> strComparable16 = strComparableDynamicArray0.remove(3);
        java.lang.String str17 = strComparableDynamicArray0.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertEquals("'" + strComparable14 + "' != '" + "[[, ]]" + "'", strComparable14, "[[, ]]");
        org.junit.Assert.assertNull(strComparable16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[[[, ]]]" + "'", str17, "[[[, ]]]");
    }
}

