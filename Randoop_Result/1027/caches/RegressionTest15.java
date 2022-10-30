package caches;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest15 {

    public static boolean debug = false;

    @Test
    public void test7501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7501");
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
        java.lang.String str34 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str39 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str50 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
    }

    @Test
    public void test7502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7502");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        java.lang.String str2 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str7 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str9 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str20 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test7503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7503");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str11 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str16 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str18 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable19 = null;
        strComparableMRUCache0.put(strComparable19, "");
        java.lang.String str23 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test7504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7504");
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
        java.lang.Class<?> wildcardClass28 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test7505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7505");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.Comparable<java.lang.String> strComparable10 = null;
        strComparableMRUCache0.put(strComparable10, "hi!");
        java.lang.String str14 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str25 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str27 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test7506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7506");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        java.lang.String str2 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str10 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str15 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str17 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test7507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7507");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.reflect.AnnotatedElement, java.lang.reflect.AnnotatedElement> annotatedElementMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.reflect.AnnotatedElement, java.lang.reflect.AnnotatedElement>((int) (byte) 1);
    }

    @Test
    public void test7508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7508");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((int) '#');
        java.lang.String str3 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable4 = null;
        java.lang.String str5 = strComparableMRUCache1.get(strComparable4);
        java.lang.String str7 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str9 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test7509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7509");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((int) '#');
        java.lang.String str3 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str8 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str13 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str15 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test7510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7510");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.CharSequence, java.lang.Class<?>> charSequenceMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.CharSequence, java.lang.Class<?>>((int) (byte) 1);
    }

    @Test
    public void test7511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7511");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str11 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str24 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str26 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str28 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str30 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
    }

    @Test
    public void test7512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7512");
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
        java.lang.String str36 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
    }

    @Test
    public void test7513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7513");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str5 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable6 = null;
        strComparableMRUCache0.put(strComparable6, "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str16 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str18 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test7514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7514");
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.datastructures.caches.MRUCache<java.io.Serializable, java.lang.Class<?>> serializableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.io.Serializable, java.lang.Class<?>>((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: capacity must greater than 0!");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7515");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        java.lang.String str2 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str19 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str21 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str23 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test7516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7516");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        java.lang.String str2 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str10 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str18 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test7517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7517");
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
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str27 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str29 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str31 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
    }

    @Test
    public void test7518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7518");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((int) (short) 1);
        java.lang.String str3 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test7519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7519");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str20 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str22 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.Comparable<java.lang.String> strComparable26 = null;
        java.lang.String str27 = strComparableMRUCache0.get(strComparable26);
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNull(str27);
    }

    @Test
    public void test7520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7520");
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
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Class<?> wildcardClass39 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test7521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7521");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str14 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str25 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
    }

    @Test
    public void test7522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7522");
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
        java.lang.Comparable<java.lang.String> strComparable31 = null;
        strComparableMRUCache0.put(strComparable31, "");
        java.lang.String str35 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
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
    public void test7523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7523");
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
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Comparable<java.lang.String> strComparable34 = null;
        strComparableMRUCache0.put(strComparable34, "hi!");
        java.lang.Class<?> wildcardClass37 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test7524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7524");
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
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str32 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.Comparable<java.lang.String> strComparable36 = null;
        strComparableMRUCache0.put(strComparable36, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
    }

    @Test
    public void test7525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7525");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str8 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str10 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str21 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable22 = null;
        java.lang.String str23 = strComparableMRUCache0.get(strComparable22);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test7526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7526");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.invoke.TypeDescriptor, java.lang.Object> typeDescriptorMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.invoke.TypeDescriptor, java.lang.Object>((int) ' ');
    }

    @Test
    public void test7527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7527");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.constant.ConstantDesc, java.lang.invoke.TypeDescriptor> constantDescMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.constant.ConstantDesc, java.lang.invoke.TypeDescriptor>((int) (byte) 1);
    }

    @Test
    public void test7528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7528");
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
        java.lang.String str33 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable34 = null;
        strComparableMRUCache0.put(strComparable34, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
    }

    @Test
    public void test7529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7529");
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
        java.lang.String str31 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str33 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.Class<?> wildcardClass40 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test7530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7530");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str11 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.Comparable<java.lang.String> strComparable24 = null;
        java.lang.String str25 = strComparableMRUCache0.get(strComparable24);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test7531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7531");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.Class<?> wildcardClass7 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test7532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7532");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str11 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str15 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Class<?> wildcardClass19 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test7533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7533");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str8 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable9 = null;
        java.lang.String str10 = strComparableMRUCache0.get(strComparable9);
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.Comparable<java.lang.String> strComparable14 = null;
        strComparableMRUCache0.put(strComparable14, "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test7534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7534");
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
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str34 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass35 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test7535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7535");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((int) (short) 1);
        java.lang.String str3 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str5 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.Class<?> wildcardClass9 = strComparableMRUCache1.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test7536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7536");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Class<?>, java.lang.String> wildcardClassMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Class<?>, java.lang.String>(100);
        java.lang.Class<?> wildcardClass2 = wildcardClassMRUCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test7537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7537");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str11 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.Comparable<java.lang.String> strComparable17 = null;
        strComparableMRUCache0.put(strComparable17, "");
        java.lang.String str21 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str23 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
    }

    @Test
    public void test7538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7538");
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
        java.lang.String str24 = strComparableMRUCache0.get(strComparable23);
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str32 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str34 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
    }

    @Test
    public void test7539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7539");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        java.lang.String str2 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str7 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str12 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str14 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str16 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test7540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7540");
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
        java.lang.String str26 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str28 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str30 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
    }

    @Test
    public void test7541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7541");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str11 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str15 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable16 = null;
        java.lang.String str17 = strComparableMRUCache0.get(strComparable16);
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.Comparable<java.lang.String> strComparable21 = null;
        strComparableMRUCache0.put(strComparable21, "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test7542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7542");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str8 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str16 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str18 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test7543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7543");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str5 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str7 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str9 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str14 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str16 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str18 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test7544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7544");
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
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str33 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
    }

    @Test
    public void test7545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7545");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((int) (byte) 10);
        java.lang.Class<?> wildcardClass2 = strComparableMRUCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test7546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7546");
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.datastructures.caches.MRUCache<java.lang.Object, java.lang.reflect.GenericDeclaration> objMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Object, java.lang.reflect.GenericDeclaration>((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: capacity must greater than 0!");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7547");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((int) '4');
        java.lang.String str3 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str8 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str13 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable14 = null;
        java.lang.String str15 = strComparableMRUCache1.get(strComparable14);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test7548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7548");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str14 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str19 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str21 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.Class<?> wildcardClass25 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test7549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7549");
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
        java.lang.String str28 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
    }

    @Test
    public void test7550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7550");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str11 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str18 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str20 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str22 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str24 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
    }

    @Test
    public void test7551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7551");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.reflect.GenericDeclaration, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>> genericDeclarationMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.reflect.GenericDeclaration, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>(1);
        java.lang.Class<?> wildcardClass2 = genericDeclarationMRUCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test7552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7552");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Class<?>, java.lang.constant.ConstantDesc> wildcardClassMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Class<?>, java.lang.constant.ConstantDesc>((int) ' ');
    }

    @Test
    public void test7553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7553");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str8 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str16 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test7554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7554");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>(1);
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str9 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str11 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str13 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test7555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7555");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str5 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable6 = null;
        strComparableMRUCache0.put(strComparable6, "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Comparable<java.lang.String> strComparable12 = null;
        strComparableMRUCache0.put(strComparable12, "");
        java.lang.String str16 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str24 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass25 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test7556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7556");
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
        java.lang.String str29 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
    }

    @Test
    public void test7557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7557");
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
        java.lang.String str29 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable30 = null;
        java.lang.String str31 = strComparableMRUCache0.get(strComparable30);
        java.lang.Class<?> wildcardClass32 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test7558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7558");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Comparable<java.lang.String> strComparable10 = null;
        strComparableMRUCache0.put(strComparable10, "");
        java.lang.String str14 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str19 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test7559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7559");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((int) (short) 1);
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str6 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str11 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test7560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7560");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str8 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable9 = null;
        java.lang.String str10 = strComparableMRUCache0.get(strComparable9);
        java.lang.String str12 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass13 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test7561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7561");
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
        java.lang.String str29 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass30 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test7562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7562");
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
        java.lang.String str24 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str26 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass27 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test7563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7563");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str8 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Comparable<java.lang.String> strComparable15 = null;
        strComparableMRUCache0.put(strComparable15, "");
        java.lang.String str19 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test7564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7564");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.Comparable<java.lang.String> strComparable10 = null;
        strComparableMRUCache0.put(strComparable10, "hi!");
        java.lang.String str14 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str19 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str21 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str29 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
    }

    @Test
    public void test7565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7565");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str14 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str19 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str21 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test7566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7566");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str5 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test7567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7567");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.reflect.AnnotatedElement, java.lang.CharSequence> annotatedElementMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.reflect.AnnotatedElement, java.lang.CharSequence>((int) (byte) 100);
    }

    @Test
    public void test7568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7568");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str8 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str10 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str12 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str20 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test7569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7569");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str5 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str7 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str9 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str11 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str25 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass26 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test7570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7570");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str8 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str21 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str26 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str28 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test7571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7571");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.constant.ConstantDesc, java.lang.Comparable<java.lang.String>> constantDescMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.constant.ConstantDesc, java.lang.Comparable<java.lang.String>>((int) (byte) 100);
        java.lang.Class<?> wildcardClass2 = constantDescMRUCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test7572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7572");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) (byte) 100);
    }

    @Test
    public void test7573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7573");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        java.lang.String str2 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str10 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str21 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str26 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str31 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
    }

    @Test
    public void test7574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7574");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((int) (short) 1);
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        java.lang.String str6 = strComparableMRUCache1.get(strComparable5);
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str11 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass12 = strComparableMRUCache1.getClass();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test7575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7575");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>(1);
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str9 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str11 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str13 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str18 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test7576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7576");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((int) '4');
        java.lang.String str3 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str8 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.Class<?> wildcardClass12 = strComparableMRUCache1.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test7577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7577");
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
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str36 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass37 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test7578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7578");
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
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test7579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7579");
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
        java.lang.String str28 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test7580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7580");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.reflect.GenericDeclaration, java.lang.Class<?>> genericDeclarationMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.reflect.GenericDeclaration, java.lang.Class<?>>(1);
    }

    @Test
    public void test7581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7581");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str11 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str22 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test7582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7582");
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
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test7583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7583");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str17 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str25 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test7584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7584");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str8 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str18 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test7585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7585");
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
        java.lang.String str31 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str33 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str38 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
    }

    @Test
    public void test7586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7586");
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
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.Class<?> wildcardClass30 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test7587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7587");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Comparable<java.lang.String> strComparable10 = null;
        strComparableMRUCache0.put(strComparable10, "");
        java.lang.String str14 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str19 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable20 = null;
        strComparableMRUCache0.put(strComparable20, "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str27 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable28 = null;
        java.lang.String str29 = strComparableMRUCache0.get(strComparable28);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
    }

    @Test
    public void test7588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7588");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str11 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str15 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str17 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str19 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str21 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str23 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test7589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7589");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str8 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str15 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str26 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str28 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str30 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
    }

    @Test
    public void test7590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7590");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        java.lang.String str2 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test7591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7591");
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
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.Class<?> wildcardClass41 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test7592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7592");
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
        java.lang.Class<?> wildcardClass26 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test7593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7593");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((int) (byte) 1);
        java.lang.String str3 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str5 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str10 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test7594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7594");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>((int) ' ');
    }

    @Test
    public void test7595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7595");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((int) '#');
        java.lang.String str3 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str17 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str19 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test7596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7596");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str11 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str15 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable16 = null;
        java.lang.String str17 = strComparableMRUCache0.get(strComparable16);
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.Comparable<java.lang.String> strComparable21 = null;
        strComparableMRUCache0.put(strComparable21, "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test7597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7597");
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
        java.lang.String str30 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Class<?> wildcardClass34 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test7598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7598");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((int) (short) 1);
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        java.lang.String str6 = strComparableMRUCache1.get(strComparable5);
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.Class<?> wildcardClass10 = strComparableMRUCache1.getClass();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test7599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7599");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str8 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str10 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Class<?> wildcardClass20 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test7600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7600");
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
        java.lang.String str29 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str34 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
    }

    @Test
    public void test7601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7601");
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
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
    }

    @Test
    public void test7602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7602");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str11 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable14 = null;
        strComparableMRUCache0.put(strComparable14, "hi!");
        java.lang.String str18 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str23 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
    }

    @Test
    public void test7603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7603");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.constant.Constable, com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>> constableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.constant.Constable, com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>>((int) '#');
    }

    @Test
    public void test7604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7604");
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
        java.lang.String str37 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.Class<?> wildcardClass41 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test7605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7605");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str8 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable9 = null;
        java.lang.String str10 = strComparableMRUCache0.get(strComparable9);
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str18 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str23 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
    }

    @Test
    public void test7606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7606");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.Comparable<java.lang.String> strComparable10 = null;
        strComparableMRUCache0.put(strComparable10, "hi!");
        java.lang.String str14 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str22 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str27 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str29 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
    }

    @Test
    public void test7607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7607");
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
        java.lang.String str33 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass34 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test7608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7608");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str5 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str7 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str9 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test7609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7609");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((int) (byte) 10);
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str6 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str8 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str10 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass11 = strComparableMRUCache1.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test7610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7610");
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
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str27 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str32 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str37 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str39 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
    }

    @Test
    public void test7611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7611");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((int) '#');
        java.lang.String str3 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str17 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str19 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass20 = strComparableMRUCache1.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test7612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7612");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration> strComparableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration>((int) (byte) 1);
    }

    @Test
    public void test7613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7613");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.reflect.AnnotatedElement, java.lang.String> annotatedElementMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.reflect.AnnotatedElement, java.lang.String>((int) (short) 1);
    }

    @Test
    public void test7614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7614");
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
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Comparable<java.lang.String> strComparable45 = null;
        strComparableMRUCache0.put(strComparable45, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
    }

    @Test
    public void test7615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7615");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str5 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable6 = null;
        strComparableMRUCache0.put(strComparable6, "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Comparable<java.lang.String> strComparable12 = null;
        strComparableMRUCache0.put(strComparable12, "");
        java.lang.String str16 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str21 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test7616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7616");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>((int) (byte) 10);
    }

    @Test
    public void test7617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7617");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str11 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str24 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable25 = null;
        java.lang.String str26 = strComparableMRUCache0.get(strComparable25);
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str31 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
    }

    @Test
    public void test7618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7618");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        java.lang.String str2 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str10 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str15 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str20 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test7619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7619");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.Comparable<java.lang.String> strComparable10 = null;
        strComparableMRUCache0.put(strComparable10, "hi!");
        java.lang.String str14 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test7620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7620");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str8 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str10 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str12 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable13 = null;
        strComparableMRUCache0.put(strComparable13, "hi!");
        java.lang.String str17 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test7621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7621");
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
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str27 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str29 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
    }

    @Test
    public void test7622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7622");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.Object> strComparableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.Object>((int) (short) 10);
    }

    @Test
    public void test7623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7623");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((int) '#');
        java.lang.String str3 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str20 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass21 = strComparableMRUCache1.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test7624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7624");
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
        java.lang.Comparable<java.lang.String> strComparable37 = null;
        java.lang.String str38 = strComparableMRUCache0.get(strComparable37);
        java.lang.String str40 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str42 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
    }

    @Test
    public void test7625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7625");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str5 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str7 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str9 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str11 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.Comparable<java.lang.String> strComparable17 = null;
        strComparableMRUCache0.put(strComparable17, "");
        java.lang.String str21 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test7626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7626");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str8 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str15 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str20 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str25 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str27 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
    }

    @Test
    public void test7627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7627");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str8 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str10 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str15 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str29 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str31 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass32 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test7628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7628");
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
        java.lang.String str24 = strComparableMRUCache0.get(strComparable23);
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str32 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass33 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test7629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7629");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.reflect.GenericDeclaration, java.lang.reflect.GenericDeclaration> genericDeclarationMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.reflect.GenericDeclaration, java.lang.reflect.GenericDeclaration>((int) (byte) 100);
    }

    @Test
    public void test7630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7630");
        com.thealgorithms.datastructures.caches.MRUCache<java.io.Serializable, java.lang.invoke.TypeDescriptor> serializableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.io.Serializable, java.lang.invoke.TypeDescriptor>((int) (byte) 1);
        java.lang.Class<?> wildcardClass2 = serializableMRUCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test7631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7631");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str8 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str10 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str12 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str14 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str16 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass17 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test7632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7632");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((int) 'a');
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str6 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str8 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test7633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7633");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str8 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str10 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str15 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str23 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test7634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7634");
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.datastructures.caches.MRUCache<com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>, java.lang.reflect.Type> strComparableMRUCacheMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>, java.lang.reflect.Type>((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: capacity must greater than 0!");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7635");
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
        java.lang.String str29 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str31 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass32 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test7636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7636");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str5 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable6 = null;
        strComparableMRUCache0.put(strComparable6, "hi!");
        java.lang.String str10 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.Comparable<java.lang.String> strComparable14 = null;
        java.lang.String str15 = strComparableMRUCache0.get(strComparable14);
        java.lang.String str17 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.Comparable<java.lang.String> strComparable21 = null;
        java.lang.String str22 = strComparableMRUCache0.get(strComparable21);
        java.lang.String str24 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str26 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
    }

    @Test
    public void test7637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7637");
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
        java.lang.String str22 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str24 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass25 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test7638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7638");
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
        java.lang.Class<?> wildcardClass24 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test7639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7639");
        com.thealgorithms.datastructures.caches.MRUCache<java.io.Serializable, java.lang.reflect.AnnotatedElement> serializableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.io.Serializable, java.lang.reflect.AnnotatedElement>((int) (short) 100);
        java.lang.Class<?> wildcardClass2 = serializableMRUCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test7640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7640");
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
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str29 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str31 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str33 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
    }

    @Test
    public void test7641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7641");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str11 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.Class<?> wildcardClass17 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test7642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7642");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.reflect.AnnotatedElement, com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>> annotatedElementMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.reflect.AnnotatedElement, com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>>(10);
        java.lang.Class<?> wildcardClass2 = annotatedElementMRUCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test7643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7643");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>> strComparableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>((int) (short) 100);
    }

    @Test
    public void test7644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7644");
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
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str34 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.Class<?> wildcardClass38 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test7645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7645");
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
        java.lang.Class<?> wildcardClass29 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test7646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7646");
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
        java.lang.String str37 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
    }

    @Test
    public void test7647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7647");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.Comparable<java.lang.String> strComparable10 = null;
        strComparableMRUCache0.put(strComparable10, "hi!");
        java.lang.String str14 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str19 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test7648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7648");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.constant.ConstantDesc, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>> constantDescMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.constant.ConstantDesc, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>((int) '#');
        java.lang.Class<?> wildcardClass2 = constantDescMRUCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test7649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7649");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.invoke.TypeDescriptor, com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>> typeDescriptorMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.invoke.TypeDescriptor, com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>>((int) (short) 100);
    }

    @Test
    public void test7650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7650");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Object, java.lang.String> objMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Object, java.lang.String>((int) '4');
    }

    @Test
    public void test7651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7651");
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
        java.lang.String str36 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
    }

    @Test
    public void test7652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7652");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.String, java.lang.reflect.GenericDeclaration> strMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.String, java.lang.reflect.GenericDeclaration>();
        java.lang.Class<?> wildcardClass1 = strMRUCache0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test7653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7653");
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
        java.lang.String str29 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str31 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str39 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
    }

    @Test
    public void test7654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7654");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str5 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str7 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str9 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str11 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str21 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test7655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7655");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str20 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test7656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7656");
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
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test7657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7657");
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
        java.lang.String str24 = strComparableMRUCache0.get(strComparable23);
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str29 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str34 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str39 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str41 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
    }

    @Test
    public void test7658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7658");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration> strComparableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration>((int) '#');
        java.lang.Class<?> wildcardClass2 = strComparableMRUCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test7659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7659");
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
        java.lang.String str34 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str39 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
    }

    @Test
    public void test7660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7660");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor> typeMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor>((int) (short) 100);
    }

    @Test
    public void test7661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7661");
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
        java.lang.String str22 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str24 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str26 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test7662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7662");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        java.lang.String str2 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str15 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test7663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7663");
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
        java.lang.String str25 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str33 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str38 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
    }

    @Test
    public void test7664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7664");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str11 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable14 = null;
        strComparableMRUCache0.put(strComparable14, "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.Class<?> wildcardClass20 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test7665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7665");
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
        java.lang.String str22 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str24 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.Class<?> wildcardClass31 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test7666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7666");
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
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test7667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7667");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        java.lang.String str2 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str7 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str9 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str14 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str19 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str21 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass22 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test7668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7668");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str8 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.Comparable<java.lang.String> strComparable23 = null;
        strComparableMRUCache0.put(strComparable23, "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.Class<?> wildcardClass29 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test7669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7669");
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
        java.lang.String str24 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str26 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass27 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test7670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7670");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((int) (short) 100);
        java.lang.String str3 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str5 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str7 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str9 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test7671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7671");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.reflect.Type, java.lang.reflect.AnnotatedElement> typeMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.reflect.Type, java.lang.reflect.AnnotatedElement>((int) (short) 100);
    }

    @Test
    public void test7672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7672");
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
        java.lang.String str24 = strComparableMRUCache0.get(strComparable23);
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.Class<?> wildcardClass31 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test7673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7673");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str5 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable6 = null;
        strComparableMRUCache0.put(strComparable6, "hi!");
        java.lang.String str10 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str15 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str17 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str19 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str21 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str23 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test7674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7674");
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
        java.lang.Comparable<java.lang.String> strComparable23 = null;
        java.lang.String str24 = strComparableMRUCache0.get(strComparable23);
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str29 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
    }

    @Test
    public void test7675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7675");
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
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test7676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7676");
        com.thealgorithms.datastructures.caches.MRUCache<com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>, java.lang.constant.Constable> strComparableMRUCacheMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>, java.lang.constant.Constable>((int) (short) 10);
    }

    @Test
    public void test7677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7677");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.Comparable<java.lang.String> strComparable10 = null;
        strComparableMRUCache0.put(strComparable10, "hi!");
        java.lang.String str14 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str22 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str30 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
    }

    @Test
    public void test7678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7678");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str8 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str25 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.Class<?> wildcardClass29 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test7679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7679");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str8 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str15 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str17 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str19 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str24 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
    }

    @Test
    public void test7680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7680");
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
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str28 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str30 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
    }

    @Test
    public void test7681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7681");
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
        java.lang.String str31 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
    }

    @Test
    public void test7682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7682");
        com.thealgorithms.datastructures.caches.MRUCache<java.io.Serializable, java.io.Serializable> serializableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.io.Serializable, java.io.Serializable>((int) 'a');
    }

    @Test
    public void test7683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7683");
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
        java.lang.String str26 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.Class<?> wildcardClass30 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test7684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7684");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str5 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str15 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str20 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.Class<?> wildcardClass24 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test7685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7685");
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
        java.lang.String str24 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str26 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str31 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str33 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
    }

    @Test
    public void test7686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7686");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.reflect.AnnotatedElement, java.lang.invoke.TypeDescriptor> annotatedElementMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.reflect.AnnotatedElement, java.lang.invoke.TypeDescriptor>((int) 'a');
    }

    @Test
    public void test7687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7687");
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
        java.lang.String str22 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str24 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable25 = null;
        java.lang.String str26 = strComparableMRUCache0.get(strComparable25);
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str31 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
    }

    @Test
    public void test7688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7688");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Class<?>, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>> wildcardClassMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Class<?>, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>(1);
    }

    @Test
    public void test7689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7689");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.Comparable<java.lang.String> strComparable10 = null;
        strComparableMRUCache0.put(strComparable10, "hi!");
        java.lang.String str14 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.Comparable<java.lang.String> strComparable24 = null;
        strComparableMRUCache0.put(strComparable24, "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test7690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7690");
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
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str30 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
    }

    @Test
    public void test7691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7691");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str14 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str19 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass20 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test7692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7692");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str8 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str22 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str24 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
    }

    @Test
    public void test7693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7693");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.Comparable<java.lang.String> strComparable10 = null;
        strComparableMRUCache0.put(strComparable10, "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str17 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.Class<?> wildcardClass21 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test7694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7694");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Class<?>, java.lang.reflect.Type> wildcardClassMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Class<?>, java.lang.reflect.Type>((int) (byte) 10);
    }

    @Test
    public void test7695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7695");
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
        java.lang.String str33 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.Class<?> wildcardClass37 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test7696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7696");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.reflect.Type, java.lang.Comparable<java.lang.String>> typeMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.reflect.Type, java.lang.Comparable<java.lang.String>>((int) '4');
    }

    @Test
    public void test7697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7697");
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
        java.lang.String str24 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test7698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7698");
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
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.Class<?> wildcardClass30 = strComparableMRUCache0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test7699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7699");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str8 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str15 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str17 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test7700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7700");
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
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Comparable<java.lang.String> strComparable41 = null;
        java.lang.String str42 = strComparableMRUCache0.get(strComparable41);
        java.lang.String str44 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str49 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
    }

    @Test
    public void test7701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7701");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str5 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str7 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str9 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str11 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str16 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str21 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str23 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass24 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test7702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7702");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str8 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str10 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str15 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str17 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str19 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str21 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str29 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str31 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
    }

    @Test
    public void test7703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7703");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str8 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str10 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str15 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str17 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str19 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test7704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7704");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str11 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable14 = null;
        java.lang.String str15 = strComparableMRUCache0.get(strComparable14);
        java.lang.String str17 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test7705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7705");
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
        java.lang.String str39 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass40 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test7706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7706");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str5 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable6 = null;
        strComparableMRUCache0.put(strComparable6, "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str16 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str18 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass19 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test7707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7707");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str8 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str15 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str17 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str19 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str27 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test7708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7708");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str8 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str22 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str30 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
    }

    @Test
    public void test7709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7709");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str8 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str15 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str20 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str28 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str30 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
    }

    @Test
    public void test7710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7710");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Object, java.lang.Object> objMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Object, java.lang.Object>((int) ' ');
        java.lang.Class<?> wildcardClass2 = objMRUCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test7711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7711");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>(10);
        java.lang.Comparable<java.lang.String> strComparable2 = null;
        strComparableMRUCache1.put(strComparable2, "hi!");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str9 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable10 = null;
        strComparableMRUCache1.put(strComparable10, "hi!");
        java.lang.String str14 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test7712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7712");
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
        java.lang.String str34 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str36 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
    }

    @Test
    public void test7713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7713");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str11 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str24 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str26 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str28 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable29 = null;
        java.lang.String str30 = strComparableMRUCache0.get(strComparable29);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertNull(str30);
    }

    @Test
    public void test7714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7714");
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
        java.lang.String str25 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str27 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.Comparable<java.lang.String> strComparable31 = null;
        strComparableMRUCache0.put(strComparable31, "hi!");
        java.lang.Class<?> wildcardClass34 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test7715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7715");
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.datastructures.caches.MRUCache<java.io.Serializable, java.lang.String> serializableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.io.Serializable, java.lang.String>((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: capacity must greater than 0!");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7716");
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
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.Class<?> wildcardClass37 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test7717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7717");
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
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
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
    }

    @Test
    public void test7718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7718");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str8 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test7719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7719");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((int) ' ');
        java.lang.String str3 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test7720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7720");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str11 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str16 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str18 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str23 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test7721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7721");
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
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str39 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
    }

    @Test
    public void test7722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7722");
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
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.Class<?> wildcardClass30 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test7723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7723");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str8 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str10 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str21 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str26 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str28 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
    }

    @Test
    public void test7724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7724");
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
        java.lang.String str24 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test7725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7725");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str11 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str24 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Class<?> wildcardClass34 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test7726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7726");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str11 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str15 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str20 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable21 = null;
        strComparableMRUCache0.put(strComparable21, "hi!");
        java.lang.String str25 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.Class<?> wildcardClass29 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test7727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7727");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str11 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str16 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str18 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test7728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7728");
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
        java.lang.String str27 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test7729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7729");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.CharSequence, com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>> charSequenceMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.CharSequence, com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>>((int) (byte) 100);
    }

    @Test
    public void test7730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7730");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str11 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str16 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable17 = null;
        java.lang.String str18 = strComparableMRUCache0.get(strComparable17);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test7731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7731");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.Comparable<java.lang.String> strComparable10 = null;
        strComparableMRUCache0.put(strComparable10, "hi!");
        java.lang.String str14 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str19 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str27 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str32 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str34 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
    }

    @Test
    public void test7732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7732");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((int) '#');
        java.lang.String str3 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str14 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass15 = strComparableMRUCache1.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test7733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7733");
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.datastructures.caches.MRUCache<java.io.Serializable, java.lang.constant.ConstantDesc> serializableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.io.Serializable, java.lang.constant.ConstantDesc>((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: capacity must greater than 0!");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7734");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        java.lang.String str2 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str7 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str18 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str23 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test7735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7735");
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
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str25 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test7736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7736");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str11 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str18 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str23 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass24 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test7737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7737");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str8 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str16 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test7738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7738");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.invoke.TypeDescriptor, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>> typeDescriptorMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.invoke.TypeDescriptor, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>((int) (byte) 1);
    }

    @Test
    public void test7739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7739");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.String, java.lang.Class<?>> strMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.String, java.lang.Class<?>>(1);
    }

    @Test
    public void test7740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7740");
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
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.Comparable<java.lang.String> strComparable36 = null;
        java.lang.String str37 = strComparableMRUCache0.get(strComparable36);
        java.lang.String str39 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
    }

    @Test
    public void test7741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7741");
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
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str27 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
    }

    @Test
    public void test7742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7742");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Comparable<java.lang.String> strComparable10 = null;
        strComparableMRUCache0.put(strComparable10, "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
    }

    @Test
    public void test7743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7743");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str5 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str7 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str12 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str14 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test7744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7744");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        java.lang.String str2 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str10 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str18 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str23 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass24 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test7745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7745");
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
        java.lang.String str27 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
    }

    @Test
    public void test7746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7746");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str11 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str15 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str20 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str22 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass23 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test7747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7747");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str5 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str7 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str9 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str11 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str15 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str17 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test7748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7748");
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
        java.lang.String str26 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test7749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7749");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((int) '#');
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        java.lang.String str6 = strComparableMRUCache1.get(strComparable5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test7750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7750");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str8 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str15 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass16 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test7751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7751");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        java.lang.String str2 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str7 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str15 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str20 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass21 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test7752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7752");
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
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str27 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str29 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str31 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
    }

    @Test
    public void test7753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7753");
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.datastructures.caches.MRUCache<java.lang.CharSequence, java.lang.invoke.TypeDescriptor> charSequenceMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.CharSequence, java.lang.invoke.TypeDescriptor>((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: capacity must greater than 0!");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7754");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str5 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable6 = null;
        strComparableMRUCache0.put(strComparable6, "hi!");
        java.lang.String str10 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str15 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str17 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str19 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test7755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7755");
        com.thealgorithms.datastructures.caches.MRUCache<com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>, com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>> strComparableMRUCacheMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>, com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>>((int) (byte) 1);
    }

    @Test
    public void test7756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7756");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str8 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str24 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test7757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7757");
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
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test7758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7758");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Class<?>, java.lang.Object> wildcardClassMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Class<?>, java.lang.Object>((int) (byte) 10);
    }

    @Test
    public void test7759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7759");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str5 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable6 = null;
        strComparableMRUCache0.put(strComparable6, "hi!");
        java.lang.String str10 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str15 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test7760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7760");
        com.thealgorithms.datastructures.caches.MRUCache<java.io.Serializable, com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>> serializableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.io.Serializable, com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>>(1);
    }

    @Test
    public void test7761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7761");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str8 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.Class<?> wildcardClass12 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test7762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7762");
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
        java.lang.String str21 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str23 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str25 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str30 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str32 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
    }

    @Test
    public void test7763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7763");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((int) '#');
        java.lang.String str3 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str11 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str13 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str21 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test7764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7764");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str11 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str16 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str18 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str20 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str22 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass23 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test7765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7765");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.reflect.Type> strComparableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.reflect.Type>((int) (byte) 1);
        java.lang.Class<?> wildcardClass2 = strComparableMRUCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test7766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7766");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.String, java.lang.CharSequence> strMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.String, java.lang.CharSequence>((int) '#');
        java.lang.Class<?> wildcardClass2 = strMRUCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test7767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7767");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        java.lang.String str2 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str10 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.Class<?> wildcardClass23 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test7768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7768");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>(1);
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str6 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str8 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str10 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str18 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str20 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test7769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7769");
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
        java.lang.Class<?> wildcardClass28 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test7770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7770");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.constant.Constable, java.lang.constant.Constable> constableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.constant.Constable, java.lang.constant.Constable>((int) (byte) 1);
        java.lang.Class<?> wildcardClass2 = constableMRUCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test7771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7771");
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
        java.lang.String str29 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
    }

    @Test
    public void test7772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7772");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.invoke.TypeDescriptor, java.lang.constant.Constable> typeDescriptorMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.invoke.TypeDescriptor, java.lang.constant.Constable>(1);
    }

    @Test
    public void test7773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7773");
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
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test7774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7774");
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
        java.lang.String str28 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str30 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str32 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
    }

    @Test
    public void test7775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7775");
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
        java.lang.String str25 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test7776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7776");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str11 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str18 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test7777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7777");
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
        java.lang.String str27 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test7778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7778");
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
        java.lang.String str31 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
    }

    @Test
    public void test7779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7779");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.constant.ConstantDesc> strComparableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.constant.ConstantDesc>((int) '4');
    }

    @Test
    public void test7780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7780");
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
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
    }

    @Test
    public void test7781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7781");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.Comparable<java.lang.String> strComparable10 = null;
        strComparableMRUCache0.put(strComparable10, "hi!");
        java.lang.String str14 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str19 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str21 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str26 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str28 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test7782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7782");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((int) '4');
        java.lang.String str3 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str5 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str10 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str12 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str14 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass15 = strComparableMRUCache1.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test7783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7783");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.reflect.Type, com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>> typeMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.reflect.Type, com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>>((int) 'a');
    }

    @Test
    public void test7784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7784");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        java.lang.String str2 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str10 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str21 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str26 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test7785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7785");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str8 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable9 = null;
        java.lang.String str10 = strComparableMRUCache0.get(strComparable9);
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str18 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test7786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7786");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.invoke.TypeDescriptor, java.lang.reflect.GenericDeclaration> typeDescriptorMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.invoke.TypeDescriptor, java.lang.reflect.GenericDeclaration>(1);
        java.lang.Class<?> wildcardClass2 = typeDescriptorMRUCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test7787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7787");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        java.lang.String str2 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str10 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str12 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str20 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test7788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7788");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>(100);
        java.lang.Class<?> wildcardClass2 = charSequenceMRUCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test7789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7789");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str11 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str15 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str17 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str22 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str24 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass25 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test7790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7790");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.Comparable<java.lang.String> strComparable10 = null;
        strComparableMRUCache0.put(strComparable10, "hi!");
        java.lang.String str14 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str19 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str24 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str29 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str31 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass32 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test7791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7791");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Class<?> wildcardClass19 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test7792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7792");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str8 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable9 = null;
        java.lang.String str10 = strComparableMRUCache0.get(strComparable9);
        java.lang.String str12 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str14 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str19 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str21 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test7793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7793");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str8 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str19 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str24 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test7794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7794");
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
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.Class<?> wildcardClass41 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test7795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7795");
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
        java.lang.Class<?> wildcardClass24 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test7796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7796");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str8 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str15 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str20 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str22 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test7797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7797");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.Comparable<java.lang.String> strComparable10 = null;
        strComparableMRUCache0.put(strComparable10, "hi!");
        java.lang.String str14 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str22 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str24 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str29 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
    }

    @Test
    public void test7798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7798");
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
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str32 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
    }

    @Test
    public void test7799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7799");
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
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str30 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str32 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str34 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str36 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str41 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
    }

    @Test
    public void test7800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7800");
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
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.Class<?> wildcardClass32 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test7801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7801");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str11 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable14 = null;
        java.lang.String str15 = strComparableMRUCache0.get(strComparable14);
        java.lang.String str17 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Class<?> wildcardClass24 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test7802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7802");
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
        java.lang.String str23 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str25 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str30 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
    }

    @Test
    public void test7803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7803");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str29 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable30 = null;
        java.lang.String str31 = strComparableMRUCache0.get(strComparable30);
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str36 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
    }

    @Test
    public void test7804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7804");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str17 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str19 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test7805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7805");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>(1);
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str6 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str8 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str13 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str15 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test7806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7806");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str14 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str19 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test7807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7807");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str8 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str15 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str23 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
    }

    @Test
    public void test7808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7808");
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
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test7809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7809");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str11 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str15 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str17 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str19 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str24 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test7810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7810");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        java.lang.String str2 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str10 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str12 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test7811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7811");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        java.lang.String str2 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str7 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str9 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str11 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str16 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test7812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7812");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.String, java.io.Serializable> strMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.String, java.io.Serializable>((int) (short) 1);
    }

    @Test
    public void test7813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7813");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.Comparable<java.lang.String> strComparable10 = null;
        strComparableMRUCache0.put(strComparable10, "hi!");
        java.lang.String str14 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str19 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str27 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str32 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
    }

    @Test
    public void test7814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7814");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str8 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str10 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str12 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test7815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7815");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str8 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str10 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str24 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str29 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str31 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
    }

    @Test
    public void test7816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7816");
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
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str27 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str29 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str31 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable32 = null;
        java.lang.String str33 = strComparableMRUCache0.get(strComparable32);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
    }

    @Test
    public void test7817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7817");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        java.lang.String str2 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str7 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str9 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str11 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.Class<?> wildcardClass18 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test7818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7818");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((int) (byte) 10);
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str6 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str8 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass9 = strComparableMRUCache1.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test7819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7819");
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
        java.lang.String str30 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str32 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str34 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
    }

    @Test
    public void test7820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7820");
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
        java.lang.String str32 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
    }

    @Test
    public void test7821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7821");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str11 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str15 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str17 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str22 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable23 = null;
        java.lang.String str24 = strComparableMRUCache0.get(strComparable23);
        java.lang.String str26 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str28 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass29 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test7822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7822");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>, java.lang.constant.Constable> wildcardClassOfFieldMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>, java.lang.constant.Constable>((int) '#');
    }

    @Test
    public void test7823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7823");
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
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Comparable<java.lang.String> strComparable34 = null;
        strComparableMRUCache0.put(strComparable34, "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
    }

    @Test
    public void test7824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7824");
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
        java.lang.Class<?> wildcardClass38 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test7825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7825");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str5 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str7 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str9 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test7826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7826");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.Comparable<java.lang.String> strComparable10 = null;
        strComparableMRUCache0.put(strComparable10, "hi!");
        java.lang.String str14 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str16 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str21 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test7827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7827");
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
        java.lang.String str26 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test7828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7828");
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
        java.lang.Class<?> wildcardClass33 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test7829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7829");
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
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str34 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str42 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
    }

    @Test
    public void test7830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7830");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str8 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable9 = null;
        java.lang.String str10 = strComparableMRUCache0.get(strComparable9);
        java.lang.String str12 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str14 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str16 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str21 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test7831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7831");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((int) (byte) 10);
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str6 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass7 = strComparableMRUCache1.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test7832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7832");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        java.lang.String str2 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str10 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str18 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.Class<?> wildcardClass28 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test7833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7833");
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
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str33 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.Class<?> wildcardClass40 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test7834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7834");
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
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
    }

    @Test
    public void test7835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7835");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str8 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str15 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str20 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str25 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str27 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str29 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
    }

    @Test
    public void test7836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7836");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str8 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str15 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str26 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass27 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test7837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7837");
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
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str40 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
    }

    @Test
    public void test7838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7838");
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
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str31 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
    }

    @Test
    public void test7839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7839");
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
        java.lang.String str31 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass32 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test7840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7840");
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
        java.lang.String str27 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test7841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7841");
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
        java.lang.String str36 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str38 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str43 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str45 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
    }

    @Test
    public void test7842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7842");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Object, com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>> objMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Object, com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>>((int) (short) 1);
    }

    @Test
    public void test7843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7843");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.reflect.Type, java.lang.CharSequence> typeMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.reflect.Type, java.lang.CharSequence>((int) (byte) 100);
    }

    @Test
    public void test7844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7844");
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
        java.lang.Comparable<java.lang.String> strComparable32 = null;
        java.lang.String str33 = strComparableMRUCache0.get(strComparable32);
        java.lang.String str35 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
    }

    @Test
    public void test7845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7845");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Comparable<java.lang.String> strComparable10 = null;
        strComparableMRUCache0.put(strComparable10, "");
        java.lang.String str14 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str19 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str24 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass25 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test7846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7846");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str11 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str19 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str21 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str26 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test7847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7847");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.invoke.TypeDescriptor, java.lang.Comparable<java.lang.String>> typeDescriptorMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.invoke.TypeDescriptor, java.lang.Comparable<java.lang.String>>((int) ' ');
        java.lang.Class<?> wildcardClass2 = typeDescriptorMRUCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test7848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7848");
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
        java.lang.Comparable<java.lang.String> strComparable23 = null;
        java.lang.String str24 = strComparableMRUCache0.get(strComparable23);
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str29 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str31 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable32 = null;
        strComparableMRUCache0.put(strComparable32, "hi!");
        java.lang.Class<?> wildcardClass35 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test7849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7849");
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
        java.lang.Comparable<java.lang.String> strComparable32 = null;
        java.lang.String str33 = strComparableMRUCache0.get(strComparable32);
        java.lang.String str35 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
    }

    @Test
    public void test7850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7850");
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
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.Comparable<java.lang.String> strComparable24 = null;
        java.lang.String str25 = strComparableMRUCache0.get(strComparable24);
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str30 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str32 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
    }

    @Test
    public void test7851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7851");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.constant.ConstantDesc, com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>> constantDescMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.constant.ConstantDesc, com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>>((int) (byte) 100);
        java.lang.Class<?> wildcardClass2 = constantDescMRUCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test7852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7852");
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
        java.lang.String str21 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str23 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str28 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str33 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
    }

    @Test
    public void test7853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7853");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str11 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str16 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str18 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable19 = null;
        strComparableMRUCache0.put(strComparable19, "");
        java.lang.Comparable<java.lang.String> strComparable22 = null;
        strComparableMRUCache0.put(strComparable22, "");
        java.lang.Class<?> wildcardClass25 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test7854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7854");
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
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str28 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str30 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.Class<?> wildcardClass34 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test7855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7855");
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
        java.lang.String str34 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str36 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass37 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test7856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7856");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.Comparable<java.lang.String> strComparable10 = null;
        strComparableMRUCache0.put(strComparable10, "hi!");
        java.lang.String str14 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str22 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str30 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
    }

    @Test
    public void test7857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7857");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str11 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str18 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str20 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test7858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7858");
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
        java.lang.String str24 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
    }

    @Test
    public void test7859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7859");
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
        java.lang.String str24 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str26 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
    }

    @Test
    public void test7860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7860");
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
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.Class<?> wildcardClass28 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test7861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7861");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>(1);
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str6 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str8 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str10 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Class<?> wildcardClass14 = strComparableMRUCache1.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test7862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7862");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str8 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable14 = null;
        java.lang.String str15 = strComparableMRUCache0.get(strComparable14);
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.Comparable<java.lang.String> strComparable19 = null;
        strComparableMRUCache0.put(strComparable19, "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Class<?> wildcardClass25 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test7863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7863");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str11 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str16 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str18 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str20 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str25 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str27 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str29 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass30 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test7864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7864");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        java.lang.String str2 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str7 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str9 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str14 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str19 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test7865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7865");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str8 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable14 = null;
        java.lang.String str15 = strComparableMRUCache0.get(strComparable14);
        java.lang.String str17 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.Class<?> wildcardClass30 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test7866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7866");
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.datastructures.caches.MRUCache<java.lang.invoke.TypeDescriptor, java.lang.reflect.Type> typeDescriptorMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.invoke.TypeDescriptor, java.lang.reflect.Type>((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: capacity must greater than 0!");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7867");
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
        java.lang.String str23 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str25 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
    }

    @Test
    public void test7868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7868");
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
        java.lang.String str37 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
    }

    @Test
    public void test7869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7869");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str5 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable6 = null;
        strComparableMRUCache0.put(strComparable6, "hi!");
        java.lang.String str10 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str18 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test7870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7870");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Comparable<java.lang.String> strComparable10 = null;
        strComparableMRUCache0.put(strComparable10, "");
        java.lang.String str14 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str16 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str18 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str23 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str28 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test7871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7871");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.invoke.TypeDescriptor, java.lang.CharSequence> typeDescriptorMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.invoke.TypeDescriptor, java.lang.CharSequence>(1);
    }

    @Test
    public void test7872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7872");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str11 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str15 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str17 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test7873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7873");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str11 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str27 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable28 = null;
        java.lang.String str29 = strComparableMRUCache0.get(strComparable28);
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str40 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
    }

    @Test
    public void test7874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7874");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        java.lang.String str2 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str7 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str15 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str23 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str28 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Class<?> wildcardClass32 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test7875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7875");
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
        java.lang.String str25 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
    }

    @Test
    public void test7876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7876");
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
        java.lang.String str32 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
    }

    @Test
    public void test7877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7877");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        java.lang.String str2 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str7 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str15 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str23 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str31 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str36 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str38 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str40 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
    }

    @Test
    public void test7878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7878");
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
        java.lang.String str34 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str42 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
    }

    @Test
    public void test7879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7879");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str8 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str15 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str20 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str25 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str27 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str29 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
    }

    @Test
    public void test7880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7880");
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
        java.lang.Class<?> wildcardClass42 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test7881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7881");
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
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.Class<?> wildcardClass33 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test7882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7882");
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>> strComparableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: capacity must greater than 0!");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7883");
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
        java.lang.String str26 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
    }

    @Test
    public void test7884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7884");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str11 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable14 = null;
        strComparableMRUCache0.put(strComparable14, "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test7885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7885");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((int) '4');
        java.lang.String str3 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str8 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str13 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable14 = null;
        strComparableMRUCache1.put(strComparable14, "hi!");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.Class<?> wildcardClass20 = strComparableMRUCache1.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test7886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7886");
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
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test7887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7887");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>(1);
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str9 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str11 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str13 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str15 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test7888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7888");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str8 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.Comparable<java.lang.String> strComparable12 = null;
        java.lang.String str13 = strComparableMRUCache0.get(strComparable12);
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str24 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
    }

    @Test
    public void test7889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7889");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((int) (short) 100);
        java.lang.String str3 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str5 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str7 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass8 = strComparableMRUCache1.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test7890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7890");
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
        java.lang.String str30 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass31 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test7891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7891");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.reflect.AnnotatedElement, java.lang.Comparable<java.lang.String>> annotatedElementMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.reflect.AnnotatedElement, java.lang.Comparable<java.lang.String>>((int) 'a');
    }

    @Test
    public void test7892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7892");
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
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str29 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable30 = null;
        java.lang.String str31 = strComparableMRUCache0.get(strComparable30);
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
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertNull(str31);
    }

    @Test
    public void test7893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7893");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str8 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str15 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str17 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str19 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Comparable<java.lang.String> strComparable23 = null;
        strComparableMRUCache0.put(strComparable23, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test7894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7894");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str11 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str24 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
    }

    @Test
    public void test7895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7895");
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
        java.lang.String str30 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
    }

    @Test
    public void test7896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7896");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.invoke.TypeDescriptor> strComparableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.invoke.TypeDescriptor>((int) (byte) 100);
    }

    @Test
    public void test7897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7897");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((int) ' ');
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str6 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str8 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str10 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test7898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7898");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str8 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str19 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable20 = null;
        java.lang.String str21 = strComparableMRUCache0.get(strComparable20);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test7899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7899");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((int) '4');
        java.lang.String str3 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str5 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str13 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test7900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7900");
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
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str37 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Class<?> wildcardClass41 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test7901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7901");
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
        java.lang.String str27 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str29 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
    }

    @Test
    public void test7902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7902");
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
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str29 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
    }

    @Test
    public void test7903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7903");
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
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str35 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.Class<?> wildcardClass39 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test7904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7904");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>, java.lang.constant.ConstantDesc> wildcardClassOfFieldMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>, java.lang.constant.ConstantDesc>((int) '4');
    }

    @Test
    public void test7905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7905");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.constant.Constable, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>> constableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.constant.Constable, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>((int) 'a');
        java.lang.Class<?> wildcardClass2 = constableMRUCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test7906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7906");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        java.lang.String str2 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str19 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test7907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7907");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>(10);
        java.lang.Comparable<java.lang.String> strComparable2 = null;
        java.lang.String str3 = strComparableMRUCache1.get(strComparable2);
        java.lang.String str5 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str10 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test7908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7908");
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.datastructures.caches.MRUCache<java.lang.constant.ConstantDesc, java.io.Serializable> constantDescMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.constant.ConstantDesc, java.io.Serializable>(0);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: capacity must greater than 0!");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7909");
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
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test7910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7910");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.Comparable<java.lang.String> strComparable13 = null;
        strComparableMRUCache0.put(strComparable13, "");
        java.lang.Comparable<java.lang.String> strComparable16 = null;
        java.lang.String str17 = strComparableMRUCache0.get(strComparable16);
        java.lang.String str19 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test7911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7911");
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
        java.lang.String str25 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
    }

    @Test
    public void test7912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7912");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>, java.lang.reflect.Type> wildcardClassOfFieldMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>, java.lang.reflect.Type>(100);
        java.lang.Class<?> wildcardClass2 = wildcardClassOfFieldMRUCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test7913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7913");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        java.lang.String str2 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str7 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str9 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str14 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str16 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test7914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7914");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
    }

    @Test
    public void test7915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7915");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str8 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str16 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str18 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test7916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7916");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str8 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str22 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test7917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7917");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str5 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable6 = null;
        strComparableMRUCache0.put(strComparable6, "hi!");
        java.lang.String str10 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str15 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str20 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str22 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test7918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7918");
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
        java.lang.Class<?> wildcardClass33 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test7919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7919");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Object, java.lang.reflect.GenericDeclaration> objMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Object, java.lang.reflect.GenericDeclaration>((int) '#');
    }

    @Test
    public void test7920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7920");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        java.lang.String str2 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str10 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str15 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str17 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable18 = null;
        java.lang.String str19 = strComparableMRUCache0.get(strComparable18);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test7921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7921");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str5 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable6 = null;
        strComparableMRUCache0.put(strComparable6, "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str16 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str18 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass19 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test7922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7922");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>(1);
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str9 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str11 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str13 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test7923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7923");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.reflect.GenericDeclaration, java.lang.invoke.TypeDescriptor> genericDeclarationMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.reflect.GenericDeclaration, java.lang.invoke.TypeDescriptor>((int) '4');
    }

    @Test
    public void test7924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7924");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.reflect.GenericDeclaration, java.lang.String> genericDeclarationMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.reflect.GenericDeclaration, java.lang.String>((int) (short) 100);
        java.lang.Class<?> wildcardClass2 = genericDeclarationMRUCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test7925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7925");
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
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str40 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
    }

    @Test
    public void test7926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7926");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.Comparable<java.lang.String> strComparable10 = null;
        strComparableMRUCache0.put(strComparable10, "hi!");
        java.lang.String str14 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str25 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str27 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test7927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7927");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str11 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str19 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test7928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7928");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str11 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str16 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str21 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.Comparable<java.lang.String> strComparable25 = null;
        strComparableMRUCache0.put(strComparable25, "hi!");
        java.lang.String str29 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str31 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass32 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test7929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7929");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str20 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str22 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.Class<?> wildcardClass26 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test7930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7930");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str5 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str7 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str9 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str11 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str21 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.Class<?> wildcardClass25 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test7931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7931");
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
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str30 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str35 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
    }

    @Test
    public void test7932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7932");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>((int) (byte) 1);
    }

    @Test
    public void test7933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7933");
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
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
    }

    @Test
    public void test7934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7934");
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
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str28 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str33 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str35 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str37 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
    }

    @Test
    public void test7935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7935");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        java.lang.String str2 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str7 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str9 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str17 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str19 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.Class<?> wildcardClass23 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test7936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7936");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str11 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str22 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test7937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7937");
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
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str27 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass28 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test7938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7938");
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
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str27 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str32 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
    }

    @Test
    public void test7939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7939");
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
        java.lang.String str28 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str30 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
    }

    @Test
    public void test7940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7940");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.Comparable<java.lang.String> strComparable10 = null;
        strComparableMRUCache0.put(strComparable10, "hi!");
        java.lang.String str14 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str19 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str21 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Comparable<java.lang.String> strComparable25 = null;
        java.lang.String str26 = strComparableMRUCache0.get(strComparable25);
        java.lang.String str28 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test7941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7941");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str8 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.Comparable<java.lang.String> strComparable23 = null;
        java.lang.String str24 = strComparableMRUCache0.get(strComparable23);
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str29 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
    }

    @Test
    public void test7942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7942");
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
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str32 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
    }

    @Test
    public void test7943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7943");
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
        java.lang.Comparable<java.lang.String> strComparable25 = null;
        strComparableMRUCache0.put(strComparable25, "");
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
    public void test7944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7944");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((int) 'a');
        java.lang.String str3 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str5 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.Comparable<java.lang.String> strComparable9 = null;
        java.lang.String str10 = strComparableMRUCache1.get(strComparable9);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test7945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7945");
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
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str28 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test7946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7946");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str5 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable6 = null;
        strComparableMRUCache0.put(strComparable6, "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test7947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7947");
        com.thealgorithms.datastructures.caches.MRUCache<java.io.Serializable, java.lang.constant.ConstantDesc> serializableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.io.Serializable, java.lang.constant.ConstantDesc>((int) (short) 1);
    }

    @Test
    public void test7948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7948");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str5 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str15 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str17 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test7949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7949");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str8 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.Comparable<java.lang.String> strComparable12 = null;
        strComparableMRUCache0.put(strComparable12, "hi!");
        java.lang.String str16 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test7950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7950");
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
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test7951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7951");
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
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str27 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test7952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7952");
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
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.Class<?> wildcardClass29 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test7953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7953");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
    }

    @Test
    public void test7954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7954");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.String, java.lang.Object> strMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.String, java.lang.Object>(100);
    }

    @Test
    public void test7955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7955");
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
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str36 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
    }

    @Test
    public void test7956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7956");
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
        java.lang.String str27 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str29 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
    }

    @Test
    public void test7957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7957");
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
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str27 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str29 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str34 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str36 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str41 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str46 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
    }

    @Test
    public void test7958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7958");
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
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str38 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
    }

    @Test
    public void test7959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7959");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str8 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable14 = null;
        java.lang.String str15 = strComparableMRUCache0.get(strComparable14);
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str20 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Class<?> wildcardClass27 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test7960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7960");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((int) '#');
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.Class<?> wildcardClass11 = strComparableMRUCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test7961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7961");
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
        java.lang.Comparable<java.lang.String> strComparable34 = null;
        strComparableMRUCache0.put(strComparable34, "hi!");
        java.lang.String str38 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
    }

    @Test
    public void test7962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7962");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str11 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str18 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.Comparable<java.lang.String> strComparable22 = null;
        strComparableMRUCache0.put(strComparable22, "");
        java.lang.Class<?> wildcardClass25 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test7963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7963");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str14 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.Comparable<java.lang.String> strComparable18 = null;
        java.lang.String str19 = strComparableMRUCache0.get(strComparable18);
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test7964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7964");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>(1);
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str21 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass22 = strComparableMRUCache1.getClass();
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test7965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7965");
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
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test7966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7966");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.constant.Constable, java.lang.constant.Constable> constableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.constant.Constable, java.lang.constant.Constable>(100);
    }

    @Test
    public void test7967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7967");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str14 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test7968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7968");
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
        java.lang.String str25 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str27 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str29 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
    }

    @Test
    public void test7969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7969");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str20 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str22 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test7970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7970");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>(10);
        java.lang.Comparable<java.lang.String> strComparable2 = null;
        java.lang.String str3 = strComparableMRUCache1.get(strComparable2);
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str8 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass9 = strComparableMRUCache1.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test7971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7971");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        java.lang.String str2 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str10 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str15 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str17 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str22 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str24 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test7972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7972");
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
        java.lang.String str30 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str32 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
    }

    @Test
    public void test7973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7973");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        java.lang.String str2 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str7 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str18 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable19 = null;
        strComparableMRUCache0.put(strComparable19, "hi!");
        java.lang.Class<?> wildcardClass22 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test7974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7974");
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
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Class<?> wildcardClass30 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test7975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7975");
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
        java.lang.Comparable<java.lang.String> strComparable23 = null;
        java.lang.String str24 = strComparableMRUCache0.get(strComparable23);
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test7976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7976");
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
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str27 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str29 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
    }

    @Test
    public void test7977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7977");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((int) '#');
        java.lang.String str3 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str14 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test7978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7978");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        java.lang.String str2 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str7 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str15 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str23 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str31 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str33 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
    }

    @Test
    public void test7979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7979");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Comparable<java.lang.String> strComparable10 = null;
        strComparableMRUCache0.put(strComparable10, "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str20 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str22 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable23 = null;
        strComparableMRUCache0.put(strComparable23, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test7980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7980");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str14 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str19 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test7981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7981");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        java.lang.String str2 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str7 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str9 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test7982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7982");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        java.lang.String str2 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str19 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str21 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test7983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7983");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((int) '#');
        java.lang.String str3 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str8 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test7984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7984");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str8 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str10 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str21 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass22 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test7985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7985");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strComparableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>((int) (short) 10);
    }

    @Test
    public void test7986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7986");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.constant.ConstantDesc, java.lang.reflect.Type> constantDescMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.constant.ConstantDesc, java.lang.reflect.Type>(100);
    }

    @Test
    public void test7987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7987");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str8 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test7988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7988");
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
        java.lang.String str28 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str30 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str32 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
    }

    @Test
    public void test7989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7989");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str8 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str15 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str17 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str19 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test7990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7990");
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
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.Comparable<java.lang.String> strComparable27 = null;
        java.lang.String str28 = strComparableMRUCache0.get(strComparable27);
        java.lang.String str30 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass31 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test7991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7991");
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
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str30 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str32 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str34 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
    }

    @Test
    public void test7992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7992");
        com.thealgorithms.datastructures.caches.MRUCache<java.io.Serializable, java.lang.constant.Constable> serializableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.io.Serializable, java.lang.constant.Constable>(10);
    }

    @Test
    public void test7993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7993");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((int) (byte) 1);
        java.lang.String str3 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str5 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str7 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test7994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7994");
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
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str40 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
    }

    @Test
    public void test7995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7995");
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.datastructures.caches.MRUCache<java.lang.invoke.TypeDescriptor, java.lang.String> typeDescriptorMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.invoke.TypeDescriptor, java.lang.String>((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: capacity must greater than 0!");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7996");
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
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str33 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass34 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test7997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7997");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        java.lang.String str2 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str10 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str12 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str17 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test7998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7998");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str5 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test7999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7999");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str11 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test8000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test8000");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str5 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str7 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str9 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str11 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.Comparable<java.lang.String> strComparable17 = null;
        strComparableMRUCache0.put(strComparable17, "");
        java.lang.String str21 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str26 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass27 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }
}

