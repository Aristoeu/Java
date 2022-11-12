package others.SkylineProblem;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        com.thealgorithms.others.SkylineProblem skylineProblem0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.SkylineProblem.Skyline skyline3 = skylineProblem0.new Skyline((int) (short) -1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to com.thealgorithms.others.SkylineProblem$Skyline with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        com.thealgorithms.others.SkylineProblem skylineProblem0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.SkylineProblem.Building building4 = skylineProblem0.new Building((int) '4', (int) (byte) 1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to com.thealgorithms.others.SkylineProblem$Building with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        com.thealgorithms.others.SkylineProblem skylineProblem0 = new com.thealgorithms.others.SkylineProblem();
        java.lang.Class<?> wildcardClass1 = skylineProblem0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        com.thealgorithms.others.SkylineProblem skylineProblem0 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building4 = skylineProblem0.new Building((int) '#', 100, 0);
        building4.right = (short) -1;
        int int7 = building4.right;
        java.lang.Class<?> wildcardClass8 = building4.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        com.thealgorithms.others.SkylineProblem skylineProblem0 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building4 = skylineProblem0.new Building((int) '#', 100, 0);
        com.thealgorithms.others.SkylineProblem.Building building8 = skylineProblem0.new Building((int) (short) 10, 10, 0);
        com.thealgorithms.others.SkylineProblem.Skyline skyline11 = skylineProblem0.new Skyline((int) '4', (int) (byte) 0);
        com.thealgorithms.others.SkylineProblem skylineProblem12 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building16 = skylineProblem12.new Building((int) '#', 100, 0);
        com.thealgorithms.others.SkylineProblem.Skyline[] skylineArray17 = new com.thealgorithms.others.SkylineProblem.Skyline[] {};
        java.util.ArrayList<com.thealgorithms.others.SkylineProblem.Skyline> skylineList18 = new java.util.ArrayList<com.thealgorithms.others.SkylineProblem.Skyline>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<com.thealgorithms.others.SkylineProblem.Skyline>) skylineList18, skylineArray17);
        skylineProblem12.print(skylineList18);
        com.thealgorithms.others.SkylineProblem skylineProblem21 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building25 = skylineProblem21.new Building((int) '#', 100, 0);
        com.thealgorithms.others.SkylineProblem.Building building29 = skylineProblem21.new Building((int) (short) 10, 10, 0);
        com.thealgorithms.others.SkylineProblem.Skyline skyline32 = skylineProblem21.new Skyline((int) '4', (int) (byte) 0);
        skyline32.height = (short) 10;
        com.thealgorithms.others.SkylineProblem skylineProblem35 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building39 = skylineProblem35.new Building((int) '#', 100, 0);
        com.thealgorithms.others.SkylineProblem.Building building43 = skylineProblem35.new Building((int) (short) 10, 10, 0);
        com.thealgorithms.others.SkylineProblem.Skyline skyline46 = skylineProblem35.new Skyline((int) '4', (int) (byte) 0);
        skyline46.height = (short) 10;
        com.thealgorithms.others.SkylineProblem.Skyline[] skylineArray49 = new com.thealgorithms.others.SkylineProblem.Skyline[] { skyline32, skyline46 };
        java.util.ArrayList<com.thealgorithms.others.SkylineProblem.Skyline> skylineList50 = new java.util.ArrayList<com.thealgorithms.others.SkylineProblem.Skyline>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<com.thealgorithms.others.SkylineProblem.Skyline>) skylineList50, skylineArray49);
        java.util.ArrayList<com.thealgorithms.others.SkylineProblem.Skyline> skylineList52 = skylineProblem0.mergeSkyline(skylineList18, skylineList50);
        java.lang.Class<?> wildcardClass53 = skylineList50.getClass();
        org.junit.Assert.assertNotNull(skylineArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(skylineArray49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(skylineList52);
        org.junit.Assert.assertNotNull(wildcardClass53);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        com.thealgorithms.others.SkylineProblem skylineProblem0 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building4 = skylineProblem0.new Building((int) '#', 100, 0);
        com.thealgorithms.others.SkylineProblem.Building building8 = skylineProblem0.new Building((int) (short) 10, 10, 0);
        com.thealgorithms.others.SkylineProblem.Skyline skyline11 = skylineProblem0.new Skyline((int) '4', (int) (byte) 0);
        com.thealgorithms.others.SkylineProblem skylineProblem12 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building16 = skylineProblem12.new Building((int) '#', 100, 0);
        com.thealgorithms.others.SkylineProblem.Building building20 = skylineProblem12.new Building((int) (short) 10, 10, 0);
        com.thealgorithms.others.SkylineProblem skylineProblem21 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building25 = skylineProblem21.new Building((int) '#', 100, 0);
        com.thealgorithms.others.SkylineProblem.Skyline[] skylineArray26 = new com.thealgorithms.others.SkylineProblem.Skyline[] {};
        java.util.ArrayList<com.thealgorithms.others.SkylineProblem.Skyline> skylineList27 = new java.util.ArrayList<com.thealgorithms.others.SkylineProblem.Skyline>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<com.thealgorithms.others.SkylineProblem.Skyline>) skylineList27, skylineArray26);
        skylineProblem21.print(skylineList27);
        com.thealgorithms.others.SkylineProblem skylineProblem30 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building34 = skylineProblem30.new Building((int) '#', 100, 0);
        com.thealgorithms.others.SkylineProblem.Building building38 = skylineProblem30.new Building((int) (short) 10, 10, 0);
        com.thealgorithms.others.SkylineProblem.Skyline skyline41 = skylineProblem30.new Skyline((int) '4', (int) (byte) 0);
        com.thealgorithms.others.SkylineProblem skylineProblem42 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building46 = skylineProblem42.new Building((int) '#', 100, 0);
        com.thealgorithms.others.SkylineProblem.Skyline[] skylineArray47 = new com.thealgorithms.others.SkylineProblem.Skyline[] {};
        java.util.ArrayList<com.thealgorithms.others.SkylineProblem.Skyline> skylineList48 = new java.util.ArrayList<com.thealgorithms.others.SkylineProblem.Skyline>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<com.thealgorithms.others.SkylineProblem.Skyline>) skylineList48, skylineArray47);
        skylineProblem42.print(skylineList48);
        com.thealgorithms.others.SkylineProblem skylineProblem51 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building55 = skylineProblem51.new Building((int) '#', 100, 0);
        com.thealgorithms.others.SkylineProblem.Building building59 = skylineProblem51.new Building((int) (short) 10, 10, 0);
        com.thealgorithms.others.SkylineProblem.Skyline skyline62 = skylineProblem51.new Skyline((int) '4', (int) (byte) 0);
        skyline62.height = (short) 10;
        com.thealgorithms.others.SkylineProblem skylineProblem65 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building69 = skylineProblem65.new Building((int) '#', 100, 0);
        com.thealgorithms.others.SkylineProblem.Building building73 = skylineProblem65.new Building((int) (short) 10, 10, 0);
        com.thealgorithms.others.SkylineProblem.Skyline skyline76 = skylineProblem65.new Skyline((int) '4', (int) (byte) 0);
        skyline76.height = (short) 10;
        com.thealgorithms.others.SkylineProblem.Skyline[] skylineArray79 = new com.thealgorithms.others.SkylineProblem.Skyline[] { skyline62, skyline76 };
        java.util.ArrayList<com.thealgorithms.others.SkylineProblem.Skyline> skylineList80 = new java.util.ArrayList<com.thealgorithms.others.SkylineProblem.Skyline>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<com.thealgorithms.others.SkylineProblem.Skyline>) skylineList80, skylineArray79);
        java.util.ArrayList<com.thealgorithms.others.SkylineProblem.Skyline> skylineList82 = skylineProblem30.mergeSkyline(skylineList48, skylineList80);
        java.util.ArrayList<com.thealgorithms.others.SkylineProblem.Skyline> skylineList83 = skylineProblem12.mergeSkyline(skylineList27, skylineList48);
        skylineProblem0.print(skylineList48);
        org.junit.Assert.assertNotNull(skylineArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(skylineArray47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(skylineArray79);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertNotNull(skylineList82);
        org.junit.Assert.assertNotNull(skylineList83);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        com.thealgorithms.others.SkylineProblem skylineProblem0 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building4 = skylineProblem0.new Building((int) '#', 100, 0);
        com.thealgorithms.others.SkylineProblem.Building building8 = skylineProblem0.new Building((int) (short) 10, 10, 0);
        building8.height = 0;
        int int11 = building8.left;
        java.lang.Class<?> wildcardClass12 = building8.getClass();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        com.thealgorithms.others.SkylineProblem skylineProblem0 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building4 = skylineProblem0.new Building((int) '#', 100, 0);
        com.thealgorithms.others.SkylineProblem.Building building8 = skylineProblem0.new Building((int) (short) 10, 10, 0);
        java.util.ArrayList<com.thealgorithms.others.SkylineProblem.Skyline> skylineList9 = null;
        // The following exception was thrown during execution in test generation
        try {
            skylineProblem0.print(skylineList9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.ArrayList.iterator()\" because \"skyline\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        com.thealgorithms.others.SkylineProblem skylineProblem0 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building4 = skylineProblem0.new Building((int) '#', 100, 0);
        com.thealgorithms.others.SkylineProblem.Skyline[] skylineArray5 = new com.thealgorithms.others.SkylineProblem.Skyline[] {};
        java.util.ArrayList<com.thealgorithms.others.SkylineProblem.Skyline> skylineList6 = new java.util.ArrayList<com.thealgorithms.others.SkylineProblem.Skyline>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<com.thealgorithms.others.SkylineProblem.Skyline>) skylineList6, skylineArray5);
        skylineProblem0.print(skylineList6);
        com.thealgorithms.others.SkylineProblem.Building building12 = skylineProblem0.new Building((int) (short) 0, (int) '4', (int) (short) 100);
        org.junit.Assert.assertNotNull(skylineArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        com.thealgorithms.others.SkylineProblem skylineProblem0 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building4 = skylineProblem0.new Building((int) '#', 100, 0);
        com.thealgorithms.others.SkylineProblem.Skyline[] skylineArray5 = new com.thealgorithms.others.SkylineProblem.Skyline[] {};
        java.util.ArrayList<com.thealgorithms.others.SkylineProblem.Skyline> skylineList6 = new java.util.ArrayList<com.thealgorithms.others.SkylineProblem.Skyline>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<com.thealgorithms.others.SkylineProblem.Skyline>) skylineList6, skylineArray5);
        skylineProblem0.print(skylineList6);
        com.thealgorithms.others.SkylineProblem.Skyline skyline11 = skylineProblem0.new Skyline((-1), (int) '#');
        java.lang.Class<?> wildcardClass12 = skylineProblem0.getClass();
        org.junit.Assert.assertNotNull(skylineArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        com.thealgorithms.others.SkylineProblem skylineProblem0 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building4 = skylineProblem0.new Building((int) '#', 100, 0);
        com.thealgorithms.others.SkylineProblem.Building building8 = skylineProblem0.new Building((int) (short) 10, 10, 0);
        building8.height = 0;
        building8.right = 0;
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        com.thealgorithms.others.SkylineProblem skylineProblem0 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building4 = skylineProblem0.new Building((int) '#', 100, 0);
        java.lang.Class<?> wildcardClass5 = skylineProblem0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        com.thealgorithms.others.SkylineProblem skylineProblem0 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building4 = skylineProblem0.new Building((int) '#', 100, 0);
        building4.right = (short) -1;
        int int7 = building4.height;
        building4.right = (byte) 100;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        com.thealgorithms.others.SkylineProblem skylineProblem0 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building4 = skylineProblem0.new Building((int) '#', 100, 0);
        com.thealgorithms.others.SkylineProblem.Building building8 = skylineProblem0.new Building((int) (short) 10, 10, 0);
        building8.height = 0;
        building8.left = '4';
        java.lang.Class<?> wildcardClass13 = building8.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        com.thealgorithms.others.SkylineProblem skylineProblem0 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building4 = skylineProblem0.new Building((int) '#', 100, 0);
        com.thealgorithms.others.SkylineProblem.Skyline skyline7 = skylineProblem0.new Skyline(10, (int) (byte) 0);
        com.thealgorithms.others.SkylineProblem skylineProblem8 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building12 = skylineProblem8.new Building((int) '#', 100, 0);
        com.thealgorithms.others.SkylineProblem.Building building16 = skylineProblem8.new Building((int) (short) 10, 10, 0);
        com.thealgorithms.others.SkylineProblem.Skyline skyline19 = skylineProblem8.new Skyline((int) '4', (int) (byte) 0);
        com.thealgorithms.others.SkylineProblem skylineProblem20 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building24 = skylineProblem20.new Building((int) '#', 100, 0);
        com.thealgorithms.others.SkylineProblem.Skyline[] skylineArray25 = new com.thealgorithms.others.SkylineProblem.Skyline[] {};
        java.util.ArrayList<com.thealgorithms.others.SkylineProblem.Skyline> skylineList26 = new java.util.ArrayList<com.thealgorithms.others.SkylineProblem.Skyline>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<com.thealgorithms.others.SkylineProblem.Skyline>) skylineList26, skylineArray25);
        skylineProblem20.print(skylineList26);
        com.thealgorithms.others.SkylineProblem skylineProblem29 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building33 = skylineProblem29.new Building((int) '#', 100, 0);
        com.thealgorithms.others.SkylineProblem.Building building37 = skylineProblem29.new Building((int) (short) 10, 10, 0);
        com.thealgorithms.others.SkylineProblem.Skyline skyline40 = skylineProblem29.new Skyline((int) '4', (int) (byte) 0);
        skyline40.height = (short) 10;
        com.thealgorithms.others.SkylineProblem skylineProblem43 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building47 = skylineProblem43.new Building((int) '#', 100, 0);
        com.thealgorithms.others.SkylineProblem.Building building51 = skylineProblem43.new Building((int) (short) 10, 10, 0);
        com.thealgorithms.others.SkylineProblem.Skyline skyline54 = skylineProblem43.new Skyline((int) '4', (int) (byte) 0);
        skyline54.height = (short) 10;
        com.thealgorithms.others.SkylineProblem.Skyline[] skylineArray57 = new com.thealgorithms.others.SkylineProblem.Skyline[] { skyline40, skyline54 };
        java.util.ArrayList<com.thealgorithms.others.SkylineProblem.Skyline> skylineList58 = new java.util.ArrayList<com.thealgorithms.others.SkylineProblem.Skyline>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<com.thealgorithms.others.SkylineProblem.Skyline>) skylineList58, skylineArray57);
        java.util.ArrayList<com.thealgorithms.others.SkylineProblem.Skyline> skylineList60 = skylineProblem8.mergeSkyline(skylineList26, skylineList58);
        skylineProblem0.print(skylineList60);
        java.lang.Class<?> wildcardClass62 = skylineList60.getClass();
        org.junit.Assert.assertNotNull(skylineArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(skylineArray57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(skylineList60);
        org.junit.Assert.assertNotNull(wildcardClass62);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        com.thealgorithms.others.SkylineProblem skylineProblem0 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building4 = skylineProblem0.new Building((int) '#', 100, 0);
        com.thealgorithms.others.SkylineProblem.Building building8 = skylineProblem0.new Building((int) (short) 10, 10, 0);
        com.thealgorithms.others.SkylineProblem.Skyline skyline11 = skylineProblem0.new Skyline((int) '4', (int) (byte) 0);
        com.thealgorithms.others.SkylineProblem.Skyline skyline14 = skylineProblem0.new Skyline((int) '#', (int) (byte) -1);
        skyline14.height = (byte) 0;
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        com.thealgorithms.others.SkylineProblem skylineProblem0 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building4 = skylineProblem0.new Building((int) '#', 100, 0);
        com.thealgorithms.others.SkylineProblem.Building building8 = skylineProblem0.new Building((int) (short) 10, 10, 0);
        com.thealgorithms.others.SkylineProblem.Skyline skyline11 = skylineProblem0.new Skyline((int) '4', (int) (byte) 0);
        int int12 = skyline11.height;
        int int13 = skyline11.height;
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        com.thealgorithms.others.SkylineProblem skylineProblem0 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building4 = skylineProblem0.new Building((int) (short) 10, 35, (int) (short) 100);
        java.lang.Class<?> wildcardClass5 = building4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        com.thealgorithms.others.SkylineProblem skylineProblem0 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building4 = skylineProblem0.new Building((int) '#', 100, 0);
        com.thealgorithms.others.SkylineProblem.Skyline[] skylineArray5 = new com.thealgorithms.others.SkylineProblem.Skyline[] {};
        java.util.ArrayList<com.thealgorithms.others.SkylineProblem.Skyline> skylineList6 = new java.util.ArrayList<com.thealgorithms.others.SkylineProblem.Skyline>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<com.thealgorithms.others.SkylineProblem.Skyline>) skylineList6, skylineArray5);
        skylineProblem0.print(skylineList6);
        com.thealgorithms.others.SkylineProblem.Skyline skyline11 = skylineProblem0.new Skyline((-1), (int) '#');
        skyline11.coordinates = (byte) 100;
        org.junit.Assert.assertNotNull(skylineArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        com.thealgorithms.others.SkylineProblem skylineProblem0 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building4 = skylineProblem0.new Building((int) '#', 100, 0);
        com.thealgorithms.others.SkylineProblem.Building building8 = skylineProblem0.new Building((int) (short) 10, 10, 0);
        int int9 = building8.height;
        building8.right = 1;
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        com.thealgorithms.others.SkylineProblem skylineProblem0 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building4 = skylineProblem0.new Building((int) '#', 100, 0);
        com.thealgorithms.others.SkylineProblem.Building building8 = skylineProblem0.new Building((int) (short) 10, 10, 0);
        int int9 = building8.height;
        java.lang.Class<?> wildcardClass10 = building8.getClass();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        com.thealgorithms.others.SkylineProblem skylineProblem0 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building4 = skylineProblem0.new Building((int) '#', 100, 0);
        building4.right = (short) -1;
        int int7 = building4.right;
        building4.right = (short) 1;
        int int10 = building4.left;
        java.lang.Class<?> wildcardClass11 = building4.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        com.thealgorithms.others.SkylineProblem skylineProblem0 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building4 = skylineProblem0.new Building((int) '#', 100, 0);
        com.thealgorithms.others.SkylineProblem.Building building8 = skylineProblem0.new Building((int) (short) 10, 10, 0);
        com.thealgorithms.others.SkylineProblem.Skyline skyline11 = skylineProblem0.new Skyline((int) '4', (int) (byte) 0);
        com.thealgorithms.others.SkylineProblem skylineProblem12 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building16 = skylineProblem12.new Building((int) '#', 100, 0);
        com.thealgorithms.others.SkylineProblem.Skyline[] skylineArray17 = new com.thealgorithms.others.SkylineProblem.Skyline[] {};
        java.util.ArrayList<com.thealgorithms.others.SkylineProblem.Skyline> skylineList18 = new java.util.ArrayList<com.thealgorithms.others.SkylineProblem.Skyline>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<com.thealgorithms.others.SkylineProblem.Skyline>) skylineList18, skylineArray17);
        skylineProblem12.print(skylineList18);
        com.thealgorithms.others.SkylineProblem skylineProblem21 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building25 = skylineProblem21.new Building((int) '#', 100, 0);
        com.thealgorithms.others.SkylineProblem.Building building29 = skylineProblem21.new Building((int) (short) 10, 10, 0);
        com.thealgorithms.others.SkylineProblem.Skyline skyline32 = skylineProblem21.new Skyline((int) '4', (int) (byte) 0);
        skyline32.height = (short) 10;
        com.thealgorithms.others.SkylineProblem skylineProblem35 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building39 = skylineProblem35.new Building((int) '#', 100, 0);
        com.thealgorithms.others.SkylineProblem.Building building43 = skylineProblem35.new Building((int) (short) 10, 10, 0);
        com.thealgorithms.others.SkylineProblem.Skyline skyline46 = skylineProblem35.new Skyline((int) '4', (int) (byte) 0);
        skyline46.height = (short) 10;
        com.thealgorithms.others.SkylineProblem.Skyline[] skylineArray49 = new com.thealgorithms.others.SkylineProblem.Skyline[] { skyline32, skyline46 };
        java.util.ArrayList<com.thealgorithms.others.SkylineProblem.Skyline> skylineList50 = new java.util.ArrayList<com.thealgorithms.others.SkylineProblem.Skyline>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<com.thealgorithms.others.SkylineProblem.Skyline>) skylineList50, skylineArray49);
        java.util.ArrayList<com.thealgorithms.others.SkylineProblem.Skyline> skylineList52 = skylineProblem0.mergeSkyline(skylineList18, skylineList50);
        java.lang.Class<?> wildcardClass53 = skylineProblem0.getClass();
        org.junit.Assert.assertNotNull(skylineArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(skylineArray49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(skylineList52);
        org.junit.Assert.assertNotNull(wildcardClass53);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        com.thealgorithms.others.SkylineProblem skylineProblem0 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building4 = skylineProblem0.new Building((int) '#', 100, 0);
        com.thealgorithms.others.SkylineProblem.Building building8 = skylineProblem0.new Building((int) (short) 10, 10, 0);
        com.thealgorithms.others.SkylineProblem.Skyline skyline11 = skylineProblem0.new Skyline((int) '4', (int) (byte) 0);
        com.thealgorithms.others.SkylineProblem.Skyline skyline14 = skylineProblem0.new Skyline((int) '#', (int) (byte) -1);
        skyline14.height = (byte) 1;
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        com.thealgorithms.others.SkylineProblem skylineProblem0 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building4 = skylineProblem0.new Building((int) '#', 100, 0);
        com.thealgorithms.others.SkylineProblem.Building building8 = skylineProblem0.new Building((int) (short) 10, 10, 0);
        int int9 = building8.height;
        building8.left = '#';
        building8.right = (byte) 100;
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        com.thealgorithms.others.SkylineProblem skylineProblem0 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building4 = skylineProblem0.new Building((int) '#', 100, 0);
        com.thealgorithms.others.SkylineProblem.Building building8 = skylineProblem0.new Building((int) (short) 10, 10, 0);
        com.thealgorithms.others.SkylineProblem.Skyline skyline11 = skylineProblem0.new Skyline((int) '4', (int) (byte) 0);
        skyline11.height = 0;
        skyline11.coordinates = 0;
        skyline11.height = (byte) 100;
        int int18 = skyline11.coordinates;
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        com.thealgorithms.others.SkylineProblem skylineProblem0 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building4 = skylineProblem0.new Building((int) '#', 100, 0);
        com.thealgorithms.others.SkylineProblem.Building building8 = skylineProblem0.new Building((int) (short) 10, 10, 0);
        com.thealgorithms.others.SkylineProblem.Skyline skyline11 = skylineProblem0.new Skyline((int) '4', (int) (byte) 0);
        skyline11.height = 0;
        int int14 = skyline11.height;
        skyline11.height = '#';
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        com.thealgorithms.others.SkylineProblem skylineProblem0 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building4 = skylineProblem0.new Building((int) '#', 100, 0);
        building4.left = (byte) 1;
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        com.thealgorithms.others.SkylineProblem skylineProblem0 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building4 = skylineProblem0.new Building((int) '#', 100, 0);
        com.thealgorithms.others.SkylineProblem.Building building8 = skylineProblem0.new Building((int) (short) 10, 10, 0);
        com.thealgorithms.others.SkylineProblem.Skyline skyline11 = skylineProblem0.new Skyline((int) '4', (int) (byte) 0);
        com.thealgorithms.others.SkylineProblem.Skyline skyline14 = skylineProblem0.new Skyline((int) '#', 10);
        int int15 = skyline14.height;
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        com.thealgorithms.others.SkylineProblem skylineProblem0 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building4 = skylineProblem0.new Building((int) '#', 100, 0);
        building4.right = (short) -1;
        int int7 = building4.right;
        int int8 = building4.right;
        building4.right = 100;
        int int11 = building4.height;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        com.thealgorithms.others.SkylineProblem skylineProblem0 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building4 = skylineProblem0.new Building((int) '#', 100, 0);
        com.thealgorithms.others.SkylineProblem.Skyline[] skylineArray5 = new com.thealgorithms.others.SkylineProblem.Skyline[] {};
        java.util.ArrayList<com.thealgorithms.others.SkylineProblem.Skyline> skylineList6 = new java.util.ArrayList<com.thealgorithms.others.SkylineProblem.Skyline>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<com.thealgorithms.others.SkylineProblem.Skyline>) skylineList6, skylineArray5);
        skylineProblem0.print(skylineList6);
        com.thealgorithms.others.SkylineProblem.Skyline skyline11 = skylineProblem0.new Skyline((-1), (int) '#');
        skyline11.height = 35;
        skyline11.coordinates = 52;
        org.junit.Assert.assertNotNull(skylineArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        com.thealgorithms.others.SkylineProblem skylineProblem0 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building4 = skylineProblem0.new Building((int) '#', 100, 0);
        building4.right = (short) -1;
        building4.right = (short) 10;
        int int9 = building4.right;
        java.lang.Class<?> wildcardClass10 = building4.getClass();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        com.thealgorithms.others.SkylineProblem skylineProblem0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.SkylineProblem.Building building4 = skylineProblem0.new Building((int) (byte) 0, (int) (short) -1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to com.thealgorithms.others.SkylineProblem$Building with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        com.thealgorithms.others.SkylineProblem skylineProblem0 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building4 = skylineProblem0.new Building((int) '#', 100, 0);
        com.thealgorithms.others.SkylineProblem.Building building8 = skylineProblem0.new Building((int) (short) 10, 10, 0);
        building8.height = 0;
        building8.left = '4';
        building8.right = 1;
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        com.thealgorithms.others.SkylineProblem skylineProblem0 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building4 = skylineProblem0.new Building((int) '#', 100, 0);
        building4.right = (short) -1;
        int int7 = building4.height;
        int int8 = building4.right;
        building4.right = (-1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        com.thealgorithms.others.SkylineProblem skylineProblem0 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building4 = skylineProblem0.new Building((int) '#', 100, 0);
        com.thealgorithms.others.SkylineProblem.Building building8 = skylineProblem0.new Building((int) (short) 10, 10, 0);
        com.thealgorithms.others.SkylineProblem.Skyline skyline11 = skylineProblem0.new Skyline((int) '4', (int) (byte) 0);
        skyline11.height = (short) -1;
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        com.thealgorithms.others.SkylineProblem skylineProblem0 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building4 = skylineProblem0.new Building((int) '#', 100, 0);
        com.thealgorithms.others.SkylineProblem.Building building8 = skylineProblem0.new Building((int) (short) 10, 10, 0);
        com.thealgorithms.others.SkylineProblem.Skyline skyline11 = skylineProblem0.new Skyline((int) '4', (int) (byte) 0);
        skyline11.coordinates = 100;
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        com.thealgorithms.others.SkylineProblem skylineProblem0 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building4 = skylineProblem0.new Building((int) '#', 100, 0);
        com.thealgorithms.others.SkylineProblem.Building building8 = skylineProblem0.new Building((int) (short) 10, 10, 0);
        com.thealgorithms.others.SkylineProblem.Skyline skyline11 = skylineProblem0.new Skyline((int) (short) 1, (int) '4');
        int int12 = skyline11.height;
        skyline11.coordinates = ' ';
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        com.thealgorithms.others.SkylineProblem skylineProblem0 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building4 = skylineProblem0.new Building((int) '#', 100, 0);
        building4.right = (short) -1;
        building4.right = (short) 10;
        int int9 = building4.left;
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        com.thealgorithms.others.SkylineProblem skylineProblem0 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building4 = skylineProblem0.new Building((int) '#', 100, 0);
        int int5 = building4.left;
        int int6 = building4.right;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        com.thealgorithms.others.SkylineProblem skylineProblem0 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building4 = skylineProblem0.new Building((int) '#', 100, 0);
        com.thealgorithms.others.SkylineProblem.Building building8 = skylineProblem0.new Building((int) (short) 10, 10, 0);
        int int9 = building8.height;
        building8.left = 'a';
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        com.thealgorithms.others.SkylineProblem skylineProblem0 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building4 = skylineProblem0.new Building((int) '#', 100, 0);
        building4.right = (short) -1;
        int int7 = building4.right;
        int int8 = building4.height;
        int int9 = building4.left;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        com.thealgorithms.others.SkylineProblem skylineProblem0 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building4 = skylineProblem0.new Building((int) '#', 100, 0);
        com.thealgorithms.others.SkylineProblem.Building building8 = skylineProblem0.new Building((int) (short) 10, 10, 0);
        com.thealgorithms.others.SkylineProblem.Skyline skyline11 = skylineProblem0.new Skyline((int) '4', (int) (byte) 0);
        skyline11.height = (short) 10;
        skyline11.coordinates = (short) 100;
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        com.thealgorithms.others.SkylineProblem skylineProblem0 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building4 = skylineProblem0.new Building((int) '#', 100, 0);
        com.thealgorithms.others.SkylineProblem.Building building8 = skylineProblem0.new Building((int) (short) 10, 10, 0);
        com.thealgorithms.others.SkylineProblem.Skyline skyline11 = skylineProblem0.new Skyline((int) (short) 1, (int) '4');
        skyline11.coordinates = (short) 100;
        skyline11.height = 10;
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        com.thealgorithms.others.SkylineProblem skylineProblem0 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building4 = skylineProblem0.new Building((int) '#', 100, 0);
        com.thealgorithms.others.SkylineProblem.Building building8 = skylineProblem0.new Building((int) (short) 10, 10, 0);
        com.thealgorithms.others.SkylineProblem.Skyline skyline11 = skylineProblem0.new Skyline((int) (short) 1, (int) '4');
        int int12 = skyline11.height;
        skyline11.coordinates = 1;
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        com.thealgorithms.others.SkylineProblem skylineProblem0 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building4 = skylineProblem0.new Building((int) '#', 100, 0);
        building4.right = (short) -1;
        int int7 = building4.right;
        building4.right = (short) 1;
        int int10 = building4.right;
        int int11 = building4.left;
        building4.left = (short) 1;
        int int14 = building4.height;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        com.thealgorithms.others.SkylineProblem skylineProblem0 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building4 = skylineProblem0.new Building((int) '#', 100, 0);
        com.thealgorithms.others.SkylineProblem.Building building8 = skylineProblem0.new Building((int) (short) 10, 10, 0);
        com.thealgorithms.others.SkylineProblem.Skyline skyline11 = skylineProblem0.new Skyline((int) '4', (int) (byte) 0);
        com.thealgorithms.others.SkylineProblem skylineProblem12 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building16 = skylineProblem12.new Building((int) '#', 100, 0);
        com.thealgorithms.others.SkylineProblem.Skyline[] skylineArray17 = new com.thealgorithms.others.SkylineProblem.Skyline[] {};
        java.util.ArrayList<com.thealgorithms.others.SkylineProblem.Skyline> skylineList18 = new java.util.ArrayList<com.thealgorithms.others.SkylineProblem.Skyline>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<com.thealgorithms.others.SkylineProblem.Skyline>) skylineList18, skylineArray17);
        skylineProblem12.print(skylineList18);
        com.thealgorithms.others.SkylineProblem skylineProblem21 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building25 = skylineProblem21.new Building((int) '#', 100, 0);
        com.thealgorithms.others.SkylineProblem.Building building29 = skylineProblem21.new Building((int) (short) 10, 10, 0);
        com.thealgorithms.others.SkylineProblem skylineProblem30 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building34 = skylineProblem30.new Building((int) '#', 100, 0);
        com.thealgorithms.others.SkylineProblem.Skyline[] skylineArray35 = new com.thealgorithms.others.SkylineProblem.Skyline[] {};
        java.util.ArrayList<com.thealgorithms.others.SkylineProblem.Skyline> skylineList36 = new java.util.ArrayList<com.thealgorithms.others.SkylineProblem.Skyline>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<com.thealgorithms.others.SkylineProblem.Skyline>) skylineList36, skylineArray35);
        skylineProblem30.print(skylineList36);
        com.thealgorithms.others.SkylineProblem skylineProblem39 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building43 = skylineProblem39.new Building((int) '#', 100, 0);
        com.thealgorithms.others.SkylineProblem.Building building47 = skylineProblem39.new Building((int) (short) 10, 10, 0);
        com.thealgorithms.others.SkylineProblem.Skyline skyline50 = skylineProblem39.new Skyline((int) '4', (int) (byte) 0);
        com.thealgorithms.others.SkylineProblem skylineProblem51 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building55 = skylineProblem51.new Building((int) '#', 100, 0);
        com.thealgorithms.others.SkylineProblem.Skyline[] skylineArray56 = new com.thealgorithms.others.SkylineProblem.Skyline[] {};
        java.util.ArrayList<com.thealgorithms.others.SkylineProblem.Skyline> skylineList57 = new java.util.ArrayList<com.thealgorithms.others.SkylineProblem.Skyline>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<com.thealgorithms.others.SkylineProblem.Skyline>) skylineList57, skylineArray56);
        skylineProblem51.print(skylineList57);
        com.thealgorithms.others.SkylineProblem skylineProblem60 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building64 = skylineProblem60.new Building((int) '#', 100, 0);
        com.thealgorithms.others.SkylineProblem.Building building68 = skylineProblem60.new Building((int) (short) 10, 10, 0);
        com.thealgorithms.others.SkylineProblem.Skyline skyline71 = skylineProblem60.new Skyline((int) '4', (int) (byte) 0);
        skyline71.height = (short) 10;
        com.thealgorithms.others.SkylineProblem skylineProblem74 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building78 = skylineProblem74.new Building((int) '#', 100, 0);
        com.thealgorithms.others.SkylineProblem.Building building82 = skylineProblem74.new Building((int) (short) 10, 10, 0);
        com.thealgorithms.others.SkylineProblem.Skyline skyline85 = skylineProblem74.new Skyline((int) '4', (int) (byte) 0);
        skyline85.height = (short) 10;
        com.thealgorithms.others.SkylineProblem.Skyline[] skylineArray88 = new com.thealgorithms.others.SkylineProblem.Skyline[] { skyline71, skyline85 };
        java.util.ArrayList<com.thealgorithms.others.SkylineProblem.Skyline> skylineList89 = new java.util.ArrayList<com.thealgorithms.others.SkylineProblem.Skyline>();
        boolean boolean90 = java.util.Collections.addAll((java.util.Collection<com.thealgorithms.others.SkylineProblem.Skyline>) skylineList89, skylineArray88);
        java.util.ArrayList<com.thealgorithms.others.SkylineProblem.Skyline> skylineList91 = skylineProblem39.mergeSkyline(skylineList57, skylineList89);
        java.util.ArrayList<com.thealgorithms.others.SkylineProblem.Skyline> skylineList92 = skylineProblem21.mergeSkyline(skylineList36, skylineList57);
        skylineProblem12.print(skylineList36);
        skylineProblem0.print(skylineList36);
        org.junit.Assert.assertNotNull(skylineArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(skylineArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(skylineArray56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(skylineArray88);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + true + "'", boolean90 == true);
        org.junit.Assert.assertNotNull(skylineList91);
        org.junit.Assert.assertNotNull(skylineList92);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        com.thealgorithms.others.SkylineProblem skylineProblem0 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building4 = skylineProblem0.new Building((int) '#', 100, 0);
        building4.right = (short) -1;
        building4.height = 52;
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        com.thealgorithms.others.SkylineProblem skylineProblem0 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building4 = skylineProblem0.new Building((int) '#', 100, 0);
        com.thealgorithms.others.SkylineProblem.Building building8 = skylineProblem0.new Building((int) (short) 10, 10, 0);
        com.thealgorithms.others.SkylineProblem.Skyline skyline11 = skylineProblem0.new Skyline((int) '4', (int) (byte) 0);
        com.thealgorithms.others.SkylineProblem.Skyline skyline14 = skylineProblem0.new Skyline((int) '#', (int) (byte) -1);
        com.thealgorithms.others.SkylineProblem.Building building18 = skylineProblem0.new Building((int) (short) 10, (int) (byte) 1, (int) (short) 1);
        com.thealgorithms.others.SkylineProblem.Skyline skyline21 = skylineProblem0.new Skyline((int) (byte) 1, (int) (short) 1);
        com.thealgorithms.others.SkylineProblem.Building building25 = skylineProblem0.new Building((int) (byte) 1, (int) (short) 1, (int) (byte) 10);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        com.thealgorithms.others.SkylineProblem skylineProblem0 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building4 = skylineProblem0.new Building((int) '#', 100, 0);
        com.thealgorithms.others.SkylineProblem.Skyline[] skylineArray5 = new com.thealgorithms.others.SkylineProblem.Skyline[] {};
        java.util.ArrayList<com.thealgorithms.others.SkylineProblem.Skyline> skylineList6 = new java.util.ArrayList<com.thealgorithms.others.SkylineProblem.Skyline>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<com.thealgorithms.others.SkylineProblem.Skyline>) skylineList6, skylineArray5);
        skylineProblem0.print(skylineList6);
        com.thealgorithms.others.SkylineProblem.Skyline skyline11 = skylineProblem0.new Skyline(0, 10);
        org.junit.Assert.assertNotNull(skylineArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        com.thealgorithms.others.SkylineProblem skylineProblem0 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building4 = skylineProblem0.new Building((int) '#', 100, 0);
        int int5 = building4.left;
        building4.right = (byte) 0;
        int int8 = building4.height;
        building4.right = (short) 100;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        com.thealgorithms.others.SkylineProblem skylineProblem0 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building4 = skylineProblem0.new Building((int) '#', 100, 0);
        com.thealgorithms.others.SkylineProblem.Skyline[] skylineArray5 = new com.thealgorithms.others.SkylineProblem.Skyline[] {};
        java.util.ArrayList<com.thealgorithms.others.SkylineProblem.Skyline> skylineList6 = new java.util.ArrayList<com.thealgorithms.others.SkylineProblem.Skyline>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<com.thealgorithms.others.SkylineProblem.Skyline>) skylineList6, skylineArray5);
        skylineProblem0.print(skylineList6);
        com.thealgorithms.others.SkylineProblem.Skyline skyline11 = skylineProblem0.new Skyline((-1), (int) '#');
        com.thealgorithms.others.SkylineProblem skylineProblem12 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building16 = skylineProblem12.new Building((int) '#', 100, 0);
        com.thealgorithms.others.SkylineProblem.Building building20 = skylineProblem12.new Building((int) (short) 10, 10, 0);
        com.thealgorithms.others.SkylineProblem skylineProblem21 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building25 = skylineProblem21.new Building((int) '#', 100, 0);
        com.thealgorithms.others.SkylineProblem.Skyline[] skylineArray26 = new com.thealgorithms.others.SkylineProblem.Skyline[] {};
        java.util.ArrayList<com.thealgorithms.others.SkylineProblem.Skyline> skylineList27 = new java.util.ArrayList<com.thealgorithms.others.SkylineProblem.Skyline>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<com.thealgorithms.others.SkylineProblem.Skyline>) skylineList27, skylineArray26);
        skylineProblem21.print(skylineList27);
        com.thealgorithms.others.SkylineProblem skylineProblem30 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building34 = skylineProblem30.new Building((int) '#', 100, 0);
        com.thealgorithms.others.SkylineProblem.Building building38 = skylineProblem30.new Building((int) (short) 10, 10, 0);
        com.thealgorithms.others.SkylineProblem.Skyline skyline41 = skylineProblem30.new Skyline((int) '4', (int) (byte) 0);
        com.thealgorithms.others.SkylineProblem skylineProblem42 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building46 = skylineProblem42.new Building((int) '#', 100, 0);
        com.thealgorithms.others.SkylineProblem.Skyline[] skylineArray47 = new com.thealgorithms.others.SkylineProblem.Skyline[] {};
        java.util.ArrayList<com.thealgorithms.others.SkylineProblem.Skyline> skylineList48 = new java.util.ArrayList<com.thealgorithms.others.SkylineProblem.Skyline>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<com.thealgorithms.others.SkylineProblem.Skyline>) skylineList48, skylineArray47);
        skylineProblem42.print(skylineList48);
        com.thealgorithms.others.SkylineProblem skylineProblem51 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building55 = skylineProblem51.new Building((int) '#', 100, 0);
        com.thealgorithms.others.SkylineProblem.Building building59 = skylineProblem51.new Building((int) (short) 10, 10, 0);
        com.thealgorithms.others.SkylineProblem.Skyline skyline62 = skylineProblem51.new Skyline((int) '4', (int) (byte) 0);
        skyline62.height = (short) 10;
        com.thealgorithms.others.SkylineProblem skylineProblem65 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building69 = skylineProblem65.new Building((int) '#', 100, 0);
        com.thealgorithms.others.SkylineProblem.Building building73 = skylineProblem65.new Building((int) (short) 10, 10, 0);
        com.thealgorithms.others.SkylineProblem.Skyline skyline76 = skylineProblem65.new Skyline((int) '4', (int) (byte) 0);
        skyline76.height = (short) 10;
        com.thealgorithms.others.SkylineProblem.Skyline[] skylineArray79 = new com.thealgorithms.others.SkylineProblem.Skyline[] { skyline62, skyline76 };
        java.util.ArrayList<com.thealgorithms.others.SkylineProblem.Skyline> skylineList80 = new java.util.ArrayList<com.thealgorithms.others.SkylineProblem.Skyline>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<com.thealgorithms.others.SkylineProblem.Skyline>) skylineList80, skylineArray79);
        java.util.ArrayList<com.thealgorithms.others.SkylineProblem.Skyline> skylineList82 = skylineProblem30.mergeSkyline(skylineList48, skylineList80);
        java.util.ArrayList<com.thealgorithms.others.SkylineProblem.Skyline> skylineList83 = skylineProblem12.mergeSkyline(skylineList27, skylineList48);
        skylineProblem0.print(skylineList83);
        java.lang.Class<?> wildcardClass85 = skylineList83.getClass();
        org.junit.Assert.assertNotNull(skylineArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(skylineArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(skylineArray47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(skylineArray79);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertNotNull(skylineList82);
        org.junit.Assert.assertNotNull(skylineList83);
        org.junit.Assert.assertNotNull(wildcardClass85);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        com.thealgorithms.others.SkylineProblem skylineProblem0 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building4 = skylineProblem0.new Building((int) '#', 100, 0);
        com.thealgorithms.others.SkylineProblem.Skyline skyline7 = skylineProblem0.new Skyline(10, (int) (byte) 0);
        com.thealgorithms.others.SkylineProblem.Skyline skyline10 = skylineProblem0.new Skyline(100, (int) (short) 0);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        com.thealgorithms.others.SkylineProblem skylineProblem0 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building4 = skylineProblem0.new Building((int) '#', 100, 0);
        com.thealgorithms.others.SkylineProblem.Building building8 = skylineProblem0.new Building((int) (short) 10, 10, 0);
        int int9 = building8.height;
        building8.left = '#';
        int int12 = building8.height;
        building8.right = 0;
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        com.thealgorithms.others.SkylineProblem skylineProblem0 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building4 = skylineProblem0.new Building((int) '#', 100, 0);
        int int5 = building4.left;
        java.lang.Class<?> wildcardClass6 = building4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        com.thealgorithms.others.SkylineProblem skylineProblem0 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building4 = skylineProblem0.new Building((int) '#', 100, 0);
        com.thealgorithms.others.SkylineProblem.Building building8 = skylineProblem0.new Building((int) (short) 10, 10, 0);
        building8.height = 0;
        building8.left = '4';
        building8.right = (short) -1;
        building8.right = (short) 10;
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        com.thealgorithms.others.SkylineProblem skylineProblem0 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building4 = skylineProblem0.new Building((int) '#', 100, 0);
        int int5 = building4.left;
        building4.height = (byte) -1;
        int int8 = building4.left;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        com.thealgorithms.others.SkylineProblem skylineProblem0 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building4 = skylineProblem0.new Building((int) '#', 100, 0);
        com.thealgorithms.others.SkylineProblem.Building building8 = skylineProblem0.new Building((int) (short) 10, 10, 0);
        com.thealgorithms.others.SkylineProblem.Skyline skyline11 = skylineProblem0.new Skyline((int) '4', (int) (byte) 0);
        com.thealgorithms.others.SkylineProblem.Skyline skyline14 = skylineProblem0.new Skyline((int) '#', 10);
        skyline14.coordinates = '4';
        java.lang.Class<?> wildcardClass17 = skyline14.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        com.thealgorithms.others.SkylineProblem skylineProblem0 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building4 = skylineProblem0.new Building((int) '#', 100, 0);
        com.thealgorithms.others.SkylineProblem.Skyline skyline7 = skylineProblem0.new Skyline(10, (int) (byte) 0);
        int int8 = skyline7.height;
        skyline7.height = (byte) 10;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        com.thealgorithms.others.SkylineProblem skylineProblem0 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building4 = skylineProblem0.new Building((int) '#', 100, 0);
        int int5 = building4.left;
        building4.height = (byte) -1;
        building4.right = 52;
        building4.height = 1;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        com.thealgorithms.others.SkylineProblem skylineProblem0 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building4 = skylineProblem0.new Building((int) '#', 100, 0);
        com.thealgorithms.others.SkylineProblem.Building building8 = skylineProblem0.new Building((int) (short) 10, 10, 0);
        com.thealgorithms.others.SkylineProblem.Skyline skyline11 = skylineProblem0.new Skyline((int) '4', (int) (byte) 0);
        skyline11.height = 100;
        skyline11.height = 0;
        skyline11.height = 0;
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        com.thealgorithms.others.SkylineProblem skylineProblem0 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building4 = skylineProblem0.new Building((int) (short) 10, 35, (int) (short) 100);
        building4.right = 52;
        int int7 = building4.left;
        int int8 = building4.left;
        building4.left = (byte) 0;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        com.thealgorithms.others.SkylineProblem skylineProblem0 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building4 = skylineProblem0.new Building((int) (short) 10, 35, (int) (short) 100);
        building4.right = 52;
        building4.left = ' ';
        int int9 = building4.right;
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        com.thealgorithms.others.SkylineProblem skylineProblem0 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building4 = skylineProblem0.new Building((int) '#', 100, 0);
        com.thealgorithms.others.SkylineProblem.Building building8 = skylineProblem0.new Building((int) (short) 10, 10, 0);
        building8.height = 0;
        building8.left = '4';
        building8.right = 0;
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        com.thealgorithms.others.SkylineProblem skylineProblem0 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building4 = skylineProblem0.new Building((int) '#', 100, 0);
        com.thealgorithms.others.SkylineProblem.Skyline skyline7 = skylineProblem0.new Skyline(10, (int) (byte) 0);
        com.thealgorithms.others.SkylineProblem skylineProblem8 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building12 = skylineProblem8.new Building((int) '#', 100, 0);
        com.thealgorithms.others.SkylineProblem.Building building16 = skylineProblem8.new Building((int) (short) 10, 10, 0);
        com.thealgorithms.others.SkylineProblem.Skyline skyline19 = skylineProblem8.new Skyline((int) '4', (int) (byte) 0);
        com.thealgorithms.others.SkylineProblem skylineProblem20 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building24 = skylineProblem20.new Building((int) '#', 100, 0);
        com.thealgorithms.others.SkylineProblem.Skyline[] skylineArray25 = new com.thealgorithms.others.SkylineProblem.Skyline[] {};
        java.util.ArrayList<com.thealgorithms.others.SkylineProblem.Skyline> skylineList26 = new java.util.ArrayList<com.thealgorithms.others.SkylineProblem.Skyline>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<com.thealgorithms.others.SkylineProblem.Skyline>) skylineList26, skylineArray25);
        skylineProblem20.print(skylineList26);
        com.thealgorithms.others.SkylineProblem skylineProblem29 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building33 = skylineProblem29.new Building((int) '#', 100, 0);
        com.thealgorithms.others.SkylineProblem.Building building37 = skylineProblem29.new Building((int) (short) 10, 10, 0);
        com.thealgorithms.others.SkylineProblem.Skyline skyline40 = skylineProblem29.new Skyline((int) '4', (int) (byte) 0);
        skyline40.height = (short) 10;
        com.thealgorithms.others.SkylineProblem skylineProblem43 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building47 = skylineProblem43.new Building((int) '#', 100, 0);
        com.thealgorithms.others.SkylineProblem.Building building51 = skylineProblem43.new Building((int) (short) 10, 10, 0);
        com.thealgorithms.others.SkylineProblem.Skyline skyline54 = skylineProblem43.new Skyline((int) '4', (int) (byte) 0);
        skyline54.height = (short) 10;
        com.thealgorithms.others.SkylineProblem.Skyline[] skylineArray57 = new com.thealgorithms.others.SkylineProblem.Skyline[] { skyline40, skyline54 };
        java.util.ArrayList<com.thealgorithms.others.SkylineProblem.Skyline> skylineList58 = new java.util.ArrayList<com.thealgorithms.others.SkylineProblem.Skyline>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<com.thealgorithms.others.SkylineProblem.Skyline>) skylineList58, skylineArray57);
        java.util.ArrayList<com.thealgorithms.others.SkylineProblem.Skyline> skylineList60 = skylineProblem8.mergeSkyline(skylineList26, skylineList58);
        skylineProblem0.print(skylineList60);
        com.thealgorithms.others.SkylineProblem.Skyline skyline64 = skylineProblem0.new Skyline((int) 'a', 1);
        skyline64.height = (byte) 1;
        org.junit.Assert.assertNotNull(skylineArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(skylineArray57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(skylineList60);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        com.thealgorithms.others.SkylineProblem skylineProblem0 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building4 = skylineProblem0.new Building((int) '#', 100, 0);
        com.thealgorithms.others.SkylineProblem.Building building8 = skylineProblem0.new Building((int) (short) 10, 10, 0);
        com.thealgorithms.others.SkylineProblem.Skyline skyline11 = skylineProblem0.new Skyline((int) '4', (int) (byte) 0);
        skyline11.height = (short) 10;
        skyline11.height = 'a';
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        com.thealgorithms.others.SkylineProblem skylineProblem0 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building4 = skylineProblem0.new Building((int) '#', 100, 0);
        int int5 = building4.left;
        building4.height = (byte) -1;
        int int8 = building4.right;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        com.thealgorithms.others.SkylineProblem skylineProblem0 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building4 = skylineProblem0.new Building((int) '#', 100, 0);
        com.thealgorithms.others.SkylineProblem.Skyline skyline7 = skylineProblem0.new Skyline(10, (int) (byte) 0);
        int int8 = skyline7.coordinates;
        int int9 = skyline7.coordinates;
        int int10 = skyline7.coordinates;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        com.thealgorithms.others.SkylineProblem skylineProblem0 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building4 = skylineProblem0.new Building((int) '#', 100, 0);
        int int5 = building4.left;
        building4.right = (byte) 0;
        building4.right = (short) 0;
        building4.height = 35;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        com.thealgorithms.others.SkylineProblem skylineProblem0 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building4 = skylineProblem0.new Building((int) '#', 100, 0);
        com.thealgorithms.others.SkylineProblem.Building building8 = skylineProblem0.new Building((int) (short) 10, 10, 0);
        com.thealgorithms.others.SkylineProblem skylineProblem9 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building13 = skylineProblem9.new Building((int) '#', 100, 0);
        com.thealgorithms.others.SkylineProblem.Skyline[] skylineArray14 = new com.thealgorithms.others.SkylineProblem.Skyline[] {};
        java.util.ArrayList<com.thealgorithms.others.SkylineProblem.Skyline> skylineList15 = new java.util.ArrayList<com.thealgorithms.others.SkylineProblem.Skyline>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<com.thealgorithms.others.SkylineProblem.Skyline>) skylineList15, skylineArray14);
        skylineProblem9.print(skylineList15);
        com.thealgorithms.others.SkylineProblem skylineProblem18 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building22 = skylineProblem18.new Building((int) '#', 100, 0);
        com.thealgorithms.others.SkylineProblem.Building building26 = skylineProblem18.new Building((int) (short) 10, 10, 0);
        com.thealgorithms.others.SkylineProblem.Skyline skyline29 = skylineProblem18.new Skyline((int) '4', (int) (byte) 0);
        com.thealgorithms.others.SkylineProblem skylineProblem30 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building34 = skylineProblem30.new Building((int) '#', 100, 0);
        com.thealgorithms.others.SkylineProblem.Skyline[] skylineArray35 = new com.thealgorithms.others.SkylineProblem.Skyline[] {};
        java.util.ArrayList<com.thealgorithms.others.SkylineProblem.Skyline> skylineList36 = new java.util.ArrayList<com.thealgorithms.others.SkylineProblem.Skyline>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<com.thealgorithms.others.SkylineProblem.Skyline>) skylineList36, skylineArray35);
        skylineProblem30.print(skylineList36);
        com.thealgorithms.others.SkylineProblem skylineProblem39 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building43 = skylineProblem39.new Building((int) '#', 100, 0);
        com.thealgorithms.others.SkylineProblem.Building building47 = skylineProblem39.new Building((int) (short) 10, 10, 0);
        com.thealgorithms.others.SkylineProblem.Skyline skyline50 = skylineProblem39.new Skyline((int) '4', (int) (byte) 0);
        skyline50.height = (short) 10;
        com.thealgorithms.others.SkylineProblem skylineProblem53 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building57 = skylineProblem53.new Building((int) '#', 100, 0);
        com.thealgorithms.others.SkylineProblem.Building building61 = skylineProblem53.new Building((int) (short) 10, 10, 0);
        com.thealgorithms.others.SkylineProblem.Skyline skyline64 = skylineProblem53.new Skyline((int) '4', (int) (byte) 0);
        skyline64.height = (short) 10;
        com.thealgorithms.others.SkylineProblem.Skyline[] skylineArray67 = new com.thealgorithms.others.SkylineProblem.Skyline[] { skyline50, skyline64 };
        java.util.ArrayList<com.thealgorithms.others.SkylineProblem.Skyline> skylineList68 = new java.util.ArrayList<com.thealgorithms.others.SkylineProblem.Skyline>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<com.thealgorithms.others.SkylineProblem.Skyline>) skylineList68, skylineArray67);
        java.util.ArrayList<com.thealgorithms.others.SkylineProblem.Skyline> skylineList70 = skylineProblem18.mergeSkyline(skylineList36, skylineList68);
        java.util.ArrayList<com.thealgorithms.others.SkylineProblem.Skyline> skylineList71 = skylineProblem0.mergeSkyline(skylineList15, skylineList36);
        com.thealgorithms.others.SkylineProblem.Building building75 = skylineProblem0.new Building(100, (int) (short) 1, (int) 'a');
        building75.right = (short) 10;
        int int78 = building75.left;
        org.junit.Assert.assertNotNull(skylineArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(skylineArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(skylineArray67);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertNotNull(skylineList70);
        org.junit.Assert.assertNotNull(skylineList71);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 100 + "'", int78 == 100);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        com.thealgorithms.others.SkylineProblem skylineProblem0 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building4 = skylineProblem0.new Building((int) '#', 100, 0);
        com.thealgorithms.others.SkylineProblem.Building building8 = skylineProblem0.new Building((int) (short) 10, 10, 0);
        building8.height = 0;
        building8.left = '4';
        building8.right = (byte) 1;
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        com.thealgorithms.others.SkylineProblem skylineProblem0 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building4 = skylineProblem0.new Building((int) '#', 100, 0);
        com.thealgorithms.others.SkylineProblem.Skyline[] skylineArray5 = new com.thealgorithms.others.SkylineProblem.Skyline[] {};
        java.util.ArrayList<com.thealgorithms.others.SkylineProblem.Skyline> skylineList6 = new java.util.ArrayList<com.thealgorithms.others.SkylineProblem.Skyline>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<com.thealgorithms.others.SkylineProblem.Skyline>) skylineList6, skylineArray5);
        skylineProblem0.print(skylineList6);
        com.thealgorithms.others.SkylineProblem.Skyline skyline11 = skylineProblem0.new Skyline((-1), (int) '#');
        java.lang.Class<?> wildcardClass12 = skyline11.getClass();
        org.junit.Assert.assertNotNull(skylineArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        com.thealgorithms.others.SkylineProblem skylineProblem0 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building4 = skylineProblem0.new Building((int) '#', 100, 0);
        com.thealgorithms.others.SkylineProblem.Skyline skyline7 = skylineProblem0.new Skyline(10, (int) (byte) 0);
        com.thealgorithms.others.SkylineProblem skylineProblem8 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building12 = skylineProblem8.new Building((int) '#', 100, 0);
        com.thealgorithms.others.SkylineProblem.Building building16 = skylineProblem8.new Building((int) (short) 10, 10, 0);
        com.thealgorithms.others.SkylineProblem.Skyline skyline19 = skylineProblem8.new Skyline((int) '4', (int) (byte) 0);
        com.thealgorithms.others.SkylineProblem skylineProblem20 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building24 = skylineProblem20.new Building((int) '#', 100, 0);
        com.thealgorithms.others.SkylineProblem.Skyline[] skylineArray25 = new com.thealgorithms.others.SkylineProblem.Skyline[] {};
        java.util.ArrayList<com.thealgorithms.others.SkylineProblem.Skyline> skylineList26 = new java.util.ArrayList<com.thealgorithms.others.SkylineProblem.Skyline>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<com.thealgorithms.others.SkylineProblem.Skyline>) skylineList26, skylineArray25);
        skylineProblem20.print(skylineList26);
        com.thealgorithms.others.SkylineProblem skylineProblem29 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building33 = skylineProblem29.new Building((int) '#', 100, 0);
        com.thealgorithms.others.SkylineProblem.Building building37 = skylineProblem29.new Building((int) (short) 10, 10, 0);
        com.thealgorithms.others.SkylineProblem.Skyline skyline40 = skylineProblem29.new Skyline((int) '4', (int) (byte) 0);
        skyline40.height = (short) 10;
        com.thealgorithms.others.SkylineProblem skylineProblem43 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building47 = skylineProblem43.new Building((int) '#', 100, 0);
        com.thealgorithms.others.SkylineProblem.Building building51 = skylineProblem43.new Building((int) (short) 10, 10, 0);
        com.thealgorithms.others.SkylineProblem.Skyline skyline54 = skylineProblem43.new Skyline((int) '4', (int) (byte) 0);
        skyline54.height = (short) 10;
        com.thealgorithms.others.SkylineProblem.Skyline[] skylineArray57 = new com.thealgorithms.others.SkylineProblem.Skyline[] { skyline40, skyline54 };
        java.util.ArrayList<com.thealgorithms.others.SkylineProblem.Skyline> skylineList58 = new java.util.ArrayList<com.thealgorithms.others.SkylineProblem.Skyline>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<com.thealgorithms.others.SkylineProblem.Skyline>) skylineList58, skylineArray57);
        java.util.ArrayList<com.thealgorithms.others.SkylineProblem.Skyline> skylineList60 = skylineProblem8.mergeSkyline(skylineList26, skylineList58);
        skylineProblem0.print(skylineList60);
        com.thealgorithms.others.SkylineProblem.Building building65 = skylineProblem0.new Building((-1), (int) (byte) 100, (int) '#');
        org.junit.Assert.assertNotNull(skylineArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(skylineArray57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(skylineList60);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        com.thealgorithms.others.SkylineProblem skylineProblem0 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building4 = skylineProblem0.new Building((int) '4', (int) ' ', 100);
        com.thealgorithms.others.SkylineProblem.Skyline skyline7 = skylineProblem0.new Skyline(35, (int) (byte) 1);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        com.thealgorithms.others.SkylineProblem skylineProblem0 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building4 = skylineProblem0.new Building((int) '#', 100, 0);
        com.thealgorithms.others.SkylineProblem.Building building8 = skylineProblem0.new Building((int) (short) 10, 10, 0);
        com.thealgorithms.others.SkylineProblem.Skyline skyline11 = skylineProblem0.new Skyline((int) (short) 1, (int) '4');
        java.util.ArrayList<com.thealgorithms.others.SkylineProblem.Skyline> skylineList12 = null;
        // The following exception was thrown during execution in test generation
        try {
            skylineProblem0.print(skylineList12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.ArrayList.iterator()\" because \"skyline\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        com.thealgorithms.others.SkylineProblem skylineProblem0 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building4 = skylineProblem0.new Building((int) '#', 100, 0);
        com.thealgorithms.others.SkylineProblem.Skyline[] skylineArray5 = new com.thealgorithms.others.SkylineProblem.Skyline[] {};
        java.util.ArrayList<com.thealgorithms.others.SkylineProblem.Skyline> skylineList6 = new java.util.ArrayList<com.thealgorithms.others.SkylineProblem.Skyline>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<com.thealgorithms.others.SkylineProblem.Skyline>) skylineList6, skylineArray5);
        skylineProblem0.print(skylineList6);
        com.thealgorithms.others.SkylineProblem.Skyline skyline11 = skylineProblem0.new Skyline((-1), (int) '#');
        int int12 = skyline11.height;
        org.junit.Assert.assertNotNull(skylineArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        com.thealgorithms.others.SkylineProblem skylineProblem0 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building4 = skylineProblem0.new Building((int) '#', 100, 0);
        com.thealgorithms.others.SkylineProblem.Skyline skyline7 = skylineProblem0.new Skyline(10, (int) (byte) 0);
        com.thealgorithms.others.SkylineProblem.Building building11 = skylineProblem0.new Building((int) (byte) 100, (int) '4', 0);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        com.thealgorithms.others.SkylineProblem skylineProblem0 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building4 = skylineProblem0.new Building((int) '#', 100, 0);
        com.thealgorithms.others.SkylineProblem.Building building8 = skylineProblem0.new Building((int) (short) 10, 10, 0);
        com.thealgorithms.others.SkylineProblem skylineProblem9 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building13 = skylineProblem9.new Building((int) '#', 100, 0);
        com.thealgorithms.others.SkylineProblem.Skyline[] skylineArray14 = new com.thealgorithms.others.SkylineProblem.Skyline[] {};
        java.util.ArrayList<com.thealgorithms.others.SkylineProblem.Skyline> skylineList15 = new java.util.ArrayList<com.thealgorithms.others.SkylineProblem.Skyline>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<com.thealgorithms.others.SkylineProblem.Skyline>) skylineList15, skylineArray14);
        skylineProblem9.print(skylineList15);
        com.thealgorithms.others.SkylineProblem skylineProblem18 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building22 = skylineProblem18.new Building((int) '#', 100, 0);
        com.thealgorithms.others.SkylineProblem.Building building26 = skylineProblem18.new Building((int) (short) 10, 10, 0);
        com.thealgorithms.others.SkylineProblem.Skyline skyline29 = skylineProblem18.new Skyline((int) '4', (int) (byte) 0);
        com.thealgorithms.others.SkylineProblem skylineProblem30 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building34 = skylineProblem30.new Building((int) '#', 100, 0);
        com.thealgorithms.others.SkylineProblem.Skyline[] skylineArray35 = new com.thealgorithms.others.SkylineProblem.Skyline[] {};
        java.util.ArrayList<com.thealgorithms.others.SkylineProblem.Skyline> skylineList36 = new java.util.ArrayList<com.thealgorithms.others.SkylineProblem.Skyline>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<com.thealgorithms.others.SkylineProblem.Skyline>) skylineList36, skylineArray35);
        skylineProblem30.print(skylineList36);
        com.thealgorithms.others.SkylineProblem skylineProblem39 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building43 = skylineProblem39.new Building((int) '#', 100, 0);
        com.thealgorithms.others.SkylineProblem.Building building47 = skylineProblem39.new Building((int) (short) 10, 10, 0);
        com.thealgorithms.others.SkylineProblem.Skyline skyline50 = skylineProblem39.new Skyline((int) '4', (int) (byte) 0);
        skyline50.height = (short) 10;
        com.thealgorithms.others.SkylineProblem skylineProblem53 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building57 = skylineProblem53.new Building((int) '#', 100, 0);
        com.thealgorithms.others.SkylineProblem.Building building61 = skylineProblem53.new Building((int) (short) 10, 10, 0);
        com.thealgorithms.others.SkylineProblem.Skyline skyline64 = skylineProblem53.new Skyline((int) '4', (int) (byte) 0);
        skyline64.height = (short) 10;
        com.thealgorithms.others.SkylineProblem.Skyline[] skylineArray67 = new com.thealgorithms.others.SkylineProblem.Skyline[] { skyline50, skyline64 };
        java.util.ArrayList<com.thealgorithms.others.SkylineProblem.Skyline> skylineList68 = new java.util.ArrayList<com.thealgorithms.others.SkylineProblem.Skyline>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<com.thealgorithms.others.SkylineProblem.Skyline>) skylineList68, skylineArray67);
        java.util.ArrayList<com.thealgorithms.others.SkylineProblem.Skyline> skylineList70 = skylineProblem18.mergeSkyline(skylineList36, skylineList68);
        java.util.ArrayList<com.thealgorithms.others.SkylineProblem.Skyline> skylineList71 = skylineProblem0.mergeSkyline(skylineList15, skylineList36);
        com.thealgorithms.others.SkylineProblem.Building building75 = skylineProblem0.new Building(100, (int) (short) 1, (int) 'a');
        building75.right = 10;
        org.junit.Assert.assertNotNull(skylineArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(skylineArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(skylineArray67);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertNotNull(skylineList70);
        org.junit.Assert.assertNotNull(skylineList71);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        com.thealgorithms.others.SkylineProblem skylineProblem0 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building4 = skylineProblem0.new Building((int) '#', 100, 0);
        building4.right = (short) -1;
        int int7 = building4.right;
        int int8 = building4.height;
        building4.right = ' ';
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        com.thealgorithms.others.SkylineProblem skylineProblem0 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building4 = skylineProblem0.new Building((int) '#', 100, 0);
        com.thealgorithms.others.SkylineProblem.Building building8 = skylineProblem0.new Building((int) (short) 10, 10, 0);
        com.thealgorithms.others.SkylineProblem.Skyline skyline11 = skylineProblem0.new Skyline((int) (short) 1, (int) '4');
        com.thealgorithms.others.SkylineProblem.Building building15 = skylineProblem0.new Building(1, 0, (int) (short) 10);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        com.thealgorithms.others.SkylineProblem skylineProblem0 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building4 = skylineProblem0.new Building((int) '#', 100, 0);
        building4.right = (short) -1;
        int int7 = building4.right;
        building4.right = (short) 1;
        int int10 = building4.left;
        building4.left = 35;
        building4.left = 0;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        com.thealgorithms.others.SkylineProblem skylineProblem0 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building4 = skylineProblem0.new Building((int) '#', 100, 0);
        building4.right = (short) -1;
        int int7 = building4.right;
        building4.right = (short) 1;
        building4.right = 0;
        int int12 = building4.right;
        building4.height = '4';
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        com.thealgorithms.others.SkylineProblem skylineProblem0 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building4 = skylineProblem0.new Building((int) '#', 100, 0);
        com.thealgorithms.others.SkylineProblem.Skyline skyline7 = skylineProblem0.new Skyline(10, (int) (byte) 0);
        int int8 = skyline7.height;
        skyline7.height = (short) 0;
        skyline7.height = 1;
        skyline7.coordinates = ' ';
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        com.thealgorithms.others.SkylineProblem skylineProblem0 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building4 = skylineProblem0.new Building((int) '#', 100, 0);
        com.thealgorithms.others.SkylineProblem.Skyline skyline7 = skylineProblem0.new Skyline(10, (int) (byte) 0);
        int int8 = skyline7.coordinates;
        int int9 = skyline7.coordinates;
        int int10 = skyline7.height;
        int int11 = skyline7.coordinates;
        int int12 = skyline7.height;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        com.thealgorithms.others.SkylineProblem skylineProblem0 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building4 = skylineProblem0.new Building((int) '#', 100, 0);
        com.thealgorithms.others.SkylineProblem.Building building8 = skylineProblem0.new Building((int) (short) 10, 10, 0);
        com.thealgorithms.others.SkylineProblem skylineProblem9 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building13 = skylineProblem9.new Building((int) '#', 100, 0);
        com.thealgorithms.others.SkylineProblem.Building building17 = skylineProblem9.new Building((int) (short) 10, 10, 0);
        com.thealgorithms.others.SkylineProblem.Skyline skyline20 = skylineProblem9.new Skyline((int) '4', (int) (byte) 0);
        com.thealgorithms.others.SkylineProblem skylineProblem21 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building25 = skylineProblem21.new Building((int) '#', 100, 0);
        com.thealgorithms.others.SkylineProblem.Skyline[] skylineArray26 = new com.thealgorithms.others.SkylineProblem.Skyline[] {};
        java.util.ArrayList<com.thealgorithms.others.SkylineProblem.Skyline> skylineList27 = new java.util.ArrayList<com.thealgorithms.others.SkylineProblem.Skyline>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<com.thealgorithms.others.SkylineProblem.Skyline>) skylineList27, skylineArray26);
        skylineProblem21.print(skylineList27);
        com.thealgorithms.others.SkylineProblem skylineProblem30 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building34 = skylineProblem30.new Building((int) '#', 100, 0);
        com.thealgorithms.others.SkylineProblem.Building building38 = skylineProblem30.new Building((int) (short) 10, 10, 0);
        com.thealgorithms.others.SkylineProblem.Skyline skyline41 = skylineProblem30.new Skyline((int) '4', (int) (byte) 0);
        skyline41.height = (short) 10;
        com.thealgorithms.others.SkylineProblem skylineProblem44 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building48 = skylineProblem44.new Building((int) '#', 100, 0);
        com.thealgorithms.others.SkylineProblem.Building building52 = skylineProblem44.new Building((int) (short) 10, 10, 0);
        com.thealgorithms.others.SkylineProblem.Skyline skyline55 = skylineProblem44.new Skyline((int) '4', (int) (byte) 0);
        skyline55.height = (short) 10;
        com.thealgorithms.others.SkylineProblem.Skyline[] skylineArray58 = new com.thealgorithms.others.SkylineProblem.Skyline[] { skyline41, skyline55 };
        java.util.ArrayList<com.thealgorithms.others.SkylineProblem.Skyline> skylineList59 = new java.util.ArrayList<com.thealgorithms.others.SkylineProblem.Skyline>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<com.thealgorithms.others.SkylineProblem.Skyline>) skylineList59, skylineArray58);
        java.util.ArrayList<com.thealgorithms.others.SkylineProblem.Skyline> skylineList61 = skylineProblem9.mergeSkyline(skylineList27, skylineList59);
        skylineProblem0.print(skylineList61);
        org.junit.Assert.assertNotNull(skylineArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(skylineArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(skylineList61);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        com.thealgorithms.others.SkylineProblem skylineProblem0 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building4 = skylineProblem0.new Building((int) '#', 100, 0);
        com.thealgorithms.others.SkylineProblem.Building building8 = skylineProblem0.new Building((int) (short) 10, 10, 0);
        com.thealgorithms.others.SkylineProblem.Skyline skyline11 = skylineProblem0.new Skyline((int) '4', (int) (byte) 0);
        java.lang.Class<?> wildcardClass12 = skylineProblem0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        com.thealgorithms.others.SkylineProblem skylineProblem0 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building4 = skylineProblem0.new Building((int) (short) 10, 35, (int) (short) 100);
        building4.right = 52;
        building4.height = 100;
        int int9 = building4.right;
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        com.thealgorithms.others.SkylineProblem skylineProblem0 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building4 = skylineProblem0.new Building((int) '#', 100, 0);
        com.thealgorithms.others.SkylineProblem.Building building8 = skylineProblem0.new Building((int) (short) 10, 10, 0);
        com.thealgorithms.others.SkylineProblem.Skyline skyline11 = skylineProblem0.new Skyline((int) '4', (int) (byte) 0);
        com.thealgorithms.others.SkylineProblem.Skyline skyline14 = skylineProblem0.new Skyline((int) '#', 10);
        java.lang.Class<?> wildcardClass15 = skyline14.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        com.thealgorithms.others.SkylineProblem skylineProblem0 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building4 = skylineProblem0.new Building((int) '#', 100, 0);
        com.thealgorithms.others.SkylineProblem.Skyline skyline7 = skylineProblem0.new Skyline(10, (int) (byte) 0);
        com.thealgorithms.others.SkylineProblem skylineProblem8 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building12 = skylineProblem8.new Building((int) '#', 100, 0);
        com.thealgorithms.others.SkylineProblem.Building building16 = skylineProblem8.new Building((int) (short) 10, 10, 0);
        com.thealgorithms.others.SkylineProblem.Skyline skyline19 = skylineProblem8.new Skyline((int) '4', (int) (byte) 0);
        com.thealgorithms.others.SkylineProblem skylineProblem20 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building24 = skylineProblem20.new Building((int) '#', 100, 0);
        com.thealgorithms.others.SkylineProblem.Skyline[] skylineArray25 = new com.thealgorithms.others.SkylineProblem.Skyline[] {};
        java.util.ArrayList<com.thealgorithms.others.SkylineProblem.Skyline> skylineList26 = new java.util.ArrayList<com.thealgorithms.others.SkylineProblem.Skyline>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<com.thealgorithms.others.SkylineProblem.Skyline>) skylineList26, skylineArray25);
        skylineProblem20.print(skylineList26);
        com.thealgorithms.others.SkylineProblem skylineProblem29 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building33 = skylineProblem29.new Building((int) '#', 100, 0);
        com.thealgorithms.others.SkylineProblem.Building building37 = skylineProblem29.new Building((int) (short) 10, 10, 0);
        com.thealgorithms.others.SkylineProblem.Skyline skyline40 = skylineProblem29.new Skyline((int) '4', (int) (byte) 0);
        skyline40.height = (short) 10;
        com.thealgorithms.others.SkylineProblem skylineProblem43 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building47 = skylineProblem43.new Building((int) '#', 100, 0);
        com.thealgorithms.others.SkylineProblem.Building building51 = skylineProblem43.new Building((int) (short) 10, 10, 0);
        com.thealgorithms.others.SkylineProblem.Skyline skyline54 = skylineProblem43.new Skyline((int) '4', (int) (byte) 0);
        skyline54.height = (short) 10;
        com.thealgorithms.others.SkylineProblem.Skyline[] skylineArray57 = new com.thealgorithms.others.SkylineProblem.Skyline[] { skyline40, skyline54 };
        java.util.ArrayList<com.thealgorithms.others.SkylineProblem.Skyline> skylineList58 = new java.util.ArrayList<com.thealgorithms.others.SkylineProblem.Skyline>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<com.thealgorithms.others.SkylineProblem.Skyline>) skylineList58, skylineArray57);
        java.util.ArrayList<com.thealgorithms.others.SkylineProblem.Skyline> skylineList60 = skylineProblem8.mergeSkyline(skylineList26, skylineList58);
        skylineProblem0.print(skylineList60);
        com.thealgorithms.others.SkylineProblem.Building building65 = skylineProblem0.new Building((int) (short) 100, (int) (short) 1, (-1));
        org.junit.Assert.assertNotNull(skylineArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(skylineArray57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(skylineList60);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        com.thealgorithms.others.SkylineProblem skylineProblem0 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building4 = skylineProblem0.new Building((int) '#', 100, 0);
        building4.right = (short) -1;
        int int7 = building4.right;
        int int8 = building4.right;
        building4.right = 100;
        building4.right = (short) 1;
        building4.left = (short) -1;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        com.thealgorithms.others.SkylineProblem skylineProblem0 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building4 = skylineProblem0.new Building((int) '#', 100, 0);
        building4.right = (short) -1;
        int int7 = building4.right;
        int int8 = building4.height;
        building4.height = (short) 100;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        com.thealgorithms.others.SkylineProblem skylineProblem0 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building4 = skylineProblem0.new Building((int) '#', 100, 0);
        building4.right = (short) -1;
        int int7 = building4.right;
        building4.right = (short) 1;
        int int10 = building4.right;
        int int11 = building4.left;
        building4.right = 'a';
        int int14 = building4.height;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        com.thealgorithms.others.SkylineProblem skylineProblem0 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building4 = skylineProblem0.new Building((int) '#', 100, 0);
        com.thealgorithms.others.SkylineProblem.Building building8 = skylineProblem0.new Building((int) (short) 10, 10, 0);
        com.thealgorithms.others.SkylineProblem.Skyline skyline11 = skylineProblem0.new Skyline((int) '4', (int) (byte) 0);
        skyline11.height = 0;
        int int14 = skyline11.coordinates;
        skyline11.height = 0;
        int int17 = skyline11.height;
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        com.thealgorithms.others.SkylineProblem skylineProblem0 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building4 = skylineProblem0.new Building((int) '#', 100, 0);
        building4.right = (short) -1;
        int int7 = building4.right;
        int int8 = building4.height;
        building4.right = 1;
        building4.left = (byte) 100;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        com.thealgorithms.others.SkylineProblem skylineProblem0 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building4 = skylineProblem0.new Building((int) '#', 100, 0);
        com.thealgorithms.others.SkylineProblem.Building building8 = skylineProblem0.new Building((int) (short) 10, 10, 0);
        com.thealgorithms.others.SkylineProblem.Skyline skyline11 = skylineProblem0.new Skyline((int) '4', (int) (byte) 0);
        skyline11.height = 100;
        skyline11.height = 0;
        int int16 = skyline11.coordinates;
        int int17 = skyline11.height;
        int int18 = skyline11.coordinates;
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        com.thealgorithms.others.SkylineProblem skylineProblem0 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building4 = skylineProblem0.new Building((int) '#', 100, 0);
        com.thealgorithms.others.SkylineProblem.Building building8 = skylineProblem0.new Building((int) (short) 10, 10, 0);
        com.thealgorithms.others.SkylineProblem.Skyline skyline11 = skylineProblem0.new Skyline((int) '4', (int) (byte) 0);
        int int12 = skyline11.height;
        skyline11.height = 52;
        int int15 = skyline11.height;
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        com.thealgorithms.others.SkylineProblem skylineProblem0 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building4 = skylineProblem0.new Building((int) '#', 100, 0);
        com.thealgorithms.others.SkylineProblem.Skyline skyline7 = skylineProblem0.new Skyline(10, (int) (byte) 0);
        int int8 = skyline7.height;
        int int9 = skyline7.height;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        com.thealgorithms.others.SkylineProblem skylineProblem0 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building4 = skylineProblem0.new Building((int) '#', 100, 0);
        com.thealgorithms.others.SkylineProblem.Skyline skyline7 = skylineProblem0.new Skyline(10, (int) (byte) 0);
        com.thealgorithms.others.SkylineProblem.Skyline skyline10 = skylineProblem0.new Skyline(10, (-1));
        int int11 = skyline10.height;
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        com.thealgorithms.others.SkylineProblem skylineProblem0 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building4 = skylineProblem0.new Building((int) '#', 100, 0);
        int int5 = building4.left;
        building4.right = (byte) 0;
        int int8 = building4.height;
        building4.height = (byte) -1;
        int int11 = building4.left;
        building4.left = 0;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        com.thealgorithms.others.SkylineProblem skylineProblem0 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building4 = skylineProblem0.new Building((int) '#', 100, 0);
        int int5 = building4.left;
        building4.height = (byte) -1;
        building4.right = (short) -1;
        int int10 = building4.left;
        building4.right = (byte) -1;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        com.thealgorithms.others.SkylineProblem skylineProblem0 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Skyline skyline3 = skylineProblem0.new Skyline((int) (byte) -1, (int) 'a');
        skyline3.coordinates = (-1);
        int int6 = skyline3.height;
        int int7 = skyline3.coordinates;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        com.thealgorithms.others.SkylineProblem skylineProblem0 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building4 = skylineProblem0.new Building((int) (short) 10, 35, (int) (short) 100);
        int int5 = building4.height;
        int int6 = building4.height;
        building4.left = ' ';
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        com.thealgorithms.others.SkylineProblem skylineProblem0 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building4 = skylineProblem0.new Building((int) '#', 100, 0);
        com.thealgorithms.others.SkylineProblem.Skyline skyline7 = skylineProblem0.new Skyline((int) (short) 1, 97);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        com.thealgorithms.others.SkylineProblem skylineProblem0 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building4 = skylineProblem0.new Building((int) '#', 100, 0);
        com.thealgorithms.others.SkylineProblem.Building building8 = skylineProblem0.new Building((int) (short) 10, 10, 0);
        com.thealgorithms.others.SkylineProblem.Skyline skyline11 = skylineProblem0.new Skyline((int) (short) 1, (int) '4');
        skyline11.coordinates = (short) 100;
        java.lang.Class<?> wildcardClass14 = skyline11.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        com.thealgorithms.others.SkylineProblem skylineProblem0 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building4 = skylineProblem0.new Building((int) '4', (int) ' ', 100);
        com.thealgorithms.others.SkylineProblem.Building building8 = skylineProblem0.new Building((int) (byte) -1, (int) 'a', 52);
        building8.left = (short) 1;
        building8.left = (short) 100;
        building8.left = 100;
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        com.thealgorithms.others.SkylineProblem skylineProblem0 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building4 = skylineProblem0.new Building((int) '#', 100, 0);
        com.thealgorithms.others.SkylineProblem.Skyline[] skylineArray5 = new com.thealgorithms.others.SkylineProblem.Skyline[] {};
        java.util.ArrayList<com.thealgorithms.others.SkylineProblem.Skyline> skylineList6 = new java.util.ArrayList<com.thealgorithms.others.SkylineProblem.Skyline>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<com.thealgorithms.others.SkylineProblem.Skyline>) skylineList6, skylineArray5);
        skylineProblem0.print(skylineList6);
        java.util.ArrayList<com.thealgorithms.others.SkylineProblem.Skyline> skylineList9 = null;
        com.thealgorithms.others.SkylineProblem skylineProblem10 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building14 = skylineProblem10.new Building((int) '#', 100, 0);
        com.thealgorithms.others.SkylineProblem.Building building18 = skylineProblem10.new Building((int) (short) 10, 10, 0);
        com.thealgorithms.others.SkylineProblem.Skyline skyline21 = skylineProblem10.new Skyline((int) '4', (int) (byte) 0);
        com.thealgorithms.others.SkylineProblem skylineProblem22 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building26 = skylineProblem22.new Building((int) '#', 100, 0);
        com.thealgorithms.others.SkylineProblem.Skyline[] skylineArray27 = new com.thealgorithms.others.SkylineProblem.Skyline[] {};
        java.util.ArrayList<com.thealgorithms.others.SkylineProblem.Skyline> skylineList28 = new java.util.ArrayList<com.thealgorithms.others.SkylineProblem.Skyline>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<com.thealgorithms.others.SkylineProblem.Skyline>) skylineList28, skylineArray27);
        skylineProblem22.print(skylineList28);
        com.thealgorithms.others.SkylineProblem skylineProblem31 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building35 = skylineProblem31.new Building((int) '#', 100, 0);
        com.thealgorithms.others.SkylineProblem.Building building39 = skylineProblem31.new Building((int) (short) 10, 10, 0);
        com.thealgorithms.others.SkylineProblem.Skyline skyline42 = skylineProblem31.new Skyline((int) '4', (int) (byte) 0);
        skyline42.height = (short) 10;
        com.thealgorithms.others.SkylineProblem skylineProblem45 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building49 = skylineProblem45.new Building((int) '#', 100, 0);
        com.thealgorithms.others.SkylineProblem.Building building53 = skylineProblem45.new Building((int) (short) 10, 10, 0);
        com.thealgorithms.others.SkylineProblem.Skyline skyline56 = skylineProblem45.new Skyline((int) '4', (int) (byte) 0);
        skyline56.height = (short) 10;
        com.thealgorithms.others.SkylineProblem.Skyline[] skylineArray59 = new com.thealgorithms.others.SkylineProblem.Skyline[] { skyline42, skyline56 };
        java.util.ArrayList<com.thealgorithms.others.SkylineProblem.Skyline> skylineList60 = new java.util.ArrayList<com.thealgorithms.others.SkylineProblem.Skyline>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<com.thealgorithms.others.SkylineProblem.Skyline>) skylineList60, skylineArray59);
        java.util.ArrayList<com.thealgorithms.others.SkylineProblem.Skyline> skylineList62 = skylineProblem10.mergeSkyline(skylineList28, skylineList60);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<com.thealgorithms.others.SkylineProblem.Skyline> skylineList63 = skylineProblem0.mergeSkyline(skylineList9, skylineList28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.ArrayList.isEmpty()\" because \"sky1\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(skylineArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(skylineArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(skylineArray59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(skylineList62);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        com.thealgorithms.others.SkylineProblem skylineProblem0 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building4 = skylineProblem0.new Building((int) '#', 100, 0);
        building4.right = (short) -1;
        int int7 = building4.right;
        int int8 = building4.height;
        int int9 = building4.right;
        building4.right = 0;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        com.thealgorithms.others.SkylineProblem skylineProblem0 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building4 = skylineProblem0.new Building((int) '#', 100, 0);
        com.thealgorithms.others.SkylineProblem.Building building8 = skylineProblem0.new Building((int) (short) 10, 10, 0);
        com.thealgorithms.others.SkylineProblem.Skyline skyline11 = skylineProblem0.new Skyline((int) '4', (int) (byte) 0);
        com.thealgorithms.others.SkylineProblem.Skyline skyline14 = skylineProblem0.new Skyline((int) (short) 100, (int) (short) 10);
        com.thealgorithms.others.SkylineProblem.Skyline skyline17 = skylineProblem0.new Skyline((int) (byte) -1, 0);
        com.thealgorithms.others.SkylineProblem.Building building21 = skylineProblem0.new Building((int) (byte) 1, 52, (int) ' ');
        int int22 = building21.right;
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 32 + "'", int22 == 32);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        com.thealgorithms.others.SkylineProblem skylineProblem0 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building4 = skylineProblem0.new Building((int) '#', 100, 0);
        int int5 = building4.left;
        building4.right = (byte) 0;
        int int8 = building4.left;
        int int9 = building4.height;
        building4.height = 10;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        com.thealgorithms.others.SkylineProblem skylineProblem0 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building4 = skylineProblem0.new Building((int) '#', 100, 0);
        int int5 = building4.left;
        building4.right = (byte) 0;
        int int8 = building4.left;
        int int9 = building4.height;
        building4.right = 1;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        com.thealgorithms.others.SkylineProblem skylineProblem0 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building4 = skylineProblem0.new Building((int) '#', 100, 0);
        com.thealgorithms.others.SkylineProblem.Building building8 = skylineProblem0.new Building((int) (short) 10, 10, 0);
        com.thealgorithms.others.SkylineProblem skylineProblem9 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building13 = skylineProblem9.new Building((int) '#', 100, 0);
        com.thealgorithms.others.SkylineProblem.Skyline[] skylineArray14 = new com.thealgorithms.others.SkylineProblem.Skyline[] {};
        java.util.ArrayList<com.thealgorithms.others.SkylineProblem.Skyline> skylineList15 = new java.util.ArrayList<com.thealgorithms.others.SkylineProblem.Skyline>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<com.thealgorithms.others.SkylineProblem.Skyline>) skylineList15, skylineArray14);
        skylineProblem9.print(skylineList15);
        com.thealgorithms.others.SkylineProblem skylineProblem18 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building22 = skylineProblem18.new Building((int) '#', 100, 0);
        com.thealgorithms.others.SkylineProblem.Building building26 = skylineProblem18.new Building((int) (short) 10, 10, 0);
        com.thealgorithms.others.SkylineProblem.Skyline skyline29 = skylineProblem18.new Skyline((int) '4', (int) (byte) 0);
        com.thealgorithms.others.SkylineProblem skylineProblem30 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building34 = skylineProblem30.new Building((int) '#', 100, 0);
        com.thealgorithms.others.SkylineProblem.Skyline[] skylineArray35 = new com.thealgorithms.others.SkylineProblem.Skyline[] {};
        java.util.ArrayList<com.thealgorithms.others.SkylineProblem.Skyline> skylineList36 = new java.util.ArrayList<com.thealgorithms.others.SkylineProblem.Skyline>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<com.thealgorithms.others.SkylineProblem.Skyline>) skylineList36, skylineArray35);
        skylineProblem30.print(skylineList36);
        com.thealgorithms.others.SkylineProblem skylineProblem39 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building43 = skylineProblem39.new Building((int) '#', 100, 0);
        com.thealgorithms.others.SkylineProblem.Building building47 = skylineProblem39.new Building((int) (short) 10, 10, 0);
        com.thealgorithms.others.SkylineProblem.Skyline skyline50 = skylineProblem39.new Skyline((int) '4', (int) (byte) 0);
        skyline50.height = (short) 10;
        com.thealgorithms.others.SkylineProblem skylineProblem53 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building57 = skylineProblem53.new Building((int) '#', 100, 0);
        com.thealgorithms.others.SkylineProblem.Building building61 = skylineProblem53.new Building((int) (short) 10, 10, 0);
        com.thealgorithms.others.SkylineProblem.Skyline skyline64 = skylineProblem53.new Skyline((int) '4', (int) (byte) 0);
        skyline64.height = (short) 10;
        com.thealgorithms.others.SkylineProblem.Skyline[] skylineArray67 = new com.thealgorithms.others.SkylineProblem.Skyline[] { skyline50, skyline64 };
        java.util.ArrayList<com.thealgorithms.others.SkylineProblem.Skyline> skylineList68 = new java.util.ArrayList<com.thealgorithms.others.SkylineProblem.Skyline>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<com.thealgorithms.others.SkylineProblem.Skyline>) skylineList68, skylineArray67);
        java.util.ArrayList<com.thealgorithms.others.SkylineProblem.Skyline> skylineList70 = skylineProblem18.mergeSkyline(skylineList36, skylineList68);
        java.util.ArrayList<com.thealgorithms.others.SkylineProblem.Skyline> skylineList71 = skylineProblem0.mergeSkyline(skylineList15, skylineList36);
        com.thealgorithms.others.SkylineProblem.Building building75 = skylineProblem0.new Building(100, (int) (short) 1, (int) 'a');
        com.thealgorithms.others.SkylineProblem.Skyline skyline78 = skylineProblem0.new Skyline(1, 10);
        int int79 = skyline78.height;
        org.junit.Assert.assertNotNull(skylineArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(skylineArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(skylineArray67);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertNotNull(skylineList70);
        org.junit.Assert.assertNotNull(skylineList71);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 10 + "'", int79 == 10);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        com.thealgorithms.others.SkylineProblem skylineProblem0 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Skyline skyline3 = skylineProblem0.new Skyline((int) (byte) -1, (int) 'a');
        skyline3.coordinates = (-1);
        skyline3.coordinates = (short) 10;
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        com.thealgorithms.others.SkylineProblem skylineProblem0 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building4 = skylineProblem0.new Building((int) '#', 100, 0);
        int int5 = building4.left;
        building4.height = (byte) -1;
        building4.right = (short) -1;
        building4.left = (byte) 10;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        com.thealgorithms.others.SkylineProblem skylineProblem0 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building4 = skylineProblem0.new Building((int) '#', 100, 0);
        building4.right = (short) -1;
        int int7 = building4.right;
        building4.right = (short) 1;
        int int10 = building4.right;
        int int11 = building4.left;
        building4.left = (short) 1;
        building4.height = 52;
        building4.left = 0;
        building4.height = (byte) 10;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        com.thealgorithms.others.SkylineProblem skylineProblem0 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building4 = skylineProblem0.new Building((int) '#', 100, 0);
        com.thealgorithms.others.SkylineProblem.Building building8 = skylineProblem0.new Building((int) (short) 10, 10, 0);
        building8.height = 0;
        building8.left = '4';
        building8.left = (short) -1;
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        com.thealgorithms.others.SkylineProblem skylineProblem0 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building4 = skylineProblem0.new Building((int) '#', 100, 0);
        com.thealgorithms.others.SkylineProblem.Skyline[] skylineArray5 = new com.thealgorithms.others.SkylineProblem.Skyline[] {};
        java.util.ArrayList<com.thealgorithms.others.SkylineProblem.Skyline> skylineList6 = new java.util.ArrayList<com.thealgorithms.others.SkylineProblem.Skyline>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<com.thealgorithms.others.SkylineProblem.Skyline>) skylineList6, skylineArray5);
        skylineProblem0.print(skylineList6);
        com.thealgorithms.others.SkylineProblem skylineProblem9 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building13 = skylineProblem9.new Building((int) '#', 100, 0);
        com.thealgorithms.others.SkylineProblem.Building building17 = skylineProblem9.new Building((int) (short) 10, 10, 0);
        com.thealgorithms.others.SkylineProblem skylineProblem18 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building22 = skylineProblem18.new Building((int) '#', 100, 0);
        com.thealgorithms.others.SkylineProblem.Skyline[] skylineArray23 = new com.thealgorithms.others.SkylineProblem.Skyline[] {};
        java.util.ArrayList<com.thealgorithms.others.SkylineProblem.Skyline> skylineList24 = new java.util.ArrayList<com.thealgorithms.others.SkylineProblem.Skyline>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<com.thealgorithms.others.SkylineProblem.Skyline>) skylineList24, skylineArray23);
        skylineProblem18.print(skylineList24);
        com.thealgorithms.others.SkylineProblem skylineProblem27 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building31 = skylineProblem27.new Building((int) '#', 100, 0);
        com.thealgorithms.others.SkylineProblem.Building building35 = skylineProblem27.new Building((int) (short) 10, 10, 0);
        com.thealgorithms.others.SkylineProblem.Skyline skyline38 = skylineProblem27.new Skyline((int) '4', (int) (byte) 0);
        com.thealgorithms.others.SkylineProblem skylineProblem39 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building43 = skylineProblem39.new Building((int) '#', 100, 0);
        com.thealgorithms.others.SkylineProblem.Skyline[] skylineArray44 = new com.thealgorithms.others.SkylineProblem.Skyline[] {};
        java.util.ArrayList<com.thealgorithms.others.SkylineProblem.Skyline> skylineList45 = new java.util.ArrayList<com.thealgorithms.others.SkylineProblem.Skyline>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<com.thealgorithms.others.SkylineProblem.Skyline>) skylineList45, skylineArray44);
        skylineProblem39.print(skylineList45);
        com.thealgorithms.others.SkylineProblem skylineProblem48 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building52 = skylineProblem48.new Building((int) '#', 100, 0);
        com.thealgorithms.others.SkylineProblem.Building building56 = skylineProblem48.new Building((int) (short) 10, 10, 0);
        com.thealgorithms.others.SkylineProblem.Skyline skyline59 = skylineProblem48.new Skyline((int) '4', (int) (byte) 0);
        skyline59.height = (short) 10;
        com.thealgorithms.others.SkylineProblem skylineProblem62 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building66 = skylineProblem62.new Building((int) '#', 100, 0);
        com.thealgorithms.others.SkylineProblem.Building building70 = skylineProblem62.new Building((int) (short) 10, 10, 0);
        com.thealgorithms.others.SkylineProblem.Skyline skyline73 = skylineProblem62.new Skyline((int) '4', (int) (byte) 0);
        skyline73.height = (short) 10;
        com.thealgorithms.others.SkylineProblem.Skyline[] skylineArray76 = new com.thealgorithms.others.SkylineProblem.Skyline[] { skyline59, skyline73 };
        java.util.ArrayList<com.thealgorithms.others.SkylineProblem.Skyline> skylineList77 = new java.util.ArrayList<com.thealgorithms.others.SkylineProblem.Skyline>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<com.thealgorithms.others.SkylineProblem.Skyline>) skylineList77, skylineArray76);
        java.util.ArrayList<com.thealgorithms.others.SkylineProblem.Skyline> skylineList79 = skylineProblem27.mergeSkyline(skylineList45, skylineList77);
        java.util.ArrayList<com.thealgorithms.others.SkylineProblem.Skyline> skylineList80 = skylineProblem9.mergeSkyline(skylineList24, skylineList45);
        skylineProblem0.print(skylineList24);
        com.thealgorithms.others.SkylineProblem.Building building85 = skylineProblem0.new Building(0, (int) (short) 1, (int) (short) 10);
        org.junit.Assert.assertNotNull(skylineArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(skylineArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(skylineArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(skylineArray76);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertNotNull(skylineList79);
        org.junit.Assert.assertNotNull(skylineList80);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        com.thealgorithms.others.SkylineProblem skylineProblem0 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building4 = skylineProblem0.new Building((int) '#', 100, 0);
        com.thealgorithms.others.SkylineProblem.Building building8 = skylineProblem0.new Building((int) (short) 10, 10, 0);
        com.thealgorithms.others.SkylineProblem.Skyline skyline11 = skylineProblem0.new Skyline((int) '4', (int) (byte) 0);
        skyline11.height = 100;
        int int14 = skyline11.coordinates;
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        com.thealgorithms.others.SkylineProblem skylineProblem0 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building4 = skylineProblem0.new Building((int) '#', 100, 0);
        com.thealgorithms.others.SkylineProblem.Building building8 = skylineProblem0.new Building((int) (short) 10, 10, 0);
        com.thealgorithms.others.SkylineProblem.Skyline skyline11 = skylineProblem0.new Skyline((int) (short) 1, (int) '4');
        int int12 = skyline11.height;
        int int13 = skyline11.height;
        skyline11.coordinates = '4';
        int int16 = skyline11.height;
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        com.thealgorithms.others.SkylineProblem skylineProblem0 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building4 = skylineProblem0.new Building((int) '#', 100, 0);
        building4.right = (short) -1;
        int int7 = building4.right;
        building4.right = (short) 1;
        int int10 = building4.left;
        int int11 = building4.right;
        int int12 = building4.right;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        com.thealgorithms.others.SkylineProblem skylineProblem0 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building4 = skylineProblem0.new Building((int) '#', 100, 0);
        com.thealgorithms.others.SkylineProblem.Building building8 = skylineProblem0.new Building((int) (short) 10, 10, 0);
        com.thealgorithms.others.SkylineProblem.Skyline skyline11 = skylineProblem0.new Skyline((int) (short) 1, (int) '4');
        com.thealgorithms.others.SkylineProblem.Skyline skyline14 = skylineProblem0.new Skyline(0, 10);
        com.thealgorithms.others.SkylineProblem.Skyline skyline17 = skylineProblem0.new Skyline((int) (byte) -1, (int) (byte) 10);
        com.thealgorithms.others.SkylineProblem skylineProblem18 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building22 = skylineProblem18.new Building((int) '#', 100, 0);
        com.thealgorithms.others.SkylineProblem.Building building26 = skylineProblem18.new Building((int) (short) 10, 10, 0);
        com.thealgorithms.others.SkylineProblem.Skyline skyline29 = skylineProblem18.new Skyline((int) '4', (int) (byte) 0);
        com.thealgorithms.others.SkylineProblem skylineProblem30 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building34 = skylineProblem30.new Building((int) '#', 100, 0);
        com.thealgorithms.others.SkylineProblem.Skyline[] skylineArray35 = new com.thealgorithms.others.SkylineProblem.Skyline[] {};
        java.util.ArrayList<com.thealgorithms.others.SkylineProblem.Skyline> skylineList36 = new java.util.ArrayList<com.thealgorithms.others.SkylineProblem.Skyline>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<com.thealgorithms.others.SkylineProblem.Skyline>) skylineList36, skylineArray35);
        skylineProblem30.print(skylineList36);
        com.thealgorithms.others.SkylineProblem skylineProblem39 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building43 = skylineProblem39.new Building((int) '#', 100, 0);
        com.thealgorithms.others.SkylineProblem.Building building47 = skylineProblem39.new Building((int) (short) 10, 10, 0);
        com.thealgorithms.others.SkylineProblem.Skyline skyline50 = skylineProblem39.new Skyline((int) '4', (int) (byte) 0);
        skyline50.height = (short) 10;
        com.thealgorithms.others.SkylineProblem skylineProblem53 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building57 = skylineProblem53.new Building((int) '#', 100, 0);
        com.thealgorithms.others.SkylineProblem.Building building61 = skylineProblem53.new Building((int) (short) 10, 10, 0);
        com.thealgorithms.others.SkylineProblem.Skyline skyline64 = skylineProblem53.new Skyline((int) '4', (int) (byte) 0);
        skyline64.height = (short) 10;
        com.thealgorithms.others.SkylineProblem.Skyline[] skylineArray67 = new com.thealgorithms.others.SkylineProblem.Skyline[] { skyline50, skyline64 };
        java.util.ArrayList<com.thealgorithms.others.SkylineProblem.Skyline> skylineList68 = new java.util.ArrayList<com.thealgorithms.others.SkylineProblem.Skyline>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<com.thealgorithms.others.SkylineProblem.Skyline>) skylineList68, skylineArray67);
        java.util.ArrayList<com.thealgorithms.others.SkylineProblem.Skyline> skylineList70 = skylineProblem18.mergeSkyline(skylineList36, skylineList68);
        skylineProblem0.print(skylineList68);
        org.junit.Assert.assertNotNull(skylineArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(skylineArray67);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertNotNull(skylineList70);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        com.thealgorithms.others.SkylineProblem skylineProblem0 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building4 = skylineProblem0.new Building((int) '#', 100, 0);
        com.thealgorithms.others.SkylineProblem.Building building8 = skylineProblem0.new Building((int) (short) 10, 10, 0);
        com.thealgorithms.others.SkylineProblem.Skyline skyline11 = skylineProblem0.new Skyline((int) '4', (int) (byte) 0);
        com.thealgorithms.others.SkylineProblem.Skyline skyline14 = skylineProblem0.new Skyline((int) '#', 10);
        skyline14.coordinates = '4';
        skyline14.height = (short) 100;
        int int19 = skyline14.coordinates;
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 52 + "'", int19 == 52);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        com.thealgorithms.others.SkylineProblem skylineProblem0 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building4 = skylineProblem0.new Building((int) '#', 100, 0);
        building4.right = (short) -1;
        building4.right = (short) 10;
        int int9 = building4.right;
        building4.height = (byte) 100;
        int int12 = building4.height;
        int int13 = building4.left;
        building4.right = 0;
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        com.thealgorithms.others.SkylineProblem skylineProblem0 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building4 = skylineProblem0.new Building((int) '#', 100, 0);
        com.thealgorithms.others.SkylineProblem.Building building8 = skylineProblem0.new Building((int) (short) 10, 10, 0);
        building8.height = 0;
        building8.left = '4';
        building8.right = (short) -1;
        building8.left = (byte) 1;
        building8.left = 32;
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        com.thealgorithms.others.SkylineProblem skylineProblem0 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building4 = skylineProblem0.new Building((int) '#', 100, 0);
        building4.right = (short) -1;
        int int7 = building4.right;
        building4.right = (short) 1;
        int int10 = building4.right;
        int int11 = building4.left;
        building4.left = (short) 1;
        building4.height = 52;
        building4.right = (byte) 0;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        com.thealgorithms.others.SkylineProblem skylineProblem0 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building4 = skylineProblem0.new Building((int) '#', 100, 0);
        com.thealgorithms.others.SkylineProblem.Skyline skyline7 = skylineProblem0.new Skyline(10, (int) (byte) 0);
        com.thealgorithms.others.SkylineProblem.Skyline skyline10 = skylineProblem0.new Skyline(10, (-1));
        java.lang.Class<?> wildcardClass11 = skylineProblem0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        com.thealgorithms.others.SkylineProblem skylineProblem0 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building4 = skylineProblem0.new Building((int) (short) 10, 35, (int) (short) 100);
        building4.right = 52;
        int int7 = building4.left;
        building4.right = 100;
        building4.height = (short) 0;
        building4.right = '4';
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        com.thealgorithms.others.SkylineProblem skylineProblem0 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building4 = skylineProblem0.new Building((int) '#', 100, 0);
        int int5 = building4.left;
        building4.height = (byte) -1;
        building4.right = 52;
        building4.right = 'a';
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        com.thealgorithms.others.SkylineProblem skylineProblem0 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building4 = skylineProblem0.new Building((int) '4', (int) ' ', 100);
        com.thealgorithms.others.SkylineProblem.Building building8 = skylineProblem0.new Building((int) (byte) -1, (int) 'a', 52);
        com.thealgorithms.others.SkylineProblem.Building building12 = skylineProblem0.new Building(97, 0, (int) (byte) 100);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        com.thealgorithms.others.SkylineProblem skylineProblem0 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building4 = skylineProblem0.new Building((int) '#', 100, 0);
        com.thealgorithms.others.SkylineProblem.Building building8 = skylineProblem0.new Building((int) (short) 10, 10, 0);
        com.thealgorithms.others.SkylineProblem.Skyline skyline11 = skylineProblem0.new Skyline((int) (short) 1, (int) '4');
        com.thealgorithms.others.SkylineProblem.Skyline skyline14 = skylineProblem0.new Skyline(0, 10);
        skyline14.height = (byte) 100;
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        com.thealgorithms.others.SkylineProblem skylineProblem0 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building4 = skylineProblem0.new Building((int) '4', (int) ' ', 100);
        com.thealgorithms.others.SkylineProblem.Building building8 = skylineProblem0.new Building(0, (-1), (int) (byte) 0);
        int int9 = building8.height;
        int int10 = building8.height;
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        com.thealgorithms.others.SkylineProblem skylineProblem0 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building4 = skylineProblem0.new Building((int) '#', 100, 0);
        com.thealgorithms.others.SkylineProblem.Building building8 = skylineProblem0.new Building((int) (short) 10, 10, 0);
        com.thealgorithms.others.SkylineProblem.Skyline skyline11 = skylineProblem0.new Skyline((int) '4', (int) (byte) 0);
        com.thealgorithms.others.SkylineProblem.Skyline skyline14 = skylineProblem0.new Skyline((int) '#', 10);
        com.thealgorithms.others.SkylineProblem.Skyline skyline17 = skylineProblem0.new Skyline(0, (int) '#');
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        com.thealgorithms.others.SkylineProblem skylineProblem0 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building4 = skylineProblem0.new Building((int) '#', 100, 0);
        com.thealgorithms.others.SkylineProblem.Skyline skyline7 = skylineProblem0.new Skyline(10, (int) (byte) 0);
        int int8 = skyline7.coordinates;
        int int9 = skyline7.coordinates;
        skyline7.height = (short) 10;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        com.thealgorithms.others.SkylineProblem skylineProblem0 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building4 = skylineProblem0.new Building((int) '#', 100, 0);
        com.thealgorithms.others.SkylineProblem.Building building8 = skylineProblem0.new Building((int) (short) 10, 10, 0);
        com.thealgorithms.others.SkylineProblem.Skyline skyline11 = skylineProblem0.new Skyline((int) '4', (int) (byte) 0);
        int int12 = skyline11.height;
        skyline11.coordinates = 0;
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        com.thealgorithms.others.SkylineProblem skylineProblem0 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building4 = skylineProblem0.new Building((int) '#', 100, 0);
        com.thealgorithms.others.SkylineProblem.Building building8 = skylineProblem0.new Building((int) (short) 10, 10, 0);
        com.thealgorithms.others.SkylineProblem.Skyline skyline11 = skylineProblem0.new Skyline((int) (short) 1, (int) '4');
        int int12 = skyline11.height;
        int int13 = skyline11.height;
        skyline11.coordinates = '4';
        skyline11.height = 10;
        java.lang.Class<?> wildcardClass18 = skyline11.getClass();
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        com.thealgorithms.others.SkylineProblem skylineProblem0 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building4 = skylineProblem0.new Building((int) '#', 100, 0);
        com.thealgorithms.others.SkylineProblem.Building building8 = skylineProblem0.new Building((int) (short) 10, 10, 0);
        building8.height = 0;
        building8.left = '4';
        building8.right = (short) -1;
        int int15 = building8.left;
        building8.height = 32;
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        com.thealgorithms.others.SkylineProblem skylineProblem0 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building4 = skylineProblem0.new Building((int) '#', 100, 0);
        com.thealgorithms.others.SkylineProblem.Building building8 = skylineProblem0.new Building((int) (short) 10, 10, 0);
        com.thealgorithms.others.SkylineProblem.Skyline skyline11 = skylineProblem0.new Skyline((int) '4', (int) (byte) 0);
        skyline11.height = 0;
        skyline11.coordinates = 0;
        skyline11.coordinates = (byte) 100;
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        com.thealgorithms.others.SkylineProblem skylineProblem0 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building4 = skylineProblem0.new Building((int) '#', 100, 0);
        com.thealgorithms.others.SkylineProblem.Building building8 = skylineProblem0.new Building((int) (short) 10, 10, 0);
        com.thealgorithms.others.SkylineProblem.Skyline skyline11 = skylineProblem0.new Skyline((int) '4', (int) (byte) 0);
        com.thealgorithms.others.SkylineProblem.Skyline skyline14 = skylineProblem0.new Skyline((int) (short) 100, (int) (short) 10);
        java.lang.Class<?> wildcardClass15 = skylineProblem0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        com.thealgorithms.others.SkylineProblem skylineProblem0 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building4 = skylineProblem0.new Building((int) '#', 100, 0);
        com.thealgorithms.others.SkylineProblem.Building building8 = skylineProblem0.new Building((int) (short) 10, 10, 0);
        com.thealgorithms.others.SkylineProblem.Skyline skyline11 = skylineProblem0.new Skyline((int) '4', (int) (byte) 0);
        com.thealgorithms.others.SkylineProblem.Skyline skyline14 = skylineProblem0.new Skyline((int) (short) 100, (int) (short) 10);
        com.thealgorithms.others.SkylineProblem.Skyline skyline17 = skylineProblem0.new Skyline((int) (byte) -1, 0);
        com.thealgorithms.others.SkylineProblem.Building building21 = skylineProblem0.new Building((int) (byte) 1, 52, (int) ' ');
        building21.height = (short) -1;
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        com.thealgorithms.others.SkylineProblem skylineProblem0 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building4 = skylineProblem0.new Building((int) '#', 100, 0);
        com.thealgorithms.others.SkylineProblem.Building building8 = skylineProblem0.new Building((int) (short) 10, 10, 0);
        com.thealgorithms.others.SkylineProblem.Skyline skyline11 = skylineProblem0.new Skyline((int) (short) 1, (int) '4');
        int int12 = skyline11.height;
        skyline11.coordinates = 52;
        skyline11.height = (byte) -1;
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        com.thealgorithms.others.SkylineProblem skylineProblem0 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building4 = skylineProblem0.new Building((int) (short) 10, 35, (int) (short) 100);
        building4.right = 52;
        building4.height = 100;
        int int9 = building4.left;
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        com.thealgorithms.others.SkylineProblem skylineProblem0 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building4 = skylineProblem0.new Building((int) '#', 100, 0);
        com.thealgorithms.others.SkylineProblem.Building building8 = skylineProblem0.new Building((int) (short) 10, 10, 0);
        com.thealgorithms.others.SkylineProblem skylineProblem9 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building13 = skylineProblem9.new Building((int) '#', 100, 0);
        com.thealgorithms.others.SkylineProblem.Skyline[] skylineArray14 = new com.thealgorithms.others.SkylineProblem.Skyline[] {};
        java.util.ArrayList<com.thealgorithms.others.SkylineProblem.Skyline> skylineList15 = new java.util.ArrayList<com.thealgorithms.others.SkylineProblem.Skyline>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<com.thealgorithms.others.SkylineProblem.Skyline>) skylineList15, skylineArray14);
        skylineProblem9.print(skylineList15);
        com.thealgorithms.others.SkylineProblem skylineProblem18 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building22 = skylineProblem18.new Building((int) '#', 100, 0);
        com.thealgorithms.others.SkylineProblem.Building building26 = skylineProblem18.new Building((int) (short) 10, 10, 0);
        com.thealgorithms.others.SkylineProblem.Skyline skyline29 = skylineProblem18.new Skyline((int) '4', (int) (byte) 0);
        com.thealgorithms.others.SkylineProblem skylineProblem30 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building34 = skylineProblem30.new Building((int) '#', 100, 0);
        com.thealgorithms.others.SkylineProblem.Skyline[] skylineArray35 = new com.thealgorithms.others.SkylineProblem.Skyline[] {};
        java.util.ArrayList<com.thealgorithms.others.SkylineProblem.Skyline> skylineList36 = new java.util.ArrayList<com.thealgorithms.others.SkylineProblem.Skyline>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<com.thealgorithms.others.SkylineProblem.Skyline>) skylineList36, skylineArray35);
        skylineProblem30.print(skylineList36);
        com.thealgorithms.others.SkylineProblem skylineProblem39 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building43 = skylineProblem39.new Building((int) '#', 100, 0);
        com.thealgorithms.others.SkylineProblem.Building building47 = skylineProblem39.new Building((int) (short) 10, 10, 0);
        com.thealgorithms.others.SkylineProblem.Skyline skyline50 = skylineProblem39.new Skyline((int) '4', (int) (byte) 0);
        skyline50.height = (short) 10;
        com.thealgorithms.others.SkylineProblem skylineProblem53 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building57 = skylineProblem53.new Building((int) '#', 100, 0);
        com.thealgorithms.others.SkylineProblem.Building building61 = skylineProblem53.new Building((int) (short) 10, 10, 0);
        com.thealgorithms.others.SkylineProblem.Skyline skyline64 = skylineProblem53.new Skyline((int) '4', (int) (byte) 0);
        skyline64.height = (short) 10;
        com.thealgorithms.others.SkylineProblem.Skyline[] skylineArray67 = new com.thealgorithms.others.SkylineProblem.Skyline[] { skyline50, skyline64 };
        java.util.ArrayList<com.thealgorithms.others.SkylineProblem.Skyline> skylineList68 = new java.util.ArrayList<com.thealgorithms.others.SkylineProblem.Skyline>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<com.thealgorithms.others.SkylineProblem.Skyline>) skylineList68, skylineArray67);
        java.util.ArrayList<com.thealgorithms.others.SkylineProblem.Skyline> skylineList70 = skylineProblem18.mergeSkyline(skylineList36, skylineList68);
        java.util.ArrayList<com.thealgorithms.others.SkylineProblem.Skyline> skylineList71 = skylineProblem0.mergeSkyline(skylineList15, skylineList36);
        com.thealgorithms.others.SkylineProblem.Building building75 = skylineProblem0.new Building(100, (int) (short) 1, (int) 'a');
        com.thealgorithms.others.SkylineProblem.Building building79 = skylineProblem0.new Building((int) ' ', 0, (int) ' ');
        com.thealgorithms.others.SkylineProblem.Building building83 = skylineProblem0.new Building((int) '#', (int) (short) 100, 32);
        org.junit.Assert.assertNotNull(skylineArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(skylineArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(skylineArray67);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertNotNull(skylineList70);
        org.junit.Assert.assertNotNull(skylineList71);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        com.thealgorithms.others.SkylineProblem skylineProblem0 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building4 = skylineProblem0.new Building((int) '#', 100, 0);
        com.thealgorithms.others.SkylineProblem.Skyline[] skylineArray5 = new com.thealgorithms.others.SkylineProblem.Skyline[] {};
        java.util.ArrayList<com.thealgorithms.others.SkylineProblem.Skyline> skylineList6 = new java.util.ArrayList<com.thealgorithms.others.SkylineProblem.Skyline>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<com.thealgorithms.others.SkylineProblem.Skyline>) skylineList6, skylineArray5);
        skylineProblem0.print(skylineList6);
        com.thealgorithms.others.SkylineProblem.Building building12 = skylineProblem0.new Building((int) (byte) 1, 10, 35);
        building12.height = (byte) 100;
        int int15 = building12.left;
        building12.height = 1;
        org.junit.Assert.assertNotNull(skylineArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        com.thealgorithms.others.SkylineProblem skylineProblem0 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building4 = skylineProblem0.new Building((int) (short) 10, 35, (int) (short) 100);
        building4.right = 52;
        int int7 = building4.left;
        building4.right = (short) 100;
        int int10 = building4.left;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        com.thealgorithms.others.SkylineProblem skylineProblem0 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building4 = skylineProblem0.new Building((int) '4', (int) ' ', 100);
        com.thealgorithms.others.SkylineProblem.Building building8 = skylineProblem0.new Building((int) (byte) -1, (int) 'a', 52);
        building8.left = (byte) 100;
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        com.thealgorithms.others.SkylineProblem skylineProblem0 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building4 = skylineProblem0.new Building((int) '#', 100, 0);
        building4.right = (short) -1;
        int int7 = building4.right;
        int int8 = building4.right;
        building4.right = 100;
        building4.right = (short) 1;
        building4.left = (byte) 0;
        building4.left = (byte) -1;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        com.thealgorithms.others.SkylineProblem skylineProblem0 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building4 = skylineProblem0.new Building((int) '#', 100, 0);
        com.thealgorithms.others.SkylineProblem.Building building8 = skylineProblem0.new Building((int) (short) 10, 10, 0);
        com.thealgorithms.others.SkylineProblem.Skyline skyline11 = skylineProblem0.new Skyline((int) '4', (int) (byte) 0);
        com.thealgorithms.others.SkylineProblem.Skyline skyline14 = skylineProblem0.new Skyline((int) (short) 100, (int) (short) 10);
        com.thealgorithms.others.SkylineProblem.Skyline skyline17 = skylineProblem0.new Skyline((int) (byte) 0, (int) (short) 1);
        int int18 = skyline17.coordinates;
        int int19 = skyline17.height;
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        com.thealgorithms.others.SkylineProblem skylineProblem0 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building4 = skylineProblem0.new Building((int) '#', 100, 0);
        com.thealgorithms.others.SkylineProblem.Skyline skyline7 = skylineProblem0.new Skyline(97, (int) (short) 100);
        skyline7.coordinates = 0;
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        com.thealgorithms.others.SkylineProblem skylineProblem0 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building4 = skylineProblem0.new Building((int) '#', 100, 0);
        com.thealgorithms.others.SkylineProblem.Building building8 = skylineProblem0.new Building((int) (short) 10, 10, 0);
        com.thealgorithms.others.SkylineProblem.Skyline skyline11 = skylineProblem0.new Skyline((int) '4', (int) (byte) 0);
        com.thealgorithms.others.SkylineProblem.Skyline skyline14 = skylineProblem0.new Skyline((int) '#', (int) (byte) -1);
        com.thealgorithms.others.SkylineProblem.Building building18 = skylineProblem0.new Building((int) (short) 10, (int) (byte) 1, (int) (short) 1);
        com.thealgorithms.others.SkylineProblem.Skyline skyline21 = skylineProblem0.new Skyline((int) (byte) 1, (int) (short) 1);
        int int22 = skyline21.height;
        int int23 = skyline21.height;
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        com.thealgorithms.others.SkylineProblem skylineProblem0 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building4 = skylineProblem0.new Building((int) '#', 100, 0);
        com.thealgorithms.others.SkylineProblem.Building building8 = skylineProblem0.new Building((int) (short) 10, 10, 0);
        com.thealgorithms.others.SkylineProblem.Skyline skyline11 = skylineProblem0.new Skyline((int) '4', (int) (byte) 0);
        com.thealgorithms.others.SkylineProblem.Skyline skyline14 = skylineProblem0.new Skyline((int) '#', 10);
        skyline14.coordinates = (byte) -1;
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        com.thealgorithms.others.SkylineProblem skylineProblem0 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building4 = skylineProblem0.new Building((int) '#', 100, 0);
        int int5 = building4.left;
        building4.height = (byte) -1;
        building4.right = (-1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        com.thealgorithms.others.SkylineProblem skylineProblem0 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building4 = skylineProblem0.new Building((int) '#', 100, 0);
        int int5 = building4.left;
        building4.right = (byte) 0;
        int int8 = building4.height;
        building4.height = (byte) -1;
        building4.right = (byte) 1;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        com.thealgorithms.others.SkylineProblem skylineProblem0 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building4 = skylineProblem0.new Building((int) '#', 100, 0);
        com.thealgorithms.others.SkylineProblem.Building building8 = skylineProblem0.new Building((int) (short) 10, 10, 0);
        com.thealgorithms.others.SkylineProblem.Skyline skyline11 = skylineProblem0.new Skyline((int) '4', (int) (byte) 0);
        com.thealgorithms.others.SkylineProblem.Skyline skyline14 = skylineProblem0.new Skyline((int) (short) 100, (int) (short) 10);
        com.thealgorithms.others.SkylineProblem.Skyline skyline17 = skylineProblem0.new Skyline((int) (byte) -1, 0);
        com.thealgorithms.others.SkylineProblem.Building building21 = skylineProblem0.new Building((int) (byte) 1, 52, (int) ' ');
        building21.left = (short) 100;
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        com.thealgorithms.others.SkylineProblem skylineProblem0 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building4 = skylineProblem0.new Building((int) (short) 10, 35, (int) (short) 100);
        java.util.ArrayList<com.thealgorithms.others.SkylineProblem.Skyline> skylineList5 = null;
        com.thealgorithms.others.SkylineProblem skylineProblem6 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building10 = skylineProblem6.new Building((int) '#', 100, 0);
        com.thealgorithms.others.SkylineProblem.Skyline[] skylineArray11 = new com.thealgorithms.others.SkylineProblem.Skyline[] {};
        java.util.ArrayList<com.thealgorithms.others.SkylineProblem.Skyline> skylineList12 = new java.util.ArrayList<com.thealgorithms.others.SkylineProblem.Skyline>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<com.thealgorithms.others.SkylineProblem.Skyline>) skylineList12, skylineArray11);
        skylineProblem6.print(skylineList12);
        com.thealgorithms.others.SkylineProblem.Skyline skyline17 = skylineProblem6.new Skyline((-1), (int) '#');
        com.thealgorithms.others.SkylineProblem skylineProblem18 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building22 = skylineProblem18.new Building((int) '#', 100, 0);
        com.thealgorithms.others.SkylineProblem.Building building26 = skylineProblem18.new Building((int) (short) 10, 10, 0);
        com.thealgorithms.others.SkylineProblem.Skyline skyline29 = skylineProblem18.new Skyline((int) '4', (int) (byte) 0);
        com.thealgorithms.others.SkylineProblem skylineProblem30 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building34 = skylineProblem30.new Building((int) '#', 100, 0);
        com.thealgorithms.others.SkylineProblem.Skyline[] skylineArray35 = new com.thealgorithms.others.SkylineProblem.Skyline[] {};
        java.util.ArrayList<com.thealgorithms.others.SkylineProblem.Skyline> skylineList36 = new java.util.ArrayList<com.thealgorithms.others.SkylineProblem.Skyline>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<com.thealgorithms.others.SkylineProblem.Skyline>) skylineList36, skylineArray35);
        skylineProblem30.print(skylineList36);
        com.thealgorithms.others.SkylineProblem skylineProblem39 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building43 = skylineProblem39.new Building((int) '#', 100, 0);
        com.thealgorithms.others.SkylineProblem.Building building47 = skylineProblem39.new Building((int) (short) 10, 10, 0);
        com.thealgorithms.others.SkylineProblem.Skyline skyline50 = skylineProblem39.new Skyline((int) '4', (int) (byte) 0);
        skyline50.height = (short) 10;
        com.thealgorithms.others.SkylineProblem skylineProblem53 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building57 = skylineProblem53.new Building((int) '#', 100, 0);
        com.thealgorithms.others.SkylineProblem.Building building61 = skylineProblem53.new Building((int) (short) 10, 10, 0);
        com.thealgorithms.others.SkylineProblem.Skyline skyline64 = skylineProblem53.new Skyline((int) '4', (int) (byte) 0);
        skyline64.height = (short) 10;
        com.thealgorithms.others.SkylineProblem.Skyline[] skylineArray67 = new com.thealgorithms.others.SkylineProblem.Skyline[] { skyline50, skyline64 };
        java.util.ArrayList<com.thealgorithms.others.SkylineProblem.Skyline> skylineList68 = new java.util.ArrayList<com.thealgorithms.others.SkylineProblem.Skyline>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<com.thealgorithms.others.SkylineProblem.Skyline>) skylineList68, skylineArray67);
        java.util.ArrayList<com.thealgorithms.others.SkylineProblem.Skyline> skylineList70 = skylineProblem18.mergeSkyline(skylineList36, skylineList68);
        skylineProblem6.print(skylineList70);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<com.thealgorithms.others.SkylineProblem.Skyline> skylineList72 = skylineProblem0.mergeSkyline(skylineList5, skylineList70);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.ArrayList.isEmpty()\" because \"sky1\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(skylineArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(skylineArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(skylineArray67);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertNotNull(skylineList70);
    }
}

