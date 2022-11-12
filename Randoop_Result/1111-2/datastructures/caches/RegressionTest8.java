package datastructures.caches;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest8 {

    public static boolean debug = false;

    @Test
    public void test4001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4001");
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
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.Class<?> wildcardClass44 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test4002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4002");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str12 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str20 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.Class<?> wildcardClass27 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test4003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4003");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        java.lang.String str3 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str8 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str10 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str15 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.Class<?> wildcardClass22 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test4004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4004");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        java.lang.String str3 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str5 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str7 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.Comparable<java.lang.String> strComparable20 = null;
        java.lang.String str21 = strComparableLFUCache1.get(strComparable20);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test4005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4005");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str9 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str14 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str19 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str21 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test4006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4006");
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
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str53 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertNull(str53);
    }

    @Test
    public void test4007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4007");
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
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str33 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str35 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable36 = null;
        strComparableLFUCache1.put(strComparable36, "hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNull(str35);
    }

    @Test
    public void test4008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4008");
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
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test4009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4009");
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
        java.lang.Class<?> wildcardClass20 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test4010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4010");
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
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str35 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str37 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
    }

    @Test
    public void test4011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4011");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str6 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str8 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str10 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str21 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str23 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
    }

    @Test
    public void test4012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4012");
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
        java.lang.String str22 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.Class<?> wildcardClass26 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test4013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4013");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str9 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str23 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str28 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable29 = null;
        java.lang.String str30 = strComparableLFUCache1.get(strComparable29);
        java.lang.Class<?> wildcardClass31 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test4014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4014");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str9 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str14 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str25 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test4015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4015");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str9 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str14 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str16 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.Comparable<java.lang.String> strComparable23 = null;
        java.lang.String str24 = strComparableLFUCache1.get(strComparable23);
        java.lang.String str26 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str26);
    }

    @Test
    public void test4016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4016");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str18 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str20 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test4017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4017");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str9 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str26 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str31 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str33 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
    }

    @Test
    public void test4018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4018");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>, java.io.Serializable> wildcardClassOfFieldLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>, java.io.Serializable>((java.lang.Integer) 1);
        java.lang.Class<?> wildcardClass2 = wildcardClassOfFieldLFUCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test4019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4019");
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
        java.lang.String str29 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str31 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.Class<?> wildcardClass44 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test4020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4020");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>, com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>> wildcardClassOfFieldLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>, com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>>((java.lang.Integer) 1);
        java.lang.Class<?> wildcardClass2 = wildcardClassOfFieldLFUCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test4021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4021");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 100);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str12 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str17 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str22 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str24 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test4022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4022");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str12 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str20 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str25 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str30 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str35 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass36 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test4023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4023");
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
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str31 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str36 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str38 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
    }

    @Test
    public void test4024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4024");
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
        java.lang.Comparable<java.lang.String> strComparable29 = null;
        strComparableLFUCache1.put(strComparable29, "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.Class<?> wildcardClass35 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test4025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4025");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str6 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str8 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str10 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str18 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str20 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass21 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test4026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4026");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        java.lang.String str3 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str8 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str16 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str18 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test4027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4027");
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
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test4028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4028");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        java.lang.String str3 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str5 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str7 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str9 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.Comparable<java.lang.String> strComparable13 = null;
        java.lang.String str14 = strComparableLFUCache1.get(strComparable13);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.Class<?> wildcardClass18 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test4029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4029");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str9 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str14 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str16 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str18 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str20 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test4030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4030");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        java.lang.String str3 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str8 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Comparable<java.lang.String> strComparable15 = null;
        strComparableLFUCache1.put(strComparable15, "hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test4031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4031");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        java.lang.String str3 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str17 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass18 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test4032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4032");
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
        java.lang.String str38 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNull(str38);
    }

    @Test
    public void test4033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4033");
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
        java.lang.Comparable<java.lang.String> strComparable37 = null;
        strComparableLFUCache1.put(strComparable37, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
    }

    @Test
    public void test4034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4034");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str9 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str26 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str28 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str30 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str32 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
    }

    @Test
    public void test4035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4035");
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
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str36 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
    }

    @Test
    public void test4036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4036");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.invoke.TypeDescriptor, java.io.Serializable> typeDescriptorLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.invoke.TypeDescriptor, java.io.Serializable>((java.lang.Integer) 100);
    }

    @Test
    public void test4037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4037");
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
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str36 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNull(str36);
    }

    @Test
    public void test4038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4038");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str9 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str14 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str25 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable26 = null;
        strComparableLFUCache1.put(strComparable26, "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test4039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4039");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str18 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str26 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test4040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4040");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        java.lang.String str3 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str5 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str10 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str12 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str14 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.Class<?> wildcardClass21 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test4041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4041");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str6 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable7 = null;
        strComparableLFUCache1.put(strComparable7, "");
        java.lang.String str11 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str13 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str15 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str32 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str34 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertNull(str34);
    }

    @Test
    public void test4042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4042");
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
        java.lang.String str30 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass31 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test4043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4043");
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
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.Comparable<java.lang.String> strComparable33 = null;
        java.lang.String str34 = strComparableLFUCache1.get(strComparable33);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNull(str34);
    }

    @Test
    public void test4044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4044");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str6 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str8 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str16 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str24 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str26 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str28 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str36 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
    }

    @Test
    public void test4045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4045");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str6 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str8 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str13 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test4046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4046");
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
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str37 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str39 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass40 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test4047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4047");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str12 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str17 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str28 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str30 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
    }

    @Test
    public void test4048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4048");
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
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNull(str36);
    }

    @Test
    public void test4049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4049");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.constant.ConstantDesc, com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>> constantDescLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.constant.ConstantDesc, com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>>((java.lang.Integer) (-1));
        java.lang.Class<?> wildcardClass2 = constantDescLFUCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test4050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4050");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.reflect.GenericDeclaration, java.lang.reflect.GenericDeclaration> genericDeclarationLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.reflect.GenericDeclaration, java.lang.reflect.GenericDeclaration>((java.lang.Integer) 0);
    }

    @Test
    public void test4051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4051");
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
        java.lang.Class<?> wildcardClass31 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test4052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4052");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 10);
        java.lang.String str3 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str8 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable9 = null;
        java.lang.String str10 = strComparableLFUCache1.get(strComparable9);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.Comparable<java.lang.String> strComparable14 = null;
        strComparableLFUCache1.put(strComparable14, "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test4053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4053");
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
        java.lang.String str34 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str36 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable37 = null;
        java.lang.String str38 = strComparableLFUCache1.get(strComparable37);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNull(str38);
    }

    @Test
    public void test4054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4054");
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
        java.lang.String str25 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str27 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str29 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str31 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertNull(str31);
    }

    @Test
    public void test4055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4055");
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
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Class<?> wildcardClass38 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test4056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4056");
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
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
    }

    @Test
    public void test4057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4057");
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
        java.lang.String str39 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str41 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str43 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.Class<?> wildcardClass47 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test4058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4058");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 10);
        java.lang.String str3 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str8 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable9 = null;
        java.lang.String str10 = strComparableLFUCache1.get(strComparable9);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test4059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4059");
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
        java.lang.String str35 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str37 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str39 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
    }

    @Test
    public void test4060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4060");
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
        java.lang.String str40 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
    }

    @Test
    public void test4061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4061");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 10);
        java.lang.String str3 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str8 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable9 = null;
        java.lang.String str10 = strComparableLFUCache1.get(strComparable9);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str21 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str23 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass24 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test4062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4062");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 10);
        java.lang.String str3 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str8 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable9 = null;
        java.lang.String str10 = strComparableLFUCache1.get(strComparable9);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str21 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass22 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test4063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4063");
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
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(str30);
    }

    @Test
    public void test4064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4064");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 10);
        java.lang.String str3 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str8 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str13 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str15 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable16 = null;
        java.lang.String str17 = strComparableLFUCache1.get(strComparable16);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str22 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test4065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4065");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str12 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str14 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str22 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test4066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4066");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str9 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.Comparable<java.lang.String> strComparable16 = null;
        java.lang.String str17 = strComparableLFUCache1.get(strComparable16);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test4067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4067");
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
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test4068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4068");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.invoke.TypeDescriptor, java.lang.Comparable<java.lang.String>> typeDescriptorLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.invoke.TypeDescriptor, java.lang.Comparable<java.lang.String>>((java.lang.Integer) 0);
        java.lang.Class<?> wildcardClass2 = typeDescriptorLFUCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test4069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4069");
        com.thealgorithms.datastructures.caches.LFUCache<java.io.Serializable, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>> serializableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.io.Serializable, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>((java.lang.Integer) 0);
    }

    @Test
    public void test4070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4070");
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
        java.lang.Class<?> wildcardClass41 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test4071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4071");
        com.thealgorithms.datastructures.caches.LFUCache<com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableLFUCacheLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>, java.lang.Comparable<java.lang.String>>((java.lang.Integer) 10);
    }

    @Test
    public void test4072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4072");
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
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str37 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str37);
    }

    @Test
    public void test4073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4073");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        java.lang.String str3 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Comparable<java.lang.String> strComparable10 = null;
        strComparableLFUCache1.put(strComparable10, "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.Class<?> wildcardClass25 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test4074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4074");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        java.lang.String str3 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str8 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test4075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4075");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 10);
        java.lang.String str3 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str5 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.Comparable<java.lang.String> strComparable9 = null;
        java.lang.String str10 = strComparableLFUCache1.get(strComparable9);
        java.lang.String str12 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test4076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4076");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str9 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str14 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str19 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str30 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str35 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNull(str35);
    }

    @Test
    public void test4077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4077");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str6 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable7 = null;
        strComparableLFUCache1.put(strComparable7, "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str14 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str16 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test4078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4078");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str6 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str8 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str10 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.Class<?> wildcardClass23 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test4079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4079");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        java.lang.String str3 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Comparable<java.lang.String> strComparable10 = null;
        strComparableLFUCache1.put(strComparable10, "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str17 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str22 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str24 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test4080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4080");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str12 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str14 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.Class<?> wildcardClass21 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test4081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4081");
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
        java.lang.String str30 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str32 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass33 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test4082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4082");
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
        java.lang.Class<?> wildcardClass27 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test4083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4083");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str6 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str8 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str13 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str15 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str20 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test4084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4084");
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
        java.lang.String str31 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNull(str31);
    }

    @Test
    public void test4085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4085");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str9 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str14 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str19 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str24 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str26 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test4086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4086");
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
        java.lang.String str26 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertNull(str26);
    }

    @Test
    public void test4087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4087");
        com.thealgorithms.datastructures.caches.LFUCache<java.io.Serializable, java.lang.Comparable<java.lang.String>> serializableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.io.Serializable, java.lang.Comparable<java.lang.String>>((java.lang.Integer) 100);
    }

    @Test
    public void test4088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4088");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.io.Serializable> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.io.Serializable>((java.lang.Integer) (-1));
    }

    @Test
    public void test4089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4089");
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
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNull(str39);
    }

    @Test
    public void test4090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4090");
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
        java.lang.String str30 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str30);
    }

    @Test
    public void test4091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4091");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str9 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str23 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str25 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str33 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
    }

    @Test
    public void test4092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4092");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        java.lang.String str3 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Comparable<java.lang.String> strComparable10 = null;
        strComparableLFUCache1.put(strComparable10, "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str17 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str19 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str24 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test4093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4093");
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
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Class<?> wildcardClass32 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test4094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4094");
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
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNull(str31);
    }

    @Test
    public void test4095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4095");
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
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str56 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass57 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "hi!" + "'", str56, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass57);
    }

    @Test
    public void test4096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4096");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str9 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str11 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test4097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4097");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str18 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test4098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4098");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str6 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str8 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str10 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str15 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str17 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass18 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test4099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4099");
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
        java.lang.Comparable<java.lang.String> strComparable36 = null;
        strComparableLFUCache1.put(strComparable36, "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test4100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4100");
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
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.Comparable<java.lang.String> strComparable41 = null;
        strComparableLFUCache1.put(strComparable41, "");
        java.lang.Class<?> wildcardClass44 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test4101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4101");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 10);
        java.lang.String str3 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str5 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str16 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass17 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test4102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4102");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 10);
        java.lang.String str3 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str8 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test4103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4103");
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
        java.lang.String str27 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(str27);
    }

    @Test
    public void test4104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4104");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        java.lang.String str3 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str8 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str10 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str15 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str17 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test4105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4105");
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
        java.lang.String str30 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str32 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
    }

    @Test
    public void test4106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4106");
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
        java.lang.String str39 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str41 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass42 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test4107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4107");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str12 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str20 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str25 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Class<?> wildcardClass32 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test4108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4108");
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
        java.lang.String str39 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str44 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.Class<?> wildcardClass51 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!" + "'", str44, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass51);
    }

    @Test
    public void test4109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4109");
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
        java.lang.String str31 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
    }

    @Test
    public void test4110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4110");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        java.lang.String str3 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str8 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str10 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str18 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str23 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test4111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4111");
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
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str33);
    }

    @Test
    public void test4112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4112");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str9 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str14 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str28 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(str28);
    }

    @Test
    public void test4113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4113");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>((java.lang.Integer) 1);
        java.lang.Class<?> wildcardClass2 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test4114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4114");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str12 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str14 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str16 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str18 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str20 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.Comparable<java.lang.String> strComparable24 = null;
        strComparableLFUCache1.put(strComparable24, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test4115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4115");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.constant.ConstantDesc, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>> constantDescLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.constant.ConstantDesc, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>((java.lang.Integer) 1);
    }

    @Test
    public void test4116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4116");
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
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str30 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.Comparable<java.lang.String> strComparable37 = null;
        java.lang.String str38 = strComparableLFUCache1.get(strComparable37);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(str38);
    }

    @Test
    public void test4117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4117");
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
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Class<?> wildcardClass39 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test4118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4118");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 10);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str9 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str14 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str16 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str21 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test4119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4119");
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
        java.lang.String str31 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
    }

    @Test
    public void test4120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4120");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 10);
        java.lang.String str3 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.Class<?> wildcardClass7 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test4121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4121");
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
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test4122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4122");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str6 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str8 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str16 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str18 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str20 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test4123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4123");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str6 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str8 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str16 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Comparable<java.lang.String> strComparable23 = null;
        strComparableLFUCache1.put(strComparable23, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test4124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4124");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        java.lang.String str3 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str11 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str13 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test4125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4125");
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
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
    }

    @Test
    public void test4126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4126");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str9 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str14 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str19 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str27 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNull(str27);
    }

    @Test
    public void test4127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4127");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.invoke.TypeDescriptor, java.io.Serializable> typeDescriptorLFUCache0 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.invoke.TypeDescriptor, java.io.Serializable>();
        java.lang.Class<?> wildcardClass1 = typeDescriptorLFUCache0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test4128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4128");
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
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str45 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "hi!" + "'", str45, "hi!");
    }

    @Test
    public void test4129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4129");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str12 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str20 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str25 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str30 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Class<?> wildcardClass34 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test4130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4130");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        java.lang.String str3 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str11 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str13 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass14 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4131");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str12 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str17 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str19 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str21 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass22 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test4132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4132");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        java.lang.String str3 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str8 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str10 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str15 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str17 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str19 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str21 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test4133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4133");
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
        java.lang.String str36 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass37 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test4134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4134");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>> typeLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.reflect.Type, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>((java.lang.Integer) 100);
    }

    @Test
    public void test4135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4135");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str9 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str14 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str16 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str21 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str26 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
    }

    @Test
    public void test4136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4136");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str9 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str23 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass24 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test4137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4137");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        java.lang.String str3 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str14 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test4138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4138");
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
        java.lang.String str26 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str34 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(str34);
    }

    @Test
    public void test4139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4139");
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
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str41 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str46 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
    }

    @Test
    public void test4140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4140");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str6 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str8 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str13 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str21 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str23 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass24 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test4141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4141");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Object, java.lang.String> objLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Object, java.lang.String>((java.lang.Integer) 0);
        java.lang.Class<?> wildcardClass2 = objLFUCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test4142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4142");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str9 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str26 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str28 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str30 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str32 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(str32);
    }

    @Test
    public void test4143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4143");
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
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str34 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str36 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str41 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass42 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test4144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4144");
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
        java.lang.Class<?> wildcardClass33 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test4145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4145");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str12 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str14 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable15 = null;
        java.lang.String str16 = strComparableLFUCache1.get(strComparable15);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str21 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass22 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test4146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4146");
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
        java.lang.String str25 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str27 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.Class<?> wildcardClass34 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test4147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4147");
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
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str34 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str39 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass40 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test4148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4148");
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
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test4149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4149");
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
        java.lang.Comparable<java.lang.String> strComparable30 = null;
        java.lang.String str31 = strComparableLFUCache1.get(strComparable30);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str36 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
    }

    @Test
    public void test4150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4150");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.constant.ConstantDesc, java.lang.String> constantDescLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.constant.ConstantDesc, java.lang.String>((java.lang.Integer) 0);
    }

    @Test
    public void test4151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4151");
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
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str37 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass38 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test4152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4152");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str18 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test4153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4153");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str6 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str8 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str10 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str15 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str17 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass18 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test4154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4154");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str9 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str17 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test4155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4155");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str9 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str14 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str19 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str21 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str23 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test4156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4156");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str6 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str8 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str10 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str12 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Comparable<java.lang.String> strComparable16 = null;
        strComparableLFUCache1.put(strComparable16, "");
        java.lang.String str20 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test4157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4157");
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
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str44 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str49 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!" + "'", str44, "hi!");
        org.junit.Assert.assertNull(str49);
    }

    @Test
    public void test4158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4158");
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
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test4159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4159");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        java.lang.String str3 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Comparable<java.lang.String> strComparable10 = null;
        strComparableLFUCache1.put(strComparable10, "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str20 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.Class<?> wildcardClass24 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test4160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4160");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str9 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Comparable<java.lang.String> strComparable16 = null;
        strComparableLFUCache1.put(strComparable16, "hi!");
        java.lang.String str20 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test4161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4161");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str6 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str8 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str13 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str18 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str20 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str22 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str24 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
    }

    @Test
    public void test4162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4162");
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
        java.lang.String str25 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str30 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str32 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass33 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test4163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4163");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str6 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str8 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str13 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str21 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str26 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test4164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4164");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str6 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str8 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str10 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str21 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test4165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4165");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str12 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str14 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str19 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test4166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4166");
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
        java.lang.Class<?> wildcardClass35 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test4167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4167");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.constant.ConstantDesc, java.lang.reflect.Type> constantDescLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.constant.ConstantDesc, java.lang.reflect.Type>((java.lang.Integer) 1);
        java.lang.Class<?> wildcardClass2 = constantDescLFUCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test4168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4168");
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
        java.lang.Comparable<java.lang.String> strComparable29 = null;
        strComparableLFUCache1.put(strComparable29, "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test4169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4169");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str9 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str14 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str19 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str21 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str26 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(str26);
    }

    @Test
    public void test4170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4170");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.constant.ConstantDesc, java.lang.Comparable<java.lang.String>> constantDescLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.constant.ConstantDesc, java.lang.Comparable<java.lang.String>>((java.lang.Integer) 10);
    }

    @Test
    public void test4171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4171");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str9 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str14 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable15 = null;
        strComparableLFUCache1.put(strComparable15, "");
        java.lang.String str19 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable20 = null;
        java.lang.String str21 = strComparableLFUCache1.get(strComparable20);
        java.lang.String str23 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str25 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test4172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4172");
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
        java.lang.String str30 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass31 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test4173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4173");
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
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Class<?> wildcardClass40 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test4174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4174");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.String, java.lang.CharSequence> strLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.String, java.lang.CharSequence>((java.lang.Integer) 10);
    }

    @Test
    public void test4175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4175");
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
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.Class<?> wildcardClass39 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test4176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4176");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 100);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str9 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test4177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4177");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str6 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str8 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str19 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str24 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
    }

    @Test
    public void test4178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4178");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str9 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str11 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str16 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test4179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4179");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        java.lang.String str3 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str8 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test4180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4180");
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
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str41 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass42 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test4181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4181");
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
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str28 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str30 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
    }

    @Test
    public void test4182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4182");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str9 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str14 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str16 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str18 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass19 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test4183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4183");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 10);
        java.lang.String str3 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str8 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str13 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str15 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str17 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.Class<?> wildcardClass24 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test4184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4184");
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
        java.lang.String str26 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.Class<?> wildcardClass30 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test4185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4185");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str9 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str17 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.Comparable<java.lang.String> strComparable21 = null;
        java.lang.String str22 = strComparableLFUCache1.get(strComparable21);
        java.lang.String str24 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str26 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str28 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass29 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test4186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4186");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str12 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str17 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str25 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test4187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4187");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        java.lang.String str3 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str8 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str10 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str15 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str17 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str19 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str21 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str26 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
    }

    @Test
    public void test4188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4188");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str12 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str20 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str25 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str30 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
    }

    @Test
    public void test4189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4189");
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
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str28 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
    }

    @Test
    public void test4190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4190");
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
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str33 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
    }

    @Test
    public void test4191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4191");
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
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str47 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNull(str47);
    }

    @Test
    public void test4192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4192");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        java.lang.String str3 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Comparable<java.lang.String> strComparable10 = null;
        strComparableLFUCache1.put(strComparable10, "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str20 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str25 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable26 = null;
        java.lang.String str27 = strComparableLFUCache1.get(strComparable26);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str27);
    }

    @Test
    public void test4193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4193");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Class<?>, java.lang.Comparable<java.lang.String>> wildcardClassLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Class<?>, java.lang.Comparable<java.lang.String>>((java.lang.Integer) 100);
        java.lang.Class<?> wildcardClass2 = wildcardClassLFUCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test4194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4194");
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
        java.lang.Comparable<java.lang.String> strComparable24 = null;
        java.lang.String str25 = strComparableLFUCache1.get(strComparable24);
        java.lang.String str27 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable28 = null;
        java.lang.String str29 = strComparableLFUCache1.get(strComparable28);
        java.lang.String str31 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNull(str31);
    }

    @Test
    public void test4195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4195");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 10);
        java.lang.String str3 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str8 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test4196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4196");
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
        java.lang.String str32 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass33 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test4197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4197");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str9 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str14 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str25 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str30 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
    }

    @Test
    public void test4198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4198");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str12 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str20 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test4199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4199");
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
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str30 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass31 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test4200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4200");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str12 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.Class<?> wildcardClass22 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test4201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4201");
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
        java.lang.String str22 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str27 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str32 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str34 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
    }

    @Test
    public void test4202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4202");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str6 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str8 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str10 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str27 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
    }

    @Test
    public void test4203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4203");
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
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.Class<?> wildcardClass32 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test4204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4204");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str12 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str14 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable15 = null;
        java.lang.String str16 = strComparableLFUCache1.get(strComparable15);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.Class<?> wildcardClass23 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test4205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4205");
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
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.Comparable<java.lang.String> strComparable33 = null;
        strComparableLFUCache1.put(strComparable33, "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str40 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertNull(str40);
    }

    @Test
    public void test4206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4206");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.invoke.TypeDescriptor, java.lang.String> typeDescriptorLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.invoke.TypeDescriptor, java.lang.String>((java.lang.Integer) 10);
    }

    @Test
    public void test4207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4207");
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
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str38 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str40 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
    }

    @Test
    public void test4208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4208");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        java.lang.String str3 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str8 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str19 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test4209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4209");
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
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNull(str28);
    }

    @Test
    public void test4210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4210");
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
        java.lang.String str27 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass28 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test4211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4211");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 10);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str9 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str11 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test4212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4212");
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
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str36 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str36);
    }

    @Test
    public void test4213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4213");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str9 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str17 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test4214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4214");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str6 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str8 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str10 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.Comparable<java.lang.String> strComparable20 = null;
        strComparableLFUCache1.put(strComparable20, "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test4215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4215");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str9 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str14 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str16 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str18 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str20 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test4216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4216");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str9 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str14 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str16 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str18 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str23 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass24 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test4217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4217");
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
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str31 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str36 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str38 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
    }

    @Test
    public void test4218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4218");
        com.thealgorithms.datastructures.caches.LFUCache<com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>, java.lang.Object> strComparableLFUCacheLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>, java.lang.Object>((java.lang.Integer) 100);
    }

    @Test
    public void test4219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4219");
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
        java.lang.Comparable<java.lang.String> strComparable31 = null;
        strComparableLFUCache1.put(strComparable31, "hi!");
        java.lang.String str35 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str37 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass38 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test4220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4220");
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
        java.lang.String str39 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str41 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
        org.junit.Assert.assertNull(str41);
    }

    @Test
    public void test4221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4221");
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
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
    }

    @Test
    public void test4222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4222");
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
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str41 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str43 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
    }

    @Test
    public void test4223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4223");
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
        java.lang.String str25 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test4224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4224");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        java.lang.String str6 = strComparableLFUCache1.get(strComparable5);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test4225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4225");
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
        java.lang.String str27 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test4226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4226");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 10);
        java.lang.String str3 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str5 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.Class<?> wildcardClass9 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test4227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4227");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str12 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str14 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str16 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str18 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str20 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str22 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass23 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test4228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4228");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Class<?>, java.lang.String> wildcardClassLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Class<?>, java.lang.String>((java.lang.Integer) 0);
    }

    @Test
    public void test4229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4229");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableLFUCache1.put(strComparable5, "hi!");
        java.lang.String str9 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str11 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable12 = null;
        strComparableLFUCache1.put(strComparable12, "hi!");
        java.lang.String str16 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass17 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test4230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4230");
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
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNull(str34);
    }

    @Test
    public void test4231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4231");
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
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str38 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
    }

    @Test
    public void test4232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4232");
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
        java.lang.String str29 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str34 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNull(str34);
    }

    @Test
    public void test4233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4233");
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
        java.lang.String str35 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertNull(str35);
    }

    @Test
    public void test4234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4234");
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
        java.lang.String str27 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNull(str27);
    }

    @Test
    public void test4235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4235");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str6 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str8 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str13 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str18 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable19 = null;
        java.lang.String str20 = strComparableLFUCache1.get(strComparable19);
        java.lang.String str22 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str30 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass31 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test4236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4236");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        java.lang.String str3 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str5 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str10 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str15 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str17 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str19 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str21 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test4237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4237");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        java.lang.String str3 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Comparable<java.lang.String> strComparable10 = null;
        strComparableLFUCache1.put(strComparable10, "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str20 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str22 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass23 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test4238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4238");
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
        java.lang.Comparable<java.lang.String> strComparable26 = null;
        java.lang.String str27 = strComparableLFUCache1.get(strComparable26);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.Comparable<java.lang.String> strComparable31 = null;
        java.lang.String str32 = strComparableLFUCache1.get(strComparable31);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(str32);
    }

    @Test
    public void test4239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4239");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str6 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str8 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str13 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str15 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str23 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test4240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4240");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str9 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str14 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str19 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str30 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str32 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str37 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass38 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test4241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4241");
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
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str31 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass32 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test4242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4242");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str9 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str14 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str16 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str21 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass22 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test4243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4243");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str6 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str8 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str10 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str12 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test4244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4244");
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
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str27 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str35 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str40 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
    }

    @Test
    public void test4245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4245");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str12 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str17 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test4246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4246");
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
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str43 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str48 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
    }

    @Test
    public void test4247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4247");
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
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Class<?> wildcardClass35 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test4248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4248");
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
        java.lang.String str39 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str41 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
    }

    @Test
    public void test4249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4249");
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
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str36 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str36);
    }

    @Test
    public void test4250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4250");
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
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test4251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4251");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str9 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str14 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str16 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass17 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test4252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4252");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str6 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str8 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str10 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str12 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str20 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str22 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass23 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test4253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4253");
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
        java.lang.String str26 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str28 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable29 = null;
        strComparableLFUCache1.put(strComparable29, "hi!");
        java.lang.String str33 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(str33);
    }

    @Test
    public void test4254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4254");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        java.lang.String str3 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str11 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str13 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str21 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test4255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4255");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str9 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test4256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4256");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 10);
        java.lang.String str3 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str5 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str7 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.Comparable<java.lang.String> strComparable11 = null;
        strComparableLFUCache1.put(strComparable11, "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test4257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4257");
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
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str44 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str46 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str48 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass49 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!" + "'", str44, "hi!");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "hi!" + "'", str46, "hi!");
        org.junit.Assert.assertNull(str48);
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test4258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4258");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        java.lang.String str3 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Comparable<java.lang.String> strComparable10 = null;
        strComparableLFUCache1.put(strComparable10, "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str17 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str19 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str21 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str23 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass24 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test4259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4259");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str6 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str8 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str10 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str12 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str14 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str19 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test4260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4260");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 10);
        java.lang.String str3 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str11 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str13 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str21 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test4261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4261");
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
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.Class<?> wildcardClass39 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test4262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4262");
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
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test4263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4263");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.Class<?> wildcardClass11 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test4264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4264");
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
        java.lang.Class<?> wildcardClass26 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test4265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4265");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        java.lang.String str3 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str5 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str10 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str15 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str17 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass18 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test4266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4266");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str9 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str17 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str19 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str21 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test4267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4267");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.reflect.AnnotatedElement, java.lang.reflect.GenericDeclaration> annotatedElementLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.reflect.AnnotatedElement, java.lang.reflect.GenericDeclaration>((java.lang.Integer) 0);
        java.lang.Class<?> wildcardClass2 = annotatedElementLFUCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test4268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4268");
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
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNull(str28);
    }

    @Test
    public void test4269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4269");
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
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str33 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str33);
    }

    @Test
    public void test4270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4270");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str6 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str8 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str13 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str27 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str27);
    }

    @Test
    public void test4271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4271");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 10);
        java.lang.String str3 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Comparable<java.lang.String> strComparable7 = null;
        java.lang.String str8 = strComparableLFUCache1.get(strComparable7);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test4272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4272");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str9 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str14 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str16 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str18 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str20 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str22 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.Class<?> wildcardClass26 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test4273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4273");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str9 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str17 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str19 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str27 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
    }

    @Test
    public void test4274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4274");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 100);
        java.lang.String str3 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str5 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str7 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str9 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str11 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test4275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4275");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str12 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str17 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str28 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNull(str28);
    }

    @Test
    public void test4276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4276");
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
        java.lang.String str43 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertNull(str43);
    }

    @Test
    public void test4277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4277");
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
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
    }

    @Test
    public void test4278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4278");
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
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str33 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str33);
    }

    @Test
    public void test4279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4279");
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
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str33 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable34 = null;
        strComparableLFUCache1.put(strComparable34, "hi!");
        java.lang.String str38 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str40 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNull(str40);
    }

    @Test
    public void test4280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4280");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        java.lang.String str3 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str5 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str10 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str12 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str14 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str16 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str18 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test4281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4281");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.reflect.GenericDeclaration, java.lang.Class<?>> genericDeclarationLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.reflect.GenericDeclaration, java.lang.Class<?>>((java.lang.Integer) 100);
    }

    @Test
    public void test4282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4282");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str9 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str23 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str28 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test4283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4283");
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
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str43 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable44 = null;
        java.lang.String str45 = strComparableLFUCache1.get(strComparable44);
        java.lang.String str47 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str49 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertNull(str49);
    }

    @Test
    public void test4284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4284");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        java.lang.String str3 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str8 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str10 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str12 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test4285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4285");
        com.thealgorithms.datastructures.caches.LFUCache<java.io.Serializable, java.lang.CharSequence> serializableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.io.Serializable, java.lang.CharSequence>((java.lang.Integer) 1);
    }

    @Test
    public void test4286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4286");
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
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str25 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test4287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4287");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str9 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str14 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str19 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str24 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
    }

    @Test
    public void test4288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4288");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        java.lang.String str3 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str11 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str13 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str15 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test4289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4289");
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
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str41 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str49 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str51 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertNull(str51);
    }

    @Test
    public void test4290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4290");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str6 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str8 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str13 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str21 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass22 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test4291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4291");
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
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.Class<?> wildcardClass27 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test4292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4292");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str6 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str8 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str13 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str21 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str32 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
    }

    @Test
    public void test4293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4293");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str9 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str14 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str19 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str30 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str32 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str34 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str36 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass37 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test4294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4294");
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
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
    }

    @Test
    public void test4295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4295");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str9 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str14 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str16 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.Class<?> wildcardClass23 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test4296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4296");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        java.lang.String str3 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Comparable<java.lang.String> strComparable10 = null;
        strComparableLFUCache1.put(strComparable10, "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Class<?> wildcardClass16 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4297");
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
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str34 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str42 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
    }

    @Test
    public void test4298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4298");
        com.thealgorithms.datastructures.caches.LFUCache<com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>, java.lang.constant.ConstantDesc> strComparableLFUCacheLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>, java.lang.constant.ConstantDesc>((java.lang.Integer) 100);
        java.lang.Class<?> wildcardClass2 = strComparableLFUCacheLFUCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test4299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4299");
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
        java.lang.String str42 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str44 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertNull(str44);
    }

    @Test
    public void test4300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4300");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        java.lang.String str3 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str8 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str10 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str15 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str20 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str22 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str24 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
    }

    @Test
    public void test4301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4301");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>((java.lang.Integer) 100);
        java.lang.Class<?> wildcardClass2 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test4302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4302");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        java.lang.String str3 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str8 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str10 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str15 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str17 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str19 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test4303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4303");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str9 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str17 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str19 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable20 = null;
        strComparableLFUCache1.put(strComparable20, "hi!");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test4304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4304");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str18 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str20 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str25 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test4305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4305");
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
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str39 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str41 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str43 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNull(str43);
    }

    @Test
    public void test4306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4306");
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
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
    }

    @Test
    public void test4307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4307");
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
        java.lang.String str33 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
    }

    @Test
    public void test4308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4308");
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
        java.lang.Comparable<java.lang.String> strComparable23 = null;
        strComparableLFUCache1.put(strComparable23, "hi!");
        java.lang.String str27 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str29 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(str29);
    }

    @Test
    public void test4309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4309");
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
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Class<?> wildcardClass27 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test4310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4310");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str6 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str8 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str13 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str18 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str26 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test4311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4311");
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
        java.lang.String str27 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str29 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.Class<?> wildcardClass33 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test4312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4312");
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
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str38 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str40 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNull(str40);
    }

    @Test
    public void test4313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4313");
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
        java.lang.String str31 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Class<?> wildcardClass35 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test4314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4314");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        java.lang.String str3 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Comparable<java.lang.String> strComparable10 = null;
        strComparableLFUCache1.put(strComparable10, "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str23 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str25 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass26 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test4315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4315");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str18 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test4316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4316");
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
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Class<?> wildcardClass35 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test4317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4317");
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
        java.lang.String str25 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable26 = null;
        strComparableLFUCache1.put(strComparable26, "");
        java.lang.String str30 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str30);
    }

    @Test
    public void test4318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4318");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        java.lang.String str3 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str8 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str10 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str15 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str17 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test4319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4319");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str9 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str14 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.Class<?> wildcardClass18 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test4320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4320");
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
        java.lang.String str22 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str24 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str26 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass27 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test4321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4321");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str12 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str20 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str22 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str24 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str29 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str31 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str33 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass34 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test4322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4322");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str6 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable7 = null;
        strComparableLFUCache1.put(strComparable7, "");
        java.lang.String str11 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str16 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test4323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4323");
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
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str27 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str27);
    }

    @Test
    public void test4324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4324");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        java.lang.String str3 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str8 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.Comparable<java.lang.String> strComparable15 = null;
        java.lang.String str16 = strComparableLFUCache1.get(strComparable15);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test4325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4325");
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
        java.lang.String str31 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str33 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNull(str33);
    }

    @Test
    public void test4326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4326");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>((java.lang.Integer) (-1));
    }

    @Test
    public void test4327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4327");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        java.lang.String str3 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable4 = null;
        java.lang.String str5 = strComparableLFUCache1.get(strComparable4);
        java.lang.String str7 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str9 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str11 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str13 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test4328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4328");
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
        java.lang.Class<?> wildcardClass40 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test4329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4329");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        java.lang.String str3 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str8 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str10 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str15 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str17 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str19 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str21 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str23 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test4330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4330");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str9 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str14 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str16 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str21 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str23 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str25 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable26 = null;
        java.lang.String str27 = strComparableLFUCache1.get(strComparable26);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str27);
    }

    @Test
    public void test4331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4331");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str6 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str8 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str13 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.Class<?> wildcardClass20 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test4332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4332");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        java.lang.String str3 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable4 = null;
        java.lang.String str5 = strComparableLFUCache1.get(strComparable4);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test4333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4333");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str9 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str14 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str19 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str24 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test4334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4334");
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
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str44 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
    }

    @Test
    public void test4335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4335");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str9 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str17 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str19 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str21 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str23 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass24 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test4336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4336");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        java.lang.String str6 = strComparableLFUCache1.get(strComparable5);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.Comparable<java.lang.String> strComparable10 = null;
        strComparableLFUCache1.put(strComparable10, "hi!");
        java.lang.Class<?> wildcardClass13 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4337");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str6 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str8 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str13 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str15 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.Class<?> wildcardClass25 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test4338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4338");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str9 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str14 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str16 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test4339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4339");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str18 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str20 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str22 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.Class<?> wildcardClass26 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test4340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4340");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        java.lang.String str3 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable4 = null;
        java.lang.String str5 = strComparableLFUCache1.get(strComparable4);
        java.lang.String str7 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str12 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test4341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4341");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        java.lang.String str3 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str11 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str13 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.Class<?> wildcardClass17 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test4342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4342");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 10);
        java.lang.String str3 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str8 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable9 = null;
        java.lang.String str10 = strComparableLFUCache1.get(strComparable9);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str24 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Class<?> wildcardClass28 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test4343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4343");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        java.lang.String str3 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str5 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.Class<?> wildcardClass12 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4344");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        java.lang.String str3 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str8 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Comparable<java.lang.String> strComparable12 = null;
        strComparableLFUCache1.put(strComparable12, "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str22 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str24 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass25 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test4345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4345");
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
        java.lang.String str26 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test4346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4346");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str9 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str20 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str22 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test4347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4347");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str6 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str8 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str13 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str21 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str29 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass30 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test4348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4348");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str15 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str17 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass18 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test4349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4349");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        java.lang.String str3 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str11 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str13 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str21 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str26 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str26);
    }

    @Test
    public void test4350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4350");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.invoke.TypeDescriptor, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>> typeDescriptorLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.invoke.TypeDescriptor, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>((java.lang.Integer) 100);
    }

    @Test
    public void test4351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4351");
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
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test4352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4352");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str9 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str20 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str22 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str24 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str26 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str31 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(str31);
    }

    @Test
    public void test4353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4353");
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
        java.lang.Comparable<java.lang.String> strComparable28 = null;
        java.lang.String str29 = strComparableLFUCache1.get(strComparable28);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(str29);
    }

    @Test
    public void test4354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4354");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str12 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str17 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str19 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable20 = null;
        strComparableLFUCache1.put(strComparable20, "");
        java.lang.Comparable<java.lang.String> strComparable23 = null;
        java.lang.String str24 = strComparableLFUCache1.get(strComparable23);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test4355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4355");
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
        java.lang.String str34 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNull(str34);
    }

    @Test
    public void test4356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4356");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str9 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str14 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str19 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str24 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test4357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4357");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str9 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Comparable<java.lang.String> strComparable16 = null;
        strComparableLFUCache1.put(strComparable16, "hi!");
        java.lang.Class<?> wildcardClass19 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test4358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4358");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str12 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str14 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str19 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str21 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable22 = null;
        strComparableLFUCache1.put(strComparable22, "hi!");
        java.lang.String str26 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str26);
    }

    @Test
    public void test4359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4359");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str6 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str8 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str10 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str15 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str20 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test4360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4360");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str9 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str14 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str22 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test4361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4361");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str9 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str17 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable18 = null;
        strComparableLFUCache1.put(strComparable18, "hi!");
        java.lang.String str22 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass23 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test4362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4362");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        java.lang.String str3 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str8 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str10 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str15 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Class<?> wildcardClass22 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test4363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4363");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.constant.Constable, java.lang.constant.ConstantDesc> constableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.constant.Constable, java.lang.constant.ConstantDesc>((java.lang.Integer) 1);
        java.lang.Class<?> wildcardClass2 = constableLFUCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test4364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4364");
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
        java.lang.String str26 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str31 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str39 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
    }

    @Test
    public void test4365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4365");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str9 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str14 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str16 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test4366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4366");
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
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test4367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4367");
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
        java.lang.String str27 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str29 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str31 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
    }

    @Test
    public void test4368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4368");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 10);
        java.lang.String str3 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str11 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str13 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test4369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4369");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str9 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str14 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str16 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str24 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test4370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4370");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str12 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str14 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str25 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test4371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4371");
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
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test4372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4372");
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
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str31 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable32 = null;
        strComparableLFUCache1.put(strComparable32, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str31);
    }

    @Test
    public void test4373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4373");
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
        java.lang.String str39 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str41 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass42 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test4374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4374");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str12 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str20 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.Class<?> wildcardClass30 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test4375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4375");
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
        java.lang.String str27 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str27);
    }

    @Test
    public void test4376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4376");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str6 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable7 = null;
        strComparableLFUCache1.put(strComparable7, "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str14 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test4377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4377");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str12 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str20 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str22 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str24 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.Class<?> wildcardClass28 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test4378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4378");
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
        java.lang.String str26 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test4379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4379");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str9 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str26 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str28 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str36 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass37 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test4380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4380");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        java.lang.String str3 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str8 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str10 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str12 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.Class<?> wildcardClass16 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4381");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        java.lang.String str3 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str14 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str16 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test4382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4382");
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
        java.lang.String str27 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str29 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str31 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNull(str31);
    }

    @Test
    public void test4383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4383");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.String, java.lang.String> strLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.String, java.lang.String>((java.lang.Integer) 0);
    }

    @Test
    public void test4384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4384");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str9 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str14 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str19 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str30 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str32 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNull(str32);
    }

    @Test
    public void test4385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4385");
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
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str31);
    }

    @Test
    public void test4386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4386");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str9 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str17 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str19 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str21 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass22 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test4387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4387");
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
        java.lang.String str30 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str32 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str37 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertNull(str37);
    }

    @Test
    public void test4388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4388");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str6 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str8 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str19 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str24 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test4389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4389");
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
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str49 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str51 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertNull(str51);
    }

    @Test
    public void test4390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4390");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str12 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.Class<?> wildcardClass25 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test4391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4391");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str6 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str8 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str13 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str18 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str23 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
    }

    @Test
    public void test4392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4392");
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
        java.lang.String str35 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str37 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNull(str37);
    }

    @Test
    public void test4393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4393");
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
        java.lang.String str28 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str30 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str32 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
    }

    @Test
    public void test4394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4394");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 100);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str12 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str17 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test4395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4395");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str6 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str11 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str13 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass14 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4396");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.constant.ConstantDesc, java.lang.constant.ConstantDesc> constantDescLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.constant.ConstantDesc, java.lang.constant.ConstantDesc>((java.lang.Integer) 10);
        java.lang.Class<?> wildcardClass2 = constantDescLFUCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test4397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4397");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str12 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str14 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str19 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str24 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str26 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str26);
    }

    @Test
    public void test4398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4398");
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
        java.lang.String str24 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str29 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str34 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
    }

    @Test
    public void test4399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4399");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str9 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str14 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str19 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str21 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.Class<?> wildcardClass25 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test4400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4400");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str6 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str8 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str10 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str15 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str17 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str19 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass20 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test4401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4401");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Class<?>, java.lang.constant.Constable> wildcardClassLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Class<?>, java.lang.constant.Constable>((java.lang.Integer) 0);
    }

    @Test
    public void test4402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4402");
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
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.Class<?> wildcardClass37 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test4403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4403");
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
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test4404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4404");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str6 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str8 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str10 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str12 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str20 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable21 = null;
        strComparableLFUCache1.put(strComparable21, "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test4405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4405");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str9 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str14 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable15 = null;
        strComparableLFUCache1.put(strComparable15, "");
        java.lang.String str19 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass20 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test4406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4406");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        java.lang.String str3 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str8 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str10 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str15 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str20 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str22 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass23 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test4407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4407");
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
        java.lang.String str25 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable26 = null;
        strComparableLFUCache1.put(strComparable26, "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test4408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4408");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        java.lang.String str3 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str5 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test4409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4409");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.String, java.lang.String> strLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.String, java.lang.String>((java.lang.Integer) 1);
        java.lang.Class<?> wildcardClass2 = strLFUCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test4410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4410");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 10);
        java.lang.String str3 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str5 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str10 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str12 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass13 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4411");
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
        java.lang.Comparable<java.lang.String> strComparable27 = null;
        strComparableLFUCache1.put(strComparable27, "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.Class<?> wildcardClass33 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test4412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4412");
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
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str31 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str36 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass37 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test4413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4413");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        java.lang.String str3 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Comparable<java.lang.String> strComparable10 = null;
        strComparableLFUCache1.put(strComparable10, "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str20 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str31 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
    }

    @Test
    public void test4414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4414");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str9 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str17 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable18 = null;
        strComparableLFUCache1.put(strComparable18, "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str25 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str27 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test4415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4415");
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
        java.lang.String str46 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str48 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!" + "'", str44, "hi!");
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertNull(str48);
    }

    @Test
    public void test4416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4416");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str9 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str23 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str28 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable29 = null;
        java.lang.String str30 = strComparableLFUCache1.get(strComparable29);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str35 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
    }

    @Test
    public void test4417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4417");
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
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test4418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4418");
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
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str40 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
    }

    @Test
    public void test4419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4419");
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
        java.lang.String str42 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str44 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertNull(str44);
    }

    @Test
    public void test4420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4420");
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
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.Class<?> wildcardClass24 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test4421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4421");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.invoke.TypeDescriptor, java.lang.reflect.AnnotatedElement> typeDescriptorLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.invoke.TypeDescriptor, java.lang.reflect.AnnotatedElement>((java.lang.Integer) 10);
        java.lang.Class<?> wildcardClass2 = typeDescriptorLFUCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test4422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4422");
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
        java.lang.String str27 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
    }

    @Test
    public void test4423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4423");
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
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str38 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str40 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str42 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNull(str42);
    }

    @Test
    public void test4424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4424");
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
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Class<?> wildcardClass52 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass52);
    }

    @Test
    public void test4425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4425");
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
        java.lang.String str25 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test4426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4426");
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
        java.lang.String str30 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str32 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.Class<?> wildcardClass36 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test4427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4427");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>, java.lang.Comparable<java.lang.String>> wildcardClassOfFieldLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>, java.lang.Comparable<java.lang.String>>((java.lang.Integer) 1);
        java.lang.Class<?> wildcardClass2 = wildcardClassOfFieldLFUCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test4428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4428");
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
        java.lang.String str33 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str35 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
    }

    @Test
    public void test4429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4429");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.reflect.GenericDeclaration, java.lang.constant.Constable> genericDeclarationLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.reflect.GenericDeclaration, java.lang.constant.Constable>((java.lang.Integer) 10);
    }

    @Test
    public void test4430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4430");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.constant.Constable, java.lang.reflect.Type> constableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.constant.Constable, java.lang.reflect.Type>((java.lang.Integer) (-1));
    }

    @Test
    public void test4431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4431");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str9 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str20 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str25 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test4432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4432");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str6 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str8 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str13 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str18 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str23 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test4433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4433");
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
        java.lang.String str26 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str31 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(str31);
    }

    @Test
    public void test4434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4434");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str24 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
    }

    @Test
    public void test4435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4435");
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
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test4436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4436");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        java.lang.String str3 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str5 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str10 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Class<?> wildcardClass14 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4437");
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
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNull(str44);
    }

    @Test
    public void test4438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4438");
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
        java.lang.String str35 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str37 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str42 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str44 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertNull(str44);
    }

    @Test
    public void test4439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4439");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        java.lang.String str3 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str5 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str19 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test4440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4440");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str9 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str14 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str25 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str30 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
    }

    @Test
    public void test4441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4441");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str12 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str20 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str22 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str24 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str26 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str28 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
    }

    @Test
    public void test4442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4442");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        java.lang.String str3 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str8 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str16 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass17 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test4443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4443");
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
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.Class<?> wildcardClass26 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test4444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4444");
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
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str40 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass41 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test4445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4445");
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
        java.lang.String str26 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str28 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.Comparable<java.lang.String> strComparable32 = null;
        strComparableLFUCache1.put(strComparable32, "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str39 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
    }

    @Test
    public void test4446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4446");
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
        java.lang.String str25 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str27 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str27);
    }

    @Test
    public void test4447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4447");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str12 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str20 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str25 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str27 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str27);
    }

    @Test
    public void test4448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4448");
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
        java.lang.String str30 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass31 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test4449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4449");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 10);
        java.lang.String str3 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str8 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str19 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str21 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.Class<?> wildcardClass25 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test4450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4450");
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
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNull(str38);
    }

    @Test
    public void test4451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4451");
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
        java.lang.String str26 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str31 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str39 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass40 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test4452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4452");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        java.lang.String str3 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str11 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str13 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str15 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str17 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str19 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str21 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test4453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4453");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        java.lang.String str3 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str5 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str7 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str9 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass10 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test4454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4454");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str9 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.Comparable<java.lang.String> strComparable16 = null;
        java.lang.String str17 = strComparableLFUCache1.get(strComparable16);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.Class<?> wildcardClass24 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test4455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4455");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.reflect.GenericDeclaration, java.lang.constant.Constable> genericDeclarationLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.reflect.GenericDeclaration, java.lang.constant.Constable>((java.lang.Integer) 100);
    }

    @Test
    public void test4456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4456");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str9 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str14 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.Comparable<java.lang.String> strComparable24 = null;
        java.lang.String str25 = strComparableLFUCache1.get(strComparable24);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test4457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4457");
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
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
    }

    @Test
    public void test4458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4458");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str6 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str8 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str13 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test4459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4459");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 10);
        java.lang.String str3 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str8 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable9 = null;
        java.lang.String str10 = strComparableLFUCache1.get(strComparable9);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.Comparable<java.lang.String> strComparable14 = null;
        strComparableLFUCache1.put(strComparable14, "");
        java.lang.String str18 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test4460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4460");
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
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str39 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass40 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test4461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4461");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.constant.ConstantDesc, java.lang.Class<?>> constantDescLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.constant.ConstantDesc, java.lang.Class<?>>((java.lang.Integer) 10);
    }

    @Test
    public void test4462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4462");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str9 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str14 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.Comparable<java.lang.String> strComparable24 = null;
        java.lang.String str25 = strComparableLFUCache1.get(strComparable24);
        java.lang.Comparable<java.lang.String> strComparable26 = null;
        strComparableLFUCache1.put(strComparable26, "");
        java.lang.String str30 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str32 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(str32);
    }

    @Test
    public void test4463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4463");
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
        java.lang.String str30 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
    }

    @Test
    public void test4464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4464");
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
        java.lang.String str35 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str35);
    }

    @Test
    public void test4465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4465");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        java.lang.String str3 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str5 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str7 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str15 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass16 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4466");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str12 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str20 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable21 = null;
        strComparableLFUCache1.put(strComparable21, "");
        java.lang.String str25 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test4467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4467");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str6 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str8 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str10 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str15 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str17 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str22 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str24 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
    }

    @Test
    public void test4468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4468");
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
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.Class<?> wildcardClass36 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test4469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4469");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        java.lang.String str3 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str14 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.Class<?> wildcardClass18 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test4470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4470");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str12 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str14 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str19 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.Class<?> wildcardClass26 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test4471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4471");
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
        java.lang.String str31 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(str31);
    }

    @Test
    public void test4472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4472");
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
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str34 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.Class<?> wildcardClass38 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test4473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4473");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str15 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str17 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str19 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str27 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str27);
    }

    @Test
    public void test4474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4474");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str6 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable7 = null;
        strComparableLFUCache1.put(strComparable7, "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.Comparable<java.lang.String> strComparable16 = null;
        java.lang.String str17 = strComparableLFUCache1.get(strComparable16);
        java.lang.Class<?> wildcardClass18 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test4475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4475");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        java.lang.String str3 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str5 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str10 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str12 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str14 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass15 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test4476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4476");
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
        java.lang.String str27 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str29 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str34 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNull(str34);
    }

    @Test
    public void test4477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4477");
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
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNull(str41);
    }

    @Test
    public void test4478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4478");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str12 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test4479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4479");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str15 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str17 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str19 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable20 = null;
        java.lang.String str21 = strComparableLFUCache1.get(strComparable20);
        java.lang.Comparable<java.lang.String> strComparable22 = null;
        strComparableLFUCache1.put(strComparable22, "hi!");
        java.lang.String str26 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str28 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(str28);
    }

    @Test
    public void test4480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4480");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str15 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass16 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4481");
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
        java.lang.String str30 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str32 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
    }

    @Test
    public void test4482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4482");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str6 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str8 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str13 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str15 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str23 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str25 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass26 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test4483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4483");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str6 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str8 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str10 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable11 = null;
        java.lang.String str12 = strComparableLFUCache1.get(strComparable11);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str17 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass18 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test4484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4484");
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
        java.lang.String str31 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
    }

    @Test
    public void test4485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4485");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str6 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str8 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str10 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str15 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str20 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test4486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4486");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str12 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str14 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str19 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str24 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Comparable<java.lang.String> strComparable31 = null;
        java.lang.String str32 = strComparableLFUCache1.get(strComparable31);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str32);
    }

    @Test
    public void test4487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4487");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.CharSequence, java.lang.Class<?>> charSequenceLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.CharSequence, java.lang.Class<?>>((java.lang.Integer) 1);
        java.lang.Class<?> wildcardClass2 = charSequenceLFUCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test4488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4488");
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
        java.lang.String str27 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str32 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
    }

    @Test
    public void test4489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4489");
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
        java.lang.Comparable<java.lang.String> strComparable39 = null;
        java.lang.String str40 = strComparableLFUCache1.get(strComparable39);
        java.lang.String str42 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNull(str42);
    }

    @Test
    public void test4490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4490");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str9 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str17 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass18 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test4491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4491");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str6 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str8 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str10 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str21 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test4492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4492");
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
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str39 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNull(str39);
    }

    @Test
    public void test4493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4493");
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
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Class<?> wildcardClass41 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test4494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4494");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        java.lang.String str3 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str11 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str13 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test4495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4495");
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
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str29 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass30 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test4496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4496");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str6 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str8 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str10 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str15 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str17 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str31 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(str31);
    }

    @Test
    public void test4497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4497");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str9 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str17 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test4498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4498");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str9 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str14 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str16 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str21 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str23 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str25 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Class<?> wildcardClass29 = strComparableLFUCache1.getClass();
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test4499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4499");
        com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableLFUCache1 = new com.thealgorithms.datastructures.caches.LFUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Integer) 1);
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str6 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str8 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str10 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str12 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str14 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str16 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str18 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test4500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4500");
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
        strComparableLFUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str35 = strComparableLFUCache1.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
    }
}

