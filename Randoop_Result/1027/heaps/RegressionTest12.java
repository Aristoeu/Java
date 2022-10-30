package heaps;

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
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        int int1 = strGenericHeap0.size();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        boolean boolean5 = strGenericHeap0.isEmpty();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("hi!");
        java.lang.Class<?> wildcardClass10 = strGenericHeap0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test6002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6002");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        int int6 = strGenericHeap0.size();
        java.lang.String str7 = strGenericHeap0.get();
        strGenericHeap0.add("hi!");
        strGenericHeap0.updatePriority("hi!");
        strGenericHeap0.add("hi!");
        strGenericHeap0.updatePriority("");
        strGenericHeap0.updatePriority("hi!");
        java.lang.String str18 = strGenericHeap0.get();
        java.lang.String str19 = strGenericHeap0.remove();
        boolean boolean20 = strGenericHeap0.isEmpty();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test6003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6003");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        java.lang.String str4 = strGenericHeap0.get();
        strGenericHeap0.add("");
        int int7 = strGenericHeap0.size();
        strGenericHeap0.add("hi!");
        strGenericHeap0.updatePriority("hi!");
        strGenericHeap0.add("hi!");
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
    }

    @Test
    public void test6004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6004");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        java.lang.String str8 = strGenericHeap0.remove();
        strGenericHeap0.add("hi!");
        strGenericHeap0.updatePriority("");
        boolean boolean13 = strGenericHeap0.isEmpty();
        strGenericHeap0.display();
        java.lang.String str15 = strGenericHeap0.remove();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        boolean boolean20 = strGenericHeap0.isEmpty();
        strGenericHeap0.updatePriority("");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test6005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6005");
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
        strGenericHeap0.display();
        int int16 = strGenericHeap0.size();
        java.lang.String str17 = strGenericHeap0.get();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test6006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6006");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        java.lang.String str6 = strGenericHeap0.get();
        strGenericHeap0.add("");
        int int9 = strGenericHeap0.size();
        strGenericHeap0.updatePriority("");
        java.lang.String str12 = strGenericHeap0.remove();
        boolean boolean13 = strGenericHeap0.isEmpty();
        boolean boolean14 = strGenericHeap0.isEmpty();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test6007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6007");
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
        strGenericHeap0.add("");
        java.lang.String str17 = strGenericHeap0.get();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test6008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6008");
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
        java.lang.Class<?> wildcardClass22 = strGenericHeap0.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test6009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6009");
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
        strGenericHeap0.add("");
        boolean boolean22 = strGenericHeap0.isEmpty();
        strGenericHeap0.add("hi!");
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test6010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6010");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        java.lang.String str8 = strGenericHeap0.remove();
        strGenericHeap0.add("hi!");
        boolean boolean11 = strGenericHeap0.isEmpty();
        boolean boolean12 = strGenericHeap0.isEmpty();
        java.lang.String str13 = strGenericHeap0.get();
        boolean boolean14 = strGenericHeap0.isEmpty();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test6011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6011");
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
        java.lang.String str12 = strGenericHeap0.get();
        java.lang.String str13 = strGenericHeap0.remove();
        int int14 = strGenericHeap0.size();
        strGenericHeap0.display();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = strGenericHeap0.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test6012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6012");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.add("hi!");
        int int6 = strGenericHeap0.size();
        strGenericHeap0.display();
        strGenericHeap0.add("hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
    }

    @Test
    public void test6013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6013");
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
        java.lang.String str16 = strGenericHeap0.get();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test6014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6014");
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
        strGenericHeap0.add("");
        java.lang.String str23 = strGenericHeap0.remove();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test6015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6015");
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
        boolean boolean17 = strGenericHeap0.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test6016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6016");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        strGenericHeap0.add("hi!");
        int int10 = strGenericHeap0.size();
        strGenericHeap0.add("hi!");
        strGenericHeap0.updatePriority("");
        java.lang.String str15 = strGenericHeap0.remove();
        java.lang.String str16 = strGenericHeap0.remove();
        strGenericHeap0.add("");
        java.lang.String str19 = strGenericHeap0.remove();
        java.lang.String str20 = strGenericHeap0.remove();
        boolean boolean21 = strGenericHeap0.isEmpty();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test6017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6017");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        java.lang.String str8 = strGenericHeap0.remove();
        java.lang.String str9 = strGenericHeap0.get();
        java.lang.String str10 = strGenericHeap0.get();
        boolean boolean11 = strGenericHeap0.isEmpty();
        boolean boolean12 = strGenericHeap0.isEmpty();
        strGenericHeap0.display();
        boolean boolean14 = strGenericHeap0.isEmpty();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test6018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6018");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        java.lang.String str4 = strGenericHeap0.get();
        boolean boolean5 = strGenericHeap0.isEmpty();
        boolean boolean6 = strGenericHeap0.isEmpty();
        strGenericHeap0.add("hi!");
        boolean boolean9 = strGenericHeap0.isEmpty();
        boolean boolean10 = strGenericHeap0.isEmpty();
        boolean boolean11 = strGenericHeap0.isEmpty();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test6019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6019");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        boolean boolean4 = strGenericHeap0.isEmpty();
        boolean boolean5 = strGenericHeap0.isEmpty();
        int int6 = strGenericHeap0.size();
        java.lang.String str7 = strGenericHeap0.remove();
        boolean boolean8 = strGenericHeap0.isEmpty();
        strGenericHeap0.add("");
        java.lang.String str11 = strGenericHeap0.get();
        java.lang.Class<?> wildcardClass12 = strGenericHeap0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test6020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6020");
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
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        int int19 = strGenericHeap0.size();
        boolean boolean20 = strGenericHeap0.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 4 + "'", int19 == 4);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test6021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6021");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        int int1 = strGenericHeap0.size();
        strGenericHeap0.add("");
        java.lang.String str4 = strGenericHeap0.remove();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = strGenericHeap0.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test6022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6022");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        boolean boolean4 = strGenericHeap0.isEmpty();
        strGenericHeap0.updatePriority("");
        boolean boolean7 = strGenericHeap0.isEmpty();
        strGenericHeap0.add("");
        boolean boolean10 = strGenericHeap0.isEmpty();
        int int11 = strGenericHeap0.size();
        strGenericHeap0.updatePriority("");
        java.lang.String str14 = strGenericHeap0.get();
        strGenericHeap0.display();
        boolean boolean16 = strGenericHeap0.isEmpty();
        java.lang.String str17 = strGenericHeap0.get();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test6023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6023");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = strGenericHeap0.get();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test6024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6024");
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
        boolean boolean23 = strGenericHeap0.isEmpty();
        java.lang.Class<?> wildcardClass24 = strGenericHeap0.getClass();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test6025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6025");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        boolean boolean6 = strGenericHeap0.isEmpty();
        strGenericHeap0.add("hi!");
        int int9 = strGenericHeap0.size();
        strGenericHeap0.display();
        boolean boolean11 = strGenericHeap0.isEmpty();
        java.lang.Class<?> wildcardClass12 = strGenericHeap0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test6026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6026");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        strGenericHeap0.updatePriority("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        int int13 = strGenericHeap0.size();
        int int14 = strGenericHeap0.size();
        boolean boolean15 = strGenericHeap0.isEmpty();
        strGenericHeap0.updatePriority("");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test6027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6027");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        java.lang.String str4 = strGenericHeap0.get();
        int int5 = strGenericHeap0.size();
        strGenericHeap0.display();
        boolean boolean7 = strGenericHeap0.isEmpty();
        strGenericHeap0.add("hi!");
        java.lang.String str10 = strGenericHeap0.remove();
        strGenericHeap0.display();
        int int12 = strGenericHeap0.size();
        int int13 = strGenericHeap0.size();
        strGenericHeap0.add("hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test6028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6028");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        java.lang.String str3 = strGenericHeap0.get();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        boolean boolean7 = strGenericHeap0.isEmpty();
        java.lang.String str8 = strGenericHeap0.remove();
        java.lang.String str9 = strGenericHeap0.get();
        java.lang.String str10 = strGenericHeap0.get();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test6029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6029");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        java.lang.String str8 = strGenericHeap0.remove();
        int int9 = strGenericHeap0.size();
        int int10 = strGenericHeap0.size();
        int int11 = strGenericHeap0.size();
        int int12 = strGenericHeap0.size();
        int int13 = strGenericHeap0.size();
        strGenericHeap0.add("");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test6030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6030");
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
        java.lang.String str13 = strGenericHeap0.get();
        java.lang.Class<?> wildcardClass14 = strGenericHeap0.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test6031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6031");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        java.lang.String str4 = strGenericHeap0.get();
        int int5 = strGenericHeap0.size();
        boolean boolean6 = strGenericHeap0.isEmpty();
        boolean boolean7 = strGenericHeap0.isEmpty();
        int int8 = strGenericHeap0.size();
        strGenericHeap0.display();
        strGenericHeap0.display();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test6032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6032");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        strGenericHeap0.add("hi!");
        int int10 = strGenericHeap0.size();
        java.lang.String str11 = strGenericHeap0.remove();
        java.lang.String str12 = strGenericHeap0.remove();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test6033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6033");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        int int8 = strGenericHeap0.size();
        java.lang.String str9 = strGenericHeap0.get();
        boolean boolean10 = strGenericHeap0.isEmpty();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test6034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6034");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        int int3 = strGenericHeap0.size();
        strGenericHeap0.display();
        boolean boolean5 = strGenericHeap0.isEmpty();
        java.lang.String str6 = strGenericHeap0.get();
        java.lang.String str7 = strGenericHeap0.remove();
        java.lang.Class<?> wildcardClass8 = strGenericHeap0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test6035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6035");
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
        java.lang.String str22 = strGenericHeap0.remove();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test6036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6036");
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
        boolean boolean21 = strGenericHeap0.isEmpty();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test6037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6037");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        int int1 = strGenericHeap0.size();
        strGenericHeap0.add("");
        boolean boolean4 = strGenericHeap0.isEmpty();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.updatePriority("");
        strGenericHeap0.display();
        strGenericHeap0.add("hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6038");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        java.lang.String str4 = strGenericHeap0.get();
        int int5 = strGenericHeap0.size();
        strGenericHeap0.display();
        java.lang.String str7 = strGenericHeap0.get();
        strGenericHeap0.updatePriority("");
        java.lang.String str10 = strGenericHeap0.get();
        java.lang.String str11 = strGenericHeap0.remove();
        strGenericHeap0.display();
        strGenericHeap0.display();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test6039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6039");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        boolean boolean4 = strGenericHeap0.isEmpty();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("hi!");
        int int9 = strGenericHeap0.size();
        strGenericHeap0.add("");
        java.lang.String str12 = strGenericHeap0.get();
        strGenericHeap0.display();
        strGenericHeap0.display();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test6040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6040");
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
        boolean boolean15 = strGenericHeap0.isEmpty();
        java.lang.String str16 = strGenericHeap0.get();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test6041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6041");
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
        int int14 = strGenericHeap0.size();
        java.lang.String str15 = strGenericHeap0.remove();
        boolean boolean16 = strGenericHeap0.isEmpty();
        strGenericHeap0.display();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = strGenericHeap0.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test6042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6042");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        strGenericHeap0.add("hi!");
        strGenericHeap0.updatePriority("hi!");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        java.lang.String str15 = strGenericHeap0.remove();
        java.lang.Class<?> wildcardClass16 = strGenericHeap0.getClass();
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test6043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6043");
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
        java.lang.String str16 = strGenericHeap0.get();
        java.lang.String str17 = strGenericHeap0.get();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test6044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6044");
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
        java.lang.String str17 = strGenericHeap0.get();
        int int18 = strGenericHeap0.size();
        java.lang.String str19 = strGenericHeap0.remove();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test6045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6045");
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
        strGenericHeap0.add("");
        java.lang.String str15 = strGenericHeap0.remove();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test6046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6046");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        int int8 = strGenericHeap0.size();
        boolean boolean9 = strGenericHeap0.isEmpty();
        java.lang.String str10 = strGenericHeap0.remove();
        boolean boolean11 = strGenericHeap0.isEmpty();
        strGenericHeap0.add("hi!");
        boolean boolean14 = strGenericHeap0.isEmpty();
        strGenericHeap0.add("hi!");
        strGenericHeap0.updatePriority("hi!");
        strGenericHeap0.updatePriority("hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test6047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6047");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.add("hi!");
        strGenericHeap0.display();
        strGenericHeap0.display();
        boolean boolean8 = strGenericHeap0.isEmpty();
        java.lang.String str9 = strGenericHeap0.get();
        int int10 = strGenericHeap0.size();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
    }

    @Test
    public void test6048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6048");
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
        strGenericHeap0.add("hi!");
        int int17 = strGenericHeap0.size();
        strGenericHeap0.add("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
    }

    @Test
    public void test6049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6049");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        java.lang.String str8 = strGenericHeap0.get();
        boolean boolean9 = strGenericHeap0.isEmpty();
        int int10 = strGenericHeap0.size();
        java.lang.String str11 = strGenericHeap0.remove();
        java.lang.String str12 = strGenericHeap0.remove();
        strGenericHeap0.add("");
        strGenericHeap0.add("hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test6050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6050");
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
        int int19 = strGenericHeap0.size();
        strGenericHeap0.add("hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test6051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6051");
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
        strGenericHeap0.display();
        strGenericHeap0.display();
        java.lang.String str16 = strGenericHeap0.remove();
        java.lang.String str17 = strGenericHeap0.get();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test6052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6052");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        int int1 = strGenericHeap0.size();
        int int2 = strGenericHeap0.size();
        strGenericHeap0.add("");
        int int5 = strGenericHeap0.size();
        strGenericHeap0.add("hi!");
        int int8 = strGenericHeap0.size();
        strGenericHeap0.add("hi!");
        boolean boolean11 = strGenericHeap0.isEmpty();
        strGenericHeap0.updatePriority("");
        boolean boolean14 = strGenericHeap0.isEmpty();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test6053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6053");
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
        java.lang.String str19 = strGenericHeap0.get();
        strGenericHeap0.add("");
        int int22 = strGenericHeap0.size();
        java.lang.String str23 = strGenericHeap0.remove();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test6054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6054");
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
        strGenericHeap0.display();
        strGenericHeap0.add("hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test6055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6055");
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
        strGenericHeap0.display();
        java.lang.Class<?> wildcardClass20 = strGenericHeap0.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test6056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6056");
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
        strGenericHeap0.display();
        boolean boolean19 = strGenericHeap0.isEmpty();
        strGenericHeap0.display();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test6057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6057");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        strGenericHeap0.add("hi!");
        strGenericHeap0.updatePriority("hi!");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.updatePriority("");
    }

    @Test
    public void test6058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6058");
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
        strGenericHeap0.add("hi!");
        strGenericHeap0.updatePriority("hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test6059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6059");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        java.lang.String str8 = strGenericHeap0.get();
        boolean boolean9 = strGenericHeap0.isEmpty();
        int int10 = strGenericHeap0.size();
        strGenericHeap0.display();
        java.lang.String str12 = strGenericHeap0.remove();
        strGenericHeap0.display();
        boolean boolean14 = strGenericHeap0.isEmpty();
        strGenericHeap0.display();
        strGenericHeap0.add("hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test6060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6060");
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
        java.lang.String str21 = strGenericHeap0.remove();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test6061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6061");
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
        java.lang.String str12 = strGenericHeap0.remove();
        strGenericHeap0.display();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test6062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6062");
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
        strGenericHeap0.updatePriority("");
        strGenericHeap0.display();
        strGenericHeap0.display();
        strGenericHeap0.add("hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test6063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6063");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        java.lang.String str4 = strGenericHeap0.get();
        int int5 = strGenericHeap0.size();
        boolean boolean6 = strGenericHeap0.isEmpty();
        java.lang.String str7 = strGenericHeap0.get();
        java.lang.String str8 = strGenericHeap0.get();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        java.lang.String str13 = strGenericHeap0.get();
        int int14 = strGenericHeap0.size();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        java.lang.String str18 = strGenericHeap0.remove();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test6064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6064");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        java.lang.String str8 = strGenericHeap0.remove();
        strGenericHeap0.display();
        java.lang.String str10 = strGenericHeap0.remove();
        boolean boolean11 = strGenericHeap0.isEmpty();
        strGenericHeap0.add("hi!");
        strGenericHeap0.updatePriority("hi!");
        strGenericHeap0.updatePriority("hi!");
        strGenericHeap0.add("");
        strGenericHeap0.updatePriority("");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test6065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6065");
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
        java.lang.String str18 = strGenericHeap0.get();
        strGenericHeap0.display();
        java.lang.String str20 = strGenericHeap0.get();
        strGenericHeap0.add("hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test6066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6066");
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
        boolean boolean19 = strGenericHeap0.isEmpty();
        int int20 = strGenericHeap0.size();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
    }

    @Test
    public void test6067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6067");
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
        strGenericHeap0.display();
        java.lang.String str14 = strGenericHeap0.get();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.display();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test6068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6068");
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
        strGenericHeap0.add("hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test6069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6069");
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
        int int17 = strGenericHeap0.size();
        strGenericHeap0.display();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
    }

    @Test
    public void test6070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6070");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        int int1 = strGenericHeap0.size();
        int int2 = strGenericHeap0.size();
        strGenericHeap0.add("");
        int int5 = strGenericHeap0.size();
        strGenericHeap0.add("hi!");
        int int8 = strGenericHeap0.size();
        strGenericHeap0.updatePriority("hi!");
        strGenericHeap0.updatePriority("");
        java.lang.String str13 = strGenericHeap0.remove();
        java.lang.String str14 = strGenericHeap0.get();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test6071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6071");
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
        java.lang.String str18 = strGenericHeap0.get();
        strGenericHeap0.add("");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test6072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6072");
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
        strGenericHeap0.add("");
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test6073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6073");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        java.lang.String str3 = strGenericHeap0.get();
        strGenericHeap0.display();
        int int5 = strGenericHeap0.size();
        java.lang.String str6 = strGenericHeap0.get();
        boolean boolean7 = strGenericHeap0.isEmpty();
        java.lang.String str8 = strGenericHeap0.get();
        java.lang.String str9 = strGenericHeap0.get();
        java.lang.String str10 = strGenericHeap0.get();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test6074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6074");
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
        strGenericHeap0.updatePriority("hi!");
        strGenericHeap0.updatePriority("");
        boolean boolean18 = strGenericHeap0.isEmpty();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test6075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6075");
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
        strGenericHeap0.add("hi!");
        java.lang.String str20 = strGenericHeap0.get();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test6076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6076");
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
        boolean boolean16 = strGenericHeap0.isEmpty();
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test6077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6077");
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
        int int19 = strGenericHeap0.size();
        int int20 = strGenericHeap0.size();
        strGenericHeap0.updatePriority("");
        int int23 = strGenericHeap0.size();
        java.lang.Class<?> wildcardClass24 = strGenericHeap0.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 3 + "'", int23 == 3);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test6078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6078");
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
        java.lang.String str18 = strGenericHeap0.get();
        boolean boolean19 = strGenericHeap0.isEmpty();
        java.lang.Class<?> wildcardClass20 = strGenericHeap0.getClass();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test6079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6079");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        java.lang.String str3 = strGenericHeap0.get();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        boolean boolean7 = strGenericHeap0.isEmpty();
        java.lang.String str8 = strGenericHeap0.remove();
        strGenericHeap0.add("");
        int int11 = strGenericHeap0.size();
        strGenericHeap0.display();
        strGenericHeap0.add("hi!");
        java.lang.String str15 = strGenericHeap0.get();
        java.lang.String str16 = strGenericHeap0.get();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test6080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6080");
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
        boolean boolean22 = strGenericHeap0.isEmpty();
        int int23 = strGenericHeap0.size();
        int int24 = strGenericHeap0.size();
        strGenericHeap0.add("");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test6081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6081");
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
        java.lang.Class<?> wildcardClass13 = strGenericHeap0.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test6082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6082");
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
        java.lang.String str22 = strGenericHeap0.remove();
        strGenericHeap0.add("");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test6083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6083");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        java.lang.String str8 = strGenericHeap0.remove();
        strGenericHeap0.add("hi!");
        strGenericHeap0.display();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        java.lang.String str15 = strGenericHeap0.get();
        strGenericHeap0.updatePriority("");
        java.lang.String str18 = strGenericHeap0.remove();
        strGenericHeap0.add("hi!");
        boolean boolean21 = strGenericHeap0.isEmpty();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test6084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6084");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        strGenericHeap0.add("hi!");
        int int10 = strGenericHeap0.size();
        strGenericHeap0.add("hi!");
        strGenericHeap0.updatePriority("");
        java.lang.String str15 = strGenericHeap0.remove();
        strGenericHeap0.display();
        strGenericHeap0.add("");
        int int19 = strGenericHeap0.size();
        int int20 = strGenericHeap0.size();
        java.lang.String str21 = strGenericHeap0.remove();
        java.lang.Class<?> wildcardClass22 = strGenericHeap0.getClass();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 4 + "'", int19 == 4);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test6085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6085");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.add("hi!");
        int int6 = strGenericHeap0.size();
        strGenericHeap0.updatePriority("hi!");
        java.lang.String str9 = strGenericHeap0.remove();
        strGenericHeap0.display();
        strGenericHeap0.display();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test6086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6086");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        java.lang.String str4 = strGenericHeap0.get();
        java.lang.String str5 = strGenericHeap0.get();
        strGenericHeap0.add("hi!");
        strGenericHeap0.display();
        java.lang.String str9 = strGenericHeap0.get();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test6087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6087");
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
        strGenericHeap0.add("hi!");
        java.lang.String str16 = strGenericHeap0.remove();
        java.lang.String str17 = strGenericHeap0.get();
        java.lang.String str18 = strGenericHeap0.get();
        java.lang.Class<?> wildcardClass19 = strGenericHeap0.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test6088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6088");
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
        boolean boolean15 = strGenericHeap0.isEmpty();
        strGenericHeap0.add("");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test6089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6089");
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
        int int20 = strGenericHeap0.size();
        java.lang.String str21 = strGenericHeap0.get();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test6090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6090");
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
        strGenericHeap0.display();
        boolean boolean20 = strGenericHeap0.isEmpty();
        java.lang.String str21 = strGenericHeap0.remove();
        java.lang.String str22 = strGenericHeap0.get();
        java.lang.String str23 = strGenericHeap0.remove();
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test6091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6091");
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
        strGenericHeap0.add("hi!");
        java.lang.String str19 = strGenericHeap0.remove();
        strGenericHeap0.add("");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test6092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6092");
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
        java.lang.String str14 = strGenericHeap0.remove();
        strGenericHeap0.display();
        strGenericHeap0.add("hi!");
        java.lang.String str18 = strGenericHeap0.get();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test6093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6093");
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
        java.lang.String str27 = strGenericHeap0.get();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test6094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6094");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        java.lang.String str3 = strGenericHeap0.get();
        strGenericHeap0.add("");
        boolean boolean6 = strGenericHeap0.isEmpty();
        strGenericHeap0.add("");
        java.lang.String str9 = strGenericHeap0.remove();
        boolean boolean10 = strGenericHeap0.isEmpty();
        strGenericHeap0.add("");
        java.lang.String str13 = strGenericHeap0.get();
        strGenericHeap0.display();
        java.lang.String str15 = strGenericHeap0.get();
        java.lang.String str16 = strGenericHeap0.remove();
        boolean boolean17 = strGenericHeap0.isEmpty();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test6095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6095");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        boolean boolean4 = strGenericHeap0.isEmpty();
        strGenericHeap0.updatePriority("");
        boolean boolean7 = strGenericHeap0.isEmpty();
        boolean boolean8 = strGenericHeap0.isEmpty();
        strGenericHeap0.display();
        boolean boolean10 = strGenericHeap0.isEmpty();
        strGenericHeap0.display();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test6096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6096");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        java.lang.String str8 = strGenericHeap0.remove();
        strGenericHeap0.display();
        boolean boolean10 = strGenericHeap0.isEmpty();
        boolean boolean11 = strGenericHeap0.isEmpty();
        java.lang.String str12 = strGenericHeap0.get();
        int int13 = strGenericHeap0.size();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test6097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6097");
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
        strGenericHeap0.display();
        int int18 = strGenericHeap0.size();
        strGenericHeap0.display();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
    }

    @Test
    public void test6098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6098");
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
        strGenericHeap0.display();
        int int14 = strGenericHeap0.size();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
    }

    @Test
    public void test6099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6099");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        int int8 = strGenericHeap0.size();
        boolean boolean9 = strGenericHeap0.isEmpty();
        java.lang.String str10 = strGenericHeap0.remove();
        strGenericHeap0.add("hi!");
        int int13 = strGenericHeap0.size();
        boolean boolean14 = strGenericHeap0.isEmpty();
        strGenericHeap0.display();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test6100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6100");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        int int8 = strGenericHeap0.size();
        strGenericHeap0.add("");
        boolean boolean11 = strGenericHeap0.isEmpty();
        java.lang.String str12 = strGenericHeap0.remove();
        strGenericHeap0.add("");
        boolean boolean15 = strGenericHeap0.isEmpty();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test6101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6101");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        strGenericHeap0.add("hi!");
        boolean boolean10 = strGenericHeap0.isEmpty();
        strGenericHeap0.updatePriority("hi!");
        strGenericHeap0.updatePriority("");
        strGenericHeap0.display();
        strGenericHeap0.add("");
        int int18 = strGenericHeap0.size();
        java.lang.Class<?> wildcardClass19 = strGenericHeap0.getClass();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test6102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6102");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        java.lang.String str8 = strGenericHeap0.get();
        boolean boolean9 = strGenericHeap0.isEmpty();
        int int10 = strGenericHeap0.size();
        java.lang.String str11 = strGenericHeap0.get();
        java.lang.String str12 = strGenericHeap0.get();
        strGenericHeap0.display();
        strGenericHeap0.display();
        java.lang.Class<?> wildcardClass15 = strGenericHeap0.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test6103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6103");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        strGenericHeap0.add("hi!");
        strGenericHeap0.updatePriority("hi!");
        java.lang.String str12 = strGenericHeap0.get();
        strGenericHeap0.display();
        int int14 = strGenericHeap0.size();
        boolean boolean15 = strGenericHeap0.isEmpty();
        strGenericHeap0.display();
        java.lang.String str17 = strGenericHeap0.get();
        int int18 = strGenericHeap0.size();
        int int19 = strGenericHeap0.size();
        strGenericHeap0.display();
        strGenericHeap0.add("hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
    }

    @Test
    public void test6104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6104");
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
        strGenericHeap0.updatePriority("");
        int int17 = strGenericHeap0.size();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
    }

    @Test
    public void test6105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6105");
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
        java.lang.String str17 = strGenericHeap0.get();
        strGenericHeap0.updatePriority("hi!");
        int int20 = strGenericHeap0.size();
        strGenericHeap0.display();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
    }

    @Test
    public void test6106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6106");
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
        java.lang.String str20 = strGenericHeap0.get();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test6107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6107");
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
        java.lang.String str17 = strGenericHeap0.remove();
        java.lang.String str18 = strGenericHeap0.get();
        java.lang.String str19 = strGenericHeap0.remove();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test6108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6108");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        java.lang.String str4 = strGenericHeap0.get();
        boolean boolean5 = strGenericHeap0.isEmpty();
        java.lang.String str6 = strGenericHeap0.remove();
        strGenericHeap0.add("");
        boolean boolean9 = strGenericHeap0.isEmpty();
        java.lang.String str10 = strGenericHeap0.get();
        java.lang.Class<?> wildcardClass11 = strGenericHeap0.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test6109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6109");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.add("hi!");
        int int6 = strGenericHeap0.size();
        strGenericHeap0.updatePriority("hi!");
        java.lang.String str9 = strGenericHeap0.remove();
        strGenericHeap0.add("hi!");
        int int12 = strGenericHeap0.size();
        strGenericHeap0.add("");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
    }

    @Test
    public void test6110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6110");
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
        strGenericHeap0.add("");
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        boolean boolean22 = strGenericHeap0.isEmpty();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test6111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6111");
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
        strGenericHeap0.add("hi!");
        java.lang.String str20 = strGenericHeap0.get();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test6112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6112");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        java.lang.String str4 = strGenericHeap0.get();
        boolean boolean5 = strGenericHeap0.isEmpty();
        java.lang.String str6 = strGenericHeap0.get();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.updatePriority("");
        strGenericHeap0.display();
        strGenericHeap0.add("hi!");
        strGenericHeap0.add("");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test6113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6113");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        strGenericHeap0.updatePriority("");
        int int10 = strGenericHeap0.size();
        strGenericHeap0.add("");
        java.lang.Class<?> wildcardClass13 = strGenericHeap0.getClass();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test6114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6114");
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
        boolean boolean24 = strGenericHeap0.isEmpty();
        boolean boolean25 = strGenericHeap0.isEmpty();
        java.lang.String str26 = strGenericHeap0.remove();
        boolean boolean27 = strGenericHeap0.isEmpty();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test6115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6115");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        int int3 = strGenericHeap0.size();
        strGenericHeap0.display();
        boolean boolean5 = strGenericHeap0.isEmpty();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.add("hi!");
        java.lang.String str11 = strGenericHeap0.remove();
        boolean boolean12 = strGenericHeap0.isEmpty();
        boolean boolean13 = strGenericHeap0.isEmpty();
        int int14 = strGenericHeap0.size();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
    }

    @Test
    public void test6116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6116");
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
        strGenericHeap0.display();
        strGenericHeap0.display();
        strGenericHeap0.display();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test6117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6117");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        java.lang.String str4 = strGenericHeap0.get();
        boolean boolean5 = strGenericHeap0.isEmpty();
        boolean boolean6 = strGenericHeap0.isEmpty();
        strGenericHeap0.add("hi!");
        strGenericHeap0.updatePriority("hi!");
        java.lang.String str11 = strGenericHeap0.remove();
        java.lang.Class<?> wildcardClass12 = strGenericHeap0.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test6118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6118");
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
        strGenericHeap0.add("hi!");
        strGenericHeap0.updatePriority("hi!");
        java.lang.String str22 = strGenericHeap0.remove();
        strGenericHeap0.add("hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test6119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6119");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        boolean boolean4 = strGenericHeap0.isEmpty();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("hi!");
        boolean boolean9 = strGenericHeap0.isEmpty();
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("hi!");
        strGenericHeap0.display();
        java.lang.String str18 = strGenericHeap0.remove();
        strGenericHeap0.updatePriority("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test6120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6120");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        java.lang.String str8 = strGenericHeap0.remove();
        strGenericHeap0.display();
        java.lang.String str10 = strGenericHeap0.remove();
        boolean boolean11 = strGenericHeap0.isEmpty();
        strGenericHeap0.add("hi!");
        strGenericHeap0.updatePriority("hi!");
        strGenericHeap0.updatePriority("hi!");
        int int18 = strGenericHeap0.size();
        int int19 = strGenericHeap0.size();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test6121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6121");
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
        java.lang.String str15 = strGenericHeap0.get();
        java.lang.String str16 = strGenericHeap0.get();
        boolean boolean17 = strGenericHeap0.isEmpty();
        strGenericHeap0.add("hi!");
        strGenericHeap0.add("hi!");
        strGenericHeap0.updatePriority("hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test6122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6122");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.display();
        int int2 = strGenericHeap0.size();
        strGenericHeap0.display();
        strGenericHeap0.display();
        strGenericHeap0.display();
        boolean boolean6 = strGenericHeap0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = strGenericHeap0.get();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test6123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6123");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        java.lang.String str4 = strGenericHeap0.get();
        java.lang.String str5 = strGenericHeap0.get();
        int int6 = strGenericHeap0.size();
        strGenericHeap0.display();
        strGenericHeap0.add("");
        int int10 = strGenericHeap0.size();
        java.lang.String str11 = strGenericHeap0.remove();
        java.lang.Class<?> wildcardClass12 = strGenericHeap0.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test6124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6124");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        java.lang.String str8 = strGenericHeap0.get();
        boolean boolean9 = strGenericHeap0.isEmpty();
        java.lang.String str10 = strGenericHeap0.get();
        strGenericHeap0.display();
        boolean boolean12 = strGenericHeap0.isEmpty();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test6125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6125");
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
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        java.lang.String str22 = strGenericHeap0.get();
        int int23 = strGenericHeap0.size();
        boolean boolean24 = strGenericHeap0.isEmpty();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 4 + "'", int23 == 4);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test6126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6126");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        int int1 = strGenericHeap0.size();
        int int2 = strGenericHeap0.size();
        strGenericHeap0.add("");
        int int5 = strGenericHeap0.size();
        strGenericHeap0.add("hi!");
        int int8 = strGenericHeap0.size();
        strGenericHeap0.updatePriority("hi!");
        strGenericHeap0.updatePriority("");
        java.lang.Class<?> wildcardClass13 = strGenericHeap0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test6127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6127");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.add("hi!");
        strGenericHeap0.display();
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("hi!");
        strGenericHeap0.add("hi!");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("hi!");
    }

    @Test
    public void test6128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6128");
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
        int int20 = strGenericHeap0.size();
        strGenericHeap0.updatePriority("");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 5 + "'", int20 == 5);
    }

    @Test
    public void test6129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6129");
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
        java.lang.String str13 = strGenericHeap0.remove();
        strGenericHeap0.display();
        strGenericHeap0.display();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test6130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6130");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        java.lang.String str8 = strGenericHeap0.get();
        boolean boolean9 = strGenericHeap0.isEmpty();
        int int10 = strGenericHeap0.size();
        java.lang.String str11 = strGenericHeap0.remove();
        java.lang.String str12 = strGenericHeap0.remove();
        strGenericHeap0.add("");
        boolean boolean15 = strGenericHeap0.isEmpty();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test6131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6131");
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
        int int17 = strGenericHeap0.size();
        int int18 = strGenericHeap0.size();
        strGenericHeap0.add("hi!");
        java.lang.String str21 = strGenericHeap0.get();
        java.lang.String str22 = strGenericHeap0.get();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test6132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6132");
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
        strGenericHeap0.add("hi!");
        strGenericHeap0.updatePriority("");
        java.lang.String str21 = strGenericHeap0.get();
        boolean boolean22 = strGenericHeap0.isEmpty();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test6133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6133");
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
        int int23 = strGenericHeap0.size();
        strGenericHeap0.display();
        java.lang.Class<?> wildcardClass25 = strGenericHeap0.getClass();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 6 + "'", int23 == 6);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test6134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6134");
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
        boolean boolean18 = strGenericHeap0.isEmpty();
        strGenericHeap0.updatePriority("hi!");
        boolean boolean21 = strGenericHeap0.isEmpty();
        int int22 = strGenericHeap0.size();
        java.lang.String str23 = strGenericHeap0.get();
        java.lang.String str24 = strGenericHeap0.get();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
    }

    @Test
    public void test6135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6135");
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
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        java.lang.String str23 = strGenericHeap0.get();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
    }

    @Test
    public void test6136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6136");
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
        strGenericHeap0.display();
        int int16 = strGenericHeap0.size();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test6137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6137");
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
        strGenericHeap0.display();
        boolean boolean17 = strGenericHeap0.isEmpty();
        java.lang.String str18 = strGenericHeap0.remove();
        java.lang.String str19 = strGenericHeap0.get();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test6138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6138");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        java.lang.String str8 = strGenericHeap0.remove();
        java.lang.String str9 = strGenericHeap0.get();
        boolean boolean10 = strGenericHeap0.isEmpty();
        strGenericHeap0.add("");
        java.lang.String str13 = strGenericHeap0.get();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test6139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6139");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.add("hi!");
        strGenericHeap0.display();
        strGenericHeap0.display();
        boolean boolean8 = strGenericHeap0.isEmpty();
        java.lang.String str9 = strGenericHeap0.get();
        boolean boolean10 = strGenericHeap0.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test6140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6140");
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
        strGenericHeap0.display();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test6141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6141");
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
        strGenericHeap0.add("hi!");
        int int15 = strGenericHeap0.size();
        java.lang.String str16 = strGenericHeap0.get();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test6142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6142");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.display();
    }

    @Test
    public void test6143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6143");
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
        java.lang.String str22 = strGenericHeap0.get();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test6144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6144");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        int int6 = strGenericHeap0.size();
        java.lang.String str7 = strGenericHeap0.get();
        int int8 = strGenericHeap0.size();
        java.lang.String str9 = strGenericHeap0.get();
        java.lang.String str10 = strGenericHeap0.get();
        java.lang.String str11 = strGenericHeap0.remove();
        int int12 = strGenericHeap0.size();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test6145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6145");
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
        java.lang.String str14 = strGenericHeap0.remove();
        strGenericHeap0.add("hi!");
        int int17 = strGenericHeap0.size();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test6146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6146");
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
        java.lang.String str19 = strGenericHeap0.get();
        boolean boolean20 = strGenericHeap0.isEmpty();
        strGenericHeap0.display();
        strGenericHeap0.display();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test6147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6147");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        java.lang.String str4 = strGenericHeap0.get();
        strGenericHeap0.add("");
        java.lang.String str7 = strGenericHeap0.remove();
        boolean boolean8 = strGenericHeap0.isEmpty();
        java.lang.String str9 = strGenericHeap0.get();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test6148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6148");
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
        strGenericHeap0.updatePriority("hi!");
        strGenericHeap0.add("");
        java.lang.String str23 = strGenericHeap0.remove();
        java.lang.String str24 = strGenericHeap0.remove();
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test6149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6149");
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
        boolean boolean14 = strGenericHeap0.isEmpty();
        strGenericHeap0.updatePriority("");
        java.lang.String str17 = strGenericHeap0.remove();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test6150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6150");
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
        java.lang.String str15 = strGenericHeap0.get();
        boolean boolean16 = strGenericHeap0.isEmpty();
        int int17 = strGenericHeap0.size();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
    }

    @Test
    public void test6151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6151");
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
        java.lang.String str19 = strGenericHeap0.get();
        strGenericHeap0.add("");
        int int22 = strGenericHeap0.size();
        strGenericHeap0.add("hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 4 + "'", int22 == 4);
    }

    @Test
    public void test6152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6152");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        strGenericHeap0.add("hi!");
        boolean boolean10 = strGenericHeap0.isEmpty();
        strGenericHeap0.updatePriority("");
        java.lang.String str13 = strGenericHeap0.get();
        strGenericHeap0.display();
        java.lang.String str15 = strGenericHeap0.get();
        java.lang.String str16 = strGenericHeap0.remove();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test6153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6153");
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
        strGenericHeap0.add("");
        strGenericHeap0.add("");
        java.lang.String str20 = strGenericHeap0.remove();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test6154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6154");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        int int1 = strGenericHeap0.size();
        int int2 = strGenericHeap0.size();
        boolean boolean3 = strGenericHeap0.isEmpty();
        strGenericHeap0.add("hi!");
        boolean boolean6 = strGenericHeap0.isEmpty();
        java.lang.String str7 = strGenericHeap0.get();
        int int8 = strGenericHeap0.size();
        java.lang.String str9 = strGenericHeap0.get();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test6155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6155");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        int int1 = strGenericHeap0.size();
        int int2 = strGenericHeap0.size();
        boolean boolean3 = strGenericHeap0.isEmpty();
        strGenericHeap0.add("hi!");
        boolean boolean6 = strGenericHeap0.isEmpty();
        strGenericHeap0.add("hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test6156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6156");
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
        int int16 = strGenericHeap0.size();
        strGenericHeap0.add("");
        boolean boolean19 = strGenericHeap0.isEmpty();
        strGenericHeap0.updatePriority("");
        boolean boolean22 = strGenericHeap0.isEmpty();
        java.lang.String str23 = strGenericHeap0.remove();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
    }

    @Test
    public void test6157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6157");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        java.lang.String str6 = strGenericHeap0.remove();
        boolean boolean7 = strGenericHeap0.isEmpty();
        java.lang.Class<?> wildcardClass8 = strGenericHeap0.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test6158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6158");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        java.lang.String str4 = strGenericHeap0.get();
        boolean boolean5 = strGenericHeap0.isEmpty();
        java.lang.String str6 = strGenericHeap0.remove();
        strGenericHeap0.add("");
        boolean boolean9 = strGenericHeap0.isEmpty();
        boolean boolean10 = strGenericHeap0.isEmpty();
        boolean boolean11 = strGenericHeap0.isEmpty();
        int int12 = strGenericHeap0.size();
        boolean boolean13 = strGenericHeap0.isEmpty();
        int int14 = strGenericHeap0.size();
        java.lang.String str15 = strGenericHeap0.get();
        strGenericHeap0.display();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test6159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6159");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        int int6 = strGenericHeap0.size();
        java.lang.String str7 = strGenericHeap0.get();
        strGenericHeap0.updatePriority("");
        java.lang.String str10 = strGenericHeap0.get();
        boolean boolean11 = strGenericHeap0.isEmpty();
        strGenericHeap0.display();
        java.lang.String str13 = strGenericHeap0.get();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        boolean boolean17 = strGenericHeap0.isEmpty();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test6160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6160");
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
        strGenericHeap0.display();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test6161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6161");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        java.lang.String str4 = strGenericHeap0.get();
        boolean boolean5 = strGenericHeap0.isEmpty();
        strGenericHeap0.add("hi!");
        strGenericHeap0.updatePriority("hi!");
        strGenericHeap0.add("hi!");
        boolean boolean12 = strGenericHeap0.isEmpty();
        java.lang.Class<?> wildcardClass13 = strGenericHeap0.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test6162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6162");
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
        java.lang.String str17 = strGenericHeap0.remove();
        strGenericHeap0.add("");
        java.lang.String str20 = strGenericHeap0.get();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test6163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6163");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        java.lang.String str8 = strGenericHeap0.remove();
        strGenericHeap0.add("hi!");
        strGenericHeap0.updatePriority("");
        int int13 = strGenericHeap0.size();
        java.lang.String str14 = strGenericHeap0.get();
        strGenericHeap0.add("");
        java.lang.Class<?> wildcardClass17 = strGenericHeap0.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test6164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6164");
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
        java.lang.Class<?> wildcardClass18 = strGenericHeap0.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test6165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6165");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        int int1 = strGenericHeap0.size();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        boolean boolean5 = strGenericHeap0.isEmpty();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        boolean boolean10 = strGenericHeap0.isEmpty();
        strGenericHeap0.display();
        java.lang.String str12 = strGenericHeap0.get();
        strGenericHeap0.add("");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test6166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6166");
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
        int int13 = strGenericHeap0.size();
        java.lang.String str14 = strGenericHeap0.get();
        strGenericHeap0.add("hi!");
        strGenericHeap0.add("hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test6167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6167");
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
        strGenericHeap0.add("hi!");
        int int17 = strGenericHeap0.size();
        java.lang.Class<?> wildcardClass18 = strGenericHeap0.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test6168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6168");
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
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        java.lang.String str26 = strGenericHeap0.remove();
        boolean boolean27 = strGenericHeap0.isEmpty();
        boolean boolean28 = strGenericHeap0.isEmpty();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test6169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6169");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        java.lang.String str8 = strGenericHeap0.remove();
        strGenericHeap0.display();
        int int10 = strGenericHeap0.size();
        java.lang.String str11 = strGenericHeap0.get();
        java.lang.String str12 = strGenericHeap0.get();
        boolean boolean13 = strGenericHeap0.isEmpty();
        strGenericHeap0.add("hi!");
        int int16 = strGenericHeap0.size();
        strGenericHeap0.add("hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
    }

    @Test
    public void test6170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6170");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        boolean boolean4 = strGenericHeap0.isEmpty();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("hi!");
        boolean boolean9 = strGenericHeap0.isEmpty();
        java.lang.String str10 = strGenericHeap0.remove();
        java.lang.String str11 = strGenericHeap0.remove();
        int int12 = strGenericHeap0.size();
        strGenericHeap0.add("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test6171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6171");
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
        java.lang.String str20 = strGenericHeap0.remove();
        java.lang.Class<?> wildcardClass21 = strGenericHeap0.getClass();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test6172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6172");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        strGenericHeap0.add("hi!");
        int int10 = strGenericHeap0.size();
        strGenericHeap0.add("hi!");
        strGenericHeap0.updatePriority("");
        java.lang.String str15 = strGenericHeap0.remove();
        strGenericHeap0.display();
        strGenericHeap0.display();
        java.lang.Class<?> wildcardClass18 = strGenericHeap0.getClass();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test6173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6173");
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
        strGenericHeap0.add("");
        strGenericHeap0.display();
        boolean boolean17 = strGenericHeap0.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test6174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6174");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        java.lang.String str8 = strGenericHeap0.get();
        boolean boolean9 = strGenericHeap0.isEmpty();
        java.lang.String str10 = strGenericHeap0.get();
        int int11 = strGenericHeap0.size();
        strGenericHeap0.display();
        java.lang.String str13 = strGenericHeap0.remove();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test6175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6175");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        int int6 = strGenericHeap0.size();
        java.lang.String str7 = strGenericHeap0.get();
        strGenericHeap0.add("hi!");
        strGenericHeap0.updatePriority("hi!");
        strGenericHeap0.updatePriority("hi!");
        java.lang.String str14 = strGenericHeap0.get();
        strGenericHeap0.updatePriority("");
        java.lang.String str17 = strGenericHeap0.remove();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test6176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6176");
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
        strGenericHeap0.display();
        java.lang.String str25 = strGenericHeap0.get();
        boolean boolean26 = strGenericHeap0.isEmpty();
        strGenericHeap0.display();
        strGenericHeap0.add("hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test6177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6177");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        int int8 = strGenericHeap0.size();
        strGenericHeap0.add("");
        strGenericHeap0.add("");
        int int13 = strGenericHeap0.size();
        strGenericHeap0.display();
        int int15 = strGenericHeap0.size();
        java.lang.String str16 = strGenericHeap0.remove();
        strGenericHeap0.display();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test6178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6178");
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
        java.lang.String str14 = strGenericHeap0.get();
        boolean boolean15 = strGenericHeap0.isEmpty();
        strGenericHeap0.add("");
        strGenericHeap0.add("");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test6179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6179");
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
        java.lang.String str19 = strGenericHeap0.get();
        strGenericHeap0.add("");
        int int22 = strGenericHeap0.size();
        strGenericHeap0.add("");
        boolean boolean25 = strGenericHeap0.isEmpty();
        java.lang.Class<?> wildcardClass26 = strGenericHeap0.getClass();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 4 + "'", int22 == 4);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test6180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6180");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        java.lang.String str4 = strGenericHeap0.get();
        boolean boolean5 = strGenericHeap0.isEmpty();
        boolean boolean6 = strGenericHeap0.isEmpty();
        int int7 = strGenericHeap0.size();
        java.lang.String str8 = strGenericHeap0.remove();
        java.lang.Class<?> wildcardClass9 = strGenericHeap0.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test6181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6181");
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
        strGenericHeap0.display();
        strGenericHeap0.display();
        strGenericHeap0.add("");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test6182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6182");
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
        strGenericHeap0.add("");
        int int16 = strGenericHeap0.size();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
    }

    @Test
    public void test6183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6183");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        java.lang.String str4 = strGenericHeap0.get();
        int int5 = strGenericHeap0.size();
        boolean boolean6 = strGenericHeap0.isEmpty();
        java.lang.String str7 = strGenericHeap0.get();
        java.lang.String str8 = strGenericHeap0.get();
        boolean boolean9 = strGenericHeap0.isEmpty();
        java.lang.String str10 = strGenericHeap0.get();
        int int11 = strGenericHeap0.size();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test6184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6184");
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
        strGenericHeap0.add("");
        strGenericHeap0.display();
        java.lang.String str20 = strGenericHeap0.get();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test6185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6185");
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
        strGenericHeap0.display();
        boolean boolean21 = strGenericHeap0.isEmpty();
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test6186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6186");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        int int8 = strGenericHeap0.size();
        strGenericHeap0.add("");
        strGenericHeap0.add("");
        int int13 = strGenericHeap0.size();
        strGenericHeap0.display();
        int int15 = strGenericHeap0.size();
        java.lang.Class<?> wildcardClass16 = strGenericHeap0.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test6187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6187");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        int int8 = strGenericHeap0.size();
        strGenericHeap0.updatePriority("");
        int int11 = strGenericHeap0.size();
        java.lang.String str12 = strGenericHeap0.get();
        strGenericHeap0.add("hi!");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test6188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6188");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        boolean boolean4 = strGenericHeap0.isEmpty();
        strGenericHeap0.updatePriority("");
        boolean boolean7 = strGenericHeap0.isEmpty();
        boolean boolean8 = strGenericHeap0.isEmpty();
        strGenericHeap0.add("hi!");
        strGenericHeap0.add("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test6189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6189");
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
        int int20 = strGenericHeap0.size();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
    }

    @Test
    public void test6190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6190");
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
        java.lang.String str16 = strGenericHeap0.remove();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test6191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6191");
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
        int int14 = strGenericHeap0.size();
        int int15 = strGenericHeap0.size();
        int int16 = strGenericHeap0.size();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test6192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6192");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        int int6 = strGenericHeap0.size();
        java.lang.String str7 = strGenericHeap0.get();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.display();
        strGenericHeap0.add("hi!");
        strGenericHeap0.add("");
        strGenericHeap0.add("");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test6193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6193");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        strGenericHeap0.add("hi!");
        java.lang.String str10 = strGenericHeap0.get();
        java.lang.String str11 = strGenericHeap0.get();
        strGenericHeap0.add("");
        boolean boolean14 = strGenericHeap0.isEmpty();
        strGenericHeap0.display();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test6194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6194");
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
        int int17 = strGenericHeap0.size();
        strGenericHeap0.add("");
        strGenericHeap0.updatePriority("");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
    }

    @Test
    public void test6195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6195");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        java.lang.String str6 = strGenericHeap0.get();
        boolean boolean7 = strGenericHeap0.isEmpty();
        strGenericHeap0.display();
        java.lang.String str9 = strGenericHeap0.remove();
        strGenericHeap0.add("hi!");
        boolean boolean12 = strGenericHeap0.isEmpty();
        int int13 = strGenericHeap0.size();
        int int14 = strGenericHeap0.size();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test6196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6196");
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
        int int16 = strGenericHeap0.size();
        strGenericHeap0.display();
        int int18 = strGenericHeap0.size();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
    }

    @Test
    public void test6197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6197");
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
        java.lang.String str18 = strGenericHeap0.remove();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test6198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6198");
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
        java.lang.String str13 = strGenericHeap0.remove();
        int int14 = strGenericHeap0.size();
        boolean boolean15 = strGenericHeap0.isEmpty();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test6199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6199");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        strGenericHeap0.add("hi!");
        int int10 = strGenericHeap0.size();
        strGenericHeap0.add("hi!");
        boolean boolean13 = strGenericHeap0.isEmpty();
        int int14 = strGenericHeap0.size();
        strGenericHeap0.add("hi!");
        strGenericHeap0.display();
        java.lang.String str18 = strGenericHeap0.remove();
        java.lang.String str19 = strGenericHeap0.get();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test6200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6200");
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
        boolean boolean16 = strGenericHeap0.isEmpty();
        strGenericHeap0.display();
        boolean boolean18 = strGenericHeap0.isEmpty();
        int int19 = strGenericHeap0.size();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
    }

    @Test
    public void test6201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6201");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        java.lang.String str4 = strGenericHeap0.get();
        int int5 = strGenericHeap0.size();
        boolean boolean6 = strGenericHeap0.isEmpty();
        java.lang.String str7 = strGenericHeap0.get();
        strGenericHeap0.display();
        boolean boolean9 = strGenericHeap0.isEmpty();
        java.lang.String str10 = strGenericHeap0.get();
        boolean boolean11 = strGenericHeap0.isEmpty();
        java.lang.String str12 = strGenericHeap0.remove();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test6202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6202");
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
        strGenericHeap0.add("");
        strGenericHeap0.add("hi!");
        strGenericHeap0.updatePriority("hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test6203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6203");
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
        boolean boolean14 = strGenericHeap0.isEmpty();
        boolean boolean15 = strGenericHeap0.isEmpty();
        int int16 = strGenericHeap0.size();
        boolean boolean17 = strGenericHeap0.isEmpty();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test6204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6204");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        int int1 = strGenericHeap0.size();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        boolean boolean5 = strGenericHeap0.isEmpty();
        strGenericHeap0.updatePriority("");
        int int8 = strGenericHeap0.size();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test6205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6205");
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
        java.lang.String str14 = strGenericHeap0.get();
        java.lang.String str15 = strGenericHeap0.get();
        strGenericHeap0.updatePriority("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test6206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6206");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        java.lang.String str8 = strGenericHeap0.get();
        boolean boolean9 = strGenericHeap0.isEmpty();
        int int10 = strGenericHeap0.size();
        strGenericHeap0.add("");
        java.lang.String str13 = strGenericHeap0.get();
        int int14 = strGenericHeap0.size();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.display();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
    }

    @Test
    public void test6207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6207");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        int int1 = strGenericHeap0.size();
        int int2 = strGenericHeap0.size();
        boolean boolean3 = strGenericHeap0.isEmpty();
        strGenericHeap0.add("hi!");
        boolean boolean6 = strGenericHeap0.isEmpty();
        boolean boolean7 = strGenericHeap0.isEmpty();
        strGenericHeap0.add("hi!");
        java.lang.String str10 = strGenericHeap0.remove();
        strGenericHeap0.display();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test6208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6208");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.add("hi!");
        java.lang.String str11 = strGenericHeap0.get();
        java.lang.String str12 = strGenericHeap0.get();
        strGenericHeap0.updatePriority("hi!");
        java.lang.String str15 = strGenericHeap0.remove();
        int int16 = strGenericHeap0.size();
        int int17 = strGenericHeap0.size();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
    }

    @Test
    public void test6209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6209");
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
        boolean boolean16 = strGenericHeap0.isEmpty();
        boolean boolean17 = strGenericHeap0.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test6210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6210");
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
        java.lang.String str14 = strGenericHeap0.get();
        boolean boolean15 = strGenericHeap0.isEmpty();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test6211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6211");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        java.lang.String str4 = strGenericHeap0.get();
        java.lang.String str5 = strGenericHeap0.get();
        java.lang.String str6 = strGenericHeap0.get();
        java.lang.String str7 = strGenericHeap0.get();
        strGenericHeap0.add("");
        strGenericHeap0.add("");
        strGenericHeap0.updatePriority("");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test6212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6212");
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
        strGenericHeap0.updatePriority("");
        strGenericHeap0.display();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test6213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6213");
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
        java.lang.String str19 = strGenericHeap0.get();
        strGenericHeap0.add("hi!");
        java.lang.String str22 = strGenericHeap0.remove();
        boolean boolean23 = strGenericHeap0.isEmpty();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test6214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6214");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        java.lang.String str8 = strGenericHeap0.remove();
        java.lang.String str9 = strGenericHeap0.get();
        boolean boolean10 = strGenericHeap0.isEmpty();
        int int11 = strGenericHeap0.size();
        strGenericHeap0.add("");
        java.lang.String str14 = strGenericHeap0.remove();
        java.lang.Class<?> wildcardClass15 = strGenericHeap0.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test6215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6215");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.add("hi!");
        java.lang.String str6 = strGenericHeap0.get();
        strGenericHeap0.display();
        java.lang.String str8 = strGenericHeap0.get();
        int int9 = strGenericHeap0.size();
        strGenericHeap0.updatePriority("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
    }

    @Test
    public void test6216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6216");
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
        strGenericHeap0.updatePriority("hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test6217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6217");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        strGenericHeap0.updatePriority("");
        strGenericHeap0.display();
        java.lang.String str11 = strGenericHeap0.get();
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.display();
        strGenericHeap0.add("");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test6218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6218");
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
        java.lang.String str15 = strGenericHeap0.get();
        int int16 = strGenericHeap0.size();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
    }

    @Test
    public void test6219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6219");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        int int3 = strGenericHeap0.size();
        strGenericHeap0.display();
        boolean boolean5 = strGenericHeap0.isEmpty();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        int int11 = strGenericHeap0.size();
        strGenericHeap0.display();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
    }

    @Test
    public void test6220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6220");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        java.lang.String str8 = strGenericHeap0.get();
        boolean boolean9 = strGenericHeap0.isEmpty();
        int int10 = strGenericHeap0.size();
        strGenericHeap0.display();
        strGenericHeap0.display();
        java.lang.String str13 = strGenericHeap0.get();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.display();
        int int17 = strGenericHeap0.size();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
    }

    @Test
    public void test6221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6221");
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
        strGenericHeap0.add("");
        strGenericHeap0.add("");
        boolean boolean20 = strGenericHeap0.isEmpty();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test6222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6222");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        java.lang.String str8 = strGenericHeap0.remove();
        strGenericHeap0.display();
        int int10 = strGenericHeap0.size();
        strGenericHeap0.display();
        strGenericHeap0.display();
        java.lang.String str13 = strGenericHeap0.remove();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test6223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6223");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        int int3 = strGenericHeap0.size();
        strGenericHeap0.display();
        strGenericHeap0.add("hi!");
        boolean boolean7 = strGenericHeap0.isEmpty();
        strGenericHeap0.add("hi!");
        strGenericHeap0.add("");
        java.lang.String str12 = strGenericHeap0.remove();
        strGenericHeap0.display();
        java.lang.String str14 = strGenericHeap0.get();
        int int15 = strGenericHeap0.size();
        boolean boolean16 = strGenericHeap0.isEmpty();
        int int17 = strGenericHeap0.size();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
    }

    @Test
    public void test6224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6224");
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
        java.lang.String str23 = strGenericHeap0.remove();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test6225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6225");
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
        int int16 = strGenericHeap0.size();
        java.lang.String str17 = strGenericHeap0.remove();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test6226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6226");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        java.lang.String str4 = strGenericHeap0.get();
        boolean boolean5 = strGenericHeap0.isEmpty();
        strGenericHeap0.add("hi!");
        strGenericHeap0.updatePriority("hi!");
        strGenericHeap0.add("hi!");
        boolean boolean12 = strGenericHeap0.isEmpty();
        java.lang.String str13 = strGenericHeap0.remove();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test6227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6227");
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
        strGenericHeap0.add("hi!");
        java.lang.String str17 = strGenericHeap0.remove();
        strGenericHeap0.updatePriority("");
        java.lang.String str20 = strGenericHeap0.get();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test6228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6228");
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
        strGenericHeap0.display();
        boolean boolean16 = strGenericHeap0.isEmpty();
        boolean boolean17 = strGenericHeap0.isEmpty();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test6229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6229");
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
        strGenericHeap0.add("hi!");
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        strGenericHeap0.display();
        java.lang.Class<?> wildcardClass22 = strGenericHeap0.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test6230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6230");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        int int6 = strGenericHeap0.size();
        java.lang.String str7 = strGenericHeap0.get();
        strGenericHeap0.add("hi!");
        strGenericHeap0.display();
        boolean boolean11 = strGenericHeap0.isEmpty();
        java.lang.String str12 = strGenericHeap0.remove();
        java.lang.String str13 = strGenericHeap0.remove();
        java.lang.Class<?> wildcardClass14 = strGenericHeap0.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test6231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6231");
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
        boolean boolean14 = strGenericHeap0.isEmpty();
        strGenericHeap0.display();
        strGenericHeap0.display();
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test6232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6232");
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
        strGenericHeap0.updatePriority("hi!");
        java.lang.String str21 = strGenericHeap0.remove();
        int int22 = strGenericHeap0.size();
        strGenericHeap0.add("hi!");
        int int25 = strGenericHeap0.size();
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2 + "'", int25 == 2);
    }

    @Test
    public void test6233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6233");
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
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("hi!");
        int int24 = strGenericHeap0.size();
        strGenericHeap0.updatePriority("");
        boolean boolean27 = strGenericHeap0.isEmpty();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test6234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6234");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        int int3 = strGenericHeap0.size();
        strGenericHeap0.display();
        int int5 = strGenericHeap0.size();
        int int6 = strGenericHeap0.size();
        int int7 = strGenericHeap0.size();
        strGenericHeap0.display();
        java.lang.Class<?> wildcardClass9 = strGenericHeap0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test6235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6235");
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
        int int18 = strGenericHeap0.size();
        int int19 = strGenericHeap0.size();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
    }

    @Test
    public void test6236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6236");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        strGenericHeap0.add("hi!");
        int int10 = strGenericHeap0.size();
        strGenericHeap0.add("hi!");
        strGenericHeap0.updatePriority("");
        java.lang.String str15 = strGenericHeap0.remove();
        java.lang.String str16 = strGenericHeap0.get();
        boolean boolean17 = strGenericHeap0.isEmpty();
        java.lang.String str18 = strGenericHeap0.remove();
        strGenericHeap0.display();
        java.lang.String str20 = strGenericHeap0.remove();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test6237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6237");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        java.lang.String str4 = strGenericHeap0.get();
        strGenericHeap0.add("");
        strGenericHeap0.add("hi!");
        java.lang.String str9 = strGenericHeap0.remove();
        boolean boolean10 = strGenericHeap0.isEmpty();
        strGenericHeap0.add("hi!");
        java.lang.String str13 = strGenericHeap0.remove();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test6238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6238");
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
        java.lang.String str15 = strGenericHeap0.remove();
        java.lang.Class<?> wildcardClass16 = strGenericHeap0.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test6239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6239");
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
        strGenericHeap0.display();
        boolean boolean21 = strGenericHeap0.isEmpty();
        strGenericHeap0.add("");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test6240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6240");
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
        java.lang.String str18 = strGenericHeap0.get();
        java.lang.String str19 = strGenericHeap0.get();
        int int20 = strGenericHeap0.size();
        int int21 = strGenericHeap0.size();
        java.lang.String str22 = strGenericHeap0.remove();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test6241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6241");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        java.lang.String str4 = strGenericHeap0.get();
        strGenericHeap0.add("");
        strGenericHeap0.add("hi!");
        strGenericHeap0.updatePriority("");
        int int11 = strGenericHeap0.size();
        strGenericHeap0.updatePriority("hi!");
        strGenericHeap0.updatePriority("");
        java.lang.String str16 = strGenericHeap0.remove();
        strGenericHeap0.add("");
        strGenericHeap0.add("hi!");
        java.lang.String str21 = strGenericHeap0.remove();
        int int22 = strGenericHeap0.size();
        strGenericHeap0.add("hi!");
        boolean boolean25 = strGenericHeap0.isEmpty();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test6242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6242");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        strGenericHeap0.add("hi!");
        boolean boolean10 = strGenericHeap0.isEmpty();
        strGenericHeap0.add("hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test6243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6243");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        java.lang.String str4 = strGenericHeap0.get();
        java.lang.String str5 = strGenericHeap0.get();
        int int6 = strGenericHeap0.size();
        strGenericHeap0.display();
        strGenericHeap0.add("");
        int int10 = strGenericHeap0.size();
        strGenericHeap0.add("hi!");
        strGenericHeap0.add("");
        java.lang.String str15 = strGenericHeap0.remove();
        java.lang.String str16 = strGenericHeap0.get();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test6244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6244");
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
        java.lang.Class<?> wildcardClass21 = strGenericHeap0.getClass();
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test6245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6245");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        java.lang.String str8 = strGenericHeap0.remove();
        strGenericHeap0.add("hi!");
        strGenericHeap0.display();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        java.lang.String str15 = strGenericHeap0.get();
        java.lang.String str16 = strGenericHeap0.get();
        int int17 = strGenericHeap0.size();
        boolean boolean18 = strGenericHeap0.isEmpty();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test6246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6246");
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
        boolean boolean26 = strGenericHeap0.isEmpty();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test6247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6247");
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
        strGenericHeap0.display();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test6248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6248");
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
        int int23 = strGenericHeap0.size();
        strGenericHeap0.updatePriority("hi!");
        strGenericHeap0.add("");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 6 + "'", int23 == 6);
    }

    @Test
    public void test6249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6249");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.add("hi!");
        strGenericHeap0.display();
        boolean boolean7 = strGenericHeap0.isEmpty();
        java.lang.String str8 = strGenericHeap0.get();
        strGenericHeap0.display();
        strGenericHeap0.display();
        java.lang.String str11 = strGenericHeap0.get();
        java.lang.String str12 = strGenericHeap0.remove();
        java.lang.Class<?> wildcardClass13 = strGenericHeap0.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test6250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6250");
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
        strGenericHeap0.add("hi!");
        strGenericHeap0.display();
        int int22 = strGenericHeap0.size();
        java.lang.String str23 = strGenericHeap0.remove();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
    }

    @Test
    public void test6251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6251");
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
        strGenericHeap0.add("");
        strGenericHeap0.display();
        java.lang.Class<?> wildcardClass19 = strGenericHeap0.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test6252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6252");
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
        strGenericHeap0.add("");
        strGenericHeap0.updatePriority("");
        boolean boolean19 = strGenericHeap0.isEmpty();
        strGenericHeap0.add("hi!");
        java.lang.String str22 = strGenericHeap0.get();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test6253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6253");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        int int3 = strGenericHeap0.size();
        int int4 = strGenericHeap0.size();
        strGenericHeap0.add("hi!");
        strGenericHeap0.updatePriority("");
        java.lang.String str9 = strGenericHeap0.get();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.add("");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test6254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6254");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        int int3 = strGenericHeap0.size();
        strGenericHeap0.display();
        boolean boolean5 = strGenericHeap0.isEmpty();
        boolean boolean6 = strGenericHeap0.isEmpty();
        boolean boolean7 = strGenericHeap0.isEmpty();
        strGenericHeap0.add("");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test6255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6255");
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
        java.lang.String str14 = strGenericHeap0.remove();
        strGenericHeap0.add("hi!");
        java.lang.Class<?> wildcardClass17 = strGenericHeap0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test6256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6256");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        java.lang.String str4 = strGenericHeap0.get();
        java.lang.String str5 = strGenericHeap0.get();
        java.lang.String str6 = strGenericHeap0.remove();
        strGenericHeap0.add("hi!");
        strGenericHeap0.add("");
        int int11 = strGenericHeap0.size();
        strGenericHeap0.display();
        strGenericHeap0.add("");
        java.lang.String str15 = strGenericHeap0.get();
        int int16 = strGenericHeap0.size();
        boolean boolean17 = strGenericHeap0.isEmpty();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test6257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6257");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        java.lang.String str4 = strGenericHeap0.get();
        int int5 = strGenericHeap0.size();
        boolean boolean6 = strGenericHeap0.isEmpty();
        java.lang.String str7 = strGenericHeap0.get();
        strGenericHeap0.display();
        java.lang.String str9 = strGenericHeap0.remove();
        boolean boolean10 = strGenericHeap0.isEmpty();
        strGenericHeap0.add("hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test6258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6258");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        boolean boolean4 = strGenericHeap0.isEmpty();
        strGenericHeap0.updatePriority("");
        boolean boolean7 = strGenericHeap0.isEmpty();
        java.lang.String str8 = strGenericHeap0.remove();
        strGenericHeap0.add("hi!");
        strGenericHeap0.add("");
        int int13 = strGenericHeap0.size();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
    }

    @Test
    public void test6259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6259");
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
        boolean boolean15 = strGenericHeap0.isEmpty();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test6260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6260");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        int int8 = strGenericHeap0.size();
        boolean boolean9 = strGenericHeap0.isEmpty();
        strGenericHeap0.add("hi!");
        boolean boolean12 = strGenericHeap0.isEmpty();
        boolean boolean13 = strGenericHeap0.isEmpty();
        boolean boolean14 = strGenericHeap0.isEmpty();
        strGenericHeap0.add("");
        strGenericHeap0.updatePriority("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test6261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6261");
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
        strGenericHeap0.add("hi!");
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        boolean boolean22 = strGenericHeap0.isEmpty();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test6262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6262");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        java.lang.String str3 = strGenericHeap0.get();
        strGenericHeap0.add("");
        boolean boolean6 = strGenericHeap0.isEmpty();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        int int10 = strGenericHeap0.size();
        java.lang.String str11 = strGenericHeap0.get();
        strGenericHeap0.add("");
        int int14 = strGenericHeap0.size();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
    }

    @Test
    public void test6263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6263");
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
        strGenericHeap0.display();
        strGenericHeap0.display();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test6264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6264");
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
        java.lang.Class<?> wildcardClass18 = strGenericHeap0.getClass();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test6265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6265");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        strGenericHeap0.add("hi!");
        strGenericHeap0.updatePriority("hi!");
        java.lang.String str12 = strGenericHeap0.get();
        strGenericHeap0.display();
        int int14 = strGenericHeap0.size();
        boolean boolean15 = strGenericHeap0.isEmpty();
        strGenericHeap0.display();
        strGenericHeap0.display();
        strGenericHeap0.display();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test6266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6266");
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
        boolean boolean14 = strGenericHeap0.isEmpty();
        java.lang.String str15 = strGenericHeap0.remove();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test6267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6267");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        strGenericHeap0.add("hi!");
        int int10 = strGenericHeap0.size();
        strGenericHeap0.add("hi!");
        boolean boolean13 = strGenericHeap0.isEmpty();
        int int14 = strGenericHeap0.size();
        java.lang.String str15 = strGenericHeap0.get();
        java.lang.String str16 = strGenericHeap0.remove();
        java.lang.String str17 = strGenericHeap0.get();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test6268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6268");
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
        boolean boolean14 = strGenericHeap0.isEmpty();
        strGenericHeap0.add("hi!");
        java.lang.String str17 = strGenericHeap0.remove();
        strGenericHeap0.updatePriority("");
        boolean boolean20 = strGenericHeap0.isEmpty();
        strGenericHeap0.updatePriority("");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test6269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6269");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        int int6 = strGenericHeap0.size();
        java.lang.String str7 = strGenericHeap0.get();
        strGenericHeap0.add("hi!");
        strGenericHeap0.display();
        strGenericHeap0.display();
        strGenericHeap0.add("hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test6270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6270");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        java.lang.String str4 = strGenericHeap0.get();
        boolean boolean5 = strGenericHeap0.isEmpty();
        strGenericHeap0.add("hi!");
        int int8 = strGenericHeap0.size();
        strGenericHeap0.add("");
        java.lang.String str11 = strGenericHeap0.get();
        strGenericHeap0.display();
        java.lang.String str13 = strGenericHeap0.get();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test6271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6271");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        java.lang.String str4 = strGenericHeap0.get();
        strGenericHeap0.add("");
        strGenericHeap0.add("hi!");
        strGenericHeap0.updatePriority("");
        int int11 = strGenericHeap0.size();
        strGenericHeap0.add("hi!");
        strGenericHeap0.updatePriority("hi!");
        strGenericHeap0.add("hi!");
        boolean boolean18 = strGenericHeap0.isEmpty();
        strGenericHeap0.updatePriority("hi!");
        strGenericHeap0.updatePriority("hi!");
        strGenericHeap0.display();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test6272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6272");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.add("hi!");
        java.lang.String str11 = strGenericHeap0.remove();
        strGenericHeap0.updatePriority("");
        boolean boolean14 = strGenericHeap0.isEmpty();
        strGenericHeap0.display();
        boolean boolean16 = strGenericHeap0.isEmpty();
        java.lang.String str17 = strGenericHeap0.remove();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test6273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6273");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        java.lang.String str6 = strGenericHeap0.get();
        strGenericHeap0.add("");
        int int9 = strGenericHeap0.size();
        strGenericHeap0.updatePriority("");
        java.lang.String str12 = strGenericHeap0.remove();
        java.lang.String str13 = strGenericHeap0.remove();
        java.lang.Class<?> wildcardClass14 = strGenericHeap0.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test6274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6274");
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
        strGenericHeap0.add("hi!");
        java.lang.String str18 = strGenericHeap0.remove();
        strGenericHeap0.add("");
        java.lang.String str21 = strGenericHeap0.remove();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test6275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6275");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        int int1 = strGenericHeap0.size();
        strGenericHeap0.add("");
        boolean boolean4 = strGenericHeap0.isEmpty();
        int int5 = strGenericHeap0.size();
        java.lang.String str6 = strGenericHeap0.get();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test6276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6276");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        int int3 = strGenericHeap0.size();
        strGenericHeap0.display();
        boolean boolean5 = strGenericHeap0.isEmpty();
        strGenericHeap0.add("");
        java.lang.String str8 = strGenericHeap0.get();
        strGenericHeap0.display();
        java.lang.String str10 = strGenericHeap0.get();
        java.lang.String str11 = strGenericHeap0.get();
        strGenericHeap0.updatePriority("");
        int int14 = strGenericHeap0.size();
        java.lang.String str15 = strGenericHeap0.get();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test6277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6277");
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
        java.lang.String str22 = strGenericHeap0.remove();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test6278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6278");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        java.lang.String str4 = strGenericHeap0.get();
        boolean boolean5 = strGenericHeap0.isEmpty();
        java.lang.String str6 = strGenericHeap0.remove();
        int int7 = strGenericHeap0.size();
        strGenericHeap0.add("hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test6279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6279");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        boolean boolean6 = strGenericHeap0.isEmpty();
        strGenericHeap0.add("hi!");
        strGenericHeap0.updatePriority("hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test6280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6280");
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
        strGenericHeap0.add("");
        strGenericHeap0.updatePriority("");
        java.lang.String str19 = strGenericHeap0.remove();
        java.lang.String str20 = strGenericHeap0.remove();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test6281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6281");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        int int1 = strGenericHeap0.size();
        int int2 = strGenericHeap0.size();
        boolean boolean3 = strGenericHeap0.isEmpty();
        strGenericHeap0.add("hi!");
        boolean boolean6 = strGenericHeap0.isEmpty();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.display();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test6282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6282");
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
        strGenericHeap0.add("");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test6283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6283");
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
        strGenericHeap0.updatePriority("");
        boolean boolean20 = strGenericHeap0.isEmpty();
        boolean boolean21 = strGenericHeap0.isEmpty();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test6284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6284");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.add("hi!");
        strGenericHeap0.display();
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("hi!");
        strGenericHeap0.add("hi!");
        strGenericHeap0.display();
        strGenericHeap0.display();
        strGenericHeap0.display();
    }

    @Test
    public void test6285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6285");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        int int1 = strGenericHeap0.size();
        int int2 = strGenericHeap0.size();
        boolean boolean3 = strGenericHeap0.isEmpty();
        strGenericHeap0.add("hi!");
        boolean boolean6 = strGenericHeap0.isEmpty();
        java.lang.String str7 = strGenericHeap0.get();
        strGenericHeap0.updatePriority("hi!");
        java.lang.String str10 = strGenericHeap0.remove();
        java.lang.Class<?> wildcardClass11 = strGenericHeap0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test6286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6286");
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
        strGenericHeap0.add("hi!");
        strGenericHeap0.add("hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test6287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6287");
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
        java.lang.String str16 = strGenericHeap0.get();
        int int17 = strGenericHeap0.size();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
    }

    @Test
    public void test6288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6288");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        int int6 = strGenericHeap0.size();
        java.lang.String str7 = strGenericHeap0.get();
        strGenericHeap0.add("hi!");
        boolean boolean10 = strGenericHeap0.isEmpty();
        java.lang.String str11 = strGenericHeap0.remove();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("hi!");
        java.lang.String str16 = strGenericHeap0.remove();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test6289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6289");
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
        boolean boolean21 = strGenericHeap0.isEmpty();
        strGenericHeap0.add("hi!");
        strGenericHeap0.updatePriority("");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test6290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6290");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.display();
        boolean boolean7 = strGenericHeap0.isEmpty();
        int int8 = strGenericHeap0.size();
        strGenericHeap0.add("hi!");
        java.lang.String str11 = strGenericHeap0.remove();
        java.lang.String str12 = strGenericHeap0.get();
        strGenericHeap0.add("");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test6291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6291");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        java.lang.String str8 = strGenericHeap0.remove();
        strGenericHeap0.add("hi!");
        int int11 = strGenericHeap0.size();
        strGenericHeap0.add("");
        java.lang.String str14 = strGenericHeap0.remove();
        java.lang.String str15 = strGenericHeap0.get();
        java.lang.String str16 = strGenericHeap0.get();
        strGenericHeap0.display();
        boolean boolean18 = strGenericHeap0.isEmpty();
        java.lang.String str19 = strGenericHeap0.get();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test6292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6292");
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
        strGenericHeap0.updatePriority("");
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
    }

    @Test
    public void test6293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6293");
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
        java.lang.String str15 = strGenericHeap0.get();
        strGenericHeap0.add("");
        java.lang.String str18 = strGenericHeap0.remove();
        boolean boolean19 = strGenericHeap0.isEmpty();
        int int20 = strGenericHeap0.size();
        java.lang.String str21 = strGenericHeap0.remove();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test6294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6294");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        boolean boolean4 = strGenericHeap0.isEmpty();
        strGenericHeap0.updatePriority("");
        boolean boolean7 = strGenericHeap0.isEmpty();
        boolean boolean8 = strGenericHeap0.isEmpty();
        strGenericHeap0.add("hi!");
        strGenericHeap0.updatePriority("hi!");
        java.lang.String str13 = strGenericHeap0.get();
        java.lang.String str14 = strGenericHeap0.get();
        boolean boolean15 = strGenericHeap0.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test6295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6295");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        java.lang.String str6 = strGenericHeap0.remove();
        strGenericHeap0.add("hi!");
        java.lang.String str9 = strGenericHeap0.get();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test6296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6296");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        java.lang.String str4 = strGenericHeap0.get();
        int int5 = strGenericHeap0.size();
        boolean boolean6 = strGenericHeap0.isEmpty();
        java.lang.String str7 = strGenericHeap0.get();
        java.lang.String str8 = strGenericHeap0.get();
        strGenericHeap0.updatePriority("");
        boolean boolean11 = strGenericHeap0.isEmpty();
        strGenericHeap0.display();
        java.lang.String str13 = strGenericHeap0.remove();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = strGenericHeap0.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test6297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6297");
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
        boolean boolean15 = strGenericHeap0.isEmpty();
        boolean boolean16 = strGenericHeap0.isEmpty();
        java.lang.Class<?> wildcardClass17 = strGenericHeap0.getClass();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test6298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6298");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        int int1 = strGenericHeap0.size();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        java.lang.String str5 = strGenericHeap0.get();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test6299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6299");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        int int1 = strGenericHeap0.size();
        strGenericHeap0.add("");
        boolean boolean4 = strGenericHeap0.isEmpty();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.display();
        strGenericHeap0.display();
        strGenericHeap0.display();
        java.lang.String str10 = strGenericHeap0.remove();
        int int11 = strGenericHeap0.size();
        boolean boolean12 = strGenericHeap0.isEmpty();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test6300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6300");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        int int6 = strGenericHeap0.size();
        java.lang.String str7 = strGenericHeap0.get();
        strGenericHeap0.add("hi!");
        strGenericHeap0.add("");
        java.lang.String str12 = strGenericHeap0.remove();
        boolean boolean13 = strGenericHeap0.isEmpty();
        strGenericHeap0.display();
        java.lang.String str15 = strGenericHeap0.remove();
        boolean boolean16 = strGenericHeap0.isEmpty();
        boolean boolean17 = strGenericHeap0.isEmpty();
        java.lang.String str18 = strGenericHeap0.remove();
        boolean boolean19 = strGenericHeap0.isEmpty();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test6301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6301");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        java.lang.String str4 = strGenericHeap0.get();
        int int5 = strGenericHeap0.size();
        boolean boolean6 = strGenericHeap0.isEmpty();
        strGenericHeap0.add("hi!");
        strGenericHeap0.display();
        strGenericHeap0.add("hi!");
        int int12 = strGenericHeap0.size();
        int int13 = strGenericHeap0.size();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
    }

    @Test
    public void test6302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6302");
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
        strGenericHeap0.add("");
        boolean boolean20 = strGenericHeap0.isEmpty();
        strGenericHeap0.add("");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test6303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6303");
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
        java.lang.String str15 = strGenericHeap0.remove();
        boolean boolean16 = strGenericHeap0.isEmpty();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test6304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6304");
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
        strGenericHeap0.add("");
        strGenericHeap0.updatePriority("");
        boolean boolean22 = strGenericHeap0.isEmpty();
        int int23 = strGenericHeap0.size();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 5 + "'", int23 == 5);
    }

    @Test
    public void test6305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6305");
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
        strGenericHeap0.add("hi!");
        strGenericHeap0.add("");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test6306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6306");
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
        strGenericHeap0.display();
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
    public void test6307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6307");
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
        strGenericHeap0.updatePriority("hi!");
        boolean boolean20 = strGenericHeap0.isEmpty();
        java.lang.String str21 = strGenericHeap0.get();
        strGenericHeap0.add("hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test6308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6308");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        java.lang.String str8 = strGenericHeap0.remove();
        java.lang.String str9 = strGenericHeap0.remove();
        strGenericHeap0.add("");
        java.lang.String str12 = strGenericHeap0.get();
        boolean boolean13 = strGenericHeap0.isEmpty();
        strGenericHeap0.display();
        boolean boolean15 = strGenericHeap0.isEmpty();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test6309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6309");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        int int3 = strGenericHeap0.size();
        int int4 = strGenericHeap0.size();
        strGenericHeap0.add("hi!");
        strGenericHeap0.updatePriority("");
        strGenericHeap0.display();
        strGenericHeap0.add("hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test6310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6310");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.add("hi!");
        strGenericHeap0.display();
        strGenericHeap0.display();
        boolean boolean8 = strGenericHeap0.isEmpty();
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        boolean boolean12 = strGenericHeap0.isEmpty();
        strGenericHeap0.updatePriority("hi!");
        java.lang.String str15 = strGenericHeap0.remove();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test6311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6311");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        strGenericHeap0.add("hi!");
        strGenericHeap0.updatePriority("hi!");
        java.lang.String str12 = strGenericHeap0.remove();
        int int13 = strGenericHeap0.size();
        java.lang.String str14 = strGenericHeap0.remove();
        java.lang.String str15 = strGenericHeap0.get();
        boolean boolean16 = strGenericHeap0.isEmpty();
        java.lang.String str17 = strGenericHeap0.get();
        strGenericHeap0.display();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test6312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6312");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        strGenericHeap0.add("hi!");
        int int10 = strGenericHeap0.size();
        strGenericHeap0.add("hi!");
        boolean boolean13 = strGenericHeap0.isEmpty();
        int int14 = strGenericHeap0.size();
        boolean boolean15 = strGenericHeap0.isEmpty();
        java.lang.String str16 = strGenericHeap0.get();
        strGenericHeap0.updatePriority("hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test6313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6313");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        java.lang.String str3 = strGenericHeap0.get();
        strGenericHeap0.display();
        int int5 = strGenericHeap0.size();
        java.lang.String str6 = strGenericHeap0.get();
        java.lang.String str7 = strGenericHeap0.get();
        java.lang.String str8 = strGenericHeap0.remove();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test6314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6314");
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
        strGenericHeap0.updatePriority("hi!");
        java.lang.String str20 = strGenericHeap0.remove();
        java.lang.String str21 = strGenericHeap0.get();
        strGenericHeap0.add("hi!");
        strGenericHeap0.add("");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test6315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6315");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        int int8 = strGenericHeap0.size();
        strGenericHeap0.updatePriority("");
        int int11 = strGenericHeap0.size();
        int int12 = strGenericHeap0.size();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
    }

    @Test
    public void test6316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6316");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        java.lang.String str4 = strGenericHeap0.get();
        int int5 = strGenericHeap0.size();
        boolean boolean6 = strGenericHeap0.isEmpty();
        java.lang.String str7 = strGenericHeap0.get();
        int int8 = strGenericHeap0.size();
        java.lang.String str9 = strGenericHeap0.get();
        strGenericHeap0.display();
        java.lang.String str11 = strGenericHeap0.get();
        int int12 = strGenericHeap0.size();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test6317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6317");
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
        java.lang.String str15 = strGenericHeap0.get();
        int int16 = strGenericHeap0.size();
        strGenericHeap0.display();
        int int18 = strGenericHeap0.size();
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
    }

    @Test
    public void test6318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6318");
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
        strGenericHeap0.display();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test6319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6319");
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
        strGenericHeap0.updatePriority("");
        boolean boolean21 = strGenericHeap0.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test6320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6320");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        java.lang.String str4 = strGenericHeap0.get();
        java.lang.String str5 = strGenericHeap0.get();
        java.lang.String str6 = strGenericHeap0.remove();
        boolean boolean7 = strGenericHeap0.isEmpty();
        boolean boolean8 = strGenericHeap0.isEmpty();
        int int9 = strGenericHeap0.size();
        strGenericHeap0.display();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = strGenericHeap0.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test6321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6321");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        java.lang.String str3 = strGenericHeap0.get();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        boolean boolean7 = strGenericHeap0.isEmpty();
        strGenericHeap0.add("hi!");
        boolean boolean10 = strGenericHeap0.isEmpty();
        strGenericHeap0.updatePriority("");
        java.lang.String str13 = strGenericHeap0.get();
        java.lang.String str14 = strGenericHeap0.get();
        strGenericHeap0.updatePriority("hi!");
        java.lang.String str17 = strGenericHeap0.remove();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test6322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6322");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        java.lang.String str4 = strGenericHeap0.get();
        strGenericHeap0.add("");
        strGenericHeap0.add("hi!");
        strGenericHeap0.updatePriority("");
        int int11 = strGenericHeap0.size();
        strGenericHeap0.updatePriority("hi!");
        strGenericHeap0.updatePriority("");
        strGenericHeap0.updatePriority("hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
    }

    @Test
    public void test6323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6323");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        strGenericHeap0.add("hi!");
        boolean boolean10 = strGenericHeap0.isEmpty();
        int int11 = strGenericHeap0.size();
        strGenericHeap0.add("");
        strGenericHeap0.updatePriority("");
        boolean boolean16 = strGenericHeap0.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test6324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6324");
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
        java.lang.Class<?> wildcardClass20 = strGenericHeap0.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test6325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6325");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        java.lang.String str8 = strGenericHeap0.remove();
        strGenericHeap0.add("hi!");
        strGenericHeap0.display();
        int int12 = strGenericHeap0.size();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
    }

    @Test
    public void test6326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6326");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        int int3 = strGenericHeap0.size();
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        int int9 = strGenericHeap0.size();
        boolean boolean10 = strGenericHeap0.isEmpty();
        java.lang.String str11 = strGenericHeap0.get();
        strGenericHeap0.display();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test6327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6327");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        int int3 = strGenericHeap0.size();
        strGenericHeap0.display();
        strGenericHeap0.add("hi!");
        boolean boolean7 = strGenericHeap0.isEmpty();
        strGenericHeap0.add("hi!");
        boolean boolean10 = strGenericHeap0.isEmpty();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.display();
        java.lang.String str14 = strGenericHeap0.get();
        strGenericHeap0.updatePriority("hi!");
        int int17 = strGenericHeap0.size();
        boolean boolean18 = strGenericHeap0.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test6328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6328");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        java.lang.String str4 = strGenericHeap0.get();
        boolean boolean5 = strGenericHeap0.isEmpty();
        strGenericHeap0.add("hi!");
        boolean boolean8 = strGenericHeap0.isEmpty();
        java.lang.String str9 = strGenericHeap0.remove();
        java.lang.String str10 = strGenericHeap0.get();
        strGenericHeap0.add("hi!");
        boolean boolean13 = strGenericHeap0.isEmpty();
        strGenericHeap0.updatePriority("");
        int int16 = strGenericHeap0.size();
        strGenericHeap0.updatePriority("hi!");
        java.lang.Class<?> wildcardClass19 = strGenericHeap0.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test6329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6329");
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
        java.lang.String str24 = strGenericHeap0.remove();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
    }

    @Test
    public void test6330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6330");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        strGenericHeap0.add("hi!");
        boolean boolean10 = strGenericHeap0.isEmpty();
        strGenericHeap0.updatePriority("");
        java.lang.String str13 = strGenericHeap0.remove();
        strGenericHeap0.add("");
        strGenericHeap0.updatePriority("");
        java.lang.String str18 = strGenericHeap0.remove();
        java.lang.String str19 = strGenericHeap0.get();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test6331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6331");
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
        boolean boolean18 = strGenericHeap0.isEmpty();
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("hi!");
        java.lang.String str22 = strGenericHeap0.get();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test6332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6332");
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
        strGenericHeap0.updatePriority("hi!");
        strGenericHeap0.add("");
        int int19 = strGenericHeap0.size();
        strGenericHeap0.add("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 4 + "'", int19 == 4);
    }

    @Test
    public void test6333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6333");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        boolean boolean4 = strGenericHeap0.isEmpty();
        strGenericHeap0.updatePriority("");
        boolean boolean7 = strGenericHeap0.isEmpty();
        boolean boolean8 = strGenericHeap0.isEmpty();
        strGenericHeap0.add("hi!");
        strGenericHeap0.updatePriority("hi!");
        java.lang.String str13 = strGenericHeap0.get();
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        java.lang.String str17 = strGenericHeap0.remove();
        java.lang.String str18 = strGenericHeap0.get();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test6334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6334");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        int int1 = strGenericHeap0.size();
        int int2 = strGenericHeap0.size();
        strGenericHeap0.add("");
        java.lang.String str5 = strGenericHeap0.get();
        strGenericHeap0.display();
        strGenericHeap0.add("");
        java.lang.String str9 = strGenericHeap0.remove();
        boolean boolean10 = strGenericHeap0.isEmpty();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test6335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6335");
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
        strGenericHeap0.updatePriority("");
        int int20 = strGenericHeap0.size();
        strGenericHeap0.add("");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
    }

    @Test
    public void test6336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6336");
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
        java.lang.String str14 = strGenericHeap0.get();
        int int15 = strGenericHeap0.size();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test6337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6337");
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
        strGenericHeap0.updatePriority("");
        int int17 = strGenericHeap0.size();
        int int18 = strGenericHeap0.size();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
    }

    @Test
    public void test6338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6338");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        java.lang.String str4 = strGenericHeap0.get();
        int int5 = strGenericHeap0.size();
        strGenericHeap0.display();
        boolean boolean7 = strGenericHeap0.isEmpty();
        strGenericHeap0.add("hi!");
        strGenericHeap0.updatePriority("");
        strGenericHeap0.updatePriority("hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test6339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6339");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        java.lang.String str6 = strGenericHeap0.get();
        strGenericHeap0.add("hi!");
        boolean boolean9 = strGenericHeap0.isEmpty();
        java.lang.String str10 = strGenericHeap0.get();
        strGenericHeap0.add("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test6340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6340");
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
        java.lang.String str15 = strGenericHeap0.get();
        strGenericHeap0.add("");
        boolean boolean18 = strGenericHeap0.isEmpty();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test6341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6341");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        strGenericHeap0.updatePriority("");
        strGenericHeap0.display();
        java.lang.String str11 = strGenericHeap0.remove();
        java.lang.String str12 = strGenericHeap0.get();
        boolean boolean13 = strGenericHeap0.isEmpty();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test6342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6342");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        int int1 = strGenericHeap0.size();
        int int2 = strGenericHeap0.size();
        strGenericHeap0.display();
        strGenericHeap0.add("");
        java.lang.String str6 = strGenericHeap0.get();
        strGenericHeap0.add("hi!");
        strGenericHeap0.display();
        boolean boolean10 = strGenericHeap0.isEmpty();
        java.lang.String str11 = strGenericHeap0.remove();
        boolean boolean12 = strGenericHeap0.isEmpty();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test6343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6343");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        java.lang.String str4 = strGenericHeap0.get();
        strGenericHeap0.add("");
        strGenericHeap0.add("hi!");
        strGenericHeap0.updatePriority("");
        strGenericHeap0.updatePriority("hi!");
        boolean boolean13 = strGenericHeap0.isEmpty();
        java.lang.String str14 = strGenericHeap0.remove();
        strGenericHeap0.display();
        java.lang.String str16 = strGenericHeap0.get();
        strGenericHeap0.updatePriority("");
        java.lang.String str19 = strGenericHeap0.remove();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test6344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6344");
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
        java.lang.String str17 = strGenericHeap0.get();
        int int18 = strGenericHeap0.size();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
    }

    @Test
    public void test6345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6345");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        boolean boolean4 = strGenericHeap0.isEmpty();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("hi!");
        boolean boolean9 = strGenericHeap0.isEmpty();
        java.lang.String str10 = strGenericHeap0.remove();
        int int11 = strGenericHeap0.size();
        int int12 = strGenericHeap0.size();
        int int13 = strGenericHeap0.size();
        strGenericHeap0.add("hi!");
        strGenericHeap0.add("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test6346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6346");
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
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        boolean boolean21 = strGenericHeap0.isEmpty();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test6347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6347");
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
        java.lang.String str19 = strGenericHeap0.get();
        int int20 = strGenericHeap0.size();
        boolean boolean21 = strGenericHeap0.isEmpty();
        boolean boolean22 = strGenericHeap0.isEmpty();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test6348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6348");
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
        java.lang.String str20 = strGenericHeap0.get();
        strGenericHeap0.add("hi!");
        java.lang.String str23 = strGenericHeap0.get();
        int int24 = strGenericHeap0.size();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
    }

    @Test
    public void test6349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6349");
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
        java.lang.String str15 = strGenericHeap0.get();
        strGenericHeap0.add("");
        java.lang.String str18 = strGenericHeap0.remove();
        boolean boolean19 = strGenericHeap0.isEmpty();
        int int20 = strGenericHeap0.size();
        strGenericHeap0.display();
        java.lang.String str22 = strGenericHeap0.remove();
        boolean boolean23 = strGenericHeap0.isEmpty();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test6350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6350");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        java.lang.String str3 = strGenericHeap0.get();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        boolean boolean7 = strGenericHeap0.isEmpty();
        strGenericHeap0.add("hi!");
        strGenericHeap0.display();
        int int11 = strGenericHeap0.size();
        strGenericHeap0.add("hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
    }

    @Test
    public void test6351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6351");
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
        strGenericHeap0.add("hi!");
        java.lang.String str18 = strGenericHeap0.get();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test6352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6352");
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
        java.lang.String str15 = strGenericHeap0.get();
        boolean boolean16 = strGenericHeap0.isEmpty();
        java.lang.String str17 = strGenericHeap0.remove();
        strGenericHeap0.add("");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test6353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6353");
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
        strGenericHeap0.updatePriority("");
        strGenericHeap0.updatePriority("hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test6354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6354");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        int int1 = strGenericHeap0.size();
        int int2 = strGenericHeap0.size();
        strGenericHeap0.add("");
        int int5 = strGenericHeap0.size();
        strGenericHeap0.add("hi!");
        strGenericHeap0.add("hi!");
        java.lang.String str10 = strGenericHeap0.get();
        java.lang.String str11 = strGenericHeap0.remove();
        java.lang.String str12 = strGenericHeap0.get();
        int int13 = strGenericHeap0.size();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
    }

    @Test
    public void test6355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6355");
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
        strGenericHeap0.display();
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test6356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6356");
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
        strGenericHeap0.display();
        strGenericHeap0.display();
        strGenericHeap0.add("");
        int int25 = strGenericHeap0.size();
        strGenericHeap0.display();
        strGenericHeap0.add("");
        boolean boolean29 = strGenericHeap0.isEmpty();
        int int30 = strGenericHeap0.size();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 6 + "'", int25 == 6);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 7 + "'", int30 == 7);
    }

    @Test
    public void test6357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6357");
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
        java.lang.String str20 = strGenericHeap0.get();
        strGenericHeap0.add("hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test6358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6358");
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
        java.lang.String str18 = strGenericHeap0.get();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test6359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6359");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        java.lang.String str8 = strGenericHeap0.remove();
        strGenericHeap0.add("hi!");
        strGenericHeap0.display();
        java.lang.String str12 = strGenericHeap0.remove();
        java.lang.Class<?> wildcardClass13 = strGenericHeap0.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test6360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6360");
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
        strGenericHeap0.add("hi!");
        int int15 = strGenericHeap0.size();
        boolean boolean16 = strGenericHeap0.isEmpty();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test6361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6361");
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
        strGenericHeap0.updatePriority("hi!");
        java.lang.String str26 = strGenericHeap0.get();
        java.lang.String str27 = strGenericHeap0.get();
        strGenericHeap0.display();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
    }

    @Test
    public void test6362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6362");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        java.lang.String str4 = strGenericHeap0.get();
        boolean boolean5 = strGenericHeap0.isEmpty();
        strGenericHeap0.add("hi!");
        boolean boolean8 = strGenericHeap0.isEmpty();
        strGenericHeap0.updatePriority("");
        int int11 = strGenericHeap0.size();
        java.lang.String str12 = strGenericHeap0.remove();
        java.lang.String str13 = strGenericHeap0.get();
        java.lang.String str14 = strGenericHeap0.get();
        java.lang.String str15 = strGenericHeap0.remove();
        strGenericHeap0.display();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test6363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6363");
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
        strGenericHeap0.display();
        boolean boolean15 = strGenericHeap0.isEmpty();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test6364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6364");
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
        boolean boolean18 = strGenericHeap0.isEmpty();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        int int22 = strGenericHeap0.size();
        java.lang.Class<?> wildcardClass23 = strGenericHeap0.getClass();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 4 + "'", int22 == 4);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test6365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6365");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        int int8 = strGenericHeap0.size();
        boolean boolean9 = strGenericHeap0.isEmpty();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.updatePriority("");
        strGenericHeap0.updatePriority("");
        strGenericHeap0.updatePriority("");
        int int18 = strGenericHeap0.size();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
    }

    @Test
    public void test6366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6366");
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
        java.lang.String str17 = strGenericHeap0.get();
        java.lang.String str18 = strGenericHeap0.get();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test6367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6367");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        int int8 = strGenericHeap0.size();
        boolean boolean9 = strGenericHeap0.isEmpty();
        java.lang.String str10 = strGenericHeap0.remove();
        int int11 = strGenericHeap0.size();
        java.lang.String str12 = strGenericHeap0.get();
        int int13 = strGenericHeap0.size();
        strGenericHeap0.add("");
        java.lang.Class<?> wildcardClass16 = strGenericHeap0.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test6368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6368");
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
        strGenericHeap0.add("hi!");
        strGenericHeap0.updatePriority("");
        java.lang.String str21 = strGenericHeap0.get();
        strGenericHeap0.display();
        strGenericHeap0.add("");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test6369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6369");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        java.lang.String str4 = strGenericHeap0.get();
        boolean boolean5 = strGenericHeap0.isEmpty();
        strGenericHeap0.add("hi!");
        int int8 = strGenericHeap0.size();
        strGenericHeap0.add("");
        boolean boolean11 = strGenericHeap0.isEmpty();
        strGenericHeap0.updatePriority("hi!");
        java.lang.String str14 = strGenericHeap0.remove();
        boolean boolean15 = strGenericHeap0.isEmpty();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test6370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6370");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        int int8 = strGenericHeap0.size();
        boolean boolean9 = strGenericHeap0.isEmpty();
        java.lang.String str10 = strGenericHeap0.remove();
        int int11 = strGenericHeap0.size();
        java.lang.String str12 = strGenericHeap0.get();
        strGenericHeap0.add("");
        int int15 = strGenericHeap0.size();
        int int16 = strGenericHeap0.size();
        int int17 = strGenericHeap0.size();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
    }

    @Test
    public void test6371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6371");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        java.lang.String str8 = strGenericHeap0.remove();
        strGenericHeap0.display();
        strGenericHeap0.add("");
        java.lang.String str12 = strGenericHeap0.get();
        strGenericHeap0.add("");
        int int15 = strGenericHeap0.size();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
    }

    @Test
    public void test6372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6372");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        java.lang.String str4 = strGenericHeap0.get();
        int int5 = strGenericHeap0.size();
        boolean boolean6 = strGenericHeap0.isEmpty();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.display();
        strGenericHeap0.add("hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test6373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6373");
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
        java.lang.String str14 = strGenericHeap0.get();
        int int15 = strGenericHeap0.size();
        boolean boolean16 = strGenericHeap0.isEmpty();
        boolean boolean17 = strGenericHeap0.isEmpty();
        boolean boolean18 = strGenericHeap0.isEmpty();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test6374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6374");
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
        boolean boolean14 = strGenericHeap0.isEmpty();
        strGenericHeap0.updatePriority("");
        java.lang.String str17 = strGenericHeap0.remove();
        java.lang.String str18 = strGenericHeap0.remove();
        java.lang.Class<?> wildcardClass19 = strGenericHeap0.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test6375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6375");
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
        strGenericHeap0.add("hi!");
        strGenericHeap0.display();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test6376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6376");
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
        strGenericHeap0.add("");
        boolean boolean16 = strGenericHeap0.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test6377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6377");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.add("hi!");
        java.lang.String str6 = strGenericHeap0.remove();
        java.lang.String str7 = strGenericHeap0.get();
        java.lang.String str8 = strGenericHeap0.remove();
        strGenericHeap0.display();
        strGenericHeap0.display();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test6378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6378");
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
        strGenericHeap0.display();
        int int23 = strGenericHeap0.size();
        int int24 = strGenericHeap0.size();
        java.lang.String str25 = strGenericHeap0.get();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 4 + "'", int23 == 4);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test6379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6379");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        java.lang.String str3 = strGenericHeap0.get();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        boolean boolean7 = strGenericHeap0.isEmpty();
        java.lang.String str8 = strGenericHeap0.remove();
        java.lang.Class<?> wildcardClass9 = strGenericHeap0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test6380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6380");
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
        int int17 = strGenericHeap0.size();
        int int18 = strGenericHeap0.size();
        boolean boolean19 = strGenericHeap0.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test6381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6381");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        java.lang.String str4 = strGenericHeap0.get();
        boolean boolean5 = strGenericHeap0.isEmpty();
        strGenericHeap0.add("hi!");
        strGenericHeap0.updatePriority("hi!");
        strGenericHeap0.add("");
        strGenericHeap0.updatePriority("hi!");
        boolean boolean14 = strGenericHeap0.isEmpty();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test6382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6382");
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
        strGenericHeap0.add("hi!");
        strGenericHeap0.display();
        java.lang.String str19 = strGenericHeap0.remove();
        java.lang.String str20 = strGenericHeap0.get();
        strGenericHeap0.display();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test6383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6383");
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
        strGenericHeap0.display();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test6384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6384");
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
        int int19 = strGenericHeap0.size();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
    }

    @Test
    public void test6385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6385");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        java.lang.String str8 = strGenericHeap0.remove();
        java.lang.String str9 = strGenericHeap0.get();
        strGenericHeap0.display();
        int int11 = strGenericHeap0.size();
        strGenericHeap0.add("");
        int int14 = strGenericHeap0.size();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
    }

    @Test
    public void test6386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6386");
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
        java.lang.String str22 = strGenericHeap0.remove();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test6387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6387");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        int int1 = strGenericHeap0.size();
        int int2 = strGenericHeap0.size();
        strGenericHeap0.display();
        strGenericHeap0.add("");
        int int6 = strGenericHeap0.size();
        strGenericHeap0.display();
        strGenericHeap0.display();
        int int9 = strGenericHeap0.size();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test6388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6388");
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
        strGenericHeap0.add("");
        boolean boolean19 = strGenericHeap0.isEmpty();
        strGenericHeap0.display();
        strGenericHeap0.add("hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test6389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6389");
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
        strGenericHeap0.add("");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test6390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6390");
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
        strGenericHeap0.add("");
        strGenericHeap0.add("");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test6391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6391");
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
        java.lang.String str15 = strGenericHeap0.get();
        strGenericHeap0.display();
        boolean boolean17 = strGenericHeap0.isEmpty();
        java.lang.String str18 = strGenericHeap0.get();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test6392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6392");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        strGenericHeap0.add("hi!");
        int int10 = strGenericHeap0.size();
        int int11 = strGenericHeap0.size();
        strGenericHeap0.add("");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
    }

    @Test
    public void test6393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6393");
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
        boolean boolean16 = strGenericHeap0.isEmpty();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test6394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6394");
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
        int int23 = strGenericHeap0.size();
        java.lang.String str24 = strGenericHeap0.get();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 4 + "'", int23 == 4);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
    }

    @Test
    public void test6395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6395");
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
        java.lang.String str14 = strGenericHeap0.get();
        java.lang.String str15 = strGenericHeap0.get();
        strGenericHeap0.display();
        boolean boolean17 = strGenericHeap0.isEmpty();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test6396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6396");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        java.lang.String str3 = strGenericHeap0.get();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        boolean boolean7 = strGenericHeap0.isEmpty();
        strGenericHeap0.display();
        int int9 = strGenericHeap0.size();
        strGenericHeap0.add("hi!");
        java.lang.String str12 = strGenericHeap0.remove();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test6397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6397");
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
        boolean boolean15 = strGenericHeap0.isEmpty();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.updatePriority("hi!");
        strGenericHeap0.updatePriority("");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test6398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6398");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        int int1 = strGenericHeap0.size();
        int int2 = strGenericHeap0.size();
        int int3 = strGenericHeap0.size();
        boolean boolean4 = strGenericHeap0.isEmpty();
        strGenericHeap0.display();
        boolean boolean6 = strGenericHeap0.isEmpty();
        strGenericHeap0.add("hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test6399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6399");
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
        boolean boolean18 = strGenericHeap0.isEmpty();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        java.lang.Class<?> wildcardClass22 = strGenericHeap0.getClass();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test6400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6400");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.add("hi!");
        int int6 = strGenericHeap0.size();
        strGenericHeap0.updatePriority("hi!");
        int int9 = strGenericHeap0.size();
        java.lang.String str10 = strGenericHeap0.remove();
        java.lang.String str11 = strGenericHeap0.remove();
        strGenericHeap0.add("hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test6401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6401");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        boolean boolean4 = strGenericHeap0.isEmpty();
        boolean boolean5 = strGenericHeap0.isEmpty();
        int int6 = strGenericHeap0.size();
        java.lang.String str7 = strGenericHeap0.remove();
        int int8 = strGenericHeap0.size();
        int int9 = strGenericHeap0.size();
        boolean boolean10 = strGenericHeap0.isEmpty();
        boolean boolean11 = strGenericHeap0.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test6402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6402");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        int int1 = strGenericHeap0.size();
        int int2 = strGenericHeap0.size();
        boolean boolean3 = strGenericHeap0.isEmpty();
        strGenericHeap0.add("hi!");
        boolean boolean6 = strGenericHeap0.isEmpty();
        java.lang.String str7 = strGenericHeap0.get();
        strGenericHeap0.display();
        java.lang.String str9 = strGenericHeap0.remove();
        int int10 = strGenericHeap0.size();
        strGenericHeap0.add("");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test6403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6403");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        java.lang.String str6 = strGenericHeap0.remove();
        strGenericHeap0.display();
        int int8 = strGenericHeap0.size();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test6404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6404");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        int int3 = strGenericHeap0.size();
        strGenericHeap0.display();
        int int5 = strGenericHeap0.size();
        int int6 = strGenericHeap0.size();
        int int7 = strGenericHeap0.size();
        java.lang.String str8 = strGenericHeap0.get();
        strGenericHeap0.add("");
        int int11 = strGenericHeap0.size();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
    }

    @Test
    public void test6405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6405");
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
        boolean boolean24 = strGenericHeap0.isEmpty();
        boolean boolean25 = strGenericHeap0.isEmpty();
        strGenericHeap0.updatePriority("");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test6406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6406");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        strGenericHeap0.add("hi!");
        boolean boolean10 = strGenericHeap0.isEmpty();
        strGenericHeap0.updatePriority("hi!");
        strGenericHeap0.display();
        strGenericHeap0.display();
        java.lang.String str15 = strGenericHeap0.get();
        boolean boolean16 = strGenericHeap0.isEmpty();
        java.lang.String str17 = strGenericHeap0.get();
        boolean boolean18 = strGenericHeap0.isEmpty();
        int int19 = strGenericHeap0.size();
        strGenericHeap0.display();
        int int21 = strGenericHeap0.size();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
    }

    @Test
    public void test6407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6407");
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
        strGenericHeap0.display();
        boolean boolean20 = strGenericHeap0.isEmpty();
        java.lang.String str21 = strGenericHeap0.remove();
        boolean boolean22 = strGenericHeap0.isEmpty();
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test6408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6408");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        java.lang.String str3 = strGenericHeap0.get();
        int int4 = strGenericHeap0.size();
        strGenericHeap0.display();
        java.lang.String str6 = strGenericHeap0.get();
        strGenericHeap0.add("hi!");
        strGenericHeap0.updatePriority("hi!");
        strGenericHeap0.updatePriority("hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test6409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6409");
        com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String> strGenericHeap0 = new com.thealgorithms.datastructures.heaps.GenericHeap<java.lang.String>();
        strGenericHeap0.add("");
        strGenericHeap0.display();
        strGenericHeap0.updatePriority("");
        strGenericHeap0.add("");
        int int8 = strGenericHeap0.size();
        boolean boolean9 = strGenericHeap0.isEmpty();
        java.lang.String str10 = strGenericHeap0.remove();
        int int11 = strGenericHeap0.size();
        java.lang.String str12 = strGenericHeap0.get();
        strGenericHeap0.add("");
        int int15 = strGenericHeap0.size();
        java.lang.String str16 = strGenericHeap0.remove();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }
}

