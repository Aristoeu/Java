package caches;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest2 {

    public static boolean debug = false;

    @Test
    public void test1001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1001");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.reflect.GenericDeclaration, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>> genericDeclarationMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.reflect.GenericDeclaration, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>((int) (short) 100);
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str8 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str15 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str17 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.Class<?> wildcardClass21 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
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
        java.lang.Class<?> wildcardClass27 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
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
        java.lang.Class<?> wildcardClass32 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
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
        java.lang.Class<?> wildcardClass25 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
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
        java.lang.Class<?> wildcardClass38 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.String, java.lang.reflect.AnnotatedElement> strMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.String, java.lang.reflect.AnnotatedElement>();
        java.lang.Class<?> wildcardClass1 = strMRUCache0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
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
        java.lang.Class<?> wildcardClass28 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Class<?> wildcardClass13 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str5 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str15 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str17 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass18 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        java.lang.String str2 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str7 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str9 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str11 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str18 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable19 = null;
        java.lang.String str20 = strComparableMRUCache0.get(strComparable19);
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.Class<?> wildcardClass24 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
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
        java.lang.Class<?> wildcardClass20 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.constant.ConstantDesc, java.io.Serializable> constantDescMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.constant.ConstantDesc, java.io.Serializable>((int) ' ');
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.datastructures.caches.MRUCache<java.lang.reflect.GenericDeclaration, java.lang.invoke.TypeDescriptor> genericDeclarationMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.reflect.GenericDeclaration, java.lang.invoke.TypeDescriptor>(0);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: capacity must greater than 0!");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str8 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str10 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str12 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str17 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str19 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass20 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
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
        java.lang.Class<?> wildcardClass28 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.datastructures.caches.MRUCache<com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>, java.lang.CharSequence> strComparableMRUCacheMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>, java.lang.CharSequence>((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: capacity must greater than 0!");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.datastructures.caches.MRUCache<java.lang.CharSequence, java.lang.reflect.GenericDeclaration> charSequenceMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.CharSequence, java.lang.reflect.GenericDeclaration>(0);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: capacity must greater than 0!");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1019");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.String, java.io.Serializable> strMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.String, java.io.Serializable>(100);
        java.lang.Class<?> wildcardClass2 = strMRUCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.datastructures.caches.MRUCache<java.lang.reflect.AnnotatedElement, com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>> annotatedElementMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.reflect.AnnotatedElement, com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>>((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: capacity must greater than 0!");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
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
        java.lang.String str27 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass28 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1022");
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
        java.lang.Class<?> wildcardClass30 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1023");
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
        java.lang.Class<?> wildcardClass34 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1024");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.constant.Constable, java.lang.String> constableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.constant.Constable, java.lang.String>((int) (byte) 1);
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1025");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str11 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str15 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str20 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str22 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass23 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.datastructures.caches.MRUCache<java.lang.constant.Constable, java.lang.Comparable<java.lang.String>> constableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.constant.Constable, java.lang.Comparable<java.lang.String>>((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: capacity must greater than 0!");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1027");
        com.thealgorithms.datastructures.caches.MRUCache<java.io.Serializable, java.io.Serializable> serializableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.io.Serializable, java.io.Serializable>((int) (short) 1);
        java.lang.Class<?> wildcardClass2 = serializableMRUCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1028");
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
        java.lang.Class<?> wildcardClass31 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1029");
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.io.Serializable> strComparableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.io.Serializable>((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: capacity must greater than 0!");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1030");
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
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.Class<?> wildcardClass28 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1031");
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.datastructures.caches.MRUCache<java.io.Serializable, java.lang.CharSequence> serializableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.io.Serializable, java.lang.CharSequence>((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: capacity must greater than 0!");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1032");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        java.lang.String str2 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str7 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str9 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str11 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str16 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass17 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1033");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Comparable<java.lang.String> strComparable10 = null;
        strComparableMRUCache0.put(strComparable10, "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Class<?> wildcardClass19 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1034");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>(10);
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1035");
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
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1036");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((int) '4');
        java.lang.String str3 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass4 = strComparableMRUCache1.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1037");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.constant.ConstantDesc, java.lang.constant.ConstantDesc> constantDescMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.constant.ConstantDesc, java.lang.constant.ConstantDesc>((int) (short) 10);
        java.lang.Class<?> wildcardClass2 = constantDescMRUCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1038");
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
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str43 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1039");
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
        java.lang.String str24 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str26 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str28 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str30 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1040");
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
        java.lang.Class<?> wildcardClass30 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1041");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((int) '#');
        java.lang.String str3 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str11 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.Class<?> wildcardClass15 = strComparableMRUCache1.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1042");
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
        java.lang.Class<?> wildcardClass23 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1043");
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
        java.lang.Comparable<java.lang.String> strComparable35 = null;
        strComparableMRUCache0.put(strComparable35, "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1044");
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
        java.lang.Class<?> wildcardClass26 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1045");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str5 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str7 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str9 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Class<?> wildcardClass19 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1046");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.Class<?> wildcardClass19 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1047");
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
        java.lang.Class<?> wildcardClass29 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1048");
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
        java.lang.Class<?> wildcardClass25 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1049");
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
        java.lang.String str24 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str26 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str28 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass29 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1050");
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.datastructures.caches.MRUCache<java.lang.reflect.AnnotatedElement, java.lang.invoke.TypeDescriptor> annotatedElementMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.reflect.AnnotatedElement, java.lang.invoke.TypeDescriptor>(0);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: capacity must greater than 0!");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1051");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.String, java.lang.Comparable<java.lang.String>> strMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.String, java.lang.Comparable<java.lang.String>>(1);
        java.lang.Class<?> wildcardClass2 = strMRUCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1052");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str8 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable9 = null;
        java.lang.String str10 = strComparableMRUCache0.get(strComparable9);
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.Class<?> wildcardClass14 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1053");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        java.lang.String str2 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str10 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass11 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1054");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((int) '#');
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.Class<?> wildcardClass11 = strComparableMRUCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1055");
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.datastructures.caches.MRUCache<java.lang.constant.Constable, com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>> constableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.constant.Constable, com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>>(0);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: capacity must greater than 0!");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1056");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.String, java.lang.Class<?>> strMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.String, java.lang.Class<?>>((int) (short) 1);
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1057");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>(1);
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.Class<?> wildcardClass14 = strComparableMRUCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1058");
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
        java.lang.Comparable<java.lang.String> strComparable35 = null;
        strComparableMRUCache0.put(strComparable35, "");
        java.lang.Class<?> wildcardClass38 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1059");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Comparable<java.lang.String> strComparable10 = null;
        strComparableMRUCache0.put(strComparable10, "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str17 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1060");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Object, java.lang.CharSequence> objMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Object, java.lang.CharSequence>(10);
        java.lang.Class<?> wildcardClass2 = objMRUCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1061");
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
        java.lang.Class<?> wildcardClass24 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1062");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Object, java.lang.reflect.AnnotatedElement> objMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Object, java.lang.reflect.AnnotatedElement>();
        java.lang.Class<?> wildcardClass1 = objMRUCache0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1063");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.constant.ConstantDesc, java.lang.reflect.Type> constantDescMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.constant.ConstantDesc, java.lang.reflect.Type>((int) (byte) 1);
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1064");
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
        java.lang.String str31 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1065");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>(1);
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str6 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str8 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str10 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1066");
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
        java.lang.Class<?> wildcardClass26 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1067");
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.datastructures.caches.MRUCache<java.io.Serializable, java.lang.reflect.AnnotatedElement> serializableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.io.Serializable, java.lang.reflect.AnnotatedElement>((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: capacity must greater than 0!");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1068");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str8 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.Comparable<java.lang.String> strComparable12 = null;
        strComparableMRUCache0.put(strComparable12, "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.Class<?> wildcardClass18 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1069");
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
        java.lang.Class<?> wildcardClass29 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1070");
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
        java.lang.Class<?> wildcardClass33 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1071");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.invoke.TypeDescriptor, java.lang.constant.Constable> typeDescriptorMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.invoke.TypeDescriptor, java.lang.constant.Constable>((int) 'a');
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1072");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str11 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str16 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str18 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass19 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1073");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str5 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass6 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1074");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((int) (short) 100);
        java.lang.String str3 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str5 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass6 = strComparableMRUCache1.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1075");
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
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str30 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1076");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str5 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable6 = null;
        strComparableMRUCache0.put(strComparable6, "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Comparable<java.lang.String> strComparable12 = null;
        strComparableMRUCache0.put(strComparable12, "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.Class<?> wildcardClass18 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1077");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.invoke.TypeDescriptor, java.io.Serializable> typeDescriptorMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.invoke.TypeDescriptor, java.io.Serializable>();
        java.lang.Class<?> wildcardClass1 = typeDescriptorMRUCache0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1078");
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
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Class<?> wildcardClass25 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1079");
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.datastructures.caches.MRUCache<java.io.Serializable, java.lang.reflect.AnnotatedElement> serializableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.io.Serializable, java.lang.reflect.AnnotatedElement>((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: capacity must greater than 0!");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1080");
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
        java.lang.Class<?> wildcardClass34 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1081");
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
        java.lang.Class<?> wildcardClass26 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1082");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str5 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str7 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str9 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str11 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str16 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.Class<?> wildcardClass20 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1083");
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
        java.lang.Class<?> wildcardClass25 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1084");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.constant.ConstantDesc, java.lang.String> constantDescMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.constant.ConstantDesc, java.lang.String>((int) (short) 1);
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1085");
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
        java.lang.Class<?> wildcardClass26 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1086");
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.datastructures.caches.MRUCache<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>, java.lang.CharSequence> wildcardClassOfFieldMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>, java.lang.CharSequence>(0);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: capacity must greater than 0!");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1087");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str26 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1088");
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.datastructures.caches.MRUCache<java.lang.Class<?>, com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>> wildcardClassMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Class<?>, com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>>((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: capacity must greater than 0!");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1089");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str8 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str10 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass11 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1090");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        java.lang.String str2 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str7 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str9 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.Class<?> wildcardClass16 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1091");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((int) '#');
        java.lang.String str3 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str5 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1092");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.constant.Constable, java.lang.String> constableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.constant.Constable, java.lang.String>((int) '#');
        java.lang.Class<?> wildcardClass2 = constableMRUCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1093");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((int) (short) 10);
        java.lang.Class<?> wildcardClass2 = strComparableMRUCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1094");
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
        java.lang.Class<?> wildcardClass31 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1095");
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
        java.lang.Class<?> wildcardClass21 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1096");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.reflect.Type, java.lang.reflect.Type> typeMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.reflect.Type, java.lang.reflect.Type>();
        java.lang.Class<?> wildcardClass1 = typeMRUCache0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1097");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>(1);
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str6 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str8 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str10 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str12 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str14 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1098");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((int) '#');
        java.lang.String str3 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str8 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str10 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str12 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str14 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.Class<?> wildcardClass18 = strComparableMRUCache1.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1099");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        java.lang.String str2 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str7 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str18 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass19 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1100");
        com.thealgorithms.datastructures.caches.MRUCache<com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>, java.lang.Object> strComparableMRUCacheMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>, java.lang.Object>((int) (short) 1);
        java.lang.Class<?> wildcardClass2 = strComparableMRUCacheMRUCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1101");
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.datastructures.caches.MRUCache<java.lang.Class<?>, java.lang.reflect.Type> wildcardClassMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Class<?>, java.lang.reflect.Type>((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: capacity must greater than 0!");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1102");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str17 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.Class<?> wildcardClass21 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1103");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        java.lang.String str2 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str7 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str9 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str11 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str18 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str23 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1104");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.invoke.TypeDescriptor, java.lang.Comparable<java.lang.String>> typeDescriptorMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.invoke.TypeDescriptor, java.lang.Comparable<java.lang.String>>();
        java.lang.Class<?> wildcardClass1 = typeDescriptorMRUCache0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1105");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str8 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str10 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str15 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str17 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str22 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass23 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1106");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.reflect.AnnotatedElement, java.lang.constant.Constable> annotatedElementMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.reflect.AnnotatedElement, java.lang.constant.Constable>(1);
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1107");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strComparableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>((int) (short) 1);
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1108");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.Class<?> wildcardClass25 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1109");
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
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Class<?> wildcardClass27 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1110");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str26 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass27 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1111");
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.datastructures.caches.MRUCache<java.lang.String, java.lang.Comparable<java.lang.String>> strMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.String, java.lang.Comparable<java.lang.String>>((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: capacity must greater than 0!");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1112");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.invoke.TypeDescriptor, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>> typeDescriptorMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.invoke.TypeDescriptor, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>();
        java.lang.Class<?> wildcardClass1 = typeDescriptorMRUCache0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1113");
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
        java.lang.String str24 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1114");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>(1);
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1115");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.constant.ConstantDesc, java.lang.String> constantDescMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.constant.ConstantDesc, java.lang.String>((int) (short) 10);
        java.lang.Class<?> wildcardClass2 = constantDescMRUCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1116");
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.datastructures.caches.MRUCache<java.lang.CharSequence, com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>> charSequenceMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.CharSequence, com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>>((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: capacity must greater than 0!");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1117");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str5 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str7 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str12 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass13 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1118");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>(1);
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str9 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str11 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1119");
        com.thealgorithms.datastructures.caches.MRUCache<java.io.Serializable, com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>> serializableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.io.Serializable, com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>>((int) 'a');
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1120");
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.datastructures.caches.MRUCache<java.lang.String, java.lang.reflect.AnnotatedElement> strMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.String, java.lang.reflect.AnnotatedElement>((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: capacity must greater than 0!");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1121");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str8 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1122");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str5 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str7 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str9 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.Class<?> wildcardClass16 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1123");
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.datastructures.caches.MRUCache<java.lang.CharSequence, java.lang.CharSequence> charSequenceMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.CharSequence, java.lang.CharSequence>((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: capacity must greater than 0!");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1124");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        java.lang.String str2 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str7 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str9 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str14 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1125");
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
        java.lang.String str28 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass29 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1126");
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
        java.lang.String str27 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str29 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str31 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass32 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1127");
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
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1128");
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
        java.lang.Class<?> wildcardClass25 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1129");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((int) '#');
        java.lang.String str3 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass4 = strComparableMRUCache1.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1130");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        java.lang.String str2 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str10 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str15 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass16 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1131");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.Comparable<java.lang.String> strComparable4 = null;
        strComparableMRUCache0.put(strComparable4, "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.Class<?> wildcardClass10 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1132");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((int) (short) 1);
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str6 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass7 = strComparableMRUCache1.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1133");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.constant.ConstantDesc> strComparableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.constant.ConstantDesc>((int) (byte) 1);
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1134");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        java.lang.String str2 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str7 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Class<?> wildcardClass17 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1135");
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
        java.lang.String str22 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1136");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str8 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable14 = null;
        java.lang.String str15 = strComparableMRUCache0.get(strComparable14);
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.Class<?> wildcardClass22 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1137");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str11 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Class<?> wildcardClass15 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1138");
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
        java.lang.Class<?> wildcardClass24 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1139");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.reflect.Type, java.lang.Object> typeMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.reflect.Type, java.lang.Object>();
        java.lang.Class<?> wildcardClass1 = typeMRUCache0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1140");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str5 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.Class<?> wildcardClass9 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1141");
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
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.Class<?> wildcardClass30 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1142");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((int) '#');
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str9 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass10 = strComparableMRUCache1.getClass();
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1143");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.constant.Constable, java.lang.String> constableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.constant.Constable, java.lang.String>();
        java.lang.Class<?> wildcardClass1 = constableMRUCache0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1144");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str11 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str16 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.Class<?> wildcardClass23 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1145");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str8 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.Class<?> wildcardClass18 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1146");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str11 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str15 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str17 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str19 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str24 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass25 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1147");
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
        java.lang.Class<?> wildcardClass24 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1148");
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.datastructures.caches.MRUCache<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: capacity must greater than 0!");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1149");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Object, java.lang.constant.ConstantDesc> objMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Object, java.lang.constant.ConstantDesc>((int) (byte) 10);
        java.lang.Class<?> wildcardClass2 = objMRUCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1150");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str11 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str15 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str20 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass21 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1151");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str5 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str7 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str9 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1152");
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
        java.lang.Class<?> wildcardClass22 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1153");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str5 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str7 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str9 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str11 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str16 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str21 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass22 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1154");
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
        java.lang.Class<?> wildcardClass23 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1155");
        com.thealgorithms.datastructures.caches.MRUCache<com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>, java.lang.String> strComparableMRUCacheMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>, java.lang.String>((int) (byte) 10);
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1156");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str8 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str10 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str12 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str17 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str19 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str21 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass22 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1157");
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
        java.lang.String str33 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass34 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1158");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.reflect.GenericDeclaration, java.io.Serializable> genericDeclarationMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.reflect.GenericDeclaration, java.io.Serializable>((int) '#');
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1159");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.reflect.Type, java.lang.String> typeMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.reflect.Type, java.lang.String>((int) (short) 10);
        java.lang.Class<?> wildcardClass2 = typeMRUCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1160");
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
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Class<?> wildcardClass25 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1161");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str5 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str7 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str9 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str11 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str21 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass22 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1162");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str11 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str15 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str17 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass18 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1163");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str11 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str15 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str17 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str22 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str27 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass28 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1164");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str11 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Class<?> wildcardClass18 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1165");
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
        java.lang.Class<?> wildcardClass25 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1166");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str11 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str18 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.Class<?> wildcardClass22 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1167");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str5 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str10 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass11 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1168");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Class<?>, java.lang.String> wildcardClassMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Class<?>, java.lang.String>(1);
        java.lang.Class<?> wildcardClass2 = wildcardClassMRUCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1169");
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
        java.lang.String str25 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1170");
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
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Class<?> wildcardClass26 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1171");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        java.lang.String str2 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str7 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str9 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str11 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.Class<?> wildcardClass15 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1172");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.reflect.GenericDeclaration, java.lang.reflect.Type> genericDeclarationMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.reflect.GenericDeclaration, java.lang.reflect.Type>((int) '#');
        java.lang.Class<?> wildcardClass2 = genericDeclarationMRUCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1173");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.String, java.lang.constant.Constable> strMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.String, java.lang.constant.Constable>((int) (byte) 1);
        java.lang.Class<?> wildcardClass2 = strMRUCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1174");
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.datastructures.caches.MRUCache<com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>, com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>> strComparableMRUCacheMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>, com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>>((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: capacity must greater than 0!");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1175");
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
        java.lang.Class<?> wildcardClass23 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1176");
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
        java.lang.Class<?> wildcardClass33 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1177");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str8 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str10 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str12 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.Class<?> wildcardClass22 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1178");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str8 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str10 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str15 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str17 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str19 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass20 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1179");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>, java.io.Serializable> wildcardClassOfFieldMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>, java.io.Serializable>(1);
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1180");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        java.lang.String str2 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str7 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str9 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str11 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.Class<?> wildcardClass15 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1181");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str14 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass15 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1182");
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.datastructures.caches.MRUCache<java.lang.invoke.TypeDescriptor, java.lang.CharSequence> typeDescriptorMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.invoke.TypeDescriptor, java.lang.CharSequence>((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: capacity must greater than 0!");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1183");
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.datastructures.caches.MRUCache<java.lang.constant.ConstantDesc, java.lang.CharSequence> constantDescMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.constant.ConstantDesc, java.lang.CharSequence>((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: capacity must greater than 0!");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1184");
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
        java.lang.Class<?> wildcardClass24 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1185");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.reflect.Type> strComparableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.reflect.Type>((int) ' ');
        java.lang.Class<?> wildcardClass2 = strComparableMRUCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1186");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.constant.ConstantDesc, java.lang.reflect.AnnotatedElement> constantDescMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.constant.ConstantDesc, java.lang.reflect.AnnotatedElement>((int) (byte) 100);
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1187");
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.datastructures.caches.MRUCache<java.lang.constant.ConstantDesc, java.lang.reflect.GenericDeclaration> constantDescMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.constant.ConstantDesc, java.lang.reflect.GenericDeclaration>((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: capacity must greater than 0!");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1188");
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.datastructures.caches.MRUCache<java.lang.constant.Constable, java.lang.CharSequence> constableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.constant.Constable, java.lang.CharSequence>((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: capacity must greater than 0!");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1189");
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.datastructures.caches.MRUCache<java.lang.constant.Constable, java.lang.Class<?>> constableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.constant.Constable, java.lang.Class<?>>((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: capacity must greater than 0!");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1190");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.Comparable<java.lang.String> strComparable10 = null;
        strComparableMRUCache0.put(strComparable10, "hi!");
        java.lang.String str14 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str19 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1191");
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
        java.lang.Class<?> wildcardClass26 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1192");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Class<?>, java.lang.Comparable<java.lang.String>> wildcardClassMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Class<?>, java.lang.Comparable<java.lang.String>>();
        java.lang.Class<?> wildcardClass1 = wildcardClassMRUCache0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1193");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str5 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str7 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str9 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str14 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass15 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1194");
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
        java.lang.Class<?> wildcardClass28 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1195");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>> strComparableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>>((int) (byte) 10);
    }

    @Test
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1196");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        java.lang.String str2 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str10 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.Class<?> wildcardClass20 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1197");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str11 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.Class<?> wildcardClass23 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1198");
        com.thealgorithms.datastructures.caches.MRUCache<java.io.Serializable, java.lang.reflect.GenericDeclaration> serializableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.io.Serializable, java.lang.reflect.GenericDeclaration>((int) (byte) 100);
    }

    @Test
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1199");
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
        java.lang.Class<?> wildcardClass29 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1200");
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.invoke.TypeDescriptor> strComparableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.invoke.TypeDescriptor>(0);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: capacity must greater than 0!");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1201");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str8 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str15 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str17 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass18 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1202");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str11 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str16 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str18 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Class<?> wildcardClass22 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1203");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str5 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.Class<?> wildcardClass12 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1204");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str11 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1205");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str11 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str18 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.Class<?> wildcardClass22 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1206");
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.datastructures.caches.MRUCache<java.lang.reflect.AnnotatedElement, java.lang.CharSequence> annotatedElementMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.reflect.AnnotatedElement, java.lang.CharSequence>(0);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: capacity must greater than 0!");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1207");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str8 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str18 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.Class<?> wildcardClass22 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1208");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str14 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.Comparable<java.lang.String> strComparable18 = null;
        java.lang.String str19 = strComparableMRUCache0.get(strComparable18);
        java.lang.Class<?> wildcardClass20 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1209");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.reflect.AnnotatedElement> strComparableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.reflect.AnnotatedElement>((int) (short) 1);
        java.lang.Class<?> wildcardClass2 = strComparableMRUCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1210");
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
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1211");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Object, java.lang.reflect.GenericDeclaration> objMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Object, java.lang.reflect.GenericDeclaration>(10);
        java.lang.Class<?> wildcardClass2 = objMRUCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1212");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str8 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str18 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str23 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass24 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1213");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((int) '#');
        java.lang.String str3 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str8 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass9 = strComparableMRUCache1.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1214");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.io.Serializable> strComparableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.io.Serializable>((int) (byte) 10);
    }

    @Test
    public void test1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1215");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str5 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable6 = null;
        strComparableMRUCache0.put(strComparable6, "hi!");
        java.lang.String str10 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str15 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str17 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass18 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1216");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str5 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str7 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str9 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str11 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1217");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        java.lang.String str2 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str10 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str12 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str14 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str16 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass17 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1218");
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
        java.lang.Class<?> wildcardClass26 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1219");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str5 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str7 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str12 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass13 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1220");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((int) 'a');
        java.lang.String str3 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass4 = strComparableMRUCache1.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1221");
        com.thealgorithms.datastructures.caches.MRUCache<com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>, java.io.Serializable> strComparableMRUCacheMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>, java.io.Serializable>((int) 'a');
    }

    @Test
    public void test1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1222");
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
        java.lang.Class<?> wildcardClass29 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1223");
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
        java.lang.Class<?> wildcardClass27 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test1224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1224");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.invoke.TypeDescriptor, java.lang.constant.ConstantDesc> typeDescriptorMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.invoke.TypeDescriptor, java.lang.constant.ConstantDesc>();
        java.lang.Class<?> wildcardClass1 = typeDescriptorMRUCache0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test1225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1225");
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.datastructures.caches.MRUCache<java.lang.CharSequence, java.lang.CharSequence> charSequenceMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.CharSequence, java.lang.CharSequence>((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: capacity must greater than 0!");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1226");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.reflect.Type, java.lang.CharSequence> typeMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.reflect.Type, java.lang.CharSequence>((int) (byte) 10);
        java.lang.Class<?> wildcardClass2 = typeMRUCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test1227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1227");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str14 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass15 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1228");
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
        java.lang.Class<?> wildcardClass33 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test1229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1229");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str11 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str15 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test1230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1230");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str5 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str15 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass16 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1231");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.reflect.AnnotatedElement, com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>> annotatedElementMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.reflect.AnnotatedElement, com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>>((int) ' ');
        java.lang.Class<?> wildcardClass2 = annotatedElementMRUCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test1232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1232");
        com.thealgorithms.datastructures.caches.MRUCache<com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>, java.lang.Class<?>> strComparableMRUCacheMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>, java.lang.Class<?>>((int) (short) 1);
    }

    @Test
    public void test1233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1233");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str11 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str18 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable19 = null;
        strComparableMRUCache0.put(strComparable19, "");
        java.lang.Class<?> wildcardClass22 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1234");
        com.thealgorithms.datastructures.caches.MRUCache<com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>, java.lang.String> strComparableMRUCacheMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>, java.lang.String>((int) (byte) 1);
        java.lang.Class<?> wildcardClass2 = strComparableMRUCacheMRUCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test1235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1235");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str5 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str7 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str9 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str11 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str16 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str18 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str20 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass21 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1236");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str11 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str16 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Class<?> wildcardClass20 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1237");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Object, java.lang.reflect.Type> objMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Object, java.lang.reflect.Type>((int) (byte) 1);
        java.lang.Class<?> wildcardClass2 = objMRUCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test1238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1238");
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.datastructures.caches.MRUCache<java.lang.reflect.Type, java.lang.Comparable<java.lang.String>> typeMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.reflect.Type, java.lang.Comparable<java.lang.String>>(0);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: capacity must greater than 0!");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1239");
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
        java.lang.Class<?> wildcardClass27 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test1240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1240");
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
        java.lang.Class<?> wildcardClass23 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1241");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str5 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable6 = null;
        strComparableMRUCache0.put(strComparable6, "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str16 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str21 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass22 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1242");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.reflect.GenericDeclaration, java.lang.Object> genericDeclarationMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.reflect.GenericDeclaration, java.lang.Object>((int) (short) 1);
    }

    @Test
    public void test1243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1243");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str17 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str22 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test1244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1244");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Class<?>, java.lang.constant.Constable> wildcardClassMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Class<?>, java.lang.constant.Constable>((int) '#');
        java.lang.Class<?> wildcardClass2 = wildcardClassMRUCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test1245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1245");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Class<?>, java.lang.String> wildcardClassMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Class<?>, java.lang.String>((int) '#');
    }

    @Test
    public void test1246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1246");
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
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str29 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass30 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test1247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1247");
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.datastructures.caches.MRUCache<java.lang.Object, java.lang.invoke.TypeDescriptor> objMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Object, java.lang.invoke.TypeDescriptor>(0);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: capacity must greater than 0!");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1248");
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
        java.lang.String str25 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass26 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test1249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1249");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        java.lang.String str2 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str7 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str9 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str14 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1250");
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
        java.lang.Class<?> wildcardClass24 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1251");
        com.thealgorithms.datastructures.caches.MRUCache<java.io.Serializable, java.lang.String> serializableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.io.Serializable, java.lang.String>((int) ' ');
    }

    @Test
    public void test1252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1252");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.reflect.AnnotatedElement, java.lang.reflect.GenericDeclaration> annotatedElementMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.reflect.AnnotatedElement, java.lang.reflect.GenericDeclaration>((int) '4');
    }

    @Test
    public void test1253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1253");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Object, java.lang.String> objMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Object, java.lang.String>(100);
        java.lang.Class<?> wildcardClass2 = objMRUCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test1254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1254");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.reflect.AnnotatedElement, java.lang.constant.ConstantDesc> annotatedElementMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.reflect.AnnotatedElement, java.lang.constant.ConstantDesc>(1);
    }

    @Test
    public void test1255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1255");
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
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
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
    public void test1256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1256");
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
        java.lang.Class<?> wildcardClass27 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test1257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1257");
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
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str40 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass41 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test1258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1258");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        java.lang.String str2 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str7 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str9 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str11 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.Class<?> wildcardClass20 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1259");
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
        java.lang.Class<?> wildcardClass27 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test1260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1260");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str11 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass12 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1261");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((int) '4');
        java.lang.String str3 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str5 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str19 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass20 = strComparableMRUCache1.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1262");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str8 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str10 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str12 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.Class<?> wildcardClass25 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1263");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((int) '#');
        java.lang.String str3 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str11 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass12 = strComparableMRUCache1.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1264");
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.datastructures.caches.MRUCache<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: capacity must greater than 0!");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1265");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str17 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass18 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1266");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str8 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1267");
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
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.Class<?> wildcardClass31 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1268");
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
        java.lang.Class<?> wildcardClass28 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1269");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>(1);
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
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
    public void test1270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1270");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.Comparable<java.lang.String> strComparable10 = null;
        strComparableMRUCache0.put(strComparable10, "hi!");
        java.lang.String str14 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str16 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass17 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1271");
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
        java.lang.Class<?> wildcardClass27 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test1272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1272");
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
        java.lang.Class<?> wildcardClass26 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test1273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1273");
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.datastructures.caches.MRUCache<java.io.Serializable, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>> serializableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.io.Serializable, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: capacity must greater than 0!");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1274");
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.datastructures.caches.MRUCache<java.lang.reflect.AnnotatedElement, java.lang.invoke.TypeDescriptor> annotatedElementMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.reflect.AnnotatedElement, java.lang.invoke.TypeDescriptor>((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: capacity must greater than 0!");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1275");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.invoke.TypeDescriptor, java.lang.String> typeDescriptorMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.invoke.TypeDescriptor, java.lang.String>((int) '#');
    }

    @Test
    public void test1276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1276");
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
        java.lang.String str23 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass24 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1277");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.reflect.AnnotatedElement, java.lang.String> annotatedElementMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.reflect.AnnotatedElement, java.lang.String>((int) (byte) 10);
    }

    @Test
    public void test1278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1278");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((int) '#');
        java.lang.String str3 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str8 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str10 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str12 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str14 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str19 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test1279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1279");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.invoke.TypeDescriptor, java.lang.constant.ConstantDesc> typeDescriptorMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.invoke.TypeDescriptor, java.lang.constant.ConstantDesc>((int) (byte) 100);
    }

    @Test
    public void test1280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1280");
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
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test1281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1281");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>(10);
        java.lang.Comparable<java.lang.String> strComparable2 = null;
        java.lang.String str3 = strComparableMRUCache1.get(strComparable2);
        java.lang.String str5 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str10 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str12 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str14 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test1282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1282");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str11 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.Class<?> wildcardClass18 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1283");
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
        java.lang.Class<?> wildcardClass36 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test1284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1284");
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
        java.lang.Class<?> wildcardClass27 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test1285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1285");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.constant.ConstantDesc, java.lang.invoke.TypeDescriptor> constantDescMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.constant.ConstantDesc, java.lang.invoke.TypeDescriptor>(10);
        java.lang.Class<?> wildcardClass2 = constantDescMRUCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test1286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1286");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>, java.lang.Comparable<java.lang.String>> wildcardClassOfFieldMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>, java.lang.Comparable<java.lang.String>>((int) (short) 10);
        java.lang.Class<?> wildcardClass2 = wildcardClassOfFieldMRUCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test1287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1287");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str5 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str7 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str9 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str11 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
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
    public void test1288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1288");
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.datastructures.caches.MRUCache<java.lang.constant.ConstantDesc, java.lang.reflect.AnnotatedElement> constantDescMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.constant.ConstantDesc, java.lang.reflect.AnnotatedElement>(0);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: capacity must greater than 0!");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1289");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        java.lang.String str2 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str10 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str12 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str17 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass18 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1290");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((int) '4');
        java.lang.String str3 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str8 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str13 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass14 = strComparableMRUCache1.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1291");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str5 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str7 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str9 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str17 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test1292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1292");
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.datastructures.caches.MRUCache<java.lang.CharSequence, java.lang.reflect.GenericDeclaration> charSequenceMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.CharSequence, java.lang.reflect.GenericDeclaration>((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: capacity must greater than 0!");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1293");
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
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str31 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
    }

    @Test
    public void test1294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1294");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.reflect.Type, java.lang.Class<?>> typeMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.reflect.Type, java.lang.Class<?>>((int) 'a');
    }

    @Test
    public void test1295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1295");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str8 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str18 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass19 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1296");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.invoke.TypeDescriptor, java.lang.reflect.AnnotatedElement> typeDescriptorMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.invoke.TypeDescriptor, java.lang.reflect.AnnotatedElement>((int) (byte) 1);
        java.lang.Class<?> wildcardClass2 = typeDescriptorMRUCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test1297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1297");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str5 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable6 = null;
        strComparableMRUCache0.put(strComparable6, "hi!");
        java.lang.String str10 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str15 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str17 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str19 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test1298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1298");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.constant.Constable, java.lang.reflect.GenericDeclaration> constableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.constant.Constable, java.lang.reflect.GenericDeclaration>((int) (byte) 10);
        java.lang.Class<?> wildcardClass2 = constableMRUCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test1299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1299");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str5 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str7 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str9 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str23 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str25 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass26 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test1300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1300");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.reflect.GenericDeclaration, java.lang.constant.Constable> genericDeclarationMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.reflect.GenericDeclaration, java.lang.constant.Constable>((int) '#');
    }

    @Test
    public void test1301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1301");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str8 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1302");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((int) (short) 100);
        java.lang.String str3 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str5 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test1303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1303");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str5 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable6 = null;
        strComparableMRUCache0.put(strComparable6, "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str16 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str21 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.Class<?> wildcardClass28 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1304");
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.datastructures.caches.MRUCache<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>, java.io.Serializable> wildcardClassOfFieldMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>, java.io.Serializable>((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: capacity must greater than 0!");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1305");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Object, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>> objMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Object, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>((int) (byte) 10);
    }

    @Test
    public void test1306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1306");
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
        java.lang.Class<?> wildcardClass24 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1307");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.CharSequence, java.lang.Class<?>> charSequenceMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.CharSequence, java.lang.Class<?>>(1);
        java.lang.Class<?> wildcardClass2 = charSequenceMRUCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test1308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1308");
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
        java.lang.Class<?> wildcardClass26 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test1309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1309");
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.datastructures.caches.MRUCache<java.lang.constant.ConstantDesc, java.lang.Comparable<java.lang.String>> constantDescMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.constant.ConstantDesc, java.lang.Comparable<java.lang.String>>((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: capacity must greater than 0!");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1310");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>> strComparableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>(10);
        java.lang.Class<?> wildcardClass2 = strComparableMRUCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test1311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1311");
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
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str35 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass36 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test1312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1312");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.reflect.AnnotatedElement, java.lang.invoke.TypeDescriptor> annotatedElementMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.reflect.AnnotatedElement, java.lang.invoke.TypeDescriptor>(1);
    }

    @Test
    public void test1313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1313");
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
        java.lang.Class<?> wildcardClass23 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1314");
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
        java.lang.Class<?> wildcardClass34 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1315");
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
        java.lang.Class<?> wildcardClass32 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test1316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1316");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str11 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable14 = null;
        java.lang.String str15 = strComparableMRUCache0.get(strComparable14);
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str20 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass21 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1317");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str8 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str15 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str17 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str19 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test1318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1318");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str11 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable14 = null;
        java.lang.String str15 = strComparableMRUCache0.get(strComparable14);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test1319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1319");
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.datastructures.caches.MRUCache<java.lang.reflect.GenericDeclaration, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>> genericDeclarationMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.reflect.GenericDeclaration, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>(0);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: capacity must greater than 0!");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1320");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str5 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str7 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str9 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str14 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str16 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Class<?> wildcardClass20 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1321");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        java.lang.String str2 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str7 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str9 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str17 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass18 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1322");
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
        java.lang.Class<?> wildcardClass26 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test1323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1323");
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
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str31 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str33 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
    }

    @Test
    public void test1324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1324");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Class<?>, java.lang.constant.Constable> wildcardClassMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Class<?>, java.lang.constant.Constable>((int) '4');
        java.lang.Class<?> wildcardClass2 = wildcardClassMRUCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test1325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1325");
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
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.Class<?> wildcardClass30 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test1326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1326");
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
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test1327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1327");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((int) (byte) 1);
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str6 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Class<?> wildcardClass10 = strComparableMRUCache1.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1328");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str17 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str19 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str21 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass22 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1329");
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
        java.lang.Class<?> wildcardClass30 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test1330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1330");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str8 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass9 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1331");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Class<?>, java.lang.constant.Constable> wildcardClassMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Class<?>, java.lang.constant.Constable>((int) (byte) 1);
    }

    @Test
    public void test1332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1332");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.Comparable<java.lang.String> strComparable10 = null;
        strComparableMRUCache0.put(strComparable10, "hi!");
        java.lang.String str14 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.Class<?> wildcardClass21 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1333");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str5 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str7 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str9 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str14 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.Class<?> wildcardClass21 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1334");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str5 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str7 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str9 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str14 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str19 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test1335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1335");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str8 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str10 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str12 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str14 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass15 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1336");
        com.thealgorithms.datastructures.caches.MRUCache<java.io.Serializable, java.lang.String> serializableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.io.Serializable, java.lang.String>();
        java.lang.Class<?> wildcardClass1 = serializableMRUCache0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test1337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1337");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str8 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str18 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass19 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1338");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>, java.lang.String> wildcardClassOfFieldMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>, java.lang.String>();
        java.lang.Class<?> wildcardClass1 = wildcardClassOfFieldMRUCache0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test1339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1339");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str11 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.Class<?> wildcardClass17 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1340");
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
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str27 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass28 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1341");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.constant.Constable, java.lang.reflect.AnnotatedElement> constableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.constant.Constable, java.lang.reflect.AnnotatedElement>((int) '#');
        java.lang.Class<?> wildcardClass2 = constableMRUCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test1342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1342");
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
        java.lang.Class<?> wildcardClass31 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1343");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str5 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable6 = null;
        strComparableMRUCache0.put(strComparable6, "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.Class<?> wildcardClass12 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1344");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str8 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str10 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str12 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str17 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str19 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str21 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.Class<?> wildcardClass25 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1345");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((int) '4');
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        java.lang.String str6 = strComparableMRUCache1.get(strComparable5);
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test1346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1346");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>, java.lang.Class<?>> wildcardClassOfFieldMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>, java.lang.Class<?>>(100);
    }

    @Test
    public void test1347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1347");
        com.thealgorithms.datastructures.caches.MRUCache<com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>, java.io.Serializable> strComparableMRUCacheMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>, java.io.Serializable>((int) (short) 100);
    }

    @Test
    public void test1348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1348");
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
        java.lang.Class<?> wildcardClass27 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test1349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1349");
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
        java.lang.Comparable<java.lang.String> strComparable26 = null;
        java.lang.String str27 = strComparableMRUCache0.get(strComparable26);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNull(str27);
    }

    @Test
    public void test1350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1350");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>(1);
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str6 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str11 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str13 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass14 = strComparableMRUCache1.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1351");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        java.lang.String str2 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str7 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str9 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str11 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Class<?> wildcardClass23 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1352");
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
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
    }

    @Test
    public void test1353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1353");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.constant.Constable, com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>> constableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.constant.Constable, com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>>((int) (short) 1);
    }

    @Test
    public void test1354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1354");
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
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test1355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1355");
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.datastructures.caches.MRUCache<com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>, java.lang.invoke.TypeDescriptor> strComparableMRUCacheMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>, java.lang.invoke.TypeDescriptor>((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: capacity must greater than 0!");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1356");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        java.lang.String str2 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str10 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str18 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass19 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1357");
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
        java.lang.Class<?> wildcardClass22 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1358");
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
        java.lang.Class<?> wildcardClass41 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test1359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1359");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str5 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable6 = null;
        strComparableMRUCache0.put(strComparable6, "hi!");
        java.lang.String str10 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str15 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Class<?> wildcardClass19 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1360");
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.datastructures.caches.MRUCache<java.lang.reflect.Type, java.lang.reflect.AnnotatedElement> typeMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.reflect.Type, java.lang.reflect.AnnotatedElement>((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: capacity must greater than 0!");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1361");
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
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str33 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass34 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1362");
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
        java.lang.Class<?> wildcardClass29 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test1363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1363");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.String, java.io.Serializable> strMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.String, java.io.Serializable>((int) (short) 100);
    }

    @Test
    public void test1364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1364");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        java.lang.String str2 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str10 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.Class<?> wildcardClass17 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1365");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str8 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.Class<?> wildcardClass15 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1366");
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
        java.lang.Class<?> wildcardClass22 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1367");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.reflect.AnnotatedElement, java.lang.String> annotatedElementMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.reflect.AnnotatedElement, java.lang.String>(100);
    }

    @Test
    public void test1368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1368");
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
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str27 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass28 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1369");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.reflect.AnnotatedElement, java.lang.Comparable<java.lang.String>> annotatedElementMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.reflect.AnnotatedElement, java.lang.Comparable<java.lang.String>>((int) (byte) 100);
    }

    @Test
    public void test1370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1370");
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
        java.lang.String str24 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str29 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
    }

    @Test
    public void test1371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1371");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.constant.ConstantDesc, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>> constantDescMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.constant.ConstantDesc, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>(1);
    }

    @Test
    public void test1372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1372");
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
        java.lang.String str21 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str23 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test1373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1373");
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
        java.lang.Class<?> wildcardClass25 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1374");
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration> strComparableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration>((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: capacity must greater than 0!");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1375");
        com.thealgorithms.datastructures.caches.MRUCache<java.io.Serializable, java.lang.CharSequence> serializableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.io.Serializable, java.lang.CharSequence>(10);
        java.lang.Class<?> wildcardClass2 = serializableMRUCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test1376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1376");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str5 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable6 = null;
        strComparableMRUCache0.put(strComparable6, "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Class<?> wildcardClass15 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1377");
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
        java.lang.Class<?> wildcardClass24 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1378");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.CharSequence, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>> charSequenceMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.CharSequence, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>((int) 'a');
    }

    @Test
    public void test1379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1379");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.reflect.GenericDeclaration, java.lang.CharSequence> genericDeclarationMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.reflect.GenericDeclaration, java.lang.CharSequence>((int) 'a');
        java.lang.Class<?> wildcardClass2 = genericDeclarationMRUCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test1380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1380");
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
        java.lang.Class<?> wildcardClass29 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test1381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1381");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str11 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test1382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1382");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.invoke.TypeDescriptor, java.lang.constant.Constable> typeDescriptorMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.invoke.TypeDescriptor, java.lang.constant.Constable>(10);
    }

    @Test
    public void test1383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1383");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.constant.ConstantDesc, java.lang.String> constantDescMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.constant.ConstantDesc, java.lang.String>();
    }

    @Test
    public void test1384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1384");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        java.lang.String str2 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str10 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str18 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.Class<?> wildcardClass22 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1385");
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
        java.lang.Class<?> wildcardClass25 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1386");
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
        java.lang.String str23 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str25 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
    }

    @Test
    public void test1387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1387");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((int) '4');
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.Class<?> wildcardClass5 = strComparableMRUCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1388");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Class<?>, com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>> wildcardClassMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Class<?>, com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>>();
        java.lang.Class<?> wildcardClass1 = wildcardClassMRUCache0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test1389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1389");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str11 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str15 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass16 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1390");
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
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.Class<?> wildcardClass42 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test1391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1391");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.Class<?> wildcardClass13 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1392");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str11 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str15 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str20 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass21 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1393");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        java.lang.String str2 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str10 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str15 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str17 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass18 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1394");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.invoke.TypeDescriptor, java.lang.CharSequence> typeDescriptorMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.invoke.TypeDescriptor, java.lang.CharSequence>((int) (byte) 1);
    }

    @Test
    public void test1395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1395");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str5 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable6 = null;
        strComparableMRUCache0.put(strComparable6, "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str16 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.Class<?> wildcardClass20 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1396");
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
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Comparable<java.lang.String> strComparable31 = null;
        java.lang.String str32 = strComparableMRUCache0.get(strComparable31);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
    }

    @Test
    public void test1397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1397");
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
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Class<?> wildcardClass34 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1398");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.constant.Constable, java.lang.Object> constableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.constant.Constable, java.lang.Object>(100);
        java.lang.Class<?> wildcardClass2 = constableMRUCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test1399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1399");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str8 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str15 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str17 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Class<?> wildcardClass24 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1400");
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
        java.lang.String str25 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass26 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test1401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1401");
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
        java.lang.String str33 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass34 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1402");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.constant.ConstantDesc, java.lang.CharSequence> constantDescMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.constant.ConstantDesc, java.lang.CharSequence>();
    }

    @Test
    public void test1403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1403");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str8 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str10 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Comparable<java.lang.String> strComparable14 = null;
        java.lang.String str15 = strComparableMRUCache0.get(strComparable14);
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.Class<?> wildcardClass19 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1404");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.constant.ConstantDesc, java.lang.Comparable<java.lang.String>> constantDescMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.constant.ConstantDesc, java.lang.Comparable<java.lang.String>>((int) (byte) 10);
        java.lang.Class<?> wildcardClass2 = constantDescMRUCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test1405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1405");
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.datastructures.caches.MRUCache<java.lang.String, java.io.Serializable> strMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.String, java.io.Serializable>((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: capacity must greater than 0!");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1406");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.constant.Constable, java.lang.Comparable<java.lang.String>> constableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.constant.Constable, java.lang.Comparable<java.lang.String>>((int) 'a');
    }

    @Test
    public void test1407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1407");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.constant.Constable, java.lang.Comparable<java.lang.String>> constableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.constant.Constable, java.lang.Comparable<java.lang.String>>(100);
    }

    @Test
    public void test1408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1408");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str8 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.Class<?> wildcardClass23 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1409");
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.datastructures.caches.MRUCache<java.lang.Class<?>, java.lang.invoke.TypeDescriptor> wildcardClassMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Class<?>, java.lang.invoke.TypeDescriptor>((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: capacity must greater than 0!");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1410");
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
        java.lang.Class<?> wildcardClass21 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1411");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((int) (byte) 1);
        java.lang.String str3 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass4 = strComparableMRUCache1.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1412");
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
        java.lang.Class<?> wildcardClass30 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test1413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1413");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((int) '4');
        java.lang.String str3 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str8 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.Class<?> wildcardClass15 = strComparableMRUCache1.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1414");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str11 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable14 = null;
        strComparableMRUCache0.put(strComparable14, "hi!");
        java.lang.String str18 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass19 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1415");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str5 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str10 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1416");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.Comparable<java.lang.String> strComparable13 = null;
        strComparableMRUCache0.put(strComparable13, "");
        java.lang.String str17 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass18 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1417");
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
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Class<?> wildcardClass43 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test1418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1418");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>();
        java.lang.Class<?> wildcardClass1 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test1419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1419");
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
        java.lang.String str21 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str26 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass27 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test1420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1420");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str11 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str15 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str17 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str19 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test1421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1421");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str8 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Class<?> wildcardClass18 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1422");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        java.lang.String str2 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str10 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.Class<?> wildcardClass17 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1423");
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
        java.lang.String str30 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass31 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1424");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.reflect.Type, java.lang.reflect.GenericDeclaration> typeMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.reflect.Type, java.lang.reflect.GenericDeclaration>((int) (short) 10);
    }

    @Test
    public void test1425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1425");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str5 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable6 = null;
        strComparableMRUCache0.put(strComparable6, "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass14 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1426");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str17 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.Class<?> wildcardClass21 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1427");
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.datastructures.caches.MRUCache<java.lang.String, java.lang.constant.Constable> strMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.String, java.lang.constant.Constable>((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: capacity must greater than 0!");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1428");
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
        java.lang.Class<?> wildcardClass26 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test1429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1429");
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.datastructures.caches.MRUCache<java.lang.constant.ConstantDesc, com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>> constantDescMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.constant.ConstantDesc, com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>>((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: capacity must greater than 0!");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1430");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>(1);
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str9 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str11 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str13 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass14 = strComparableMRUCache1.getClass();
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1431");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.invoke.TypeDescriptor, java.lang.CharSequence> typeDescriptorMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.invoke.TypeDescriptor, java.lang.CharSequence>();
        java.lang.Class<?> wildcardClass1 = typeDescriptorMRUCache0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test1432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1432");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str11 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str19 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str21 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test1433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1433");
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
        java.lang.String str32 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass33 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test1434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1434");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.constant.Constable, java.lang.CharSequence> constableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.constant.Constable, java.lang.CharSequence>((int) (byte) 1);
    }

    @Test
    public void test1435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1435");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.constant.Constable, java.lang.invoke.TypeDescriptor> constableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.constant.Constable, java.lang.invoke.TypeDescriptor>((int) (short) 100);
        java.lang.Class<?> wildcardClass2 = constableMRUCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test1436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1436");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.Comparable<java.lang.String> strComparable10 = null;
        strComparableMRUCache0.put(strComparable10, "hi!");
        java.lang.String str14 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str19 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass20 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1437");
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
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.Class<?> wildcardClass29 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test1438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1438");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.reflect.Type, java.lang.constant.ConstantDesc> typeMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.reflect.Type, java.lang.constant.ConstantDesc>((int) (short) 10);
        java.lang.Class<?> wildcardClass2 = typeMRUCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test1439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1439");
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
        java.lang.Class<?> wildcardClass23 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1440");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((int) (byte) 10);
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str6 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Class<?> wildcardClass10 = strComparableMRUCache1.getClass();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1441");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>(10);
        java.lang.Comparable<java.lang.String> strComparable2 = null;
        java.lang.String str3 = strComparableMRUCache1.get(strComparable2);
        java.lang.String str5 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str10 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass11 = strComparableMRUCache1.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1442");
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
        java.lang.String str25 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test1443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1443");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str5 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str7 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str9 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str11 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1444");
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
        strComparableMRUCache0.put(strComparable21, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test1445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1445");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>(1);
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str12 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.Class<?> wildcardClass16 = strComparableMRUCache1.getClass();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1446");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str8 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass14 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1447");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>(1);
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str12 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str17 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass18 = strComparableMRUCache1.getClass();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1448");
        com.thealgorithms.datastructures.caches.MRUCache<java.io.Serializable, java.lang.reflect.AnnotatedElement> serializableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.io.Serializable, java.lang.reflect.AnnotatedElement>(100);
        java.lang.Class<?> wildcardClass2 = serializableMRUCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test1449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1449");
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
        java.lang.Class<?> wildcardClass25 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1450");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str8 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str15 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.Class<?> wildcardClass22 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1451");
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
        java.lang.Class<?> wildcardClass27 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test1452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1452");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.reflect.AnnotatedElement, java.io.Serializable> annotatedElementMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.reflect.AnnotatedElement, java.io.Serializable>();
        java.lang.Class<?> wildcardClass1 = annotatedElementMRUCache0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test1453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1453");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((int) ' ');
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str6 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str8 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass9 = strComparableMRUCache1.getClass();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1454");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.reflect.AnnotatedElement> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.reflect.AnnotatedElement>();
        java.lang.Class<?> wildcardClass1 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test1455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1455");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.constant.ConstantDesc, java.lang.constant.ConstantDesc> constantDescMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.constant.ConstantDesc, java.lang.constant.ConstantDesc>();
        java.lang.Class<?> wildcardClass1 = constantDescMRUCache0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test1456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1456");
        com.thealgorithms.datastructures.caches.MRUCache<com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>, java.lang.reflect.GenericDeclaration> strComparableMRUCacheMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>, java.lang.reflect.GenericDeclaration>((int) (short) 100);
    }

    @Test
    public void test1457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1457");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>, java.lang.Object> wildcardClassOfFieldMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>, java.lang.Object>();
        java.lang.Class<?> wildcardClass1 = wildcardClassOfFieldMRUCache0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test1458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1458");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.reflect.Type, java.io.Serializable> typeMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.reflect.Type, java.io.Serializable>(100);
    }

    @Test
    public void test1459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1459");
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
        java.lang.String str23 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test1460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1460");
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.datastructures.caches.MRUCache<java.lang.reflect.Type, java.lang.reflect.AnnotatedElement> typeMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.reflect.Type, java.lang.reflect.AnnotatedElement>(0);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: capacity must greater than 0!");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1461");
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
        java.lang.String str24 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test1462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1462");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str8 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass14 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1463");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str11 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.String str19 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str21 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test1464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1464");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str5 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str7 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str9 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str17 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str22 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass23 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1465");
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.datastructures.caches.MRUCache<java.lang.Object, java.lang.constant.ConstantDesc> objMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Object, java.lang.constant.ConstantDesc>((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: capacity must greater than 0!");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1466");
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
        java.lang.Class<?> wildcardClass30 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test1467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1467");
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.datastructures.caches.MRUCache<java.lang.Class<?>, java.lang.Comparable<java.lang.String>> wildcardClassMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Class<?>, java.lang.Comparable<java.lang.String>>((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: capacity must greater than 0!");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1468");
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
        java.lang.Class<?> wildcardClass24 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1469");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        java.lang.String str2 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str7 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str18 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test1470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1470");
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.datastructures.caches.MRUCache<java.io.Serializable, java.lang.Class<?>> serializableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.io.Serializable, java.lang.Class<?>>(0);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: capacity must greater than 0!");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1471");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.reflect.Type, java.io.Serializable> typeMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.reflect.Type, java.io.Serializable>((int) 'a');
    }

    @Test
    public void test1472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1472");
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
        java.lang.Class<?> wildcardClass38 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test1473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1473");
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.datastructures.caches.MRUCache<java.lang.constant.ConstantDesc, java.lang.reflect.Type> constantDescMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.constant.ConstantDesc, java.lang.reflect.Type>(0);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: capacity must greater than 0!");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1474");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str11 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str15 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str17 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str19 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Class<?> wildcardClass23 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1475");
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
        java.lang.String str22 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test1476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1476");
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.datastructures.caches.MRUCache<java.lang.reflect.AnnotatedElement, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>> annotatedElementMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.reflect.AnnotatedElement, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>(0);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: capacity must greater than 0!");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1477");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        java.lang.String str2 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str7 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str9 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str11 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.Class<?> wildcardClass18 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1478");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>(1);
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str6 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str8 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str10 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str12 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass13 = strComparableMRUCache1.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1479");
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
    public void test1480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1480");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.invoke.TypeDescriptor, java.lang.reflect.Type> typeDescriptorMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.invoke.TypeDescriptor, java.lang.reflect.Type>((int) (byte) 1);
        java.lang.Class<?> wildcardClass2 = typeDescriptorMRUCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test1481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1481");
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.datastructures.caches.MRUCache<java.lang.reflect.AnnotatedElement, java.lang.String> annotatedElementMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.reflect.AnnotatedElement, java.lang.String>((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: capacity must greater than 0!");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1482");
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
        java.lang.String str25 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test1483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1483");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.invoke.TypeDescriptor, java.lang.Class<?>> typeDescriptorMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.invoke.TypeDescriptor, java.lang.Class<?>>((int) (byte) 10);
    }

    @Test
    public void test1484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1484");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        java.lang.String str2 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str7 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str9 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str11 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str13 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.Comparable<java.lang.String> strComparable17 = null;
        strComparableMRUCache0.put(strComparable17, "");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test1485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1485");
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
        java.lang.Class<?> wildcardClass23 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1486");
        com.thealgorithms.datastructures.caches.MRUCache<com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>, java.lang.reflect.Type> strComparableMRUCacheMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>, java.lang.reflect.Type>((int) '4');
        java.lang.Class<?> wildcardClass2 = strComparableMRUCacheMRUCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test1487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1487");
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.datastructures.caches.MRUCache<java.lang.Object, java.lang.Class<?>> objMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Object, java.lang.Class<?>>((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: capacity must greater than 0!");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1488");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.constant.ConstantDesc, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>> constantDescMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.constant.ConstantDesc, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>((int) (byte) 1);
        java.lang.Class<?> wildcardClass2 = constantDescMRUCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test1489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1489");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str5 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable6 = null;
        strComparableMRUCache0.put(strComparable6, "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.Class<?> wildcardClass15 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1490");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        java.lang.String str2 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        java.lang.String str7 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str9 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str11 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass12 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1491");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>(1);
    }

    @Test
    public void test1492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1492");
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
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test1493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1493");
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
        java.lang.Class<?> wildcardClass31 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1494");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        java.lang.String str2 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str10 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        java.lang.Comparable<java.lang.String> strComparable17 = null;
        java.lang.String str18 = strComparableMRUCache0.get(strComparable17);
        java.lang.Class<?> wildcardClass19 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1495");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>(10);
        java.lang.Comparable<java.lang.String> strComparable2 = null;
        java.lang.String str3 = strComparableMRUCache1.get(strComparable2);
        java.lang.String str5 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test1496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1496");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>(1);
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str6 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str8 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str13 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str21 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test1497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1497");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>((int) (byte) 10);
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str6 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "");
        strComparableMRUCache1.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str11 = strComparableMRUCache1.get((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass12 = strComparableMRUCache1.getClass();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1498");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMRUCache0 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "", "hi!");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.Comparable<java.lang.String> strComparable10 = null;
        strComparableMRUCache0.put(strComparable10, "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        strComparableMRUCache0.put((java.lang.Comparable<java.lang.String>) "hi!", "");
        java.lang.String str20 = strComparableMRUCache0.get((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass21 = strComparableMRUCache0.getClass();
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1499");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.CharSequence, java.io.Serializable> charSequenceMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.CharSequence, java.io.Serializable>((int) '4');
        java.lang.Class<?> wildcardClass2 = charSequenceMRUCache1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test1500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1500");
        com.thealgorithms.datastructures.caches.MRUCache<java.lang.Object, java.lang.Class<?>> objMRUCache1 = new com.thealgorithms.datastructures.caches.MRUCache<java.lang.Object, java.lang.Class<?>>((int) '4');
    }
}

