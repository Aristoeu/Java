package graphs;

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
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList8 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        boolean boolean9 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList8);
        boolean boolean10 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList8);
        boolean boolean11 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList8);
        boolean boolean12 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList8);
        boolean boolean13 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 0, intListList8);
        boolean boolean14 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList8);
        boolean boolean15 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 0, intListList8);
        boolean boolean16 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test7502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7502");
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList7 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        boolean boolean8 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList7);
        boolean boolean9 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList7);
        boolean boolean10 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList7);
        boolean boolean11 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList7);
        boolean boolean12 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 0, intListList7);
        boolean boolean13 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList7);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 10, intListList7);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test7503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7503");
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList8 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        boolean boolean9 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList8);
        boolean boolean10 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList8);
        boolean boolean11 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList8);
        boolean boolean12 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList8);
        boolean boolean13 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList8);
        boolean boolean14 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList8);
        boolean boolean15 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList8);
        boolean boolean16 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test7504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7504");
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList11 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        boolean boolean12 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList11);
        boolean boolean13 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList11);
        boolean boolean14 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList11);
        boolean boolean15 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList11);
        boolean boolean16 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList11);
        boolean boolean17 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList11);
        boolean boolean18 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList11);
        boolean boolean19 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList11);
        boolean boolean20 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList11);
        boolean boolean21 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList11);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) ' ', intListList11);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test7505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7505");
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList7 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        boolean boolean8 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList7);
        boolean boolean9 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList7);
        boolean boolean10 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 0, intListList7);
        boolean boolean11 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList7);
        boolean boolean12 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList7);
        boolean boolean13 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList7);
        boolean boolean14 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList7);
        java.lang.Class<?> wildcardClass15 = intListList7.getClass();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test7506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7506");
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList6 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        boolean boolean7 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList6);
        boolean boolean8 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList6);
        boolean boolean9 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList6);
        boolean boolean10 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList6);
        boolean boolean11 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList6);
        boolean boolean12 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList6);
        java.lang.Class<?> wildcardClass13 = intListList6.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test7507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7507");
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList12 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        boolean boolean13 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList12);
        boolean boolean14 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList12);
        boolean boolean15 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 0, intListList12);
        boolean boolean16 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList12);
        boolean boolean17 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 0, intListList12);
        boolean boolean18 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList12);
        boolean boolean19 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList12);
        boolean boolean20 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 0, intListList12);
        boolean boolean21 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList12);
        boolean boolean22 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 0, intListList12);
        boolean boolean23 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList12);
        boolean boolean24 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList12);
        java.lang.Class<?> wildcardClass25 = intListList12.getClass();
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test7508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7508");
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList8 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        boolean boolean9 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList8);
        boolean boolean10 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList8);
        boolean boolean11 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList8);
        boolean boolean12 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList8);
        boolean boolean13 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList8);
        boolean boolean14 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList8);
        boolean boolean15 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList8);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) 'a', intListList8);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test7509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7509");
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList11 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        boolean boolean12 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList11);
        boolean boolean13 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList11);
        boolean boolean14 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList11);
        boolean boolean15 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList11);
        boolean boolean16 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList11);
        boolean boolean17 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList11);
        boolean boolean18 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList11);
        boolean boolean19 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList11);
        boolean boolean20 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 0, intListList11);
        boolean boolean21 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList11);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 100, intListList11);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test7510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7510");
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList10 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        boolean boolean11 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList10);
        boolean boolean12 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList10);
        boolean boolean13 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList10);
        boolean boolean14 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList10);
        boolean boolean15 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList10);
        boolean boolean16 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList10);
        boolean boolean17 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList10);
        boolean boolean18 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList10);
        boolean boolean19 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 0, intListList10);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 1, intListList10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test7511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7511");
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList11 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        boolean boolean12 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList11);
        boolean boolean13 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList11);
        boolean boolean14 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList11);
        boolean boolean15 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList11);
        boolean boolean16 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList11);
        boolean boolean17 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList11);
        boolean boolean18 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList11);
        boolean boolean19 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 0, intListList11);
        boolean boolean20 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 0, intListList11);
        boolean boolean21 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList11);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 100, intListList11);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test7512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7512");
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList6 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        boolean boolean7 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList6);
        boolean boolean8 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList6);
        boolean boolean9 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList6);
        boolean boolean10 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList6);
        boolean boolean11 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList6);
        boolean boolean12 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test7513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7513");
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList8 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        boolean boolean9 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList8);
        boolean boolean10 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList8);
        boolean boolean11 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList8);
        boolean boolean12 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList8);
        boolean boolean13 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList8);
        boolean boolean14 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList8);
        boolean boolean15 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList8);
        boolean boolean16 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 0, intListList8);
        java.lang.Class<?> wildcardClass17 = intListList8.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test7514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7514");
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList8 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        boolean boolean9 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList8);
        boolean boolean10 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList8);
        boolean boolean11 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList8);
        boolean boolean12 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList8);
        boolean boolean13 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 0, intListList8);
        boolean boolean14 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 0, intListList8);
        boolean boolean15 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList8);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 10, intListList8);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test7515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7515");
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList7 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        boolean boolean8 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList7);
        boolean boolean9 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList7);
        boolean boolean10 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList7);
        boolean boolean11 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 0, intListList7);
        boolean boolean12 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList7);
        boolean boolean13 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 0, intListList7);
        boolean boolean14 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 0, intListList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test7516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7516");
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList12 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        boolean boolean13 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList12);
        boolean boolean14 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList12);
        boolean boolean15 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList12);
        boolean boolean16 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList12);
        boolean boolean17 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 0, intListList12);
        boolean boolean18 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList12);
        boolean boolean19 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList12);
        boolean boolean20 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 0, intListList12);
        boolean boolean21 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList12);
        boolean boolean22 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList12);
        boolean boolean23 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList12);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 1, intListList12);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test7517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7517");
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList14 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        boolean boolean15 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList14);
        boolean boolean16 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList14);
        boolean boolean17 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 0, intListList14);
        boolean boolean18 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList14);
        boolean boolean19 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList14);
        boolean boolean20 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList14);
        boolean boolean21 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 0, intListList14);
        boolean boolean22 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList14);
        boolean boolean23 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList14);
        boolean boolean24 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList14);
        boolean boolean25 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 0, intListList14);
        boolean boolean26 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 0, intListList14);
        boolean boolean27 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList14);
        boolean boolean28 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test7518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7518");
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList12 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        boolean boolean13 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList12);
        boolean boolean14 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList12);
        boolean boolean15 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 0, intListList12);
        boolean boolean16 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList12);
        boolean boolean17 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList12);
        boolean boolean18 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList12);
        boolean boolean19 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 0, intListList12);
        boolean boolean20 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 0, intListList12);
        boolean boolean21 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList12);
        boolean boolean22 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList12);
        boolean boolean23 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList12);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) '4', intListList12);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test7519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7519");
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList4 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        boolean boolean5 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList4);
        boolean boolean6 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList4);
        boolean boolean7 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList4);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 10, intListList4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test7520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7520");
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList12 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        boolean boolean13 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList12);
        boolean boolean14 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList12);
        boolean boolean15 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList12);
        boolean boolean16 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList12);
        boolean boolean17 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 0, intListList12);
        boolean boolean18 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 0, intListList12);
        boolean boolean19 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList12);
        boolean boolean20 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList12);
        boolean boolean21 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList12);
        boolean boolean22 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList12);
        boolean boolean23 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList12);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(10, intListList12);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test7521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7521");
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList9 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        boolean boolean10 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList9);
        boolean boolean11 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList9);
        boolean boolean12 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList9);
        boolean boolean13 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList9);
        boolean boolean14 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList9);
        boolean boolean15 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList9);
        boolean boolean16 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList9);
        boolean boolean17 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList9);
        boolean boolean18 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test7522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7522");
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList8 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        boolean boolean9 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList8);
        boolean boolean10 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList8);
        boolean boolean11 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList8);
        boolean boolean12 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList8);
        boolean boolean13 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList8);
        boolean boolean14 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList8);
        boolean boolean15 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList8);
        boolean boolean16 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test7523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7523");
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList7 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        boolean boolean8 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList7);
        boolean boolean9 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList7);
        boolean boolean10 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList7);
        boolean boolean11 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList7);
        boolean boolean12 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList7);
        boolean boolean13 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList7);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 1, intListList7);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test7524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7524");
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList6 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        boolean boolean7 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList6);
        boolean boolean8 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList6);
        boolean boolean9 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList6);
        boolean boolean10 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList6);
        boolean boolean11 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList6);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 1, intListList6);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test7525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7525");
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList9 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        boolean boolean10 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList9);
        boolean boolean11 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList9);
        boolean boolean12 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList9);
        boolean boolean13 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList9);
        boolean boolean14 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList9);
        boolean boolean15 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList9);
        boolean boolean16 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList9);
        boolean boolean17 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList9);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 10, intListList9);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test7526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7526");
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList12 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        boolean boolean13 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList12);
        boolean boolean14 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList12);
        boolean boolean15 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList12);
        boolean boolean16 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList12);
        boolean boolean17 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 0, intListList12);
        boolean boolean18 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList12);
        boolean boolean19 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList12);
        boolean boolean20 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 0, intListList12);
        boolean boolean21 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList12);
        boolean boolean22 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList12);
        boolean boolean23 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList12);
        boolean boolean24 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test7527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7527");
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList10 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        boolean boolean11 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList10);
        boolean boolean12 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList10);
        boolean boolean13 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList10);
        boolean boolean14 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList10);
        boolean boolean15 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList10);
        boolean boolean16 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList10);
        boolean boolean17 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList10);
        boolean boolean18 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList10);
        boolean boolean19 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 0, intListList10);
        boolean boolean20 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test7528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7528");
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList8 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        boolean boolean9 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList8);
        boolean boolean10 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList8);
        boolean boolean11 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList8);
        boolean boolean12 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList8);
        boolean boolean13 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList8);
        boolean boolean14 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList8);
        boolean boolean15 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList8);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 100, intListList8);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test7529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7529");
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList16 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        boolean boolean17 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList16);
        boolean boolean18 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList16);
        boolean boolean19 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 0, intListList16);
        boolean boolean20 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList16);
        boolean boolean21 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList16);
        boolean boolean22 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList16);
        boolean boolean23 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 0, intListList16);
        boolean boolean24 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList16);
        boolean boolean25 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList16);
        boolean boolean26 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList16);
        boolean boolean27 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList16);
        boolean boolean28 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 0, intListList16);
        boolean boolean29 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList16);
        boolean boolean30 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList16);
        boolean boolean31 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList16);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean32 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) 'a', intListList16);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test7530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7530");
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList13 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        boolean boolean14 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList13);
        boolean boolean15 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList13);
        boolean boolean16 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 0, intListList13);
        boolean boolean17 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList13);
        boolean boolean18 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList13);
        boolean boolean19 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList13);
        boolean boolean20 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 0, intListList13);
        boolean boolean21 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList13);
        boolean boolean22 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList13);
        boolean boolean23 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList13);
        boolean boolean24 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList13);
        boolean boolean25 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList13);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean26 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 100, intListList13);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test7531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7531");
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList6 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        boolean boolean7 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList6);
        boolean boolean8 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList6);
        boolean boolean9 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList6);
        boolean boolean10 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList6);
        boolean boolean11 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList6);
        boolean boolean12 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList6);
        java.lang.Class<?> wildcardClass13 = intListList6.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test7532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7532");
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList4 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        boolean boolean5 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList4);
        boolean boolean6 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList4);
        boolean boolean7 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList4);
        boolean boolean8 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test7533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7533");
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList8 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        boolean boolean9 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList8);
        boolean boolean10 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList8);
        boolean boolean11 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList8);
        boolean boolean12 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList8);
        boolean boolean13 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList8);
        boolean boolean14 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList8);
        boolean boolean15 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList8);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(10, intListList8);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test7534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7534");
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList9 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        boolean boolean10 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList9);
        boolean boolean11 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList9);
        boolean boolean12 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 0, intListList9);
        boolean boolean13 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList9);
        boolean boolean14 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 0, intListList9);
        boolean boolean15 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList9);
        boolean boolean16 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList9);
        boolean boolean17 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 0, intListList9);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) 'a', intListList9);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test7535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7535");
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList8 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        boolean boolean9 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList8);
        boolean boolean10 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList8);
        boolean boolean11 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList8);
        boolean boolean12 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 0, intListList8);
        boolean boolean13 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 0, intListList8);
        boolean boolean14 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList8);
        boolean boolean15 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList8);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) 'a', intListList8);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test7536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7536");
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList10 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        boolean boolean11 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList10);
        boolean boolean12 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList10);
        boolean boolean13 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList10);
        boolean boolean14 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList10);
        boolean boolean15 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList10);
        boolean boolean16 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList10);
        boolean boolean17 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList10);
        boolean boolean18 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList10);
        boolean boolean19 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 0, intListList10);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(1, intListList10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test7537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7537");
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList11 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        boolean boolean12 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList11);
        boolean boolean13 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList11);
        boolean boolean14 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList11);
        boolean boolean15 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList11);
        boolean boolean16 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList11);
        boolean boolean17 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList11);
        boolean boolean18 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList11);
        boolean boolean19 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList11);
        boolean boolean20 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList11);
        boolean boolean21 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 0, intListList11);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 100, intListList11);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test7538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7538");
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList9 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        boolean boolean10 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList9);
        boolean boolean11 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList9);
        boolean boolean12 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList9);
        boolean boolean13 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList9);
        boolean boolean14 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList9);
        boolean boolean15 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList9);
        boolean boolean16 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList9);
        boolean boolean17 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList9);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 1, intListList9);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test7539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7539");
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList8 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        boolean boolean9 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList8);
        boolean boolean10 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList8);
        boolean boolean11 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 0, intListList8);
        boolean boolean12 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList8);
        boolean boolean13 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList8);
        boolean boolean14 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList8);
        boolean boolean15 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 0, intListList8);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) '#', intListList8);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test7540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7540");
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList11 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        boolean boolean12 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList11);
        boolean boolean13 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList11);
        boolean boolean14 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 0, intListList11);
        boolean boolean15 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList11);
        boolean boolean16 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList11);
        boolean boolean17 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList11);
        boolean boolean18 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList11);
        boolean boolean19 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList11);
        boolean boolean20 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList11);
        boolean boolean21 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList11);
        boolean boolean22 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList11);
        java.lang.Class<?> wildcardClass23 = intListList11.getClass();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test7541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7541");
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList7 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        boolean boolean8 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList7);
        boolean boolean9 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList7);
        boolean boolean10 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList7);
        boolean boolean11 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList7);
        boolean boolean12 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 0, intListList7);
        boolean boolean13 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList7);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) '#', intListList7);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test7542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7542");
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList12 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        boolean boolean13 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList12);
        boolean boolean14 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList12);
        boolean boolean15 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList12);
        boolean boolean16 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList12);
        boolean boolean17 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 0, intListList12);
        boolean boolean18 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList12);
        boolean boolean19 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList12);
        boolean boolean20 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 0, intListList12);
        boolean boolean21 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList12);
        boolean boolean22 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList12);
        boolean boolean23 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 0, intListList12);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 1, intListList12);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test7543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7543");
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList13 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        boolean boolean14 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList13);
        boolean boolean15 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList13);
        boolean boolean16 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList13);
        boolean boolean17 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList13);
        boolean boolean18 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList13);
        boolean boolean19 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList13);
        boolean boolean20 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList13);
        boolean boolean21 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList13);
        boolean boolean22 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList13);
        boolean boolean23 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList13);
        boolean boolean24 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList13);
        boolean boolean25 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList13);
        boolean boolean26 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test7544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7544");
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList8 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        boolean boolean9 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList8);
        boolean boolean10 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList8);
        boolean boolean11 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList8);
        boolean boolean12 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList8);
        boolean boolean13 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList8);
        boolean boolean14 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList8);
        boolean boolean15 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList8);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(1, intListList8);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test7545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7545");
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList9 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        boolean boolean10 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList9);
        boolean boolean11 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList9);
        boolean boolean12 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList9);
        boolean boolean13 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList9);
        boolean boolean14 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList9);
        boolean boolean15 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList9);
        boolean boolean16 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList9);
        boolean boolean17 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList9);
        boolean boolean18 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList9);
        java.lang.Class<?> wildcardClass19 = intListList9.getClass();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test7546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7546");
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList10 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        boolean boolean11 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList10);
        boolean boolean12 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList10);
        boolean boolean13 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList10);
        boolean boolean14 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 0, intListList10);
        boolean boolean15 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList10);
        boolean boolean16 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList10);
        boolean boolean17 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList10);
        boolean boolean18 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList10);
        boolean boolean19 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList10);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 1, intListList10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test7547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7547");
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList9 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        boolean boolean10 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList9);
        boolean boolean11 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList9);
        boolean boolean12 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList9);
        boolean boolean13 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList9);
        boolean boolean14 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList9);
        boolean boolean15 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList9);
        boolean boolean16 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList9);
        boolean boolean17 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 0, intListList9);
        boolean boolean18 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 0, intListList9);
        java.lang.Class<?> wildcardClass19 = intListList9.getClass();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test7548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7548");
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList8 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        boolean boolean9 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList8);
        boolean boolean10 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList8);
        boolean boolean11 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList8);
        boolean boolean12 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList8);
        boolean boolean13 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList8);
        boolean boolean14 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList8);
        boolean boolean15 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList8);
        boolean boolean16 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test7549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7549");
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList10 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        boolean boolean11 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList10);
        boolean boolean12 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList10);
        boolean boolean13 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 0, intListList10);
        boolean boolean14 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList10);
        boolean boolean15 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList10);
        boolean boolean16 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList10);
        boolean boolean17 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 0, intListList10);
        boolean boolean18 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList10);
        boolean boolean19 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList10);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(100, intListList10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test7550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7550");
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList12 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        boolean boolean13 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList12);
        boolean boolean14 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList12);
        boolean boolean15 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList12);
        boolean boolean16 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList12);
        boolean boolean17 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList12);
        boolean boolean18 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList12);
        boolean boolean19 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList12);
        boolean boolean20 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList12);
        boolean boolean21 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList12);
        boolean boolean22 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList12);
        boolean boolean23 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList12);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(10, intListList12);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test7551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7551");
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList7 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        boolean boolean8 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList7);
        boolean boolean9 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList7);
        boolean boolean10 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList7);
        boolean boolean11 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList7);
        boolean boolean12 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList7);
        boolean boolean13 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList7);
        boolean boolean14 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test7552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7552");
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList9 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        boolean boolean10 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList9);
        boolean boolean11 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList9);
        boolean boolean12 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList9);
        boolean boolean13 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList9);
        boolean boolean14 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList9);
        boolean boolean15 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList9);
        boolean boolean16 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList9);
        boolean boolean17 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList9);
        boolean boolean18 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test7553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7553");
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList12 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        boolean boolean13 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList12);
        boolean boolean14 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList12);
        boolean boolean15 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 0, intListList12);
        boolean boolean16 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList12);
        boolean boolean17 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList12);
        boolean boolean18 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 0, intListList12);
        boolean boolean19 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList12);
        boolean boolean20 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList12);
        boolean boolean21 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList12);
        boolean boolean22 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList12);
        boolean boolean23 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 0, intListList12);
        boolean boolean24 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 0, intListList12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test7554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7554");
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList8 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        boolean boolean9 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList8);
        boolean boolean10 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList8);
        boolean boolean11 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList8);
        boolean boolean12 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList8);
        boolean boolean13 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList8);
        boolean boolean14 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList8);
        boolean boolean15 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList8);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 10, intListList8);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test7555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7555");
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList11 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        boolean boolean12 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList11);
        boolean boolean13 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList11);
        boolean boolean14 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList11);
        boolean boolean15 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList11);
        boolean boolean16 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList11);
        boolean boolean17 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList11);
        boolean boolean18 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList11);
        boolean boolean19 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList11);
        boolean boolean20 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList11);
        boolean boolean21 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 0, intListList11);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 10, intListList11);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test7556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7556");
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList10 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        boolean boolean11 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList10);
        boolean boolean12 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList10);
        boolean boolean13 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList10);
        boolean boolean14 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList10);
        boolean boolean15 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList10);
        boolean boolean16 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList10);
        boolean boolean17 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList10);
        boolean boolean18 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList10);
        boolean boolean19 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList10);
        boolean boolean20 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList10);
        java.lang.Class<?> wildcardClass21 = intListList10.getClass();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test7557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7557");
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList6 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        boolean boolean7 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList6);
        boolean boolean8 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList6);
        boolean boolean9 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList6);
        boolean boolean10 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList6);
        boolean boolean11 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList6);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) ' ', intListList6);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test7558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7558");
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList11 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        boolean boolean12 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList11);
        boolean boolean13 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList11);
        boolean boolean14 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList11);
        boolean boolean15 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList11);
        boolean boolean16 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList11);
        boolean boolean17 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList11);
        boolean boolean18 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList11);
        boolean boolean19 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList11);
        boolean boolean20 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList11);
        boolean boolean21 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList11);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 100, intListList11);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test7559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7559");
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList10 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        boolean boolean11 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList10);
        boolean boolean12 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList10);
        boolean boolean13 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList10);
        boolean boolean14 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 0, intListList10);
        boolean boolean15 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 0, intListList10);
        boolean boolean16 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList10);
        boolean boolean17 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList10);
        boolean boolean18 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 0, intListList10);
        boolean boolean19 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList10);
        boolean boolean20 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList10);
        java.lang.Class<?> wildcardClass21 = intListList10.getClass();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test7560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7560");
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList8 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        boolean boolean9 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList8);
        boolean boolean10 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList8);
        boolean boolean11 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList8);
        boolean boolean12 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 0, intListList8);
        boolean boolean13 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList8);
        boolean boolean14 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList8);
        boolean boolean15 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList8);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) '#', intListList8);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test7561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7561");
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList8 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        boolean boolean9 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList8);
        boolean boolean10 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList8);
        boolean boolean11 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList8);
        boolean boolean12 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList8);
        boolean boolean13 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList8);
        boolean boolean14 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList8);
        boolean boolean15 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList8);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 100, intListList8);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test7562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7562");
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList10 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        boolean boolean11 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList10);
        boolean boolean12 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList10);
        boolean boolean13 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList10);
        boolean boolean14 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList10);
        boolean boolean15 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList10);
        boolean boolean16 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList10);
        boolean boolean17 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 0, intListList10);
        boolean boolean18 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList10);
        boolean boolean19 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList10);
        boolean boolean20 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test7563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7563");
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList11 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        boolean boolean12 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList11);
        boolean boolean13 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList11);
        boolean boolean14 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList11);
        boolean boolean15 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList11);
        boolean boolean16 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList11);
        boolean boolean17 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList11);
        boolean boolean18 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList11);
        boolean boolean19 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList11);
        boolean boolean20 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList11);
        boolean boolean21 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList11);
        boolean boolean22 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test7564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7564");
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList10 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        boolean boolean11 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList10);
        boolean boolean12 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList10);
        boolean boolean13 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList10);
        boolean boolean14 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList10);
        boolean boolean15 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList10);
        boolean boolean16 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList10);
        boolean boolean17 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList10);
        boolean boolean18 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList10);
        boolean boolean19 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList10);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) '#', intListList10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test7565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7565");
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList9 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        boolean boolean10 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList9);
        boolean boolean11 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList9);
        boolean boolean12 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList9);
        boolean boolean13 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList9);
        boolean boolean14 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList9);
        boolean boolean15 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList9);
        boolean boolean16 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList9);
        boolean boolean17 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 0, intListList9);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 10, intListList9);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test7566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7566");
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList4 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        boolean boolean5 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList4);
        boolean boolean6 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList4);
        boolean boolean7 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList4);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 1, intListList4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test7567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7567");
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList10 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        boolean boolean11 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList10);
        boolean boolean12 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList10);
        boolean boolean13 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList10);
        boolean boolean14 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList10);
        boolean boolean15 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList10);
        boolean boolean16 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList10);
        boolean boolean17 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList10);
        boolean boolean18 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList10);
        boolean boolean19 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList10);
        boolean boolean20 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList10);
        java.lang.Class<?> wildcardClass21 = intListList10.getClass();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test7568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7568");
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList9 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        boolean boolean10 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList9);
        boolean boolean11 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList9);
        boolean boolean12 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 0, intListList9);
        boolean boolean13 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList9);
        boolean boolean14 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList9);
        boolean boolean15 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList9);
        boolean boolean16 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList9);
        boolean boolean17 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList9);
        boolean boolean18 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test7569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7569");
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList12 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        boolean boolean13 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList12);
        boolean boolean14 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList12);
        boolean boolean15 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList12);
        boolean boolean16 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList12);
        boolean boolean17 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList12);
        boolean boolean18 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList12);
        boolean boolean19 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList12);
        boolean boolean20 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 0, intListList12);
        boolean boolean21 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList12);
        boolean boolean22 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList12);
        boolean boolean23 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList12);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) ' ', intListList12);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test7570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7570");
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList8 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        boolean boolean9 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList8);
        boolean boolean10 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList8);
        boolean boolean11 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList8);
        boolean boolean12 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList8);
        boolean boolean13 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 0, intListList8);
        boolean boolean14 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 0, intListList8);
        boolean boolean15 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList8);
        boolean boolean16 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList8);
        java.lang.Class<?> wildcardClass17 = intListList8.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test7571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7571");
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList9 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        boolean boolean10 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList9);
        boolean boolean11 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList9);
        boolean boolean12 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList9);
        boolean boolean13 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList9);
        boolean boolean14 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList9);
        boolean boolean15 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 0, intListList9);
        boolean boolean16 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList9);
        boolean boolean17 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList9);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 1, intListList9);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test7572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7572");
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList10 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        boolean boolean11 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList10);
        boolean boolean12 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList10);
        boolean boolean13 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 0, intListList10);
        boolean boolean14 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList10);
        boolean boolean15 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 0, intListList10);
        boolean boolean16 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList10);
        boolean boolean17 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList10);
        boolean boolean18 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 0, intListList10);
        boolean boolean19 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList10);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) '#', intListList10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test7573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7573");
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList10 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        boolean boolean11 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList10);
        boolean boolean12 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList10);
        boolean boolean13 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList10);
        boolean boolean14 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList10);
        boolean boolean15 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList10);
        boolean boolean16 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList10);
        boolean boolean17 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList10);
        boolean boolean18 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList10);
        boolean boolean19 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList10);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 10, intListList10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test7574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7574");
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList12 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        boolean boolean13 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList12);
        boolean boolean14 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList12);
        boolean boolean15 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList12);
        boolean boolean16 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList12);
        boolean boolean17 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList12);
        boolean boolean18 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList12);
        boolean boolean19 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList12);
        boolean boolean20 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList12);
        boolean boolean21 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList12);
        boolean boolean22 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList12);
        boolean boolean23 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 0, intListList12);
        boolean boolean24 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 0, intListList12);
        java.lang.Class<?> wildcardClass25 = intListList12.getClass();
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test7575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7575");
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList12 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        boolean boolean13 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList12);
        boolean boolean14 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList12);
        boolean boolean15 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList12);
        boolean boolean16 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList12);
        boolean boolean17 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList12);
        boolean boolean18 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList12);
        boolean boolean19 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList12);
        boolean boolean20 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList12);
        boolean boolean21 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList12);
        boolean boolean22 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList12);
        boolean boolean23 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 0, intListList12);
        boolean boolean24 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList12);
        java.lang.Class<?> wildcardClass25 = intListList12.getClass();
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test7576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7576");
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList13 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        boolean boolean14 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList13);
        boolean boolean15 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList13);
        boolean boolean16 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList13);
        boolean boolean17 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList13);
        boolean boolean18 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList13);
        boolean boolean19 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList13);
        boolean boolean20 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList13);
        boolean boolean21 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList13);
        boolean boolean22 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList13);
        boolean boolean23 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList13);
        boolean boolean24 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList13);
        boolean boolean25 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList13);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean26 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 10, intListList13);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test7577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7577");
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList7 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        boolean boolean8 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList7);
        boolean boolean9 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList7);
        boolean boolean10 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList7);
        boolean boolean11 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList7);
        boolean boolean12 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList7);
        boolean boolean13 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 0, intListList7);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 10, intListList7);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test7578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7578");
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList10 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        boolean boolean11 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList10);
        boolean boolean12 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList10);
        boolean boolean13 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList10);
        boolean boolean14 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList10);
        boolean boolean15 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList10);
        boolean boolean16 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList10);
        boolean boolean17 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList10);
        boolean boolean18 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList10);
        boolean boolean19 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList10);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 10, intListList10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test7579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7579");
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList6 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        boolean boolean7 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList6);
        boolean boolean8 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList6);
        boolean boolean9 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList6);
        boolean boolean10 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList6);
        boolean boolean11 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList6);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) '#', intListList6);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test7580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7580");
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList10 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        boolean boolean11 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList10);
        boolean boolean12 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList10);
        boolean boolean13 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList10);
        boolean boolean14 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList10);
        boolean boolean15 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList10);
        boolean boolean16 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList10);
        boolean boolean17 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList10);
        boolean boolean18 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList10);
        boolean boolean19 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList10);
        boolean boolean20 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test7581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7581");
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList11 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        boolean boolean12 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList11);
        boolean boolean13 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList11);
        boolean boolean14 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList11);
        boolean boolean15 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList11);
        boolean boolean16 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList11);
        boolean boolean17 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList11);
        boolean boolean18 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList11);
        boolean boolean19 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList11);
        boolean boolean20 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList11);
        boolean boolean21 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList11);
        boolean boolean22 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList11);
        java.lang.Class<?> wildcardClass23 = intListList11.getClass();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test7582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7582");
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList9 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        boolean boolean10 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList9);
        boolean boolean11 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList9);
        boolean boolean12 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 0, intListList9);
        boolean boolean13 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList9);
        boolean boolean14 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList9);
        boolean boolean15 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList9);
        boolean boolean16 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 0, intListList9);
        boolean boolean17 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 0, intListList9);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) '#', intListList9);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test7583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7583");
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList11 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        boolean boolean12 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList11);
        boolean boolean13 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList11);
        boolean boolean14 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 0, intListList11);
        boolean boolean15 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList11);
        boolean boolean16 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 0, intListList11);
        boolean boolean17 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList11);
        boolean boolean18 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList11);
        boolean boolean19 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList11);
        boolean boolean20 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList11);
        boolean boolean21 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList11);
        boolean boolean22 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList11);
        java.lang.Class<?> wildcardClass23 = intListList11.getClass();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test7584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7584");
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList9 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        boolean boolean10 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList9);
        boolean boolean11 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList9);
        boolean boolean12 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList9);
        boolean boolean13 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList9);
        boolean boolean14 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList9);
        boolean boolean15 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList9);
        boolean boolean16 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList9);
        boolean boolean17 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList9);
        boolean boolean18 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList9);
        java.lang.Class<?> wildcardClass19 = intListList9.getClass();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test7585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7585");
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList8 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        boolean boolean9 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList8);
        boolean boolean10 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList8);
        boolean boolean11 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 0, intListList8);
        boolean boolean12 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList8);
        boolean boolean13 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList8);
        boolean boolean14 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList8);
        boolean boolean15 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList8);
        boolean boolean16 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList8);
        java.lang.Class<?> wildcardClass17 = intListList8.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test7586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7586");
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList12 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        boolean boolean13 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList12);
        boolean boolean14 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList12);
        boolean boolean15 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList12);
        boolean boolean16 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList12);
        boolean boolean17 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList12);
        boolean boolean18 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList12);
        boolean boolean19 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 0, intListList12);
        boolean boolean20 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList12);
        boolean boolean21 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 0, intListList12);
        boolean boolean22 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList12);
        boolean boolean23 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList12);
        boolean boolean24 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList12);
        java.lang.Class<?> wildcardClass25 = intListList12.getClass();
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test7587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7587");
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList10 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        boolean boolean11 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList10);
        boolean boolean12 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList10);
        boolean boolean13 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList10);
        boolean boolean14 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 0, intListList10);
        boolean boolean15 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 0, intListList10);
        boolean boolean16 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList10);
        boolean boolean17 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList10);
        boolean boolean18 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList10);
        boolean boolean19 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList10);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 10, intListList10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test7588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7588");
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList7 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        boolean boolean8 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList7);
        boolean boolean9 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList7);
        boolean boolean10 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList7);
        boolean boolean11 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList7);
        boolean boolean12 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList7);
        boolean boolean13 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 0, intListList7);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(10, intListList7);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test7589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7589");
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList6 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        boolean boolean7 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList6);
        boolean boolean8 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList6);
        boolean boolean9 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList6);
        boolean boolean10 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList6);
        boolean boolean11 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList6);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(1, intListList6);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test7590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7590");
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList10 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        boolean boolean11 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList10);
        boolean boolean12 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList10);
        boolean boolean13 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList10);
        boolean boolean14 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList10);
        boolean boolean15 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 0, intListList10);
        boolean boolean16 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 0, intListList10);
        boolean boolean17 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 0, intListList10);
        boolean boolean18 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList10);
        boolean boolean19 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList10);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 10, intListList10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test7591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7591");
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList8 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        boolean boolean9 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList8);
        boolean boolean10 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList8);
        boolean boolean11 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList8);
        boolean boolean12 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList8);
        boolean boolean13 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList8);
        boolean boolean14 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList8);
        boolean boolean15 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 0, intListList8);
        boolean boolean16 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test7592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7592");
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList6 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        boolean boolean7 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList6);
        boolean boolean8 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList6);
        boolean boolean9 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList6);
        boolean boolean10 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList6);
        boolean boolean11 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList6);
        boolean boolean12 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test7593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7593");
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList11 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        boolean boolean12 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList11);
        boolean boolean13 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList11);
        boolean boolean14 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList11);
        boolean boolean15 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 0, intListList11);
        boolean boolean16 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 0, intListList11);
        boolean boolean17 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList11);
        boolean boolean18 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 0, intListList11);
        boolean boolean19 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList11);
        boolean boolean20 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList11);
        boolean boolean21 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList11);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(1, intListList11);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test7594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7594");
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList11 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        boolean boolean12 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList11);
        boolean boolean13 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList11);
        boolean boolean14 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList11);
        boolean boolean15 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList11);
        boolean boolean16 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList11);
        boolean boolean17 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList11);
        boolean boolean18 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList11);
        boolean boolean19 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList11);
        boolean boolean20 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList11);
        boolean boolean21 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList11);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) 'a', intListList11);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test7595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7595");
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList8 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        boolean boolean9 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList8);
        boolean boolean10 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList8);
        boolean boolean11 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList8);
        boolean boolean12 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList8);
        boolean boolean13 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList8);
        boolean boolean14 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList8);
        boolean boolean15 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList8);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 1, intListList8);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test7596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7596");
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList7 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        boolean boolean8 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList7);
        boolean boolean9 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList7);
        boolean boolean10 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 0, intListList7);
        boolean boolean11 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList7);
        boolean boolean12 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList7);
        boolean boolean13 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList7);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(100, intListList7);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test7597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7597");
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList11 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        boolean boolean12 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList11);
        boolean boolean13 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList11);
        boolean boolean14 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList11);
        boolean boolean15 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList11);
        boolean boolean16 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 0, intListList11);
        boolean boolean17 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList11);
        boolean boolean18 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList11);
        boolean boolean19 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList11);
        boolean boolean20 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList11);
        boolean boolean21 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList11);
        boolean boolean22 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test7598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7598");
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList12 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        boolean boolean13 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList12);
        boolean boolean14 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList12);
        boolean boolean15 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList12);
        boolean boolean16 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList12);
        boolean boolean17 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList12);
        boolean boolean18 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList12);
        boolean boolean19 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList12);
        boolean boolean20 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList12);
        boolean boolean21 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList12);
        boolean boolean22 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList12);
        boolean boolean23 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 0, intListList12);
        boolean boolean24 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test7599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7599");
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList11 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        boolean boolean12 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList11);
        boolean boolean13 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList11);
        boolean boolean14 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList11);
        boolean boolean15 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList11);
        boolean boolean16 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList11);
        boolean boolean17 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList11);
        boolean boolean18 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList11);
        boolean boolean19 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList11);
        boolean boolean20 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList11);
        boolean boolean21 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList11);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 100, intListList11);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test7600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7600");
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList11 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        boolean boolean12 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList11);
        boolean boolean13 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList11);
        boolean boolean14 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 0, intListList11);
        boolean boolean15 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList11);
        boolean boolean16 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 0, intListList11);
        boolean boolean17 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList11);
        boolean boolean18 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList11);
        boolean boolean19 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 0, intListList11);
        boolean boolean20 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList11);
        boolean boolean21 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList11);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 10, intListList11);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test7601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7601");
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList16 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        boolean boolean17 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList16);
        boolean boolean18 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList16);
        boolean boolean19 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 0, intListList16);
        boolean boolean20 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList16);
        boolean boolean21 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList16);
        boolean boolean22 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList16);
        boolean boolean23 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 0, intListList16);
        boolean boolean24 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList16);
        boolean boolean25 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList16);
        boolean boolean26 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList16);
        boolean boolean27 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 0, intListList16);
        boolean boolean28 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 0, intListList16);
        boolean boolean29 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList16);
        boolean boolean30 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 0, intListList16);
        boolean boolean31 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList16);
        boolean boolean32 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList16);
        java.lang.Class<?> wildcardClass33 = intListList16.getClass();
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test7602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7602");
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList9 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        boolean boolean10 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList9);
        boolean boolean11 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList9);
        boolean boolean12 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList9);
        boolean boolean13 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList9);
        boolean boolean14 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList9);
        boolean boolean15 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList9);
        boolean boolean16 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList9);
        boolean boolean17 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList9);
        boolean boolean18 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList9);
        java.lang.Class<?> wildcardClass19 = intListList9.getClass();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test7603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7603");
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList15 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        boolean boolean16 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList15);
        boolean boolean17 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList15);
        boolean boolean18 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 0, intListList15);
        boolean boolean19 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList15);
        boolean boolean20 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList15);
        boolean boolean21 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList15);
        boolean boolean22 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 0, intListList15);
        boolean boolean23 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList15);
        boolean boolean24 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList15);
        boolean boolean25 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList15);
        boolean boolean26 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList15);
        boolean boolean27 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 0, intListList15);
        boolean boolean28 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList15);
        boolean boolean29 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList15);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean30 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) '#', intListList15);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test7604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7604");
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList7 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        boolean boolean8 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList7);
        boolean boolean9 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList7);
        boolean boolean10 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList7);
        boolean boolean11 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList7);
        boolean boolean12 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList7);
        boolean boolean13 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList7);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) ' ', intListList7);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test7605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7605");
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList8 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        boolean boolean9 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList8);
        boolean boolean10 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList8);
        boolean boolean11 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList8);
        boolean boolean12 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList8);
        boolean boolean13 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList8);
        boolean boolean14 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList8);
        boolean boolean15 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList8);
        boolean boolean16 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList8);
        java.lang.Class<?> wildcardClass17 = intListList8.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test7606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7606");
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList8 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        boolean boolean9 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList8);
        boolean boolean10 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList8);
        boolean boolean11 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList8);
        boolean boolean12 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList8);
        boolean boolean13 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList8);
        boolean boolean14 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList8);
        boolean boolean15 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 0, intListList8);
        boolean boolean16 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList8);
        java.lang.Class<?> wildcardClass17 = intListList8.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test7607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7607");
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList3 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        boolean boolean4 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList3);
        boolean boolean5 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList3);
        boolean boolean6 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test7608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7608");
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList8 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        boolean boolean9 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList8);
        boolean boolean10 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList8);
        boolean boolean11 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 0, intListList8);
        boolean boolean12 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList8);
        boolean boolean13 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList8);
        boolean boolean14 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList8);
        boolean boolean15 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList8);
        boolean boolean16 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test7609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7609");
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList9 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        boolean boolean10 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList9);
        boolean boolean11 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList9);
        boolean boolean12 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList9);
        boolean boolean13 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList9);
        boolean boolean14 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList9);
        boolean boolean15 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList9);
        boolean boolean16 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList9);
        boolean boolean17 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList9);
        boolean boolean18 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test7610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7610");
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList7 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        boolean boolean8 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList7);
        boolean boolean9 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList7);
        boolean boolean10 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList7);
        boolean boolean11 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList7);
        boolean boolean12 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList7);
        boolean boolean13 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList7);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) 'a', intListList7);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test7611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7611");
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList12 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        boolean boolean13 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList12);
        boolean boolean14 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList12);
        boolean boolean15 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 0, intListList12);
        boolean boolean16 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList12);
        boolean boolean17 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList12);
        boolean boolean18 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList12);
        boolean boolean19 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList12);
        boolean boolean20 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList12);
        boolean boolean21 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList12);
        boolean boolean22 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList12);
        boolean boolean23 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList12);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(100, intListList12);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test7612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7612");
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList9 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        boolean boolean10 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList9);
        boolean boolean11 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList9);
        boolean boolean12 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList9);
        boolean boolean13 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList9);
        boolean boolean14 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList9);
        boolean boolean15 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList9);
        boolean boolean16 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 0, intListList9);
        boolean boolean17 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList9);
        boolean boolean18 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test7613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7613");
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList10 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        boolean boolean11 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList10);
        boolean boolean12 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList10);
        boolean boolean13 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList10);
        boolean boolean14 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList10);
        boolean boolean15 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList10);
        boolean boolean16 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList10);
        boolean boolean17 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList10);
        boolean boolean18 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList10);
        boolean boolean19 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList10);
        boolean boolean20 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList10);
        java.lang.Class<?> wildcardClass21 = intListList10.getClass();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test7614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7614");
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList8 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        boolean boolean9 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList8);
        boolean boolean10 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList8);
        boolean boolean11 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList8);
        boolean boolean12 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList8);
        boolean boolean13 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList8);
        boolean boolean14 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 0, intListList8);
        boolean boolean15 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList8);
        boolean boolean16 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test7615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7615");
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList8 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        boolean boolean9 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList8);
        boolean boolean10 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList8);
        boolean boolean11 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList8);
        boolean boolean12 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList8);
        boolean boolean13 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList8);
        boolean boolean14 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList8);
        boolean boolean15 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 0, intListList8);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) '4', intListList8);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test7616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7616");
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList11 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        boolean boolean12 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList11);
        boolean boolean13 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList11);
        boolean boolean14 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList11);
        boolean boolean15 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList11);
        boolean boolean16 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList11);
        boolean boolean17 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList11);
        boolean boolean18 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList11);
        boolean boolean19 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList11);
        boolean boolean20 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList11);
        boolean boolean21 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList11);
        boolean boolean22 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test7617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7617");
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList6 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        boolean boolean7 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList6);
        boolean boolean8 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList6);
        boolean boolean9 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList6);
        boolean boolean10 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList6);
        boolean boolean11 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList6);
        boolean boolean12 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList6);
        java.lang.Class<?> wildcardClass13 = intListList6.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test7618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7618");
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList10 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        boolean boolean11 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList10);
        boolean boolean12 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList10);
        boolean boolean13 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList10);
        boolean boolean14 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList10);
        boolean boolean15 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList10);
        boolean boolean16 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList10);
        boolean boolean17 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList10);
        boolean boolean18 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList10);
        boolean boolean19 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 0, intListList10);
        boolean boolean20 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test7619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7619");
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList12 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        boolean boolean13 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList12);
        boolean boolean14 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList12);
        boolean boolean15 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 0, intListList12);
        boolean boolean16 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList12);
        boolean boolean17 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList12);
        boolean boolean18 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList12);
        boolean boolean19 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList12);
        boolean boolean20 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList12);
        boolean boolean21 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 0, intListList12);
        boolean boolean22 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList12);
        boolean boolean23 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList12);
        boolean boolean24 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test7620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7620");
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList7 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        boolean boolean8 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList7);
        boolean boolean9 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList7);
        boolean boolean10 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList7);
        boolean boolean11 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList7);
        boolean boolean12 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList7);
        boolean boolean13 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 0, intListList7);
        boolean boolean14 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test7621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7621");
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList10 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        boolean boolean11 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList10);
        boolean boolean12 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList10);
        boolean boolean13 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList10);
        boolean boolean14 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList10);
        boolean boolean15 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList10);
        boolean boolean16 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList10);
        boolean boolean17 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList10);
        boolean boolean18 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList10);
        boolean boolean19 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList10);
        boolean boolean20 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList10);
        java.lang.Class<?> wildcardClass21 = intListList10.getClass();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test7622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7622");
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList13 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        boolean boolean14 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList13);
        boolean boolean15 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList13);
        boolean boolean16 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 0, intListList13);
        boolean boolean17 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList13);
        boolean boolean18 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList13);
        boolean boolean19 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList13);
        boolean boolean20 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 0, intListList13);
        boolean boolean21 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList13);
        boolean boolean22 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList13);
        boolean boolean23 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 0, intListList13);
        boolean boolean24 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList13);
        boolean boolean25 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList13);
        boolean boolean26 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList13);
        java.lang.Class<?> wildcardClass27 = intListList13.getClass();
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test7623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7623");
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList9 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        boolean boolean10 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList9);
        boolean boolean11 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList9);
        boolean boolean12 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 0, intListList9);
        boolean boolean13 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList9);
        boolean boolean14 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList9);
        boolean boolean15 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList9);
        boolean boolean16 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 0, intListList9);
        boolean boolean17 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList9);
        boolean boolean18 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 0, intListList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test7624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7624");
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList12 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        boolean boolean13 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList12);
        boolean boolean14 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList12);
        boolean boolean15 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList12);
        boolean boolean16 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 0, intListList12);
        boolean boolean17 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 0, intListList12);
        boolean boolean18 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList12);
        boolean boolean19 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 0, intListList12);
        boolean boolean20 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList12);
        boolean boolean21 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList12);
        boolean boolean22 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList12);
        boolean boolean23 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList12);
        boolean boolean24 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList12);
        java.lang.Class<?> wildcardClass25 = intListList12.getClass();
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test7625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7625");
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList9 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        boolean boolean10 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList9);
        boolean boolean11 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList9);
        boolean boolean12 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList9);
        boolean boolean13 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList9);
        boolean boolean14 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList9);
        boolean boolean15 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList9);
        boolean boolean16 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 0, intListList9);
        boolean boolean17 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList9);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) 'a', intListList9);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test7626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7626");
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList9 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        boolean boolean10 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList9);
        boolean boolean11 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList9);
        boolean boolean12 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList9);
        boolean boolean13 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList9);
        boolean boolean14 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList9);
        boolean boolean15 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList9);
        boolean boolean16 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList9);
        boolean boolean17 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList9);
        boolean boolean18 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList9);
        java.lang.Class<?> wildcardClass19 = intListList9.getClass();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test7627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7627");
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList12 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        boolean boolean13 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList12);
        boolean boolean14 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList12);
        boolean boolean15 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList12);
        boolean boolean16 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList12);
        boolean boolean17 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList12);
        boolean boolean18 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList12);
        boolean boolean19 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList12);
        boolean boolean20 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 0, intListList12);
        boolean boolean21 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 0, intListList12);
        boolean boolean22 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList12);
        boolean boolean23 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList12);
        boolean boolean24 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test7628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7628");
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList11 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        boolean boolean12 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList11);
        boolean boolean13 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList11);
        boolean boolean14 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList11);
        boolean boolean15 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList11);
        boolean boolean16 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList11);
        boolean boolean17 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList11);
        boolean boolean18 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList11);
        boolean boolean19 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList11);
        boolean boolean20 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 0, intListList11);
        boolean boolean21 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList11);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) '#', intListList11);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test7629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7629");
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList12 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        boolean boolean13 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList12);
        boolean boolean14 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList12);
        boolean boolean15 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList12);
        boolean boolean16 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList12);
        boolean boolean17 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 0, intListList12);
        boolean boolean18 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList12);
        boolean boolean19 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 0, intListList12);
        boolean boolean20 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList12);
        boolean boolean21 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList12);
        boolean boolean22 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList12);
        boolean boolean23 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList12);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) 'a', intListList12);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test7630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7630");
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList10 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        boolean boolean11 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList10);
        boolean boolean12 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList10);
        boolean boolean13 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList10);
        boolean boolean14 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList10);
        boolean boolean15 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList10);
        boolean boolean16 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList10);
        boolean boolean17 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList10);
        boolean boolean18 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList10);
        boolean boolean19 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList10);
        boolean boolean20 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList10);
        java.lang.Class<?> wildcardClass21 = intListList10.getClass();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test7631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7631");
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList10 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        boolean boolean11 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList10);
        boolean boolean12 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList10);
        boolean boolean13 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 0, intListList10);
        boolean boolean14 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList10);
        boolean boolean15 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 0, intListList10);
        boolean boolean16 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList10);
        boolean boolean17 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList10);
        boolean boolean18 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList10);
        boolean boolean19 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList10);
        boolean boolean20 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList10);
        java.lang.Class<?> wildcardClass21 = intListList10.getClass();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test7632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7632");
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList13 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        boolean boolean14 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList13);
        boolean boolean15 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList13);
        boolean boolean16 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 0, intListList13);
        boolean boolean17 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList13);
        boolean boolean18 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 0, intListList13);
        boolean boolean19 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList13);
        boolean boolean20 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList13);
        boolean boolean21 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 0, intListList13);
        boolean boolean22 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList13);
        boolean boolean23 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList13);
        boolean boolean24 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList13);
        boolean boolean25 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList13);
        boolean boolean26 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList13);
        java.lang.Class<?> wildcardClass27 = intListList13.getClass();
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test7633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7633");
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList13 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        boolean boolean14 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList13);
        boolean boolean15 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList13);
        boolean boolean16 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList13);
        boolean boolean17 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList13);
        boolean boolean18 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList13);
        boolean boolean19 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList13);
        boolean boolean20 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList13);
        boolean boolean21 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 0, intListList13);
        boolean boolean22 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList13);
        boolean boolean23 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList13);
        boolean boolean24 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 0, intListList13);
        boolean boolean25 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList13);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean26 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 10, intListList13);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test7634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7634");
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList6 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        boolean boolean7 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList6);
        boolean boolean8 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList6);
        boolean boolean9 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList6);
        boolean boolean10 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList6);
        boolean boolean11 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList6);
        boolean boolean12 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test7635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7635");
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList10 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        boolean boolean11 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList10);
        boolean boolean12 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList10);
        boolean boolean13 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList10);
        boolean boolean14 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList10);
        boolean boolean15 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList10);
        boolean boolean16 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList10);
        boolean boolean17 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 0, intListList10);
        boolean boolean18 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList10);
        boolean boolean19 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList10);
        boolean boolean20 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList10);
        java.lang.Class<?> wildcardClass21 = intListList10.getClass();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test7636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7636");
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList9 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        boolean boolean10 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList9);
        boolean boolean11 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList9);
        boolean boolean12 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList9);
        boolean boolean13 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList9);
        boolean boolean14 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList9);
        boolean boolean15 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList9);
        boolean boolean16 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 0, intListList9);
        boolean boolean17 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList9);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 1, intListList9);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test7637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7637");
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList10 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        boolean boolean11 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList10);
        boolean boolean12 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList10);
        boolean boolean13 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList10);
        boolean boolean14 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList10);
        boolean boolean15 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList10);
        boolean boolean16 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList10);
        boolean boolean17 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 0, intListList10);
        boolean boolean18 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList10);
        boolean boolean19 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList10);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 1, intListList10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test7638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7638");
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList5 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        boolean boolean6 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList5);
        boolean boolean7 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList5);
        boolean boolean8 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList5);
        boolean boolean9 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 0, intListList5);
        boolean boolean10 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test7639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7639");
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList6 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        boolean boolean7 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList6);
        boolean boolean8 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList6);
        boolean boolean9 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList6);
        boolean boolean10 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList6);
        boolean boolean11 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList6);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 100, intListList6);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test7640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7640");
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList14 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        boolean boolean15 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList14);
        boolean boolean16 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList14);
        boolean boolean17 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 0, intListList14);
        boolean boolean18 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList14);
        boolean boolean19 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList14);
        boolean boolean20 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList14);
        boolean boolean21 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 0, intListList14);
        boolean boolean22 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList14);
        boolean boolean23 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList14);
        boolean boolean24 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 0, intListList14);
        boolean boolean25 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList14);
        boolean boolean26 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList14);
        boolean boolean27 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList14);
        boolean boolean28 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test7641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7641");
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList8 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        boolean boolean9 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList8);
        boolean boolean10 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList8);
        boolean boolean11 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList8);
        boolean boolean12 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList8);
        boolean boolean13 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList8);
        boolean boolean14 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList8);
        boolean boolean15 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList8);
        boolean boolean16 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test7642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7642");
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList9 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        boolean boolean10 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList9);
        boolean boolean11 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList9);
        boolean boolean12 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList9);
        boolean boolean13 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList9);
        boolean boolean14 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList9);
        boolean boolean15 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList9);
        boolean boolean16 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList9);
        boolean boolean17 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList9);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) '#', intListList9);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test7643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7643");
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList10 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        boolean boolean11 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList10);
        boolean boolean12 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList10);
        boolean boolean13 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList10);
        boolean boolean14 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList10);
        boolean boolean15 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList10);
        boolean boolean16 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList10);
        boolean boolean17 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 0, intListList10);
        boolean boolean18 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList10);
        boolean boolean19 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 0, intListList10);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) 'a', intListList10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test7644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7644");
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList5 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        boolean boolean6 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList5);
        boolean boolean7 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList5);
        boolean boolean8 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList5);
        boolean boolean9 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList5);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(100, intListList5);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test7645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7645");
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList11 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        boolean boolean12 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList11);
        boolean boolean13 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList11);
        boolean boolean14 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList11);
        boolean boolean15 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList11);
        boolean boolean16 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList11);
        boolean boolean17 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList11);
        boolean boolean18 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList11);
        boolean boolean19 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 0, intListList11);
        boolean boolean20 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 0, intListList11);
        boolean boolean21 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList11);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(10, intListList11);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test7646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7646");
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList7 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        boolean boolean8 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList7);
        boolean boolean9 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList7);
        boolean boolean10 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList7);
        boolean boolean11 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList7);
        boolean boolean12 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList7);
        boolean boolean13 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList7);
        boolean boolean14 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 0, intListList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test7647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7647");
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList12 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        boolean boolean13 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList12);
        boolean boolean14 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList12);
        boolean boolean15 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList12);
        boolean boolean16 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList12);
        boolean boolean17 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList12);
        boolean boolean18 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList12);
        boolean boolean19 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList12);
        boolean boolean20 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList12);
        boolean boolean21 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 0, intListList12);
        boolean boolean22 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList12);
        boolean boolean23 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList12);
        boolean boolean24 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test7648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7648");
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList10 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        boolean boolean11 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList10);
        boolean boolean12 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList10);
        boolean boolean13 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList10);
        boolean boolean14 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList10);
        boolean boolean15 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 0, intListList10);
        boolean boolean16 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 0, intListList10);
        boolean boolean17 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 0, intListList10);
        boolean boolean18 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList10);
        boolean boolean19 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList10);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 100, intListList10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test7649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7649");
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList7 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        boolean boolean8 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList7);
        boolean boolean9 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList7);
        boolean boolean10 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList7);
        boolean boolean11 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList7);
        boolean boolean12 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList7);
        boolean boolean13 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList7);
        boolean boolean14 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 0, intListList7);
        java.lang.Class<?> wildcardClass15 = intListList7.getClass();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test7650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7650");
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList14 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        boolean boolean15 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList14);
        boolean boolean16 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList14);
        boolean boolean17 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 0, intListList14);
        boolean boolean18 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList14);
        boolean boolean19 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList14);
        boolean boolean20 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList14);
        boolean boolean21 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 0, intListList14);
        boolean boolean22 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList14);
        boolean boolean23 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList14);
        boolean boolean24 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList14);
        boolean boolean25 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 0, intListList14);
        boolean boolean26 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 0, intListList14);
        boolean boolean27 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList14);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean28 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) '#', intListList14);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test7651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7651");
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList9 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        boolean boolean10 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList9);
        boolean boolean11 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList9);
        boolean boolean12 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 0, intListList9);
        boolean boolean13 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList9);
        boolean boolean14 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList9);
        boolean boolean15 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList9);
        boolean boolean16 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList9);
        boolean boolean17 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList9);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 1, intListList9);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test7652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7652");
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList13 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        boolean boolean14 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList13);
        boolean boolean15 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList13);
        boolean boolean16 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList13);
        boolean boolean17 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList13);
        boolean boolean18 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList13);
        boolean boolean19 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList13);
        boolean boolean20 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList13);
        boolean boolean21 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList13);
        boolean boolean22 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList13);
        boolean boolean23 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList13);
        boolean boolean24 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList13);
        boolean boolean25 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList13);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean26 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 100, intListList13);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test7653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7653");
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList8 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        boolean boolean9 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList8);
        boolean boolean10 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList8);
        boolean boolean11 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 0, intListList8);
        boolean boolean12 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList8);
        boolean boolean13 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList8);
        boolean boolean14 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList8);
        boolean boolean15 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList8);
        boolean boolean16 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test7654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7654");
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList10 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        boolean boolean11 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList10);
        boolean boolean12 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList10);
        boolean boolean13 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList10);
        boolean boolean14 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList10);
        boolean boolean15 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList10);
        boolean boolean16 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList10);
        boolean boolean17 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList10);
        boolean boolean18 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 0, intListList10);
        boolean boolean19 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 0, intListList10);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 1, intListList10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test7655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7655");
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList11 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        boolean boolean12 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList11);
        boolean boolean13 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList11);
        boolean boolean14 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList11);
        boolean boolean15 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 0, intListList11);
        boolean boolean16 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList11);
        boolean boolean17 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList11);
        boolean boolean18 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList11);
        boolean boolean19 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList11);
        boolean boolean20 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList11);
        boolean boolean21 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 0, intListList11);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) ' ', intListList11);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test7656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7656");
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList14 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        boolean boolean15 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList14);
        boolean boolean16 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList14);
        boolean boolean17 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 0, intListList14);
        boolean boolean18 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList14);
        boolean boolean19 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList14);
        boolean boolean20 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList14);
        boolean boolean21 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 0, intListList14);
        boolean boolean22 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList14);
        boolean boolean23 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList14);
        boolean boolean24 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList14);
        boolean boolean25 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList14);
        boolean boolean26 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList14);
        boolean boolean27 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList14);
        boolean boolean28 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test7657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7657");
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList16 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        boolean boolean17 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList16);
        boolean boolean18 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList16);
        boolean boolean19 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 0, intListList16);
        boolean boolean20 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList16);
        boolean boolean21 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList16);
        boolean boolean22 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList16);
        boolean boolean23 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 0, intListList16);
        boolean boolean24 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList16);
        boolean boolean25 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList16);
        boolean boolean26 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList16);
        boolean boolean27 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 0, intListList16);
        boolean boolean28 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 0, intListList16);
        boolean boolean29 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList16);
        boolean boolean30 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList16);
        boolean boolean31 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList16);
        boolean boolean32 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 0, intListList16);
        java.lang.Class<?> wildcardClass33 = intListList16.getClass();
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test7658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7658");
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList5 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        boolean boolean6 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList5);
        boolean boolean7 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList5);
        boolean boolean8 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList5);
        boolean boolean9 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList5);
        boolean boolean10 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 0, intListList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test7659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7659");
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList16 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        boolean boolean17 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList16);
        boolean boolean18 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList16);
        boolean boolean19 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList16);
        boolean boolean20 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList16);
        boolean boolean21 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList16);
        boolean boolean22 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList16);
        boolean boolean23 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList16);
        boolean boolean24 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList16);
        boolean boolean25 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList16);
        boolean boolean26 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList16);
        boolean boolean27 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList16);
        boolean boolean28 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList16);
        boolean boolean29 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList16);
        boolean boolean30 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList16);
        boolean boolean31 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList16);
        boolean boolean32 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test7660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7660");
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList12 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        boolean boolean13 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList12);
        boolean boolean14 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList12);
        boolean boolean15 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList12);
        boolean boolean16 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList12);
        boolean boolean17 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList12);
        boolean boolean18 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList12);
        boolean boolean19 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList12);
        boolean boolean20 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList12);
        boolean boolean21 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList12);
        boolean boolean22 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList12);
        boolean boolean23 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList12);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) '#', intListList12);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test7661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7661");
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList10 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        boolean boolean11 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList10);
        boolean boolean12 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList10);
        boolean boolean13 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList10);
        boolean boolean14 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList10);
        boolean boolean15 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList10);
        boolean boolean16 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList10);
        boolean boolean17 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList10);
        boolean boolean18 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 0, intListList10);
        boolean boolean19 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList10);
        boolean boolean20 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 0, intListList10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test7662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7662");
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList9 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        boolean boolean10 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList9);
        boolean boolean11 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList9);
        boolean boolean12 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList9);
        boolean boolean13 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList9);
        boolean boolean14 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList9);
        boolean boolean15 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList9);
        boolean boolean16 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList9);
        boolean boolean17 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList9);
        boolean boolean18 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 0, intListList9);
        java.lang.Class<?> wildcardClass19 = intListList9.getClass();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test7663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7663");
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList10 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        boolean boolean11 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList10);
        boolean boolean12 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList10);
        boolean boolean13 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList10);
        boolean boolean14 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList10);
        boolean boolean15 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList10);
        boolean boolean16 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList10);
        boolean boolean17 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList10);
        boolean boolean18 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList10);
        boolean boolean19 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList10);
        boolean boolean20 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test7664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7664");
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList10 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        boolean boolean11 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList10);
        boolean boolean12 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList10);
        boolean boolean13 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 0, intListList10);
        boolean boolean14 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList10);
        boolean boolean15 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList10);
        boolean boolean16 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList10);
        boolean boolean17 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList10);
        boolean boolean18 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList10);
        boolean boolean19 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList10);
        boolean boolean20 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 0, intListList10);
        java.lang.Class<?> wildcardClass21 = intListList10.getClass();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test7665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7665");
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList9 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        boolean boolean10 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList9);
        boolean boolean11 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList9);
        boolean boolean12 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList9);
        boolean boolean13 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList9);
        boolean boolean14 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList9);
        boolean boolean15 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList9);
        boolean boolean16 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList9);
        boolean boolean17 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList9);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(100, intListList9);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test7666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7666");
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList10 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        boolean boolean11 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList10);
        boolean boolean12 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList10);
        boolean boolean13 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList10);
        boolean boolean14 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList10);
        boolean boolean15 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 0, intListList10);
        boolean boolean16 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList10);
        boolean boolean17 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList10);
        boolean boolean18 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList10);
        boolean boolean19 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList10);
        boolean boolean20 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 0, intListList10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test7667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7667");
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList10 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        boolean boolean11 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList10);
        boolean boolean12 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList10);
        boolean boolean13 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList10);
        boolean boolean14 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList10);
        boolean boolean15 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList10);
        boolean boolean16 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList10);
        boolean boolean17 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList10);
        boolean boolean18 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList10);
        boolean boolean19 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList10);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) '4', intListList10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test7668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7668");
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList11 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        boolean boolean12 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList11);
        boolean boolean13 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList11);
        boolean boolean14 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList11);
        boolean boolean15 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList11);
        boolean boolean16 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList11);
        boolean boolean17 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList11);
        boolean boolean18 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 0, intListList11);
        boolean boolean19 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList11);
        boolean boolean20 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList11);
        boolean boolean21 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList11);
        boolean boolean22 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList11);
        java.lang.Class<?> wildcardClass23 = intListList11.getClass();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test7669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7669");
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList11 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        boolean boolean12 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList11);
        boolean boolean13 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList11);
        boolean boolean14 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList11);
        boolean boolean15 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList11);
        boolean boolean16 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList11);
        boolean boolean17 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList11);
        boolean boolean18 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList11);
        boolean boolean19 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList11);
        boolean boolean20 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList11);
        boolean boolean21 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList11);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 10, intListList11);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test7670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7670");
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList7 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        boolean boolean8 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList7);
        boolean boolean9 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList7);
        boolean boolean10 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList7);
        boolean boolean11 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList7);
        boolean boolean12 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList7);
        boolean boolean13 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList7);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 1, intListList7);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test7671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7671");
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList4 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        boolean boolean5 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList4);
        boolean boolean6 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList4);
        boolean boolean7 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList4);
        boolean boolean8 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 0, intListList4);
        java.lang.Class<?> wildcardClass9 = intListList4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test7672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7672");
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList13 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        boolean boolean14 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList13);
        boolean boolean15 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList13);
        boolean boolean16 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList13);
        boolean boolean17 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList13);
        boolean boolean18 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList13);
        boolean boolean19 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList13);
        boolean boolean20 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList13);
        boolean boolean21 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList13);
        boolean boolean22 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList13);
        boolean boolean23 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 0, intListList13);
        boolean boolean24 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList13);
        boolean boolean25 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList13);
        boolean boolean26 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList13);
        java.lang.Class<?> wildcardClass27 = intListList13.getClass();
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test7673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7673");
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList10 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        boolean boolean11 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList10);
        boolean boolean12 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList10);
        boolean boolean13 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList10);
        boolean boolean14 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList10);
        boolean boolean15 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList10);
        boolean boolean16 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList10);
        boolean boolean17 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList10);
        boolean boolean18 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList10);
        boolean boolean19 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList10);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 1, intListList10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test7674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7674");
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList12 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        boolean boolean13 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList12);
        boolean boolean14 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList12);
        boolean boolean15 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList12);
        boolean boolean16 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList12);
        boolean boolean17 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList12);
        boolean boolean18 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList12);
        boolean boolean19 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList12);
        boolean boolean20 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList12);
        boolean boolean21 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList12);
        boolean boolean22 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList12);
        boolean boolean23 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList12);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) 'a', intListList12);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test7675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7675");
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList8 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        boolean boolean9 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList8);
        boolean boolean10 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList8);
        boolean boolean11 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList8);
        boolean boolean12 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList8);
        boolean boolean13 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList8);
        boolean boolean14 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList8);
        boolean boolean15 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList8);
        boolean boolean16 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test7676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7676");
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList11 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        boolean boolean12 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList11);
        boolean boolean13 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList11);
        boolean boolean14 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 0, intListList11);
        boolean boolean15 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList11);
        boolean boolean16 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList11);
        boolean boolean17 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList11);
        boolean boolean18 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList11);
        boolean boolean19 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList11);
        boolean boolean20 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList11);
        boolean boolean21 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 0, intListList11);
        boolean boolean22 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList11);
        java.lang.Class<?> wildcardClass23 = intListList11.getClass();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test7677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7677");
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList11 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        boolean boolean12 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList11);
        boolean boolean13 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList11);
        boolean boolean14 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList11);
        boolean boolean15 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList11);
        boolean boolean16 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 0, intListList11);
        boolean boolean17 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 0, intListList11);
        boolean boolean18 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList11);
        boolean boolean19 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList11);
        boolean boolean20 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 0, intListList11);
        boolean boolean21 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList11);
        boolean boolean22 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test7678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7678");
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList7 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        boolean boolean8 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList7);
        boolean boolean9 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList7);
        boolean boolean10 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList7);
        boolean boolean11 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList7);
        boolean boolean12 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList7);
        boolean boolean13 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList7);
        boolean boolean14 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList7);
        java.lang.Class<?> wildcardClass15 = intListList7.getClass();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test7679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7679");
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList8 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        boolean boolean9 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList8);
        boolean boolean10 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList8);
        boolean boolean11 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList8);
        boolean boolean12 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 0, intListList8);
        boolean boolean13 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 0, intListList8);
        boolean boolean14 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList8);
        boolean boolean15 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 0, intListList8);
        boolean boolean16 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test7680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7680");
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList6 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        boolean boolean7 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList6);
        boolean boolean8 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList6);
        boolean boolean9 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList6);
        boolean boolean10 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList6);
        boolean boolean11 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 0, intListList6);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(10, intListList6);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test7681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7681");
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList14 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        boolean boolean15 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList14);
        boolean boolean16 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList14);
        boolean boolean17 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList14);
        boolean boolean18 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList14);
        boolean boolean19 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList14);
        boolean boolean20 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList14);
        boolean boolean21 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList14);
        boolean boolean22 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 0, intListList14);
        boolean boolean23 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 0, intListList14);
        boolean boolean24 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 0, intListList14);
        boolean boolean25 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList14);
        boolean boolean26 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList14);
        boolean boolean27 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList14);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean28 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) ' ', intListList14);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test7682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7682");
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList8 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        boolean boolean9 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList8);
        boolean boolean10 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList8);
        boolean boolean11 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 0, intListList8);
        boolean boolean12 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList8);
        boolean boolean13 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList8);
        boolean boolean14 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList8);
        boolean boolean15 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList8);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(100, intListList8);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test7683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7683");
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList9 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        boolean boolean10 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList9);
        boolean boolean11 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList9);
        boolean boolean12 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList9);
        boolean boolean13 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList9);
        boolean boolean14 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList9);
        boolean boolean15 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList9);
        boolean boolean16 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 0, intListList9);
        boolean boolean17 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList9);
        boolean boolean18 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList9);
        java.lang.Class<?> wildcardClass19 = intListList9.getClass();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test7684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7684");
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList15 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        boolean boolean16 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList15);
        boolean boolean17 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList15);
        boolean boolean18 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList15);
        boolean boolean19 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList15);
        boolean boolean20 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList15);
        boolean boolean21 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList15);
        boolean boolean22 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList15);
        boolean boolean23 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 0, intListList15);
        boolean boolean24 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList15);
        boolean boolean25 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList15);
        boolean boolean26 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 0, intListList15);
        boolean boolean27 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList15);
        boolean boolean28 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList15);
        boolean boolean29 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList15);
        boolean boolean30 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 0, intListList15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test7685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7685");
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList6 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        boolean boolean7 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList6);
        boolean boolean8 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList6);
        boolean boolean9 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList6);
        boolean boolean10 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList6);
        boolean boolean11 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList6);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) '4', intListList6);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test7686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7686");
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList10 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        boolean boolean11 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList10);
        boolean boolean12 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList10);
        boolean boolean13 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList10);
        boolean boolean14 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList10);
        boolean boolean15 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList10);
        boolean boolean16 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList10);
        boolean boolean17 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 0, intListList10);
        boolean boolean18 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList10);
        boolean boolean19 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList10);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 10, intListList10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test7687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7687");
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList11 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        boolean boolean12 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList11);
        boolean boolean13 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList11);
        boolean boolean14 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 0, intListList11);
        boolean boolean15 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList11);
        boolean boolean16 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList11);
        boolean boolean17 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList11);
        boolean boolean18 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 0, intListList11);
        boolean boolean19 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList11);
        boolean boolean20 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList11);
        boolean boolean21 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList11);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(100, intListList11);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test7688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7688");
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList8 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        boolean boolean9 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList8);
        boolean boolean10 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList8);
        boolean boolean11 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList8);
        boolean boolean12 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList8);
        boolean boolean13 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList8);
        boolean boolean14 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList8);
        boolean boolean15 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList8);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 10, intListList8);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test7689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7689");
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList7 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        boolean boolean8 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList7);
        boolean boolean9 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList7);
        boolean boolean10 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList7);
        boolean boolean11 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList7);
        boolean boolean12 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList7);
        boolean boolean13 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList7);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 1, intListList7);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test7690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7690");
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList9 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        boolean boolean10 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList9);
        boolean boolean11 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList9);
        boolean boolean12 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList9);
        boolean boolean13 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList9);
        boolean boolean14 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList9);
        boolean boolean15 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 0, intListList9);
        boolean boolean16 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList9);
        boolean boolean17 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList9);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 10, intListList9);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test7691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7691");
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList10 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        boolean boolean11 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList10);
        boolean boolean12 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList10);
        boolean boolean13 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList10);
        boolean boolean14 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList10);
        boolean boolean15 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList10);
        boolean boolean16 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList10);
        boolean boolean17 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList10);
        boolean boolean18 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList10);
        boolean boolean19 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList10);
        boolean boolean20 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test7692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7692");
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList8 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        boolean boolean9 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList8);
        boolean boolean10 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList8);
        boolean boolean11 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList8);
        boolean boolean12 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList8);
        boolean boolean13 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList8);
        boolean boolean14 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList8);
        boolean boolean15 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList8);
        boolean boolean16 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test7693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7693");
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList8 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        boolean boolean9 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList8);
        boolean boolean10 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList8);
        boolean boolean11 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList8);
        boolean boolean12 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList8);
        boolean boolean13 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 0, intListList8);
        boolean boolean14 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList8);
        boolean boolean15 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList8);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) ' ', intListList8);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test7694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7694");
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList11 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        boolean boolean12 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList11);
        boolean boolean13 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList11);
        boolean boolean14 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList11);
        boolean boolean15 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList11);
        boolean boolean16 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList11);
        boolean boolean17 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList11);
        boolean boolean18 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList11);
        boolean boolean19 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList11);
        boolean boolean20 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList11);
        boolean boolean21 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList11);
        boolean boolean22 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test7695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7695");
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList9 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        boolean boolean10 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList9);
        boolean boolean11 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList9);
        boolean boolean12 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList9);
        boolean boolean13 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 0, intListList9);
        boolean boolean14 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 0, intListList9);
        boolean boolean15 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList9);
        boolean boolean16 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList9);
        boolean boolean17 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 0, intListList9);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 10, intListList9);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test7696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7696");
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList6 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        boolean boolean7 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList6);
        boolean boolean8 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList6);
        boolean boolean9 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList6);
        boolean boolean10 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList6);
        boolean boolean11 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList6);
        boolean boolean12 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList6);
        java.lang.Class<?> wildcardClass13 = intListList6.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test7697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7697");
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList7 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        boolean boolean8 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList7);
        boolean boolean9 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList7);
        boolean boolean10 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList7);
        boolean boolean11 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList7);
        boolean boolean12 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 0, intListList7);
        boolean boolean13 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList7);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 100, intListList7);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test7698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7698");
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList9 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        boolean boolean10 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList9);
        boolean boolean11 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList9);
        boolean boolean12 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList9);
        boolean boolean13 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList9);
        boolean boolean14 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 0, intListList9);
        boolean boolean15 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList9);
        boolean boolean16 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList9);
        boolean boolean17 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList9);
        boolean boolean18 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test7699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7699");
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList9 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        boolean boolean10 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList9);
        boolean boolean11 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList9);
        boolean boolean12 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList9);
        boolean boolean13 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList9);
        boolean boolean14 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList9);
        boolean boolean15 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList9);
        boolean boolean16 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList9);
        boolean boolean17 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList9);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 1, intListList9);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test7700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7700");
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList6 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        boolean boolean7 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList6);
        boolean boolean8 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList6);
        boolean boolean9 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 0, intListList6);
        boolean boolean10 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList6);
        boolean boolean11 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 0, intListList6);
        boolean boolean12 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test7701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7701");
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList10 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        boolean boolean11 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList10);
        boolean boolean12 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList10);
        boolean boolean13 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList10);
        boolean boolean14 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList10);
        boolean boolean15 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList10);
        boolean boolean16 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList10);
        boolean boolean17 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList10);
        boolean boolean18 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList10);
        boolean boolean19 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList10);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) ' ', intListList10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test7702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7702");
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList10 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        boolean boolean11 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList10);
        boolean boolean12 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList10);
        boolean boolean13 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 0, intListList10);
        boolean boolean14 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList10);
        boolean boolean15 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList10);
        boolean boolean16 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList10);
        boolean boolean17 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList10);
        boolean boolean18 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList10);
        boolean boolean19 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList10);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 1, intListList10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test7703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7703");
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList3 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        boolean boolean4 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList3);
        boolean boolean5 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList3);
        boolean boolean6 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test7704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7704");
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList11 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        boolean boolean12 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList11);
        boolean boolean13 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList11);
        boolean boolean14 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList11);
        boolean boolean15 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList11);
        boolean boolean16 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList11);
        boolean boolean17 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList11);
        boolean boolean18 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList11);
        boolean boolean19 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 0, intListList11);
        boolean boolean20 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList11);
        boolean boolean21 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList11);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(10, intListList11);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test7705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7705");
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList12 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        boolean boolean13 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList12);
        boolean boolean14 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList12);
        boolean boolean15 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList12);
        boolean boolean16 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList12);
        boolean boolean17 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList12);
        boolean boolean18 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList12);
        boolean boolean19 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList12);
        boolean boolean20 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList12);
        boolean boolean21 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList12);
        boolean boolean22 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList12);
        boolean boolean23 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList12);
        boolean boolean24 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test7706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7706");
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList9 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        boolean boolean10 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList9);
        boolean boolean11 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList9);
        boolean boolean12 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList9);
        boolean boolean13 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList9);
        boolean boolean14 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList9);
        boolean boolean15 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList9);
        boolean boolean16 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 0, intListList9);
        boolean boolean17 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList9);
        boolean boolean18 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test7707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7707");
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList8 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        boolean boolean9 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList8);
        boolean boolean10 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList8);
        boolean boolean11 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList8);
        boolean boolean12 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList8);
        boolean boolean13 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList8);
        boolean boolean14 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList8);
        boolean boolean15 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList8);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) '#', intListList8);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test7708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7708");
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList12 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        boolean boolean13 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList12);
        boolean boolean14 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList12);
        boolean boolean15 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList12);
        boolean boolean16 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList12);
        boolean boolean17 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList12);
        boolean boolean18 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList12);
        boolean boolean19 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList12);
        boolean boolean20 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList12);
        boolean boolean21 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 0, intListList12);
        boolean boolean22 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList12);
        boolean boolean23 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList12);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 1, intListList12);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test7709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7709");
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList10 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        boolean boolean11 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList10);
        boolean boolean12 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList10);
        boolean boolean13 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList10);
        boolean boolean14 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList10);
        boolean boolean15 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList10);
        boolean boolean16 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList10);
        boolean boolean17 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList10);
        boolean boolean18 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList10);
        boolean boolean19 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList10);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) '#', intListList10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test7710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7710");
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList12 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        boolean boolean13 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList12);
        boolean boolean14 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList12);
        boolean boolean15 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList12);
        boolean boolean16 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList12);
        boolean boolean17 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 0, intListList12);
        boolean boolean18 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 0, intListList12);
        boolean boolean19 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 0, intListList12);
        boolean boolean20 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList12);
        boolean boolean21 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 0, intListList12);
        boolean boolean22 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList12);
        boolean boolean23 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList12);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 100, intListList12);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test7711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7711");
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList9 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        boolean boolean10 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList9);
        boolean boolean11 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList9);
        boolean boolean12 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList9);
        boolean boolean13 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 0, intListList9);
        boolean boolean14 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList9);
        boolean boolean15 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList9);
        boolean boolean16 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList9);
        boolean boolean17 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList9);
        boolean boolean18 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList9);
        java.lang.Class<?> wildcardClass19 = intListList9.getClass();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test7712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7712");
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList10 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        boolean boolean11 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList10);
        boolean boolean12 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList10);
        boolean boolean13 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList10);
        boolean boolean14 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList10);
        boolean boolean15 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList10);
        boolean boolean16 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList10);
        boolean boolean17 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList10);
        boolean boolean18 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 0, intListList10);
        boolean boolean19 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList10);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 100, intListList10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test7713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7713");
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList7 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        boolean boolean8 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList7);
        boolean boolean9 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList7);
        boolean boolean10 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList7);
        boolean boolean11 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList7);
        boolean boolean12 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList7);
        boolean boolean13 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList7);
        boolean boolean14 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test7714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7714");
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList7 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        boolean boolean8 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList7);
        boolean boolean9 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList7);
        boolean boolean10 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList7);
        boolean boolean11 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList7);
        boolean boolean12 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList7);
        boolean boolean13 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList7);
        boolean boolean14 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList7);
        java.lang.Class<?> wildcardClass15 = intListList7.getClass();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test7715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7715");
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList10 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        boolean boolean11 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList10);
        boolean boolean12 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList10);
        boolean boolean13 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList10);
        boolean boolean14 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 0, intListList10);
        boolean boolean15 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 0, intListList10);
        boolean boolean16 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList10);
        boolean boolean17 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList10);
        boolean boolean18 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 0, intListList10);
        boolean boolean19 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList10);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 100, intListList10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test7716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7716");
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList8 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        boolean boolean9 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList8);
        boolean boolean10 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList8);
        boolean boolean11 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 0, intListList8);
        boolean boolean12 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList8);
        boolean boolean13 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList8);
        boolean boolean14 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList8);
        boolean boolean15 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList8);
        boolean boolean16 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test7717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7717");
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList7 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        boolean boolean8 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList7);
        boolean boolean9 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList7);
        boolean boolean10 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList7);
        boolean boolean11 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList7);
        boolean boolean12 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList7);
        boolean boolean13 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList7);
        boolean boolean14 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test7718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7718");
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList7 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        boolean boolean8 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList7);
        boolean boolean9 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList7);
        boolean boolean10 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList7);
        boolean boolean11 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 0, intListList7);
        boolean boolean12 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList7);
        boolean boolean13 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList7);
        boolean boolean14 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test7719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7719");
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList12 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        boolean boolean13 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList12);
        boolean boolean14 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList12);
        boolean boolean15 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList12);
        boolean boolean16 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList12);
        boolean boolean17 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList12);
        boolean boolean18 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 0, intListList12);
        boolean boolean19 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList12);
        boolean boolean20 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList12);
        boolean boolean21 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList12);
        boolean boolean22 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList12);
        boolean boolean23 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList12);
        boolean boolean24 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList12);
        java.lang.Class<?> wildcardClass25 = intListList12.getClass();
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test7720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7720");
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList6 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        boolean boolean7 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList6);
        boolean boolean8 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList6);
        boolean boolean9 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList6);
        boolean boolean10 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList6);
        boolean boolean11 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList6);
        boolean boolean12 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList6);
        java.lang.Class<?> wildcardClass13 = intListList6.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test7721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7721");
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList11 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        boolean boolean12 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList11);
        boolean boolean13 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList11);
        boolean boolean14 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList11);
        boolean boolean15 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList11);
        boolean boolean16 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList11);
        boolean boolean17 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList11);
        boolean boolean18 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList11);
        boolean boolean19 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList11);
        boolean boolean20 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList11);
        boolean boolean21 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList11);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 1, intListList11);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test7722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7722");
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList6 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        boolean boolean7 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList6);
        boolean boolean8 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList6);
        boolean boolean9 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 0, intListList6);
        boolean boolean10 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList6);
        boolean boolean11 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList6);
        boolean boolean12 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 0, intListList6);
        java.lang.Class<?> wildcardClass13 = intListList6.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test7723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7723");
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList11 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        boolean boolean12 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList11);
        boolean boolean13 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList11);
        boolean boolean14 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList11);
        boolean boolean15 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList11);
        boolean boolean16 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList11);
        boolean boolean17 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList11);
        boolean boolean18 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList11);
        boolean boolean19 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList11);
        boolean boolean20 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList11);
        boolean boolean21 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList11);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 100, intListList11);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test7724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7724");
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList7 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        boolean boolean8 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList7);
        boolean boolean9 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList7);
        boolean boolean10 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList7);
        boolean boolean11 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList7);
        boolean boolean12 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 0, intListList7);
        boolean boolean13 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList7);
        boolean boolean14 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test7725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7725");
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList10 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        boolean boolean11 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList10);
        boolean boolean12 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList10);
        boolean boolean13 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList10);
        boolean boolean14 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList10);
        boolean boolean15 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList10);
        boolean boolean16 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList10);
        boolean boolean17 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 0, intListList10);
        boolean boolean18 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList10);
        boolean boolean19 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList10);
        boolean boolean20 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test7726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7726");
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList12 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        boolean boolean13 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList12);
        boolean boolean14 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList12);
        boolean boolean15 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList12);
        boolean boolean16 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList12);
        boolean boolean17 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList12);
        boolean boolean18 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList12);
        boolean boolean19 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList12);
        boolean boolean20 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList12);
        boolean boolean21 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList12);
        boolean boolean22 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList12);
        boolean boolean23 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList12);
        boolean boolean24 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test7727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7727");
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList12 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        boolean boolean13 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList12);
        boolean boolean14 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList12);
        boolean boolean15 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList12);
        boolean boolean16 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList12);
        boolean boolean17 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 0, intListList12);
        boolean boolean18 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList12);
        boolean boolean19 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList12);
        boolean boolean20 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 0, intListList12);
        boolean boolean21 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList12);
        boolean boolean22 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList12);
        boolean boolean23 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList12);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(1, intListList12);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test7728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7728");
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList7 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        boolean boolean8 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList7);
        boolean boolean9 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList7);
        boolean boolean10 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList7);
        boolean boolean11 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList7);
        boolean boolean12 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList7);
        boolean boolean13 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList7);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 10, intListList7);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test7729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7729");
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList10 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        boolean boolean11 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList10);
        boolean boolean12 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList10);
        boolean boolean13 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 0, intListList10);
        boolean boolean14 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList10);
        boolean boolean15 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList10);
        boolean boolean16 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList10);
        boolean boolean17 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList10);
        boolean boolean18 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList10);
        boolean boolean19 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList10);
        boolean boolean20 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test7730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7730");
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList14 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        boolean boolean15 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList14);
        boolean boolean16 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList14);
        boolean boolean17 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList14);
        boolean boolean18 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 0, intListList14);
        boolean boolean19 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList14);
        boolean boolean20 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList14);
        boolean boolean21 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList14);
        boolean boolean22 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList14);
        boolean boolean23 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 0, intListList14);
        boolean boolean24 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList14);
        boolean boolean25 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 0, intListList14);
        boolean boolean26 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList14);
        boolean boolean27 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList14);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean28 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 1, intListList14);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test7731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7731");
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList11 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        boolean boolean12 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList11);
        boolean boolean13 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList11);
        boolean boolean14 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 0, intListList11);
        boolean boolean15 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList11);
        boolean boolean16 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 0, intListList11);
        boolean boolean17 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList11);
        boolean boolean18 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList11);
        boolean boolean19 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 0, intListList11);
        boolean boolean20 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 0, intListList11);
        boolean boolean21 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList11);
        boolean boolean22 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test7732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7732");
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList12 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        boolean boolean13 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList12);
        boolean boolean14 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList12);
        boolean boolean15 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList12);
        boolean boolean16 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList12);
        boolean boolean17 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList12);
        boolean boolean18 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList12);
        boolean boolean19 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList12);
        boolean boolean20 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 0, intListList12);
        boolean boolean21 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList12);
        boolean boolean22 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 0, intListList12);
        boolean boolean23 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList12);
        boolean boolean24 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test7733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7733");
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList11 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        boolean boolean12 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList11);
        boolean boolean13 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList11);
        boolean boolean14 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList11);
        boolean boolean15 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 0, intListList11);
        boolean boolean16 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 0, intListList11);
        boolean boolean17 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList11);
        boolean boolean18 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList11);
        boolean boolean19 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList11);
        boolean boolean20 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList11);
        boolean boolean21 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList11);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 1, intListList11);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test7734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7734");
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList10 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        boolean boolean11 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList10);
        boolean boolean12 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList10);
        boolean boolean13 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList10);
        boolean boolean14 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList10);
        boolean boolean15 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList10);
        boolean boolean16 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList10);
        boolean boolean17 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 0, intListList10);
        boolean boolean18 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList10);
        boolean boolean19 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList10);
        boolean boolean20 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList10);
        java.lang.Class<?> wildcardClass21 = intListList10.getClass();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test7735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7735");
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList9 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        boolean boolean10 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList9);
        boolean boolean11 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList9);
        boolean boolean12 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((-1), intListList9);
        boolean boolean13 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList9);
        boolean boolean14 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite(0, intListList9);
        boolean boolean15 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) 0, intListList9);
        boolean boolean16 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) -1, intListList9);
        boolean boolean17 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (short) -1, intListList9);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = com.thealgorithms.datastructures.graphs.BipartiteGrapfDFS.isBipartite((int) (byte) 10, intListList9);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }
}

