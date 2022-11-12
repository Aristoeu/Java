package datastructures.caches;

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
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str9 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str14 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str19 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str21 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str23 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str25 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str30 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass31 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test3502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3502");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str9 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str14 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str16 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str24 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test3503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3503");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        java.lang.String str3 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str5 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str13 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass14 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3504");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str12 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str20 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str25 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str27 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str32 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str34 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str36 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
    }

    @Test
    public void test3505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3505");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str18 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str20 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str22 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass23 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3506");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str12 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str20 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str31 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str31);
    }

    @Test
    public void test3507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3507");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str6 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str8 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str10 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str15 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str23 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str25 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test3508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3508");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str9 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str14 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.Comparable<java.lang.String> strComparable18 = null;
        strComparableLFUCache1.put(strComparable18, "");
        java.lang.Comparable<java.lang.String> strComparable21 = null;
        strComparableLFUCache1.put(strComparable21, "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str31 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
    }

    @Test
    public void test3509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3509");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str9 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str14 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str25 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str27 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str35 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNull(str35);
    }

    @Test
    public void test3510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3510");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str12 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.Comparable<java.lang.String> strComparable19 = null;
        strComparableLFUCache1.put(strComparable19, "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str26 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
    }

    @Test
    public void test3511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3511");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str9 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str14 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str19 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str21 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable22 = null;
        strComparableLFUCache1.put(strComparable22, "hi!");
        java.lang.String str26 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable27 = null;
        strComparableLFUCache1.put(strComparable27, "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.Class<?> wildcardClass33 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test3512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3512");
        com.thealgorithms.datastructures.caches.LFUCache<java.io.Serializable, java.lang.CharSequence> serializableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.io.Serializable, java.lang.CharSequence>((java.lang.Integer) 100);
        java.lang.Class<?> wildcardClass2 = serializableLFUCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test3513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3513");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str12 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str14 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test3514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3514");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str6 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str8 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str16 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test3515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3515");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str9 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str17 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test3516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3516");
        com.thealgorithms.datastructures.caches.LFUCache<com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>, java.lang.String> strComparableLFUCacheLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>, java.lang.String>((java.lang.Integer) 0);
    }

    @Test
    public void test3517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3517");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str9 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str14 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.Comparable<java.lang.String> strComparable18 = null;
        strComparableLFUCache1.put(strComparable18, "");
        java.lang.Comparable<java.lang.String> strComparable21 = null;
        strComparableLFUCache1.put(strComparable21, "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str31 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str33 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str41 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str43 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass44 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test3518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3518");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 10);
        java.lang.String str3 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str11 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str13 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test3519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3519");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        java.lang.String str3 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str5 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str10 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str12 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str17 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.Comparable<java.lang.String> strComparable24 = null;
        java.lang.String str25 = strComparableLFUCache1.get(strComparable24);
        java.lang.Class<?> wildcardClass26 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test3520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3520");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str6 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str8 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str13 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str21 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str23 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str28 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str30 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(str30);
    }

    @Test
    public void test3521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3521");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 100);
        java.lang.String str3 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str5 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str7 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str15 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str17 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test3522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3522");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 10);
        java.lang.String str3 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Class<?> wildcardClass13 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3523");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str9 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str14 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str16 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass17 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3524");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        java.lang.String str3 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Comparable<java.lang.String> strComparable10 = null;
        strComparableLFUCache1.put(strComparable10, "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str20 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str31 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str33 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str38 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
    }

    @Test
    public void test3525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3525");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        java.lang.String str6 = strComparableLFUCache1.get(strComparable5);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str11 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str16 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test3526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3526");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 10);
        java.lang.String str3 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str11 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str13 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass14 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3527");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        java.lang.String str3 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str8 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str10 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test3528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3528");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        java.lang.String str3 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Comparable<java.lang.String> strComparable10 = null;
        strComparableLFUCache1.put(strComparable10, "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str20 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Class<?> wildcardClass27 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test3529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3529");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str12 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str17 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str28 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass29 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test3530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3530");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str9 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str14 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.Comparable<java.lang.String> strComparable18 = null;
        strComparableLFUCache1.put(strComparable18, "");
        java.lang.String str22 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str24 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str29 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str31 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str33 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str35 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass36 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test3531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3531");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str6 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str8 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str13 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str15 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.Comparable<java.lang.String> strComparable25 = null;
        strComparableLFUCache1.put(strComparable25, "hi!");
        java.lang.String str29 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str29);
    }

    @Test
    public void test3532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3532");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str6 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str8 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str16 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.Class<?> wildcardClass29 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test3533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3533");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str6 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str8 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.Comparable<java.lang.String> strComparable12 = null;
        java.lang.String str13 = strComparableLFUCache1.get(strComparable12);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Comparable<java.lang.String> strComparable17 = null;
        strComparableLFUCache1.put(strComparable17, "");
        java.lang.String str21 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test3534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3534");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str9 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str14 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.Comparable<java.lang.String> strComparable18 = null;
        strComparableLFUCache1.put(strComparable18, "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str34 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str36 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
    }

    @Test
    public void test3535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3535");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        java.lang.String str3 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str8 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str10 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str12 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str14 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test3536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3536");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str6 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str8 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str13 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str15 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.Comparable<java.lang.String> strComparable25 = null;
        strComparableLFUCache1.put(strComparable25, "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.Class<?> wildcardClass31 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test3537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3537");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        java.lang.String str3 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str5 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str13 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test3538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3538");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.constant.Constable, java.lang.Comparable<java.lang.String>> constableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.constant.Constable, java.lang.Comparable<java.lang.String>>((java.lang.Integer) 10);
    }

    @Test
    public void test3539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3539");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Class<?>, java.lang.Object> wildcardClassLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Class<?>, java.lang.Object>((java.lang.Integer) 0);
        java.lang.Class<?> wildcardClass2 = wildcardClassLFUCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test3540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3540");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str9 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str14 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str16 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str18 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str20 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str22 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.Class<?> wildcardClass26 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test3541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3541");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str9 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str14 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str19 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str21 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str23 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str28 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str33 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.Class<?> wildcardClass37 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test3542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3542");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        java.lang.String str3 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable4 = null;
        java.lang.String str5 = strComparableLFUCache1.get(strComparable4);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str10 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass11 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3543");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        java.lang.String str3 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str11 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str13 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str21 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test3544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3544");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        java.lang.String str3 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str5 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str7 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str9 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str11 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str13 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str15 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test3545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3545");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.invoke.TypeDescriptor, java.lang.constant.Constable> typeDescriptorLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.invoke.TypeDescriptor, java.lang.constant.Constable>((java.lang.Integer) 100);
        java.lang.Class<?> wildcardClass2 = typeDescriptorLFUCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test3546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3546");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str9 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str14 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.Comparable<java.lang.String> strComparable18 = null;
        strComparableLFUCache1.put(strComparable18, "");
        java.lang.Comparable<java.lang.String> strComparable21 = null;
        strComparableLFUCache1.put(strComparable21, "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str31 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable32 = null;
        strComparableLFUCache1.put(strComparable32, "");
        java.lang.String str36 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str41 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str46 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertNull(str46);
    }

    @Test
    public void test3547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3547");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str6 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str8 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str10 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str12 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str17 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable18 = null;
        java.lang.String str19 = strComparableLFUCache1.get(strComparable18);
        java.lang.String str21 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test3548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3548");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str9 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str14 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str19 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str21 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str23 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str25 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str30 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str32 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str43 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass44 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test3549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3549");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str9 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str14 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str19 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test3550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3550");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str9 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str17 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Comparable<java.lang.String> strComparable39 = null;
        java.lang.String str40 = strComparableLFUCache1.get(strComparable39);
        java.lang.Class<?> wildcardClass41 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test3551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3551");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str12 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str17 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test3552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3552");
        com.thealgorithms.datastructures.caches.LFUCache<com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>, java.lang.reflect.AnnotatedElement> strComparableLFUCacheLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>, java.lang.reflect.AnnotatedElement>((java.lang.Integer) 1);
    }

    @Test
    public void test3553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3553");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str9 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str14 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.Comparable<java.lang.String> strComparable18 = null;
        strComparableLFUCache1.put(strComparable18, "");
        java.lang.String str22 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str24 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str32 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass33 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test3554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3554");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str6 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str8 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str19 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass20 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3555");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str12 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str14 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str16 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str30 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable31 = null;
        strComparableLFUCache1.put(strComparable31, "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str38 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
    }

    @Test
    public void test3556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3556");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str15 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass16 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3557");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        java.lang.String str3 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str11 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str13 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Class<?> wildcardClass17 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3558");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str12 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str14 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str19 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str24 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test3559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3559");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str9 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.Class<?> wildcardClass16 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3560");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str12 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str17 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str28 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str30 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str32 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(str32);
    }

    @Test
    public void test3561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3561");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str9 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str14 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str16 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str24 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass25 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3562");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str9 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str14 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.Comparable<java.lang.String> strComparable18 = null;
        strComparableLFUCache1.put(strComparable18, "");
        java.lang.Comparable<java.lang.String> strComparable21 = null;
        strComparableLFUCache1.put(strComparable21, "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str31 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str33 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str44 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str52 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass53 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!" + "'", str44, "hi!");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertNotNull(wildcardClass53);
    }

    @Test
    public void test3563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3563");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        java.lang.String str6 = strComparableLFUCache1.get(strComparable5);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str11 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str13 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test3564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3564");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        java.lang.String str3 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Comparable<java.lang.String> strComparable10 = null;
        strComparableLFUCache1.put(strComparable10, "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str20 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Class<?> wildcardClass24 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test3565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3565");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str6 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str8 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str10 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.Class<?> wildcardClass17 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3566");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 10);
        java.lang.String str3 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str8 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable9 = null;
        java.lang.String str10 = strComparableLFUCache1.get(strComparable9);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str18 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str20 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str22 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test3567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3567");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        java.lang.String str3 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str8 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Class<?> wildcardClass15 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3568");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        java.lang.String str3 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Class<?> wildcardClass16 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3569");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.CharSequence, java.lang.constant.Constable> charSequenceLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.CharSequence, java.lang.constant.Constable>((java.lang.Integer) 100);
        java.lang.Class<?> wildcardClass2 = charSequenceLFUCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test3570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3570");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str6 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str8 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str16 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str21 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str29 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str31 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNull(str31);
    }

    @Test
    public void test3571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3571");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str18 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str20 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test3572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3572");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str12 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str20 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str40 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
    }

    @Test
    public void test3573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3573");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str9 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str14 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.Comparable<java.lang.String> strComparable18 = null;
        strComparableLFUCache1.put(strComparable18, "");
        java.lang.String str22 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str24 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.Class<?> wildcardClass37 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test3574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3574");
        com.thealgorithms.datastructures.caches.LFUCache<com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>, java.lang.String> strComparableLFUCacheLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>, java.lang.String>((java.lang.Integer) (-1));
    }

    @Test
    public void test3575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3575");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str6 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str11 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str16 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test3576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3576");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 100);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str12 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str14 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str16 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test3577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3577");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str6 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str8 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str16 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.Comparable<java.lang.String> strComparable26 = null;
        java.lang.String str27 = strComparableLFUCache1.get(strComparable26);
        java.lang.Class<?> wildcardClass28 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test3578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3578");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str9 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str14 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.Comparable<java.lang.String> strComparable18 = null;
        strComparableLFUCache1.put(strComparable18, "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str25 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.Class<?> wildcardClass29 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test3579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3579");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str9 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str14 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.Comparable<java.lang.String> strComparable18 = null;
        strComparableLFUCache1.put(strComparable18, "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str34 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str36 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.Class<?> wildcardClass40 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test3580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3580");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str12 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str20 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str28 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str30 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str32 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass33 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test3581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3581");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        java.lang.String str3 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Comparable<java.lang.String> strComparable10 = null;
        strComparableLFUCache1.put(strComparable10, "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str20 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str31 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str36 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
    }

    @Test
    public void test3582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3582");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str9 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str14 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str16 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Class<?> wildcardClass23 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3583");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 10);
        java.lang.String str3 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str11 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str13 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test3584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3584");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        java.lang.String str3 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str5 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str7 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str12 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass13 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3585");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str9 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Comparable<java.lang.String> strComparable16 = null;
        strComparableLFUCache1.put(strComparable16, "hi!");
        java.lang.String str20 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.Comparable<java.lang.String> strComparable30 = null;
        strComparableLFUCache1.put(strComparable30, "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test3586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3586");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 100);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.Comparable<java.lang.String> strComparable8 = null;
        java.lang.String str9 = strComparableLFUCache1.get(strComparable8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test3587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3587");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str9 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str14 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Comparable<java.lang.String> strComparable18 = null;
        strComparableLFUCache1.put(strComparable18, "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.Class<?> wildcardClass27 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test3588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3588");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str9 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str14 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str31 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass32 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test3589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3589");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str9 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str14 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str25 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str27 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.Class<?> wildcardClass31 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test3590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3590");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str12 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str14 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable15 = null;
        java.lang.String str16 = strComparableLFUCache1.get(strComparable15);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Class<?> wildcardClass29 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test3591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3591");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Class<?>, java.lang.Object> wildcardClassLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Class<?>, java.lang.Object>((java.lang.Integer) (-1));
        java.lang.Class<?> wildcardClass2 = wildcardClassLFUCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test3592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3592");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str6 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str8 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str13 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str21 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str26 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
    }

    @Test
    public void test3593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3593");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.Comparable<java.lang.String> strComparable20 = null;
        strComparableLFUCache1.put(strComparable20, "");
        java.lang.String str24 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test3594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3594");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str12 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str17 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test3595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3595");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str6 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str8 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str10 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str15 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable16 = null;
        java.lang.String str17 = strComparableLFUCache1.get(strComparable16);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test3596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3596");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str6 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str8 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str10 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str15 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str17 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str19 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str24 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test3597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3597");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 10);
        java.lang.String str3 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str11 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str13 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.Comparable<java.lang.String> strComparable20 = null;
        strComparableLFUCache1.put(strComparable20, "hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test3598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3598");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str6 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str8 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str10 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str12 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str17 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str19 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.Class<?> wildcardClass23 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3599");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str9 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str20 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str22 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test3600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3600");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str18 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str20 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass21 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3601");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str6 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str8 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str10 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str15 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str17 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str19 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str21 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str26 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
    }

    @Test
    public void test3602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3602");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        java.lang.String str3 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str11 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str13 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str21 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str26 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
    }

    @Test
    public void test3603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3603");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str9 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str23 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.Class<?> wildcardClass33 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test3604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3604");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 10);
        java.lang.String str3 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str5 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str10 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable11 = null;
        strComparableLFUCache1.put(strComparable11, "");
        java.lang.String str15 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test3605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3605");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str9 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Comparable<java.lang.String> strComparable16 = null;
        strComparableLFUCache1.put(strComparable16, "hi!");
        java.lang.Comparable<java.lang.String> strComparable19 = null;
        java.lang.String str20 = strComparableLFUCache1.get(strComparable19);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str28 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass29 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test3606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3606");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str6 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str8 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str16 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test3607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3607");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str9 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str14 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str19 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str21 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str23 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass24 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test3608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3608");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str9 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str14 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str19 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str24 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str26 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str31 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str33 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
    }

    @Test
    public void test3609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3609");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str6 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str8 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str13 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str18 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str23 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass24 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test3610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3610");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str12 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str14 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str19 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str21 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str23 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str25 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str27 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertNull(str27);
    }

    @Test
    public void test3611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3611");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str6 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str8 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str16 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str21 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str23 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str28 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str30 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str32 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass33 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test3612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3612");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) (-1));
        java.lang.String str3 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str5 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str7 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass8 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3613");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str18 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str29 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNull(str29);
    }

    @Test
    public void test3614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3614");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 10);
        java.lang.String str3 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str8 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test3615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3615");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 10);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str12 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test3616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3616");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str9 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Comparable<java.lang.String> strComparable16 = null;
        strComparableLFUCache1.put(strComparable16, "hi!");
        java.lang.String str20 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str31 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str39 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
    }

    @Test
    public void test3617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3617");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str9 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str14 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.Comparable<java.lang.String> strComparable18 = null;
        strComparableLFUCache1.put(strComparable18, "");
        java.lang.Comparable<java.lang.String> strComparable21 = null;
        strComparableLFUCache1.put(strComparable21, "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str28 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str33 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str35 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str37 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
    }

    @Test
    public void test3618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3618");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str6 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str8 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str13 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Class<?> wildcardClass17 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3619");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str6 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str8 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str10 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test3620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3620");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str9 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str14 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.Comparable<java.lang.String> strComparable18 = null;
        strComparableLFUCache1.put(strComparable18, "");
        java.lang.Comparable<java.lang.String> strComparable21 = null;
        strComparableLFUCache1.put(strComparable21, "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str28 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str33 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str35 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str37 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str39 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
    }

    @Test
    public void test3621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3621");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        java.lang.String str3 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str8 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str10 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str15 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str26 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str28 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str30 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str32 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass33 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test3622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3622");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        java.lang.String str3 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str8 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str10 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str15 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str17 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str19 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str21 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test3623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3623");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str9 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str14 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.Comparable<java.lang.String> strComparable18 = null;
        strComparableLFUCache1.put(strComparable18, "");
        java.lang.Comparable<java.lang.String> strComparable21 = null;
        strComparableLFUCache1.put(strComparable21, "");
        java.lang.String str25 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str27 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str32 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass33 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test3624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3624");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str9 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str14 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.Comparable<java.lang.String> strComparable18 = null;
        strComparableLFUCache1.put(strComparable18, "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str25 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str27 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass28 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test3625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3625");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str9 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Comparable<java.lang.String> strComparable16 = null;
        strComparableLFUCache1.put(strComparable16, "hi!");
        java.lang.String str20 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str28 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
    }

    @Test
    public void test3626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3626");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str15 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str17 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str19 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str21 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable22 = null;
        strComparableLFUCache1.put(strComparable22, "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str29 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass30 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test3627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3627");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 10);
        java.lang.String str3 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str5 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.Class<?> wildcardClass12 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3628");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str9 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str14 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.Comparable<java.lang.String> strComparable18 = null;
        strComparableLFUCache1.put(strComparable18, "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str34 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str36 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
    }

    @Test
    public void test3629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3629");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str9 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str17 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str31 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.Comparable<java.lang.String> strComparable38 = null;
        strComparableLFUCache1.put(strComparable38, "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str45 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
    }

    @Test
    public void test3630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3630");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        java.lang.String str3 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str11 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str16 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str21 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str23 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test3631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3631");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str9 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str14 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str19 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str21 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str23 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str25 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str30 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str32 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(str32);
    }

    @Test
    public void test3632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3632");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str9 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str14 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.Comparable<java.lang.String> strComparable18 = null;
        strComparableLFUCache1.put(strComparable18, "");
        java.lang.Comparable<java.lang.String> strComparable21 = null;
        strComparableLFUCache1.put(strComparable21, "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.Comparable<java.lang.String> strComparable33 = null;
        strComparableLFUCache1.put(strComparable33, "");
        java.lang.String str37 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str37);
    }

    @Test
    public void test3633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3633");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str6 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str8 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str13 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Class<?> wildcardClass20 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3634");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        java.lang.String str3 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str8 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable9 = null;
        strComparableLFUCache1.put(strComparable9, "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str22 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable23 = null;
        strComparableLFUCache1.put(strComparable23, "hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test3635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3635");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str6 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str8 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str13 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str24 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test3636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3636");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str6 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str8 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str10 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str15 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str23 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass24 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test3637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3637");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str9 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str14 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str19 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.Class<?> wildcardClass29 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test3638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3638");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str6 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str8 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str13 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.Class<?> wildcardClass20 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3639");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str9 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str14 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str19 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str27 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str29 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
    }

    @Test
    public void test3640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3640");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.reflect.AnnotatedElement, java.lang.CharSequence> annotatedElementLFUCache0 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.reflect.AnnotatedElement, java.lang.CharSequence>();
        java.lang.Class<?> wildcardClass1 = annotatedElementLFUCache0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test3641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3641");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        java.lang.String str3 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Comparable<java.lang.String> strComparable10 = null;
        strComparableLFUCache1.put(strComparable10, "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str20 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str28 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNull(str28);
    }

    @Test
    public void test3642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3642");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        java.lang.String str3 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str11 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str13 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str18 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str23 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
    }

    @Test
    public void test3643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3643");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str9 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Comparable<java.lang.String> strComparable16 = null;
        strComparableLFUCache1.put(strComparable16, "hi!");
        java.lang.String str20 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str22 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str27 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass28 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test3644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3644");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str12 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str14 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable15 = null;
        java.lang.String str16 = strComparableLFUCache1.get(strComparable15);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str24 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test3645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3645");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        java.lang.String str3 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str11 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str13 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test3646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3646");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str6 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable7 = null;
        strComparableLFUCache1.put(strComparable7, "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str14 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str16 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str21 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str26 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass27 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test3647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3647");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str9 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str14 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.Comparable<java.lang.String> strComparable18 = null;
        strComparableLFUCache1.put(strComparable18, "");
        java.lang.String str22 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str30 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str32 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(str32);
    }

    @Test
    public void test3648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3648");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str9 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str14 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.Comparable<java.lang.String> strComparable18 = null;
        strComparableLFUCache1.put(strComparable18, "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test3649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3649");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str9 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str14 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.Comparable<java.lang.String> strComparable18 = null;
        strComparableLFUCache1.put(strComparable18, "");
        java.lang.Comparable<java.lang.String> strComparable21 = null;
        strComparableLFUCache1.put(strComparable21, "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str31 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str33 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str44 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
    }

    @Test
    public void test3650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3650");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 10);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str9 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str14 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable15 = null;
        strComparableLFUCache1.put(strComparable15, "hi!");
        java.lang.String str19 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str21 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass22 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3651");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str9 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str14 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.Comparable<java.lang.String> strComparable18 = null;
        strComparableLFUCache1.put(strComparable18, "");
        java.lang.Comparable<java.lang.String> strComparable21 = null;
        strComparableLFUCache1.put(strComparable21, "");
        java.lang.String str25 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str27 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str27);
    }

    @Test
    public void test3652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3652");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str6 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable7 = null;
        strComparableLFUCache1.put(strComparable7, "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str14 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str16 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str18 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable19 = null;
        strComparableLFUCache1.put(strComparable19, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test3653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3653");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        java.lang.String str3 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str8 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str10 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str15 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str20 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str25 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test3654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3654");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        java.lang.String str6 = strComparableLFUCache1.get(strComparable5);
        java.lang.Comparable<java.lang.String> strComparable7 = null;
        strComparableLFUCache1.put(strComparable7, "hi!");
        java.lang.String str11 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test3655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3655");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str9 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Comparable<java.lang.String> strComparable16 = null;
        strComparableLFUCache1.put(strComparable16, "hi!");
        java.lang.Comparable<java.lang.String> strComparable19 = null;
        java.lang.String str20 = strComparableLFUCache1.get(strComparable19);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str25 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
    }

    @Test
    public void test3656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3656");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str9 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str14 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.Comparable<java.lang.String> strComparable18 = null;
        strComparableLFUCache1.put(strComparable18, "");
        java.lang.Comparable<java.lang.String> strComparable21 = null;
        strComparableLFUCache1.put(strComparable21, "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str34 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str36 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str38 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str40 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable41 = null;
        strComparableLFUCache1.put(strComparable41, "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNull(str40);
    }

    @Test
    public void test3657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3657");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        java.lang.String str3 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str8 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str10 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str15 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str17 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str19 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test3658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3658");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str12 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str17 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str25 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.Comparable<java.lang.String> strComparable35 = null;
        java.lang.String str36 = strComparableLFUCache1.get(strComparable35);
        java.lang.Class<?> wildcardClass37 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test3659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3659");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.CharSequence, java.lang.reflect.AnnotatedElement> charSequenceLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.CharSequence, java.lang.reflect.AnnotatedElement>((java.lang.Integer) 0);
        java.lang.Class<?> wildcardClass2 = charSequenceLFUCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test3660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3660");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str12 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str14 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str19 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.Comparable<java.lang.String> strComparable23 = null;
        java.lang.String str24 = strComparableLFUCache1.get(strComparable23);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test3661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3661");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str9 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str14 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str22 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str30 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
    }

    @Test
    public void test3662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3662");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        java.lang.String str3 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str11 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str13 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str18 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str20 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test3663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3663");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str9 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str14 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Comparable<java.lang.String> strComparable24 = null;
        strComparableLFUCache1.put(strComparable24, "hi!");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test3664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3664");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str9 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable10 = null;
        java.lang.String str11 = strComparableLFUCache1.get(strComparable10);
        java.lang.String str13 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass14 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3665");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str12 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str14 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str16 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str18 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str20 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Class<?> wildcardClass24 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test3666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3666");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.constant.ConstantDesc> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.constant.ConstantDesc>((java.lang.Integer) (-1));
        java.lang.Class<?> wildcardClass2 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test3667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3667");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.constant.ConstantDesc, java.lang.invoke.TypeDescriptor> constantDescLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.constant.ConstantDesc, java.lang.invoke.TypeDescriptor>((java.lang.Integer) 1);
    }

    @Test
    public void test3668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3668");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        java.lang.String str3 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str8 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test3669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3669");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        java.lang.String str3 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str11 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str16 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str21 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test3670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3670");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 10);
        java.lang.String str3 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str8 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable9 = null;
        java.lang.String str10 = strComparableLFUCache1.get(strComparable9);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str24 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable25 = null;
        strComparableLFUCache1.put(strComparable25, "hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
    }

    @Test
    public void test3671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3671");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str9 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str14 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str19 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str21 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable22 = null;
        strComparableLFUCache1.put(strComparable22, "hi!");
        java.lang.String str26 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(str26);
    }

    @Test
    public void test3672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3672");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str6 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str8 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str16 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str21 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str23 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str25 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str27 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str29 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertNull(str29);
    }

    @Test
    public void test3673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3673");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str6 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str8 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str16 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str21 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.Class<?> wildcardClass34 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test3674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3674");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.invoke.TypeDescriptor, java.lang.reflect.Type> typeDescriptorLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.invoke.TypeDescriptor, java.lang.reflect.Type>((java.lang.Integer) 100);
    }

    @Test
    public void test3675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3675");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str12 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str20 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str31 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str36 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str38 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNull(str38);
    }

    @Test
    public void test3676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3676");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str12 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str14 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str16 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str24 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass25 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3677");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str18 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test3678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3678");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 100);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str9 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str11 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test3679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3679");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str9 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str14 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Class<?> wildcardClass27 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test3680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3680");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str9 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str14 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str16 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str21 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test3681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3681");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        java.lang.String str3 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str8 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str10 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str15 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str17 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str22 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test3682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3682");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.io.Serializable> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.io.Serializable>((java.lang.Integer) 0);
        java.lang.Class<?> wildcardClass2 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test3683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3683");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        java.lang.String str3 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str8 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str10 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str15 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str20 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str22 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test3684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3684");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str12 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str17 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str19 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str30 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str32 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNull(str32);
    }

    @Test
    public void test3685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3685");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        java.lang.String str3 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Comparable<java.lang.String> strComparable10 = null;
        strComparableLFUCache1.put(strComparable10, "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str17 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test3686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3686");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str9 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test3687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3687");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        java.lang.String str6 = strComparableLFUCache1.get(strComparable5);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str11 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str13 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str15 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str17 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.Comparable<java.lang.String> strComparable24 = null;
        strComparableLFUCache1.put(strComparable24, "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test3688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3688");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 10);
        java.lang.String str3 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str17 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test3689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3689");
        com.thealgorithms.datastructures.caches.LFUCache<java.io.Serializable, java.lang.Object> serializableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.io.Serializable, java.lang.Object>((java.lang.Integer) (-1));
    }

    @Test
    public void test3690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3690");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        java.lang.String str3 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str5 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str7 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str12 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str14 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str16 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test3691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3691");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>((java.lang.Integer) (-1));
    }

    @Test
    public void test3692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3692");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str9 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str14 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str19 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str21 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str23 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str25 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.Class<?> wildcardClass29 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test3693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3693");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str9 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str14 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str22 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.Comparable<java.lang.String> strComparable26 = null;
        strComparableLFUCache1.put(strComparable26, "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test3694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3694");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str9 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str17 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str25 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str27 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test3695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3695");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str6 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str8 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.Comparable<java.lang.String> strComparable12 = null;
        java.lang.String str13 = strComparableLFUCache1.get(strComparable12);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.Comparable<java.lang.String> strComparable17 = null;
        java.lang.String str18 = strComparableLFUCache1.get(strComparable17);
        java.lang.String str20 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str22 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test3696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3696");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str9 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str14 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.Comparable<java.lang.String> strComparable18 = null;
        strComparableLFUCache1.put(strComparable18, "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str28 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass29 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test3697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3697");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str9 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str14 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str28 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str30 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(str30);
    }

    @Test
    public void test3698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3698");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        java.lang.String str3 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str11 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str13 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str15 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str17 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.Class<?> wildcardClass24 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test3699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3699");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 10);
        java.lang.String str3 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str5 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str7 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test3700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3700");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str6 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str8 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str13 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str18 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str20 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test3701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3701");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.constant.ConstantDesc, java.lang.CharSequence> constantDescLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.constant.ConstantDesc, java.lang.CharSequence>((java.lang.Integer) 0);
        java.lang.Class<?> wildcardClass2 = constantDescLFUCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test3702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3702");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str9 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str14 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str28 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str30 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str32 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
    }

    @Test
    public void test3703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3703");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str9 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str14 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.Comparable<java.lang.String> strComparable18 = null;
        strComparableLFUCache1.put(strComparable18, "");
        java.lang.Comparable<java.lang.String> strComparable21 = null;
        strComparableLFUCache1.put(strComparable21, "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str31 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str33 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str44 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!" + "'", str44, "hi!");
    }

    @Test
    public void test3704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3704");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str12 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str20 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str25 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.Comparable<java.lang.String> strComparable29 = null;
        java.lang.String str30 = strComparableLFUCache1.get(strComparable29);
        java.lang.String str32 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str37 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str42 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Class<?> wildcardClass46 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test3705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3705");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.Comparable<java.lang.String> strComparable17 = null;
        java.lang.String str18 = strComparableLFUCache1.get(strComparable17);
        java.lang.String str20 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str25 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str30 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str30);
    }

    @Test
    public void test3706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3706");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>((java.lang.Integer) 1);
        java.lang.Class<?> wildcardClass2 = wildcardClassLFUCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test3707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3707");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str12 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str14 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable15 = null;
        java.lang.String str16 = strComparableLFUCache1.get(strComparable15);
        java.lang.Comparable<java.lang.String> strComparable17 = null;
        java.lang.String str18 = strComparableLFUCache1.get(strComparable17);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test3708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3708");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        java.lang.String str3 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str5 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str7 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str9 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str11 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str13 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test3709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3709");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str9 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str14 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.Comparable<java.lang.String> strComparable18 = null;
        strComparableLFUCache1.put(strComparable18, "");
        java.lang.Comparable<java.lang.String> strComparable21 = null;
        strComparableLFUCache1.put(strComparable21, "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str31 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str33 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str38 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str40 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str42 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
    }

    @Test
    public void test3710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3710");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str9 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str17 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test3711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3711");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        java.lang.String str3 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str8 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str10 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str15 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str23 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str28 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
    }

    @Test
    public void test3712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3712");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str9 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str14 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.Comparable<java.lang.String> strComparable18 = null;
        strComparableLFUCache1.put(strComparable18, "");
        java.lang.String str22 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str24 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test3713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3713");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str9 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str14 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable15 = null;
        strComparableLFUCache1.put(strComparable15, "");
        java.lang.String str19 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str24 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass25 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3714");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str12 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str20 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str28 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str33 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str35 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNull(str35);
    }

    @Test
    public void test3715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3715");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str9 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str14 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.Comparable<java.lang.String> strComparable18 = null;
        strComparableLFUCache1.put(strComparable18, "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str25 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str27 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Class<?> wildcardClass31 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test3716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3716");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str9 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str14 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str16 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str18 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.Class<?> wildcardClass25 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3717");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        java.lang.String str3 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str8 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str10 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str15 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.Comparable<java.lang.String> strComparable22 = null;
        java.lang.String str23 = strComparableLFUCache1.get(strComparable22);
        java.lang.Class<?> wildcardClass24 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test3718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3718");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str12 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str14 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str16 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str24 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str26 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str34 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(str34);
    }

    @Test
    public void test3719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3719");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str9 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str17 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str19 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str21 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str23 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass24 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test3720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3720");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        java.lang.String str3 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Comparable<java.lang.String> strComparable10 = null;
        strComparableLFUCache1.put(strComparable10, "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str20 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Comparable<java.lang.String> strComparable27 = null;
        strComparableLFUCache1.put(strComparable27, "hi!");
        java.lang.String str31 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNull(str31);
    }

    @Test
    public void test3721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3721");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str9 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str14 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str25 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str30 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass31 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test3722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3722");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str9 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Comparable<java.lang.String> strComparable16 = null;
        strComparableLFUCache1.put(strComparable16, "hi!");
        java.lang.String str20 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str31 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.Class<?> wildcardClass38 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test3723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3723");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        java.lang.String str3 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Comparable<java.lang.String> strComparable10 = null;
        strComparableLFUCache1.put(strComparable10, "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str26 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable27 = null;
        java.lang.String str28 = strComparableLFUCache1.get(strComparable27);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertNull(str28);
    }

    @Test
    public void test3724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3724");
        com.thealgorithms.datastructures.caches.LFUCache<com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>, java.lang.reflect.AnnotatedElement> strComparableLFUCacheLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>, java.lang.reflect.AnnotatedElement>((java.lang.Integer) (-1));
    }

    @Test
    public void test3725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3725");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Object, java.lang.reflect.GenericDeclaration> objLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Object, java.lang.reflect.GenericDeclaration>((java.lang.Integer) 1);
    }

    @Test
    public void test3726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3726");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        java.lang.String str3 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str8 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable9 = null;
        strComparableLFUCache1.put(strComparable9, "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test3727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3727");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        java.lang.String str3 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str5 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str7 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str15 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test3728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3728");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        java.lang.String str6 = strComparableLFUCache1.get(strComparable5);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str11 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test3729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3729");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str12 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str17 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Class<?> wildcardClass33 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test3730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3730");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str6 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str8 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str13 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Comparable<java.lang.String> strComparable23 = null;
        strComparableLFUCache1.put(strComparable23, "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str30 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
    }

    @Test
    public void test3731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3731");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str9 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str14 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str28 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str30 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str35 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str37 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
    }

    @Test
    public void test3732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3732");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str6 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str8 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str13 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str18 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str20 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass21 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3733");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        java.lang.String str3 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str5 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str7 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test3734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3734");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str9 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str14 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str19 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str30 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str32 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertNull(str32);
    }

    @Test
    public void test3735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3735");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str12 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str14 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str16 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str27 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable28 = null;
        strComparableLFUCache1.put(strComparable28, "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.Class<?> wildcardClass34 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test3736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3736");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.reflect.Type, java.lang.Class<?>> typeLFUCache0 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.reflect.Type, java.lang.Class<?>>();
        java.lang.Class<?> wildcardClass1 = typeLFUCache0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test3737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3737");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.reflect.AnnotatedElement, java.lang.reflect.AnnotatedElement> annotatedElementLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.reflect.AnnotatedElement, java.lang.reflect.AnnotatedElement>((java.lang.Integer) 100);
    }

    @Test
    public void test3738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3738");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str9 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str14 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.Comparable<java.lang.String> strComparable18 = null;
        strComparableLFUCache1.put(strComparable18, "");
        java.lang.Comparable<java.lang.String> strComparable21 = null;
        strComparableLFUCache1.put(strComparable21, "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str31 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str33 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str50 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "hi!" + "'", str50, "hi!");
    }

    @Test
    public void test3739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3739");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 10);
        java.lang.String str3 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str8 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable9 = null;
        java.lang.String str10 = strComparableLFUCache1.get(strComparable9);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.Class<?> wildcardClass23 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3740");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 10);
        java.lang.String str3 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str8 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable9 = null;
        java.lang.String str10 = strComparableLFUCache1.get(strComparable9);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str18 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str20 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test3741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3741");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        java.lang.String str3 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str5 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test3742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3742");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str12 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str14 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str16 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str24 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str29 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertNull(str29);
    }

    @Test
    public void test3743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3743");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str9 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str14 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.Comparable<java.lang.String> strComparable18 = null;
        strComparableLFUCache1.put(strComparable18, "");
        java.lang.Comparable<java.lang.String> strComparable21 = null;
        strComparableLFUCache1.put(strComparable21, "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str31 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str33 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertNull(str33);
    }

    @Test
    public void test3744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3744");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 10);
        java.lang.String str3 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str8 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str19 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str21 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str23 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test3745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3745");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str9 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str14 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.Comparable<java.lang.String> strComparable18 = null;
        strComparableLFUCache1.put(strComparable18, "");
        java.lang.Comparable<java.lang.String> strComparable21 = null;
        strComparableLFUCache1.put(strComparable21, "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str31 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str33 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass34 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test3746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3746");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 10);
        java.lang.String str3 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str8 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str13 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str15 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str17 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str19 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str21 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test3747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3747");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str9 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str14 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.Comparable<java.lang.String> strComparable18 = null;
        strComparableLFUCache1.put(strComparable18, "");
        java.lang.String str22 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str27 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str29 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass30 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test3748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3748");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str6 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str8 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str10 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str15 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str17 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable18 = null;
        java.lang.String str19 = strComparableLFUCache1.get(strComparable18);
        java.lang.String str21 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass22 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3749");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 10);
        java.lang.String str3 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str5 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str7 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str18 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test3750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3750");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str9 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str14 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.Comparable<java.lang.String> strComparable18 = null;
        strComparableLFUCache1.put(strComparable18, "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str31 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable32 = null;
        strComparableLFUCache1.put(strComparable32, "");
        java.lang.String str36 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str38 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.Class<?> wildcardClass45 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test3751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3751");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str12 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.Comparable<java.lang.String> strComparable19 = null;
        strComparableLFUCache1.put(strComparable19, "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str26 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.Class<?> wildcardClass33 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test3752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3752");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str6 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str8 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str16 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str21 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.Class<?> wildcardClass31 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test3753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3753");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str6 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str8 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str13 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test3754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3754");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str6 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str8 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str16 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str21 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str23 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.Comparable<java.lang.String> strComparable30 = null;
        java.lang.String str31 = strComparableLFUCache1.get(strComparable30);
        java.lang.Class<?> wildcardClass32 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test3755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3755");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        java.lang.String str3 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str11 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test3756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3756");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str9 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str14 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str19 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str21 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str23 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str28 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test3757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3757");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        java.lang.String str3 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str5 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str7 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str21 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test3758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3758");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str9 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str14 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.Comparable<java.lang.String> strComparable18 = null;
        strComparableLFUCache1.put(strComparable18, "");
        java.lang.Comparable<java.lang.String> strComparable21 = null;
        strComparableLFUCache1.put(strComparable21, "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str31 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str33 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNull(str33);
    }

    @Test
    public void test3759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3759");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str12 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str20 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str25 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str33 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str38 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str40 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str45 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass46 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test3760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3760");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.Class<?> wildcardClass5 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3761");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        java.lang.String str3 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str5 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str7 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str12 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str14 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test3762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3762");
        com.thealgorithms.datastructures.caches.LFUCache<com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>, com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>> strComparableLFUCacheLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>, com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>>((java.lang.Integer) (-1));
    }

    @Test
    public void test3763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3763");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str12 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str17 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test3764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3764");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        java.lang.String str3 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Comparable<java.lang.String> strComparable10 = null;
        strComparableLFUCache1.put(strComparable10, "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str17 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str22 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.Class<?> wildcardClass26 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test3765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3765");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 10);
        java.lang.String str3 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str8 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str25 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
    }

    @Test
    public void test3766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3766");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str12 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str20 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str25 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass26 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test3767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3767");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str12 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str17 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str19 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str21 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str26 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test3768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3768");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        java.lang.String str6 = strComparableLFUCache1.get(strComparable5);
        java.lang.String str8 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass9 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3769");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 10);
        java.lang.String str3 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str8 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str13 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str15 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str17 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable18 = null;
        java.lang.String str19 = strComparableLFUCache1.get(strComparable18);
        java.lang.String str21 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test3770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3770");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        java.lang.String str3 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str5 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str7 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str12 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test3771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3771");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str9 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str20 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.Class<?> wildcardClass27 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test3772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3772");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str9 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str14 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str16 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test3773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3773");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        java.lang.String str3 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Comparable<java.lang.String> strComparable10 = null;
        strComparableLFUCache1.put(strComparable10, "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str23 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass24 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test3774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3774");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str12 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str20 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str31 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str33 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str35 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str37 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str39 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
    }

    @Test
    public void test3775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3775");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str12 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str17 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str25 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass26 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test3776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3776");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.Comparable<java.lang.String> strComparable20 = null;
        strComparableLFUCache1.put(strComparable20, "");
        java.lang.String str24 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass25 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3777");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str9 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str26 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Comparable<java.lang.String> strComparable30 = null;
        java.lang.String str31 = strComparableLFUCache1.get(strComparable30);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Class<?> wildcardClass38 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test3778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3778");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str9 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str14 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str22 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str24 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str29 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass30 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test3779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3779");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.invoke.TypeDescriptor, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>> typeDescriptorLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.invoke.TypeDescriptor, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>((java.lang.Integer) 10);
        java.lang.Class<?> wildcardClass2 = typeDescriptorLFUCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test3780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3780");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str9 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str14 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str25 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str30 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
    }

    @Test
    public void test3781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3781");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str9 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str14 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str19 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.Class<?> wildcardClass32 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test3782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3782");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        java.lang.String str3 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str8 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable9 = null;
        strComparableLFUCache1.put(strComparable9, "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str22 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test3783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3783");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        java.lang.String str3 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Comparable<java.lang.String> strComparable10 = null;
        strComparableLFUCache1.put(strComparable10, "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str20 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str31 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass32 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test3784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3784");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        java.lang.String str3 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Comparable<java.lang.String> strComparable10 = null;
        strComparableLFUCache1.put(strComparable10, "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str20 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str31 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str36 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass37 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test3785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3785");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        java.lang.String str3 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str8 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str10 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str15 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str17 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str19 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str33 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
    }

    @Test
    public void test3786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3786");
        com.thealgorithms.datastructures.caches.LFUCache<java.io.Serializable, java.lang.reflect.Type> serializableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.io.Serializable, java.lang.reflect.Type>((java.lang.Integer) 1);
        java.lang.Class<?> wildcardClass2 = serializableLFUCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test3787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3787");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        java.lang.String str3 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str11 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str16 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str21 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str26 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNull(str26);
    }

    @Test
    public void test3788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3788");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        java.lang.String str3 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str8 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable9 = null;
        strComparableLFUCache1.put(strComparable9, "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test3789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3789");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str9 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str14 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.Comparable<java.lang.String> strComparable18 = null;
        strComparableLFUCache1.put(strComparable18, "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str25 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str30 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass31 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test3790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3790");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str12 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str20 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str25 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str33 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNull(str33);
    }

    @Test
    public void test3791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3791");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str9 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str14 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.Comparable<java.lang.String> strComparable18 = null;
        strComparableLFUCache1.put(strComparable18, "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str37 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str39 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.Class<?> wildcardClass43 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test3792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3792");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        java.lang.String str3 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str5 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str10 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str12 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str17 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass18 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3793");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str9 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str17 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str22 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test3794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3794");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str9 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Comparable<java.lang.String> strComparable16 = null;
        strComparableLFUCache1.put(strComparable16, "hi!");
        java.lang.String str20 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str22 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str27 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str27);
    }

    @Test
    public void test3795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3795");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str18 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str20 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str22 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str24 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test3796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3796");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str9 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test3797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3797");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str12 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str14 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str16 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str18 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str20 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str22 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str24 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str26 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str28 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test3798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3798");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        java.lang.String str3 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Comparable<java.lang.String> strComparable10 = null;
        strComparableLFUCache1.put(strComparable10, "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str20 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str25 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str30 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str32 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str34 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
    }

    @Test
    public void test3799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3799");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str6 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str8 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str10 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable11 = null;
        java.lang.String str12 = strComparableLFUCache1.get(strComparable11);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str17 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str19 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass20 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3800");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str9 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str14 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str16 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str18 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str20 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str22 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str24 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str29 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
    }

    @Test
    public void test3801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3801");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str9 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str14 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test3802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3802");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str6 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str8 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str16 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str21 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str23 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str28 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test3803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3803");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.constant.Constable, com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>> constableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.constant.Constable, com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>>((java.lang.Integer) 1);
    }

    @Test
    public void test3804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3804");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 10);
        java.lang.String str3 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str17 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test3805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3805");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str9 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str17 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str19 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass20 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3806");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str9 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str14 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.Comparable<java.lang.String> strComparable18 = null;
        strComparableLFUCache1.put(strComparable18, "");
        java.lang.Comparable<java.lang.String> strComparable21 = null;
        strComparableLFUCache1.put(strComparable21, "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str31 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable32 = null;
        strComparableLFUCache1.put(strComparable32, "");
        java.lang.String str36 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str38 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNull(str38);
    }

    @Test
    public void test3807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3807");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        java.lang.String str3 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Comparable<java.lang.String> strComparable10 = null;
        strComparableLFUCache1.put(strComparable10, "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str17 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.Comparable<java.lang.String> strComparable24 = null;
        java.lang.String str25 = strComparableLFUCache1.get(strComparable24);
        java.lang.Class<?> wildcardClass26 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test3808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3808");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str6 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str8 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str10 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str15 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str17 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str19 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str27 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNull(str27);
    }

    @Test
    public void test3809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3809");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        java.lang.String str6 = strComparableLFUCache1.get(strComparable5);
        java.lang.Comparable<java.lang.String> strComparable7 = null;
        strComparableLFUCache1.put(strComparable7, "");
        java.lang.String str11 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.Class<?> wildcardClass18 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3810");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        java.lang.String str3 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str17 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass18 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3811");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str9 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str14 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.Comparable<java.lang.String> strComparable24 = null;
        strComparableLFUCache1.put(strComparable24, "hi!");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test3812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3812");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        java.lang.String str3 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str5 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str7 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str12 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str14 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test3813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3813");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str9 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Comparable<java.lang.String> strComparable16 = null;
        strComparableLFUCache1.put(strComparable16, "hi!");
        java.lang.String str20 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test3814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3814");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 10);
        java.lang.String str3 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str8 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable9 = null;
        java.lang.String str10 = strComparableLFUCache1.get(strComparable9);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str18 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str20 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass21 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3815");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str12 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str14 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str19 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str24 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass25 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3816");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str9 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str17 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.Class<?> wildcardClass21 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3817");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str6 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str8 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str13 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str15 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str17 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str22 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass23 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3818");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str9 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str20 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str22 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass23 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3819");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        java.lang.String str3 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str8 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable9 = null;
        strComparableLFUCache1.put(strComparable9, "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str22 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.Comparable<java.lang.String> strComparable26 = null;
        strComparableLFUCache1.put(strComparable26, "hi!");
        java.lang.Class<?> wildcardClass29 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test3820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3820");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        java.lang.String str3 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str8 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str10 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str15 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str17 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str19 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str21 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str29 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str31 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass32 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test3821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3821");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        java.lang.String str3 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str5 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str7 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.Comparable<java.lang.String> strComparable11 = null;
        strComparableLFUCache1.put(strComparable11, "");
        java.lang.Class<?> wildcardClass14 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3822");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str9 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str14 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str19 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Class<?> wildcardClass26 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test3823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3823");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str9 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str14 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str19 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str24 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str26 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str28 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str30 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(str30);
    }

    @Test
    public void test3824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3824");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str9 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Class<?> wildcardClass13 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3825");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str6 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str14 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass15 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3826");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str12 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str20 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test3827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3827");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        java.lang.String str3 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str11 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str16 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str21 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str26 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass27 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test3828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3828");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str9 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str14 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str16 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str18 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test3829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3829");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str12 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str14 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str16 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str18 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test3830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3830");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str6 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str8 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str16 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str21 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str23 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test3831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3831");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str12 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str20 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str22 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str27 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str32 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
    }

    @Test
    public void test3832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3832");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str24 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
    }

    @Test
    public void test3833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3833");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 100);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str12 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str14 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test3834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3834");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str6 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str8 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str16 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str27 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str29 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
    }

    @Test
    public void test3835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3835");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str12 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str20 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str25 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str27 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.Class<?> wildcardClass37 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test3836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3836");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str12 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str20 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str25 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.Comparable<java.lang.String> strComparable29 = null;
        java.lang.String str30 = strComparableLFUCache1.get(strComparable29);
        java.lang.String str32 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str37 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str39 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str44 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass45 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test3837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3837");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str12 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str23 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str25 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass26 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test3838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3838");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str12 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str20 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str22 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test3839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3839");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        java.lang.String str3 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str8 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str10 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str15 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str17 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str19 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test3840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3840");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str6 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str8 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str16 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str21 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str29 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass30 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test3841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3841");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str9 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str14 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.Comparable<java.lang.String> strComparable18 = null;
        strComparableLFUCache1.put(strComparable18, "");
        java.lang.Comparable<java.lang.String> strComparable21 = null;
        strComparableLFUCache1.put(strComparable21, "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str34 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
    }

    @Test
    public void test3842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3842");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 100);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str12 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str17 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str22 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str24 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str26 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test3843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3843");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.constant.Constable, java.lang.CharSequence> constableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.constant.Constable, java.lang.CharSequence>((java.lang.Integer) 0);
    }

    @Test
    public void test3844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3844");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.constant.Constable, java.lang.reflect.AnnotatedElement> constableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.constant.Constable, java.lang.reflect.AnnotatedElement>((java.lang.Integer) 100);
    }

    @Test
    public void test3845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3845");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str9 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str14 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str19 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str21 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str23 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str25 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str30 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass31 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test3846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3846");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str6 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str8 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str16 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str27 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str35 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str37 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
    }

    @Test
    public void test3847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3847");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str6 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str8 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str10 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str18 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass19 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3848");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str24 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str26 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str28 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str30 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertNull(str30);
    }

    @Test
    public void test3849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3849");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str9 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str14 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.Comparable<java.lang.String> strComparable18 = null;
        strComparableLFUCache1.put(strComparable18, "");
        java.lang.Comparable<java.lang.String> strComparable21 = null;
        strComparableLFUCache1.put(strComparable21, "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str31 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Class<?> wildcardClass38 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test3850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3850");
        com.thealgorithms.datastructures.caches.LFUCache<java.io.Serializable, java.lang.invoke.TypeDescriptor> serializableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.io.Serializable, java.lang.invoke.TypeDescriptor>((java.lang.Integer) (-1));
    }

    @Test
    public void test3851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3851");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str9 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str11 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str16 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test3852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3852");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str9 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str14 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.Comparable<java.lang.String> strComparable18 = null;
        strComparableLFUCache1.put(strComparable18, "");
        java.lang.Comparable<java.lang.String> strComparable21 = null;
        strComparableLFUCache1.put(strComparable21, "hi!");
        java.lang.String str25 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str27 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str27);
    }

    @Test
    public void test3853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3853");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 10);
        java.lang.String str3 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str5 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str7 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass8 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3854");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str6 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str8 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str10 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Comparable<java.lang.String> strComparable14 = null;
        strComparableLFUCache1.put(strComparable14, "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test3855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3855");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str12 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str20 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str25 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.Comparable<java.lang.String> strComparable29 = null;
        java.lang.String str30 = strComparableLFUCache1.get(strComparable29);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str35 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str37 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str39 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
        org.junit.Assert.assertNull(str39);
    }

    @Test
    public void test3856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3856");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str9 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str14 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.Comparable<java.lang.String> strComparable21 = null;
        strComparableLFUCache1.put(strComparable21, "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test3857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3857");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str6 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str8 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str13 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str18 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test3858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3858");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str6 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str8 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str13 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str18 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test3859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3859");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str9 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str14 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.Comparable<java.lang.String> strComparable18 = null;
        strComparableLFUCache1.put(strComparable18, "");
        java.lang.Comparable<java.lang.String> strComparable21 = null;
        strComparableLFUCache1.put(strComparable21, "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.Comparable<java.lang.String> strComparable33 = null;
        strComparableLFUCache1.put(strComparable33, "");
        java.lang.String str37 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str42 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
    }

    @Test
    public void test3860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3860");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 10);
        java.lang.String str3 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.Class<?> wildcardClass13 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3861");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str9 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str17 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str25 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str33 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass34 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test3862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3862");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str9 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str11 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test3863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3863");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str6 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str8 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str10 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str15 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str23 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str25 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass26 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test3864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3864");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 100);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str12 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str23 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test3865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3865");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str9 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str14 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.Comparable<java.lang.String> strComparable18 = null;
        strComparableLFUCache1.put(strComparable18, "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str31 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable32 = null;
        strComparableLFUCache1.put(strComparable32, "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.Class<?> wildcardClass47 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test3866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3866");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str9 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str14 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.Comparable<java.lang.String> strComparable18 = null;
        strComparableLFUCache1.put(strComparable18, "");
        java.lang.Comparable<java.lang.String> strComparable21 = null;
        strComparableLFUCache1.put(strComparable21, "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str28 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str36 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass37 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test3867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3867");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str9 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Comparable<java.lang.String> strComparable16 = null;
        strComparableLFUCache1.put(strComparable16, "hi!");
        java.lang.String str20 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str31 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str33 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.Class<?> wildcardClass37 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test3868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3868");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        java.lang.String str3 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Comparable<java.lang.String> strComparable10 = null;
        strComparableLFUCache1.put(strComparable10, "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str20 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str31 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNull(str31);
    }

    @Test
    public void test3869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3869");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str9 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str14 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str19 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str21 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str23 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str25 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str27 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str29 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str31 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable32 = null;
        strComparableLFUCache1.put(strComparable32, "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNull(str31);
    }

    @Test
    public void test3870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3870");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str12 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str20 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str25 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.Comparable<java.lang.String> strComparable29 = null;
        java.lang.String str30 = strComparableLFUCache1.get(strComparable29);
        java.lang.String str32 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str34 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str39 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str41 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Class<?> wildcardClass45 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test3871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3871");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        java.lang.String str3 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Comparable<java.lang.String> strComparable10 = null;
        strComparableLFUCache1.put(strComparable10, "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str17 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str19 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str27 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str29 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.Class<?> wildcardClass39 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test3872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3872");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 10);
        java.lang.String str3 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str5 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Class<?> wildcardClass9 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3873");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str6 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str8 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str10 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str12 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str14 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str16 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test3874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3874");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 10);
        java.lang.String str3 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str11 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test3875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3875");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 100);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str12 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Class<?> wildcardClass16 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3876");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str6 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str8 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str13 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Comparable<java.lang.String> strComparable23 = null;
        strComparableLFUCache1.put(strComparable23, "hi!");
        java.lang.String str27 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable28 = null;
        strComparableLFUCache1.put(strComparable28, "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.Class<?> wildcardClass34 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test3877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3877");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str6 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str8 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str13 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.Class<?> wildcardClass23 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3878");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str12 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str20 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str22 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str36 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass37 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test3879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3879");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str9 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str11 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str13 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass14 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3880");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        java.lang.String str3 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str8 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable9 = null;
        strComparableLFUCache1.put(strComparable9, "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str22 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test3881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3881");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str9 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str14 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str19 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str24 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str26 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str31 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
    }

    @Test
    public void test3882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3882");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str9 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str14 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str19 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str21 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable22 = null;
        strComparableLFUCache1.put(strComparable22, "hi!");
        java.lang.String str26 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.Comparable<java.lang.String> strComparable30 = null;
        strComparableLFUCache1.put(strComparable30, "");
        java.lang.Class<?> wildcardClass33 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test3883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3883");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str6 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable7 = null;
        strComparableLFUCache1.put(strComparable7, "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str14 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str19 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test3884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3884");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        java.lang.String str3 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str8 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str16 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass17 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3885");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str9 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str14 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.Comparable<java.lang.String> strComparable18 = null;
        strComparableLFUCache1.put(strComparable18, "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str31 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable32 = null;
        strComparableLFUCache1.put(strComparable32, "");
        java.lang.Comparable<java.lang.String> strComparable35 = null;
        strComparableLFUCache1.put(strComparable35, "");
        java.lang.String str39 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertNull(str39);
    }

    @Test
    public void test3886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3886");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str12 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str17 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str19 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test3887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3887");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str9 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str14 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.Comparable<java.lang.String> strComparable18 = null;
        strComparableLFUCache1.put(strComparable18, "");
        java.lang.Comparable<java.lang.String> strComparable21 = null;
        strComparableLFUCache1.put(strComparable21, "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str34 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str39 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str41 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str43 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertNull(str43);
    }

    @Test
    public void test3888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3888");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 10);
        java.lang.String str3 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str11 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str13 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.Class<?> wildcardClass20 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3889");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        java.lang.String str3 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Comparable<java.lang.String> strComparable10 = null;
        java.lang.String str11 = strComparableLFUCache1.get(strComparable10);
        java.lang.String str13 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str18 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str20 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str22 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Class<?> wildcardClass26 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test3890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3890");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str6 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable7 = null;
        strComparableLFUCache1.put(strComparable7, "");
        java.lang.String str11 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str13 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str15 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str17 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test3891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3891");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) (-1));
        java.lang.String str3 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str5 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass6 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3892");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str12 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str20 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str31 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.Class<?> wildcardClass35 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test3893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3893");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str12 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str14 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str16 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test3894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3894");
        com.thealgorithms.datastructures.caches.LFUCache<java.io.Serializable, java.lang.Class<?>> serializableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.io.Serializable, java.lang.Class<?>>((java.lang.Integer) (-1));
        java.lang.Class<?> wildcardClass2 = serializableLFUCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test3895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3895");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str9 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str14 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str19 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str21 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str23 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str25 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass26 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test3896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3896");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str6 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable7 = null;
        strComparableLFUCache1.put(strComparable7, "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str14 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test3897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3897");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 10);
        java.lang.String str3 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str8 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable9 = null;
        java.lang.String str10 = strComparableLFUCache1.get(strComparable9);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str15 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str20 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test3898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3898");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str9 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str14 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str22 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str30 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str32 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass33 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test3899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3899");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str12 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str20 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str25 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str27 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str29 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(str29);
    }

    @Test
    public void test3900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3900");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str12 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str20 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str40 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str42 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str47 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNull(str47);
    }

    @Test
    public void test3901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3901");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Object, java.lang.Comparable<java.lang.String>> objLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Object, java.lang.Comparable<java.lang.String>>((java.lang.Integer) 10);
        java.lang.Class<?> wildcardClass2 = objLFUCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test3902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3902");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str6 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str8 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str16 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str21 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str23 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str25 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str27 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass28 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test3903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3903");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str12 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str14 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str19 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.Comparable<java.lang.String> strComparable23 = null;
        strComparableLFUCache1.put(strComparable23, "hi!");
        java.lang.Class<?> wildcardClass26 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test3904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3904");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str15 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str17 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.Class<?> wildcardClass24 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test3905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3905");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str6 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str8 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str10 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str12 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str17 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass18 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3906");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str9 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str14 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.Comparable<java.lang.String> strComparable18 = null;
        strComparableLFUCache1.put(strComparable18, "");
        java.lang.Comparable<java.lang.String> strComparable21 = null;
        strComparableLFUCache1.put(strComparable21, "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str31 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str33 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str35 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertNull(str35);
    }

    @Test
    public void test3907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3907");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        java.lang.String str6 = strComparableLFUCache1.get(strComparable5);
        java.lang.Comparable<java.lang.String> strComparable7 = null;
        strComparableLFUCache1.put(strComparable7, "");
        java.lang.String str11 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str13 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str15 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.Class<?> wildcardClass19 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3908");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str12 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str20 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str25 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str27 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str32 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str34 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
    }

    @Test
    public void test3909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3909");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str9 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.Class<?> wildcardClass25 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3910");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.reflect.AnnotatedElement, java.lang.reflect.GenericDeclaration> annotatedElementLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.reflect.AnnotatedElement, java.lang.reflect.GenericDeclaration>((java.lang.Integer) 1);
    }

    @Test
    public void test3911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3911");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str6 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str8 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str16 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str21 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str26 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str26);
    }

    @Test
    public void test3912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3912");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str9 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str17 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str25 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.Comparable<java.lang.String> strComparable35 = null;
        java.lang.String str36 = strComparableLFUCache1.get(strComparable35);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str36);
    }

    @Test
    public void test3913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3913");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str9 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str14 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.Comparable<java.lang.String> strComparable18 = null;
        strComparableLFUCache1.put(strComparable18, "");
        java.lang.Comparable<java.lang.String> strComparable21 = null;
        strComparableLFUCache1.put(strComparable21, "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str34 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str39 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNull(str39);
    }

    @Test
    public void test3914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3914");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str18 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Class<?> wildcardClass22 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3915");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 10);
        java.lang.String str3 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str8 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str16 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test3916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3916");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        java.lang.String str3 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str11 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str16 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str21 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable22 = null;
        strComparableLFUCache1.put(strComparable22, "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test3917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3917");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        java.lang.String str3 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Comparable<java.lang.String> strComparable10 = null;
        strComparableLFUCache1.put(strComparable10, "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str20 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str31 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Comparable<java.lang.String> strComparable35 = null;
        strComparableLFUCache1.put(strComparable35, "hi!");
        java.lang.String str39 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNull(str39);
    }

    @Test
    public void test3918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3918");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.CharSequence, java.lang.CharSequence> charSequenceLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.CharSequence, java.lang.CharSequence>((java.lang.Integer) 1);
    }

    @Test
    public void test3919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3919");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str9 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str14 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str19 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str21 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str23 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str28 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str30 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str35 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
    }

    @Test
    public void test3920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3920");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str9 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str11 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str13 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test3921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3921");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str9 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str14 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str19 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str21 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str23 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str28 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str30 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
    }

    @Test
    public void test3922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3922");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str9 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str14 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str16 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str21 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str23 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.Class<?> wildcardClass27 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test3923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3923");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str9 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Comparable<java.lang.String> strComparable16 = null;
        strComparableLFUCache1.put(strComparable16, "hi!");
        java.lang.String str20 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Comparable<java.lang.String> strComparable30 = null;
        java.lang.String str31 = strComparableLFUCache1.get(strComparable30);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str36 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
    }

    @Test
    public void test3924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3924");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str9 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str14 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.Comparable<java.lang.String> strComparable18 = null;
        strComparableLFUCache1.put(strComparable18, "");
        java.lang.String str22 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str24 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str29 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str31 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
    }

    @Test
    public void test3925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3925");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str12 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str17 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable18 = null;
        java.lang.String str19 = strComparableLFUCache1.get(strComparable18);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test3926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3926");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str6 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str8 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str13 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str18 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.Class<?> wildcardClass22 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3927");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.CharSequence, java.lang.constant.Constable> charSequenceLFUCache0 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.CharSequence, java.lang.constant.Constable>();
        java.lang.Class<?> wildcardClass1 = charSequenceLFUCache0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test3928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3928");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.CharSequence, java.lang.Object> charSequenceLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.CharSequence, java.lang.Object>((java.lang.Integer) 100);
    }

    @Test
    public void test3929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3929");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        java.lang.String str3 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str8 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str10 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str15 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test3930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3930");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str12 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str20 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str25 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.Comparable<java.lang.String> strComparable29 = null;
        java.lang.String str30 = strComparableLFUCache1.get(strComparable29);
        java.lang.String str32 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str34 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str39 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str41 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str43 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.Class<?> wildcardClass47 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test3931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3931");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Class<?>, java.lang.invoke.TypeDescriptor> wildcardClassLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Class<?>, java.lang.invoke.TypeDescriptor>((java.lang.Integer) 10);
        java.lang.Class<?> wildcardClass2 = wildcardClassLFUCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test3932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3932");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str9 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str14 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test3933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3933");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 10);
        java.lang.String str3 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str8 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable9 = null;
        java.lang.String str10 = strComparableLFUCache1.get(strComparable9);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str15 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str17 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str22 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test3934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3934");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str12 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str17 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str19 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str30 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass31 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test3935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3935");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        java.lang.String str6 = strComparableLFUCache1.get(strComparable5);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str11 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str13 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str15 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str17 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.Comparable<java.lang.String> strComparable24 = null;
        strComparableLFUCache1.put(strComparable24, "");
        java.lang.Class<?> wildcardClass27 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test3936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3936");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str12 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str20 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str25 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str33 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str38 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str40 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
    }

    @Test
    public void test3937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3937");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str9 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str14 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str16 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str18 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str23 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable24 = null;
        strComparableLFUCache1.put(strComparable24, "hi!");
        java.lang.Class<?> wildcardClass27 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test3938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3938");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 10);
        java.lang.String str3 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str17 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Class<?> wildcardClass21 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3939");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str12 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str20 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str28 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str33 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
    }

    @Test
    public void test3940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3940");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 10);
        java.lang.String str3 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable4 = null;
        strComparableLFUCache1.put(strComparable4, "hi!");
        java.lang.String str8 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str16 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test3941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3941");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str9 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str14 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str16 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str18 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str26 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass27 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test3942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3942");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str9 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str14 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str16 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test3943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3943");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        java.lang.String str3 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str8 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str10 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str15 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str17 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str19 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str24 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str26 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass27 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test3944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3944");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str9 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str14 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str19 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str21 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str23 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str28 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str30 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.Class<?> wildcardClass34 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test3945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3945");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str9 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str14 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str19 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str21 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str23 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str25 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str27 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str29 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str34 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str36 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNull(str36);
    }

    @Test
    public void test3946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3946");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str12 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str20 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str31 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str33 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str35 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str37 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
    }

    @Test
    public void test3947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3947");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        java.lang.String str3 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str5 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str7 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str12 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass13 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3948");
        com.thealgorithms.datastructures.caches.LFUCache<java.io.Serializable, java.lang.Comparable<java.lang.String>> serializableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.io.Serializable, java.lang.Comparable<java.lang.String>>((java.lang.Integer) 10);
        java.lang.Class<?> wildcardClass2 = serializableLFUCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test3949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3949");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        java.lang.String str3 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Comparable<java.lang.String> strComparable10 = null;
        strComparableLFUCache1.put(strComparable10, "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str20 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str25 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass26 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test3950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3950");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str6 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str8 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str13 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test3951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3951");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        java.lang.String str3 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str8 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str10 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str15 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str26 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
    }

    @Test
    public void test3952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3952");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        java.lang.String str3 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Comparable<java.lang.String> strComparable10 = null;
        strComparableLFUCache1.put(strComparable10, "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str20 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str31 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str36 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNull(str36);
    }

    @Test
    public void test3953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3953");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str12 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str14 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable15 = null;
        java.lang.String str16 = strComparableLFUCache1.get(strComparable15);
        java.lang.Comparable<java.lang.String> strComparable17 = null;
        java.lang.String str18 = strComparableLFUCache1.get(strComparable17);
        java.lang.String str20 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Class<?> wildcardClass24 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test3954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3954");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str18 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str20 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str22 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test3955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3955");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        java.lang.String str3 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str8 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable9 = null;
        strComparableLFUCache1.put(strComparable9, "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str22 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str24 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test3956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3956");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str9 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str17 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test3957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3957");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 10);
        java.lang.String str3 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Comparable<java.lang.String> strComparable16 = null;
        strComparableLFUCache1.put(strComparable16, "");
        java.lang.Class<?> wildcardClass19 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3958");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str12 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str14 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str19 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str21 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test3959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3959");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str9 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str14 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.Comparable<java.lang.String> strComparable18 = null;
        strComparableLFUCache1.put(strComparable18, "");
        java.lang.String str22 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str24 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str29 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Comparable<java.lang.String> strComparable33 = null;
        strComparableLFUCache1.put(strComparable33, "");
        java.lang.String str37 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Class<?> wildcardClass47 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test3960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3960");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        java.lang.String str3 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str8 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str10 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str15 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str17 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str19 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str21 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass22 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3961");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str9 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str14 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str22 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str24 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test3962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3962");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str9 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str14 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str19 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str21 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str23 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str25 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str27 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str29 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str31 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str33 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNull(str33);
    }

    @Test
    public void test3963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3963");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str9 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str14 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str16 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str21 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str26 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str26);
    }

    @Test
    public void test3964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3964");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str9 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str14 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str25 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str27 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str29 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
    }

    @Test
    public void test3965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3965");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        java.lang.String str3 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Comparable<java.lang.String> strComparable10 = null;
        strComparableLFUCache1.put(strComparable10, "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str20 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str31 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str33 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.Class<?> wildcardClass37 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test3966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3966");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str9 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str14 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str22 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str24 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str26 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str28 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
    }

    @Test
    public void test3967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3967");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str9 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.Class<?> wildcardClass22 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3968");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.CharSequence, java.lang.Class<?>> charSequenceLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.CharSequence, java.lang.Class<?>>((java.lang.Integer) (-1));
    }

    @Test
    public void test3969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3969");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str9 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str14 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str19 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test3970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3970");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str9 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str14 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str19 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str21 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str23 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str28 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable29 = null;
        java.lang.String str30 = strComparableLFUCache1.get(strComparable29);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Class<?> wildcardClass34 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test3971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3971");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.constant.ConstantDesc, java.lang.reflect.AnnotatedElement> constantDescLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.constant.ConstantDesc, java.lang.reflect.AnnotatedElement>((java.lang.Integer) 10);
    }

    @Test
    public void test3972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3972");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 10);
        java.lang.String str3 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str8 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str13 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test3973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3973");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
    }

    @Test
    public void test3974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3974");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str9 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str14 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.Comparable<java.lang.String> strComparable18 = null;
        strComparableLFUCache1.put(strComparable18, "");
        java.lang.String str22 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str24 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str29 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str31 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str33 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str41 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass42 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test3975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3975");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str9 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str14 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.Comparable<java.lang.String> strComparable18 = null;
        strComparableLFUCache1.put(strComparable18, "");
        java.lang.String str22 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str24 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str29 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass30 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test3976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3976");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str6 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str8 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str16 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.Class<?> wildcardClass32 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test3977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3977");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str9 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Comparable<java.lang.String> strComparable25 = null;
        strComparableLFUCache1.put(strComparable25, "hi!");
        java.lang.String str29 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str31 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str33 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str35 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNull(str35);
    }

    @Test
    public void test3978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3978");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str9 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str14 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.Comparable<java.lang.String> strComparable18 = null;
        strComparableLFUCache1.put(strComparable18, "");
        java.lang.Comparable<java.lang.String> strComparable21 = null;
        strComparableLFUCache1.put(strComparable21, "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str34 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.Class<?> wildcardClass41 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test3979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3979");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str9 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str14 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str19 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str21 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str23 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str28 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNull(str28);
    }

    @Test
    public void test3980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3980");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        java.lang.String str3 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str8 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str16 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test3981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3981");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        java.lang.String str3 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str5 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str19 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test3982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3982");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        java.lang.String str3 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str11 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str13 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str18 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test3983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3983");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str9 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str14 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str16 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str18 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.Class<?> wildcardClass25 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3984");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 10);
        java.lang.String str3 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str5 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str7 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test3985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3985");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        java.lang.String str3 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str5 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str7 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test3986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3986");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str9 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str14 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str19 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str21 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str23 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str28 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.Class<?> wildcardClass32 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test3987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3987");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        java.lang.String str3 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str8 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str10 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str15 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str17 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.Class<?> wildcardClass21 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3988");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str6 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str8 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str13 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str18 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str23 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str25 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass26 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test3989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3989");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str9 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str14 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str16 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str21 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str35 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str40 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
    }

    @Test
    public void test3990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3990");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Class<?>, java.lang.constant.Constable> wildcardClassLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Class<?>, java.lang.constant.Constable>((java.lang.Integer) (-1));
        java.lang.Class<?> wildcardClass2 = wildcardClassLFUCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test3991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3991");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str6 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str8 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str13 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Comparable<java.lang.String> strComparable23 = null;
        strComparableLFUCache1.put(strComparable23, "hi!");
        java.lang.String str27 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable28 = null;
        strComparableLFUCache1.put(strComparable28, "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str27);
    }

    @Test
    public void test3992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3992");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str12 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.Comparable<java.lang.String> strComparable19 = null;
        strComparableLFUCache1.put(strComparable19, "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str26 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str40 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertNull(str40);
    }

    @Test
    public void test3993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3993");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str9 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str14 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str19 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str24 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test3994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3994");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str9 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str20 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass21 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3995");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str12 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str20 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str22 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str30 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable31 = null;
        strComparableLFUCache1.put(strComparable31, "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str38 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertNull(str38);
    }

    @Test
    public void test3996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3996");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        java.lang.String str3 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.Class<?> wildcardClass10 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3997");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str9 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str14 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str19 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str30 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass31 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test3998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3998");
        com.thealgorithms.datastructures.caches.LFUCache<java.io.Serializable, java.lang.reflect.GenericDeclaration> serializableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.io.Serializable, java.lang.reflect.GenericDeclaration>((java.lang.Integer) 10);
    }

    @Test
    public void test3999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3999");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 10);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
    }

    @Test
    public void test4000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test4000");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 10);
        java.lang.String str3 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str5 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable6 = null;
        java.lang.String str7 = strComparableLFUCache1.get(strComparable6);
        java.lang.String str9 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Comparable<java.lang.String> strComparable13 = null;
        java.lang.String str14 = strComparableLFUCache1.get(strComparable13);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
    }
}

