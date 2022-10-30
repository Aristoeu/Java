package caches;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest12 {

    public static boolean debug = false;

    @Test
    public void test6001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6001");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str8 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable14 = null;
        java.lang.String str15 = strComparableMRUCache0.get(strComparable14);
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str20 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str31 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
    }

    @Test
    public void test6002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6002");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str23 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Class<?> wildcardClass27 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test6003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6003");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Comparable<java.lang.String> strComparable10 = null;
        strComparableMRUCache0.put(strComparable10, "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str20 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str22 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.Comparable<java.lang.String> strComparable26 = null;
        java.lang.String str27 = strComparableMRUCache0.get(strComparable26);
        java.lang.String str29 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str31 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.Comparable<java.lang.String> strComparable38 = null;
        strComparableMRUCache0.put(strComparable38, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
    }

    @Test
    public void test6004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6004");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        java.lang.String str2 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str10 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str18 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str23 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str28 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str30 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
    }

    @Test
    public void test6005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6005");
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: capacity must greater than 0!");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6006");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str11 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str16 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass17 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test6007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6007");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str8 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable14 = null;
        java.lang.String str15 = strComparableMRUCache0.get(strComparable14);
        java.lang.String str17 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.Comparable<java.lang.String> strComparable21 = null;
        java.lang.String str22 = strComparableMRUCache0.get(strComparable21);
        java.lang.String str24 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass25 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test6008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6008");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Comparable<java.lang.String> strComparable10 = null;
        strComparableMRUCache0.put(strComparable10, "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str17 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str25 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str27 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test6009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6009");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str8 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable14 = null;
        java.lang.String str15 = strComparableMRUCache0.get(strComparable14);
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str23 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str34 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str36 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
    }

    @Test
    public void test6010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6010");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str11 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str16 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str18 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str26 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNull(str26);
    }

    @Test
    public void test6011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6011");
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.datastructures.caches.MRUCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>> typeMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: capacity must greater than 0!");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6012");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Comparable<java.lang.String> strComparable10 = null;
        strComparableMRUCache0.put(strComparable10, "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str17 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str19 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str27 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str29 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str34 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
    }

    @Test
    public void test6013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6013");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str11 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str15 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str17 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str19 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str21 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test6014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6014");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>(1);
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str6 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass7 = strComparableMRUCache1.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test6015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6015");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Comparable<java.lang.String> strComparable10 = null;
        strComparableMRUCache0.put(strComparable10, "");
        java.lang.String str14 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.Comparable<java.lang.String> strComparable24 = null;
        strComparableMRUCache0.put(strComparable24, "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str31 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str33 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
    }

    @Test
    public void test6016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6016");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((int) (short) 1);
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str12 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test6017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6017");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        java.lang.String str2 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str10 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str21 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.Class<?> wildcardClass25 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test6018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6018");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.String, java.io.Serializable> strMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.String, java.io.Serializable>(10);
    }

    @Test
    public void test6019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6019");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.Comparable<java.lang.String> strComparable4 = null;
        strComparableMRUCache0.put(strComparable4, "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.Comparable<java.lang.String> strComparable10 = null;
        java.lang.String str11 = strComparableMRUCache0.get(strComparable10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test6020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6020");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>(1);
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str9 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str11 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str13 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass14 = strComparableMRUCache1.getClass();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test6021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6021");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.CharSequence, java.lang.Class<?>> charSequenceMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.CharSequence, java.lang.Class<?>>((int) (short) 1);
    }

    @Test
    public void test6022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6022");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str5 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str7 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str9 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str11 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str18 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str26 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str31 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
    }

    @Test
    public void test6023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6023");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str8 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str15 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str20 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str22 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str24 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str26 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str28 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str30 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str35 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
    }

    @Test
    public void test6024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6024");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((int) '4');
        java.lang.String str3 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str8 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str16 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str18 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test6025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6025");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str8 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable14 = null;
        java.lang.String str15 = strComparableMRUCache0.get(strComparable14);
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str26 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str28 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str30 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str32 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
    }

    @Test
    public void test6026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6026");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.Comparable<java.lang.String> strComparable10 = null;
        strComparableMRUCache0.put(strComparable10, "hi!");
        java.lang.String str14 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str16 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str18 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test6027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6027");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((int) '#');
        java.lang.String str3 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass4 = strComparableMRUCache1.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test6028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6028");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str8 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable14 = null;
        java.lang.String str15 = strComparableMRUCache0.get(strComparable14);
        java.lang.String str17 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str19 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str24 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str29 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str31 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
    }

    @Test
    public void test6029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6029");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str8 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable14 = null;
        java.lang.String str15 = strComparableMRUCache0.get(strComparable14);
        java.lang.String str17 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str22 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str27 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str29 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.Class<?> wildcardClass33 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test6030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6030");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        java.lang.String str2 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str10 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test6031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6031");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str8 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable14 = null;
        java.lang.String str15 = strComparableMRUCache0.get(strComparable14);
        java.lang.String str17 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.Comparable<java.lang.String> strComparable21 = null;
        strComparableMRUCache0.put(strComparable21, "");
        java.lang.String str25 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test6032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6032");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str5 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str15 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str17 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str19 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test6033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6033");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str8 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str15 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str17 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str25 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable26 = null;
        java.lang.String str27 = strComparableMRUCache0.get(strComparable26);
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNull(str27);
    }

    @Test
    public void test6034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6034");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str8 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str15 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str17 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str19 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str21 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str23 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test6035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6035");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str11 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str22 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.Class<?> wildcardClass26 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test6036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6036");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str11 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str27 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str29 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str31 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
    }

    @Test
    public void test6037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6037");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Comparable<java.lang.String> strComparable10 = null;
        strComparableMRUCache0.put(strComparable10, "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str17 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str19 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.Comparable<java.lang.String> strComparable26 = null;
        java.lang.String str27 = strComparableMRUCache0.get(strComparable26);
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str32 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Class<?> wildcardClass36 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test6038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6038");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        java.lang.String str2 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test6039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6039");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Comparable<java.lang.String> strComparable10 = null;
        strComparableMRUCache0.put(strComparable10, "");
        java.lang.String str14 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str16 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str18 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str20 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str22 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str24 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str26 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str28 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str30 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str32 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
    }

    @Test
    public void test6040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6040");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str11 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str15 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str17 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str19 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str36 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass37 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test6041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6041");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str17 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str22 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test6042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6042");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str8 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str15 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str20 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str25 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str30 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str35 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
    }

    @Test
    public void test6043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6043");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((int) ' ');
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
    }

    @Test
    public void test6044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6044");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>, com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>> wildcardClassOfFieldMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>, com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>>(100);
    }

    @Test
    public void test6045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6045");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str5 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable6 = null;
        strComparableMRUCache0.put(strComparable6, "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str19 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str27 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str29 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
    }

    @Test
    public void test6046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6046");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Comparable<java.lang.String> strComparable10 = null;
        strComparableMRUCache0.put(strComparable10, "");
        java.lang.String str14 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Comparable<java.lang.String> strComparable18 = null;
        strComparableMRUCache0.put(strComparable18, "hi!");
        java.lang.String str22 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str27 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test6047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6047");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str5 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str7 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str9 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test6048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6048");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.Comparable<java.lang.String> strComparable10 = null;
        strComparableMRUCache0.put(strComparable10, "hi!");
        java.lang.String str14 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str22 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str30 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str32 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
    }

    @Test
    public void test6049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6049");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str11 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str18 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str20 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str25 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str27 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test6050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6050");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str8 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable14 = null;
        java.lang.String str15 = strComparableMRUCache0.get(strComparable14);
        java.lang.String str17 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str19 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str21 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str23 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str25 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Class<?> wildcardClass32 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test6051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6051");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Comparable<java.lang.String> strComparable10 = null;
        strComparableMRUCache0.put(strComparable10, "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str17 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str19 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str27 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str35 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
    }

    @Test
    public void test6052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6052");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Comparable<java.lang.String> strComparable10 = null;
        strComparableMRUCache0.put(strComparable10, "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str20 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str22 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test6053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6053");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.CharSequence, com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>> charSequenceMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.CharSequence, com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>>((int) '#');
    }

    @Test
    public void test6054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6054");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str8 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable14 = null;
        java.lang.String str15 = strComparableMRUCache0.get(strComparable14);
        java.lang.String str17 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.Comparable<java.lang.String> strComparable21 = null;
        strComparableMRUCache0.put(strComparable21, "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str37 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
    }

    @Test
    public void test6055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6055");
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.datastructures.caches.MRUCache<java.lang.String, java.lang.Comparable<java.lang.String>> strMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.String, java.lang.Comparable<java.lang.String>>(0);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: capacity must greater than 0!");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6056");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>(10);
        java.lang.Comparable<java.lang.String> strComparable2 = null;
        java.lang.String str3 = strComparableMRUCache1.get(strComparable2);
        java.lang.String str5 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str10 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test6057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6057");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Comparable<java.lang.String> strComparable10 = null;
        strComparableMRUCache0.put(strComparable10, "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str20 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str22 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.Comparable<java.lang.String> strComparable29 = null;
        java.lang.String str30 = strComparableMRUCache0.get(strComparable29);
        java.lang.String str32 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str34 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass35 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test6058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6058");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        java.lang.String str2 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str10 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str18 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str26 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
    }

    @Test
    public void test6059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6059");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.constant.ConstantDesc, java.lang.Comparable<java.lang.String>> constantDescMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.constant.ConstantDesc, java.lang.Comparable<java.lang.String>>(10);
        java.lang.Class<?> wildcardClass2 = constantDescMRUCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test6060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6060");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        java.lang.String str2 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str7 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str9 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str11 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str22 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test6061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6061");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((int) (byte) 1);
        java.lang.String str3 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str5 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str7 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str9 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass10 = strComparableMRUCache1.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test6062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6062");
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.datastructures.caches.MRUCache<java.io.Serializable, java.lang.reflect.Type> serializableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.io.Serializable, java.lang.reflect.Type>((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: capacity must greater than 0!");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6063");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str8 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable14 = null;
        java.lang.String str15 = strComparableMRUCache0.get(strComparable14);
        java.lang.String str17 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str19 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str21 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str23 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str25 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test6064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6064");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str8 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable14 = null;
        java.lang.String str15 = strComparableMRUCache0.get(strComparable14);
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str23 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str34 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str36 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.Class<?> wildcardClass40 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test6065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6065");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str8 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str10 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str24 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test6066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6066");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Comparable<java.lang.String> strComparable10 = null;
        strComparableMRUCache0.put(strComparable10, "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str20 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str22 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str30 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str32 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
    }

    @Test
    public void test6067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6067");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Comparable<java.lang.String> strComparable10 = null;
        strComparableMRUCache0.put(strComparable10, "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
    }

    @Test
    public void test6068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6068");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str5 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str7 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str9 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str23 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str25 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str27 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass28 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test6069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6069");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str11 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str16 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str18 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str20 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str28 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
    }

    @Test
    public void test6070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6070");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Comparable<java.lang.String> strComparable10 = null;
        strComparableMRUCache0.put(strComparable10, "");
        java.lang.String str14 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Comparable<java.lang.String> strComparable18 = null;
        strComparableMRUCache0.put(strComparable18, "hi!");
        java.lang.String str22 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str27 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass28 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test6071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6071");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Comparable<java.lang.String> strComparable7 = null;
        java.lang.String str8 = strComparableMRUCache0.get(strComparable7);
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test6072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6072");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str5 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str7 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str9 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str11 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str30 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass31 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test6073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6073");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Comparable<java.lang.String> strComparable10 = null;
        strComparableMRUCache0.put(strComparable10, "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str17 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str19 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable20 = null;
        strComparableMRUCache0.put(strComparable20, "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.Class<?> wildcardClass26 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test6074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6074");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str11 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable14 = null;
        strComparableMRUCache0.put(strComparable14, "hi!");
        java.lang.String str18 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str20 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str34 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str39 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
    }

    @Test
    public void test6075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6075");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.constant.Constable, java.lang.constant.ConstantDesc> constableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.constant.Constable, java.lang.constant.ConstantDesc>(100);
    }

    @Test
    public void test6076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6076");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str8 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str21 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable22 = null;
        strComparableMRUCache0.put(strComparable22, "");
        java.lang.String str26 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass27 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test6077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6077");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str8 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable14 = null;
        java.lang.String str15 = strComparableMRUCache0.get(strComparable14);
        java.lang.String str17 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str22 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.Class<?> wildcardClass26 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test6078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6078");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str11 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str15 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str17 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str19 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str30 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str35 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
    }

    @Test
    public void test6079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6079");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str5 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str7 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str9 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str11 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str15 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str17 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str25 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str27 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test6080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6080");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str8 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test6081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6081");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str8 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str15 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str20 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str22 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str24 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str26 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable27 = null;
        java.lang.String str28 = strComparableMRUCache0.get(strComparable27);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertNull(str28);
    }

    @Test
    public void test6082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6082");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>(1);
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str6 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str8 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable9 = null;
        java.lang.String str10 = strComparableMRUCache1.get(strComparable9);
        java.lang.String str12 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.thealgorithms.datastructures.caches.MRUCache$Entry.setNextEntry(com.thealgorithms.datastructures.caches.MRUCache$Entry)\" because \"this.tail\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test6083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6083");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str8 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable14 = null;
        java.lang.String str15 = strComparableMRUCache0.get(strComparable14);
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str20 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str22 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str27 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.Comparable<java.lang.String> strComparable31 = null;
        strComparableMRUCache0.put(strComparable31, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
    }

    @Test
    public void test6084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6084");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Object, java.lang.constant.Constable> objMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Object, java.lang.constant.Constable>((int) '4');
        java.lang.Class<?> wildcardClass2 = objMRUCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test6085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6085");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        java.lang.String str2 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str7 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str9 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str11 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test6086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6086");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Comparable<java.lang.String> strComparable10 = null;
        strComparableMRUCache0.put(strComparable10, "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str17 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str19 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str27 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str29 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str34 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str36 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str38 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str43 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str45 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass46 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test6087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6087");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str5 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str7 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str9 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str11 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str25 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.Class<?> wildcardClass29 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test6088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6088");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str5 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str7 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str9 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str26 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
    }

    @Test
    public void test6089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6089");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Comparable<java.lang.String> strComparable10 = null;
        strComparableMRUCache0.put(strComparable10, "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str20 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str22 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test6090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6090");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str5 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str7 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str9 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str11 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str25 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
    }

    @Test
    public void test6091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6091");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((int) (byte) 1);
        java.lang.String str3 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str5 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable6 = null;
        strComparableMRUCache1.put(strComparable6, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.thealgorithms.datastructures.caches.MRUCache$Entry.setNextEntry(com.thealgorithms.datastructures.caches.MRUCache$Entry)\" because \"this.tail\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test6092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6092");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        java.lang.String str2 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str7 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str9 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str14 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test6093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6093");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str8 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str15 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str17 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str19 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable20 = null;
        java.lang.String str21 = strComparableMRUCache0.get(strComparable20);
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.Comparable<java.lang.String> strComparable25 = null;
        java.lang.String str26 = strComparableMRUCache0.get(strComparable25);
        java.lang.String str28 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str33 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
    }

    @Test
    public void test6094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6094");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str8 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str15 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str17 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test6095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6095");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str8 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable14 = null;
        java.lang.String str15 = strComparableMRUCache0.get(strComparable14);
        java.lang.String str17 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.Comparable<java.lang.String> strComparable21 = null;
        java.lang.String str22 = strComparableMRUCache0.get(strComparable21);
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str30 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable31 = null;
        strComparableMRUCache0.put(strComparable31, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
    }

    @Test
    public void test6096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6096");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Comparable<java.lang.String> strComparable10 = null;
        strComparableMRUCache0.put(strComparable10, "");
        java.lang.String str14 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str25 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str27 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str32 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str34 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass35 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test6097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6097");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((int) (short) 1);
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str9 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str11 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test6098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6098");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str8 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str15 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str17 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str19 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Comparable<java.lang.String> strComparable23 = null;
        java.lang.String str24 = strComparableMRUCache0.get(strComparable23);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test6099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6099");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        java.lang.String str2 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str10 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str18 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str20 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable21 = null;
        strComparableMRUCache0.put(strComparable21, "");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test6100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6100");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str5 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable6 = null;
        strComparableMRUCache0.put(strComparable6, "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str19 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str27 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str29 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass30 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test6101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6101");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str8 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str16 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test6102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6102");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        java.lang.String str2 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str10 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test6103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6103");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>, java.lang.invoke.TypeDescriptor> wildcardClassOfFieldMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>, java.lang.invoke.TypeDescriptor>(1);
        java.lang.Class<?> wildcardClass2 = wildcardClassOfFieldMRUCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test6104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6104");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.reflect.Type, java.lang.reflect.Type> typeMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.reflect.Type, java.lang.reflect.Type>((int) (byte) 100);
        java.lang.Class<?> wildcardClass2 = typeMRUCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test6105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6105");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.constant.ConstantDesc, java.lang.CharSequence> constantDescMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.constant.ConstantDesc, java.lang.CharSequence>((int) (short) 1);
    }

    @Test
    public void test6106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6106");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str8 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str10 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable11 = null;
        strComparableMRUCache0.put(strComparable11, "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str18 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str20 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass21 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test6107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6107");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str8 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str27 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.Class<?> wildcardClass31 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test6108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6108");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>(1);
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str12 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str14 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test6109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6109");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>(1);
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str9 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str11 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str13 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str18 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass19 = strComparableMRUCache1.getClass();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test6110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6110");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str8 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str15 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str20 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str22 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test6111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6111");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str14 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str31 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str39 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
    }

    @Test
    public void test6112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6112");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Comparable<java.lang.String> strComparable10 = null;
        strComparableMRUCache0.put(strComparable10, "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str17 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str22 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str27 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
    }

    @Test
    public void test6113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6113");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Comparable<java.lang.String> strComparable10 = null;
        strComparableMRUCache0.put(strComparable10, "");
        java.lang.String str14 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str19 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str21 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test6114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6114");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str8 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Class<?> wildcardClass20 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test6115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6115");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        java.lang.String str2 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str10 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str15 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str17 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str19 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass20 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test6116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6116");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str11 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable14 = null;
        strComparableMRUCache0.put(strComparable14, "hi!");
        java.lang.String str18 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str20 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str22 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str24 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Class<?> wildcardClass28 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test6117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6117");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Class<?>, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>> wildcardClassMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Class<?>, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>();
        java.lang.Class<?> wildcardClass1 = wildcardClassMRUCache0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test6118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6118");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.Class<?>> strComparableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.Class<?>>(10);
    }

    @Test
    public void test6119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6119");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str11 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable14 = null;
        strComparableMRUCache0.put(strComparable14, "hi!");
        java.lang.String str18 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str20 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str25 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.Class<?> wildcardClass29 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test6120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6120");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str11 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str24 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str29 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str34 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
    }

    @Test
    public void test6121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6121");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        java.lang.String str2 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.Class<?> wildcardClass21 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test6122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6122");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str8 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str15 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.Class<?> wildcardClass22 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test6123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6123");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Comparable<java.lang.String> strComparable10 = null;
        strComparableMRUCache0.put(strComparable10, "");
        java.lang.String str14 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str25 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str27 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str29 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str31 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str39 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
    }

    @Test
    public void test6124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6124");
        com.thealgorithms.datastructures.caches.MRUCache<com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>, java.lang.constant.ConstantDesc> strComparableMRUCacheMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>, java.lang.constant.ConstantDesc>((int) ' ');
        java.lang.Class<?> wildcardClass2 = strComparableMRUCacheMRUCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test6125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6125");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.constant.Constable, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>> constableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.constant.Constable, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>((int) ' ');
        java.lang.Class<?> wildcardClass2 = constableMRUCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test6126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6126");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str8 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.Comparable<java.lang.String> strComparable12 = null;
        strComparableMRUCache0.put(strComparable12, "hi!");
        java.lang.String str16 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test6127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6127");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((int) '#');
        java.lang.String str3 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Class<?> wildcardClass10 = strComparableMRUCache1.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test6128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6128");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str11 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str21 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str26 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
    }

    @Test
    public void test6129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6129");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.invoke.TypeDescriptor, java.lang.constant.Constable> typeDescriptorMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.invoke.TypeDescriptor, java.lang.constant.Constable>((int) (short) 10);
    }

    @Test
    public void test6130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6130");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str11 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str15 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str17 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str22 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str33 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str35 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str37 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass38 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test6131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6131");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Comparable<java.lang.String> strComparable10 = null;
        strComparableMRUCache0.put(strComparable10, "");
        java.lang.String str14 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Comparable<java.lang.String> strComparable18 = null;
        strComparableMRUCache0.put(strComparable18, "hi!");
        java.lang.String str22 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Class<?> wildcardClass29 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test6132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6132");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.Comparable<java.lang.String> strComparable10 = null;
        strComparableMRUCache0.put(strComparable10, "hi!");
        java.lang.String str14 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str22 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str30 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str32 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
    }

    @Test
    public void test6133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6133");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>(1);
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str6 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str8 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str13 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str18 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable19 = null;
        java.lang.String str20 = strComparableMRUCache1.get(strComparable19);
        java.lang.Class<?> wildcardClass21 = strComparableMRUCache1.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test6134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6134");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        java.lang.String str2 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str19 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str21 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str23 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable24 = null;
        java.lang.String str25 = strComparableMRUCache0.get(strComparable24);
        java.lang.String str27 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str29 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
    }

    @Test
    public void test6135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6135");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str8 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str15 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str20 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass21 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test6136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6136");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str5 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable6 = null;
        strComparableMRUCache0.put(strComparable6, "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str22 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str24 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str26 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test6137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6137");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str5 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable6 = null;
        strComparableMRUCache0.put(strComparable6, "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str22 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str27 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test6138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6138");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.reflect.AnnotatedElement, java.lang.constant.ConstantDesc> annotatedElementMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.reflect.AnnotatedElement, java.lang.constant.ConstantDesc>((int) '4');
        java.lang.Class<?> wildcardClass2 = annotatedElementMRUCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test6139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6139");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str8 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str10 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str27 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test6140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6140");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str8 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable14 = null;
        java.lang.String str15 = strComparableMRUCache0.get(strComparable14);
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str23 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str34 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str36 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str47 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass48 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertNotNull(wildcardClass48);
    }

    @Test
    public void test6141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6141");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.CharSequence, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>> charSequenceMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.CharSequence, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>((int) ' ');
    }

    @Test
    public void test6142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6142");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Comparable<java.lang.String> strComparable10 = null;
        strComparableMRUCache0.put(strComparable10, "");
        java.lang.String str14 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str19 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str33 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
    }

    @Test
    public void test6143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6143");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        java.lang.String str2 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str7 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str15 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str23 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str25 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
    }

    @Test
    public void test6144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6144");
        com.thealgorithms.datastructures.caches.MRUCache<com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>, java.lang.constant.ConstantDesc> strComparableMRUCacheMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>, java.lang.constant.ConstantDesc>((int) (short) 1);
    }

    @Test
    public void test6145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6145");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Comparable<java.lang.String> strComparable10 = null;
        strComparableMRUCache0.put(strComparable10, "");
        java.lang.String str14 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str16 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str27 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test6146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6146");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str11 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str15 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str17 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str19 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str24 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.Comparable<java.lang.String> strComparable31 = null;
        java.lang.String str32 = strComparableMRUCache0.get(strComparable31);
        java.lang.String str34 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str39 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
    }

    @Test
    public void test6147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6147");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str8 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str15 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str17 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str19 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable20 = null;
        java.lang.String str21 = strComparableMRUCache0.get(strComparable20);
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str26 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str28 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable29 = null;
        strComparableMRUCache0.put(strComparable29, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test6148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6148");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        java.lang.String str2 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str7 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str9 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str14 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test6149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6149");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str11 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str15 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str20 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str28 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str30 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
    }

    @Test
    public void test6150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6150");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str8 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable14 = null;
        java.lang.String str15 = strComparableMRUCache0.get(strComparable14);
        java.lang.String str17 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str22 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str33 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str35 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass36 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test6151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6151");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str8 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str10 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str18 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str23 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str28 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str30 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str32 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
    }

    @Test
    public void test6152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6152");
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.datastructures.caches.MRUCache<java.lang.Object, java.lang.Comparable<java.lang.String>> objMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Object, java.lang.Comparable<java.lang.String>>((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: capacity must greater than 0!");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6153");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((int) '4');
        java.lang.String str3 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str5 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str10 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test6154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6154");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str5 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str10 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.Class<?> wildcardClass14 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test6155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6155");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Comparable<java.lang.String> strComparable10 = null;
        strComparableMRUCache0.put(strComparable10, "");
        java.lang.String str14 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str19 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str24 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass25 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test6156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6156");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str11 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.Comparable<java.lang.String> strComparable20 = null;
        strComparableMRUCache0.put(strComparable20, "hi!");
        java.lang.String str24 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str26 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str28 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str33 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
    }

    @Test
    public void test6157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6157");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str5 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str7 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str9 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str11 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str16 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str24 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str26 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str28 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str30 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
    }

    @Test
    public void test6158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6158");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str11 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str15 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str23 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test6159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6159");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str8 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable14 = null;
        java.lang.String str15 = strComparableMRUCache0.get(strComparable14);
        java.lang.String str17 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str22 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str27 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str29 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str34 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
    }

    @Test
    public void test6160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6160");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str11 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str24 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str26 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.Class<?> wildcardClass30 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test6161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6161");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Comparable<java.lang.String> strComparable10 = null;
        strComparableMRUCache0.put(strComparable10, "");
        java.lang.String str14 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.Class<?> wildcardClass27 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test6162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6162");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.Comparable<java.lang.String> strComparable10 = null;
        strComparableMRUCache0.put(strComparable10, "hi!");
        java.lang.String str14 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str22 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str27 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable28 = null;
        strComparableMRUCache0.put(strComparable28, "hi!");
        java.lang.String str32 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
    }

    @Test
    public void test6163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6163");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Comparable<java.lang.String> strComparable10 = null;
        strComparableMRUCache0.put(strComparable10, "");
        java.lang.String str14 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str16 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str24 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable25 = null;
        strComparableMRUCache0.put(strComparable25, "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Class<?> wildcardClass31 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test6164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6164");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str11 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.Comparable<java.lang.String> strComparable35 = null;
        strComparableMRUCache0.put(strComparable35, "");
        java.lang.String str39 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
    }

    @Test
    public void test6165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6165");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Comparable<java.lang.String> strComparable10 = null;
        strComparableMRUCache0.put(strComparable10, "");
        java.lang.String str14 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str25 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str27 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str32 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str37 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass38 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test6166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6166");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.constant.Constable, java.lang.constant.ConstantDesc> constableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.constant.Constable, java.lang.constant.ConstantDesc>((int) (short) 100);
    }

    @Test
    public void test6167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6167");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Comparable<java.lang.String> strComparable10 = null;
        strComparableMRUCache0.put(strComparable10, "");
        java.lang.String str14 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str25 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str27 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str32 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str34 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str36 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str41 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
    }

    @Test
    public void test6168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6168");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str5 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str7 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str9 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str11 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str16 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str21 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test6169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6169");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str8 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable14 = null;
        java.lang.String str15 = strComparableMRUCache0.get(strComparable14);
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str29 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass30 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test6170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6170");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str5 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable6 = null;
        strComparableMRUCache0.put(strComparable6, "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str22 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str24 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str26 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str28 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test6171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6171");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Comparable<java.lang.String> strComparable10 = null;
        strComparableMRUCache0.put(strComparable10, "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str17 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str19 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str27 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str29 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable30 = null;
        java.lang.String str31 = strComparableMRUCache0.get(strComparable30);
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
    }

    @Test
    public void test6172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6172");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str17 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test6173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6173");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str8 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str15 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str17 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test6174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6174");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str8 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable14 = null;
        java.lang.String str15 = strComparableMRUCache0.get(strComparable14);
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str23 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable24 = null;
        strComparableMRUCache0.put(strComparable24, "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.Comparable<java.lang.String> strComparable36 = null;
        java.lang.String str37 = strComparableMRUCache0.get(strComparable36);
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
    }

    @Test
    public void test6175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6175");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        java.lang.String str2 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str10 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str18 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str20 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass21 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test6176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6176");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((int) (short) 10);
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str9 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str11 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test6177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6177");
        com.thealgorithms.datastructures.caches.MRUCache<java.io.Serializable, com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>> serializableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.io.Serializable, com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>>((int) (short) 10);
    }

    @Test
    public void test6178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6178");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((int) '#');
        java.lang.String str3 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str8 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.Comparable<java.lang.String> strComparable12 = null;
        java.lang.String str13 = strComparableMRUCache1.get(strComparable12);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test6179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6179");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.Comparable<java.lang.String> strComparable13 = null;
        strComparableMRUCache0.put(strComparable13, "");
        java.lang.String str17 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test6180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6180");
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.datastructures.caches.MRUCache<com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>, java.io.Serializable> strComparableMRUCacheMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>, java.io.Serializable>((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: capacity must greater than 0!");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6181");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str11 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test6182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6182");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str11 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str15 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str17 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str22 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str24 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.Class<?> wildcardClass28 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test6183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6183");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((int) (short) 10);
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str9 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable10 = null;
        strComparableMRUCache1.put(strComparable10, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test6184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6184");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        java.lang.String str2 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str25 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
    }

    @Test
    public void test6185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6185");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str11 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str16 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str18 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str20 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str22 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.Class<?> wildcardClass26 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test6186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6186");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Comparable<java.lang.String> strComparable10 = null;
        strComparableMRUCache0.put(strComparable10, "");
        java.lang.String str14 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.Comparable<java.lang.String> strComparable27 = null;
        strComparableMRUCache0.put(strComparable27, "");
        java.lang.String str31 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str39 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.Comparable<java.lang.String> strComparable43 = null;
        java.lang.String str44 = strComparableMRUCache0.get(strComparable43);
        java.lang.Class<?> wildcardClass45 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test6187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6187");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Comparable<java.lang.String> strComparable10 = null;
        strComparableMRUCache0.put(strComparable10, "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str17 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str19 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str27 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str29 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str31 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.Comparable<java.lang.String> strComparable35 = null;
        java.lang.String str36 = strComparableMRUCache0.get(strComparable35);
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
    }

    @Test
    public void test6188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6188");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str11 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str27 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str29 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str31 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str36 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
    }

    @Test
    public void test6189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6189");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str8 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable14 = null;
        java.lang.String str15 = strComparableMRUCache0.get(strComparable14);
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str23 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable24 = null;
        strComparableMRUCache0.put(strComparable24, "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.Comparable<java.lang.String> strComparable33 = null;
        java.lang.String str34 = strComparableMRUCache0.get(strComparable33);
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str42 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str44 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
    }

    @Test
    public void test6190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6190");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        java.lang.String str2 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str7 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str9 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str11 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test6191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6191");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str11 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test6192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6192");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str5 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str7 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str9 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str11 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str15 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str17 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str22 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str24 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test6193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6193");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Comparable<java.lang.String> strComparable10 = null;
        strComparableMRUCache0.put(strComparable10, "");
        java.lang.String str14 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str19 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str30 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str32 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
    }

    @Test
    public void test6194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6194");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.Comparable<java.lang.String> strComparable10 = null;
        strComparableMRUCache0.put(strComparable10, "hi!");
        java.lang.String str14 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str22 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str27 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
    }

    @Test
    public void test6195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6195");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str23 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass24 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test6196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6196");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str11 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str21 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str26 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str28 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str30 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
    }

    @Test
    public void test6197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6197");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((int) 'a');
        java.lang.String str3 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str5 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass6 = strComparableMRUCache1.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test6198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6198");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((int) 'a');
        java.lang.String str3 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str5 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass6 = strComparableMRUCache1.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test6199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6199");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str11 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str16 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test6200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6200");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str8 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str22 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str24 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
    }

    @Test
    public void test6201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6201");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.Comparable<java.lang.String> strComparable10 = null;
        strComparableMRUCache0.put(strComparable10, "hi!");
        java.lang.String str14 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.Comparable<java.lang.String> strComparable18 = null;
        java.lang.String str19 = strComparableMRUCache0.get(strComparable18);
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str24 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str29 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str34 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass35 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test6202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6202");
        com.thealgorithms.datastructures.caches.MRUCache<java.io.Serializable, com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>> serializableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.io.Serializable, com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>>((int) '#');
    }

    @Test
    public void test6203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6203");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str5 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str7 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str9 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str17 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str31 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
    }

    @Test
    public void test6204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6204");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>(10);
        java.lang.Comparable<java.lang.String> strComparable2 = null;
        java.lang.String str3 = strComparableMRUCache1.get(strComparable2);
        java.lang.String str5 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str10 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str12 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test6205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6205");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str8 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str15 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str26 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass27 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test6206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6206");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((int) '#');
        java.lang.String str3 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str8 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str10 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str12 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str14 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str16 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str18 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test6207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6207");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str11 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable14 = null;
        strComparableMRUCache0.put(strComparable14, "hi!");
        java.lang.String str18 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str20 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.Class<?> wildcardClass30 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test6208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6208");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str11 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test6209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6209");
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.datastructures.caches.MRUCache<java.lang.CharSequence, java.lang.String> charSequenceMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.CharSequence, java.lang.String>((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: capacity must greater than 0!");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6210");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.Comparable<java.lang.String> strComparable10 = null;
        strComparableMRUCache0.put(strComparable10, "hi!");
        java.lang.String str14 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str19 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str21 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str23 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
    }

    @Test
    public void test6211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6211");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Comparable<java.lang.String> strComparable10 = null;
        strComparableMRUCache0.put(strComparable10, "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str17 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str19 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.Comparable<java.lang.String> strComparable26 = null;
        java.lang.String str27 = strComparableMRUCache0.get(strComparable26);
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str32 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
    }

    @Test
    public void test6212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6212");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str20 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str22 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test6213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6213");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str8 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable14 = null;
        java.lang.String str15 = strComparableMRUCache0.get(strComparable14);
        java.lang.String str17 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str25 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str27 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str38 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable39 = null;
        strComparableMRUCache0.put(strComparable39, "");
        java.lang.Class<?> wildcardClass42 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test6214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6214");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((int) '#');
    }

    @Test
    public void test6215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6215");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str11 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str30 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str32 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass33 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test6216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6216");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str11 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable14 = null;
        strComparableMRUCache0.put(strComparable14, "hi!");
        java.lang.String str18 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str20 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str25 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str27 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str29 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
    }

    @Test
    public void test6217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6217");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        java.lang.String str2 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str7 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str15 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.Comparable<java.lang.String> strComparable22 = null;
        strComparableMRUCache0.put(strComparable22, "");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test6218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6218");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str8 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.Comparable<java.lang.String> strComparable15 = null;
        strComparableMRUCache0.put(strComparable15, "hi!");
        java.lang.String str19 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test6219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6219");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
    }

    @Test
    public void test6220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6220");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        java.lang.String str2 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str7 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str9 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str11 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test6221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6221");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.Comparable<java.lang.String> strComparable16 = null;
        java.lang.String str17 = strComparableMRUCache0.get(strComparable16);
        java.lang.Class<?> wildcardClass18 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test6222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6222");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str14 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str22 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test6223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6223");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str8 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str10 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str15 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str17 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str22 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str24 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test6224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6224");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.reflect.Type, java.lang.String> typeMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.reflect.Type, java.lang.String>((int) (byte) 10);
    }

    @Test
    public void test6225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6225");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Comparable<java.lang.String> strComparable10 = null;
        strComparableMRUCache0.put(strComparable10, "");
        java.lang.String str14 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str28 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str39 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass40 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test6226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6226");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Object, java.lang.CharSequence> objMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Object, java.lang.CharSequence>((int) '4');
    }

    @Test
    public void test6227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6227");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str8 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str10 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str12 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str17 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test6228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6228");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str8 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test6229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6229");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((int) (short) 100);
        java.lang.String str3 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str5 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str7 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test6230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6230");
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.datastructures.caches.MRUCache<java.lang.String, java.lang.reflect.AnnotatedElement> strMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.String, java.lang.reflect.AnnotatedElement>((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: capacity must greater than 0!");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6231");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>, java.lang.CharSequence> wildcardClassOfFieldMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>, java.lang.CharSequence>((int) (short) 1);
    }

    @Test
    public void test6232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6232");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.invoke.TypeDescriptor, java.lang.Object> typeDescriptorMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.invoke.TypeDescriptor, java.lang.Object>();
        java.lang.Class<?> wildcardClass1 = typeDescriptorMRUCache0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test6233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6233");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str11 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str15 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str17 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str19 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str21 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str23 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test6234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6234");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str11 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.Comparable<java.lang.String> strComparable17 = null;
        strComparableMRUCache0.put(strComparable17, "hi!");
        java.lang.String str21 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str23 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
    }

    @Test
    public void test6235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6235");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str11 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str15 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str17 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str19 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str24 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str29 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str34 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
    }

    @Test
    public void test6236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6236");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Comparable<java.lang.String> strComparable10 = null;
        strComparableMRUCache0.put(strComparable10, "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str17 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str19 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str30 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str32 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str34 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass35 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test6237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6237");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>, java.lang.constant.ConstantDesc> wildcardClassOfFieldMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>, java.lang.constant.ConstantDesc>((int) 'a');
    }

    @Test
    public void test6238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6238");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        java.lang.String str2 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str7 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str24 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Class<?> wildcardClass28 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test6239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6239");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str14 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str16 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test6240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6240");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Comparable<java.lang.String> strComparable10 = null;
        strComparableMRUCache0.put(strComparable10, "");
        java.lang.String str14 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Comparable<java.lang.String> strComparable18 = null;
        strComparableMRUCache0.put(strComparable18, "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str25 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str33 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass34 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test6241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6241");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>(1);
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str6 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str8 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str10 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str12 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str14 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test6242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6242");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str8 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable14 = null;
        java.lang.String str15 = strComparableMRUCache0.get(strComparable14);
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str20 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str25 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test6243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6243");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str14 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str31 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str36 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
    }

    @Test
    public void test6244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6244");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        java.lang.String str2 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str7 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str9 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str11 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str18 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str23 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str25 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
    }

    @Test
    public void test6245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6245");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str5 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str7 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str9 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str11 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str18 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable19 = null;
        java.lang.String str20 = strComparableMRUCache0.get(strComparable19);
        java.lang.String str22 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Class<?> wildcardClass26 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test6246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6246");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str5 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str7 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str12 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str20 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str22 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test6247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6247");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        java.lang.String str2 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str10 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str12 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test6248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6248");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>(1);
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str9 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str11 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test6249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6249");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Comparable<java.lang.String> strComparable10 = null;
        strComparableMRUCache0.put(strComparable10, "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str20 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str22 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str24 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str26 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test6250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6250");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str5 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test6251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6251");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.constant.ConstantDesc> strComparableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.constant.ConstantDesc>((int) (short) 1);
        java.lang.Class<?> wildcardClass2 = strComparableMRUCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test6252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6252");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Comparable<java.lang.String> strComparable10 = null;
        strComparableMRUCache0.put(strComparable10, "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str17 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str19 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test6253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6253");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str5 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str7 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str9 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str11 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str15 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str17 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str22 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str24 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str26 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str26);
    }

    @Test
    public void test6254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6254");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Comparable<java.lang.String> strComparable10 = null;
        strComparableMRUCache0.put(strComparable10, "");
        java.lang.String str14 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str31 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass32 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test6255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6255");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Class<?>, java.lang.reflect.GenericDeclaration> wildcardClassMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Class<?>, java.lang.reflect.GenericDeclaration>((int) '4');
        java.lang.Class<?> wildcardClass2 = wildcardClassMRUCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test6256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6256");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Comparable<java.lang.String> strComparable10 = null;
        strComparableMRUCache0.put(strComparable10, "");
        java.lang.String str14 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str16 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str24 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str26 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str31 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
    }

    @Test
    public void test6257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6257");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str11 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str16 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str18 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str23 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str25 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass26 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test6258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6258");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str5 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable6 = null;
        strComparableMRUCache0.put(strComparable6, "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Comparable<java.lang.String> strComparable12 = null;
        strComparableMRUCache0.put(strComparable12, "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str19 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str21 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable22 = null;
        java.lang.String str23 = strComparableMRUCache0.get(strComparable22);
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test6259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6259");
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.datastructures.caches.MRUCache<java.lang.constant.Constable, java.lang.reflect.AnnotatedElement> constableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.constant.Constable, java.lang.reflect.AnnotatedElement>((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: capacity must greater than 0!");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6260");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str11 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str22 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str24 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
    }

    @Test
    public void test6261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6261");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Comparable<java.lang.String> strComparable10 = null;
        strComparableMRUCache0.put(strComparable10, "");
        java.lang.String str14 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str25 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str27 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str32 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str40 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
    }

    @Test
    public void test6262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6262");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Comparable<java.lang.String> strComparable10 = null;
        strComparableMRUCache0.put(strComparable10, "");
        java.lang.String str14 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str22 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str27 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str29 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str31 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.Class<?> wildcardClass35 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test6263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6263");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str5 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.Class<?> wildcardClass15 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test6264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6264");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.reflect.Type, java.lang.String> typeMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.reflect.Type, java.lang.String>((int) (byte) 100);
    }

    @Test
    public void test6265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6265");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str8 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test6266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6266");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str11 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str24 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str26 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str28 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable29 = null;
        strComparableMRUCache0.put(strComparable29, "hi!");
        java.lang.String str33 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass34 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test6267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6267");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str8 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable14 = null;
        java.lang.String str15 = strComparableMRUCache0.get(strComparable14);
        java.lang.String str17 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str19 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str21 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str23 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str25 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str27 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str29 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str31 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
    }

    @Test
    public void test6268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6268");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Comparable<java.lang.String> strComparable10 = null;
        strComparableMRUCache0.put(strComparable10, "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str17 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test6269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6269");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        java.lang.String str2 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str7 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str9 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str11 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str15 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable16 = null;
        strComparableMRUCache0.put(strComparable16, "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test6270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6270");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((int) (short) 1);
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str6 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str11 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test6271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6271");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str11 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str21 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test6272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6272");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str8 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str10 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str24 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test6273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6273");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str5 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable6 = null;
        strComparableMRUCache0.put(strComparable6, "hi!");
        java.lang.String str10 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str15 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str17 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str19 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str27 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable28 = null;
        java.lang.String str29 = strComparableMRUCache0.get(strComparable28);
        java.lang.String str31 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
    }

    @Test
    public void test6274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6274");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.reflect.Type, java.lang.Class<?>> typeMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.reflect.Type, java.lang.Class<?>>((int) (short) 1);
    }

    @Test
    public void test6275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6275");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str11 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable14 = null;
        java.lang.String str15 = strComparableMRUCache0.get(strComparable14);
        java.lang.String str17 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str28 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str33 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
    }

    @Test
    public void test6276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6276");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Comparable<java.lang.String> strComparable10 = null;
        strComparableMRUCache0.put(strComparable10, "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str20 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str22 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str27 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str29 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.Class<?> wildcardClass33 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test6277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6277");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str11 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str15 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str17 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str19 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test6278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6278");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str8 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str10 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str15 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass16 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test6279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6279");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str8 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str15 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str17 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str19 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test6280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6280");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Comparable<java.lang.String> strComparable10 = null;
        strComparableMRUCache0.put(strComparable10, "");
        java.lang.String str14 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str16 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str18 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str29 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.Class<?> wildcardClass33 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test6281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6281");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str8 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str10 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str12 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str14 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.Class<?> wildcardClass21 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test6282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6282");
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.datastructures.caches.MRUCache<java.lang.constant.ConstantDesc, java.lang.Class<?>> constantDescMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.constant.ConstantDesc, java.lang.Class<?>>((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: capacity must greater than 0!");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6283");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.reflect.Type, java.lang.Comparable<java.lang.String>> typeMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.reflect.Type, java.lang.Comparable<java.lang.String>>((int) (short) 10);
    }

    @Test
    public void test6284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6284");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str11 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str24 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str29 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str31 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str36 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
    }

    @Test
    public void test6285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6285");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str14 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str19 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str21 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable22 = null;
        strComparableMRUCache0.put(strComparable22, "");
        java.lang.String str26 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.Class<?> wildcardClass30 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test6286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6286");
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.datastructures.caches.MRUCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>(0);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: capacity must greater than 0!");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6287");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str8 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str15 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str20 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test6288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6288");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
    }

    @Test
    public void test6289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6289");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Object, java.lang.String> objMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Object, java.lang.String>(10);
    }

    @Test
    public void test6290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6290");
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.datastructures.caches.MRUCache<java.lang.CharSequence, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>> charSequenceMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.CharSequence, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>(0);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: capacity must greater than 0!");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6291");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        java.lang.String str2 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str4 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass5 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test6292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6292");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Comparable<java.lang.String> strComparable10 = null;
        strComparableMRUCache0.put(strComparable10, "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str17 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable18 = null;
        strComparableMRUCache0.put(strComparable18, "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str25 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass26 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test6293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6293");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str8 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.Comparable<java.lang.String> strComparable12 = null;
        java.lang.String str13 = strComparableMRUCache0.get(strComparable12);
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str27 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
    }

    @Test
    public void test6294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6294");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str11 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.Comparable<java.lang.String> strComparable23 = null;
        strComparableMRUCache0.put(strComparable23, "");
        java.lang.Comparable<java.lang.String> strComparable26 = null;
        strComparableMRUCache0.put(strComparable26, "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test6295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6295");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str5 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str7 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str9 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str14 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Comparable<java.lang.String> strComparable18 = null;
        strComparableMRUCache0.put(strComparable18, "hi!");
        java.lang.Comparable<java.lang.String> strComparable21 = null;
        strComparableMRUCache0.put(strComparable21, "");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test6296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6296");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.invoke.TypeDescriptor, java.lang.reflect.Type> typeDescriptorMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.invoke.TypeDescriptor, java.lang.reflect.Type>((int) ' ');
    }

    @Test
    public void test6297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6297");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str8 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str15 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str17 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str19 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test6298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6298");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str8 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str18 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str20 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str22 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str24 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test6299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6299");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str8 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str10 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str18 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str20 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str22 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str27 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass28 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test6300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6300");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.Comparable<java.lang.String> strComparable10 = null;
        strComparableMRUCache0.put(strComparable10, "hi!");
        java.lang.String str14 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str19 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str21 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str26 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass27 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test6301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6301");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Comparable<java.lang.String> strComparable10 = null;
        strComparableMRUCache0.put(strComparable10, "");
        java.lang.String str14 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.Comparable<java.lang.String> strComparable24 = null;
        strComparableMRUCache0.put(strComparable24, "hi!");
        java.lang.String str28 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str30 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
    }

    @Test
    public void test6302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6302");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str8 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable14 = null;
        java.lang.String str15 = strComparableMRUCache0.get(strComparable14);
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str20 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str22 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str30 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
    }

    @Test
    public void test6303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6303");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str11 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable14 = null;
        strComparableMRUCache0.put(strComparable14, "hi!");
        java.lang.String str18 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str20 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str37 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str42 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.Class<?> wildcardClass46 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test6304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6304");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((int) '4');
        java.lang.String str3 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str5 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str10 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str12 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str14 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str16 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test6305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6305");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        java.lang.String str2 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str7 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str9 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.Class<?> wildcardClass13 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test6306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6306");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.Comparable<java.lang.String> strComparable10 = null;
        strComparableMRUCache0.put(strComparable10, "hi!");
        java.lang.String str14 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test6307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6307");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str11 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable14 = null;
        java.lang.String str15 = strComparableMRUCache0.get(strComparable14);
        java.lang.String str17 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str34 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
    }

    @Test
    public void test6308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6308");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str8 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str15 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str17 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str19 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str21 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test6309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6309");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Comparable<java.lang.String> strComparable10 = null;
        strComparableMRUCache0.put(strComparable10, "");
        java.lang.String str14 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str25 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.Class<?> wildcardClass38 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test6310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6310");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.reflect.GenericDeclaration, java.lang.reflect.GenericDeclaration> genericDeclarationMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.reflect.GenericDeclaration, java.lang.reflect.GenericDeclaration>((int) '4');
        java.lang.Class<?> wildcardClass2 = genericDeclarationMRUCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test6311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6311");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str8 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str10 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str24 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str44 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!" + "'", str44, "hi!");
    }

    @Test
    public void test6312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6312");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str11 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable14 = null;
        java.lang.String str15 = strComparableMRUCache0.get(strComparable14);
        java.lang.String str17 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str28 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str30 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str32 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str34 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str39 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
    }

    @Test
    public void test6313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6313");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str8 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str15 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str17 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str19 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Class<?> wildcardClass29 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test6314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6314");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str8 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str15 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str17 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test6315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6315");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        java.lang.String str2 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str10 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str12 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.Class<?> wildcardClass28 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test6316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6316");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str8 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable9 = null;
        java.lang.String str10 = strComparableMRUCache0.get(strComparable9);
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Comparable<java.lang.String> strComparable20 = null;
        java.lang.String str21 = strComparableMRUCache0.get(strComparable20);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test6317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6317");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.constant.ConstantDesc> strComparableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.constant.ConstantDesc>((int) ' ');
        java.lang.Class<?> wildcardClass2 = strComparableMRUCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test6318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6318");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Comparable<java.lang.String> strComparable10 = null;
        strComparableMRUCache0.put(strComparable10, "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str17 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str22 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str24 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
    }

    @Test
    public void test6319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6319");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((int) '4');
        java.lang.String str3 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str5 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str10 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str12 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test6320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6320");
        com.thealgorithms.datastructures.caches.MRUCache<java.io.Serializable, java.lang.constant.Constable> serializableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.io.Serializable, java.lang.constant.Constable>((int) (short) 100);
    }

    @Test
    public void test6321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6321");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str8 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str10 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str15 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test6322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6322");
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.datastructures.caches.MRUCache<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>, java.lang.reflect.Type> wildcardClassOfFieldMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>, java.lang.reflect.Type>(0);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: capacity must greater than 0!");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6323");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.reflect.GenericDeclaration, java.io.Serializable> genericDeclarationMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.reflect.GenericDeclaration, java.io.Serializable>((int) (byte) 100);
        java.lang.Class<?> wildcardClass2 = genericDeclarationMRUCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test6324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6324");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str14 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str19 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str21 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str23 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str28 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
    }

    @Test
    public void test6325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6325");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str8 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str10 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Comparable<java.lang.String> strComparable14 = null;
        java.lang.String str15 = strComparableMRUCache0.get(strComparable14);
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str20 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str22 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str24 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str26 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str31 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str33 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass34 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test6326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6326");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.String, java.lang.reflect.AnnotatedElement> strMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.String, java.lang.reflect.AnnotatedElement>((int) (byte) 1);
    }

    @Test
    public void test6327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6327");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str14 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str19 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str21 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str23 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass24 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test6328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6328");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str11 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str22 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str24 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Class<?> wildcardClass34 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test6329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6329");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.Comparable<java.lang.String> strComparable10 = null;
        strComparableMRUCache0.put(strComparable10, "hi!");
        java.lang.String str14 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str19 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str27 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
    }

    @Test
    public void test6330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6330");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Comparable<java.lang.String> strComparable10 = null;
        strComparableMRUCache0.put(strComparable10, "");
        java.lang.String str14 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Comparable<java.lang.String> strComparable18 = null;
        strComparableMRUCache0.put(strComparable18, "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str28 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
    }

    @Test
    public void test6331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6331");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str11 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.Class<?> wildcardClass17 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test6332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6332");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.reflect.GenericDeclaration, java.lang.CharSequence> genericDeclarationMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.reflect.GenericDeclaration, java.lang.CharSequence>((int) '4');
    }

    @Test
    public void test6333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6333");
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.datastructures.caches.MRUCache<java.lang.Class<?>, java.lang.Class<?>> wildcardClassMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Class<?>, java.lang.Class<?>>((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: capacity must greater than 0!");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6334");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str11 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable14 = null;
        strComparableMRUCache0.put(strComparable14, "hi!");
        java.lang.String str18 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str23 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str25 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str27 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.Class<?> wildcardClass31 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test6335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6335");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str11 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test6336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6336");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        java.lang.String str2 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str19 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test6337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6337");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((int) '4');
        java.lang.String str3 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str5 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Comparable<java.lang.String> strComparable12 = null;
        java.lang.String str13 = strComparableMRUCache1.get(strComparable12);
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test6338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6338");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Comparable<java.lang.String> strComparable10 = null;
        strComparableMRUCache0.put(strComparable10, "");
        java.lang.String str14 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str28 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str39 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str41 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
    }

    @Test
    public void test6339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6339");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>, java.lang.reflect.AnnotatedElement> wildcardClassOfFieldMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>, java.lang.reflect.AnnotatedElement>();
        java.lang.Class<?> wildcardClass1 = wildcardClassOfFieldMRUCache0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test6340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6340");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Comparable<java.lang.String> strComparable10 = null;
        strComparableMRUCache0.put(strComparable10, "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str20 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str22 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str27 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str35 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str37 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str39 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str41 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
    }

    @Test
    public void test6341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6341");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str8 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str15 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str20 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str22 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str30 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str32 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str34 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
    }

    @Test
    public void test6342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6342");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Comparable<java.lang.String> strComparable10 = null;
        strComparableMRUCache0.put(strComparable10, "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str17 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str19 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.Comparable<java.lang.String> strComparable26 = null;
        strComparableMRUCache0.put(strComparable26, "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test6343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6343");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str14 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str19 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str21 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str26 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str34 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
    }

    @Test
    public void test6344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6344");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.CharSequence, java.io.Serializable> charSequenceMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.CharSequence, java.io.Serializable>((int) (byte) 10);
    }

    @Test
    public void test6345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6345");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>> strComparableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>>((int) ' ');
    }

    @Test
    public void test6346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6346");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str8 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str15 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str23 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.Class<?> wildcardClass30 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test6347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6347");
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.datastructures.caches.MRUCache<java.lang.reflect.GenericDeclaration, com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>> genericDeclarationMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.reflect.GenericDeclaration, com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>>((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: capacity must greater than 0!");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6348");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str11 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str15 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str20 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str25 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test6349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6349");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str5 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str10 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str15 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str17 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test6350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6350");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Comparable<java.lang.String> strComparable10 = null;
        strComparableMRUCache0.put(strComparable10, "");
        java.lang.String str14 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str16 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str18 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str20 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str22 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str24 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str26 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
    }

    @Test
    public void test6351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6351");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.constant.Constable, java.io.Serializable> constableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.constant.Constable, java.io.Serializable>(1);
    }

    @Test
    public void test6352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6352");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>(10);
        java.lang.Comparable<java.lang.String> strComparable2 = null;
        java.lang.String str3 = strComparableMRUCache1.get(strComparable2);
        java.lang.String str5 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test6353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6353");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Comparable<java.lang.String> strComparable10 = null;
        strComparableMRUCache0.put(strComparable10, "");
        java.lang.String str14 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Comparable<java.lang.String> strComparable18 = null;
        strComparableMRUCache0.put(strComparable18, "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str28 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test6354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6354");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str8 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str21 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str26 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str31 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str39 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
    }

    @Test
    public void test6355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6355");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str8 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str27 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str29 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
    }

    @Test
    public void test6356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6356");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        java.lang.String str2 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str7 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str9 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str11 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test6357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6357");
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.datastructures.caches.MRUCache<java.lang.CharSequence, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>> charSequenceMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.CharSequence, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: capacity must greater than 0!");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6358");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str5 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable6 = null;
        strComparableMRUCache0.put(strComparable6, "hi!");
        java.lang.String str10 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str15 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str17 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test6359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6359");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Comparable<java.lang.String> strComparable10 = null;
        strComparableMRUCache0.put(strComparable10, "");
        java.lang.String str14 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str16 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str18 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str20 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test6360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6360");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str11 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str15 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str17 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str28 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
    }

    @Test
    public void test6361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6361");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.Comparable<java.lang.String> strComparable10 = null;
        strComparableMRUCache0.put(strComparable10, "hi!");
        java.lang.String str14 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str22 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str27 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable28 = null;
        strComparableMRUCache0.put(strComparable28, "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
    }

    @Test
    public void test6362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6362");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        java.lang.String str2 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str7 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str15 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.Class<?> wildcardClass28 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test6363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6363");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.reflect.GenericDeclaration, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>> genericDeclarationMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.reflect.GenericDeclaration, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>((int) (byte) 100);
    }

    @Test
    public void test6364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6364");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str8 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable14 = null;
        java.lang.String str15 = strComparableMRUCache0.get(strComparable14);
        java.lang.String str17 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str25 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str27 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable28 = null;
        java.lang.String str29 = strComparableMRUCache0.get(strComparable28);
        java.lang.String str31 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str33 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str35 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
    }

    @Test
    public void test6365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6365");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str5 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str7 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str9 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str11 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str15 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str17 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str19 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str21 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test6366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6366");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str8 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable14 = null;
        java.lang.String str15 = strComparableMRUCache0.get(strComparable14);
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str23 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str25 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str33 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
    }

    @Test
    public void test6367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6367");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str5 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str7 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str12 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str14 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test6368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6368");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str14 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.Class<?> wildcardClass18 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test6369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6369");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str11 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable14 = null;
        java.lang.String str15 = strComparableMRUCache0.get(strComparable14);
        java.lang.String str17 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str28 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str30 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
    }

    @Test
    public void test6370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6370");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str8 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable9 = null;
        java.lang.String str10 = strComparableMRUCache0.get(strComparable9);
        java.lang.String str12 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str14 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test6371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6371");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str11 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str24 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str26 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str37 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
    }

    @Test
    public void test6372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6372");
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.datastructures.caches.MRUCache<java.lang.Class<?>, java.lang.Class<?>> wildcardClassMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Class<?>, java.lang.Class<?>>((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: capacity must greater than 0!");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6373");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str11 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.Comparable<java.lang.String> strComparable17 = null;
        strComparableMRUCache0.put(strComparable17, "hi!");
        java.lang.String str21 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.Class<?> wildcardClass31 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test6374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6374");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Comparable<java.lang.String> strComparable10 = null;
        strComparableMRUCache0.put(strComparable10, "");
        java.lang.String str14 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str19 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test6375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6375");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str11 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str16 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable17 = null;
        java.lang.String str18 = strComparableMRUCache0.get(strComparable17);
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str26 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
    }

    @Test
    public void test6376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6376");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str11 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str24 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str32 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str34 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
    }

    @Test
    public void test6377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6377");
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.datastructures.caches.MRUCache<java.lang.reflect.GenericDeclaration, java.lang.Object> genericDeclarationMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.reflect.GenericDeclaration, java.lang.Object>((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: capacity must greater than 0!");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6378");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str14 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str19 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str21 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test6379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6379");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.invoke.TypeDescriptor, java.lang.invoke.TypeDescriptor> typeDescriptorMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.invoke.TypeDescriptor, java.lang.invoke.TypeDescriptor>((int) '#');
    }

    @Test
    public void test6380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6380");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str5 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable6 = null;
        strComparableMRUCache0.put(strComparable6, "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test6381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6381");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str11 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str15 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str17 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str19 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str24 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
    }

    @Test
    public void test6382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6382");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str8 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str10 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str12 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str14 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str16 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str18 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str20 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test6383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6383");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str8 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str10 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str15 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str17 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str19 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str24 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str26 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test6384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6384");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str11 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str15 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str17 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str22 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass23 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test6385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6385");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Comparable<java.lang.String> strComparable10 = null;
        strComparableMRUCache0.put(strComparable10, "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str17 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str19 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str27 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str29 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str31 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
    }

    @Test
    public void test6386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6386");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str8 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str15 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str20 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test6387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6387");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.reflect.Type, java.lang.constant.ConstantDesc> typeMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.reflect.Type, java.lang.constant.ConstantDesc>((int) (byte) 1);
    }

    @Test
    public void test6388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6388");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str11 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str16 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str21 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test6389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6389");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        java.lang.String str2 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str7 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str9 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str14 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str16 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass17 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test6390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6390");
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.datastructures.caches.MRUCache<java.lang.String, java.lang.reflect.Type> strMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.String, java.lang.reflect.Type>((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: capacity must greater than 0!");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6391");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str8 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable14 = null;
        java.lang.String str15 = strComparableMRUCache0.get(strComparable14);
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str20 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str28 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
    }

    @Test
    public void test6392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6392");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str8 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable14 = null;
        java.lang.String str15 = strComparableMRUCache0.get(strComparable14);
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str23 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str25 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test6393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6393");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str11 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str15 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str17 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str19 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable20 = null;
        strComparableMRUCache0.put(strComparable20, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test6394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6394");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str11 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.Class<?> wildcardClass17 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test6395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6395");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str11 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable14 = null;
        java.lang.String str15 = strComparableMRUCache0.get(strComparable14);
        java.lang.String str17 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str28 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass29 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test6396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6396");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str5 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable6 = null;
        strComparableMRUCache0.put(strComparable6, "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Comparable<java.lang.String> strComparable18 = null;
        java.lang.String str19 = strComparableMRUCache0.get(strComparable18);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test6397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6397");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>(10);
        java.lang.String str3 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str11 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test6398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6398");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        java.lang.String str2 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str7 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str9 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str17 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str22 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test6399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6399");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        java.lang.String str2 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str7 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str18 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test6400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6400");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.String, java.lang.Object> strMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.String, java.lang.Object>((int) (byte) 10);
    }

    @Test
    public void test6401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6401");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str20 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test6402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6402");
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.datastructures.caches.MRUCache<java.lang.CharSequence, com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>> charSequenceMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.CharSequence, com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>>((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: capacity must greater than 0!");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6403");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Comparable<java.lang.String> strComparable10 = null;
        strComparableMRUCache0.put(strComparable10, "");
        java.lang.String str14 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str28 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str33 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
    }

    @Test
    public void test6404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6404");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str11 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str15 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str17 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str22 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable23 = null;
        java.lang.String str24 = strComparableMRUCache0.get(strComparable23);
        java.lang.String str26 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass27 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test6405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6405");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Comparable<java.lang.String> strComparable10 = null;
        strComparableMRUCache0.put(strComparable10, "");
        java.lang.String str14 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str28 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str42 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable43 = null;
        java.lang.String str44 = strComparableMRUCache0.get(strComparable43);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
    }

    @Test
    public void test6406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6406");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str8 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable14 = null;
        java.lang.String str15 = strComparableMRUCache0.get(strComparable14);
        java.lang.String str17 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str25 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str33 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
    }

    @Test
    public void test6407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6407");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str8 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable14 = null;
        java.lang.String str15 = strComparableMRUCache0.get(strComparable14);
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str20 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass21 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test6408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6408");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str11 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str16 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str18 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str23 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str28 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str30 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
    }

    @Test
    public void test6409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6409");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str8 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str21 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test6410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6410");
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.datastructures.caches.MRUCache<java.lang.Object, java.lang.constant.ConstantDesc> objMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Object, java.lang.constant.ConstantDesc>(0);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: capacity must greater than 0!");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6411");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str14 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str22 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str27 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str29 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
    }

    @Test
    public void test6412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6412");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str8 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str15 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str26 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str28 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str30 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str32 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass33 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test6413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6413");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((int) '4');
        java.lang.String str3 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str5 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str13 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test6414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6414");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str11 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable14 = null;
        strComparableMRUCache0.put(strComparable14, "hi!");
        java.lang.String str18 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str20 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str34 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str39 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str41 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
    }

    @Test
    public void test6415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6415");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Comparable<java.lang.String> strComparable10 = null;
        strComparableMRUCache0.put(strComparable10, "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str17 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str19 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str30 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str35 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable36 = null;
        java.lang.String str37 = strComparableMRUCache0.get(strComparable36);
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str42 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
    }

    @Test
    public void test6416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6416");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Comparable<java.lang.String> strComparable10 = null;
        strComparableMRUCache0.put(strComparable10, "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str17 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str19 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str33 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str35 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
    }

    @Test
    public void test6417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6417");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str11 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str33 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str38 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
    }

    @Test
    public void test6418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6418");
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.datastructures.caches.MRUCache<java.lang.String, java.lang.Object> strMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.String, java.lang.Object>(0);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: capacity must greater than 0!");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6419");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str11 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str15 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str17 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str19 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass20 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test6420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6420");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.reflect.GenericDeclaration, java.lang.Class<?>> genericDeclarationMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.reflect.GenericDeclaration, java.lang.Class<?>>((int) (byte) 1);
        java.lang.Class<?> wildcardClass2 = genericDeclarationMRUCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test6421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6421");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>(100);
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Class<?> wildcardClass5 = strComparableMRUCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test6422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6422");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>(1);
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str6 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str11 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str13 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str15 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test6423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6423");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str8 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable14 = null;
        java.lang.String str15 = strComparableMRUCache0.get(strComparable14);
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str23 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str25 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str36 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
    }

    @Test
    public void test6424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6424");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str5 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str7 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str9 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str11 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test6425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6425");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.constant.Constable, java.lang.Comparable<java.lang.String>> constableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.constant.Constable, java.lang.Comparable<java.lang.String>>((int) (short) 100);
    }

    @Test
    public void test6426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6426");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.String, java.io.Serializable> strMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.String, java.io.Serializable>((int) (byte) 100);
    }

    @Test
    public void test6427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6427");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str8 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str18 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str20 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str22 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test6428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6428");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str5 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable6 = null;
        strComparableMRUCache0.put(strComparable6, "hi!");
        java.lang.String str10 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str15 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.Comparable<java.lang.String> strComparable19 = null;
        strComparableMRUCache0.put(strComparable19, "");
        java.lang.String str23 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable24 = null;
        java.lang.String str25 = strComparableMRUCache0.get(strComparable24);
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str33 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
    }

    @Test
    public void test6429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6429");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str11 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str15 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str17 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str19 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str24 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass25 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test6430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6430");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str5 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str10 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass11 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test6431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6431");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str8 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable14 = null;
        java.lang.String str15 = strComparableMRUCache0.get(strComparable14);
        java.lang.String str17 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test6432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6432");
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.datastructures.caches.MRUCache<java.io.Serializable, java.lang.reflect.GenericDeclaration> serializableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.io.Serializable, java.lang.reflect.GenericDeclaration>((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: capacity must greater than 0!");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6433");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str11 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str24 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str26 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str28 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable29 = null;
        strComparableMRUCache0.put(strComparable29, "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
    }

    @Test
    public void test6434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6434");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str8 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.Comparable<java.lang.String> strComparable12 = null;
        java.lang.String str13 = strComparableMRUCache0.get(strComparable12);
        java.lang.String str15 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test6435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6435");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Comparable<java.lang.String> strComparable10 = null;
        strComparableMRUCache0.put(strComparable10, "");
        java.lang.String str14 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.Comparable<java.lang.String> strComparable24 = null;
        strComparableMRUCache0.put(strComparable24, "hi!");
        java.lang.String str28 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str30 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Class<?> wildcardClass34 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test6436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6436");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str11 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str21 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test6437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6437");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str11 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str15 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str17 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.Class<?> wildcardClass21 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test6438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6438");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str8 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str22 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str24 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test6439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6439");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str8 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str10 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str12 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str14 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Class<?> wildcardClass18 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test6440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6440");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        java.lang.String str2 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str7 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str24 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test6441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6441");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str8 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str15 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str17 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str19 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.Comparable<java.lang.String> strComparable23 = null;
        strComparableMRUCache0.put(strComparable23, "");
        java.lang.String str27 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str32 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str34 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
    }

    @Test
    public void test6442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6442");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str8 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str15 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str17 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test6443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6443");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        java.lang.String str2 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str7 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str21 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str26 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test6444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6444");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str11 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str24 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str32 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str40 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass41 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test6445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6445");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.CharSequence, java.lang.Object> charSequenceMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.CharSequence, java.lang.Object>((int) '4');
        java.lang.Class<?> wildcardClass2 = charSequenceMRUCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test6446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6446");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str8 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str10 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str12 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test6447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6447");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str5 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str7 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str9 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str17 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str19 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str21 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass22 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test6448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6448");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((int) '4');
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str9 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test6449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6449");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str11 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str24 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str26 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str37 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
    }

    @Test
    public void test6450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6450");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str5 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable6 = null;
        strComparableMRUCache0.put(strComparable6, "hi!");
        java.lang.String str10 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.Class<?> wildcardClass14 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test6451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6451");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.String, java.lang.Comparable<java.lang.String>> strMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.String, java.lang.Comparable<java.lang.String>>((int) (short) 10);
        java.lang.Class<?> wildcardClass2 = strMRUCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test6452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6452");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        java.lang.String str2 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.Class<?> wildcardClass15 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test6453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6453");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str8 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str10 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str12 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str14 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test6454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6454");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((int) '4');
        java.lang.String str3 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str5 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str13 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test6455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6455");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((int) (byte) 10);
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
    }

    @Test
    public void test6456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6456");
        com.thealgorithms.datastructures.caches.MRUCache<com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>, java.lang.String> strComparableMRUCacheMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>, java.lang.String>((int) (short) 1);
    }

    @Test
    public void test6457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6457");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str11 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str24 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str29 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str31 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.Class<?> wildcardClass35 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test6458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6458");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.invoke.TypeDescriptor> strComparableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.invoke.TypeDescriptor>(100);
        java.lang.Class<?> wildcardClass2 = strComparableMRUCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test6459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6459");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.Comparable<java.lang.String> strComparable10 = null;
        strComparableMRUCache0.put(strComparable10, "hi!");
        java.lang.String str14 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str31 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str33 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass34 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test6460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6460");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str11 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str30 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
    }

    @Test
    public void test6461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6461");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Comparable<java.lang.String> strComparable10 = null;
        strComparableMRUCache0.put(strComparable10, "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str17 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str19 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str27 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str29 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str34 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str36 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str41 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable42 = null;
        strComparableMRUCache0.put(strComparable42, "");
        java.lang.Comparable<java.lang.String> strComparable45 = null;
        strComparableMRUCache0.put(strComparable45, "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str52 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "hi!" + "'", str52, "hi!");
    }

    @Test
    public void test6462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6462");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str8 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable14 = null;
        java.lang.String str15 = strComparableMRUCache0.get(strComparable14);
        java.lang.String str17 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str25 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str27 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test6463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6463");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str11 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str15 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str17 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str28 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test6464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6464");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.invoke.TypeDescriptor, java.io.Serializable> typeDescriptorMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.invoke.TypeDescriptor, java.io.Serializable>(10);
        java.lang.Class<?> wildcardClass2 = typeDescriptorMRUCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test6465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6465");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.constant.Constable, java.lang.reflect.GenericDeclaration> constableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.constant.Constable, java.lang.reflect.GenericDeclaration>((int) '4');
    }

    @Test
    public void test6466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6466");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>(10);
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str6 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test6467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6467");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str8 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable14 = null;
        java.lang.String str15 = strComparableMRUCache0.get(strComparable14);
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str23 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str34 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str36 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str38 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
    }

    @Test
    public void test6468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6468");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str5 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str7 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str9 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str11 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str15 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str17 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str19 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str21 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str23 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str25 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test6469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6469");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Comparable<java.lang.String> strComparable10 = null;
        strComparableMRUCache0.put(strComparable10, "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Comparable<java.lang.String> strComparable19 = null;
        strComparableMRUCache0.put(strComparable19, "hi!");
        java.lang.String str23 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
    }

    @Test
    public void test6470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6470");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Comparable<java.lang.String> strComparable10 = null;
        strComparableMRUCache0.put(strComparable10, "");
        java.lang.String str14 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str25 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str27 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str35 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str40 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
    }

    @Test
    public void test6471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6471");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str11 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str27 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test6472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6472");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((int) ' ');
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str6 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str8 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test6473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6473");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str11 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str16 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass17 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test6474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6474");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str8 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str10 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str30 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str32 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass33 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test6475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6475");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strComparableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>(1);
    }

    @Test
    public void test6476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6476");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str5 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str7 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str9 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str17 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.Comparable<java.lang.String> strComparable24 = null;
        java.lang.String str25 = strComparableMRUCache0.get(strComparable24);
        java.lang.String str27 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str29 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
    }

    @Test
    public void test6477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6477");
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.datastructures.caches.MRUCache<java.lang.reflect.AnnotatedElement, java.lang.invoke.TypeDescriptor> annotatedElementMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.reflect.AnnotatedElement, java.lang.invoke.TypeDescriptor>((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: capacity must greater than 0!");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6478");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str11 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str22 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test6479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6479");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str11 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str16 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str18 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str20 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str22 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str24 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.Comparable<java.lang.String> strComparable31 = null;
        strComparableMRUCache0.put(strComparable31, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
    }

    @Test
    public void test6480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6480");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>(10);
        java.lang.String str3 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str11 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test6481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6481");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str8 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str10 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str15 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str17 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Comparable<java.lang.String> strComparable24 = null;
        strComparableMRUCache0.put(strComparable24, "");
        java.lang.String str28 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str30 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
    }

    @Test
    public void test6482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6482");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Comparable<java.lang.String> strComparable10 = null;
        strComparableMRUCache0.put(strComparable10, "");
        java.lang.String str14 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str25 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str27 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str32 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str37 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str39 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
    }

    @Test
    public void test6483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6483");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        java.lang.String str2 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str10 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str15 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str23 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test6484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6484");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Comparable<java.lang.String> strComparable10 = null;
        strComparableMRUCache0.put(strComparable10, "");
        java.lang.String str14 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str28 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str39 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass40 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test6485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6485");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((int) '#');
        java.lang.String str3 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str11 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable12 = null;
        java.lang.String str13 = strComparableMRUCache1.get(strComparable12);
        java.lang.Class<?> wildcardClass14 = strComparableMRUCache1.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test6486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6486");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str11 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test6487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6487");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str8 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable14 = null;
        java.lang.String str15 = strComparableMRUCache0.get(strComparable14);
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str23 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str37 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
    }

    @Test
    public void test6488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6488");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str8 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str18 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass19 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test6489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6489");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str8 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str15 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str20 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str22 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str27 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test6490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6490");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Class<?>, java.lang.constant.ConstantDesc> wildcardClassMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Class<?>, java.lang.constant.ConstantDesc>((int) (short) 1);
    }

    @Test
    public void test6491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6491");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        java.lang.String str2 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.Comparable<java.lang.String> strComparable6 = null;
        java.lang.String str7 = strComparableMRUCache0.get(strComparable6);
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.Comparable<java.lang.String> strComparable17 = null;
        strComparableMRUCache0.put(strComparable17, "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.Class<?> wildcardClass23 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test6492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6492");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str11 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable14 = null;
        java.lang.String str15 = strComparableMRUCache0.get(strComparable14);
        java.lang.String str17 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str25 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Class<?> wildcardClass32 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test6493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6493");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.constant.Constable, java.lang.String> constableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.constant.Constable, java.lang.String>(100);
    }

    @Test
    public void test6494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6494");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        java.lang.String str2 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str19 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str21 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test6495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6495");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str5 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str7 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str9 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str11 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str22 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test6496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6496");
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.datastructures.caches.MRUCache<java.lang.CharSequence, java.lang.reflect.Type> charSequenceMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.CharSequence, java.lang.reflect.Type>(0);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: capacity must greater than 0!");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6497");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>, java.lang.Comparable<java.lang.String>> wildcardClassOfFieldMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>, java.lang.Comparable<java.lang.String>>((int) (short) 1);
    }

    @Test
    public void test6498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6498");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Comparable<java.lang.String> strComparable10 = null;
        strComparableMRUCache0.put(strComparable10, "");
        java.lang.String str14 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str22 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str24 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str35 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str37 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass38 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test6499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6499");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Comparable<java.lang.String> strComparable10 = null;
        strComparableMRUCache0.put(strComparable10, "");
        java.lang.String str14 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str25 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str27 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str32 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
    }

    @Test
    public void test6500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6500");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str8 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str21 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str23 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }
}

