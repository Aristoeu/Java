package caches;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest16 {

    public static boolean debug = false;

    @Test
    public void test8001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8001");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str5 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str7 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str9 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str14 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str16 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str21 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test8002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8002");
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
        java.lang.String str26 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass27 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test8003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8003");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str11 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str21 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str23 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable24 = null;
        java.lang.String str25 = strComparableMRUCache0.get(strComparable24);
        java.lang.String str27 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test8004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8004");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str8 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable9 = null;
        java.lang.String str10 = strComparableMRUCache0.get(strComparable9);
        java.lang.String str12 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str14 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str25 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str30 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
    }

    @Test
    public void test8005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8005");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        java.lang.String str2 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str19 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable20 = null;
        java.lang.String str21 = strComparableMRUCache0.get(strComparable20);
        java.lang.String str23 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
    }

    @Test
    public void test8006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8006");
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
        java.lang.String str24 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str26 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass27 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test8007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8007");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str8 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str10 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str15 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Class<?> wildcardClass19 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test8008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8008");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str11 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str18 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str26 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
    }

    @Test
    public void test8009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8009");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.constant.ConstantDesc, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>> constantDescMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.constant.ConstantDesc, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>((int) (byte) 100);
        java.lang.Class<?> wildcardClass2 = constantDescMRUCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test8010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8010");
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
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
    }

    @Test
    public void test8011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8011");
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
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test8012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8012");
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
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
    }

    @Test
    public void test8013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8013");
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
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str27 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str29 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Class<?> wildcardClass33 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test8014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8014");
        com.thealgorithms.datastructures.caches.MRUCache<java.io.Serializable, com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>> serializableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.io.Serializable, com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>>((int) ' ');
    }

    @Test
    public void test8015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8015");
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
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str24 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test8016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8016");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str8 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str15 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str20 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test8017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8017");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str8 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str15 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str20 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test8018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8018");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str5 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable6 = null;
        strComparableMRUCache0.put(strComparable6, "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str15 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass16 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test8019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8019");
        com.thealgorithms.datastructures.caches.MRUCache<com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMRUCacheMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>, java.lang.Comparable<java.lang.String>>((int) (byte) 100);
    }

    @Test
    public void test8020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8020");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str11 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str27 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
    }

    @Test
    public void test8021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8021");
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
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test8022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8022");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>((int) 'a');
    }

    @Test
    public void test8023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8023");
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
        java.lang.Class<?> wildcardClass38 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test8024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8024");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str8 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str10 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.Comparable<java.lang.String> strComparable14 = null;
        strComparableMRUCache0.put(strComparable14, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test8025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8025");
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
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
    }

    @Test
    public void test8026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8026");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        java.lang.String str2 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str7 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str9 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str11 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str21 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test8027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8027");
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
        java.lang.String str38 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str40 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
    }

    @Test
    public void test8028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8028");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str11 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable14 = null;
        java.lang.String str15 = strComparableMRUCache0.get(strComparable14);
        java.lang.String str17 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str22 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str24 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str26 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str28 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str30 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
    }

    @Test
    public void test8029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8029");
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
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str33 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
    }

    @Test
    public void test8030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8030");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str11 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str15 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str17 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str19 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str21 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str23 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test8031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8031");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>(1);
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str9 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test8032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8032");
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
        java.lang.Class<?> wildcardClass40 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test8033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8033");
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
        java.lang.Comparable<java.lang.String> strComparable27 = null;
        java.lang.String str28 = strComparableMRUCache0.get(strComparable27);
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.Class<?> wildcardClass32 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test8034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8034");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str11 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str15 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Class<?> wildcardClass25 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test8035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8035");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str5 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str7 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str12 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.Class<?> wildcardClass19 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test8036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8036");
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
        java.lang.String str37 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
    }

    @Test
    public void test8037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8037");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Comparable<java.lang.String> strComparable10 = null;
        strComparableMRUCache0.put(strComparable10, "");
        java.lang.String str14 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str16 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str21 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str23 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str25 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str27 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable28 = null;
        strComparableMRUCache0.put(strComparable28, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
    }

    @Test
    public void test8038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8038");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str17 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str28 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
    }

    @Test
    public void test8039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8039");
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
        java.lang.String str22 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str27 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str29 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str31 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
    }

    @Test
    public void test8040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8040");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str11 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str18 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str23 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.Class<?> wildcardClass27 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test8041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8041");
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
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test8042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8042");
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
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str37 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
    }

    @Test
    public void test8043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8043");
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
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test8044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8044");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Class<?>, com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>> wildcardClassMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Class<?>, com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>>((int) (short) 10);
        java.lang.Class<?> wildcardClass2 = wildcardClassMRUCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test8045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8045");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str8 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str15 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test8046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8046");
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
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str39 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
    }

    @Test
    public void test8047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8047");
        com.thealgorithms.datastructures.caches.MRUCache<java.io.Serializable, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>> serializableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.io.Serializable, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>(10);
    }

    @Test
    public void test8048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8048");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str11 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable14 = null;
        strComparableMRUCache0.put(strComparable14, "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str24 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test8049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8049");
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
        java.lang.String str35 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
    }

    @Test
    public void test8050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8050");
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
        java.lang.String str23 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
    }

    @Test
    public void test8051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8051");
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.datastructures.caches.MRUCache<java.lang.Object, java.lang.CharSequence> objMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Object, java.lang.CharSequence>((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: capacity must greater than 0!");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8052");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.constant.ConstantDesc, java.lang.constant.ConstantDesc> constantDescMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.constant.ConstantDesc, java.lang.constant.ConstantDesc>((int) (short) 100);
    }

    @Test
    public void test8053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8053");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str11 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str21 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.Class<?> wildcardClass28 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test8054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8054");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str8 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str10 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str12 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str14 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass15 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test8055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8055");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((int) (short) 100);
        java.lang.String str3 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str5 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass6 = strComparableMRUCache1.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test8056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8056");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.reflect.AnnotatedElement, java.lang.Object> annotatedElementMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.reflect.AnnotatedElement, java.lang.Object>(1);
    }

    @Test
    public void test8057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8057");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((int) (byte) 1);
        java.lang.String str3 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str5 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test8058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8058");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str20 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str25 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
    }

    @Test
    public void test8059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8059");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        java.lang.String str2 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str7 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str15 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str20 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test8060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8060");
        com.thealgorithms.datastructures.caches.MRUCache<com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>, java.lang.constant.ConstantDesc> strComparableMRUCacheMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>, java.lang.constant.ConstantDesc>((int) (byte) 10);
    }

    @Test
    public void test8061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8061");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((int) ' ');
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        java.lang.String str6 = strComparableMRUCache1.get(strComparable5);
        java.lang.Class<?> wildcardClass7 = strComparableMRUCache1.getClass();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test8062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8062");
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
        java.lang.Comparable<java.lang.String> strComparable26 = null;
        strComparableMRUCache0.put(strComparable26, "");
        java.lang.String str30 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str32 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str34 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str36 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass37 = strComparableMRUCache0.getClass();
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
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test8063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8063");
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
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str34 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.Class<?> wildcardClass38 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test8064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8064");
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
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test8065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8065");
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
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
    }

    @Test
    public void test8066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8066");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Comparable<java.lang.String> strComparable10 = null;
        strComparableMRUCache0.put(strComparable10, "");
        java.lang.String str14 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str16 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str21 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str23 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str28 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test8067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8067");
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
        java.lang.String str38 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
    }

    @Test
    public void test8068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8068");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        java.lang.String str2 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str10 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str12 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str14 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str16 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str18 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str20 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str22 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test8069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8069");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str11 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str19 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str21 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable22 = null;
        java.lang.String str23 = strComparableMRUCache0.get(strComparable22);
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test8070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8070");
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
        java.lang.String str30 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
    }

    @Test
    public void test8071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8071");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str11 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str16 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable17 = null;
        java.lang.String str18 = strComparableMRUCache0.get(strComparable17);
        java.lang.String str20 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test8072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8072");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        java.lang.String str2 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str10 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str15 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str17 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str19 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str24 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
    }

    @Test
    public void test8073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8073");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Object, java.lang.Class<?>> objMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Object, java.lang.Class<?>>((int) (short) 100);
    }

    @Test
    public void test8074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8074");
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
        java.lang.String str31 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str33 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
    }

    @Test
    public void test8075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8075");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str8 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str19 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test8076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8076");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str8 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str10 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test8077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8077");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((int) '#');
        java.lang.String str3 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str8 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str16 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str18 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test8078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8078");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Comparable<java.lang.String> strComparable10 = null;
        strComparableMRUCache0.put(strComparable10, "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
    }

    @Test
    public void test8079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8079");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.constant.ConstantDesc, java.lang.constant.Constable> constantDescMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.constant.ConstantDesc, java.lang.constant.Constable>((int) (byte) 100);
    }

    @Test
    public void test8080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8080");
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
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.Class<?> wildcardClass28 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test8081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8081");
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
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str32 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass33 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test8082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8082");
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
        java.lang.String str23 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str28 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
    }

    @Test
    public void test8083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8083");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((int) '#');
        java.lang.String str3 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str8 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str13 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test8084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8084");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>(1);
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str6 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass7 = strComparableMRUCache1.getClass();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test8085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8085");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((int) '#');
        java.lang.String str3 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Class<?> wildcardClass19 = strComparableMRUCache1.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test8086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8086");
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
        java.lang.String str30 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str32 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str34 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str36 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str38 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable39 = null;
        strComparableMRUCache0.put(strComparable39, "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
    }

    @Test
    public void test8087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8087");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.reflect.Type, java.lang.constant.Constable> typeMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.reflect.Type, java.lang.constant.Constable>(1);
    }

    @Test
    public void test8088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8088");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str11 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str27 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
    }

    @Test
    public void test8089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8089");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        java.lang.String str2 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str10 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str15 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str17 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test8090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8090");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str11 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str18 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Comparable<java.lang.String> strComparable25 = null;
        strComparableMRUCache0.put(strComparable25, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test8091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8091");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str11 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str30 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
    }

    @Test
    public void test8092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8092");
        com.thealgorithms.datastructures.caches.MRUCache<com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>, java.lang.String> strComparableMRUCacheMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>, java.lang.String>(1);
    }

    @Test
    public void test8093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8093");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str11 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str16 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str18 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str20 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str22 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test8094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8094");
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
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.Class<?> wildcardClass29 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test8095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8095");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str11 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str15 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str17 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str19 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass20 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test8096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8096");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str8 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable9 = null;
        java.lang.String str10 = strComparableMRUCache0.get(strComparable9);
        java.lang.String str12 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test8097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8097");
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
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
    }

    @Test
    public void test8098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8098");
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
        java.lang.Comparable<java.lang.String> strComparable40 = null;
        java.lang.String str41 = strComparableMRUCache0.get(strComparable40);
        java.lang.String str43 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
    }

    @Test
    public void test8099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8099");
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
        java.lang.Comparable<java.lang.String> strComparable27 = null;
        strComparableMRUCache0.put(strComparable27, "");
        java.lang.String str31 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
    }

    @Test
    public void test8100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8100");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.constant.Constable, java.lang.reflect.GenericDeclaration> constableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.constant.Constable, java.lang.reflect.GenericDeclaration>((int) (short) 1);
    }

    @Test
    public void test8101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8101");
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
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
    }

    @Test
    public void test8102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8102");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.reflect.AnnotatedElement, java.lang.Object> annotatedElementMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.reflect.AnnotatedElement, java.lang.Object>((int) (byte) 1);
    }

    @Test
    public void test8103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8103");
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
        java.lang.String str32 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str34 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str36 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
    }

    @Test
    public void test8104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8104");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str8 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str10 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.Comparable<java.lang.String> strComparable14 = null;
        strComparableMRUCache0.put(strComparable14, "hi!");
        java.lang.Class<?> wildcardClass17 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test8105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8105");
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
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test8106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8106");
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
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test8107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8107");
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
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str29 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
    }

    @Test
    public void test8108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8108");
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.datastructures.caches.MRUCache<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>, java.lang.Comparable<java.lang.String>> wildcardClassOfFieldMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>, java.lang.Comparable<java.lang.String>>((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: capacity must greater than 0!");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8109");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str8 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str10 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str15 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str20 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass21 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test8110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8110");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.reflect.AnnotatedElement, java.lang.Comparable<java.lang.String>> annotatedElementMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.reflect.AnnotatedElement, java.lang.Comparable<java.lang.String>>((int) (short) 10);
    }

    @Test
    public void test8111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8111");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str5 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable6 = null;
        strComparableMRUCache0.put(strComparable6, "hi!");
        java.lang.String str10 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str18 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass19 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test8112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8112");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str11 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable14 = null;
        java.lang.String str15 = strComparableMRUCache0.get(strComparable14);
        java.lang.String str17 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.Comparable<java.lang.String> strComparable21 = null;
        strComparableMRUCache0.put(strComparable21, "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test8113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8113");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((int) '4');
        java.lang.String str3 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str5 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.Comparable<java.lang.String> strComparable9 = null;
        java.lang.String str10 = strComparableMRUCache1.get(strComparable9);
        java.lang.String str12 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str14 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str16 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test8114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8114");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((int) ' ');
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str6 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str8 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str10 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.Class<?> wildcardClass17 = strComparableMRUCache1.getClass();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test8115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8115");
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
        java.lang.String str27 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test8116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8116");
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
        java.lang.String str27 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test8117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8117");
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
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str30 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str35 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
    }

    @Test
    public void test8118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8118");
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
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test8119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8119");
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
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
    }

    @Test
    public void test8120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8120");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((int) '#');
        java.lang.String str3 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable4 = null;
        java.lang.String str5 = strComparableMRUCache1.get(strComparable4);
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str10 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test8121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8121");
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
        java.lang.String str28 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str30 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
    }

    @Test
    public void test8122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8122");
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
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
    }

    @Test
    public void test8123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8123");
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
        java.lang.String str27 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str29 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass30 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test8124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8124");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str8 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable9 = null;
        java.lang.String str10 = strComparableMRUCache0.get(strComparable9);
        java.lang.String str12 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str14 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str19 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test8125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8125");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str8 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str10 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable11 = null;
        strComparableMRUCache0.put(strComparable11, "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test8126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8126");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((int) '4');
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        java.lang.String str6 = strComparableMRUCache1.get(strComparable5);
        java.lang.String str8 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str10 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str12 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable13 = null;
        java.lang.String str14 = strComparableMRUCache1.get(strComparable13);
        java.lang.String str16 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass17 = strComparableMRUCache1.getClass();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test8127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8127");
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
        java.lang.String str31 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str33 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Comparable<java.lang.String> strComparable37 = null;
        java.lang.String str38 = strComparableMRUCache0.get(strComparable37);
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
    }

    @Test
    public void test8128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8128");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str14 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str19 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str21 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str26 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str28 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
    }

    @Test
    public void test8129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8129");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str14 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str16 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass17 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test8130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8130");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str5 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str7 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str9 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str11 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str15 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test8131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8131");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str5 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str7 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str9 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str11 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test8132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8132");
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
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test8133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8133");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        java.lang.String str2 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str7 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str15 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str23 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test8134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8134");
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
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test8135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8135");
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
        java.lang.Comparable<java.lang.String> strComparable33 = null;
        java.lang.String str34 = strComparableMRUCache0.get(strComparable33);
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str39 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
    }

    @Test
    public void test8136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8136");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str8 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str21 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str23 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
    }

    @Test
    public void test8137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8137");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((int) '4');
        java.lang.String str3 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str5 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str19 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.Class<?> wildcardClass23 = strComparableMRUCache1.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test8138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8138");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        java.lang.String str2 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str10 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str27 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str29 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str31 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
    }

    @Test
    public void test8139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8139");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((int) 'a');
        java.lang.String str3 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str5 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test8140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8140");
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
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test8141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8141");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str8 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str15 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str17 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.Class<?> wildcardClass27 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test8142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8142");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        java.lang.String str2 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str19 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable20 = null;
        java.lang.String str21 = strComparableMRUCache0.get(strComparable20);
        java.lang.String str23 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
    }

    @Test
    public void test8143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8143");
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
        java.lang.String str26 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str28 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str30 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
    }

    @Test
    public void test8144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8144");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.CharSequence, java.lang.constant.ConstantDesc> charSequenceMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.CharSequence, java.lang.constant.ConstantDesc>((int) 'a');
        java.lang.Class<?> wildcardClass2 = charSequenceMRUCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test8145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8145");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str5 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str7 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str9 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test8146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8146");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Comparable<java.lang.String> strComparable10 = null;
        strComparableMRUCache0.put(strComparable10, "");
        java.lang.String str14 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str16 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str27 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test8147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8147");
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
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test8148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8148");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.constant.Constable, java.lang.constant.ConstantDesc> constableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.constant.Constable, java.lang.constant.ConstantDesc>((int) '#');
        java.lang.Class<?> wildcardClass2 = constableMRUCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test8149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8149");
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
        java.lang.String str29 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str31 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
    }

    @Test
    public void test8150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8150");
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
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str33 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
    }

    @Test
    public void test8151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8151");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str11 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str15 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str20 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test8152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8152");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Comparable<java.lang.String> strComparable10 = null;
        strComparableMRUCache0.put(strComparable10, "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str17 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str28 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable29 = null;
        java.lang.String str30 = strComparableMRUCache0.get(strComparable29);
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str35 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
    }

    @Test
    public void test8153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8153");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>(1);
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str9 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str11 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str13 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str15 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test8154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8154");
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
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str30 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str41 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
    }

    @Test
    public void test8155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8155");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str11 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str24 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str26 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str28 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
    }

    @Test
    public void test8156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8156");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str11 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable14 = null;
        strComparableMRUCache0.put(strComparable14, "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test8157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8157");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>(1);
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str6 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str8 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str10 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.Comparable<java.lang.String> strComparable14 = null;
        java.lang.String str15 = strComparableMRUCache1.get(strComparable14);
        java.lang.String str17 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test8158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8158");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.Comparable<java.lang.String> strComparable13 = null;
        strComparableMRUCache0.put(strComparable13, "");
        java.lang.Comparable<java.lang.String> strComparable16 = null;
        strComparableMRUCache0.put(strComparable16, "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str26 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test8159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8159");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str11 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str15 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str20 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str28 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
    }

    @Test
    public void test8160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8160");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str8 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str10 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str12 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str14 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str16 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test8161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8161");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str11 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test8162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8162");
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
        java.lang.Class<?> wildcardClass30 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test8163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8163");
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
        java.lang.String str31 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str33 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
    }

    @Test
    public void test8164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8164");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str11 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str15 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test8165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8165");
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
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test8166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8166");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str5 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable6 = null;
        strComparableMRUCache0.put(strComparable6, "hi!");
        java.lang.String str10 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str15 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str17 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.Class<?> wildcardClass30 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test8167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8167");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str11 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str21 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str23 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test8168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8168");
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
        java.lang.String str32 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
    }

    @Test
    public void test8169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8169");
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
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Comparable<java.lang.String> strComparable36 = null;
        java.lang.String str37 = strComparableMRUCache0.get(strComparable36);
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
    }

    @Test
    public void test8170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8170");
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
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test8171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8171");
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
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str34 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.Class<?> wildcardClass38 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test8172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8172");
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.datastructures.caches.MRUCache<java.lang.invoke.TypeDescriptor, java.lang.Object> typeDescriptorMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.invoke.TypeDescriptor, java.lang.Object>((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: capacity must greater than 0!");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8173");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((int) (byte) 1);
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str6 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str8 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test8174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8174");
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
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test8175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8175");
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
        java.lang.String str28 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str33 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
    }

    @Test
    public void test8176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8176");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Comparable<java.lang.String> strComparable10 = null;
        strComparableMRUCache0.put(strComparable10, "");
        java.lang.String str14 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str22 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str27 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass28 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test8177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8177");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str8 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str15 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str23 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test8178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8178");
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
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Comparable<java.lang.String> strComparable26 = null;
        strComparableMRUCache0.put(strComparable26, "");
        java.lang.String str30 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass31 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test8179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8179");
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
        java.lang.String str24 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str26 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test8180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8180");
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
        java.lang.Class<?> wildcardClass34 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test8181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8181");
        com.thealgorithms.datastructures.caches.MRUCache<java.io.Serializable, java.lang.Comparable<java.lang.String>> serializableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.io.Serializable, java.lang.Comparable<java.lang.String>>((int) (short) 100);
    }

    @Test
    public void test8182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8182");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str8 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str30 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
    }

    @Test
    public void test8183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8183");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.constant.ConstantDesc, java.lang.invoke.TypeDescriptor> constantDescMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.constant.ConstantDesc, java.lang.invoke.TypeDescriptor>(1);
    }

    @Test
    public void test8184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8184");
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
        java.lang.String str29 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str31 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str33 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str35 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
    }

    @Test
    public void test8185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8185");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str5 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str7 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test8186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8186");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        java.lang.String str2 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str7 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str9 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test8187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8187");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.constant.Constable, java.lang.Class<?>> constableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.constant.Constable, java.lang.Class<?>>(1);
        java.lang.Class<?> wildcardClass2 = constableMRUCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test8188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8188");
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
    public void test8189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8189");
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
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str32 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
    }

    @Test
    public void test8190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8190");
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
        java.lang.Comparable<java.lang.String> strComparable30 = null;
        strComparableMRUCache0.put(strComparable30, "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
    }

    @Test
    public void test8191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8191");
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
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
    }

    @Test
    public void test8192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8192");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((int) '#');
        java.lang.String str3 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str8 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str10 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str12 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test8193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8193");
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
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str24 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str26 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str28 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test8194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8194");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str8 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str18 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str20 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str22 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test8195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8195");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Comparable<java.lang.String> strComparable10 = null;
        strComparableMRUCache0.put(strComparable10, "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str17 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str19 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable20 = null;
        strComparableMRUCache0.put(strComparable20, "hi!");
        java.lang.String str24 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable25 = null;
        java.lang.String str26 = strComparableMRUCache0.get(strComparable25);
        java.lang.String str28 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test8196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8196");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>(1);
        java.lang.String str3 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str5 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str10 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str12 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test8197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8197");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str5 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable6 = null;
        strComparableMRUCache0.put(strComparable6, "hi!");
        java.lang.String str10 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str15 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str20 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test8198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8198");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.CharSequence, java.io.Serializable> charSequenceMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.CharSequence, java.io.Serializable>(10);
    }

    @Test
    public void test8199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8199");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str11 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable14 = null;
        strComparableMRUCache0.put(strComparable14, "hi!");
        java.lang.String str18 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str20 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str22 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str24 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
    }

    @Test
    public void test8200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8200");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str5 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str7 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str9 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str11 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.Class<?> wildcardClass24 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test8201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8201");
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
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str37 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
    }

    @Test
    public void test8202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8202");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str8 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str15 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str23 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test8203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8203");
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
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.Comparable<java.lang.String> strComparable32 = null;
        java.lang.String str33 = strComparableMRUCache0.get(strComparable32);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
    }

    @Test
    public void test8204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8204");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str17 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.Class<?> wildcardClass21 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test8205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8205");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str8 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str10 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable11 = null;
        strComparableMRUCache0.put(strComparable11, "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str21 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test8206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8206");
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
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.Class<?> wildcardClass27 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test8207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8207");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str11 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str21 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test8208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8208");
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
        java.lang.Comparable<java.lang.String> strComparable25 = null;
        java.lang.String str26 = strComparableMRUCache0.get(strComparable25);
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(str26);
    }

    @Test
    public void test8209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8209");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        java.lang.String str2 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str7 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.Class<?> wildcardClass11 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test8210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8210");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str11 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable14 = null;
        strComparableMRUCache0.put(strComparable14, "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str21 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass22 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test8211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8211");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str8 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str10 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable11 = null;
        strComparableMRUCache0.put(strComparable11, "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test8212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8212");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>((int) (short) 100);
    }

    @Test
    public void test8213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8213");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str8 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test8214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8214");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.reflect.Type, com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>> typeMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.reflect.Type, com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>>((int) '4');
    }

    @Test
    public void test8215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8215");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str5 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str15 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str17 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str19 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str21 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test8216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8216");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.String, com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>> strMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.String, com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>>((int) (byte) 10);
        java.lang.Class<?> wildcardClass2 = strMRUCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test8217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8217");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((int) '4');
        java.lang.String str3 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str5 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str19 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str21 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str23 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str25 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test8218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8218");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>(10);
        java.lang.Comparable<java.lang.String> strComparable2 = null;
        java.lang.String str3 = strComparableMRUCache1.get(strComparable2);
        java.lang.String str5 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str13 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass14 = strComparableMRUCache1.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test8219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8219");
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
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str26 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str28 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str30 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
    }

    @Test
    public void test8220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8220");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        java.lang.String str2 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str7 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str12 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test8221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8221");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((int) '#');
        java.lang.String str3 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str14 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test8222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8222");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.constant.Constable, java.lang.invoke.TypeDescriptor> constableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.constant.Constable, java.lang.invoke.TypeDescriptor>(10);
    }

    @Test
    public void test8223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8223");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Class<?>, java.lang.CharSequence> wildcardClassMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Class<?>, java.lang.CharSequence>((int) (short) 100);
    }

    @Test
    public void test8224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8224");
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
        java.lang.String str39 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.Comparable<java.lang.String> strComparable43 = null;
        strComparableMRUCache0.put(strComparable43, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
    }

    @Test
    public void test8225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8225");
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
        java.lang.String str23 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str25 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str27 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test8226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8226");
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
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test8227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8227");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str5 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str10 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass11 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test8228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8228");
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.datastructures.caches.MRUCache<java.lang.reflect.AnnotatedElement, com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>> annotatedElementMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.reflect.AnnotatedElement, com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>>((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: capacity must greater than 0!");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8229");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str11 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test8230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8230");
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
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.Class<?> wildcardClass39 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test8231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8231");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str8 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.Class<?> wildcardClass17 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test8232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8232");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.Comparable<java.lang.String> strComparable13 = null;
        strComparableMRUCache0.put(strComparable13, "");
        java.lang.String str17 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test8233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8233");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration> strComparableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration>((int) '4');
    }

    @Test
    public void test8234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8234");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>(10);
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str6 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str8 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test8235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8235");
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
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test8236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8236");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str5 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable6 = null;
        strComparableMRUCache0.put(strComparable6, "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.Class<?> wildcardClass24 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test8237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8237");
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
        java.lang.String str30 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str32 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str37 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
    }

    @Test
    public void test8238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8238");
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
        java.lang.String str27 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass28 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test8239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8239");
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
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.Class<?> wildcardClass34 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test8240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8240");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Class<?>, java.lang.CharSequence> wildcardClassMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Class<?>, java.lang.CharSequence>((int) (byte) 10);
    }

    @Test
    public void test8241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8241");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        java.lang.String str2 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str7 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str9 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test8242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8242");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.invoke.TypeDescriptor, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>> typeDescriptorMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.invoke.TypeDescriptor, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>((int) (short) 1);
    }

    @Test
    public void test8243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8243");
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
        java.lang.String str36 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
    }

    @Test
    public void test8244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8244");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str5 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable6 = null;
        strComparableMRUCache0.put(strComparable6, "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str19 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str21 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str23 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test8245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8245");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.reflect.GenericDeclaration, java.lang.reflect.AnnotatedElement> genericDeclarationMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.reflect.GenericDeclaration, java.lang.reflect.AnnotatedElement>(1);
    }

    @Test
    public void test8246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8246");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str5 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable6 = null;
        strComparableMRUCache0.put(strComparable6, "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Comparable<java.lang.String> strComparable12 = null;
        strComparableMRUCache0.put(strComparable12, "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str22 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass23 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test8247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8247");
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
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str44 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str46 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str51 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!" + "'", str44, "hi!");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "hi!" + "'", str46, "hi!");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
    }

    @Test
    public void test8248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8248");
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
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str52 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
    }

    @Test
    public void test8249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8249");
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
        java.lang.String str24 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass25 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test8250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8250");
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
        java.lang.String str29 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
    }

    @Test
    public void test8251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8251");
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.datastructures.caches.MRUCache<java.lang.CharSequence, java.lang.CharSequence> charSequenceMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.CharSequence, java.lang.CharSequence>((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: capacity must greater than 0!");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8252");
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
        java.lang.Comparable<java.lang.String> strComparable33 = null;
        java.lang.String str34 = strComparableMRUCache0.get(strComparable33);
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
    }

    @Test
    public void test8253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8253");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str5 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str10 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str12 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str17 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass18 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test8254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8254");
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
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test8255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8255");
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
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str37 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
    }

    @Test
    public void test8256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8256");
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
        java.lang.String str27 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str29 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str31 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str33 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
    }

    @Test
    public void test8257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8257");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str5 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str16 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass17 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test8258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8258");
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
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.Comparable<java.lang.String> strComparable29 = null;
        strComparableMRUCache0.put(strComparable29, "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test8259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8259");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str8 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.Comparable<java.lang.String> strComparable12 = null;
        java.lang.String str13 = strComparableMRUCache0.get(strComparable12);
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test8260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8260");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        java.lang.String str2 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str7 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str9 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str11 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.Class<?> wildcardClass24 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test8261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8261");
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
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str26 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str28 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test8262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8262");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str11 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str18 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str23 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass24 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test8263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8263");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str8 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str22 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str27 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test8264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8264");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        java.lang.String str2 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str7 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str9 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str14 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str16 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test8265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8265");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>(1);
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str6 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str8 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str13 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.Comparable<java.lang.String> strComparable23 = null;
        // The following exception was thrown during execution in test generation
        try {
            strComparableMRUCache1.put(strComparable23, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.thealgorithms.datastructures.caches.MRUCache$Entry.setNextEntry(com.thealgorithms.datastructures.caches.MRUCache$Entry)\" because \"this.tail\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test8266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8266");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        java.lang.String str2 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str7 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str9 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str11 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str15 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str17 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass18 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test8267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8267");
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
        java.lang.String str30 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
    }

    @Test
    public void test8268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8268");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str5 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable6 = null;
        strComparableMRUCache0.put(strComparable6, "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Comparable<java.lang.String> strComparable12 = null;
        strComparableMRUCache0.put(strComparable12, "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str19 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str24 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
    }

    @Test
    public void test8269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8269");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.CharSequence, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>> charSequenceMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.CharSequence, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>((int) '4');
        java.lang.Class<?> wildcardClass2 = charSequenceMRUCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test8270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8270");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str8 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str16 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test8271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8271");
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
        java.lang.Comparable<java.lang.String> strComparable34 = null;
        java.lang.String str35 = strComparableMRUCache0.get(strComparable34);
        java.lang.Class<?> wildcardClass36 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test8272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8272");
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
        java.lang.String str29 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str31 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
    }

    @Test
    public void test8273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8273");
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
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str28 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
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
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test8274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8274");
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
        java.lang.String str29 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str31 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
    }

    @Test
    public void test8275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8275");
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
        java.lang.Comparable<java.lang.String> strComparable30 = null;
        java.lang.String str31 = strComparableMRUCache0.get(strComparable30);
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.Comparable<java.lang.String> strComparable35 = null;
        java.lang.String str36 = strComparableMRUCache0.get(strComparable35);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
    }

    @Test
    public void test8276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8276");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Comparable<java.lang.String> strComparable10 = null;
        strComparableMRUCache0.put(strComparable10, "");
        java.lang.String str14 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str16 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str27 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str29 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str34 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
    }

    @Test
    public void test8277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8277");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((int) (byte) 1);
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str6 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str8 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str13 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test8278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8278");
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
        java.lang.String str24 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
    }

    @Test
    public void test8279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8279");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str11 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Comparable<java.lang.String> strComparable20 = null;
        java.lang.String str21 = strComparableMRUCache0.get(strComparable20);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test8280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8280");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((int) '#');
        java.lang.String str3 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str11 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str13 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str15 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str17 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test8281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8281");
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
        java.lang.String str34 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str36 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
    }

    @Test
    public void test8282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8282");
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
        java.lang.Comparable<java.lang.String> strComparable26 = null;
        java.lang.String str27 = strComparableMRUCache0.get(strComparable26);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNull(str27);
    }

    @Test
    public void test8283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8283");
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
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.Comparable<java.lang.String> strComparable34 = null;
        strComparableMRUCache0.put(strComparable34, "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test8284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8284");
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
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str27 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test8285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8285");
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
        java.lang.String str39 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str41 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass42 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test8286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8286");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((int) '#');
        java.lang.String str3 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str5 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str16 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str18 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.Class<?> wildcardClass22 = strComparableMRUCache1.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test8287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8287");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Class<?>, java.lang.Comparable<java.lang.String>> wildcardClassMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Class<?>, java.lang.Comparable<java.lang.String>>((int) (byte) 10);
    }

    @Test
    public void test8288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8288");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.Comparable<java.lang.String> strComparable10 = null;
        strComparableMRUCache0.put(strComparable10, "hi!");
        java.lang.String str14 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str19 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str27 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test8289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8289");
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
        java.lang.Comparable<java.lang.String> strComparable32 = null;
        strComparableMRUCache0.put(strComparable32, "");
        java.lang.String str36 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str38 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
    }

    @Test
    public void test8290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8290");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        java.lang.String str2 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str10 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str12 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test8291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8291");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str8 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str22 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.Class<?> wildcardClass26 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test8292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8292");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str5 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.Comparable<java.lang.String> strComparable12 = null;
        strComparableMRUCache0.put(strComparable12, "hi!");
        java.lang.String str16 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.Comparable<java.lang.String> strComparable20 = null;
        java.lang.String str21 = strComparableMRUCache0.get(strComparable20);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test8293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8293");
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
        java.lang.String str27 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str29 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.Class<?> wildcardClass33 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test8294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8294");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.invoke.TypeDescriptor, java.lang.Class<?>> typeDescriptorMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.invoke.TypeDescriptor, java.lang.Class<?>>((int) ' ');
    }

    @Test
    public void test8295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8295");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>(10);
        java.lang.Comparable<java.lang.String> strComparable2 = null;
        java.lang.String str3 = strComparableMRUCache1.get(strComparable2);
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test8296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8296");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
    }

    @Test
    public void test8297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8297");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        java.lang.String str2 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str7 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str9 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str17 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str22 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str27 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test8298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8298");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str11 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str15 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str20 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test8299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8299");
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
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str42 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass43 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test8300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8300");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        java.lang.String str2 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str10 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str15 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str17 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str19 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test8301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8301");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.Comparable<java.lang.String> strComparable10 = null;
        strComparableMRUCache0.put(strComparable10, "hi!");
        java.lang.String str14 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test8302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8302");
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
        java.lang.String str33 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str41 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
    }

    @Test
    public void test8303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8303");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str17 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test8304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8304");
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
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str32 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
    }

    @Test
    public void test8305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8305");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((int) '#');
        java.lang.String str3 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str8 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str10 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str12 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable13 = null;
        strComparableMRUCache1.put(strComparable13, "");
        java.lang.Class<?> wildcardClass16 = strComparableMRUCache1.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test8306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8306");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.CharSequence, java.lang.constant.Constable> charSequenceMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.CharSequence, java.lang.constant.Constable>((int) (short) 10);
    }

    @Test
    public void test8307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8307");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str5 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str7 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str9 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str14 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str22 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test8308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8308");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((int) (byte) 1);
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        // The following exception was thrown during execution in test generation
        try {
            strComparableMRUCache1.put(strComparable5, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.thealgorithms.datastructures.caches.MRUCache$Entry.setNextEntry(com.thealgorithms.datastructures.caches.MRUCache$Entry)\" because \"this.tail\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8309");
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
        java.lang.String str29 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
    }

    @Test
    public void test8310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8310");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        java.lang.String str2 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str10 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str18 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str23 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
    }

    @Test
    public void test8311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8311");
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
        java.lang.String str28 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
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
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
    }

    @Test
    public void test8312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8312");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str5 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable6 = null;
        strComparableMRUCache0.put(strComparable6, "hi!");
        java.lang.String str10 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable11 = null;
        java.lang.String str12 = strComparableMRUCache0.get(strComparable11);
        java.lang.String str14 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test8313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8313");
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
    public void test8314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8314");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        java.lang.String str2 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str10 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test8315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8315");
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
        java.lang.String str28 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.Comparable<java.lang.String> strComparable32 = null;
        java.lang.String str33 = strComparableMRUCache0.get(strComparable32);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertNull(str33);
    }

    @Test
    public void test8316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8316");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.Comparable<java.lang.String> strComparable10 = null;
        strComparableMRUCache0.put(strComparable10, "hi!");
        java.lang.String str14 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str22 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str24 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test8317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8317");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str5 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str7 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str9 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str11 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test8318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8318");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str8 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str15 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass16 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test8319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8319");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((int) '#');
        java.lang.String str3 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str8 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str13 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test8320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8320");
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
        java.lang.Comparable<java.lang.String> strComparable32 = null;
        java.lang.String str33 = strComparableMRUCache0.get(strComparable32);
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertNull(str33);
    }

    @Test
    public void test8321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8321");
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
        java.lang.Comparable<java.lang.String> strComparable26 = null;
        strComparableMRUCache0.put(strComparable26, "hi!");
        java.lang.Class<?> wildcardClass29 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test8322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8322");
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
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str27 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str29 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str34 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
    }

    @Test
    public void test8323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8323");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        java.lang.String str2 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str7 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str9 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str14 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str19 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str21 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test8324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8324");
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
        java.lang.Class<?> wildcardClass26 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test8325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8325");
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
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
    }

    @Test
    public void test8326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8326");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str8 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str15 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str20 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str25 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str27 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
    }

    @Test
    public void test8327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8327");
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.datastructures.caches.MRUCache<com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>, java.lang.invoke.TypeDescriptor> strComparableMRUCacheMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>, java.lang.invoke.TypeDescriptor>((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: capacity must greater than 0!");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8328");
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
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.Class<?> wildcardClass30 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test8329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8329");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str11 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str15 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str17 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.Comparable<java.lang.String> strComparable21 = null;
        java.lang.String str22 = strComparableMRUCache0.get(strComparable21);
        java.lang.Class<?> wildcardClass23 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test8330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8330");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>(100);
        java.lang.Class<?> wildcardClass2 = wildcardClassMRUCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test8331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8331");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str8 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str10 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.Class<?> wildcardClass17 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test8332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8332");
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
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str24 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
    }

    @Test
    public void test8333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8333");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Comparable<java.lang.String> strComparable10 = null;
        strComparableMRUCache0.put(strComparable10, "");
        java.lang.String str14 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str16 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str21 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str26 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str28 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test8334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8334");
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
        java.lang.String str28 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test8335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8335");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>(10);
        java.lang.String str3 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str11 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test8336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8336");
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
        java.lang.String str26 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str28 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test8337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8337");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>(1);
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str9 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str11 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test8338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8338");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.Comparable<java.lang.String> strComparable10 = null;
        strComparableMRUCache0.put(strComparable10, "hi!");
        java.lang.String str14 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str16 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str24 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str26 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str31 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass32 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test8339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8339");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str8 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str15 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str23 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str25 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str27 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str35 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str37 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass38 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test8340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8340");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str11 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str18 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str23 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str31 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str33 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
    }

    @Test
    public void test8341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8341");
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
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str42 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str47 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
    }

    @Test
    public void test8342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8342");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        java.lang.String str2 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str7 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str9 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str14 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test8343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8343");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str8 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str10 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str21 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str23 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass24 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test8344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8344");
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
        java.lang.String str26 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str28 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str30 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
    }

    @Test
    public void test8345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8345");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.constant.ConstantDesc, java.lang.invoke.TypeDescriptor> constantDescMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.constant.ConstantDesc, java.lang.invoke.TypeDescriptor>((int) (short) 10);
    }

    @Test
    public void test8346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8346");
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
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str28 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass29 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test8347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8347");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str5 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str7 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str9 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str11 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.Class<?> wildcardClass17 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test8348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8348");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>, com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>> wildcardClassOfFieldMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>, com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>>((int) (short) 10);
    }

    @Test
    public void test8349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8349");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.Comparable<java.lang.String> strComparable10 = null;
        strComparableMRUCache0.put(strComparable10, "hi!");
        java.lang.String str14 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.Class<?> wildcardClass24 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test8350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8350");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((int) (short) 10);
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str15 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test8351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8351");
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
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
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
    public void test8352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8352");
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
        java.lang.String str35 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str37 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass38 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test8353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8353");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str11 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str16 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str21 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test8354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8354");
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
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.Class<?> wildcardClass26 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test8355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8355");
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
        java.lang.String str28 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
    }

    @Test
    public void test8356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8356");
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strComparableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: capacity must greater than 0!");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8357");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.reflect.Type, java.lang.Comparable<java.lang.String>> typeMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.reflect.Type, java.lang.Comparable<java.lang.String>>(1);
        java.lang.Class<?> wildcardClass2 = typeMRUCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test8358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8358");
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
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.Class<?> wildcardClass39 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test8359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8359");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Class<?>, java.lang.CharSequence> wildcardClassMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Class<?>, java.lang.CharSequence>((int) (short) 1);
    }

    @Test
    public void test8360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8360");
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
        java.lang.String str30 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
    }

    @Test
    public void test8361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8361");
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
        java.lang.String str22 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test8362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8362");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str11 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str15 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test8363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8363");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((int) (byte) 10);
        java.lang.String str3 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str5 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass6 = strComparableMRUCache1.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test8364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8364");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.CharSequence, java.lang.constant.Constable> charSequenceMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.CharSequence, java.lang.constant.Constable>(10);
    }

    @Test
    public void test8365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8365");
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
        java.lang.String str27 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str29 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str31 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass32 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test8366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8366");
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
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str31 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str39 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
    }

    @Test
    public void test8367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8367");
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
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str34 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
    }

    @Test
    public void test8368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8368");
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
        java.lang.Class<?> wildcardClass28 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test8369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8369");
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
        java.lang.String str25 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass26 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test8370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8370");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str11 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test8371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8371");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Class<?>, java.io.Serializable> wildcardClassMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Class<?>, java.io.Serializable>((int) (byte) 1);
    }

    @Test
    public void test8372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8372");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        java.lang.String str2 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.Comparable<java.lang.String> strComparable6 = null;
        java.lang.String str7 = strComparableMRUCache0.get(strComparable6);
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str21 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test8373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8373");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Class<?>, java.lang.Comparable<java.lang.String>> wildcardClassMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Class<?>, java.lang.Comparable<java.lang.String>>((int) '4');
    }

    @Test
    public void test8374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8374");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str8 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str10 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str12 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str14 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str16 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str18 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test8375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8375");
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
        java.lang.String str30 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass31 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test8376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8376");
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
        java.lang.String str25 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test8377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8377");
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
        java.lang.String str28 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test8378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8378");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((int) (byte) 1);
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str6 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str11 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str13 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str15 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test8379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8379");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str5 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str7 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str12 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str14 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable15 = null;
        java.lang.String str16 = strComparableMRUCache0.get(strComparable15);
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str21 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass22 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test8380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8380");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str11 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str16 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.Class<?> wildcardClass23 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test8381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8381");
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.datastructures.caches.MRUCache<java.lang.Class<?>, com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>> wildcardClassMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Class<?>, com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>>((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: capacity must greater than 0!");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8382");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Class<?>, java.io.Serializable> wildcardClassMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Class<?>, java.io.Serializable>(100);
    }

    @Test
    public void test8383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8383");
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
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str29 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Class<?> wildcardClass33 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test8384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8384");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((int) (byte) 10);
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str6 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str11 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str13 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test8385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8385");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str8 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str15 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str32 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
    }

    @Test
    public void test8386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8386");
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
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str32 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str34 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass35 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test8387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8387");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str5 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str7 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str9 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str11 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str16 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str24 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test8388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8388");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str5 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str7 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str9 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str17 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable18 = null;
        strComparableMRUCache0.put(strComparable18, "hi!");
        java.lang.String str22 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test8389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8389");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        java.lang.String str2 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str10 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str18 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str23 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str25 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
    }

    @Test
    public void test8390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8390");
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
        java.lang.Class<?> wildcardClass27 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test8391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8391");
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
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str33 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str35 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str37 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
    }

    @Test
    public void test8392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8392");
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
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.Class<?> wildcardClass30 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test8393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8393");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
    }

    @Test
    public void test8394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8394");
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
        java.lang.String str24 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str32 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
    }

    @Test
    public void test8395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8395");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str5 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable6 = null;
        strComparableMRUCache0.put(strComparable6, "hi!");
        java.lang.String str10 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str15 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str20 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str22 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test8396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8396");
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
        java.lang.String str29 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Class<?> wildcardClass33 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test8397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8397");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        java.lang.String str2 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str10 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str12 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str14 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str16 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str18 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str20 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test8398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8398");
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
        java.lang.String str27 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
    }

    @Test
    public void test8399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8399");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((int) (short) 100);
        java.lang.String str3 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str5 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str10 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test8400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8400");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str8 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str10 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.Comparable<java.lang.String> strComparable14 = null;
        strComparableMRUCache0.put(strComparable14, "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.Class<?> wildcardClass20 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test8401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8401");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        java.lang.String str2 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str10 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str21 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str23 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable24 = null;
        java.lang.String str25 = strComparableMRUCache0.get(strComparable24);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test8402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8402");
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
        java.lang.String str41 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
    }

    @Test
    public void test8403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8403");
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
        java.lang.String str29 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str31 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
    }

    @Test
    public void test8404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8404");
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
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test8405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8405");
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
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str29 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
    }

    @Test
    public void test8406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8406");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.reflect.Type, java.lang.constant.Constable> typeMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.reflect.Type, java.lang.constant.Constable>((int) '4');
    }

    @Test
    public void test8407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8407");
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
        java.lang.String str44 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
    }

    @Test
    public void test8408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8408");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str11 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str15 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str20 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str28 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str30 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str32 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass33 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test8409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8409");
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
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test8410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8410");
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
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
    }

    @Test
    public void test8411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8411");
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
        java.lang.String str22 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str27 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str29 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass30 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test8412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8412");
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
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str29 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass30 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test8413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8413");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((int) '4');
        java.lang.String str3 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str5 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str10 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test8414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8414");
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
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str39 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass40 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test8415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8415");
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
        java.lang.String str44 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str46 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
    }

    @Test
    public void test8416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8416");
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
        java.lang.Class<?> wildcardClass26 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test8417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8417");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str8 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str15 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test8418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8418");
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
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Class<?> wildcardClass33 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test8419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8419");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        java.lang.String str2 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str7 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str18 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str20 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test8420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8420");
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
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNull(str26);
    }

    @Test
    public void test8421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8421");
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
        java.lang.String str37 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
    }

    @Test
    public void test8422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8422");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str8 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str16 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Class<?> wildcardClass20 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test8423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8423");
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
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str32 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
    }

    @Test
    public void test8424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8424");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str14 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.Class<?> wildcardClass18 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test8425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8425");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Comparable<java.lang.String> strComparable10 = null;
        strComparableMRUCache0.put(strComparable10, "");
        java.lang.String str14 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str16 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str21 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.Class<?> wildcardClass25 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test8426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8426");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str8 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.Comparable<java.lang.String> strComparable12 = null;
        java.lang.String str13 = strComparableMRUCache0.get(strComparable12);
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str21 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test8427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8427");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str14 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str19 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str24 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str32 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
    }

    @Test
    public void test8428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8428");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.Comparable<java.lang.String> strComparable10 = null;
        strComparableMRUCache0.put(strComparable10, "hi!");
        java.lang.String str14 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str19 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str24 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass25 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test8429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8429");
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
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str47 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str52 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "hi!" + "'", str47, "hi!");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
    }

    @Test
    public void test8430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8430");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str11 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test8431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8431");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        java.lang.String str2 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str7 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str9 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str11 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str15 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str20 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test8432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8432");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str14 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Comparable<java.lang.String> strComparable18 = null;
        strComparableMRUCache0.put(strComparable18, "hi!");
        java.lang.Class<?> wildcardClass21 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test8433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8433");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        java.lang.String str2 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str10 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str12 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str23 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str28 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test8434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8434");
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
        java.lang.Comparable<java.lang.String> strComparable21 = null;
        java.lang.String str22 = strComparableMRUCache0.get(strComparable21);
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str27 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test8435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8435");
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
        java.lang.Class<?> wildcardClass28 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test8436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8436");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str8 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str21 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str23 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str28 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
    }

    @Test
    public void test8437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8437");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.reflect.GenericDeclaration, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>> genericDeclarationMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.reflect.GenericDeclaration, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>((int) (byte) 1);
        java.lang.Class<?> wildcardClass2 = genericDeclarationMRUCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test8438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8438");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str11 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str15 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test8439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8439");
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
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test8440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8440");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str11 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str16 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str18 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str20 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test8441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8441");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str8 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str22 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str24 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test8442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8442");
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
        java.lang.String str27 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable28 = null;
        strComparableMRUCache0.put(strComparable28, "hi!");
        java.lang.Class<?> wildcardClass31 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test8443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8443");
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
        java.lang.Class<?> wildcardClass33 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test8444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8444");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str8 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str15 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str17 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test8445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8445");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        java.lang.String str2 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str10 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str15 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str17 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str19 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.Class<?> wildcardClass23 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test8446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8446");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str8 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable14 = null;
        java.lang.String str15 = strComparableMRUCache0.get(strComparable14);
        java.lang.String str17 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str19 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test8447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8447");
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
        java.lang.Comparable<java.lang.String> strComparable22 = null;
        java.lang.String str23 = strComparableMRUCache0.get(strComparable22);
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.Class<?> wildcardClass27 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test8448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8448");
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
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str30 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str32 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str34 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str36 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str38 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
    }

    @Test
    public void test8449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8449");
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
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str40 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
    }

    @Test
    public void test8450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8450");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((int) '#');
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str9 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test8451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8451");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>> strComparableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>((int) 'a');
    }

    @Test
    public void test8452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8452");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        java.lang.String str2 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str7 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str9 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test8453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8453");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
    }

    @Test
    public void test8454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8454");
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
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str32 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
    }

    @Test
    public void test8455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8455");
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
        java.lang.String str29 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str37 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
    }

    @Test
    public void test8456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8456");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>(1);
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str6 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable7 = null;
        java.lang.String str8 = strComparableMRUCache1.get(strComparable7);
        java.lang.String str10 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test8457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8457");
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
        java.lang.String str29 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
    }

    @Test
    public void test8458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8458");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        java.lang.String str2 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test8459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8459");
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
        java.lang.Comparable<java.lang.String> strComparable33 = null;
        strComparableMRUCache0.put(strComparable33, "hi!");
        java.lang.String str37 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass38 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test8460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8460");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>(1);
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str6 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str8 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str10 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str12 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass13 = strComparableMRUCache1.getClass();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test8461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8461");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str5 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str7 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str9 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str11 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass12 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test8462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8462");
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.datastructures.caches.MRUCache<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>, java.lang.constant.Constable> wildcardClassOfFieldMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>, java.lang.constant.Constable>((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: capacity must greater than 0!");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8463");
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
        java.lang.String str23 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str28 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable29 = null;
        java.lang.String str30 = strComparableMRUCache0.get(strComparable29);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
    }

    @Test
    public void test8464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8464");
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
        java.lang.Class<?> wildcardClass21 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test8465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8465");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((int) '4');
        java.lang.String str3 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str5 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test8466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8466");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((int) (byte) 1);
        java.lang.String str3 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str5 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str7 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test8467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8467");
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
        java.lang.Comparable<java.lang.String> strComparable33 = null;
        java.lang.String str34 = strComparableMRUCache0.get(strComparable33);
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str39 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable40 = null;
        java.lang.String str41 = strComparableMRUCache0.get(strComparable40);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
    }

    @Test
    public void test8468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8468");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str8 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.Comparable<java.lang.String> strComparable15 = null;
        java.lang.String str16 = strComparableMRUCache0.get(strComparable15);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test8469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8469");
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
        java.lang.String str42 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
    }

    @Test
    public void test8470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8470");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str8 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str15 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str26 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
    }

    @Test
    public void test8471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8471");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str11 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str18 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str23 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test8472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8472");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        java.lang.String str2 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str7 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str9 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str11 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test8473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8473");
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
        java.lang.Class<?> wildcardClass33 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test8474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8474");
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
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test8475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8475");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str8 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str10 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str12 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str26 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str31 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
    }

    @Test
    public void test8476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8476");
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
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str40 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
    }

    @Test
    public void test8477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8477");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.String, java.lang.constant.Constable> strMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.String, java.lang.constant.Constable>((int) (byte) 10);
    }

    @Test
    public void test8478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8478");
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
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.Class<?> wildcardClass30 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test8479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8479");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str5 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str7 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str9 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.Comparable<java.lang.String> strComparable13 = null;
        java.lang.String str14 = strComparableMRUCache0.get(strComparable13);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test8480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8480");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        java.lang.String str2 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str19 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str21 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test8481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8481");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.constant.Constable> strComparableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.constant.Constable>(10);
    }

    @Test
    public void test8482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8482");
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
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
    }

    @Test
    public void test8483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8483");
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
        java.lang.Comparable<java.lang.String> strComparable31 = null;
        strComparableMRUCache0.put(strComparable31, "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.Class<?> wildcardClass37 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test8484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8484");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str8 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str16 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str18 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test8485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8485");
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
        java.lang.String str34 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass35 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test8486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8486");
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
        java.lang.String str29 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
    }

    @Test
    public void test8487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8487");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str11 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str27 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str29 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str34 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
    }

    @Test
    public void test8488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8488");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>, java.lang.Class<?>> wildcardClassOfFieldMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>, java.lang.Class<?>>((int) (short) 1);
    }

    @Test
    public void test8489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8489");
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
        java.lang.String str27 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test8490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8490");
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.datastructures.caches.MRUCache<java.lang.constant.Constable, java.lang.Comparable<java.lang.String>> constableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.constant.Constable, java.lang.Comparable<java.lang.String>>((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: capacity must greater than 0!");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8491");
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
        java.lang.String str28 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test8492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8492");
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
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.Class<?> wildcardClass27 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test8493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8493");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str8 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str10 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str12 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str17 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test8494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8494");
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
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.Class<?> wildcardClass29 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test8495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8495");
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
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str29 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str31 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
    }

    @Test
    public void test8496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8496");
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
        java.lang.String str30 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str32 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str34 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str36 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
    }

    @Test
    public void test8497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8497");
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
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str40 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
    }

    @Test
    public void test8498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8498");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str8 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.Comparable<java.lang.String> strComparable26 = null;
        strComparableMRUCache0.put(strComparable26, "hi!");
        java.lang.String str30 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable31 = null;
        java.lang.String str32 = strComparableMRUCache0.get(strComparable31);
        java.lang.String str34 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
    }

    @Test
    public void test8499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8499");
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
        java.lang.String str27 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.Class<?> wildcardClass31 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test8500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8500");
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
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str30 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str32 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str34 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str36 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass37 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(wildcardClass37);
    }
}

