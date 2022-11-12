package datastructures.heaps;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest4 {

    public static boolean debug = false;

    @Test
    public void test2001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2001");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        strGenericHeap0.add("hi!");
        strGenericHeap0.updatePriority("hi!");
        java.lang.String str12 = strGenericHeap0.remove();
        java.lang.String str13 = strGenericHeap0.get();
        boolean boolean14 = strGenericHeap0.isEmpty();
        java.lang.String str15 = strGenericHeap0.remove();
        boolean boolean16 = strGenericHeap0.isEmpty();
        strGenericHeap0.add("hi!");
        java.lang.Class<?> wildcardClass19 = strGenericHeap0.getClass();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        boolean boolean4 = strGenericHeap0.isEmpty();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("hi!");
        boolean boolean9 = strGenericHeap0.isEmpty();
        java.lang.String str10 = strGenericHeap0.remove();
        strGenericHeap0.display();
        java.lang.Class<?> wildcardClass12 = strGenericHeap0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        java.lang.String str8 = strGenericHeap0.get();
        boolean boolean9 = strGenericHeap0.isEmpty();
        strGenericHeap0.updatePriority("");
        boolean boolean12 = strGenericHeap0.isEmpty();
        boolean boolean13 = strGenericHeap0.isEmpty();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        java.lang.String str8 = strGenericHeap0.remove();
        strGenericHeap0.add("hi!");
        strGenericHeap0.display();
        java.lang.String str12 = strGenericHeap0.remove();
        int int13 = strGenericHeap0.size();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        java.lang.String str8 = strGenericHeap0.remove();
        strGenericHeap0.display();
        int int10 = strGenericHeap0.size();
        boolean boolean11 = strGenericHeap0.isEmpty();
        strGenericHeap0.display();
        java.lang.String str13 = strGenericHeap0.get();
        strGenericHeap0.add("hi!");
        strGenericHeap0.updatePriority("hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        strGenericHeap0.add("hi!");
        strGenericHeap0.updatePriority("hi!");
        strGenericHeap0.display();
        java.lang.String str13 = strGenericHeap0.get();
        boolean boolean14 = strGenericHeap0.isEmpty();
        java.lang.String str15 = strGenericHeap0.remove();
        java.lang.String str16 = strGenericHeap0.remove();
        strGenericHeap0.display();
        strGenericHeap0.add("");
        strGenericHeap0.add("hi!");
        strGenericHeap0.display();
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        strGenericHeap0.add("hi!");
        strGenericHeap0.updatePriority("hi!");
        strGenericHeap0.display();
        java.lang.String str13 = strGenericHeap0.get();
        java.lang.String str14 = strGenericHeap0.get();
        java.lang.String str15 = strGenericHeap0.get();
        strGenericHeap0.add("");
        strGenericHeap0.updatePriority("hi!");
        java.lang.String str20 = strGenericHeap0.remove();
        java.lang.String str21 = strGenericHeap0.get();
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        java.lang.String str8 = strGenericHeap0.remove();
        strGenericHeap0.display();
        java.lang.String str10 = strGenericHeap0.remove();
        strGenericHeap0.display();
        strGenericHeap0.display();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = strGenericHeap0.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        int int1 = strGenericHeap0.size();
        int int2 = strGenericHeap0.size();
        strGenericHeap0.add("");
        java.lang.String str5 = strGenericHeap0.remove();
        strGenericHeap0.display();
        boolean boolean7 = strGenericHeap0.isEmpty();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        strGenericHeap0.add("hi!");
        java.lang.String str10 = strGenericHeap0.get();
        int int11 = strGenericHeap0.size();
        strGenericHeap0.updatePriority("hi!");
        int int14 = strGenericHeap0.size();
        java.lang.Class<?> wildcardClass15 = strGenericHeap0.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        strGenericHeap0.add("hi!");
        strGenericHeap0.updatePriority("hi!");
        java.lang.String str12 = strGenericHeap0.remove();
        java.lang.String str13 = strGenericHeap0.get();
        strGenericHeap0.updatePriority("");
        java.lang.String str16 = strGenericHeap0.remove();
        int int17 = strGenericHeap0.size();
        strGenericHeap0.display();
        boolean boolean19 = strGenericHeap0.isEmpty();
        boolean boolean20 = strGenericHeap0.isEmpty();
        strGenericHeap0.add("hi!");
        boolean boolean23 = strGenericHeap0.isEmpty();
        int int24 = strGenericHeap0.size();
        strGenericHeap0.display();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        int int6 = strGenericHeap0.size();
        java.lang.String str7 = strGenericHeap0.get();
        strGenericHeap0.updatePriority("");
        java.lang.String str10 = strGenericHeap0.get();
        strGenericHeap0.add("");
        int int13 = strGenericHeap0.size();
        strGenericHeap0.display();
        strGenericHeap0.display();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        java.lang.String str4 = strGenericHeap0.get();
        strGenericHeap0.add("");
        int int7 = strGenericHeap0.size();
        strGenericHeap0.add("hi!");
        strGenericHeap0.updatePriority("hi!");
        java.lang.Class<?> wildcardClass12 = strGenericHeap0.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        strGenericHeap0.add("hi!");
        strGenericHeap0.updatePriority("hi!");
        java.lang.String str12 = strGenericHeap0.remove();
        java.lang.String str13 = strGenericHeap0.get();
        strGenericHeap0.updatePriority("");
        java.lang.String str16 = strGenericHeap0.remove();
        int int17 = strGenericHeap0.size();
        strGenericHeap0.display();
        strGenericHeap0.add("");
        java.lang.String str21 = strGenericHeap0.get();
        java.lang.String str22 = strGenericHeap0.get();
        boolean boolean23 = strGenericHeap0.isEmpty();
        strGenericHeap0.updatePriority("");
        java.lang.String str26 = strGenericHeap0.remove();
        java.lang.Class<?> wildcardClass27 = strGenericHeap0.getClass();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        int int8 = strGenericHeap0.size();
        boolean boolean9 = strGenericHeap0.isEmpty();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        strGenericHeap0.add("hi!");
        strGenericHeap0.updatePriority("hi!");
        java.lang.String str12 = strGenericHeap0.remove();
        java.lang.String str13 = strGenericHeap0.get();
        strGenericHeap0.updatePriority("");
        java.lang.String str16 = strGenericHeap0.remove();
        boolean boolean17 = strGenericHeap0.isEmpty();
        java.lang.String str18 = strGenericHeap0.remove();
        strGenericHeap0.add("");
        boolean boolean21 = strGenericHeap0.isEmpty();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        int int6 = strGenericHeap0.size();
        java.lang.String str7 = strGenericHeap0.get();
        strGenericHeap0.add("hi!");
        strGenericHeap0.updatePriority("hi!");
        boolean boolean12 = strGenericHeap0.isEmpty();
        int int13 = strGenericHeap0.size();
        java.lang.String str14 = strGenericHeap0.get();
        boolean boolean15 = strGenericHeap0.isEmpty();
        java.lang.String str16 = strGenericHeap0.remove();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        java.lang.String str8 = strGenericHeap0.remove();
        java.lang.String str9 = strGenericHeap0.remove();
        int int10 = strGenericHeap0.size();
        int int11 = strGenericHeap0.size();
        int int12 = strGenericHeap0.size();
        strGenericHeap0.add("");
        java.lang.String str15 = strGenericHeap0.get();
        java.lang.String str16 = strGenericHeap0.get();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        java.lang.String str8 = strGenericHeap0.remove();
        java.lang.String str9 = strGenericHeap0.get();
        strGenericHeap0.display();
        java.lang.String str11 = strGenericHeap0.get();
        java.lang.String str12 = strGenericHeap0.get();
        boolean boolean13 = strGenericHeap0.isEmpty();
        strGenericHeap0.display();
        strGenericHeap0.add("");
        java.lang.String str17 = strGenericHeap0.remove();
        int int18 = strGenericHeap0.size();
        boolean boolean19 = strGenericHeap0.isEmpty();
        strGenericHeap0.add("hi!");
        boolean boolean22 = strGenericHeap0.isEmpty();
        strGenericHeap0.updatePriority("hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        java.lang.String str3 = strGenericHeap0.get();
        strGenericHeap0.add("");
        boolean boolean6 = strGenericHeap0.isEmpty();
        strGenericHeap0.add("");
        java.lang.String str9 = strGenericHeap0.remove();
        java.lang.String str10 = strGenericHeap0.get();
        strGenericHeap0.display();
        strGenericHeap0.display();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        java.lang.String str8 = strGenericHeap0.get();
        int int9 = strGenericHeap0.size();
        int int10 = strGenericHeap0.size();
        boolean boolean11 = strGenericHeap0.isEmpty();
        strGenericHeap0.add("hi!");
        strGenericHeap0.add("hi!");
        java.lang.String str16 = strGenericHeap0.remove();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        java.lang.Class<?> wildcardClass20 = strGenericHeap0.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        java.lang.String str8 = strGenericHeap0.remove();
        strGenericHeap0.add("hi!");
        strGenericHeap0.display();
        int int12 = strGenericHeap0.size();
        strGenericHeap0.updatePriority("");
        java.lang.String str15 = strGenericHeap0.remove();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        java.lang.String str4 = strGenericHeap0.get();
        strGenericHeap0.add("");
        strGenericHeap0.add("hi!");
        strGenericHeap0.updatePriority("");
        java.lang.String str11 = strGenericHeap0.get();
        java.lang.String str12 = strGenericHeap0.get();
        strGenericHeap0.updatePriority("");
        java.lang.String str15 = strGenericHeap0.get();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        strGenericHeap0.add("hi!");
        strGenericHeap0.updatePriority("hi!");
        strGenericHeap0.display();
        strGenericHeap0.add("");
        int int15 = strGenericHeap0.size();
        java.lang.String str16 = strGenericHeap0.get();
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        java.lang.String str8 = strGenericHeap0.remove();
        strGenericHeap0.add("hi!");
        int int11 = strGenericHeap0.size();
        strGenericHeap0.add("");
        strGenericHeap0.updatePriority("");
        java.lang.String str16 = strGenericHeap0.remove();
        strGenericHeap0.add("hi!");
        java.lang.String str19 = strGenericHeap0.remove();
        java.lang.String str20 = strGenericHeap0.get();
        java.lang.String str21 = strGenericHeap0.get();
        java.lang.String str22 = strGenericHeap0.get();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        java.lang.String str4 = strGenericHeap0.get();
        strGenericHeap0.add("");
        strGenericHeap0.add("hi!");
        strGenericHeap0.updatePriority("");
        int int11 = strGenericHeap0.size();
        strGenericHeap0.updatePriority("hi!");
        boolean boolean14 = strGenericHeap0.isEmpty();
        int int15 = strGenericHeap0.size();
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        int int19 = strGenericHeap0.size();
        int int20 = strGenericHeap0.size();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        java.lang.String str8 = strGenericHeap0.get();
        java.lang.String str9 = strGenericHeap0.get();
        int int10 = strGenericHeap0.size();
        java.lang.String str11 = strGenericHeap0.get();
        java.lang.String str12 = strGenericHeap0.remove();
        strGenericHeap0.display();
        java.lang.Class<?> wildcardClass14 = strGenericHeap0.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        int int8 = strGenericHeap0.size();
        strGenericHeap0.add("");
        boolean boolean11 = strGenericHeap0.isEmpty();
        java.lang.String str12 = strGenericHeap0.remove();
        strGenericHeap0.display();
        java.lang.String str14 = strGenericHeap0.get();
        strGenericHeap0.display();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        int int3 = strGenericHeap0.size();
        strGenericHeap0.display();
        boolean boolean5 = strGenericHeap0.isEmpty();
        strGenericHeap0.display();
        int int7 = strGenericHeap0.size();
        strGenericHeap0.display();
        java.lang.String str9 = strGenericHeap0.get();
        int int10 = strGenericHeap0.size();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        boolean boolean4 = strGenericHeap0.isEmpty();
        strGenericHeap0.updatePriority("");
        boolean boolean7 = strGenericHeap0.isEmpty();
        int int8 = strGenericHeap0.size();
        strGenericHeap0.add("");
        java.lang.String str11 = strGenericHeap0.get();
        strGenericHeap0.updatePriority("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        int int6 = strGenericHeap0.size();
        java.lang.String str7 = strGenericHeap0.get();
        strGenericHeap0.updatePriority("");
        java.lang.String str10 = strGenericHeap0.get();
        strGenericHeap0.add("");
        int int13 = strGenericHeap0.size();
        boolean boolean14 = strGenericHeap0.isEmpty();
        strGenericHeap0.add("");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        strGenericHeap0.updatePriority("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        int int3 = strGenericHeap0.size();
        strGenericHeap0.display();
        strGenericHeap0.add("hi!");
        boolean boolean7 = strGenericHeap0.isEmpty();
        int int8 = strGenericHeap0.size();
        java.lang.String str9 = strGenericHeap0.get();
        strGenericHeap0.add("");
        java.lang.String str12 = strGenericHeap0.remove();
        boolean boolean13 = strGenericHeap0.isEmpty();
        strGenericHeap0.display();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        boolean boolean4 = strGenericHeap0.isEmpty();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.display();
        strGenericHeap0.add("hi!");
        java.lang.String str10 = strGenericHeap0.remove();
        strGenericHeap0.display();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        java.lang.String str4 = strGenericHeap0.get();
        boolean boolean5 = strGenericHeap0.isEmpty();
        boolean boolean6 = strGenericHeap0.isEmpty();
        boolean boolean7 = strGenericHeap0.isEmpty();
        strGenericHeap0.add("");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        strGenericHeap0.add("hi!");
        strGenericHeap0.updatePriority("hi!");
        java.lang.String str12 = strGenericHeap0.get();
        strGenericHeap0.display();
        strGenericHeap0.add("");
        strGenericHeap0.updatePriority("hi!");
        strGenericHeap0.display();
        strGenericHeap0.add("");
        boolean boolean21 = strGenericHeap0.isEmpty();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.add("hi!");
        strGenericHeap0.add("hi!");
        strGenericHeap0.updatePriority("hi!");
        strGenericHeap0.add("");
        strGenericHeap0.display();
        java.lang.Class<?> wildcardClass18 = strGenericHeap0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        boolean boolean4 = strGenericHeap0.isEmpty();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("hi!");
        int int9 = strGenericHeap0.size();
        int int10 = strGenericHeap0.size();
        java.lang.String str11 = strGenericHeap0.remove();
        strGenericHeap0.updatePriority("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        java.lang.String str8 = strGenericHeap0.remove();
        java.lang.String str9 = strGenericHeap0.get();
        strGenericHeap0.display();
        java.lang.String str11 = strGenericHeap0.get();
        java.lang.String str12 = strGenericHeap0.get();
        java.lang.String str13 = strGenericHeap0.get();
        int int14 = strGenericHeap0.size();
        java.lang.String str15 = strGenericHeap0.get();
        java.lang.String str16 = strGenericHeap0.get();
        boolean boolean17 = strGenericHeap0.isEmpty();
        java.lang.Class<?> wildcardClass18 = strGenericHeap0.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        boolean boolean4 = strGenericHeap0.isEmpty();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("hi!");
        int int9 = strGenericHeap0.size();
        strGenericHeap0.add("");
        java.lang.String str12 = strGenericHeap0.get();
        boolean boolean13 = strGenericHeap0.isEmpty();
        strGenericHeap0.display();
        java.lang.String str15 = strGenericHeap0.get();
        boolean boolean16 = strGenericHeap0.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        int int8 = strGenericHeap0.size();
        boolean boolean9 = strGenericHeap0.isEmpty();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.updatePriority("");
        java.lang.String str14 = strGenericHeap0.get();
        java.lang.String str15 = strGenericHeap0.remove();
        strGenericHeap0.add("hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        boolean boolean4 = strGenericHeap0.isEmpty();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("hi!");
        boolean boolean9 = strGenericHeap0.isEmpty();
        java.lang.String str10 = strGenericHeap0.remove();
        strGenericHeap0.display();
        strGenericHeap0.display();
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        int int16 = strGenericHeap0.size();
        boolean boolean17 = strGenericHeap0.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        strGenericHeap0.add("hi!");
        int int10 = strGenericHeap0.size();
        strGenericHeap0.add("hi!");
        strGenericHeap0.updatePriority("");
        strGenericHeap0.display();
        strGenericHeap0.display();
        strGenericHeap0.add("");
        strGenericHeap0.add("");
        strGenericHeap0.updatePriority("");
        strGenericHeap0.updatePriority("hi!");
        strGenericHeap0.add("hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        java.lang.String str8 = strGenericHeap0.get();
        int int9 = strGenericHeap0.size();
        int int10 = strGenericHeap0.size();
        boolean boolean11 = strGenericHeap0.isEmpty();
        java.lang.String str12 = strGenericHeap0.remove();
        java.lang.String str13 = strGenericHeap0.remove();
        strGenericHeap0.add("");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        int int6 = strGenericHeap0.size();
        java.lang.String str7 = strGenericHeap0.get();
        strGenericHeap0.add("hi!");
        strGenericHeap0.updatePriority("hi!");
        strGenericHeap0.add("hi!");
        boolean boolean14 = strGenericHeap0.isEmpty();
        java.lang.String str15 = strGenericHeap0.remove();
        java.lang.String str16 = strGenericHeap0.remove();
        strGenericHeap0.updatePriority("");
        java.lang.String str19 = strGenericHeap0.remove();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        strGenericHeap0.add("hi!");
        strGenericHeap0.updatePriority("hi!");
        java.lang.String str12 = strGenericHeap0.remove();
        java.lang.String str13 = strGenericHeap0.get();
        boolean boolean14 = strGenericHeap0.isEmpty();
        strGenericHeap0.display();
        strGenericHeap0.display();
        strGenericHeap0.add("hi!");
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        java.lang.Class<?> wildcardClass23 = strGenericHeap0.getClass();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        java.lang.String str3 = strGenericHeap0.get();
        int int4 = strGenericHeap0.size();
        strGenericHeap0.display();
        java.lang.String str6 = strGenericHeap0.get();
        strGenericHeap0.add("hi!");
        strGenericHeap0.updatePriority("hi!");
        strGenericHeap0.display();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        int int3 = strGenericHeap0.size();
        strGenericHeap0.display();
        boolean boolean5 = strGenericHeap0.isEmpty();
        strGenericHeap0.add("");
        boolean boolean8 = strGenericHeap0.isEmpty();
        strGenericHeap0.add("");
        strGenericHeap0.updatePriority("");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        strGenericHeap0.add("hi!");
        strGenericHeap0.updatePriority("hi!");
        java.lang.String str12 = strGenericHeap0.remove();
        java.lang.String str13 = strGenericHeap0.get();
        strGenericHeap0.updatePriority("");
        java.lang.String str16 = strGenericHeap0.remove();
        boolean boolean17 = strGenericHeap0.isEmpty();
        strGenericHeap0.display();
        strGenericHeap0.display();
        boolean boolean20 = strGenericHeap0.isEmpty();
        int int21 = strGenericHeap0.size();
        java.lang.String str22 = strGenericHeap0.remove();
        strGenericHeap0.add("");
        java.lang.String str25 = strGenericHeap0.remove();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        java.lang.String str8 = strGenericHeap0.get();
        boolean boolean9 = strGenericHeap0.isEmpty();
        java.lang.String str10 = strGenericHeap0.get();
        strGenericHeap0.display();
        java.lang.String str12 = strGenericHeap0.remove();
        java.lang.String str13 = strGenericHeap0.get();
        java.lang.String str14 = strGenericHeap0.remove();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        int int8 = strGenericHeap0.size();
        java.lang.String str9 = strGenericHeap0.get();
        strGenericHeap0.add("");
        int int12 = strGenericHeap0.size();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        int int6 = strGenericHeap0.size();
        java.lang.String str7 = strGenericHeap0.get();
        strGenericHeap0.updatePriority("");
        java.lang.String str10 = strGenericHeap0.get();
        strGenericHeap0.add("");
        boolean boolean13 = strGenericHeap0.isEmpty();
        strGenericHeap0.add("hi!");
        strGenericHeap0.add("hi!");
        int int18 = strGenericHeap0.size();
        strGenericHeap0.display();
        java.lang.String str20 = strGenericHeap0.get();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        java.lang.String str8 = strGenericHeap0.remove();
        strGenericHeap0.add("hi!");
        int int11 = strGenericHeap0.size();
        strGenericHeap0.add("");
        strGenericHeap0.updatePriority("");
        java.lang.String str16 = strGenericHeap0.get();
        strGenericHeap0.display();
        java.lang.String str18 = strGenericHeap0.remove();
        java.lang.String str19 = strGenericHeap0.get();
        java.lang.String str20 = strGenericHeap0.remove();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2054");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.display();
        int int7 = strGenericHeap0.size();
        java.lang.String str8 = strGenericHeap0.remove();
        strGenericHeap0.add("hi!");
        boolean boolean11 = strGenericHeap0.isEmpty();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        int int6 = strGenericHeap0.size();
        java.lang.String str7 = strGenericHeap0.get();
        strGenericHeap0.add("hi!");
        strGenericHeap0.add("");
        java.lang.String str12 = strGenericHeap0.remove();
        strGenericHeap0.display();
        java.lang.String str14 = strGenericHeap0.remove();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        java.lang.String str8 = strGenericHeap0.remove();
        java.lang.String str9 = strGenericHeap0.get();
        strGenericHeap0.display();
        java.lang.String str11 = strGenericHeap0.get();
        java.lang.String str12 = strGenericHeap0.get();
        java.lang.String str13 = strGenericHeap0.get();
        int int14 = strGenericHeap0.size();
        java.lang.String str15 = strGenericHeap0.get();
        java.lang.String str16 = strGenericHeap0.get();
        java.lang.String str17 = strGenericHeap0.get();
        strGenericHeap0.add("");
        int int20 = strGenericHeap0.size();
        strGenericHeap0.add("");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        int int1 = strGenericHeap0.size();
        strGenericHeap0.add("");
        java.lang.String str4 = strGenericHeap0.remove();
        strGenericHeap0.add("");
        int int7 = strGenericHeap0.size();
        java.lang.Class<?> wildcardClass8 = strGenericHeap0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        java.lang.String str3 = strGenericHeap0.get();
        strGenericHeap0.add("");
        int int6 = strGenericHeap0.size();
        int int7 = strGenericHeap0.size();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2059");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        java.lang.String str4 = strGenericHeap0.get();
        boolean boolean5 = strGenericHeap0.isEmpty();
        java.lang.String str6 = strGenericHeap0.remove();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.display();
        boolean boolean11 = strGenericHeap0.isEmpty();
        boolean boolean12 = strGenericHeap0.isEmpty();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2060");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        java.lang.String str8 = strGenericHeap0.remove();
        java.lang.String str9 = strGenericHeap0.remove();
        int int10 = strGenericHeap0.size();
        int int11 = strGenericHeap0.size();
        int int12 = strGenericHeap0.size();
        int int13 = strGenericHeap0.size();
        strGenericHeap0.add("hi!");
        java.lang.String str16 = strGenericHeap0.get();
        java.lang.String str17 = strGenericHeap0.remove();
        strGenericHeap0.add("");
        java.lang.String str20 = strGenericHeap0.get();
        int int21 = strGenericHeap0.size();
        java.lang.Class<?> wildcardClass22 = strGenericHeap0.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2061");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        java.lang.String str8 = strGenericHeap0.get();
        boolean boolean9 = strGenericHeap0.isEmpty();
        int int10 = strGenericHeap0.size();
        int int11 = strGenericHeap0.size();
        strGenericHeap0.display();
        java.lang.String str13 = strGenericHeap0.get();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2062");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        strGenericHeap0.add("hi!");
        strGenericHeap0.updatePriority("hi!");
        java.lang.String str12 = strGenericHeap0.remove();
        java.lang.String str13 = strGenericHeap0.get();
        java.lang.String str14 = strGenericHeap0.remove();
        int int15 = strGenericHeap0.size();
        strGenericHeap0.add("");
        java.lang.String str18 = strGenericHeap0.get();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        java.lang.Class<?> wildcardClass22 = strGenericHeap0.getClass();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2063");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        java.lang.String str4 = strGenericHeap0.get();
        int int5 = strGenericHeap0.size();
        boolean boolean6 = strGenericHeap0.isEmpty();
        java.lang.String str7 = strGenericHeap0.get();
        strGenericHeap0.display();
        boolean boolean9 = strGenericHeap0.isEmpty();
        boolean boolean10 = strGenericHeap0.isEmpty();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("hi!");
        java.lang.String str15 = strGenericHeap0.remove();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2064");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        strGenericHeap0.add("hi!");
        boolean boolean10 = strGenericHeap0.isEmpty();
        boolean boolean11 = strGenericHeap0.isEmpty();
        boolean boolean12 = strGenericHeap0.isEmpty();
        strGenericHeap0.display();
        java.lang.String str14 = strGenericHeap0.remove();
        java.lang.Class<?> wildcardClass15 = strGenericHeap0.getClass();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2065");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        java.lang.String str4 = strGenericHeap0.get();
        boolean boolean5 = strGenericHeap0.isEmpty();
        java.lang.String str6 = strGenericHeap0.get();
        java.lang.String str7 = strGenericHeap0.remove();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2066");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        strGenericHeap0.add("hi!");
        strGenericHeap0.updatePriority("hi!");
        java.lang.String str12 = strGenericHeap0.get();
        strGenericHeap0.display();
        strGenericHeap0.add("");
        strGenericHeap0.updatePriority("hi!");
        strGenericHeap0.display();
        strGenericHeap0.add("");
        strGenericHeap0.add("hi!");
        strGenericHeap0.add("");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2067");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        java.lang.String str3 = strGenericHeap0.get();
        strGenericHeap0.add("");
        boolean boolean6 = strGenericHeap0.isEmpty();
        strGenericHeap0.display();
        java.lang.String str8 = strGenericHeap0.remove();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2068");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        int int6 = strGenericHeap0.size();
        java.lang.String str7 = strGenericHeap0.get();
        strGenericHeap0.add("hi!");
        strGenericHeap0.updatePriority("hi!");
        strGenericHeap0.updatePriority("hi!");
        strGenericHeap0.add("");
        strGenericHeap0.add("hi!");
        java.lang.String str18 = strGenericHeap0.get();
        java.lang.String str19 = strGenericHeap0.remove();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2069");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        java.lang.String str4 = strGenericHeap0.get();
        boolean boolean5 = strGenericHeap0.isEmpty();
        strGenericHeap0.add("hi!");
        boolean boolean8 = strGenericHeap0.isEmpty();
        boolean boolean9 = strGenericHeap0.isEmpty();
        int int10 = strGenericHeap0.size();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2070");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        strGenericHeap0.add("hi!");
        java.lang.String str10 = strGenericHeap0.remove();
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        java.lang.String str14 = strGenericHeap0.remove();
        java.lang.String str15 = strGenericHeap0.get();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2071");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        java.lang.String str4 = strGenericHeap0.get();
        int int5 = strGenericHeap0.size();
        boolean boolean6 = strGenericHeap0.isEmpty();
        strGenericHeap0.add("hi!");
        strGenericHeap0.display();
        java.lang.String str10 = strGenericHeap0.get();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2072");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        java.lang.String str4 = strGenericHeap0.get();
        int int5 = strGenericHeap0.size();
        boolean boolean6 = strGenericHeap0.isEmpty();
        java.lang.String str7 = strGenericHeap0.get();
        strGenericHeap0.updatePriority("");
        boolean boolean10 = strGenericHeap0.isEmpty();
        boolean boolean11 = strGenericHeap0.isEmpty();
        strGenericHeap0.updatePriority("");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2073");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        strGenericHeap0.add("hi!");
        int int10 = strGenericHeap0.size();
        strGenericHeap0.add("hi!");
        strGenericHeap0.updatePriority("");
        strGenericHeap0.display();
        strGenericHeap0.display();
        strGenericHeap0.add("");
        strGenericHeap0.add("");
        java.lang.String str21 = strGenericHeap0.get();
        java.lang.String str22 = strGenericHeap0.remove();
        boolean boolean23 = strGenericHeap0.isEmpty();
        strGenericHeap0.add("hi!");
        int int26 = strGenericHeap0.size();
        boolean boolean27 = strGenericHeap0.isEmpty();
        boolean boolean28 = strGenericHeap0.isEmpty();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 6 + "'", int26 == 6);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2074");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        boolean boolean4 = strGenericHeap0.isEmpty();
        strGenericHeap0.updatePriority("");
        boolean boolean7 = strGenericHeap0.isEmpty();
        boolean boolean8 = strGenericHeap0.isEmpty();
        boolean boolean9 = strGenericHeap0.isEmpty();
        java.lang.String str10 = strGenericHeap0.get();
        int int11 = strGenericHeap0.size();
        strGenericHeap0.display();
        int int13 = strGenericHeap0.size();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2075");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        int int8 = strGenericHeap0.size();
        strGenericHeap0.add("");
        strGenericHeap0.add("");
        java.lang.String str13 = strGenericHeap0.remove();
        boolean boolean14 = strGenericHeap0.isEmpty();
        strGenericHeap0.display();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2076");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        int int3 = strGenericHeap0.size();
        strGenericHeap0.display();
        strGenericHeap0.add("hi!");
        boolean boolean7 = strGenericHeap0.isEmpty();
        strGenericHeap0.updatePriority("hi!");
        strGenericHeap0.updatePriority("hi!");
        strGenericHeap0.updatePriority("hi!");
        strGenericHeap0.display();
        strGenericHeap0.add("hi!");
        boolean boolean17 = strGenericHeap0.isEmpty();
        int int18 = strGenericHeap0.size();
        strGenericHeap0.add("");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2077");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        java.lang.String str8 = strGenericHeap0.remove();
        java.lang.String str9 = strGenericHeap0.get();
        boolean boolean10 = strGenericHeap0.isEmpty();
        strGenericHeap0.add("");
        int int13 = strGenericHeap0.size();
        strGenericHeap0.display();
        boolean boolean15 = strGenericHeap0.isEmpty();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2078");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        strGenericHeap0.updatePriority("");
        java.lang.String str10 = strGenericHeap0.remove();
        java.lang.String str11 = strGenericHeap0.get();
        java.lang.String str12 = strGenericHeap0.remove();
        java.lang.Class<?> wildcardClass13 = strGenericHeap0.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2079");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        strGenericHeap0.add("hi!");
        int int10 = strGenericHeap0.size();
        strGenericHeap0.add("hi!");
        strGenericHeap0.updatePriority("");
        strGenericHeap0.display();
        java.lang.String str16 = strGenericHeap0.get();
        java.lang.String str17 = strGenericHeap0.remove();
        int int18 = strGenericHeap0.size();
        strGenericHeap0.display();
        java.lang.String str20 = strGenericHeap0.get();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2080");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        java.lang.String str4 = strGenericHeap0.get();
        boolean boolean5 = strGenericHeap0.isEmpty();
        strGenericHeap0.add("hi!");
        boolean boolean8 = strGenericHeap0.isEmpty();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        strGenericHeap0.add("hi!");
        java.lang.String str15 = strGenericHeap0.get();
        java.lang.String str16 = strGenericHeap0.get();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2081");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        java.lang.String str8 = strGenericHeap0.remove();
        int int9 = strGenericHeap0.size();
        int int10 = strGenericHeap0.size();
        int int11 = strGenericHeap0.size();
        strGenericHeap0.add("hi!");
        java.lang.String str14 = strGenericHeap0.get();
        strGenericHeap0.updatePriority("");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2082");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        java.lang.String str4 = strGenericHeap0.get();
        int int5 = strGenericHeap0.size();
        strGenericHeap0.display();
        java.lang.String str7 = strGenericHeap0.get();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("hi!");
        strGenericHeap0.display();
        int int13 = strGenericHeap0.size();
        java.lang.String str14 = strGenericHeap0.get();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2083");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        java.lang.String str4 = strGenericHeap0.get();
        java.lang.String str5 = strGenericHeap0.get();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("hi!");
        java.lang.String str10 = strGenericHeap0.get();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2084");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        java.lang.String str4 = strGenericHeap0.get();
        int int5 = strGenericHeap0.size();
        boolean boolean6 = strGenericHeap0.isEmpty();
        java.lang.String str7 = strGenericHeap0.get();
        strGenericHeap0.display();
        boolean boolean9 = strGenericHeap0.isEmpty();
        boolean boolean10 = strGenericHeap0.isEmpty();
        strGenericHeap0.add("hi!");
        boolean boolean13 = strGenericHeap0.isEmpty();
        java.lang.String str14 = strGenericHeap0.get();
        boolean boolean15 = strGenericHeap0.isEmpty();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2085");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        java.lang.String str4 = strGenericHeap0.get();
        boolean boolean5 = strGenericHeap0.isEmpty();
        java.lang.String str6 = strGenericHeap0.remove();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        int int10 = strGenericHeap0.size();
        int int11 = strGenericHeap0.size();
        strGenericHeap0.add("hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2086");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        int int3 = strGenericHeap0.size();
        strGenericHeap0.display();
        strGenericHeap0.add("hi!");
        boolean boolean7 = strGenericHeap0.isEmpty();
        int int8 = strGenericHeap0.size();
        java.lang.String str9 = strGenericHeap0.get();
        strGenericHeap0.add("");
        boolean boolean12 = strGenericHeap0.isEmpty();
        java.lang.String str13 = strGenericHeap0.get();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2087");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        java.lang.String str8 = strGenericHeap0.remove();
        java.lang.String str9 = strGenericHeap0.get();
        strGenericHeap0.display();
        java.lang.String str11 = strGenericHeap0.get();
        int int12 = strGenericHeap0.size();
        strGenericHeap0.display();
        java.lang.String str14 = strGenericHeap0.get();
        strGenericHeap0.add("");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test2088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2088");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        java.lang.String str4 = strGenericHeap0.get();
        strGenericHeap0.add("");
        strGenericHeap0.add("hi!");
        strGenericHeap0.display();
        strGenericHeap0.display();
        java.lang.Class<?> wildcardClass11 = strGenericHeap0.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2089");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        strGenericHeap0.add("hi!");
        boolean boolean10 = strGenericHeap0.isEmpty();
        int int11 = strGenericHeap0.size();
        strGenericHeap0.display();
        strGenericHeap0.display();
        java.lang.String str14 = strGenericHeap0.remove();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test2090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2090");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        int int6 = strGenericHeap0.size();
        java.lang.String str7 = strGenericHeap0.get();
        strGenericHeap0.add("hi!");
        strGenericHeap0.updatePriority("hi!");
        strGenericHeap0.add("hi!");
        int int14 = strGenericHeap0.size();
        java.lang.String str15 = strGenericHeap0.remove();
        java.lang.String str16 = strGenericHeap0.remove();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test2091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2091");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        java.lang.String str4 = strGenericHeap0.get();
        boolean boolean5 = strGenericHeap0.isEmpty();
        strGenericHeap0.add("hi!");
        boolean boolean8 = strGenericHeap0.isEmpty();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        java.lang.String str13 = strGenericHeap0.get();
        strGenericHeap0.display();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test2092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2092");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        strGenericHeap0.add("hi!");
        strGenericHeap0.updatePriority("hi!");
        java.lang.String str12 = strGenericHeap0.remove();
        java.lang.String str13 = strGenericHeap0.get();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.display();
        int int17 = strGenericHeap0.size();
        java.lang.String str18 = strGenericHeap0.remove();
        java.lang.String str19 = strGenericHeap0.get();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test2093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2093");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        int int6 = strGenericHeap0.size();
        java.lang.String str7 = strGenericHeap0.get();
        strGenericHeap0.add("hi!");
        boolean boolean10 = strGenericHeap0.isEmpty();
        strGenericHeap0.display();
        java.lang.String str12 = strGenericHeap0.remove();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.display();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test2094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2094");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        java.lang.String str4 = strGenericHeap0.get();
        strGenericHeap0.add("");
        java.lang.String str7 = strGenericHeap0.remove();
        strGenericHeap0.display();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test2095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2095");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        int int1 = strGenericHeap0.size();
        strGenericHeap0.add("");
        boolean boolean4 = strGenericHeap0.isEmpty();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test2096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2096");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        strGenericHeap0.updatePriority("");
        strGenericHeap0.display();
        java.lang.String str11 = strGenericHeap0.get();
        strGenericHeap0.display();
        strGenericHeap0.add("");
        java.lang.String str15 = strGenericHeap0.remove();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test2097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2097");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        int int8 = strGenericHeap0.size();
        strGenericHeap0.add("");
        java.lang.String str11 = strGenericHeap0.remove();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test2098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2098");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        java.lang.String str4 = strGenericHeap0.get();
        java.lang.String str5 = strGenericHeap0.get();
        java.lang.String str6 = strGenericHeap0.remove();
        strGenericHeap0.add("hi!");
        strGenericHeap0.add("");
        boolean boolean11 = strGenericHeap0.isEmpty();
        boolean boolean12 = strGenericHeap0.isEmpty();
        java.lang.String str13 = strGenericHeap0.remove();
        strGenericHeap0.display();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test2099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2099");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        java.lang.String str8 = strGenericHeap0.remove();
        int int9 = strGenericHeap0.size();
        int int10 = strGenericHeap0.size();
        int int11 = strGenericHeap0.size();
        strGenericHeap0.add("hi!");
        java.lang.String str14 = strGenericHeap0.get();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.add("");
        strGenericHeap0.updatePriority("hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test2100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2100");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        int int1 = strGenericHeap0.size();
        strGenericHeap0.add("");
        strGenericHeap0.add("hi!");
        java.lang.Class<?> wildcardClass6 = strGenericHeap0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2101");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        boolean boolean4 = strGenericHeap0.isEmpty();
        boolean boolean5 = strGenericHeap0.isEmpty();
        int int6 = strGenericHeap0.size();
        java.lang.String str7 = strGenericHeap0.remove();
        int int8 = strGenericHeap0.size();
        int int9 = strGenericHeap0.size();
        strGenericHeap0.display();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2102");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        strGenericHeap0.add("hi!");
        strGenericHeap0.updatePriority("hi!");
        java.lang.String str12 = strGenericHeap0.remove();
        java.lang.String str13 = strGenericHeap0.get();
        strGenericHeap0.updatePriority("");
        java.lang.String str16 = strGenericHeap0.remove();
        int int17 = strGenericHeap0.size();
        strGenericHeap0.display();
        strGenericHeap0.add("");
        int int21 = strGenericHeap0.size();
        strGenericHeap0.add("hi!");
        int int24 = strGenericHeap0.size();
        strGenericHeap0.add("hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
    }

    @Test
    public void test2103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2103");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        java.lang.String str4 = strGenericHeap0.get();
        boolean boolean5 = strGenericHeap0.isEmpty();
        java.lang.String str6 = strGenericHeap0.get();
        strGenericHeap0.add("");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test2104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2104");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        strGenericHeap0.add("hi!");
        strGenericHeap0.updatePriority("hi!");
        java.lang.String str12 = strGenericHeap0.remove();
        java.lang.String str13 = strGenericHeap0.get();
        strGenericHeap0.updatePriority("");
        java.lang.String str16 = strGenericHeap0.remove();
        boolean boolean17 = strGenericHeap0.isEmpty();
        strGenericHeap0.display();
        boolean boolean19 = strGenericHeap0.isEmpty();
        boolean boolean20 = strGenericHeap0.isEmpty();
        strGenericHeap0.add("hi!");
        boolean boolean23 = strGenericHeap0.isEmpty();
        java.lang.String str24 = strGenericHeap0.remove();
        java.lang.String str25 = strGenericHeap0.remove();
        java.lang.Class<?> wildcardClass26 = strGenericHeap0.getClass();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test2105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2105");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        boolean boolean4 = strGenericHeap0.isEmpty();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("hi!");
        int int9 = strGenericHeap0.size();
        strGenericHeap0.add("");
        java.lang.String str12 = strGenericHeap0.get();
        boolean boolean13 = strGenericHeap0.isEmpty();
        strGenericHeap0.add("");
        strGenericHeap0.add("hi!");
        strGenericHeap0.updatePriority("hi!");
        strGenericHeap0.display();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2106");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        strGenericHeap0.add("hi!");
        strGenericHeap0.updatePriority("hi!");
        strGenericHeap0.display();
        java.lang.String str13 = strGenericHeap0.get();
        boolean boolean14 = strGenericHeap0.isEmpty();
        java.lang.String str15 = strGenericHeap0.remove();
        java.lang.String str16 = strGenericHeap0.remove();
        strGenericHeap0.add("hi!");
        strGenericHeap0.add("hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test2107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2107");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        java.lang.String str8 = strGenericHeap0.get();
        boolean boolean9 = strGenericHeap0.isEmpty();
        int int10 = strGenericHeap0.size();
        int int11 = strGenericHeap0.size();
        int int12 = strGenericHeap0.size();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
    }

    @Test
    public void test2108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2108");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        java.lang.String str4 = strGenericHeap0.get();
        strGenericHeap0.add("");
        strGenericHeap0.add("hi!");
        strGenericHeap0.updatePriority("");
        int int11 = strGenericHeap0.size();
        strGenericHeap0.updatePriority("hi!");
        boolean boolean14 = strGenericHeap0.isEmpty();
        strGenericHeap0.updatePriority("hi!");
        strGenericHeap0.updatePriority("hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2109");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        java.lang.String str8 = strGenericHeap0.remove();
        java.lang.String str9 = strGenericHeap0.remove();
        int int10 = strGenericHeap0.size();
        int int11 = strGenericHeap0.size();
        int int12 = strGenericHeap0.size();
        int int13 = strGenericHeap0.size();
        strGenericHeap0.add("hi!");
        java.lang.String str16 = strGenericHeap0.get();
        java.lang.String str17 = strGenericHeap0.remove();
        strGenericHeap0.add("");
        java.lang.String str20 = strGenericHeap0.get();
        boolean boolean21 = strGenericHeap0.isEmpty();
        strGenericHeap0.add("");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test2110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2110");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        int int8 = strGenericHeap0.size();
        boolean boolean9 = strGenericHeap0.isEmpty();
        java.lang.String str10 = strGenericHeap0.remove();
        boolean boolean11 = strGenericHeap0.isEmpty();
        int int12 = strGenericHeap0.size();
        int int13 = strGenericHeap0.size();
        java.lang.String str14 = strGenericHeap0.remove();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test2111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2111");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        boolean boolean4 = strGenericHeap0.isEmpty();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("hi!");
        int int9 = strGenericHeap0.size();
        strGenericHeap0.add("");
        java.lang.String str12 = strGenericHeap0.get();
        boolean boolean13 = strGenericHeap0.isEmpty();
        boolean boolean14 = strGenericHeap0.isEmpty();
        boolean boolean15 = strGenericHeap0.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2112");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        strGenericHeap0.add("hi!");
        boolean boolean10 = strGenericHeap0.isEmpty();
        strGenericHeap0.updatePriority("hi!");
        strGenericHeap0.display();
        strGenericHeap0.add("hi!");
        strGenericHeap0.updatePriority("");
        boolean boolean18 = strGenericHeap0.isEmpty();
        strGenericHeap0.display();
        java.lang.String str20 = strGenericHeap0.remove();
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test2113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2113");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        java.lang.String str8 = strGenericHeap0.remove();
        java.lang.String str9 = strGenericHeap0.remove();
        int int10 = strGenericHeap0.size();
        int int11 = strGenericHeap0.size();
        strGenericHeap0.add("");
        java.lang.String str14 = strGenericHeap0.remove();
        strGenericHeap0.add("hi!");
        strGenericHeap0.display();
        int int18 = strGenericHeap0.size();
        strGenericHeap0.display();
        java.lang.String str20 = strGenericHeap0.remove();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = strGenericHeap0.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test2114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2114");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        boolean boolean4 = strGenericHeap0.isEmpty();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("hi!");
        boolean boolean9 = strGenericHeap0.isEmpty();
        java.lang.String str10 = strGenericHeap0.remove();
        strGenericHeap0.display();
        strGenericHeap0.display();
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        java.lang.String str16 = strGenericHeap0.get();
        java.lang.Class<?> wildcardClass17 = strGenericHeap0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2115");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        boolean boolean4 = strGenericHeap0.isEmpty();
        strGenericHeap0.updatePriority("");
        boolean boolean7 = strGenericHeap0.isEmpty();
        boolean boolean8 = strGenericHeap0.isEmpty();
        boolean boolean9 = strGenericHeap0.isEmpty();
        strGenericHeap0.display();
        java.lang.String str11 = strGenericHeap0.get();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        boolean boolean16 = strGenericHeap0.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2116");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        boolean boolean8 = strGenericHeap0.isEmpty();
        boolean boolean9 = strGenericHeap0.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2117");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        strGenericHeap0.add("hi!");
        boolean boolean10 = strGenericHeap0.isEmpty();
        strGenericHeap0.updatePriority("hi!");
        strGenericHeap0.add("hi!");
        java.lang.String str15 = strGenericHeap0.remove();
        boolean boolean16 = strGenericHeap0.isEmpty();
        boolean boolean17 = strGenericHeap0.isEmpty();
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        java.lang.Class<?> wildcardClass21 = strGenericHeap0.getClass();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2118");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        int int8 = strGenericHeap0.size();
        java.lang.String str9 = strGenericHeap0.get();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test2119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2119");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        java.lang.String str8 = strGenericHeap0.get();
        boolean boolean9 = strGenericHeap0.isEmpty();
        strGenericHeap0.updatePriority("");
        int int12 = strGenericHeap0.size();
        java.lang.String str13 = strGenericHeap0.get();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        int int18 = strGenericHeap0.size();
        strGenericHeap0.add("");
        strGenericHeap0.updatePriority("");
        int int23 = strGenericHeap0.size();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 4 + "'", int23 == 4);
    }

    @Test
    public void test2120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2120");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        strGenericHeap0.add("hi!");
        strGenericHeap0.updatePriority("hi!");
        java.lang.String str12 = strGenericHeap0.get();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        boolean boolean16 = strGenericHeap0.isEmpty();
        boolean boolean17 = strGenericHeap0.isEmpty();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test2121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2121");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        java.lang.String str8 = strGenericHeap0.get();
        boolean boolean9 = strGenericHeap0.isEmpty();
        int int10 = strGenericHeap0.size();
        int int11 = strGenericHeap0.size();
        java.lang.Class<?> wildcardClass12 = strGenericHeap0.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2122");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        strGenericHeap0.add("hi!");
        int int10 = strGenericHeap0.size();
        strGenericHeap0.add("hi!");
        strGenericHeap0.updatePriority("");
        strGenericHeap0.display();
        strGenericHeap0.display();
        strGenericHeap0.add("");
        strGenericHeap0.add("");
        java.lang.String str21 = strGenericHeap0.get();
        java.lang.Class<?> wildcardClass22 = strGenericHeap0.getClass();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2123");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        java.lang.String str8 = strGenericHeap0.get();
        boolean boolean9 = strGenericHeap0.isEmpty();
        int int10 = strGenericHeap0.size();
        java.lang.String str11 = strGenericHeap0.remove();
        java.lang.String str12 = strGenericHeap0.get();
        boolean boolean13 = strGenericHeap0.isEmpty();
        java.lang.String str14 = strGenericHeap0.remove();
        int int15 = strGenericHeap0.size();
        java.lang.Class<?> wildcardClass16 = strGenericHeap0.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2124");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        java.lang.String str8 = strGenericHeap0.remove();
        java.lang.String str9 = strGenericHeap0.remove();
        int int10 = strGenericHeap0.size();
        int int11 = strGenericHeap0.size();
        strGenericHeap0.add("");
        java.lang.String str14 = strGenericHeap0.remove();
        strGenericHeap0.add("hi!");
        strGenericHeap0.display();
        int int18 = strGenericHeap0.size();
        strGenericHeap0.display();
        java.lang.String str20 = strGenericHeap0.get();
        java.lang.String str21 = strGenericHeap0.get();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test2125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2125");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        java.lang.String str4 = strGenericHeap0.get();
        java.lang.String str5 = strGenericHeap0.get();
        int int6 = strGenericHeap0.size();
        strGenericHeap0.display();
        strGenericHeap0.add("");
        int int10 = strGenericHeap0.size();
        strGenericHeap0.display();
        int int12 = strGenericHeap0.size();
        java.lang.String str13 = strGenericHeap0.get();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test2126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2126");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        strGenericHeap0.add("hi!");
        strGenericHeap0.updatePriority("hi!");
        java.lang.String str12 = strGenericHeap0.remove();
        java.lang.String str13 = strGenericHeap0.get();
        strGenericHeap0.updatePriority("");
        java.lang.String str16 = strGenericHeap0.remove();
        boolean boolean17 = strGenericHeap0.isEmpty();
        strGenericHeap0.display();
        int int19 = strGenericHeap0.size();
        strGenericHeap0.add("hi!");
        strGenericHeap0.updatePriority("hi!");
        int int24 = strGenericHeap0.size();
        strGenericHeap0.updatePriority("hi!");
        strGenericHeap0.add("hi!");
        java.lang.Class<?> wildcardClass29 = strGenericHeap0.getClass();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test2127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2127");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        java.lang.String str4 = strGenericHeap0.get();
        int int5 = strGenericHeap0.size();
        boolean boolean6 = strGenericHeap0.isEmpty();
        strGenericHeap0.add("hi!");
        java.lang.String str9 = strGenericHeap0.remove();
        java.lang.String str10 = strGenericHeap0.remove();
        strGenericHeap0.add("hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test2128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2128");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        java.lang.String str8 = strGenericHeap0.remove();
        strGenericHeap0.add("hi!");
        strGenericHeap0.updatePriority("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("hi!");
        strGenericHeap0.add("hi!");
        strGenericHeap0.updatePriority("hi!");
        strGenericHeap0.add("hi!");
        strGenericHeap0.add("");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test2129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2129");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        int int8 = strGenericHeap0.size();
        java.lang.String str9 = strGenericHeap0.get();
        strGenericHeap0.add("");
        java.lang.String str12 = strGenericHeap0.remove();
        strGenericHeap0.add("hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test2130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2130");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        boolean boolean4 = strGenericHeap0.isEmpty();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("hi!");
        boolean boolean9 = strGenericHeap0.isEmpty();
        java.lang.String str10 = strGenericHeap0.remove();
        strGenericHeap0.display();
        strGenericHeap0.add("");
        int int14 = strGenericHeap0.size();
        int int15 = strGenericHeap0.size();
        java.lang.String str16 = strGenericHeap0.get();
        strGenericHeap0.add("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test2131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2131");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        boolean boolean4 = strGenericHeap0.isEmpty();
        boolean boolean5 = strGenericHeap0.isEmpty();
        int int6 = strGenericHeap0.size();
        boolean boolean7 = strGenericHeap0.isEmpty();
        strGenericHeap0.display();
        strGenericHeap0.add("");
        boolean boolean11 = strGenericHeap0.isEmpty();
        strGenericHeap0.updatePriority("");
        java.lang.String str14 = strGenericHeap0.remove();
        java.lang.String str15 = strGenericHeap0.get();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test2132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2132");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        strGenericHeap0.add("hi!");
        boolean boolean10 = strGenericHeap0.isEmpty();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("hi!");
        int int16 = strGenericHeap0.size();
        strGenericHeap0.updatePriority("hi!");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
    }

    @Test
    public void test2133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2133");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        int int3 = strGenericHeap0.size();
        strGenericHeap0.display();
        strGenericHeap0.add("hi!");
        boolean boolean7 = strGenericHeap0.isEmpty();
        strGenericHeap0.updatePriority("hi!");
        strGenericHeap0.updatePriority("hi!");
        java.lang.String str12 = strGenericHeap0.get();
        strGenericHeap0.updatePriority("hi!");
        strGenericHeap0.add("hi!");
        java.lang.String str17 = strGenericHeap0.remove();
        java.lang.String str18 = strGenericHeap0.remove();
        strGenericHeap0.display();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test2134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2134");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        java.lang.String str8 = strGenericHeap0.remove();
        java.lang.String str9 = strGenericHeap0.remove();
        int int10 = strGenericHeap0.size();
        int int11 = strGenericHeap0.size();
        strGenericHeap0.add("hi!");
        int int14 = strGenericHeap0.size();
        java.lang.String str15 = strGenericHeap0.get();
        strGenericHeap0.updatePriority("hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test2135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2135");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        boolean boolean4 = strGenericHeap0.isEmpty();
        strGenericHeap0.updatePriority("");
        boolean boolean7 = strGenericHeap0.isEmpty();
        strGenericHeap0.add("");
        boolean boolean10 = strGenericHeap0.isEmpty();
        int int11 = strGenericHeap0.size();
        boolean boolean12 = strGenericHeap0.isEmpty();
        int int13 = strGenericHeap0.size();
        java.lang.String str14 = strGenericHeap0.get();
        strGenericHeap0.updatePriority("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test2136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2136");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        strGenericHeap0.add("hi!");
        strGenericHeap0.updatePriority("hi!");
        java.lang.String str12 = strGenericHeap0.get();
        strGenericHeap0.display();
        strGenericHeap0.add("");
        strGenericHeap0.updatePriority("hi!");
        strGenericHeap0.display();
        java.lang.String str19 = strGenericHeap0.get();
        java.lang.String str20 = strGenericHeap0.get();
        java.lang.Class<?> wildcardClass21 = strGenericHeap0.getClass();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2137");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        boolean boolean4 = strGenericHeap0.isEmpty();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("hi!");
        int int9 = strGenericHeap0.size();
        int int10 = strGenericHeap0.size();
        strGenericHeap0.updatePriority("");
        boolean boolean13 = strGenericHeap0.isEmpty();
        java.lang.String str14 = strGenericHeap0.remove();
        strGenericHeap0.add("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test2138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2138");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        boolean boolean4 = strGenericHeap0.isEmpty();
        java.lang.String str5 = strGenericHeap0.remove();
        strGenericHeap0.add("");
        int int8 = strGenericHeap0.size();
        java.lang.String str9 = strGenericHeap0.get();
        strGenericHeap0.display();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test2139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2139");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        java.lang.String str4 = strGenericHeap0.get();
        java.lang.String str5 = strGenericHeap0.get();
        java.lang.String str6 = strGenericHeap0.remove();
        strGenericHeap0.add("hi!");
        strGenericHeap0.add("");
        int int11 = strGenericHeap0.size();
        java.lang.String str12 = strGenericHeap0.get();
        int int13 = strGenericHeap0.size();
        java.lang.Class<?> wildcardClass14 = strGenericHeap0.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2140");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        boolean boolean4 = strGenericHeap0.isEmpty();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("hi!");
        boolean boolean9 = strGenericHeap0.isEmpty();
        java.lang.String str10 = strGenericHeap0.get();
        strGenericHeap0.display();
        java.lang.String str12 = strGenericHeap0.get();
        strGenericHeap0.add("hi!");
        int int15 = strGenericHeap0.size();
        java.lang.Class<?> wildcardClass16 = strGenericHeap0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2141");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        java.lang.String str8 = strGenericHeap0.remove();
        java.lang.String str9 = strGenericHeap0.get();
        strGenericHeap0.display();
        java.lang.String str11 = strGenericHeap0.get();
        java.lang.String str12 = strGenericHeap0.get();
        java.lang.String str13 = strGenericHeap0.get();
        int int14 = strGenericHeap0.size();
        java.lang.String str15 = strGenericHeap0.get();
        java.lang.String str16 = strGenericHeap0.get();
        int int17 = strGenericHeap0.size();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test2142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2142");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        int int8 = strGenericHeap0.size();
        strGenericHeap0.add("");
        boolean boolean11 = strGenericHeap0.isEmpty();
        java.lang.String str12 = strGenericHeap0.remove();
        java.lang.String str13 = strGenericHeap0.get();
        int int14 = strGenericHeap0.size();
        strGenericHeap0.display();
        strGenericHeap0.add("");
        int int18 = strGenericHeap0.size();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
    }

    @Test
    public void test2143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2143");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        int int6 = strGenericHeap0.size();
        java.lang.String str7 = strGenericHeap0.get();
        strGenericHeap0.add("hi!");
        strGenericHeap0.updatePriority("hi!");
        strGenericHeap0.updatePriority("hi!");
        strGenericHeap0.updatePriority("");
        java.lang.String str16 = strGenericHeap0.get();
        strGenericHeap0.display();
        java.lang.String str18 = strGenericHeap0.remove();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test2144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2144");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        java.lang.String str4 = strGenericHeap0.get();
        strGenericHeap0.add("");
        strGenericHeap0.add("hi!");
        strGenericHeap0.updatePriority("");
        java.lang.String str11 = strGenericHeap0.get();
        strGenericHeap0.add("");
        strGenericHeap0.add("hi!");
        int int16 = strGenericHeap0.size();
        boolean boolean17 = strGenericHeap0.isEmpty();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test2145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2145");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        strGenericHeap0.updatePriority("");
        strGenericHeap0.display();
        int int11 = strGenericHeap0.size();
        java.lang.String str12 = strGenericHeap0.get();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test2146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2146");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        int int6 = strGenericHeap0.size();
        java.lang.String str7 = strGenericHeap0.get();
        strGenericHeap0.add("hi!");
        strGenericHeap0.updatePriority("hi!");
        strGenericHeap0.add("hi!");
        int int14 = strGenericHeap0.size();
        java.lang.String str15 = strGenericHeap0.remove();
        int int16 = strGenericHeap0.size();
        strGenericHeap0.display();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
    }

    @Test
    public void test2147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2147");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        strGenericHeap0.add("hi!");
        boolean boolean10 = strGenericHeap0.isEmpty();
        strGenericHeap0.updatePriority("hi!");
        strGenericHeap0.add("hi!");
        java.lang.String str15 = strGenericHeap0.remove();
        strGenericHeap0.add("");
        java.lang.String str18 = strGenericHeap0.remove();
        strGenericHeap0.add("hi!");
        java.lang.String str21 = strGenericHeap0.get();
        strGenericHeap0.display();
        boolean boolean23 = strGenericHeap0.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test2148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2148");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        java.lang.String str4 = strGenericHeap0.get();
        java.lang.String str5 = strGenericHeap0.get();
        int int6 = strGenericHeap0.size();
        strGenericHeap0.display();
        java.lang.String str8 = strGenericHeap0.remove();
        strGenericHeap0.add("");
        java.lang.String str11 = strGenericHeap0.remove();
        int int12 = strGenericHeap0.size();
        int int13 = strGenericHeap0.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = strGenericHeap0.get();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test2149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2149");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        int int3 = strGenericHeap0.size();
        strGenericHeap0.display();
        strGenericHeap0.add("hi!");
        boolean boolean7 = strGenericHeap0.isEmpty();
        java.lang.String str8 = strGenericHeap0.remove();
        java.lang.String str9 = strGenericHeap0.get();
        int int10 = strGenericHeap0.size();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test2150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2150");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        java.lang.String str8 = strGenericHeap0.remove();
        strGenericHeap0.display();
        strGenericHeap0.add("");
        strGenericHeap0.updatePriority("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        int int17 = strGenericHeap0.size();
        strGenericHeap0.add("hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
    }

    @Test
    public void test2151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2151");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        boolean boolean4 = strGenericHeap0.isEmpty();
        strGenericHeap0.updatePriority("");
        java.lang.String str7 = strGenericHeap0.get();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test2152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2152");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        java.lang.String str8 = strGenericHeap0.remove();
        strGenericHeap0.add("hi!");
        int int11 = strGenericHeap0.size();
        strGenericHeap0.add("");
        strGenericHeap0.updatePriority("");
        java.lang.String str16 = strGenericHeap0.get();
        boolean boolean17 = strGenericHeap0.isEmpty();
        int int18 = strGenericHeap0.size();
        int int19 = strGenericHeap0.size();
        int int20 = strGenericHeap0.size();
        java.lang.String str21 = strGenericHeap0.remove();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test2153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2153");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        java.lang.String str8 = strGenericHeap0.remove();
        java.lang.String str9 = strGenericHeap0.get();
        boolean boolean10 = strGenericHeap0.isEmpty();
        strGenericHeap0.add("");
        int int13 = strGenericHeap0.size();
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        boolean boolean17 = strGenericHeap0.isEmpty();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test2154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2154");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        java.lang.String str8 = strGenericHeap0.remove();
        strGenericHeap0.add("hi!");
        int int11 = strGenericHeap0.size();
        strGenericHeap0.add("hi!");
        boolean boolean14 = strGenericHeap0.isEmpty();
        boolean boolean15 = strGenericHeap0.isEmpty();
        java.lang.String str16 = strGenericHeap0.remove();
        java.lang.String str17 = strGenericHeap0.remove();
        int int18 = strGenericHeap0.size();
        boolean boolean19 = strGenericHeap0.isEmpty();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2155");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        strGenericHeap0.add("hi!");
        strGenericHeap0.updatePriority("hi!");
        java.lang.String str12 = strGenericHeap0.remove();
        java.lang.String str13 = strGenericHeap0.get();
        strGenericHeap0.updatePriority("");
        java.lang.String str16 = strGenericHeap0.remove();
        strGenericHeap0.display();
        strGenericHeap0.add("");
        strGenericHeap0.add("");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test2156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2156");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        int int8 = strGenericHeap0.size();
        boolean boolean9 = strGenericHeap0.isEmpty();
        strGenericHeap0.add("hi!");
        java.lang.String str12 = strGenericHeap0.remove();
        java.lang.String str13 = strGenericHeap0.remove();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test2157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2157");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        strGenericHeap0.add("hi!");
        int int10 = strGenericHeap0.size();
        strGenericHeap0.updatePriority("hi!");
        int int13 = strGenericHeap0.size();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
    }

    @Test
    public void test2158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2158");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        java.lang.String str8 = strGenericHeap0.get();
        boolean boolean9 = strGenericHeap0.isEmpty();
        int int10 = strGenericHeap0.size();
        int int11 = strGenericHeap0.size();
        strGenericHeap0.display();
        int int13 = strGenericHeap0.size();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
    }

    @Test
    public void test2159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2159");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        java.lang.String str8 = strGenericHeap0.get();
        boolean boolean9 = strGenericHeap0.isEmpty();
        strGenericHeap0.updatePriority("");
        java.lang.String str12 = strGenericHeap0.get();
        boolean boolean13 = strGenericHeap0.isEmpty();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.display();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2160");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        java.lang.String str4 = strGenericHeap0.get();
        int int5 = strGenericHeap0.size();
        boolean boolean6 = strGenericHeap0.isEmpty();
        java.lang.String str7 = strGenericHeap0.get();
        java.lang.String str8 = strGenericHeap0.get();
        java.lang.String str9 = strGenericHeap0.remove();
        boolean boolean10 = strGenericHeap0.isEmpty();
        int int11 = strGenericHeap0.size();
        strGenericHeap0.display();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2161");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        java.lang.String str8 = strGenericHeap0.remove();
        java.lang.String str9 = strGenericHeap0.get();
        strGenericHeap0.display();
        java.lang.String str11 = strGenericHeap0.get();
        java.lang.String str12 = strGenericHeap0.get();
        java.lang.String str13 = strGenericHeap0.get();
        int int14 = strGenericHeap0.size();
        java.lang.String str15 = strGenericHeap0.get();
        java.lang.String str16 = strGenericHeap0.get();
        boolean boolean17 = strGenericHeap0.isEmpty();
        java.lang.String str18 = strGenericHeap0.remove();
        boolean boolean19 = strGenericHeap0.isEmpty();
        strGenericHeap0.add("");
        boolean boolean22 = strGenericHeap0.isEmpty();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test2162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2162");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        int int6 = strGenericHeap0.size();
        java.lang.String str7 = strGenericHeap0.get();
        strGenericHeap0.updatePriority("");
        java.lang.String str10 = strGenericHeap0.get();
        java.lang.String str11 = strGenericHeap0.get();
        java.lang.String str12 = strGenericHeap0.get();
        strGenericHeap0.display();
        strGenericHeap0.display();
        boolean boolean15 = strGenericHeap0.isEmpty();
        boolean boolean16 = strGenericHeap0.isEmpty();
        strGenericHeap0.add("hi!");
        strGenericHeap0.updatePriority("");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2163");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        java.lang.String str8 = strGenericHeap0.remove();
        strGenericHeap0.add("hi!");
        int int11 = strGenericHeap0.size();
        int int12 = strGenericHeap0.size();
        java.lang.String str13 = strGenericHeap0.remove();
        int int14 = strGenericHeap0.size();
        java.lang.String str15 = strGenericHeap0.remove();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = strGenericHeap0.get();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test2164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2164");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        int int3 = strGenericHeap0.size();
        strGenericHeap0.display();
        int int5 = strGenericHeap0.size();
        java.lang.Class<?> wildcardClass6 = strGenericHeap0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2165");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        int int8 = strGenericHeap0.size();
        strGenericHeap0.add("");
        strGenericHeap0.add("");
        int int13 = strGenericHeap0.size();
        int int14 = strGenericHeap0.size();
        strGenericHeap0.display();
        java.lang.String str16 = strGenericHeap0.get();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test2166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2166");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        boolean boolean4 = strGenericHeap0.isEmpty();
        strGenericHeap0.updatePriority("");
        boolean boolean7 = strGenericHeap0.isEmpty();
        strGenericHeap0.add("");
        boolean boolean10 = strGenericHeap0.isEmpty();
        java.lang.String str11 = strGenericHeap0.remove();
        boolean boolean12 = strGenericHeap0.isEmpty();
        strGenericHeap0.display();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2167");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        int int1 = strGenericHeap0.size();
        strGenericHeap0.display();
        int int3 = strGenericHeap0.size();
        strGenericHeap0.add("");
        int int6 = strGenericHeap0.size();
        int int7 = strGenericHeap0.size();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test2168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2168");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        strGenericHeap0.add("hi!");
        strGenericHeap0.updatePriority("hi!");
        strGenericHeap0.display();
        java.lang.String str13 = strGenericHeap0.get();
        java.lang.String str14 = strGenericHeap0.get();
        strGenericHeap0.display();
        boolean boolean16 = strGenericHeap0.isEmpty();
        boolean boolean17 = strGenericHeap0.isEmpty();
        strGenericHeap0.display();
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test2169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2169");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        java.lang.String str4 = strGenericHeap0.get();
        int int5 = strGenericHeap0.size();
        strGenericHeap0.display();
        java.lang.String str7 = strGenericHeap0.get();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("hi!");
        strGenericHeap0.display();
        java.lang.String str13 = strGenericHeap0.remove();
        java.lang.Class<?> wildcardClass14 = strGenericHeap0.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2170");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        java.lang.String str4 = strGenericHeap0.get();
        java.lang.String str5 = strGenericHeap0.get();
        java.lang.String str6 = strGenericHeap0.remove();
        strGenericHeap0.add("hi!");
        strGenericHeap0.add("");
        int int11 = strGenericHeap0.size();
        java.lang.String str12 = strGenericHeap0.get();
        java.lang.String str13 = strGenericHeap0.get();
        java.lang.String str14 = strGenericHeap0.get();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test2171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2171");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        java.lang.String str4 = strGenericHeap0.get();
        strGenericHeap0.add("");
        strGenericHeap0.add("hi!");
        strGenericHeap0.display();
        strGenericHeap0.display();
        java.lang.String str11 = strGenericHeap0.get();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test2172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2172");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        java.lang.String str8 = strGenericHeap0.get();
        int int9 = strGenericHeap0.size();
        int int10 = strGenericHeap0.size();
        boolean boolean11 = strGenericHeap0.isEmpty();
        java.lang.String str12 = strGenericHeap0.remove();
        java.lang.String str13 = strGenericHeap0.get();
        boolean boolean14 = strGenericHeap0.isEmpty();
        int int15 = strGenericHeap0.size();
        int int16 = strGenericHeap0.size();
        strGenericHeap0.add("hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test2173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2173");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        java.lang.String str4 = strGenericHeap0.get();
        java.lang.String str5 = strGenericHeap0.get();
        java.lang.String str6 = strGenericHeap0.remove();
        boolean boolean7 = strGenericHeap0.isEmpty();
        boolean boolean8 = strGenericHeap0.isEmpty();
        int int9 = strGenericHeap0.size();
        boolean boolean10 = strGenericHeap0.isEmpty();
        java.lang.Class<?> wildcardClass11 = strGenericHeap0.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2174");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        java.lang.String str8 = strGenericHeap0.remove();
        strGenericHeap0.add("hi!");
        strGenericHeap0.updatePriority("");
        boolean boolean13 = strGenericHeap0.isEmpty();
        strGenericHeap0.updatePriority("hi!");
        strGenericHeap0.display();
        java.lang.String str17 = strGenericHeap0.remove();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test2175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2175");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        java.lang.String str8 = strGenericHeap0.remove();
        int int9 = strGenericHeap0.size();
        int int10 = strGenericHeap0.size();
        int int11 = strGenericHeap0.size();
        strGenericHeap0.display();
        int int13 = strGenericHeap0.size();
        java.lang.String str14 = strGenericHeap0.get();
        strGenericHeap0.add("");
        java.lang.String str17 = strGenericHeap0.remove();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test2176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2176");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        strGenericHeap0.add("hi!");
        boolean boolean10 = strGenericHeap0.isEmpty();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("hi!");
        int int16 = strGenericHeap0.size();
        java.lang.String str17 = strGenericHeap0.remove();
        java.lang.String str18 = strGenericHeap0.get();
        java.lang.String str19 = strGenericHeap0.remove();
        boolean boolean20 = strGenericHeap0.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test2177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2177");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        strGenericHeap0.add("hi!");
        int int10 = strGenericHeap0.size();
        strGenericHeap0.add("hi!");
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("hi!");
        java.lang.String str17 = strGenericHeap0.remove();
        strGenericHeap0.display();
        strGenericHeap0.display();
        java.lang.Class<?> wildcardClass20 = strGenericHeap0.getClass();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2178");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        java.lang.String str3 = strGenericHeap0.get();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        boolean boolean7 = strGenericHeap0.isEmpty();
        strGenericHeap0.display();
        int int9 = strGenericHeap0.size();
        strGenericHeap0.updatePriority("");
        boolean boolean12 = strGenericHeap0.isEmpty();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2179");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        java.lang.String str8 = strGenericHeap0.remove();
        java.lang.String str9 = strGenericHeap0.remove();
        strGenericHeap0.add("");
        strGenericHeap0.add("");
        java.lang.String str14 = strGenericHeap0.remove();
        java.lang.String str15 = strGenericHeap0.remove();
        strGenericHeap0.add("");
        strGenericHeap0.add("");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test2180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2180");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        java.lang.String str8 = strGenericHeap0.remove();
        java.lang.String str9 = strGenericHeap0.remove();
        int int10 = strGenericHeap0.size();
        strGenericHeap0.display();
        int int12 = strGenericHeap0.size();
        strGenericHeap0.add("hi!");
        int int15 = strGenericHeap0.size();
        boolean boolean16 = strGenericHeap0.isEmpty();
        boolean boolean17 = strGenericHeap0.isEmpty();
        strGenericHeap0.add("hi!");
        strGenericHeap0.display();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test2181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2181");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        java.lang.String str3 = strGenericHeap0.get();
        strGenericHeap0.add("");
        java.lang.String str6 = strGenericHeap0.get();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test2182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2182");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        java.lang.String str4 = strGenericHeap0.get();
        boolean boolean5 = strGenericHeap0.isEmpty();
        boolean boolean6 = strGenericHeap0.isEmpty();
        int int7 = strGenericHeap0.size();
        boolean boolean8 = strGenericHeap0.isEmpty();
        java.lang.String str9 = strGenericHeap0.get();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test2183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2183");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        java.lang.String str4 = strGenericHeap0.get();
        boolean boolean5 = strGenericHeap0.isEmpty();
        boolean boolean6 = strGenericHeap0.isEmpty();
        strGenericHeap0.add("hi!");
        java.lang.String str9 = strGenericHeap0.remove();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test2184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2184");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        boolean boolean6 = strGenericHeap0.isEmpty();
        strGenericHeap0.add("hi!");
        java.lang.String str9 = strGenericHeap0.remove();
        java.lang.String str10 = strGenericHeap0.get();
        int int11 = strGenericHeap0.size();
        strGenericHeap0.display();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test2185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2185");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.display();
        strGenericHeap0.display();
        int int8 = strGenericHeap0.size();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test2186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2186");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        java.lang.String str8 = strGenericHeap0.get();
        int int9 = strGenericHeap0.size();
        int int10 = strGenericHeap0.size();
        boolean boolean11 = strGenericHeap0.isEmpty();
        java.lang.String str12 = strGenericHeap0.remove();
        java.lang.String str13 = strGenericHeap0.get();
        java.lang.String str14 = strGenericHeap0.remove();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test2187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2187");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        java.lang.String str8 = strGenericHeap0.remove();
        java.lang.String str9 = strGenericHeap0.get();
        strGenericHeap0.display();
        java.lang.String str11 = strGenericHeap0.get();
        java.lang.String str12 = strGenericHeap0.get();
        java.lang.String str13 = strGenericHeap0.get();
        strGenericHeap0.display();
        strGenericHeap0.display();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test2188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2188");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        strGenericHeap0.add("hi!");
        strGenericHeap0.updatePriority("hi!");
        strGenericHeap0.display();
        strGenericHeap0.display();
        java.lang.String str14 = strGenericHeap0.get();
        java.lang.String str15 = strGenericHeap0.remove();
        java.lang.String str16 = strGenericHeap0.get();
        boolean boolean17 = strGenericHeap0.isEmpty();
        java.lang.String str18 = strGenericHeap0.remove();
        strGenericHeap0.display();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test2189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2189");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        java.lang.String str4 = strGenericHeap0.get();
        boolean boolean5 = strGenericHeap0.isEmpty();
        strGenericHeap0.add("hi!");
        boolean boolean8 = strGenericHeap0.isEmpty();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        boolean boolean13 = strGenericHeap0.isEmpty();
        strGenericHeap0.display();
        java.lang.String str15 = strGenericHeap0.remove();
        strGenericHeap0.display();
        java.lang.String str17 = strGenericHeap0.get();
        boolean boolean18 = strGenericHeap0.isEmpty();
        java.lang.Class<?> wildcardClass19 = strGenericHeap0.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2190");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        java.lang.String str8 = strGenericHeap0.remove();
        java.lang.String str9 = strGenericHeap0.get();
        strGenericHeap0.display();
        java.lang.String str11 = strGenericHeap0.get();
        int int12 = strGenericHeap0.size();
        strGenericHeap0.display();
        int int14 = strGenericHeap0.size();
        java.lang.String str15 = strGenericHeap0.get();
        boolean boolean16 = strGenericHeap0.isEmpty();
        java.lang.String str17 = strGenericHeap0.get();
        java.lang.String str18 = strGenericHeap0.remove();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test2191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2191");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        int int1 = strGenericHeap0.size();
        int int2 = strGenericHeap0.size();
        strGenericHeap0.display();
        strGenericHeap0.add("");
        int int6 = strGenericHeap0.size();
        boolean boolean7 = strGenericHeap0.isEmpty();
        strGenericHeap0.display();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2192");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        int int6 = strGenericHeap0.size();
        java.lang.String str7 = strGenericHeap0.get();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.display();
        strGenericHeap0.display();
        java.lang.String str12 = strGenericHeap0.remove();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test2193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2193");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        java.lang.String str4 = strGenericHeap0.get();
        java.lang.String str5 = strGenericHeap0.get();
        strGenericHeap0.add("hi!");
        boolean boolean8 = strGenericHeap0.isEmpty();
        strGenericHeap0.updatePriority("hi!");
        java.lang.String str11 = strGenericHeap0.remove();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test2194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2194");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        strGenericHeap0.add("hi!");
        strGenericHeap0.updatePriority("hi!");
        java.lang.String str12 = strGenericHeap0.remove();
        java.lang.String str13 = strGenericHeap0.get();
        strGenericHeap0.updatePriority("");
        java.lang.String str16 = strGenericHeap0.remove();
        boolean boolean17 = strGenericHeap0.isEmpty();
        strGenericHeap0.display();
        boolean boolean19 = strGenericHeap0.isEmpty();
        java.lang.String str20 = strGenericHeap0.get();
        java.lang.String str21 = strGenericHeap0.get();
        boolean boolean22 = strGenericHeap0.isEmpty();
        java.lang.String str23 = strGenericHeap0.get();
        java.lang.String str24 = strGenericHeap0.get();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test2195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2195");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        int int1 = strGenericHeap0.size();
        int int2 = strGenericHeap0.size();
        strGenericHeap0.add("");
        java.lang.String str5 = strGenericHeap0.get();
        int int6 = strGenericHeap0.size();
        int int7 = strGenericHeap0.size();
        boolean boolean8 = strGenericHeap0.isEmpty();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2196");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        boolean boolean4 = strGenericHeap0.isEmpty();
        strGenericHeap0.updatePriority("");
        boolean boolean7 = strGenericHeap0.isEmpty();
        boolean boolean8 = strGenericHeap0.isEmpty();
        strGenericHeap0.display();
        java.lang.String str10 = strGenericHeap0.get();
        java.lang.String str11 = strGenericHeap0.get();
        strGenericHeap0.add("hi!");
        strGenericHeap0.display();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test2197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2197");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        java.lang.String str8 = strGenericHeap0.remove();
        int int9 = strGenericHeap0.size();
        int int10 = strGenericHeap0.size();
        int int11 = strGenericHeap0.size();
        strGenericHeap0.add("hi!");
        strGenericHeap0.updatePriority("");
        strGenericHeap0.display();
        boolean boolean17 = strGenericHeap0.isEmpty();
        strGenericHeap0.add("hi!");
        strGenericHeap0.display();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test2198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2198");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        java.lang.String str4 = strGenericHeap0.get();
        int int5 = strGenericHeap0.size();
        boolean boolean6 = strGenericHeap0.isEmpty();
        java.lang.String str7 = strGenericHeap0.get();
        java.lang.String str8 = strGenericHeap0.get();
        java.lang.String str9 = strGenericHeap0.remove();
        boolean boolean10 = strGenericHeap0.isEmpty();
        int int11 = strGenericHeap0.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = strGenericHeap0.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2199");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        java.lang.String str4 = strGenericHeap0.get();
        strGenericHeap0.add("");
        strGenericHeap0.add("hi!");
        strGenericHeap0.updatePriority("");
        int int11 = strGenericHeap0.size();
        strGenericHeap0.updatePriority("hi!");
        boolean boolean14 = strGenericHeap0.isEmpty();
        java.lang.String str15 = strGenericHeap0.remove();
        java.lang.String str16 = strGenericHeap0.get();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test2200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2200");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        strGenericHeap0.add("hi!");
        strGenericHeap0.updatePriority("hi!");
        int int12 = strGenericHeap0.size();
        strGenericHeap0.add("hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
    }

    @Test
    public void test2201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2201");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        int int8 = strGenericHeap0.size();
        strGenericHeap0.updatePriority("");
        java.lang.String str11 = strGenericHeap0.remove();
        boolean boolean12 = strGenericHeap0.isEmpty();
        int int13 = strGenericHeap0.size();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test2202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2202");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        boolean boolean6 = strGenericHeap0.isEmpty();
        strGenericHeap0.add("hi!");
        int int9 = strGenericHeap0.size();
        strGenericHeap0.add("hi!");
        int int12 = strGenericHeap0.size();
        strGenericHeap0.updatePriority("hi!");
        int int15 = strGenericHeap0.size();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
    }

    @Test
    public void test2203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2203");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        java.lang.String str8 = strGenericHeap0.remove();
        strGenericHeap0.display();
        boolean boolean10 = strGenericHeap0.isEmpty();
        boolean boolean11 = strGenericHeap0.isEmpty();
        int int12 = strGenericHeap0.size();
        int int13 = strGenericHeap0.size();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test2204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2204");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        int int6 = strGenericHeap0.size();
        java.lang.String str7 = strGenericHeap0.get();
        strGenericHeap0.add("hi!");
        strGenericHeap0.updatePriority("hi!");
        strGenericHeap0.add("hi!");
        int int14 = strGenericHeap0.size();
        int int15 = strGenericHeap0.size();
        strGenericHeap0.add("hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
    }

    @Test
    public void test2205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2205");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        java.lang.String str4 = strGenericHeap0.get();
        boolean boolean5 = strGenericHeap0.isEmpty();
        strGenericHeap0.add("hi!");
        boolean boolean8 = strGenericHeap0.isEmpty();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        boolean boolean13 = strGenericHeap0.isEmpty();
        strGenericHeap0.display();
        java.lang.String str15 = strGenericHeap0.remove();
        strGenericHeap0.display();
        java.lang.String str17 = strGenericHeap0.get();
        java.lang.String str18 = strGenericHeap0.get();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test2206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2206");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        int int1 = strGenericHeap0.size();
        int int2 = strGenericHeap0.size();
        strGenericHeap0.add("");
        int int5 = strGenericHeap0.size();
        strGenericHeap0.add("hi!");
        int int8 = strGenericHeap0.size();
        strGenericHeap0.add("hi!");
        boolean boolean11 = strGenericHeap0.isEmpty();
        strGenericHeap0.display();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2207");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        boolean boolean8 = strGenericHeap0.isEmpty();
        java.lang.String str9 = strGenericHeap0.get();
        int int10 = strGenericHeap0.size();
        java.lang.String str11 = strGenericHeap0.remove();
        int int12 = strGenericHeap0.size();
        java.lang.String str13 = strGenericHeap0.remove();
        java.lang.Class<?> wildcardClass14 = strGenericHeap0.getClass();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2208");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        java.lang.String str8 = strGenericHeap0.remove();
        java.lang.String str9 = strGenericHeap0.get();
        strGenericHeap0.display();
        java.lang.String str11 = strGenericHeap0.get();
        java.lang.String str12 = strGenericHeap0.get();
        java.lang.String str13 = strGenericHeap0.get();
        int int14 = strGenericHeap0.size();
        java.lang.String str15 = strGenericHeap0.get();
        java.lang.String str16 = strGenericHeap0.get();
        boolean boolean17 = strGenericHeap0.isEmpty();
        strGenericHeap0.display();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test2209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2209");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        java.lang.String str3 = strGenericHeap0.get();
        int int4 = strGenericHeap0.size();
        strGenericHeap0.display();
        boolean boolean6 = strGenericHeap0.isEmpty();
        boolean boolean7 = strGenericHeap0.isEmpty();
        java.lang.String str8 = strGenericHeap0.get();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test2210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2210");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        java.lang.String str8 = strGenericHeap0.remove();
        java.lang.String str9 = strGenericHeap0.get();
        strGenericHeap0.display();
        java.lang.String str11 = strGenericHeap0.get();
        java.lang.String str12 = strGenericHeap0.get();
        java.lang.String str13 = strGenericHeap0.get();
        int int14 = strGenericHeap0.size();
        strGenericHeap0.display();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test2211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2211");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        java.lang.String str4 = strGenericHeap0.get();
        strGenericHeap0.add("");
        strGenericHeap0.add("hi!");
        strGenericHeap0.updatePriority("");
        int int11 = strGenericHeap0.size();
        strGenericHeap0.updatePriority("hi!");
        boolean boolean14 = strGenericHeap0.isEmpty();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.display();
        java.lang.String str18 = strGenericHeap0.get();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test2212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2212");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        java.lang.String str8 = strGenericHeap0.get();
        int int9 = strGenericHeap0.size();
        int int10 = strGenericHeap0.size();
        boolean boolean11 = strGenericHeap0.isEmpty();
        java.lang.String str12 = strGenericHeap0.get();
        strGenericHeap0.add("hi!");
        java.lang.String str15 = strGenericHeap0.remove();
        java.lang.String str16 = strGenericHeap0.remove();
        java.lang.String str17 = strGenericHeap0.get();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test2213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2213");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        strGenericHeap0.add("hi!");
        boolean boolean10 = strGenericHeap0.isEmpty();
        strGenericHeap0.updatePriority("hi!");
        strGenericHeap0.display();
        strGenericHeap0.add("hi!");
        strGenericHeap0.updatePriority("");
        boolean boolean18 = strGenericHeap0.isEmpty();
        boolean boolean19 = strGenericHeap0.isEmpty();
        int int20 = strGenericHeap0.size();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
    }

    @Test
    public void test2214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2214");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        int int6 = strGenericHeap0.size();
        java.lang.String str7 = strGenericHeap0.get();
        strGenericHeap0.add("hi!");
        boolean boolean10 = strGenericHeap0.isEmpty();
        java.lang.String str11 = strGenericHeap0.remove();
        strGenericHeap0.display();
        boolean boolean13 = strGenericHeap0.isEmpty();
        strGenericHeap0.add("hi!");
        java.lang.String str16 = strGenericHeap0.get();
        java.lang.Class<?> wildcardClass17 = strGenericHeap0.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2215");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.display();
        int int2 = strGenericHeap0.size();
        strGenericHeap0.add("");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2216");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        int int8 = strGenericHeap0.size();
        strGenericHeap0.add("");
        boolean boolean11 = strGenericHeap0.isEmpty();
        strGenericHeap0.display();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2217");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        java.lang.String str4 = strGenericHeap0.get();
        java.lang.String str5 = strGenericHeap0.get();
        int int6 = strGenericHeap0.size();
        strGenericHeap0.display();
        java.lang.String str8 = strGenericHeap0.remove();
        strGenericHeap0.add("");
        java.lang.String str11 = strGenericHeap0.remove();
        java.lang.Class<?> wildcardClass12 = strGenericHeap0.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2218");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        java.lang.String str4 = strGenericHeap0.get();
        boolean boolean5 = strGenericHeap0.isEmpty();
        strGenericHeap0.add("hi!");
        boolean boolean8 = strGenericHeap0.isEmpty();
        java.lang.String str9 = strGenericHeap0.get();
        java.lang.String str10 = strGenericHeap0.remove();
        java.lang.String str11 = strGenericHeap0.remove();
        strGenericHeap0.display();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test2219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2219");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        java.lang.String str4 = strGenericHeap0.get();
        strGenericHeap0.add("");
        strGenericHeap0.add("hi!");
        strGenericHeap0.updatePriority("");
        int int11 = strGenericHeap0.size();
        strGenericHeap0.updatePriority("hi!");
        boolean boolean14 = strGenericHeap0.isEmpty();
        int int15 = strGenericHeap0.size();
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        java.lang.String str19 = strGenericHeap0.remove();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test2220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2220");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        int int1 = strGenericHeap0.size();
        int int2 = strGenericHeap0.size();
        strGenericHeap0.display();
        strGenericHeap0.add("");
        java.lang.String str6 = strGenericHeap0.get();
        java.lang.String str7 = strGenericHeap0.get();
        java.lang.String str8 = strGenericHeap0.remove();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test2221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2221");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        java.lang.String str8 = strGenericHeap0.remove();
        java.lang.String str9 = strGenericHeap0.remove();
        int int10 = strGenericHeap0.size();
        strGenericHeap0.display();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        int int15 = strGenericHeap0.size();
        strGenericHeap0.display();
        strGenericHeap0.add("");
        strGenericHeap0.add("hi!");
        java.lang.String str21 = strGenericHeap0.get();
        java.lang.String str22 = strGenericHeap0.get();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test2222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2222");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        java.lang.String str4 = strGenericHeap0.get();
        strGenericHeap0.add("");
        strGenericHeap0.add("hi!");
        strGenericHeap0.updatePriority("");
        int int11 = strGenericHeap0.size();
        strGenericHeap0.updatePriority("hi!");
        java.lang.String str14 = strGenericHeap0.get();
        strGenericHeap0.add("hi!");
        strGenericHeap0.display();
        boolean boolean18 = strGenericHeap0.isEmpty();
        strGenericHeap0.updatePriority("hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test2223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2223");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        strGenericHeap0.updatePriority("");
        strGenericHeap0.display();
        boolean boolean11 = strGenericHeap0.isEmpty();
        strGenericHeap0.updatePriority("");
        java.lang.String str14 = strGenericHeap0.get();
        boolean boolean15 = strGenericHeap0.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2224");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        strGenericHeap0.add("hi!");
        boolean boolean10 = strGenericHeap0.isEmpty();
        int int11 = strGenericHeap0.size();
        strGenericHeap0.display();
        strGenericHeap0.display();
        java.lang.String str14 = strGenericHeap0.get();
        strGenericHeap0.display();
        boolean boolean16 = strGenericHeap0.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2225");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        boolean boolean4 = strGenericHeap0.isEmpty();
        java.lang.String str5 = strGenericHeap0.remove();
        strGenericHeap0.add("");
        int int8 = strGenericHeap0.size();
        boolean boolean9 = strGenericHeap0.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2226");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        strGenericHeap0.add("hi!");
        strGenericHeap0.updatePriority("hi!");
        java.lang.String str12 = strGenericHeap0.get();
        strGenericHeap0.display();
        boolean boolean14 = strGenericHeap0.isEmpty();
        strGenericHeap0.add("");
        java.lang.String str17 = strGenericHeap0.remove();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test2227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2227");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        java.lang.String str8 = strGenericHeap0.remove();
        strGenericHeap0.display();
        int int10 = strGenericHeap0.size();
        boolean boolean11 = strGenericHeap0.isEmpty();
        strGenericHeap0.display();
        java.lang.String str13 = strGenericHeap0.get();
        java.lang.String str14 = strGenericHeap0.get();
        java.lang.String str15 = strGenericHeap0.get();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test2228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2228");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        int int1 = strGenericHeap0.size();
        int int2 = strGenericHeap0.size();
        boolean boolean3 = strGenericHeap0.isEmpty();
        strGenericHeap0.add("hi!");
        int int6 = strGenericHeap0.size();
        int int7 = strGenericHeap0.size();
        int int8 = strGenericHeap0.size();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test2229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2229");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.display();
        strGenericHeap0.add("");
        strGenericHeap0.add("hi!");
        strGenericHeap0.add("");
    }

    @Test
    public void test2230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2230");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        java.lang.String str3 = strGenericHeap0.get();
        strGenericHeap0.add("");
        boolean boolean6 = strGenericHeap0.isEmpty();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        int int10 = strGenericHeap0.size();
        strGenericHeap0.updatePriority("");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
    }

    @Test
    public void test2231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2231");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        java.lang.String str4 = strGenericHeap0.get();
        strGenericHeap0.add("");
        strGenericHeap0.add("hi!");
        strGenericHeap0.updatePriority("");
        int int11 = strGenericHeap0.size();
        strGenericHeap0.updatePriority("hi!");
        java.lang.String str14 = strGenericHeap0.get();
        strGenericHeap0.updatePriority("hi!");
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("hi!");
        java.lang.String str21 = strGenericHeap0.get();
        boolean boolean22 = strGenericHeap0.isEmpty();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test2232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2232");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        java.lang.String str8 = strGenericHeap0.remove();
        java.lang.String str9 = strGenericHeap0.remove();
        strGenericHeap0.add("");
        strGenericHeap0.add("");
        strGenericHeap0.updatePriority("");
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("hi!");
        strGenericHeap0.display();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test2233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2233");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        strGenericHeap0.add("hi!");
        strGenericHeap0.updatePriority("hi!");
        java.lang.String str12 = strGenericHeap0.remove();
        java.lang.String str13 = strGenericHeap0.get();
        strGenericHeap0.updatePriority("");
        java.lang.String str16 = strGenericHeap0.remove();
        java.lang.String str17 = strGenericHeap0.remove();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test2234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2234");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        java.lang.String str8 = strGenericHeap0.remove();
        strGenericHeap0.add("hi!");
        strGenericHeap0.updatePriority("");
        java.lang.String str13 = strGenericHeap0.remove();
        java.lang.String str14 = strGenericHeap0.remove();
        strGenericHeap0.add("");
        java.lang.Class<?> wildcardClass17 = strGenericHeap0.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2235");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        java.lang.String str8 = strGenericHeap0.get();
        boolean boolean9 = strGenericHeap0.isEmpty();
        boolean boolean10 = strGenericHeap0.isEmpty();
        java.lang.String str11 = strGenericHeap0.get();
        java.lang.String str12 = strGenericHeap0.remove();
        int int13 = strGenericHeap0.size();
        strGenericHeap0.add("hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test2236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2236");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        java.lang.String str8 = strGenericHeap0.remove();
        int int9 = strGenericHeap0.size();
        int int10 = strGenericHeap0.size();
        int int11 = strGenericHeap0.size();
        strGenericHeap0.add("hi!");
        java.lang.String str14 = strGenericHeap0.remove();
        strGenericHeap0.add("");
        strGenericHeap0.updatePriority("");
        strGenericHeap0.updatePriority("");
        java.lang.String str21 = strGenericHeap0.remove();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test2237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2237");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        java.lang.String str8 = strGenericHeap0.remove();
        strGenericHeap0.display();
        int int10 = strGenericHeap0.size();
        java.lang.String str11 = strGenericHeap0.get();
        strGenericHeap0.display();
        strGenericHeap0.add("hi!");
        java.lang.String str15 = strGenericHeap0.get();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test2238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2238");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        int int8 = strGenericHeap0.size();
        boolean boolean9 = strGenericHeap0.isEmpty();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.updatePriority("");
        boolean boolean14 = strGenericHeap0.isEmpty();
        java.lang.Class<?> wildcardClass15 = strGenericHeap0.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2239");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        java.lang.String str4 = strGenericHeap0.get();
        java.lang.String str5 = strGenericHeap0.get();
        java.lang.String str6 = strGenericHeap0.remove();
        strGenericHeap0.add("hi!");
        int int9 = strGenericHeap0.size();
        java.lang.String str10 = strGenericHeap0.remove();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test2240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2240");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        strGenericHeap0.add("hi!");
        boolean boolean10 = strGenericHeap0.isEmpty();
        strGenericHeap0.updatePriority("hi!");
        strGenericHeap0.updatePriority("");
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        java.lang.String str19 = strGenericHeap0.get();
        java.lang.Class<?> wildcardClass20 = strGenericHeap0.getClass();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2241");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        java.lang.String str3 = strGenericHeap0.get();
        strGenericHeap0.add("");
        boolean boolean6 = strGenericHeap0.isEmpty();
        strGenericHeap0.add("");
        java.lang.String str9 = strGenericHeap0.remove();
        boolean boolean10 = strGenericHeap0.isEmpty();
        strGenericHeap0.add("");
        strGenericHeap0.add("hi!");
        boolean boolean15 = strGenericHeap0.isEmpty();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2242");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        java.lang.String str4 = strGenericHeap0.get();
        int int5 = strGenericHeap0.size();
        int int6 = strGenericHeap0.size();
        java.lang.String str7 = strGenericHeap0.get();
        java.lang.String str8 = strGenericHeap0.remove();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test2243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2243");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        java.lang.String str4 = strGenericHeap0.get();
        strGenericHeap0.add("");
        strGenericHeap0.add("hi!");
        strGenericHeap0.updatePriority("");
        java.lang.String str11 = strGenericHeap0.get();
        boolean boolean12 = strGenericHeap0.isEmpty();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2244");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        int int3 = strGenericHeap0.size();
        strGenericHeap0.display();
        boolean boolean5 = strGenericHeap0.isEmpty();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.add("hi!");
        strGenericHeap0.add("");
        boolean boolean13 = strGenericHeap0.isEmpty();
        strGenericHeap0.updatePriority("");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2245");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        java.lang.String str8 = strGenericHeap0.remove();
        strGenericHeap0.add("hi!");
        int int11 = strGenericHeap0.size();
        int int12 = strGenericHeap0.size();
        java.lang.String str13 = strGenericHeap0.get();
        strGenericHeap0.display();
        java.lang.Class<?> wildcardClass15 = strGenericHeap0.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2246");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        java.lang.String str6 = strGenericHeap0.get();
        strGenericHeap0.add("hi!");
        boolean boolean9 = strGenericHeap0.isEmpty();
        java.lang.String str10 = strGenericHeap0.remove();
        boolean boolean11 = strGenericHeap0.isEmpty();
        boolean boolean12 = strGenericHeap0.isEmpty();
        int int13 = strGenericHeap0.size();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test2247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2247");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        java.lang.String str8 = strGenericHeap0.remove();
        java.lang.String str9 = strGenericHeap0.get();
        strGenericHeap0.display();
        java.lang.String str11 = strGenericHeap0.get();
        java.lang.String str12 = strGenericHeap0.get();
        strGenericHeap0.display();
        strGenericHeap0.add("");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test2248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2248");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        java.lang.String str8 = strGenericHeap0.remove();
        java.lang.String str9 = strGenericHeap0.remove();
        int int10 = strGenericHeap0.size();
        int int11 = strGenericHeap0.size();
        int int12 = strGenericHeap0.size();
        int int13 = strGenericHeap0.size();
        strGenericHeap0.add("hi!");
        java.lang.String str16 = strGenericHeap0.get();
        java.lang.String str17 = strGenericHeap0.remove();
        strGenericHeap0.add("");
        strGenericHeap0.updatePriority("");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test2249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2249");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        java.lang.String str8 = strGenericHeap0.get();
        int int9 = strGenericHeap0.size();
        int int10 = strGenericHeap0.size();
        boolean boolean11 = strGenericHeap0.isEmpty();
        strGenericHeap0.add("hi!");
        strGenericHeap0.add("hi!");
        java.lang.String str16 = strGenericHeap0.remove();
        strGenericHeap0.add("");
        strGenericHeap0.add("");
        strGenericHeap0.display();
        java.lang.String str22 = strGenericHeap0.remove();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test2250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2250");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        java.lang.String str4 = strGenericHeap0.get();
        int int5 = strGenericHeap0.size();
        boolean boolean6 = strGenericHeap0.isEmpty();
        strGenericHeap0.add("hi!");
        boolean boolean9 = strGenericHeap0.isEmpty();
        java.lang.String str10 = strGenericHeap0.remove();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test2251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2251");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        strGenericHeap0.add("hi!");
        strGenericHeap0.updatePriority("hi!");
        int int12 = strGenericHeap0.size();
        java.lang.String str13 = strGenericHeap0.get();
        strGenericHeap0.add("");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test2252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2252");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        java.lang.String str8 = strGenericHeap0.remove();
        java.lang.String str9 = strGenericHeap0.remove();
        int int10 = strGenericHeap0.size();
        int int11 = strGenericHeap0.size();
        int int12 = strGenericHeap0.size();
        int int13 = strGenericHeap0.size();
        strGenericHeap0.add("hi!");
        java.lang.String str16 = strGenericHeap0.get();
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test2253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2253");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        java.lang.String str4 = strGenericHeap0.get();
        int int5 = strGenericHeap0.size();
        boolean boolean6 = strGenericHeap0.isEmpty();
        java.lang.String str7 = strGenericHeap0.get();
        strGenericHeap0.display();
        strGenericHeap0.display();
        strGenericHeap0.display();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test2254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2254");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        strGenericHeap0.add("hi!");
        strGenericHeap0.updatePriority("hi!");
        java.lang.String str12 = strGenericHeap0.remove();
        java.lang.String str13 = strGenericHeap0.get();
        strGenericHeap0.display();
        int int15 = strGenericHeap0.size();
        strGenericHeap0.display();
        int int17 = strGenericHeap0.size();
        int int18 = strGenericHeap0.size();
        strGenericHeap0.display();
        strGenericHeap0.display();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
    }

    @Test
    public void test2255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2255");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.add("hi!");
        strGenericHeap0.display();
        boolean boolean7 = strGenericHeap0.isEmpty();
        java.lang.String str8 = strGenericHeap0.get();
        java.lang.String str9 = strGenericHeap0.remove();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        boolean boolean13 = strGenericHeap0.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2256");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        java.lang.String str4 = strGenericHeap0.get();
        strGenericHeap0.add("");
        strGenericHeap0.add("hi!");
        strGenericHeap0.updatePriority("");
        int int11 = strGenericHeap0.size();
        strGenericHeap0.updatePriority("hi!");
        java.lang.String str14 = strGenericHeap0.get();
        java.lang.String str15 = strGenericHeap0.remove();
        java.lang.String str16 = strGenericHeap0.remove();
        boolean boolean17 = strGenericHeap0.isEmpty();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test2257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2257");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        java.lang.String str4 = strGenericHeap0.get();
        boolean boolean5 = strGenericHeap0.isEmpty();
        java.lang.String str6 = strGenericHeap0.remove();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        java.lang.String str10 = strGenericHeap0.remove();
        strGenericHeap0.display();
        java.lang.Class<?> wildcardClass12 = strGenericHeap0.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2258");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        int int6 = strGenericHeap0.size();
        java.lang.String str7 = strGenericHeap0.get();
        strGenericHeap0.updatePriority("");
        boolean boolean10 = strGenericHeap0.isEmpty();
        boolean boolean11 = strGenericHeap0.isEmpty();
        java.lang.Class<?> wildcardClass12 = strGenericHeap0.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2259");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        java.lang.String str4 = strGenericHeap0.get();
        java.lang.String str5 = strGenericHeap0.get();
        strGenericHeap0.add("hi!");
        boolean boolean8 = strGenericHeap0.isEmpty();
        strGenericHeap0.add("hi!");
        strGenericHeap0.display();
        strGenericHeap0.display();
        java.lang.String str13 = strGenericHeap0.get();
        boolean boolean14 = strGenericHeap0.isEmpty();
        strGenericHeap0.add("hi!");
        java.lang.Class<?> wildcardClass17 = strGenericHeap0.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2260");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        java.lang.String str4 = strGenericHeap0.get();
        boolean boolean5 = strGenericHeap0.isEmpty();
        strGenericHeap0.add("hi!");
        boolean boolean8 = strGenericHeap0.isEmpty();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        boolean boolean13 = strGenericHeap0.isEmpty();
        strGenericHeap0.display();
        strGenericHeap0.add("");
        strGenericHeap0.add("");
        java.lang.String str19 = strGenericHeap0.get();
        int int20 = strGenericHeap0.size();
        java.lang.Class<?> wildcardClass21 = strGenericHeap0.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 5 + "'", int20 == 5);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2261");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        java.lang.String str8 = strGenericHeap0.remove();
        strGenericHeap0.display();
        boolean boolean10 = strGenericHeap0.isEmpty();
        strGenericHeap0.display();
        java.lang.Class<?> wildcardClass12 = strGenericHeap0.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2262");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        boolean boolean6 = strGenericHeap0.isEmpty();
        strGenericHeap0.add("hi!");
        int int9 = strGenericHeap0.size();
        strGenericHeap0.add("hi!");
        strGenericHeap0.add("hi!");
        strGenericHeap0.add("");
        java.lang.String str16 = strGenericHeap0.remove();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test2263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2263");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        int int1 = strGenericHeap0.size();
        strGenericHeap0.add("");
        boolean boolean4 = strGenericHeap0.isEmpty();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.display();
        boolean boolean8 = strGenericHeap0.isEmpty();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2264");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        int int6 = strGenericHeap0.size();
        java.lang.String str7 = strGenericHeap0.get();
        int int8 = strGenericHeap0.size();
        java.lang.String str9 = strGenericHeap0.get();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.display();
        strGenericHeap0.display();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test2265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2265");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        strGenericHeap0.add("hi!");
        boolean boolean10 = strGenericHeap0.isEmpty();
        strGenericHeap0.updatePriority("hi!");
        strGenericHeap0.add("hi!");
        java.lang.String str15 = strGenericHeap0.remove();
        boolean boolean16 = strGenericHeap0.isEmpty();
        java.lang.String str17 = strGenericHeap0.get();
        strGenericHeap0.display();
        strGenericHeap0.add("");
        boolean boolean21 = strGenericHeap0.isEmpty();
        java.lang.String str22 = strGenericHeap0.get();
        java.lang.Class<?> wildcardClass23 = strGenericHeap0.getClass();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2266");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.add("hi!");
        strGenericHeap0.display();
        boolean boolean7 = strGenericHeap0.isEmpty();
        java.lang.String str8 = strGenericHeap0.get();
        java.lang.String str9 = strGenericHeap0.remove();
        strGenericHeap0.add("");
        boolean boolean12 = strGenericHeap0.isEmpty();
        java.lang.String str13 = strGenericHeap0.get();
        strGenericHeap0.display();
        java.lang.Class<?> wildcardClass15 = strGenericHeap0.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2267");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        java.lang.String str4 = strGenericHeap0.get();
        strGenericHeap0.add("");
        strGenericHeap0.add("hi!");
        strGenericHeap0.updatePriority("");
        strGenericHeap0.updatePriority("hi!");
        java.lang.String str13 = strGenericHeap0.get();
        boolean boolean14 = strGenericHeap0.isEmpty();
        strGenericHeap0.add("hi!");
        strGenericHeap0.display();
        java.lang.String str18 = strGenericHeap0.get();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test2268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2268");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        java.lang.String str8 = strGenericHeap0.remove();
        java.lang.String str9 = strGenericHeap0.remove();
        int int10 = strGenericHeap0.size();
        strGenericHeap0.display();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        int int15 = strGenericHeap0.size();
        strGenericHeap0.display();
        strGenericHeap0.add("");
        strGenericHeap0.add("hi!");
        java.lang.String str21 = strGenericHeap0.get();
        boolean boolean22 = strGenericHeap0.isEmpty();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test2269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2269");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        java.lang.String str3 = strGenericHeap0.get();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        boolean boolean7 = strGenericHeap0.isEmpty();
        boolean boolean8 = strGenericHeap0.isEmpty();
        java.lang.String str9 = strGenericHeap0.remove();
        java.lang.String str10 = strGenericHeap0.get();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test2270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2270");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        java.lang.String str3 = strGenericHeap0.get();
        strGenericHeap0.add("");
        boolean boolean6 = strGenericHeap0.isEmpty();
        strGenericHeap0.add("");
        java.lang.String str9 = strGenericHeap0.remove();
        boolean boolean10 = strGenericHeap0.isEmpty();
        int int11 = strGenericHeap0.size();
        strGenericHeap0.add("hi!");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
    }

    @Test
    public void test2271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2271");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        strGenericHeap0.add("hi!");
        java.lang.String str10 = strGenericHeap0.remove();
        strGenericHeap0.display();
        java.lang.String str12 = strGenericHeap0.remove();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test2272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2272");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        java.lang.String str4 = strGenericHeap0.get();
        boolean boolean5 = strGenericHeap0.isEmpty();
        strGenericHeap0.add("hi!");
        boolean boolean8 = strGenericHeap0.isEmpty();
        boolean boolean9 = strGenericHeap0.isEmpty();
        int int10 = strGenericHeap0.size();
        boolean boolean11 = strGenericHeap0.isEmpty();
        strGenericHeap0.add("hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2273");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        int int6 = strGenericHeap0.size();
        java.lang.String str7 = strGenericHeap0.get();
        strGenericHeap0.updatePriority("");
        java.lang.String str10 = strGenericHeap0.get();
        java.lang.String str11 = strGenericHeap0.get();
        java.lang.String str12 = strGenericHeap0.get();
        int int13 = strGenericHeap0.size();
        strGenericHeap0.display();
        strGenericHeap0.display();
        java.lang.String str16 = strGenericHeap0.get();
        java.lang.Class<?> wildcardClass17 = strGenericHeap0.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2274");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        strGenericHeap0.add("hi!");
        boolean boolean10 = strGenericHeap0.isEmpty();
        strGenericHeap0.updatePriority("hi!");
        strGenericHeap0.display();
        strGenericHeap0.add("hi!");
        strGenericHeap0.updatePriority("");
        boolean boolean18 = strGenericHeap0.isEmpty();
        strGenericHeap0.display();
        java.lang.String str20 = strGenericHeap0.remove();
        int int21 = strGenericHeap0.size();
        java.lang.Class<?> wildcardClass22 = strGenericHeap0.getClass();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2275");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        int int3 = strGenericHeap0.size();
        strGenericHeap0.display();
        boolean boolean5 = strGenericHeap0.isEmpty();
        boolean boolean6 = strGenericHeap0.isEmpty();
        boolean boolean7 = strGenericHeap0.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2276");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        java.lang.String str3 = strGenericHeap0.get();
        strGenericHeap0.add("");
        boolean boolean6 = strGenericHeap0.isEmpty();
        strGenericHeap0.display();
        boolean boolean8 = strGenericHeap0.isEmpty();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2277");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        int int1 = strGenericHeap0.size();
        int int2 = strGenericHeap0.size();
        strGenericHeap0.add("");
        int int5 = strGenericHeap0.size();
        strGenericHeap0.add("hi!");
        int int8 = strGenericHeap0.size();
        boolean boolean9 = strGenericHeap0.isEmpty();
        java.lang.Class<?> wildcardClass10 = strGenericHeap0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2278");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        java.lang.String str4 = strGenericHeap0.get();
        strGenericHeap0.add("");
        strGenericHeap0.add("hi!");
        strGenericHeap0.updatePriority("");
        java.lang.String str11 = strGenericHeap0.get();
        strGenericHeap0.add("");
        strGenericHeap0.updatePriority("");
        int int16 = strGenericHeap0.size();
        java.lang.String str17 = strGenericHeap0.get();
        int int18 = strGenericHeap0.size();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
    }

    @Test
    public void test2279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2279");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        int int6 = strGenericHeap0.size();
        java.lang.String str7 = strGenericHeap0.get();
        strGenericHeap0.add("hi!");
        strGenericHeap0.updatePriority("hi!");
        int int12 = strGenericHeap0.size();
        strGenericHeap0.display();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
    }

    @Test
    public void test2280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2280");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        java.lang.String str8 = strGenericHeap0.remove();
        int int9 = strGenericHeap0.size();
        int int10 = strGenericHeap0.size();
        int int11 = strGenericHeap0.size();
        strGenericHeap0.add("hi!");
        java.lang.String str14 = strGenericHeap0.remove();
        strGenericHeap0.add("");
        strGenericHeap0.updatePriority("");
        strGenericHeap0.updatePriority("");
        strGenericHeap0.updatePriority("");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test2281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2281");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        int int3 = strGenericHeap0.size();
        strGenericHeap0.display();
        strGenericHeap0.add("hi!");
        boolean boolean7 = strGenericHeap0.isEmpty();
        strGenericHeap0.updatePriority("hi!");
        strGenericHeap0.updatePriority("hi!");
        strGenericHeap0.updatePriority("hi!");
        strGenericHeap0.display();
        strGenericHeap0.add("hi!");
        java.lang.Class<?> wildcardClass17 = strGenericHeap0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2282");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.add("hi!");
        strGenericHeap0.display();
        strGenericHeap0.display();
        boolean boolean8 = strGenericHeap0.isEmpty();
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("hi!");
        strGenericHeap0.updatePriority("hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2283");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        java.lang.String str8 = strGenericHeap0.remove();
        strGenericHeap0.display();
        int int10 = strGenericHeap0.size();
        boolean boolean11 = strGenericHeap0.isEmpty();
        java.lang.String str12 = strGenericHeap0.remove();
        strGenericHeap0.add("");
        int int15 = strGenericHeap0.size();
        strGenericHeap0.display();
        boolean boolean17 = strGenericHeap0.isEmpty();
        strGenericHeap0.add("");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test2284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2284");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        int int6 = strGenericHeap0.size();
        java.lang.String str7 = strGenericHeap0.get();
        strGenericHeap0.updatePriority("");
        java.lang.String str10 = strGenericHeap0.get();
        java.lang.String str11 = strGenericHeap0.get();
        java.lang.String str12 = strGenericHeap0.get();
        int int13 = strGenericHeap0.size();
        strGenericHeap0.display();
        java.lang.String str15 = strGenericHeap0.remove();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = strGenericHeap0.get();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test2285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2285");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        int int3 = strGenericHeap0.size();
        strGenericHeap0.display();
        strGenericHeap0.add("hi!");
        boolean boolean7 = strGenericHeap0.isEmpty();
        strGenericHeap0.updatePriority("hi!");
        strGenericHeap0.updatePriority("hi!");
        java.lang.String str12 = strGenericHeap0.get();
        strGenericHeap0.updatePriority("hi!");
        strGenericHeap0.add("hi!");
        strGenericHeap0.add("hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test2286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2286");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        java.lang.String str4 = strGenericHeap0.get();
        boolean boolean5 = strGenericHeap0.isEmpty();
        strGenericHeap0.add("hi!");
        boolean boolean8 = strGenericHeap0.isEmpty();
        java.lang.String str9 = strGenericHeap0.get();
        java.lang.String str10 = strGenericHeap0.remove();
        java.lang.String str11 = strGenericHeap0.remove();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = strGenericHeap0.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test2287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2287");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        boolean boolean4 = strGenericHeap0.isEmpty();
        boolean boolean5 = strGenericHeap0.isEmpty();
        int int6 = strGenericHeap0.size();
        java.lang.String str7 = strGenericHeap0.remove();
        int int8 = strGenericHeap0.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = strGenericHeap0.get();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2288");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        boolean boolean4 = strGenericHeap0.isEmpty();
        boolean boolean5 = strGenericHeap0.isEmpty();
        strGenericHeap0.updatePriority("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2289");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        java.lang.String str8 = strGenericHeap0.remove();
        strGenericHeap0.add("hi!");
        int int11 = strGenericHeap0.size();
        strGenericHeap0.add("");
        strGenericHeap0.add("hi!");
        java.lang.String str16 = strGenericHeap0.remove();
        strGenericHeap0.add("hi!");
        java.lang.Class<?> wildcardClass19 = strGenericHeap0.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2290");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.add("hi!");
        strGenericHeap0.display();
        strGenericHeap0.display();
        boolean boolean8 = strGenericHeap0.isEmpty();
        int int9 = strGenericHeap0.size();
        java.lang.String str10 = strGenericHeap0.get();
        java.lang.String str11 = strGenericHeap0.remove();
        java.lang.String str12 = strGenericHeap0.get();
        strGenericHeap0.add("hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test2291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2291");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        java.lang.String str4 = strGenericHeap0.get();
        java.lang.String str5 = strGenericHeap0.get();
        int int6 = strGenericHeap0.size();
        strGenericHeap0.display();
        boolean boolean8 = strGenericHeap0.isEmpty();
        java.lang.String str9 = strGenericHeap0.get();
        java.lang.String str10 = strGenericHeap0.get();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test2292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2292");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        int int6 = strGenericHeap0.size();
        java.lang.String str7 = strGenericHeap0.get();
        strGenericHeap0.add("hi!");
        strGenericHeap0.add("");
        java.lang.String str12 = strGenericHeap0.remove();
        strGenericHeap0.display();
        strGenericHeap0.display();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test2293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2293");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        java.lang.String str8 = strGenericHeap0.remove();
        java.lang.String str9 = strGenericHeap0.get();
        strGenericHeap0.display();
        strGenericHeap0.display();
        boolean boolean12 = strGenericHeap0.isEmpty();
        strGenericHeap0.add("");
        int int15 = strGenericHeap0.size();
        java.lang.String str16 = strGenericHeap0.get();
        int int17 = strGenericHeap0.size();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
    }

    @Test
    public void test2294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2294");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        boolean boolean4 = strGenericHeap0.isEmpty();
        strGenericHeap0.updatePriority("");
        boolean boolean7 = strGenericHeap0.isEmpty();
        boolean boolean8 = strGenericHeap0.isEmpty();
        strGenericHeap0.display();
        boolean boolean10 = strGenericHeap0.isEmpty();
        strGenericHeap0.add("");
        strGenericHeap0.updatePriority("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2295");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        int int6 = strGenericHeap0.size();
        java.lang.String str7 = strGenericHeap0.get();
        strGenericHeap0.add("hi!");
        strGenericHeap0.updatePriority("hi!");
        boolean boolean12 = strGenericHeap0.isEmpty();
        boolean boolean13 = strGenericHeap0.isEmpty();
        int int14 = strGenericHeap0.size();
        java.lang.Class<?> wildcardClass15 = strGenericHeap0.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2296");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        java.lang.String str8 = strGenericHeap0.get();
        int int9 = strGenericHeap0.size();
        int int10 = strGenericHeap0.size();
        boolean boolean11 = strGenericHeap0.isEmpty();
        strGenericHeap0.display();
        strGenericHeap0.display();
        java.lang.String str14 = strGenericHeap0.get();
        java.lang.String str15 = strGenericHeap0.get();
        int int16 = strGenericHeap0.size();
        strGenericHeap0.updatePriority("");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
    }

    @Test
    public void test2297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2297");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        java.lang.String str4 = strGenericHeap0.get();
        boolean boolean5 = strGenericHeap0.isEmpty();
        strGenericHeap0.add("hi!");
        boolean boolean8 = strGenericHeap0.isEmpty();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        boolean boolean13 = strGenericHeap0.isEmpty();
        strGenericHeap0.display();
        java.lang.String str15 = strGenericHeap0.remove();
        strGenericHeap0.display();
        int int17 = strGenericHeap0.size();
        strGenericHeap0.add("hi!");
        java.lang.String str20 = strGenericHeap0.get();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test2298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2298");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        int int6 = strGenericHeap0.size();
        java.lang.String str7 = strGenericHeap0.get();
        strGenericHeap0.updatePriority("");
        java.lang.String str10 = strGenericHeap0.get();
        java.lang.String str11 = strGenericHeap0.get();
        java.lang.String str12 = strGenericHeap0.get();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        int int16 = strGenericHeap0.size();
        strGenericHeap0.add("hi!");
        boolean boolean19 = strGenericHeap0.isEmpty();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2299");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        boolean boolean4 = strGenericHeap0.isEmpty();
        boolean boolean5 = strGenericHeap0.isEmpty();
        boolean boolean6 = strGenericHeap0.isEmpty();
        java.lang.String str7 = strGenericHeap0.remove();
        int int8 = strGenericHeap0.size();
        int int9 = strGenericHeap0.size();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2300");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        int int6 = strGenericHeap0.size();
        java.lang.String str7 = strGenericHeap0.get();
        strGenericHeap0.add("hi!");
        boolean boolean10 = strGenericHeap0.isEmpty();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        java.lang.String str14 = strGenericHeap0.remove();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test2301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2301");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        int int8 = strGenericHeap0.size();
        boolean boolean9 = strGenericHeap0.isEmpty();
        strGenericHeap0.add("hi!");
        int int12 = strGenericHeap0.size();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
    }

    @Test
    public void test2302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2302");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        java.lang.String str8 = strGenericHeap0.remove();
        int int9 = strGenericHeap0.size();
        int int10 = strGenericHeap0.size();
        int int11 = strGenericHeap0.size();
        strGenericHeap0.add("hi!");
        java.lang.String str14 = strGenericHeap0.remove();
        strGenericHeap0.add("");
        strGenericHeap0.updatePriority("");
        strGenericHeap0.updatePriority("");
        java.lang.String str21 = strGenericHeap0.get();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test2303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2303");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        strGenericHeap0.add("hi!");
        strGenericHeap0.updatePriority("hi!");
        strGenericHeap0.display();
        java.lang.String str13 = strGenericHeap0.get();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.display();
        int int17 = strGenericHeap0.size();
        int int18 = strGenericHeap0.size();
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
    }

    @Test
    public void test2304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2304");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        java.lang.String str4 = strGenericHeap0.get();
        int int5 = strGenericHeap0.size();
        boolean boolean6 = strGenericHeap0.isEmpty();
        strGenericHeap0.add("hi!");
        boolean boolean9 = strGenericHeap0.isEmpty();
        strGenericHeap0.display();
        boolean boolean11 = strGenericHeap0.isEmpty();
        strGenericHeap0.display();
        strGenericHeap0.add("hi!");
        strGenericHeap0.display();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2305");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        int int8 = strGenericHeap0.size();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.updatePriority("");
        int int13 = strGenericHeap0.size();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
    }

    @Test
    public void test2306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2306");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        java.lang.String str8 = strGenericHeap0.remove();
        strGenericHeap0.add("hi!");
        int int11 = strGenericHeap0.size();
        strGenericHeap0.add("");
        strGenericHeap0.updatePriority("");
        java.lang.String str16 = strGenericHeap0.remove();
        strGenericHeap0.add("");
        java.lang.Class<?> wildcardClass19 = strGenericHeap0.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2307");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        java.lang.String str4 = strGenericHeap0.get();
        strGenericHeap0.add("");
        java.lang.String str7 = strGenericHeap0.remove();
        boolean boolean8 = strGenericHeap0.isEmpty();
        strGenericHeap0.add("");
        java.lang.String str11 = strGenericHeap0.remove();
        java.lang.String str12 = strGenericHeap0.get();
        java.lang.String str13 = strGenericHeap0.get();
        boolean boolean14 = strGenericHeap0.isEmpty();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2308");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        java.lang.String str4 = strGenericHeap0.get();
        strGenericHeap0.add("");
        strGenericHeap0.add("hi!");
        java.lang.String str9 = strGenericHeap0.remove();
        int int10 = strGenericHeap0.size();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        int int14 = strGenericHeap0.size();
        int int15 = strGenericHeap0.size();
        java.lang.Class<?> wildcardClass16 = strGenericHeap0.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2309");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        java.lang.String str8 = strGenericHeap0.remove();
        int int9 = strGenericHeap0.size();
        int int10 = strGenericHeap0.size();
        int int11 = strGenericHeap0.size();
        strGenericHeap0.display();
        int int13 = strGenericHeap0.size();
        boolean boolean14 = strGenericHeap0.isEmpty();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2310");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        boolean boolean4 = strGenericHeap0.isEmpty();
        strGenericHeap0.updatePriority("");
        boolean boolean7 = strGenericHeap0.isEmpty();
        java.lang.String str8 = strGenericHeap0.remove();
        strGenericHeap0.add("hi!");
        java.lang.Class<?> wildcardClass11 = strGenericHeap0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2311");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        java.lang.String str8 = strGenericHeap0.remove();
        java.lang.String str9 = strGenericHeap0.remove();
        int int10 = strGenericHeap0.size();
        int int11 = strGenericHeap0.size();
        int int12 = strGenericHeap0.size();
        strGenericHeap0.add("");
        java.lang.String str15 = strGenericHeap0.get();
        java.lang.String str16 = strGenericHeap0.remove();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test2312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2312");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        java.lang.String str8 = strGenericHeap0.get();
        boolean boolean9 = strGenericHeap0.isEmpty();
        int int10 = strGenericHeap0.size();
        strGenericHeap0.display();
        int int12 = strGenericHeap0.size();
        strGenericHeap0.display();
        java.lang.Class<?> wildcardClass14 = strGenericHeap0.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2313");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        java.lang.String str8 = strGenericHeap0.remove();
        java.lang.String str9 = strGenericHeap0.get();
        strGenericHeap0.display();
        java.lang.String str11 = strGenericHeap0.get();
        java.lang.String str12 = strGenericHeap0.get();
        java.lang.String str13 = strGenericHeap0.get();
        int int14 = strGenericHeap0.size();
        java.lang.String str15 = strGenericHeap0.get();
        java.lang.String str16 = strGenericHeap0.get();
        java.lang.String str17 = strGenericHeap0.get();
        strGenericHeap0.add("");
        int int20 = strGenericHeap0.size();
        java.lang.Class<?> wildcardClass21 = strGenericHeap0.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2314");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        strGenericHeap0.add("hi!");
        java.lang.String str10 = strGenericHeap0.get();
        java.lang.String str11 = strGenericHeap0.remove();
        strGenericHeap0.display();
        java.lang.String str13 = strGenericHeap0.remove();
        java.lang.String str14 = strGenericHeap0.remove();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test2315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2315");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        strGenericHeap0.add("hi!");
        strGenericHeap0.updatePriority("hi!");
        strGenericHeap0.display();
        boolean boolean13 = strGenericHeap0.isEmpty();
        int int14 = strGenericHeap0.size();
        java.lang.String str15 = strGenericHeap0.get();
        strGenericHeap0.add("hi!");
        java.lang.Class<?> wildcardClass18 = strGenericHeap0.getClass();
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2316");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        java.lang.String str8 = strGenericHeap0.get();
        int int9 = strGenericHeap0.size();
        int int10 = strGenericHeap0.size();
        boolean boolean11 = strGenericHeap0.isEmpty();
        strGenericHeap0.display();
        strGenericHeap0.display();
        int int14 = strGenericHeap0.size();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
    }

    @Test
    public void test2317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2317");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        strGenericHeap0.add("hi!");
        strGenericHeap0.updatePriority("hi!");
        strGenericHeap0.display();
        java.lang.String str13 = strGenericHeap0.get();
        java.lang.String str14 = strGenericHeap0.get();
        java.lang.String str15 = strGenericHeap0.get();
        strGenericHeap0.updatePriority("hi!");
        java.lang.String str18 = strGenericHeap0.get();
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test2318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2318");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        java.lang.String str8 = strGenericHeap0.remove();
        java.lang.String str9 = strGenericHeap0.get();
        boolean boolean10 = strGenericHeap0.isEmpty();
        java.lang.String str11 = strGenericHeap0.get();
        int int12 = strGenericHeap0.size();
        int int13 = strGenericHeap0.size();
        java.lang.String str14 = strGenericHeap0.remove();
        int int15 = strGenericHeap0.size();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test2319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2319");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        java.lang.String str8 = strGenericHeap0.remove();
        java.lang.String str9 = strGenericHeap0.get();
        strGenericHeap0.display();
        java.lang.String str11 = strGenericHeap0.get();
        int int12 = strGenericHeap0.size();
        strGenericHeap0.display();
        int int14 = strGenericHeap0.size();
        java.lang.String str15 = strGenericHeap0.get();
        boolean boolean16 = strGenericHeap0.isEmpty();
        java.lang.String str17 = strGenericHeap0.get();
        boolean boolean18 = strGenericHeap0.isEmpty();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test2320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2320");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        java.lang.String str8 = strGenericHeap0.get();
        boolean boolean9 = strGenericHeap0.isEmpty();
        strGenericHeap0.updatePriority("");
        int int12 = strGenericHeap0.size();
        java.lang.String str13 = strGenericHeap0.get();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        int int18 = strGenericHeap0.size();
        strGenericHeap0.add("");
        boolean boolean21 = strGenericHeap0.isEmpty();
        int int22 = strGenericHeap0.size();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 4 + "'", int22 == 4);
    }

    @Test
    public void test2321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2321");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        strGenericHeap0.add("hi!");
        strGenericHeap0.updatePriority("hi!");
        java.lang.String str12 = strGenericHeap0.remove();
        java.lang.String str13 = strGenericHeap0.get();
        strGenericHeap0.updatePriority("");
        java.lang.String str16 = strGenericHeap0.remove();
        boolean boolean17 = strGenericHeap0.isEmpty();
        strGenericHeap0.display();
        int int19 = strGenericHeap0.size();
        strGenericHeap0.add("hi!");
        strGenericHeap0.updatePriority("");
        int int24 = strGenericHeap0.size();
        strGenericHeap0.display();
        strGenericHeap0.display();
        strGenericHeap0.display();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
    }

    @Test
    public void test2322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2322");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        java.lang.String str8 = strGenericHeap0.remove();
        java.lang.String str9 = strGenericHeap0.get();
        strGenericHeap0.display();
        strGenericHeap0.display();
        java.lang.String str12 = strGenericHeap0.get();
        int int13 = strGenericHeap0.size();
        java.lang.String str14 = strGenericHeap0.get();
        java.lang.String str15 = strGenericHeap0.remove();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test2323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2323");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        boolean boolean4 = strGenericHeap0.isEmpty();
        boolean boolean5 = strGenericHeap0.isEmpty();
        int int6 = strGenericHeap0.size();
        boolean boolean7 = strGenericHeap0.isEmpty();
        java.lang.String str8 = strGenericHeap0.remove();
        strGenericHeap0.add("");
        int int11 = strGenericHeap0.size();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test2324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2324");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        java.lang.String str8 = strGenericHeap0.remove();
        java.lang.String str9 = strGenericHeap0.remove();
        int int10 = strGenericHeap0.size();
        int int11 = strGenericHeap0.size();
        int int12 = strGenericHeap0.size();
        int int13 = strGenericHeap0.size();
        strGenericHeap0.add("hi!");
        java.lang.Class<?> wildcardClass16 = strGenericHeap0.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2325");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        java.lang.String str8 = strGenericHeap0.remove();
        java.lang.String str9 = strGenericHeap0.get();
        strGenericHeap0.display();
        int int11 = strGenericHeap0.size();
        java.lang.String str12 = strGenericHeap0.get();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test2326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2326");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        java.lang.String str4 = strGenericHeap0.get();
        boolean boolean5 = strGenericHeap0.isEmpty();
        strGenericHeap0.add("hi!");
        strGenericHeap0.updatePriority("hi!");
        int int10 = strGenericHeap0.size();
        strGenericHeap0.display();
        java.lang.Class<?> wildcardClass12 = strGenericHeap0.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2327");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        java.lang.String str8 = strGenericHeap0.get();
        int int9 = strGenericHeap0.size();
        int int10 = strGenericHeap0.size();
        boolean boolean11 = strGenericHeap0.isEmpty();
        java.lang.String str12 = strGenericHeap0.remove();
        int int13 = strGenericHeap0.size();
        boolean boolean14 = strGenericHeap0.isEmpty();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2328");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        strGenericHeap0.add("hi!");
        int int10 = strGenericHeap0.size();
        strGenericHeap0.add("hi!");
        strGenericHeap0.updatePriority("");
        strGenericHeap0.display();
        java.lang.String str16 = strGenericHeap0.get();
        java.lang.String str17 = strGenericHeap0.remove();
        boolean boolean18 = strGenericHeap0.isEmpty();
        java.lang.String str19 = strGenericHeap0.get();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test2329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2329");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        java.lang.String str3 = strGenericHeap0.get();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        boolean boolean7 = strGenericHeap0.isEmpty();
        java.lang.String str8 = strGenericHeap0.remove();
        strGenericHeap0.add("");
        boolean boolean11 = strGenericHeap0.isEmpty();
        strGenericHeap0.add("");
        strGenericHeap0.add("hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2330");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        java.lang.String str8 = strGenericHeap0.remove();
        java.lang.String str9 = strGenericHeap0.get();
        strGenericHeap0.display();
        java.lang.String str11 = strGenericHeap0.get();
        int int12 = strGenericHeap0.size();
        int int13 = strGenericHeap0.size();
        boolean boolean14 = strGenericHeap0.isEmpty();
        strGenericHeap0.display();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2331");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        java.lang.String str8 = strGenericHeap0.remove();
        int int9 = strGenericHeap0.size();
        int int10 = strGenericHeap0.size();
        int int11 = strGenericHeap0.size();
        strGenericHeap0.add("hi!");
        java.lang.String str14 = strGenericHeap0.remove();
        strGenericHeap0.add("");
        java.lang.String str17 = strGenericHeap0.get();
        int int18 = strGenericHeap0.size();
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
    }

    @Test
    public void test2332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2332");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        java.lang.String str8 = strGenericHeap0.remove();
        java.lang.String str9 = strGenericHeap0.get();
        strGenericHeap0.display();
        java.lang.String str11 = strGenericHeap0.get();
        java.lang.String str12 = strGenericHeap0.get();
        boolean boolean13 = strGenericHeap0.isEmpty();
        java.lang.String str14 = strGenericHeap0.remove();
        int int15 = strGenericHeap0.size();
        boolean boolean16 = strGenericHeap0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = strGenericHeap0.get();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test2333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2333");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        java.lang.String str8 = strGenericHeap0.remove();
        int int9 = strGenericHeap0.size();
        int int10 = strGenericHeap0.size();
        int int11 = strGenericHeap0.size();
        strGenericHeap0.add("hi!");
        java.lang.String str14 = strGenericHeap0.remove();
        java.lang.String str15 = strGenericHeap0.remove();
        boolean boolean16 = strGenericHeap0.isEmpty();
        int int17 = strGenericHeap0.size();
        boolean boolean18 = strGenericHeap0.isEmpty();
        int int19 = strGenericHeap0.size();
        int int20 = strGenericHeap0.size();
        strGenericHeap0.display();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test2334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2334");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        java.lang.String str8 = strGenericHeap0.remove();
        strGenericHeap0.add("hi!");
        int int11 = strGenericHeap0.size();
        strGenericHeap0.add("");
        strGenericHeap0.updatePriority("");
        strGenericHeap0.display();
        boolean boolean17 = strGenericHeap0.isEmpty();
        strGenericHeap0.add("");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test2335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2335");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        java.lang.String str4 = strGenericHeap0.get();
        int int5 = strGenericHeap0.size();
        strGenericHeap0.display();
        boolean boolean7 = strGenericHeap0.isEmpty();
        strGenericHeap0.display();
        java.lang.String str9 = strGenericHeap0.remove();
        strGenericHeap0.display();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = strGenericHeap0.get();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test2336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2336");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        java.lang.String str4 = strGenericHeap0.get();
        strGenericHeap0.add("");
        strGenericHeap0.add("hi!");
        strGenericHeap0.updatePriority("");
        int int11 = strGenericHeap0.size();
        strGenericHeap0.add("hi!");
        java.lang.String str14 = strGenericHeap0.remove();
        java.lang.String str15 = strGenericHeap0.remove();
        strGenericHeap0.add("");
        strGenericHeap0.add("hi!");
        strGenericHeap0.add("");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test2337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2337");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        java.lang.String str8 = strGenericHeap0.remove();
        java.lang.String str9 = strGenericHeap0.get();
        strGenericHeap0.display();
        strGenericHeap0.display();
        int int12 = strGenericHeap0.size();
        boolean boolean13 = strGenericHeap0.isEmpty();
        strGenericHeap0.add("");
        java.lang.String str16 = strGenericHeap0.remove();
        int int17 = strGenericHeap0.size();
        strGenericHeap0.display();
        int int19 = strGenericHeap0.size();
        strGenericHeap0.display();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test2338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2338");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        int int1 = strGenericHeap0.size();
        int int2 = strGenericHeap0.size();
        strGenericHeap0.display();
        strGenericHeap0.add("");
        int int6 = strGenericHeap0.size();
        strGenericHeap0.display();
        boolean boolean8 = strGenericHeap0.isEmpty();
        java.lang.Class<?> wildcardClass9 = strGenericHeap0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2339");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        java.lang.String str4 = strGenericHeap0.get();
        boolean boolean5 = strGenericHeap0.isEmpty();
        strGenericHeap0.add("hi!");
        boolean boolean8 = strGenericHeap0.isEmpty();
        java.lang.String str9 = strGenericHeap0.get();
        java.lang.Class<?> wildcardClass10 = strGenericHeap0.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2340");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        java.lang.String str4 = strGenericHeap0.get();
        java.lang.String str5 = strGenericHeap0.get();
        java.lang.String str6 = strGenericHeap0.remove();
        strGenericHeap0.add("hi!");
        strGenericHeap0.add("");
        int int11 = strGenericHeap0.size();
        int int12 = strGenericHeap0.size();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        int int18 = strGenericHeap0.size();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
    }

    @Test
    public void test2341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2341");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        strGenericHeap0.add("hi!");
        boolean boolean10 = strGenericHeap0.isEmpty();
        strGenericHeap0.updatePriority("");
        java.lang.String str13 = strGenericHeap0.remove();
        java.lang.String str14 = strGenericHeap0.get();
        strGenericHeap0.display();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test2342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2342");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        java.lang.String str4 = strGenericHeap0.get();
        int int5 = strGenericHeap0.size();
        strGenericHeap0.display();
        boolean boolean7 = strGenericHeap0.isEmpty();
        strGenericHeap0.add("hi!");
        strGenericHeap0.updatePriority("");
        strGenericHeap0.display();
        java.lang.String str13 = strGenericHeap0.get();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test2343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2343");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        java.lang.String str8 = strGenericHeap0.get();
        boolean boolean9 = strGenericHeap0.isEmpty();
        strGenericHeap0.updatePriority("");
        int int12 = strGenericHeap0.size();
        strGenericHeap0.display();
        int int14 = strGenericHeap0.size();
        boolean boolean15 = strGenericHeap0.isEmpty();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2344");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        java.lang.String str8 = strGenericHeap0.remove();
        strGenericHeap0.add("hi!");
        strGenericHeap0.updatePriority("");
        java.lang.String str13 = strGenericHeap0.remove();
        java.lang.String str14 = strGenericHeap0.get();
        java.lang.String str15 = strGenericHeap0.remove();
        strGenericHeap0.display();
        strGenericHeap0.display();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test2345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2345");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        strGenericHeap0.add("hi!");
        boolean boolean10 = strGenericHeap0.isEmpty();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.display();
        int int14 = strGenericHeap0.size();
        boolean boolean15 = strGenericHeap0.isEmpty();
        boolean boolean16 = strGenericHeap0.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2346");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        strGenericHeap0.add("hi!");
        strGenericHeap0.updatePriority("hi!");
        java.lang.String str12 = strGenericHeap0.get();
        strGenericHeap0.add("hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test2347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2347");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        strGenericHeap0.add("hi!");
        strGenericHeap0.updatePriority("hi!");
        java.lang.String str12 = strGenericHeap0.get();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        boolean boolean16 = strGenericHeap0.isEmpty();
        java.lang.Class<?> wildcardClass17 = strGenericHeap0.getClass();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2348");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        java.lang.String str8 = strGenericHeap0.remove();
        strGenericHeap0.add("hi!");
        int int11 = strGenericHeap0.size();
        int int12 = strGenericHeap0.size();
        strGenericHeap0.add("hi!");
        int int15 = strGenericHeap0.size();
        java.lang.Class<?> wildcardClass16 = strGenericHeap0.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2349");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        java.lang.String str3 = strGenericHeap0.get();
        strGenericHeap0.add("");
        strGenericHeap0.add("hi!");
        strGenericHeap0.add("hi!");
        int int10 = strGenericHeap0.size();
        strGenericHeap0.display();
        java.lang.String str12 = strGenericHeap0.remove();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test2350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2350");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        java.lang.String str4 = strGenericHeap0.get();
        boolean boolean5 = strGenericHeap0.isEmpty();
        strGenericHeap0.add("hi!");
        boolean boolean8 = strGenericHeap0.isEmpty();
        java.lang.String str9 = strGenericHeap0.get();
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.display();
        java.lang.String str14 = strGenericHeap0.get();
        boolean boolean15 = strGenericHeap0.isEmpty();
        java.lang.String str16 = strGenericHeap0.get();
        strGenericHeap0.display();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test2351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2351");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        strGenericHeap0.add("hi!");
        strGenericHeap0.updatePriority("hi!");
        strGenericHeap0.display();
        java.lang.String str13 = strGenericHeap0.get();
        boolean boolean14 = strGenericHeap0.isEmpty();
        java.lang.String str15 = strGenericHeap0.remove();
        java.lang.String str16 = strGenericHeap0.remove();
        java.lang.String str17 = strGenericHeap0.get();
        boolean boolean18 = strGenericHeap0.isEmpty();
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test2352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2352");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        java.lang.String str4 = strGenericHeap0.get();
        java.lang.String str5 = strGenericHeap0.get();
        java.lang.String str6 = strGenericHeap0.get();
        java.lang.String str7 = strGenericHeap0.get();
        strGenericHeap0.add("");
        strGenericHeap0.add("");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test2353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2353");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        strGenericHeap0.updatePriority("");
        boolean boolean10 = strGenericHeap0.isEmpty();
        strGenericHeap0.display();
        java.lang.Class<?> wildcardClass12 = strGenericHeap0.getClass();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2354");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        java.lang.String str8 = strGenericHeap0.get();
        boolean boolean9 = strGenericHeap0.isEmpty();
        strGenericHeap0.updatePriority("");
        int int12 = strGenericHeap0.size();
        java.lang.String str13 = strGenericHeap0.get();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("hi!");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("hi!");
        java.lang.String str21 = strGenericHeap0.remove();
        strGenericHeap0.updatePriority("");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test2355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2355");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        int int6 = strGenericHeap0.size();
        java.lang.String str7 = strGenericHeap0.get();
        strGenericHeap0.updatePriority("");
        java.lang.String str10 = strGenericHeap0.get();
        strGenericHeap0.add("");
        boolean boolean13 = strGenericHeap0.isEmpty();
        strGenericHeap0.display();
        strGenericHeap0.display();
        java.lang.String str16 = strGenericHeap0.remove();
        java.lang.Class<?> wildcardClass17 = strGenericHeap0.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2356");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        java.lang.String str4 = strGenericHeap0.get();
        int int5 = strGenericHeap0.size();
        boolean boolean6 = strGenericHeap0.isEmpty();
        java.lang.String str7 = strGenericHeap0.get();
        strGenericHeap0.display();
        boolean boolean9 = strGenericHeap0.isEmpty();
        strGenericHeap0.add("hi!");
        strGenericHeap0.add("");
        strGenericHeap0.add("hi!");
        strGenericHeap0.updatePriority("");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2357");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        java.lang.String str8 = strGenericHeap0.get();
        boolean boolean9 = strGenericHeap0.isEmpty();
        java.lang.String str10 = strGenericHeap0.get();
        java.lang.String str11 = strGenericHeap0.get();
        boolean boolean12 = strGenericHeap0.isEmpty();
        boolean boolean13 = strGenericHeap0.isEmpty();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2358");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        java.lang.String str3 = strGenericHeap0.get();
        strGenericHeap0.add("");
        int int6 = strGenericHeap0.size();
        strGenericHeap0.add("hi!");
        strGenericHeap0.updatePriority("hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
    }

    @Test
    public void test2359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2359");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.add("hi!");
        int int6 = strGenericHeap0.size();
        strGenericHeap0.updatePriority("hi!");
        java.lang.String str9 = strGenericHeap0.remove();
        strGenericHeap0.add("hi!");
        int int12 = strGenericHeap0.size();
        strGenericHeap0.display();
        java.lang.String str14 = strGenericHeap0.remove();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test2360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2360");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        int int6 = strGenericHeap0.size();
        java.lang.String str7 = strGenericHeap0.get();
        strGenericHeap0.add("hi!");
        strGenericHeap0.updatePriority("hi!");
        strGenericHeap0.updatePriority("hi!");
        strGenericHeap0.add("");
        strGenericHeap0.updatePriority("hi!");
        strGenericHeap0.updatePriority("");
        java.lang.String str20 = strGenericHeap0.remove();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test2361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2361");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        java.lang.String str8 = strGenericHeap0.get();
        boolean boolean9 = strGenericHeap0.isEmpty();
        strGenericHeap0.updatePriority("");
        java.lang.String str12 = strGenericHeap0.get();
        boolean boolean13 = strGenericHeap0.isEmpty();
        int int14 = strGenericHeap0.size();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
    }

    @Test
    public void test2362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2362");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        strGenericHeap0.add("hi!");
        strGenericHeap0.updatePriority("hi!");
        java.lang.String str12 = strGenericHeap0.remove();
        java.lang.String str13 = strGenericHeap0.get();
        strGenericHeap0.updatePriority("");
        java.lang.String str16 = strGenericHeap0.remove();
        boolean boolean17 = strGenericHeap0.isEmpty();
        strGenericHeap0.display();
        strGenericHeap0.display();
        boolean boolean20 = strGenericHeap0.isEmpty();
        strGenericHeap0.add("hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test2363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2363");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        strGenericHeap0.add("hi!");
        strGenericHeap0.updatePriority("hi!");
        strGenericHeap0.display();
        strGenericHeap0.display();
        java.lang.String str14 = strGenericHeap0.get();
        java.lang.String str15 = strGenericHeap0.remove();
        strGenericHeap0.display();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test2364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2364");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        java.lang.String str8 = strGenericHeap0.remove();
        java.lang.String str9 = strGenericHeap0.remove();
        strGenericHeap0.add("");
        java.lang.String str12 = strGenericHeap0.get();
        strGenericHeap0.display();
        strGenericHeap0.add("hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test2365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2365");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        strGenericHeap0.add("hi!");
        strGenericHeap0.updatePriority("hi!");
        java.lang.String str12 = strGenericHeap0.remove();
        java.lang.String str13 = strGenericHeap0.get();
        strGenericHeap0.updatePriority("");
        java.lang.String str16 = strGenericHeap0.remove();
        int int17 = strGenericHeap0.size();
        strGenericHeap0.display();
        strGenericHeap0.add("");
        int int21 = strGenericHeap0.size();
        strGenericHeap0.add("hi!");
        java.lang.String str24 = strGenericHeap0.remove();
        java.lang.Class<?> wildcardClass25 = strGenericHeap0.getClass();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2366");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        java.lang.String str8 = strGenericHeap0.remove();
        java.lang.String str9 = strGenericHeap0.remove();
        int int10 = strGenericHeap0.size();
        strGenericHeap0.display();
        int int12 = strGenericHeap0.size();
        strGenericHeap0.add("hi!");
        strGenericHeap0.add("");
        java.lang.String str17 = strGenericHeap0.remove();
        strGenericHeap0.add("");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test2367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2367");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        java.lang.String str8 = strGenericHeap0.remove();
        java.lang.String str9 = strGenericHeap0.remove();
        int int10 = strGenericHeap0.size();
        int int11 = strGenericHeap0.size();
        strGenericHeap0.add("");
        java.lang.String str14 = strGenericHeap0.remove();
        boolean boolean15 = strGenericHeap0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = strGenericHeap0.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test2368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2368");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        boolean boolean4 = strGenericHeap0.isEmpty();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.display();
        strGenericHeap0.add("hi!");
        java.lang.String str10 = strGenericHeap0.remove();
        int int11 = strGenericHeap0.size();
        strGenericHeap0.add("hi!");
        boolean boolean14 = strGenericHeap0.isEmpty();
        strGenericHeap0.add("hi!");
        java.lang.String str17 = strGenericHeap0.get();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test2369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2369");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        java.lang.String str4 = strGenericHeap0.get();
        int int5 = strGenericHeap0.size();
        boolean boolean6 = strGenericHeap0.isEmpty();
        strGenericHeap0.add("hi!");
        boolean boolean9 = strGenericHeap0.isEmpty();
        strGenericHeap0.display();
        boolean boolean11 = strGenericHeap0.isEmpty();
        strGenericHeap0.add("hi!");
        int int14 = strGenericHeap0.size();
        java.lang.String str15 = strGenericHeap0.remove();
        java.lang.String str16 = strGenericHeap0.get();
        strGenericHeap0.add("");
        strGenericHeap0.add("hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test2370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2370");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        java.lang.String str4 = strGenericHeap0.get();
        boolean boolean5 = strGenericHeap0.isEmpty();
        strGenericHeap0.add("hi!");
        int int8 = strGenericHeap0.size();
        strGenericHeap0.add("");
        strGenericHeap0.add("hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
    }

    @Test
    public void test2371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2371");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        int int8 = strGenericHeap0.size();
        strGenericHeap0.updatePriority("");
        int int11 = strGenericHeap0.size();
        java.lang.String str12 = strGenericHeap0.remove();
        boolean boolean13 = strGenericHeap0.isEmpty();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2372");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        java.lang.String str4 = strGenericHeap0.get();
        java.lang.String str5 = strGenericHeap0.get();
        int int6 = strGenericHeap0.size();
        strGenericHeap0.display();
        java.lang.String str8 = strGenericHeap0.remove();
        java.lang.Class<?> wildcardClass9 = strGenericHeap0.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2373");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        strGenericHeap0.add("hi!");
        int int10 = strGenericHeap0.size();
        java.lang.String str11 = strGenericHeap0.remove();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test2374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2374");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        int int6 = strGenericHeap0.size();
        java.lang.String str7 = strGenericHeap0.get();
        strGenericHeap0.updatePriority("");
        java.lang.String str10 = strGenericHeap0.get();
        java.lang.String str11 = strGenericHeap0.get();
        java.lang.String str12 = strGenericHeap0.get();
        int int13 = strGenericHeap0.size();
        strGenericHeap0.display();
        strGenericHeap0.display();
        java.lang.String str16 = strGenericHeap0.remove();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = strGenericHeap0.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test2375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2375");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        strGenericHeap0.add("hi!");
        int int10 = strGenericHeap0.size();
        strGenericHeap0.add("hi!");
        strGenericHeap0.updatePriority("");
        strGenericHeap0.display();
        int int16 = strGenericHeap0.size();
        int int17 = strGenericHeap0.size();
        strGenericHeap0.add("hi!");
        java.lang.String str20 = strGenericHeap0.remove();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test2376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2376");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        strGenericHeap0.add("hi!");
        strGenericHeap0.updatePriority("hi!");
        strGenericHeap0.display();
        strGenericHeap0.display();
        java.lang.String str14 = strGenericHeap0.get();
        java.lang.String str15 = strGenericHeap0.remove();
        java.lang.String str16 = strGenericHeap0.remove();
        java.lang.String str17 = strGenericHeap0.remove();
        strGenericHeap0.display();
        java.lang.Class<?> wildcardClass19 = strGenericHeap0.getClass();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2377");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        int int3 = strGenericHeap0.size();
        strGenericHeap0.display();
        boolean boolean5 = strGenericHeap0.isEmpty();
        strGenericHeap0.display();
        int int7 = strGenericHeap0.size();
        strGenericHeap0.display();
        int int9 = strGenericHeap0.size();
        java.lang.String str10 = strGenericHeap0.get();
        boolean boolean11 = strGenericHeap0.isEmpty();
        java.lang.Class<?> wildcardClass12 = strGenericHeap0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2378");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        int int6 = strGenericHeap0.size();
        java.lang.String str7 = strGenericHeap0.get();
        strGenericHeap0.updatePriority("");
        java.lang.String str10 = strGenericHeap0.get();
        strGenericHeap0.add("");
        int int13 = strGenericHeap0.size();
        strGenericHeap0.display();
        boolean boolean15 = strGenericHeap0.isEmpty();
        boolean boolean16 = strGenericHeap0.isEmpty();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2379");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        strGenericHeap0.add("hi!");
        strGenericHeap0.updatePriority("hi!");
        java.lang.String str12 = strGenericHeap0.get();
        strGenericHeap0.add("");
        java.lang.String str15 = strGenericHeap0.remove();
        java.lang.String str16 = strGenericHeap0.get();
        boolean boolean17 = strGenericHeap0.isEmpty();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test2380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2380");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        int int3 = strGenericHeap0.size();
        strGenericHeap0.display();
        strGenericHeap0.add("hi!");
        boolean boolean7 = strGenericHeap0.isEmpty();
        strGenericHeap0.updatePriority("hi!");
        strGenericHeap0.updatePriority("hi!");
        java.lang.Class<?> wildcardClass12 = strGenericHeap0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2381");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        strGenericHeap0.add("hi!");
        strGenericHeap0.updatePriority("hi!");
        java.lang.String str12 = strGenericHeap0.remove();
        java.lang.String str13 = strGenericHeap0.get();
        boolean boolean14 = strGenericHeap0.isEmpty();
        strGenericHeap0.display();
        strGenericHeap0.add("hi!");
        boolean boolean18 = strGenericHeap0.isEmpty();
        java.lang.String str19 = strGenericHeap0.get();
        java.lang.Class<?> wildcardClass20 = strGenericHeap0.getClass();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2382");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        java.lang.String str8 = strGenericHeap0.get();
        boolean boolean9 = strGenericHeap0.isEmpty();
        int int10 = strGenericHeap0.size();
        java.lang.String str11 = strGenericHeap0.remove();
        java.lang.String str12 = strGenericHeap0.get();
        boolean boolean13 = strGenericHeap0.isEmpty();
        java.lang.String str14 = strGenericHeap0.remove();
        strGenericHeap0.display();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test2383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2383");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        java.lang.String str4 = strGenericHeap0.get();
        boolean boolean5 = strGenericHeap0.isEmpty();
        java.lang.String str6 = strGenericHeap0.remove();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        int int10 = strGenericHeap0.size();
        int int11 = strGenericHeap0.size();
        int int12 = strGenericHeap0.size();
        java.lang.String str13 = strGenericHeap0.get();
        java.lang.String str14 = strGenericHeap0.remove();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test2384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2384");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.add("hi!");
        strGenericHeap0.display();
        boolean boolean7 = strGenericHeap0.isEmpty();
        java.lang.String str8 = strGenericHeap0.get();
        java.lang.String str9 = strGenericHeap0.remove();
        java.lang.String str10 = strGenericHeap0.get();
        int int11 = strGenericHeap0.size();
        boolean boolean12 = strGenericHeap0.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2385");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        boolean boolean4 = strGenericHeap0.isEmpty();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("hi!");
        boolean boolean9 = strGenericHeap0.isEmpty();
        java.lang.String str10 = strGenericHeap0.remove();
        strGenericHeap0.display();
        java.lang.String str12 = strGenericHeap0.get();
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.updatePriority("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test2386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2386");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        int int3 = strGenericHeap0.size();
        strGenericHeap0.display();
        strGenericHeap0.add("hi!");
        boolean boolean7 = strGenericHeap0.isEmpty();
        strGenericHeap0.updatePriority("hi!");
        strGenericHeap0.updatePriority("hi!");
        boolean boolean12 = strGenericHeap0.isEmpty();
        int int13 = strGenericHeap0.size();
        java.lang.String str14 = strGenericHeap0.get();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test2387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2387");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        java.lang.String str8 = strGenericHeap0.remove();
        strGenericHeap0.add("hi!");
        int int11 = strGenericHeap0.size();
        strGenericHeap0.add("");
        strGenericHeap0.updatePriority("");
        boolean boolean16 = strGenericHeap0.isEmpty();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.updatePriority("hi!");
        strGenericHeap0.display();
        strGenericHeap0.display();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2388");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        strGenericHeap0.add("hi!");
        int int10 = strGenericHeap0.size();
        strGenericHeap0.add("hi!");
        strGenericHeap0.updatePriority("");
        strGenericHeap0.display();
        strGenericHeap0.display();
        strGenericHeap0.display();
        boolean boolean18 = strGenericHeap0.isEmpty();
        java.lang.String str19 = strGenericHeap0.get();
        java.lang.String str20 = strGenericHeap0.remove();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test2389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2389");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        java.lang.String str8 = strGenericHeap0.get();
        int int9 = strGenericHeap0.size();
        int int10 = strGenericHeap0.size();
        boolean boolean11 = strGenericHeap0.isEmpty();
        strGenericHeap0.add("hi!");
        strGenericHeap0.add("hi!");
        java.lang.String str16 = strGenericHeap0.remove();
        strGenericHeap0.add("");
        boolean boolean19 = strGenericHeap0.isEmpty();
        int int20 = strGenericHeap0.size();
        int int21 = strGenericHeap0.size();
        java.lang.String str22 = strGenericHeap0.remove();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4 + "'", int21 == 4);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test2390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2390");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        strGenericHeap0.add("hi!");
        boolean boolean10 = strGenericHeap0.isEmpty();
        strGenericHeap0.updatePriority("hi!");
        strGenericHeap0.add("hi!");
        java.lang.String str15 = strGenericHeap0.remove();
        boolean boolean16 = strGenericHeap0.isEmpty();
        int int17 = strGenericHeap0.size();
        strGenericHeap0.display();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
    }

    @Test
    public void test2391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2391");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        java.lang.String str8 = strGenericHeap0.remove();
        java.lang.String str9 = strGenericHeap0.remove();
        int int10 = strGenericHeap0.size();
        int int11 = strGenericHeap0.size();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.display();
        java.lang.String str16 = strGenericHeap0.get();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test2392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2392");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        int int3 = strGenericHeap0.size();
        int int4 = strGenericHeap0.size();
        strGenericHeap0.add("hi!");
        strGenericHeap0.updatePriority("");
        java.lang.String str9 = strGenericHeap0.get();
        strGenericHeap0.add("");
        boolean boolean12 = strGenericHeap0.isEmpty();
        strGenericHeap0.updatePriority("hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2393");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        strGenericHeap0.add("hi!");
        int int10 = strGenericHeap0.size();
        strGenericHeap0.add("hi!");
        strGenericHeap0.updatePriority("");
        strGenericHeap0.display();
        java.lang.String str16 = strGenericHeap0.get();
        java.lang.String str17 = strGenericHeap0.get();
        java.lang.String str18 = strGenericHeap0.remove();
        strGenericHeap0.add("");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test2394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2394");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        boolean boolean4 = strGenericHeap0.isEmpty();
        boolean boolean5 = strGenericHeap0.isEmpty();
        int int6 = strGenericHeap0.size();
        boolean boolean7 = strGenericHeap0.isEmpty();
        strGenericHeap0.display();
        java.lang.String str9 = strGenericHeap0.remove();
        strGenericHeap0.add("");
        java.lang.String str12 = strGenericHeap0.remove();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = strGenericHeap0.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test2395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2395");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        strGenericHeap0.add("hi!");
        boolean boolean10 = strGenericHeap0.isEmpty();
        strGenericHeap0.updatePriority("hi!");
        strGenericHeap0.updatePriority("");
        java.lang.String str15 = strGenericHeap0.get();
        boolean boolean16 = strGenericHeap0.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2396");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.add("hi!");
        strGenericHeap0.display();
        boolean boolean7 = strGenericHeap0.isEmpty();
        java.lang.String str8 = strGenericHeap0.get();
        java.lang.String str9 = strGenericHeap0.remove();
        strGenericHeap0.add("");
        int int12 = strGenericHeap0.size();
        boolean boolean13 = strGenericHeap0.isEmpty();
        java.lang.String str14 = strGenericHeap0.remove();
        strGenericHeap0.display();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test2397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2397");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        java.lang.String str3 = strGenericHeap0.get();
        int int4 = strGenericHeap0.size();
        strGenericHeap0.display();
        strGenericHeap0.display();
        strGenericHeap0.add("hi!");
        java.lang.String str9 = strGenericHeap0.remove();
        strGenericHeap0.add("");
        java.lang.Class<?> wildcardClass12 = strGenericHeap0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2398");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        java.lang.String str4 = strGenericHeap0.get();
        int int5 = strGenericHeap0.size();
        boolean boolean6 = strGenericHeap0.isEmpty();
        strGenericHeap0.add("");
        strGenericHeap0.add("hi!");
        java.lang.String str11 = strGenericHeap0.get();
        int int12 = strGenericHeap0.size();
        strGenericHeap0.add("hi!");
        java.lang.Class<?> wildcardClass15 = strGenericHeap0.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2399");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        java.lang.String str8 = strGenericHeap0.get();
        boolean boolean9 = strGenericHeap0.isEmpty();
        strGenericHeap0.updatePriority("");
        int int12 = strGenericHeap0.size();
        int int13 = strGenericHeap0.size();
        java.lang.String str14 = strGenericHeap0.remove();
        java.lang.String str15 = strGenericHeap0.get();
        boolean boolean16 = strGenericHeap0.isEmpty();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2400");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        java.lang.String str8 = strGenericHeap0.remove();
        java.lang.String str9 = strGenericHeap0.remove();
        strGenericHeap0.add("");
        strGenericHeap0.add("");
        java.lang.String str14 = strGenericHeap0.remove();
        int int15 = strGenericHeap0.size();
        strGenericHeap0.display();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test2401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2401");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.display();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        java.lang.String str10 = strGenericHeap0.remove();
        boolean boolean11 = strGenericHeap0.isEmpty();
        strGenericHeap0.display();
        int int13 = strGenericHeap0.size();
        strGenericHeap0.add("");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test2402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2402");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        strGenericHeap0.add("hi!");
        strGenericHeap0.updatePriority("hi!");
        java.lang.String str12 = strGenericHeap0.remove();
        java.lang.String str13 = strGenericHeap0.get();
        strGenericHeap0.updatePriority("");
        java.lang.String str16 = strGenericHeap0.remove();
        boolean boolean17 = strGenericHeap0.isEmpty();
        strGenericHeap0.display();
        strGenericHeap0.display();
        boolean boolean20 = strGenericHeap0.isEmpty();
        int int21 = strGenericHeap0.size();
        java.lang.String str22 = strGenericHeap0.remove();
        strGenericHeap0.display();
        strGenericHeap0.display();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test2403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2403");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        java.lang.String str4 = strGenericHeap0.get();
        boolean boolean5 = strGenericHeap0.isEmpty();
        strGenericHeap0.add("hi!");
        boolean boolean8 = strGenericHeap0.isEmpty();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        boolean boolean13 = strGenericHeap0.isEmpty();
        java.lang.String str14 = strGenericHeap0.remove();
        int int15 = strGenericHeap0.size();
        strGenericHeap0.updatePriority("");
        java.lang.String str18 = strGenericHeap0.get();
        int int19 = strGenericHeap0.size();
        java.lang.String str20 = strGenericHeap0.remove();
        java.lang.String str21 = strGenericHeap0.remove();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test2404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2404");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        strGenericHeap0.updatePriority("");
        strGenericHeap0.display();
        boolean boolean11 = strGenericHeap0.isEmpty();
        java.lang.String str12 = strGenericHeap0.remove();
        java.lang.String str13 = strGenericHeap0.remove();
        strGenericHeap0.display();
        java.lang.Class<?> wildcardClass15 = strGenericHeap0.getClass();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2405");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        strGenericHeap0.add("hi!");
        int int10 = strGenericHeap0.size();
        strGenericHeap0.add("hi!");
        java.lang.String str13 = strGenericHeap0.get();
        java.lang.String str14 = strGenericHeap0.get();
        strGenericHeap0.updatePriority("hi!");
        boolean boolean17 = strGenericHeap0.isEmpty();
        strGenericHeap0.display();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test2406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2406");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        strGenericHeap0.add("hi!");
        int int10 = strGenericHeap0.size();
        strGenericHeap0.add("hi!");
        strGenericHeap0.updatePriority("");
        strGenericHeap0.display();
        strGenericHeap0.display();
        strGenericHeap0.add("");
        strGenericHeap0.add("");
        java.lang.String str21 = strGenericHeap0.get();
        java.lang.String str22 = strGenericHeap0.remove();
        boolean boolean23 = strGenericHeap0.isEmpty();
        strGenericHeap0.add("hi!");
        int int26 = strGenericHeap0.size();
        boolean boolean27 = strGenericHeap0.isEmpty();
        java.lang.Class<?> wildcardClass28 = strGenericHeap0.getClass();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 6 + "'", int26 == 6);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2407");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        strGenericHeap0.add("hi!");
        strGenericHeap0.updatePriority("hi!");
        java.lang.String str12 = strGenericHeap0.remove();
        java.lang.String str13 = strGenericHeap0.get();
        strGenericHeap0.updatePriority("");
        java.lang.String str16 = strGenericHeap0.remove();
        int int17 = strGenericHeap0.size();
        strGenericHeap0.display();
        boolean boolean19 = strGenericHeap0.isEmpty();
        strGenericHeap0.add("");
        java.lang.String str22 = strGenericHeap0.get();
        java.lang.String str23 = strGenericHeap0.get();
        int int24 = strGenericHeap0.size();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
    }

    @Test
    public void test2408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2408");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        java.lang.String str4 = strGenericHeap0.get();
        strGenericHeap0.add("");
        strGenericHeap0.add("hi!");
        strGenericHeap0.updatePriority("");
        java.lang.String str11 = strGenericHeap0.get();
        java.lang.String str12 = strGenericHeap0.get();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.updatePriority("hi!");
        boolean boolean17 = strGenericHeap0.isEmpty();
        int int18 = strGenericHeap0.size();
        java.lang.Class<?> wildcardClass19 = strGenericHeap0.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2409");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        int int3 = strGenericHeap0.size();
        strGenericHeap0.display();
        int int5 = strGenericHeap0.size();
        strGenericHeap0.display();
        strGenericHeap0.add("");
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        int int13 = strGenericHeap0.size();
        strGenericHeap0.display();
        java.lang.String str15 = strGenericHeap0.remove();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test2410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2410");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        int int8 = strGenericHeap0.size();
        boolean boolean9 = strGenericHeap0.isEmpty();
        strGenericHeap0.add("hi!");
        boolean boolean12 = strGenericHeap0.isEmpty();
        strGenericHeap0.display();
        boolean boolean14 = strGenericHeap0.isEmpty();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2411");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        strGenericHeap0.updatePriority("");
        strGenericHeap0.display();
        boolean boolean11 = strGenericHeap0.isEmpty();
        java.lang.String str12 = strGenericHeap0.remove();
        java.lang.String str13 = strGenericHeap0.remove();
        boolean boolean14 = strGenericHeap0.isEmpty();
        strGenericHeap0.add("hi!");
        int int17 = strGenericHeap0.size();
        strGenericHeap0.display();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test2412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2412");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        java.lang.String str8 = strGenericHeap0.remove();
        java.lang.String str9 = strGenericHeap0.remove();
        int int10 = strGenericHeap0.size();
        strGenericHeap0.display();
        int int12 = strGenericHeap0.size();
        strGenericHeap0.add("hi!");
        int int15 = strGenericHeap0.size();
        strGenericHeap0.updatePriority("hi!");
        strGenericHeap0.display();
        boolean boolean19 = strGenericHeap0.isEmpty();
        strGenericHeap0.add("hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2413");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        strGenericHeap0.add("hi!");
        strGenericHeap0.updatePriority("hi!");
        java.lang.String str12 = strGenericHeap0.remove();
        java.lang.String str13 = strGenericHeap0.get();
        java.lang.String str14 = strGenericHeap0.remove();
        int int15 = strGenericHeap0.size();
        strGenericHeap0.add("");
        boolean boolean18 = strGenericHeap0.isEmpty();
        int int19 = strGenericHeap0.size();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
    }

    @Test
    public void test2414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2414");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        strGenericHeap0.add("hi!");
        strGenericHeap0.updatePriority("hi!");
        java.lang.String str12 = strGenericHeap0.remove();
        java.lang.String str13 = strGenericHeap0.get();
        strGenericHeap0.updatePriority("");
        java.lang.String str16 = strGenericHeap0.remove();
        boolean boolean17 = strGenericHeap0.isEmpty();
        strGenericHeap0.display();
        strGenericHeap0.display();
        boolean boolean20 = strGenericHeap0.isEmpty();
        int int21 = strGenericHeap0.size();
        java.lang.String str22 = strGenericHeap0.remove();
        strGenericHeap0.add("");
        boolean boolean25 = strGenericHeap0.isEmpty();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test2415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2415");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        boolean boolean4 = strGenericHeap0.isEmpty();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("hi!");
        boolean boolean9 = strGenericHeap0.isEmpty();
        strGenericHeap0.display();
        java.lang.String str11 = strGenericHeap0.remove();
        strGenericHeap0.add("hi!");
        strGenericHeap0.add("");
        strGenericHeap0.updatePriority("hi!");
        strGenericHeap0.updatePriority("");
        java.lang.Class<?> wildcardClass20 = strGenericHeap0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2416");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        java.lang.String str8 = strGenericHeap0.remove();
        java.lang.String str9 = strGenericHeap0.remove();
        int int10 = strGenericHeap0.size();
        int int11 = strGenericHeap0.size();
        strGenericHeap0.add("");
        java.lang.String str14 = strGenericHeap0.remove();
        strGenericHeap0.add("hi!");
        boolean boolean17 = strGenericHeap0.isEmpty();
        strGenericHeap0.display();
        java.lang.Class<?> wildcardClass19 = strGenericHeap0.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2417");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        strGenericHeap0.add("hi!");
        strGenericHeap0.updatePriority("hi!");
        java.lang.String str12 = strGenericHeap0.remove();
        java.lang.String str13 = strGenericHeap0.get();
        strGenericHeap0.updatePriority("");
        java.lang.String str16 = strGenericHeap0.remove();
        boolean boolean17 = strGenericHeap0.isEmpty();
        strGenericHeap0.display();
        int int19 = strGenericHeap0.size();
        strGenericHeap0.add("hi!");
        strGenericHeap0.updatePriority("hi!");
        int int24 = strGenericHeap0.size();
        java.lang.String str25 = strGenericHeap0.remove();
        strGenericHeap0.add("hi!");
        boolean boolean28 = strGenericHeap0.isEmpty();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test2418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2418");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.add("hi!");
        strGenericHeap0.display();
        strGenericHeap0.display();
        boolean boolean8 = strGenericHeap0.isEmpty();
        int int9 = strGenericHeap0.size();
        java.lang.String str10 = strGenericHeap0.get();
        java.lang.String str11 = strGenericHeap0.remove();
        strGenericHeap0.updatePriority("");
        java.lang.String str14 = strGenericHeap0.remove();
        strGenericHeap0.display();
        strGenericHeap0.display();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test2419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2419");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        int int3 = strGenericHeap0.size();
        strGenericHeap0.display();
        strGenericHeap0.add("hi!");
        boolean boolean7 = strGenericHeap0.isEmpty();
        strGenericHeap0.updatePriority("hi!");
        strGenericHeap0.updatePriority("hi!");
        strGenericHeap0.updatePriority("hi!");
        strGenericHeap0.display();
        boolean boolean15 = strGenericHeap0.isEmpty();
        int int16 = strGenericHeap0.size();
        java.lang.String str17 = strGenericHeap0.get();
        strGenericHeap0.add("hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test2420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2420");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        java.lang.String str4 = strGenericHeap0.get();
        boolean boolean5 = strGenericHeap0.isEmpty();
        strGenericHeap0.add("hi!");
        boolean boolean8 = strGenericHeap0.isEmpty();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        boolean boolean13 = strGenericHeap0.isEmpty();
        java.lang.String str14 = strGenericHeap0.remove();
        int int15 = strGenericHeap0.size();
        strGenericHeap0.updatePriority("");
        int int18 = strGenericHeap0.size();
        boolean boolean19 = strGenericHeap0.isEmpty();
        java.lang.String str20 = strGenericHeap0.get();
        strGenericHeap0.display();
        boolean boolean22 = strGenericHeap0.isEmpty();
        java.lang.Class<?> wildcardClass23 = strGenericHeap0.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2421");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        int int3 = strGenericHeap0.size();
        strGenericHeap0.display();
        strGenericHeap0.add("hi!");
        boolean boolean7 = strGenericHeap0.isEmpty();
        int int8 = strGenericHeap0.size();
        java.lang.String str9 = strGenericHeap0.get();
        strGenericHeap0.add("");
        java.lang.String str12 = strGenericHeap0.remove();
        java.lang.String str13 = strGenericHeap0.get();
        strGenericHeap0.add("hi!");
        boolean boolean16 = strGenericHeap0.isEmpty();
        strGenericHeap0.add("hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2422");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        strGenericHeap0.add("hi!");
        int int10 = strGenericHeap0.size();
        strGenericHeap0.add("hi!");
        strGenericHeap0.updatePriority("");
        strGenericHeap0.display();
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("hi!");
        strGenericHeap0.add("hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
    }

    @Test
    public void test2423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2423");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        java.lang.String str4 = strGenericHeap0.get();
        boolean boolean5 = strGenericHeap0.isEmpty();
        strGenericHeap0.add("hi!");
        boolean boolean8 = strGenericHeap0.isEmpty();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        boolean boolean13 = strGenericHeap0.isEmpty();
        java.lang.String str14 = strGenericHeap0.remove();
        strGenericHeap0.display();
        java.lang.String str16 = strGenericHeap0.remove();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test2424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2424");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        strGenericHeap0.add("hi!");
        strGenericHeap0.updatePriority("hi!");
        java.lang.String str12 = strGenericHeap0.get();
        strGenericHeap0.display();
        strGenericHeap0.add("");
        strGenericHeap0.updatePriority("hi!");
        java.lang.String str18 = strGenericHeap0.get();
        strGenericHeap0.display();
        java.lang.String str20 = strGenericHeap0.remove();
        java.lang.Class<?> wildcardClass21 = strGenericHeap0.getClass();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2425");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        java.lang.String str4 = strGenericHeap0.get();
        boolean boolean5 = strGenericHeap0.isEmpty();
        strGenericHeap0.add("hi!");
        boolean boolean8 = strGenericHeap0.isEmpty();
        boolean boolean9 = strGenericHeap0.isEmpty();
        strGenericHeap0.display();
        boolean boolean11 = strGenericHeap0.isEmpty();
        boolean boolean12 = strGenericHeap0.isEmpty();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2426");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        java.lang.String str4 = strGenericHeap0.get();
        int int5 = strGenericHeap0.size();
        boolean boolean6 = strGenericHeap0.isEmpty();
        strGenericHeap0.add("hi!");
        strGenericHeap0.display();
        strGenericHeap0.display();
        strGenericHeap0.display();
        strGenericHeap0.add("");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2427");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        java.lang.String str3 = strGenericHeap0.get();
        strGenericHeap0.add("");
        boolean boolean6 = strGenericHeap0.isEmpty();
        java.lang.Class<?> wildcardClass7 = strGenericHeap0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2428");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        strGenericHeap0.add("hi!");
        int int10 = strGenericHeap0.size();
        strGenericHeap0.add("hi!");
        strGenericHeap0.updatePriority("");
        strGenericHeap0.display();
        int int16 = strGenericHeap0.size();
        strGenericHeap0.updatePriority("hi!");
        java.lang.Class<?> wildcardClass19 = strGenericHeap0.getClass();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2429");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        strGenericHeap0.add("hi!");
        boolean boolean10 = strGenericHeap0.isEmpty();
        strGenericHeap0.updatePriority("hi!");
        strGenericHeap0.add("hi!");
        java.lang.String str15 = strGenericHeap0.remove();
        boolean boolean16 = strGenericHeap0.isEmpty();
        boolean boolean17 = strGenericHeap0.isEmpty();
        java.lang.String str18 = strGenericHeap0.remove();
        java.lang.String str19 = strGenericHeap0.remove();
        java.lang.Class<?> wildcardClass20 = strGenericHeap0.getClass();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2430");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        java.lang.String str4 = strGenericHeap0.get();
        int int5 = strGenericHeap0.size();
        boolean boolean6 = strGenericHeap0.isEmpty();
        java.lang.String str7 = strGenericHeap0.get();
        strGenericHeap0.updatePriority("");
        boolean boolean10 = strGenericHeap0.isEmpty();
        int int11 = strGenericHeap0.size();
        java.lang.String str12 = strGenericHeap0.remove();
        strGenericHeap0.display();
        boolean boolean14 = strGenericHeap0.isEmpty();
        strGenericHeap0.add("hi!");
        int int17 = strGenericHeap0.size();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test2431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2431");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        int int6 = strGenericHeap0.size();
        java.lang.String str7 = strGenericHeap0.get();
        strGenericHeap0.add("hi!");
        strGenericHeap0.updatePriority("hi!");
        boolean boolean12 = strGenericHeap0.isEmpty();
        int int13 = strGenericHeap0.size();
        java.lang.String str14 = strGenericHeap0.get();
        java.lang.Class<?> wildcardClass15 = strGenericHeap0.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2432");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        java.lang.String str8 = strGenericHeap0.get();
        boolean boolean9 = strGenericHeap0.isEmpty();
        strGenericHeap0.updatePriority("");
        int int12 = strGenericHeap0.size();
        java.lang.String str13 = strGenericHeap0.get();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("hi!");
        java.lang.String str18 = strGenericHeap0.remove();
        java.lang.String str19 = strGenericHeap0.remove();
        int int20 = strGenericHeap0.size();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test2433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2433");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        java.lang.String str8 = strGenericHeap0.get();
        boolean boolean9 = strGenericHeap0.isEmpty();
        strGenericHeap0.updatePriority("");
        int int12 = strGenericHeap0.size();
        strGenericHeap0.add("hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
    }

    @Test
    public void test2434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2434");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        java.lang.String str8 = strGenericHeap0.remove();
        int int9 = strGenericHeap0.size();
        boolean boolean10 = strGenericHeap0.isEmpty();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2435");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        java.lang.String str4 = strGenericHeap0.get();
        int int5 = strGenericHeap0.size();
        boolean boolean6 = strGenericHeap0.isEmpty();
        strGenericHeap0.add("hi!");
        strGenericHeap0.display();
        strGenericHeap0.display();
        strGenericHeap0.display();
        int int12 = strGenericHeap0.size();
        java.lang.String str13 = strGenericHeap0.remove();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test2436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2436");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        int int1 = strGenericHeap0.size();
        int int2 = strGenericHeap0.size();
        boolean boolean3 = strGenericHeap0.isEmpty();
        strGenericHeap0.add("hi!");
        java.lang.String str6 = strGenericHeap0.remove();
        java.lang.Class<?> wildcardClass7 = strGenericHeap0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2437");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        int int6 = strGenericHeap0.size();
        java.lang.String str7 = strGenericHeap0.get();
        strGenericHeap0.updatePriority("");
        java.lang.String str10 = strGenericHeap0.get();
        java.lang.String str11 = strGenericHeap0.get();
        java.lang.String str12 = strGenericHeap0.get();
        strGenericHeap0.display();
        strGenericHeap0.display();
        java.lang.String str15 = strGenericHeap0.get();
        boolean boolean16 = strGenericHeap0.isEmpty();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2438");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        int int1 = strGenericHeap0.size();
        int int2 = strGenericHeap0.size();
        int int3 = strGenericHeap0.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = strGenericHeap0.get();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test2439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2439");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        java.lang.String str8 = strGenericHeap0.remove();
        int int9 = strGenericHeap0.size();
        int int10 = strGenericHeap0.size();
        int int11 = strGenericHeap0.size();
        strGenericHeap0.add("hi!");
        java.lang.String str14 = strGenericHeap0.get();
        strGenericHeap0.add("");
        strGenericHeap0.updatePriority("hi!");
        strGenericHeap0.updatePriority("");
        strGenericHeap0.display();
        java.lang.String str22 = strGenericHeap0.get();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test2440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2440");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        java.lang.String str8 = strGenericHeap0.remove();
        java.lang.String str9 = strGenericHeap0.get();
        boolean boolean10 = strGenericHeap0.isEmpty();
        int int11 = strGenericHeap0.size();
        int int12 = strGenericHeap0.size();
        boolean boolean13 = strGenericHeap0.isEmpty();
        java.lang.String str14 = strGenericHeap0.remove();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test2441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2441");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        int int3 = strGenericHeap0.size();
        strGenericHeap0.display();
        strGenericHeap0.add("hi!");
        boolean boolean7 = strGenericHeap0.isEmpty();
        strGenericHeap0.updatePriority("hi!");
        java.lang.String str10 = strGenericHeap0.get();
        java.lang.String str11 = strGenericHeap0.get();
        strGenericHeap0.add("hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test2442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2442");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        java.lang.String str8 = strGenericHeap0.remove();
        strGenericHeap0.add("hi!");
        strGenericHeap0.display();
        strGenericHeap0.add("");
        strGenericHeap0.updatePriority("hi!");
        strGenericHeap0.display();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test2443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2443");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        strGenericHeap0.add("hi!");
        boolean boolean10 = strGenericHeap0.isEmpty();
        int int11 = strGenericHeap0.size();
        boolean boolean12 = strGenericHeap0.isEmpty();
        boolean boolean13 = strGenericHeap0.isEmpty();
        strGenericHeap0.add("");
        strGenericHeap0.add("hi!");
        java.lang.String str18 = strGenericHeap0.remove();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test2444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2444");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        java.lang.String str8 = strGenericHeap0.get();
        int int9 = strGenericHeap0.size();
        int int10 = strGenericHeap0.size();
        java.lang.String str11 = strGenericHeap0.get();
        java.lang.String str12 = strGenericHeap0.get();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test2445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2445");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        java.lang.String str8 = strGenericHeap0.get();
        int int9 = strGenericHeap0.size();
        int int10 = strGenericHeap0.size();
        boolean boolean11 = strGenericHeap0.isEmpty();
        int int12 = strGenericHeap0.size();
        boolean boolean13 = strGenericHeap0.isEmpty();
        java.lang.String str14 = strGenericHeap0.get();
        java.lang.Class<?> wildcardClass15 = strGenericHeap0.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2446");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        java.lang.String str8 = strGenericHeap0.remove();
        strGenericHeap0.add("hi!");
        strGenericHeap0.updatePriority("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("hi!");
        java.lang.String str16 = strGenericHeap0.get();
        java.lang.String str17 = strGenericHeap0.get();
        int int18 = strGenericHeap0.size();
        java.lang.String str19 = strGenericHeap0.get();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test2447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2447");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        int int3 = strGenericHeap0.size();
        strGenericHeap0.display();
        strGenericHeap0.display();
        int int6 = strGenericHeap0.size();
        java.lang.String str7 = strGenericHeap0.get();
        boolean boolean8 = strGenericHeap0.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2448");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        java.lang.String str8 = strGenericHeap0.remove();
        java.lang.String str9 = strGenericHeap0.get();
        strGenericHeap0.display();
        strGenericHeap0.display();
        int int12 = strGenericHeap0.size();
        int int13 = strGenericHeap0.size();
        strGenericHeap0.display();
        java.lang.String str15 = strGenericHeap0.remove();
        strGenericHeap0.display();
        boolean boolean17 = strGenericHeap0.isEmpty();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test2449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2449");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        java.lang.String str4 = strGenericHeap0.get();
        strGenericHeap0.add("");
        strGenericHeap0.add("hi!");
        strGenericHeap0.updatePriority("");
        int int11 = strGenericHeap0.size();
        strGenericHeap0.add("hi!");
        java.lang.String str14 = strGenericHeap0.remove();
        strGenericHeap0.display();
        boolean boolean16 = strGenericHeap0.isEmpty();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2450");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        java.lang.String str3 = strGenericHeap0.get();
        strGenericHeap0.add("");
        strGenericHeap0.add("hi!");
        strGenericHeap0.add("hi!");
        boolean boolean10 = strGenericHeap0.isEmpty();
        strGenericHeap0.add("");
        strGenericHeap0.add("hi!");
        strGenericHeap0.updatePriority("");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2451");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.add("hi!");
        strGenericHeap0.display();
        boolean boolean7 = strGenericHeap0.isEmpty();
        java.lang.String str8 = strGenericHeap0.get();
        java.lang.String str9 = strGenericHeap0.remove();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        int int13 = strGenericHeap0.size();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
    }

    @Test
    public void test2452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2452");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        strGenericHeap0.add("hi!");
        strGenericHeap0.updatePriority("hi!");
        java.lang.String str12 = strGenericHeap0.remove();
        java.lang.String str13 = strGenericHeap0.get();
        java.lang.String str14 = strGenericHeap0.remove();
        int int15 = strGenericHeap0.size();
        strGenericHeap0.add("");
        strGenericHeap0.add("");
        strGenericHeap0.add("hi!");
        boolean boolean22 = strGenericHeap0.isEmpty();
        int int23 = strGenericHeap0.size();
        int int24 = strGenericHeap0.size();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 4 + "'", int23 == 4);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
    }

    @Test
    public void test2453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2453");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        strGenericHeap0.add("hi!");
        boolean boolean10 = strGenericHeap0.isEmpty();
        strGenericHeap0.updatePriority("hi!");
        strGenericHeap0.add("hi!");
        int int15 = strGenericHeap0.size();
        strGenericHeap0.add("");
        java.lang.String str18 = strGenericHeap0.get();
        java.lang.Class<?> wildcardClass19 = strGenericHeap0.getClass();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2454");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        java.lang.String str4 = strGenericHeap0.get();
        strGenericHeap0.add("");
        strGenericHeap0.add("hi!");
        strGenericHeap0.updatePriority("");
        int int11 = strGenericHeap0.size();
        strGenericHeap0.updatePriority("hi!");
        boolean boolean14 = strGenericHeap0.isEmpty();
        int int15 = strGenericHeap0.size();
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        int int19 = strGenericHeap0.size();
        java.lang.String str20 = strGenericHeap0.get();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test2455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2455");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        java.lang.String str3 = strGenericHeap0.get();
        strGenericHeap0.display();
        int int5 = strGenericHeap0.size();
        strGenericHeap0.add("");
        int int8 = strGenericHeap0.size();
        strGenericHeap0.add("");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
    }

    @Test
    public void test2456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2456");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        java.lang.String str8 = strGenericHeap0.remove();
        java.lang.String str9 = strGenericHeap0.get();
        strGenericHeap0.display();
        java.lang.String str11 = strGenericHeap0.get();
        java.lang.String str12 = strGenericHeap0.get();
        boolean boolean13 = strGenericHeap0.isEmpty();
        java.lang.String str14 = strGenericHeap0.remove();
        int int15 = strGenericHeap0.size();
        boolean boolean16 = strGenericHeap0.isEmpty();
        strGenericHeap0.display();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = strGenericHeap0.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test2457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2457");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        int int6 = strGenericHeap0.size();
        java.lang.String str7 = strGenericHeap0.get();
        strGenericHeap0.add("hi!");
        strGenericHeap0.updatePriority("hi!");
        int int12 = strGenericHeap0.size();
        int int13 = strGenericHeap0.size();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
    }

    @Test
    public void test2458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2458");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        java.lang.String str8 = strGenericHeap0.remove();
        int int9 = strGenericHeap0.size();
        int int10 = strGenericHeap0.size();
        int int11 = strGenericHeap0.size();
        strGenericHeap0.display();
        int int13 = strGenericHeap0.size();
        java.lang.String str14 = strGenericHeap0.get();
        int int15 = strGenericHeap0.size();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test2459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2459");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        boolean boolean6 = strGenericHeap0.isEmpty();
        strGenericHeap0.add("hi!");
        int int9 = strGenericHeap0.size();
        strGenericHeap0.add("hi!");
        int int12 = strGenericHeap0.size();
        strGenericHeap0.updatePriority("hi!");
        strGenericHeap0.display();
        java.lang.String str16 = strGenericHeap0.get();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test2460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2460");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        strGenericHeap0.add("hi!");
        strGenericHeap0.updatePriority("hi!");
        strGenericHeap0.display();
        strGenericHeap0.add("");
        strGenericHeap0.add("");
        strGenericHeap0.updatePriority("");
        java.lang.String str19 = strGenericHeap0.get();
        boolean boolean20 = strGenericHeap0.isEmpty();
        boolean boolean21 = strGenericHeap0.isEmpty();
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test2461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2461");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        strGenericHeap0.add("hi!");
        int int10 = strGenericHeap0.size();
        strGenericHeap0.add("hi!");
        strGenericHeap0.updatePriority("");
        strGenericHeap0.display();
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("hi!");
        java.lang.String str19 = strGenericHeap0.remove();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test2462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2462");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        strGenericHeap0.add("hi!");
        int int10 = strGenericHeap0.size();
        strGenericHeap0.add("hi!");
        boolean boolean13 = strGenericHeap0.isEmpty();
        strGenericHeap0.add("");
        java.lang.String str16 = strGenericHeap0.get();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("hi!");
        strGenericHeap0.updatePriority("");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test2463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2463");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        java.lang.String str8 = strGenericHeap0.remove();
        strGenericHeap0.add("hi!");
        strGenericHeap0.updatePriority("");
        java.lang.String str13 = strGenericHeap0.remove();
        strGenericHeap0.display();
        strGenericHeap0.add("");
        java.lang.String str17 = strGenericHeap0.remove();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test2464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2464");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        java.lang.String str4 = strGenericHeap0.get();
        boolean boolean5 = strGenericHeap0.isEmpty();
        strGenericHeap0.add("hi!");
        boolean boolean8 = strGenericHeap0.isEmpty();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        java.lang.String str13 = strGenericHeap0.get();
        strGenericHeap0.updatePriority("");
        boolean boolean16 = strGenericHeap0.isEmpty();
        java.lang.String str17 = strGenericHeap0.get();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test2465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2465");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        java.lang.String str4 = strGenericHeap0.get();
        int int5 = strGenericHeap0.size();
        boolean boolean6 = strGenericHeap0.isEmpty();
        strGenericHeap0.add("hi!");
        strGenericHeap0.display();
        java.lang.String str10 = strGenericHeap0.remove();
        boolean boolean11 = strGenericHeap0.isEmpty();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2466");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        strGenericHeap0.add("hi!");
        strGenericHeap0.updatePriority("hi!");
        strGenericHeap0.display();
        strGenericHeap0.display();
        java.lang.String str14 = strGenericHeap0.get();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test2467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2467");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        java.lang.String str8 = strGenericHeap0.remove();
        int int9 = strGenericHeap0.size();
        int int10 = strGenericHeap0.size();
        int int11 = strGenericHeap0.size();
        strGenericHeap0.add("hi!");
        java.lang.String str14 = strGenericHeap0.get();
        strGenericHeap0.add("");
        strGenericHeap0.updatePriority("hi!");
        strGenericHeap0.updatePriority("");
        strGenericHeap0.display();
        boolean boolean22 = strGenericHeap0.isEmpty();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test2468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2468");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.add("hi!");
        java.lang.String str6 = strGenericHeap0.get();
        strGenericHeap0.display();
        strGenericHeap0.add("");
        boolean boolean10 = strGenericHeap0.isEmpty();
        int int11 = strGenericHeap0.size();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
    }

    @Test
    public void test2469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2469");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        strGenericHeap0.add("hi!");
        boolean boolean10 = strGenericHeap0.isEmpty();
        int int11 = strGenericHeap0.size();
        strGenericHeap0.add("");
        int int14 = strGenericHeap0.size();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
    }

    @Test
    public void test2470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2470");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        boolean boolean4 = strGenericHeap0.isEmpty();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("hi!");
        int int9 = strGenericHeap0.size();
        int int10 = strGenericHeap0.size();
        int int11 = strGenericHeap0.size();
        strGenericHeap0.updatePriority("hi!");
        boolean boolean14 = strGenericHeap0.isEmpty();
        java.lang.String str15 = strGenericHeap0.remove();
        strGenericHeap0.updatePriority("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test2471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2471");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        boolean boolean4 = strGenericHeap0.isEmpty();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("hi!");
        int int9 = strGenericHeap0.size();
        strGenericHeap0.add("");
        java.lang.String str12 = strGenericHeap0.get();
        java.lang.String str13 = strGenericHeap0.remove();
        strGenericHeap0.updatePriority("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test2472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2472");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        strGenericHeap0.add("hi!");
        strGenericHeap0.updatePriority("hi!");
        strGenericHeap0.display();
        java.lang.String str13 = strGenericHeap0.get();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.display();
        java.lang.String str17 = strGenericHeap0.get();
        strGenericHeap0.updatePriority("");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test2473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2473");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        int int3 = strGenericHeap0.size();
        strGenericHeap0.display();
        strGenericHeap0.add("hi!");
        boolean boolean7 = strGenericHeap0.isEmpty();
        int int8 = strGenericHeap0.size();
        java.lang.String str9 = strGenericHeap0.get();
        strGenericHeap0.add("");
        java.lang.String str12 = strGenericHeap0.remove();
        java.lang.String str13 = strGenericHeap0.get();
        java.lang.String str14 = strGenericHeap0.remove();
        strGenericHeap0.add("hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test2474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2474");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        int int8 = strGenericHeap0.size();
        strGenericHeap0.updatePriority("");
        java.lang.String str11 = strGenericHeap0.remove();
        strGenericHeap0.add("hi!");
        strGenericHeap0.display();
        int int15 = strGenericHeap0.size();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
    }

    @Test
    public void test2475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2475");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        boolean boolean4 = strGenericHeap0.isEmpty();
        strGenericHeap0.updatePriority("");
        boolean boolean7 = strGenericHeap0.isEmpty();
        boolean boolean8 = strGenericHeap0.isEmpty();
        strGenericHeap0.display();
        boolean boolean10 = strGenericHeap0.isEmpty();
        strGenericHeap0.add("");
        java.lang.String str13 = strGenericHeap0.remove();
        int int14 = strGenericHeap0.size();
        int int15 = strGenericHeap0.size();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test2476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2476");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        java.lang.String str8 = strGenericHeap0.remove();
        strGenericHeap0.add("hi!");
        strGenericHeap0.updatePriority("");
        boolean boolean13 = strGenericHeap0.isEmpty();
        strGenericHeap0.updatePriority("hi!");
        strGenericHeap0.display();
        strGenericHeap0.add("");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2477");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        strGenericHeap0.add("hi!");
        int int10 = strGenericHeap0.size();
        strGenericHeap0.add("hi!");
        strGenericHeap0.updatePriority("");
        strGenericHeap0.display();
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("hi!");
        strGenericHeap0.add("");
        java.lang.String str21 = strGenericHeap0.get();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test2478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2478");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        int int6 = strGenericHeap0.size();
        java.lang.String str7 = strGenericHeap0.get();
        int int8 = strGenericHeap0.size();
        java.lang.String str9 = strGenericHeap0.get();
        strGenericHeap0.updatePriority("");
        java.lang.Class<?> wildcardClass12 = strGenericHeap0.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2479");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        java.lang.String str4 = strGenericHeap0.get();
        int int5 = strGenericHeap0.size();
        boolean boolean6 = strGenericHeap0.isEmpty();
        java.lang.String str7 = strGenericHeap0.get();
        strGenericHeap0.display();
        boolean boolean9 = strGenericHeap0.isEmpty();
        boolean boolean10 = strGenericHeap0.isEmpty();
        int int11 = strGenericHeap0.size();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test2480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2480");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        java.lang.String str4 = strGenericHeap0.get();
        strGenericHeap0.add("");
        strGenericHeap0.add("hi!");
        strGenericHeap0.updatePriority("");
        int int11 = strGenericHeap0.size();
        strGenericHeap0.updatePriority("hi!");
        java.lang.String str14 = strGenericHeap0.get();
        strGenericHeap0.add("hi!");
        java.lang.String str17 = strGenericHeap0.get();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test2481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2481");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        java.lang.String str4 = strGenericHeap0.get();
        boolean boolean5 = strGenericHeap0.isEmpty();
        strGenericHeap0.add("hi!");
        boolean boolean8 = strGenericHeap0.isEmpty();
        boolean boolean9 = strGenericHeap0.isEmpty();
        java.lang.Class<?> wildcardClass10 = strGenericHeap0.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2482");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        strGenericHeap0.add("hi!");
        boolean boolean10 = strGenericHeap0.isEmpty();
        int int11 = strGenericHeap0.size();
        strGenericHeap0.add("");
        boolean boolean14 = strGenericHeap0.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2483");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        strGenericHeap0.add("hi!");
        strGenericHeap0.updatePriority("hi!");
        java.lang.String str12 = strGenericHeap0.get();
        strGenericHeap0.display();
        strGenericHeap0.add("");
        strGenericHeap0.updatePriority("hi!");
        strGenericHeap0.display();
        strGenericHeap0.add("");
        java.lang.String str21 = strGenericHeap0.get();
        java.lang.String str22 = strGenericHeap0.get();
        int int23 = strGenericHeap0.size();
        strGenericHeap0.add("hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 5 + "'", int23 == 5);
    }

    @Test
    public void test2484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2484");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        int int3 = strGenericHeap0.size();
        strGenericHeap0.display();
        boolean boolean5 = strGenericHeap0.isEmpty();
        strGenericHeap0.display();
        int int7 = strGenericHeap0.size();
        java.lang.String str8 = strGenericHeap0.remove();
        strGenericHeap0.display();
        java.lang.Class<?> wildcardClass10 = strGenericHeap0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2485");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        strGenericHeap0.add("hi!");
        strGenericHeap0.updatePriority("hi!");
        java.lang.String str12 = strGenericHeap0.get();
        strGenericHeap0.display();
        strGenericHeap0.add("");
        strGenericHeap0.updatePriority("hi!");
        strGenericHeap0.add("");
        boolean boolean20 = strGenericHeap0.isEmpty();
        java.lang.String str21 = strGenericHeap0.remove();
        strGenericHeap0.add("");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test2486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2486");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        strGenericHeap0.add("hi!");
        strGenericHeap0.updatePriority("hi!");
        java.lang.String str12 = strGenericHeap0.remove();
        java.lang.String str13 = strGenericHeap0.get();
        strGenericHeap0.updatePriority("");
        java.lang.String str16 = strGenericHeap0.remove();
        boolean boolean17 = strGenericHeap0.isEmpty();
        strGenericHeap0.display();
        strGenericHeap0.display();
        boolean boolean20 = strGenericHeap0.isEmpty();
        strGenericHeap0.display();
        boolean boolean22 = strGenericHeap0.isEmpty();
        strGenericHeap0.display();
        java.lang.String str24 = strGenericHeap0.remove();
        strGenericHeap0.display();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test2487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2487");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        int int1 = strGenericHeap0.size();
        int int2 = strGenericHeap0.size();
        boolean boolean3 = strGenericHeap0.isEmpty();
        strGenericHeap0.add("hi!");
        boolean boolean6 = strGenericHeap0.isEmpty();
        java.lang.String str7 = strGenericHeap0.get();
        strGenericHeap0.updatePriority("hi!");
        strGenericHeap0.add("hi!");
        java.lang.String str12 = strGenericHeap0.get();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test2488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2488");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        boolean boolean4 = strGenericHeap0.isEmpty();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("hi!");
        boolean boolean9 = strGenericHeap0.isEmpty();
        java.lang.String str10 = strGenericHeap0.remove();
        strGenericHeap0.display();
        strGenericHeap0.add("");
        int int14 = strGenericHeap0.size();
        java.lang.String str15 = strGenericHeap0.get();
        strGenericHeap0.add("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test2489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2489");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        strGenericHeap0.add("hi!");
        strGenericHeap0.updatePriority("hi!");
        strGenericHeap0.display();
        boolean boolean13 = strGenericHeap0.isEmpty();
        strGenericHeap0.add("hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2490");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        strGenericHeap0.add("hi!");
        boolean boolean10 = strGenericHeap0.isEmpty();
        strGenericHeap0.updatePriority("");
        java.lang.String str13 = strGenericHeap0.remove();
        java.lang.String str14 = strGenericHeap0.get();
        java.lang.String str15 = strGenericHeap0.get();
        java.lang.Class<?> wildcardClass16 = strGenericHeap0.getClass();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2491");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        java.lang.String str4 = strGenericHeap0.get();
        java.lang.String str5 = strGenericHeap0.get();
        int int6 = strGenericHeap0.size();
        strGenericHeap0.display();
        java.lang.String str8 = strGenericHeap0.remove();
        strGenericHeap0.add("");
        java.lang.String str11 = strGenericHeap0.get();
        boolean boolean12 = strGenericHeap0.isEmpty();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2492");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        strGenericHeap0.add("hi!");
        strGenericHeap0.updatePriority("hi!");
        java.lang.String str12 = strGenericHeap0.remove();
        java.lang.String str13 = strGenericHeap0.get();
        boolean boolean14 = strGenericHeap0.isEmpty();
        int int15 = strGenericHeap0.size();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.updatePriority("");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
    }

    @Test
    public void test2493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2493");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        strGenericHeap0.add("hi!");
        strGenericHeap0.updatePriority("hi!");
        strGenericHeap0.display();
        java.lang.String str13 = strGenericHeap0.get();
        boolean boolean14 = strGenericHeap0.isEmpty();
        java.lang.String str15 = strGenericHeap0.remove();
        java.lang.String str16 = strGenericHeap0.remove();
        java.lang.String str17 = strGenericHeap0.get();
        java.lang.Class<?> wildcardClass18 = strGenericHeap0.getClass();
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2494");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        int int3 = strGenericHeap0.size();
        strGenericHeap0.display();
        strGenericHeap0.add("hi!");
        boolean boolean7 = strGenericHeap0.isEmpty();
        strGenericHeap0.add("hi!");
        boolean boolean10 = strGenericHeap0.isEmpty();
        java.lang.String str11 = strGenericHeap0.remove();
        strGenericHeap0.add("hi!");
        strGenericHeap0.updatePriority("");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test2495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2495");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        java.lang.String str8 = strGenericHeap0.remove();
        java.lang.String str9 = strGenericHeap0.remove();
        strGenericHeap0.add("");
        strGenericHeap0.add("");
        strGenericHeap0.updatePriority("");
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test2496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2496");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        strGenericHeap0.add("hi!");
        strGenericHeap0.updatePriority("hi!");
        java.lang.String str12 = strGenericHeap0.get();
        strGenericHeap0.display();
        boolean boolean14 = strGenericHeap0.isEmpty();
        strGenericHeap0.display();
        java.lang.String str16 = strGenericHeap0.remove();
        java.lang.String str17 = strGenericHeap0.get();
        strGenericHeap0.updatePriority("");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test2497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2497");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        boolean boolean4 = strGenericHeap0.isEmpty();
        boolean boolean5 = strGenericHeap0.isEmpty();
        int int6 = strGenericHeap0.size();
        boolean boolean7 = strGenericHeap0.isEmpty();
        java.lang.String str8 = strGenericHeap0.remove();
        strGenericHeap0.add("");
        strGenericHeap0.add("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test2498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2498");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        java.lang.String str8 = strGenericHeap0.get();
        boolean boolean9 = strGenericHeap0.isEmpty();
        strGenericHeap0.updatePriority("");
        int int12 = strGenericHeap0.size();
        java.lang.String str13 = strGenericHeap0.get();
        strGenericHeap0.updatePriority("");
        boolean boolean16 = strGenericHeap0.isEmpty();
        strGenericHeap0.add("hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2499");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        strGenericHeap0.add("hi!");
        int int10 = strGenericHeap0.size();
        strGenericHeap0.add("hi!");
        strGenericHeap0.updatePriority("");
        strGenericHeap0.display();
        strGenericHeap0.display();
        strGenericHeap0.add("");
        strGenericHeap0.add("");
        java.lang.String str21 = strGenericHeap0.get();
        strGenericHeap0.add("hi!");
        boolean boolean24 = strGenericHeap0.isEmpty();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test2500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2500");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        java.lang.String str8 = strGenericHeap0.remove();
        java.lang.String str9 = strGenericHeap0.remove();
        int int10 = strGenericHeap0.size();
        strGenericHeap0.display();
        int int12 = strGenericHeap0.size();
        strGenericHeap0.add("hi!");
        int int15 = strGenericHeap0.size();
        strGenericHeap0.updatePriority("hi!");
        strGenericHeap0.display();
        java.lang.String str19 = strGenericHeap0.remove();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = strGenericHeap0.get();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }
}

