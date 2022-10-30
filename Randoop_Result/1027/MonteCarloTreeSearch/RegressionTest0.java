package MonteCarloTreeSearch;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test01");
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.searches.MonteCarloTreeSearch.Node node1 = monteCarloTreeSearch0.new Node();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to com.thealgorithms.searches.MonteCarloTreeSearch$Node with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch0 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node1 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node3 = monteCarloTreeSearch0.new Node(node1, false);
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch4 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node5 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node7 = monteCarloTreeSearch4.new Node(node5, false);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.searches.MonteCarloTreeSearch.Node node8 = monteCarloTreeSearch0.getWinnerNode(node7);
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch0 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch1 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node2 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node4 = monteCarloTreeSearch1.new Node(node2, false);
        monteCarloTreeSearch0.addChildNodes(node4, (-1));
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch7 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node8 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node10 = monteCarloTreeSearch7.new Node(node8, false);
        monteCarloTreeSearch0.addChildNodes(node10, 1);
        java.lang.Class<?> wildcardClass13 = monteCarloTreeSearch0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch0 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch1 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch2 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node3 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node5 = monteCarloTreeSearch2.new Node(node3, false);
        monteCarloTreeSearch1.addChildNodes(node5, (-1));
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch8 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch9 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node10 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node12 = monteCarloTreeSearch9.new Node(node10, false);
        monteCarloTreeSearch8.addChildNodes(node12, (-1));
        monteCarloTreeSearch1.addChildNodes(node12, 0);
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node17 = monteCarloTreeSearch0.monteCarloTreeSearch(node12);
        java.lang.Class<?> wildcardClass18 = monteCarloTreeSearch0.getClass();
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch0 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node1 = monteCarloTreeSearch0.new Node();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch2 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node3 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node5 = monteCarloTreeSearch2.new Node(node3, false);
        // The following exception was thrown during execution in test generation
        try {
            monteCarloTreeSearch0.addChildNodes(node3, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"childNodes\" because \"node\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch0 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node1 = monteCarloTreeSearch0.new Node();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch2 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch3 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node4 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node6 = monteCarloTreeSearch3.new Node(node4, false);
        monteCarloTreeSearch2.addChildNodes(node6, (-1));
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch9 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch10 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node11 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node13 = monteCarloTreeSearch10.new Node(node11, false);
        monteCarloTreeSearch9.addChildNodes(node13, (-1));
        monteCarloTreeSearch2.addChildNodes(node13, 0);
        monteCarloTreeSearch0.simulateRandomPlay(node13);
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch19 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch20 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node21 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node23 = monteCarloTreeSearch20.new Node(node21, false);
        monteCarloTreeSearch19.addChildNodes(node23, (-1));
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch26 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node27 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node29 = monteCarloTreeSearch26.new Node(node27, false);
        monteCarloTreeSearch19.addChildNodes(node29, 1);
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node32 = monteCarloTreeSearch19.new Node();
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.searches.MonteCarloTreeSearch.Node node33 = monteCarloTreeSearch0.getWinnerNode(node32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Collection.iterator()\" because \"coll\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch0 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch1 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch2 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node3 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node5 = monteCarloTreeSearch2.new Node(node3, false);
        monteCarloTreeSearch1.addChildNodes(node5, (-1));
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch8 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch9 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node10 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node12 = monteCarloTreeSearch9.new Node(node10, false);
        monteCarloTreeSearch8.addChildNodes(node12, (-1));
        monteCarloTreeSearch1.addChildNodes(node12, 0);
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node17 = monteCarloTreeSearch0.monteCarloTreeSearch(node12);
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch18 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch19 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node20 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node22 = monteCarloTreeSearch19.new Node(node20, false);
        monteCarloTreeSearch18.addChildNodes(node22, (-1));
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch25 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch26 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node27 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node29 = monteCarloTreeSearch26.new Node(node27, false);
        monteCarloTreeSearch25.addChildNodes(node29, (-1));
        monteCarloTreeSearch18.simulateRandomPlay(node29);
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch33 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch34 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch35 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node36 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node38 = monteCarloTreeSearch35.new Node(node36, false);
        monteCarloTreeSearch34.addChildNodes(node38, (-1));
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch41 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch42 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node43 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node45 = monteCarloTreeSearch42.new Node(node43, false);
        monteCarloTreeSearch41.addChildNodes(node45, (-1));
        monteCarloTreeSearch34.addChildNodes(node45, 0);
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node50 = monteCarloTreeSearch33.monteCarloTreeSearch(node45);
        monteCarloTreeSearch18.printScores(node50);
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch52 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch53 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node54 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node56 = monteCarloTreeSearch53.new Node(node54, false);
        monteCarloTreeSearch52.addChildNodes(node56, (-1));
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch59 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch60 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node61 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node63 = monteCarloTreeSearch60.new Node(node61, false);
        monteCarloTreeSearch59.addChildNodes(node63, (-1));
        monteCarloTreeSearch52.addChildNodes(node63, 0);
        monteCarloTreeSearch18.simulateRandomPlay(node63);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.searches.MonteCarloTreeSearch.Node node69 = monteCarloTreeSearch0.getWinnerNode(node63);
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node50);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch0 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch1 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node2 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node4 = monteCarloTreeSearch1.new Node(node2, false);
        monteCarloTreeSearch0.addChildNodes(node4, (-1));
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch7 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch8 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node9 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node11 = monteCarloTreeSearch8.new Node(node9, false);
        monteCarloTreeSearch7.addChildNodes(node11, (-1));
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch14 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch15 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node16 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node18 = monteCarloTreeSearch15.new Node(node16, false);
        monteCarloTreeSearch14.addChildNodes(node18, (-1));
        monteCarloTreeSearch7.addChildNodes(node18, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.searches.MonteCarloTreeSearch.Node node23 = monteCarloTreeSearch0.getWinnerNode(node18);
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch0 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch1 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node2 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node4 = monteCarloTreeSearch1.new Node(node2, false);
        monteCarloTreeSearch0.addChildNodes(node4, (-1));
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch7 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node8 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node10 = monteCarloTreeSearch7.new Node(node8, false);
        monteCarloTreeSearch0.printScores(node10);
        java.lang.Class<?> wildcardClass12 = node10.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch0 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch1 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch2 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node3 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node5 = monteCarloTreeSearch2.new Node(node3, false);
        monteCarloTreeSearch1.addChildNodes(node5, (-1));
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch8 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch9 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node10 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node12 = monteCarloTreeSearch9.new Node(node10, false);
        monteCarloTreeSearch8.addChildNodes(node12, (-1));
        monteCarloTreeSearch1.simulateRandomPlay(node12);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.searches.MonteCarloTreeSearch.Node node17 = monteCarloTreeSearch0.new Node(node12, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to com.thealgorithms.searches.MonteCarloTreeSearch$Node with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch0 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch1 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node2 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node4 = monteCarloTreeSearch1.new Node(node2, false);
        monteCarloTreeSearch0.addChildNodes(node4, (-1));
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch7 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch8 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node9 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node11 = monteCarloTreeSearch8.new Node(node9, false);
        monteCarloTreeSearch7.addChildNodes(node11, (-1));
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch14 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch15 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node16 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node18 = monteCarloTreeSearch15.new Node(node16, false);
        monteCarloTreeSearch14.addChildNodes(node18, (-1));
        monteCarloTreeSearch7.simulateRandomPlay(node18);
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch22 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch23 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch24 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node25 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node27 = monteCarloTreeSearch24.new Node(node25, false);
        monteCarloTreeSearch23.addChildNodes(node27, (-1));
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch30 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch31 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node32 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node34 = monteCarloTreeSearch31.new Node(node32, false);
        monteCarloTreeSearch30.addChildNodes(node34, (-1));
        monteCarloTreeSearch23.addChildNodes(node34, 0);
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node39 = monteCarloTreeSearch22.monteCarloTreeSearch(node34);
        monteCarloTreeSearch7.printScores(node39);
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch41 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch42 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node43 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node45 = monteCarloTreeSearch42.new Node(node43, false);
        monteCarloTreeSearch41.addChildNodes(node45, (-1));
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch48 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch49 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node50 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node52 = monteCarloTreeSearch49.new Node(node50, false);
        monteCarloTreeSearch48.addChildNodes(node52, (-1));
        monteCarloTreeSearch41.addChildNodes(node52, 0);
        monteCarloTreeSearch7.simulateRandomPlay(node52);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.searches.MonteCarloTreeSearch.Node node58 = monteCarloTreeSearch0.getWinnerNode(node52);
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node39);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch0 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch1 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node2 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node4 = monteCarloTreeSearch1.new Node(node2, false);
        monteCarloTreeSearch0.addChildNodes(node4, (-1));
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch7 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node8 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node10 = monteCarloTreeSearch7.new Node(node8, false);
        monteCarloTreeSearch0.addChildNodes(node10, 1);
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node13 = monteCarloTreeSearch0.new Node();
        java.lang.Class<?> wildcardClass14 = monteCarloTreeSearch0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch0 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch1 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node2 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node4 = monteCarloTreeSearch1.new Node(node2, false);
        monteCarloTreeSearch0.addChildNodes(node4, (-1));
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch7 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch8 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node9 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node11 = monteCarloTreeSearch8.new Node(node9, false);
        monteCarloTreeSearch7.addChildNodes(node11, (-1));
        monteCarloTreeSearch0.addChildNodes(node11, 0);
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node16 = monteCarloTreeSearch0.new Node();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node17 = monteCarloTreeSearch0.new Node();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch18 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch19 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node20 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node22 = monteCarloTreeSearch19.new Node(node20, false);
        monteCarloTreeSearch18.addChildNodes(node22, (-1));
        monteCarloTreeSearch0.simulateRandomPlay(node22);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch0 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node1 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node3 = monteCarloTreeSearch0.new Node(node1, false);
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch4 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch5 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node6 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node8 = monteCarloTreeSearch5.new Node(node6, false);
        monteCarloTreeSearch4.addChildNodes(node8, (-1));
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch11 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node12 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node14 = monteCarloTreeSearch11.new Node(node12, false);
        monteCarloTreeSearch4.addChildNodes(node14, 1);
        monteCarloTreeSearch0.addChildNodes(node14, (-1));
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch19 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch20 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node21 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node23 = monteCarloTreeSearch20.new Node(node21, false);
        monteCarloTreeSearch19.addChildNodes(node23, (-1));
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch26 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node27 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node29 = monteCarloTreeSearch26.new Node(node27, false);
        monteCarloTreeSearch19.printScores(node29);
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node31 = monteCarloTreeSearch0.getPromisingNode(node29);
        org.junit.Assert.assertNotNull(node31);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch0 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch1 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch2 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node3 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node5 = monteCarloTreeSearch2.new Node(node3, false);
        monteCarloTreeSearch1.addChildNodes(node5, (-1));
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch8 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch9 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node10 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node12 = monteCarloTreeSearch9.new Node(node10, false);
        monteCarloTreeSearch8.addChildNodes(node12, (-1));
        monteCarloTreeSearch1.addChildNodes(node12, 0);
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node17 = monteCarloTreeSearch0.monteCarloTreeSearch(node12);
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node18 = null;
        // The following exception was thrown during execution in test generation
        try {
            monteCarloTreeSearch0.printScores(node18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"childNodes\" because \"rootNode\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node17);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch0 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch1 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node2 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node4 = monteCarloTreeSearch1.new Node(node2, false);
        monteCarloTreeSearch0.addChildNodes(node4, (-1));
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch7 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch8 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node9 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node11 = monteCarloTreeSearch8.new Node(node9, false);
        monteCarloTreeSearch7.addChildNodes(node11, (-1));
        monteCarloTreeSearch0.addChildNodes(node11, 0);
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node16 = monteCarloTreeSearch0.new Node();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node17 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node19 = monteCarloTreeSearch0.new Node(node17, true);
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch20 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node21 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node23 = monteCarloTreeSearch20.new Node(node21, false);
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch24 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node25 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node27 = monteCarloTreeSearch24.new Node(node25, false);
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch28 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch29 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node30 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node32 = monteCarloTreeSearch29.new Node(node30, false);
        monteCarloTreeSearch28.addChildNodes(node32, (-1));
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch35 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node36 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node38 = monteCarloTreeSearch35.new Node(node36, false);
        monteCarloTreeSearch28.addChildNodes(node38, 1);
        monteCarloTreeSearch24.printScores(node38);
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node42 = monteCarloTreeSearch20.getWinnerNode(node38);
        monteCarloTreeSearch0.addChildNodes(node38, (int) (byte) 100);
        org.junit.Assert.assertNotNull(node42);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch0 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch1 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node2 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node4 = monteCarloTreeSearch1.new Node(node2, false);
        monteCarloTreeSearch0.addChildNodes(node4, (-1));
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch7 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch8 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node9 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node11 = monteCarloTreeSearch8.new Node(node9, false);
        monteCarloTreeSearch7.addChildNodes(node11, (-1));
        monteCarloTreeSearch0.simulateRandomPlay(node11);
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch15 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch16 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch17 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node18 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node20 = monteCarloTreeSearch17.new Node(node18, false);
        monteCarloTreeSearch16.addChildNodes(node20, (-1));
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch23 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch24 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node25 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node27 = monteCarloTreeSearch24.new Node(node25, false);
        monteCarloTreeSearch23.addChildNodes(node27, (-1));
        monteCarloTreeSearch16.addChildNodes(node27, 0);
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node32 = monteCarloTreeSearch15.monteCarloTreeSearch(node27);
        monteCarloTreeSearch0.printScores(node32);
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch34 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch35 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node36 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node38 = monteCarloTreeSearch35.new Node(node36, false);
        monteCarloTreeSearch34.addChildNodes(node38, (-1));
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch41 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch42 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node43 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node45 = monteCarloTreeSearch42.new Node(node43, false);
        monteCarloTreeSearch41.addChildNodes(node45, (-1));
        monteCarloTreeSearch34.addChildNodes(node45, 0);
        monteCarloTreeSearch0.simulateRandomPlay(node45);
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch51 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node52 = monteCarloTreeSearch51.new Node();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch53 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch54 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node55 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node57 = monteCarloTreeSearch54.new Node(node55, false);
        monteCarloTreeSearch53.addChildNodes(node57, (-1));
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch60 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch61 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node62 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node64 = monteCarloTreeSearch61.new Node(node62, false);
        monteCarloTreeSearch60.addChildNodes(node64, (-1));
        monteCarloTreeSearch53.addChildNodes(node64, 0);
        monteCarloTreeSearch51.simulateRandomPlay(node64);
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node70 = monteCarloTreeSearch0.monteCarloTreeSearch(node64);
        java.lang.Class<?> wildcardClass71 = node70.getClass();
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNotNull(node70);
        org.junit.Assert.assertNotNull(wildcardClass71);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch0 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node1 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node3 = monteCarloTreeSearch0.new Node(node1, false);
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch4 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node5 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node7 = monteCarloTreeSearch4.new Node(node5, false);
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch8 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch9 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node10 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node12 = monteCarloTreeSearch9.new Node(node10, false);
        monteCarloTreeSearch8.addChildNodes(node12, (-1));
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch15 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node16 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node18 = monteCarloTreeSearch15.new Node(node16, false);
        monteCarloTreeSearch8.addChildNodes(node18, 1);
        monteCarloTreeSearch4.printScores(node18);
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node22 = monteCarloTreeSearch0.getWinnerNode(node18);
        java.lang.Class<?> wildcardClass23 = node18.getClass();
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch0 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node1 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node3 = monteCarloTreeSearch0.new Node(node1, false);
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch4 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch5 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node6 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node8 = monteCarloTreeSearch5.new Node(node6, false);
        monteCarloTreeSearch4.addChildNodes(node8, (-1));
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch11 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node12 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node14 = monteCarloTreeSearch11.new Node(node12, false);
        monteCarloTreeSearch4.addChildNodes(node14, 1);
        monteCarloTreeSearch0.addChildNodes(node14, (-1));
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch19 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch20 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node21 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node23 = monteCarloTreeSearch20.new Node(node21, false);
        monteCarloTreeSearch19.addChildNodes(node23, (-1));
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch26 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch27 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node28 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node30 = monteCarloTreeSearch27.new Node(node28, false);
        monteCarloTreeSearch26.addChildNodes(node30, (-1));
        monteCarloTreeSearch19.simulateRandomPlay(node30);
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node34 = monteCarloTreeSearch0.monteCarloTreeSearch(node30);
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch35 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch36 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node37 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node39 = monteCarloTreeSearch36.new Node(node37, false);
        monteCarloTreeSearch35.addChildNodes(node39, (-1));
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch42 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch43 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node44 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node46 = monteCarloTreeSearch43.new Node(node44, false);
        monteCarloTreeSearch42.addChildNodes(node46, (-1));
        monteCarloTreeSearch35.simulateRandomPlay(node46);
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch50 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch51 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch52 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node53 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node55 = monteCarloTreeSearch52.new Node(node53, false);
        monteCarloTreeSearch51.addChildNodes(node55, (-1));
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch58 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch59 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node60 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node62 = monteCarloTreeSearch59.new Node(node60, false);
        monteCarloTreeSearch58.addChildNodes(node62, (-1));
        monteCarloTreeSearch51.addChildNodes(node62, 0);
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node67 = monteCarloTreeSearch50.monteCarloTreeSearch(node62);
        monteCarloTreeSearch35.printScores(node67);
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch69 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch70 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node71 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node73 = monteCarloTreeSearch70.new Node(node71, false);
        monteCarloTreeSearch69.addChildNodes(node73, (-1));
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch76 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch77 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node78 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node80 = monteCarloTreeSearch77.new Node(node78, false);
        monteCarloTreeSearch76.addChildNodes(node80, (-1));
        monteCarloTreeSearch69.addChildNodes(node80, 0);
        monteCarloTreeSearch35.simulateRandomPlay(node80);
        monteCarloTreeSearch0.simulateRandomPlay(node80);
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node87 = monteCarloTreeSearch0.new Node();
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNotNull(node67);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch0 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch1 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node2 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node4 = monteCarloTreeSearch1.new Node(node2, false);
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch5 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch6 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node7 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node9 = monteCarloTreeSearch6.new Node(node7, false);
        monteCarloTreeSearch5.addChildNodes(node9, (-1));
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch12 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node13 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node15 = monteCarloTreeSearch12.new Node(node13, false);
        monteCarloTreeSearch5.addChildNodes(node15, 1);
        monteCarloTreeSearch1.printScores(node15);
        monteCarloTreeSearch0.addChildNodes(node15, 10);
        java.lang.Class<?> wildcardClass21 = node15.getClass();
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch0 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch1 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node2 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node4 = monteCarloTreeSearch1.new Node(node2, false);
        monteCarloTreeSearch0.addChildNodes(node4, (-1));
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch7 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch8 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node9 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node11 = monteCarloTreeSearch8.new Node(node9, false);
        monteCarloTreeSearch7.addChildNodes(node11, (-1));
        monteCarloTreeSearch0.addChildNodes(node11, 0);
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch16 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch17 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node18 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node20 = monteCarloTreeSearch17.new Node(node18, false);
        monteCarloTreeSearch16.addChildNodes(node20, (-1));
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch23 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch24 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node25 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node27 = monteCarloTreeSearch24.new Node(node25, false);
        monteCarloTreeSearch23.addChildNodes(node27, (-1));
        monteCarloTreeSearch16.simulateRandomPlay(node27);
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch31 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch32 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch33 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node34 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node36 = monteCarloTreeSearch33.new Node(node34, false);
        monteCarloTreeSearch32.addChildNodes(node36, (-1));
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch39 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch40 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node41 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node43 = monteCarloTreeSearch40.new Node(node41, false);
        monteCarloTreeSearch39.addChildNodes(node43, (-1));
        monteCarloTreeSearch32.addChildNodes(node43, 0);
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node48 = monteCarloTreeSearch31.monteCarloTreeSearch(node43);
        monteCarloTreeSearch16.printScores(node48);
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch50 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch51 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node52 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node54 = monteCarloTreeSearch51.new Node(node52, false);
        monteCarloTreeSearch50.addChildNodes(node54, (-1));
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch57 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch58 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node59 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node61 = monteCarloTreeSearch58.new Node(node59, false);
        monteCarloTreeSearch57.addChildNodes(node61, (-1));
        monteCarloTreeSearch50.addChildNodes(node61, 0);
        monteCarloTreeSearch16.simulateRandomPlay(node61);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.searches.MonteCarloTreeSearch.Node node67 = monteCarloTreeSearch0.getWinnerNode(node61);
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node48);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch0 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node1 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node3 = monteCarloTreeSearch0.new Node(node1, false);
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch4 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch5 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node6 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node8 = monteCarloTreeSearch5.new Node(node6, false);
        monteCarloTreeSearch4.addChildNodes(node8, (-1));
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch11 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node12 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node14 = monteCarloTreeSearch11.new Node(node12, false);
        monteCarloTreeSearch4.addChildNodes(node14, 1);
        monteCarloTreeSearch0.addChildNodes(node14, (-1));
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch19 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch20 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node21 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node23 = monteCarloTreeSearch20.new Node(node21, false);
        monteCarloTreeSearch19.addChildNodes(node23, (-1));
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch26 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch27 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node28 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node30 = monteCarloTreeSearch27.new Node(node28, false);
        monteCarloTreeSearch26.addChildNodes(node30, (-1));
        monteCarloTreeSearch19.simulateRandomPlay(node30);
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node34 = monteCarloTreeSearch0.monteCarloTreeSearch(node30);
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch35 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch36 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node37 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node39 = monteCarloTreeSearch36.new Node(node37, false);
        monteCarloTreeSearch35.addChildNodes(node39, (-1));
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch42 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch43 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node44 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node46 = monteCarloTreeSearch43.new Node(node44, false);
        monteCarloTreeSearch42.addChildNodes(node46, (-1));
        monteCarloTreeSearch35.simulateRandomPlay(node46);
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch50 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch51 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch52 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node53 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node55 = monteCarloTreeSearch52.new Node(node53, false);
        monteCarloTreeSearch51.addChildNodes(node55, (-1));
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch58 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch59 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node60 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node62 = monteCarloTreeSearch59.new Node(node60, false);
        monteCarloTreeSearch58.addChildNodes(node62, (-1));
        monteCarloTreeSearch51.addChildNodes(node62, 0);
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node67 = monteCarloTreeSearch50.monteCarloTreeSearch(node62);
        monteCarloTreeSearch35.printScores(node67);
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch69 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch70 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node71 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node73 = monteCarloTreeSearch70.new Node(node71, false);
        monteCarloTreeSearch69.addChildNodes(node73, (-1));
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch76 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch77 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node78 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node80 = monteCarloTreeSearch77.new Node(node78, false);
        monteCarloTreeSearch76.addChildNodes(node80, (-1));
        monteCarloTreeSearch69.addChildNodes(node80, 0);
        monteCarloTreeSearch35.simulateRandomPlay(node80);
        monteCarloTreeSearch0.simulateRandomPlay(node80);
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch87 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch88 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node89 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node91 = monteCarloTreeSearch88.new Node(node89, false);
        monteCarloTreeSearch87.addChildNodes(node91, (-1));
        monteCarloTreeSearch0.printScores(node91);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNotNull(node67);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch0 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch1 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node2 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node4 = monteCarloTreeSearch1.new Node(node2, false);
        monteCarloTreeSearch0.addChildNodes(node4, (-1));
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch7 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch8 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node9 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node11 = monteCarloTreeSearch8.new Node(node9, false);
        monteCarloTreeSearch7.addChildNodes(node11, (-1));
        monteCarloTreeSearch0.addChildNodes(node11, 0);
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node16 = monteCarloTreeSearch0.new Node();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node17 = monteCarloTreeSearch0.new Node();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch18 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node19 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node21 = monteCarloTreeSearch18.new Node(node19, false);
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch22 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node23 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node25 = monteCarloTreeSearch22.new Node(node23, false);
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch26 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch27 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node28 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node30 = monteCarloTreeSearch27.new Node(node28, false);
        monteCarloTreeSearch26.addChildNodes(node30, (-1));
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch33 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node34 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node36 = monteCarloTreeSearch33.new Node(node34, false);
        monteCarloTreeSearch26.addChildNodes(node36, 1);
        monteCarloTreeSearch22.printScores(node36);
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node40 = monteCarloTreeSearch18.getWinnerNode(node36);
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node41 = monteCarloTreeSearch18.new Node();
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.searches.MonteCarloTreeSearch.Node node42 = monteCarloTreeSearch0.getPromisingNode(node41);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.ArrayList.size()\" because \"promisingNode.childNodes\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node40);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch0 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch1 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node2 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node4 = monteCarloTreeSearch1.new Node(node2, false);
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch5 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch6 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node7 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node9 = monteCarloTreeSearch6.new Node(node7, false);
        monteCarloTreeSearch5.addChildNodes(node9, (-1));
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch12 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node13 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node15 = monteCarloTreeSearch12.new Node(node13, false);
        monteCarloTreeSearch5.addChildNodes(node15, 1);
        monteCarloTreeSearch1.printScores(node15);
        monteCarloTreeSearch0.addChildNodes(node15, 10);
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch21 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node22 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node24 = monteCarloTreeSearch21.new Node(node22, false);
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch25 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch26 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node27 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node29 = monteCarloTreeSearch26.new Node(node27, false);
        monteCarloTreeSearch25.addChildNodes(node29, (-1));
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch32 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node33 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node35 = monteCarloTreeSearch32.new Node(node33, false);
        monteCarloTreeSearch25.addChildNodes(node35, 1);
        monteCarloTreeSearch21.addChildNodes(node35, (-1));
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch40 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch41 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node42 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node44 = monteCarloTreeSearch41.new Node(node42, false);
        monteCarloTreeSearch40.addChildNodes(node44, (-1));
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch47 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch48 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node49 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node51 = monteCarloTreeSearch48.new Node(node49, false);
        monteCarloTreeSearch47.addChildNodes(node51, (-1));
        monteCarloTreeSearch40.simulateRandomPlay(node51);
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch55 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch56 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch57 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node58 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node60 = monteCarloTreeSearch57.new Node(node58, false);
        monteCarloTreeSearch56.addChildNodes(node60, (-1));
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch63 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch64 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node65 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node67 = monteCarloTreeSearch64.new Node(node65, false);
        monteCarloTreeSearch63.addChildNodes(node67, (-1));
        monteCarloTreeSearch56.addChildNodes(node67, 0);
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node72 = monteCarloTreeSearch55.monteCarloTreeSearch(node67);
        monteCarloTreeSearch40.printScores(node72);
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node75 = monteCarloTreeSearch21.new Node(node72, false);
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node76 = monteCarloTreeSearch0.getPromisingNode(node75);
        org.junit.Assert.assertNotNull(node72);
        org.junit.Assert.assertNotNull(node76);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch0 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch1 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node2 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node4 = monteCarloTreeSearch1.new Node(node2, false);
        monteCarloTreeSearch0.addChildNodes(node4, (-1));
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch7 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch8 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node9 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node11 = monteCarloTreeSearch8.new Node(node9, false);
        monteCarloTreeSearch7.addChildNodes(node11, (-1));
        monteCarloTreeSearch0.addChildNodes(node11, 0);
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node16 = monteCarloTreeSearch0.new Node();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node17 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node19 = monteCarloTreeSearch0.new Node(node17, true);
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch20 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch21 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch22 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node23 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node25 = monteCarloTreeSearch22.new Node(node23, false);
        monteCarloTreeSearch21.addChildNodes(node25, (-1));
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch28 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch29 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node30 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node32 = monteCarloTreeSearch29.new Node(node30, false);
        monteCarloTreeSearch28.addChildNodes(node32, (-1));
        monteCarloTreeSearch21.simulateRandomPlay(node32);
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch36 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch37 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch38 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node39 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node41 = monteCarloTreeSearch38.new Node(node39, false);
        monteCarloTreeSearch37.addChildNodes(node41, (-1));
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch44 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch45 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node46 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node48 = monteCarloTreeSearch45.new Node(node46, false);
        monteCarloTreeSearch44.addChildNodes(node48, (-1));
        monteCarloTreeSearch37.addChildNodes(node48, 0);
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node53 = monteCarloTreeSearch36.monteCarloTreeSearch(node48);
        monteCarloTreeSearch21.printScores(node53);
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node55 = monteCarloTreeSearch20.getWinnerNode(node53);
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node57 = monteCarloTreeSearch0.new Node(node53, true);
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch58 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node59 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node61 = monteCarloTreeSearch58.new Node(node59, false);
        monteCarloTreeSearch0.addChildNodes(node59, (int) (byte) -1);
        org.junit.Assert.assertNotNull(node53);
        org.junit.Assert.assertNotNull(node55);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch0 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node1 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node3 = monteCarloTreeSearch0.new Node(node1, false);
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch4 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch5 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node6 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node8 = monteCarloTreeSearch5.new Node(node6, false);
        monteCarloTreeSearch4.addChildNodes(node8, (-1));
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch11 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch12 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node13 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node15 = monteCarloTreeSearch12.new Node(node13, false);
        monteCarloTreeSearch11.addChildNodes(node15, (-1));
        monteCarloTreeSearch4.addChildNodes(node15, 0);
        monteCarloTreeSearch0.simulateRandomPlay(node15);
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch21 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch22 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node23 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node25 = monteCarloTreeSearch22.new Node(node23, false);
        monteCarloTreeSearch21.addChildNodes(node25, (-1));
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch28 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch29 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node30 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node32 = monteCarloTreeSearch29.new Node(node30, false);
        monteCarloTreeSearch28.addChildNodes(node32, (-1));
        monteCarloTreeSearch21.addChildNodes(node32, 0);
        monteCarloTreeSearch0.addChildNodes(node32, (int) (byte) -1);
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch39 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node40 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node42 = monteCarloTreeSearch39.new Node(node40, false);
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch43 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch44 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node45 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node47 = monteCarloTreeSearch44.new Node(node45, false);
        monteCarloTreeSearch43.addChildNodes(node47, (-1));
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch50 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node51 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node53 = monteCarloTreeSearch50.new Node(node51, false);
        monteCarloTreeSearch43.addChildNodes(node53, 1);
        monteCarloTreeSearch39.addChildNodes(node53, (-1));
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node58 = monteCarloTreeSearch0.getWinnerNode(node53);
        org.junit.Assert.assertNotNull(node58);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch0 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node1 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node3 = monteCarloTreeSearch0.new Node(node1, false);
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch4 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node5 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node7 = monteCarloTreeSearch4.new Node(node5, false);
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch8 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch9 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node10 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node12 = monteCarloTreeSearch9.new Node(node10, false);
        monteCarloTreeSearch8.addChildNodes(node12, (-1));
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch15 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node16 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node18 = monteCarloTreeSearch15.new Node(node16, false);
        monteCarloTreeSearch8.addChildNodes(node18, 1);
        monteCarloTreeSearch4.printScores(node18);
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node22 = monteCarloTreeSearch0.getWinnerNode(node18);
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch23 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node24 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node26 = monteCarloTreeSearch23.new Node(node24, false);
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch27 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch28 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node29 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node31 = monteCarloTreeSearch28.new Node(node29, false);
        monteCarloTreeSearch27.addChildNodes(node31, (-1));
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch34 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch35 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node36 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node38 = monteCarloTreeSearch35.new Node(node36, false);
        monteCarloTreeSearch34.addChildNodes(node38, (-1));
        monteCarloTreeSearch27.addChildNodes(node38, 0);
        monteCarloTreeSearch23.simulateRandomPlay(node38);
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node44 = monteCarloTreeSearch0.getPromisingNode(node38);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(node44);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch0 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch1 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch2 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node3 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node5 = monteCarloTreeSearch2.new Node(node3, false);
        monteCarloTreeSearch1.addChildNodes(node5, (-1));
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch8 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch9 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node10 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node12 = monteCarloTreeSearch9.new Node(node10, false);
        monteCarloTreeSearch8.addChildNodes(node12, (-1));
        monteCarloTreeSearch1.addChildNodes(node12, 0);
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node17 = monteCarloTreeSearch0.monteCarloTreeSearch(node12);
        java.lang.Class<?> wildcardClass18 = node12.getClass();
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch0 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch1 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node2 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node4 = monteCarloTreeSearch1.new Node(node2, false);
        monteCarloTreeSearch0.addChildNodes(node4, (-1));
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch7 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch8 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node9 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node11 = monteCarloTreeSearch8.new Node(node9, false);
        monteCarloTreeSearch7.addChildNodes(node11, (-1));
        monteCarloTreeSearch0.addChildNodes(node11, 0);
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node16 = monteCarloTreeSearch0.new Node();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node17 = monteCarloTreeSearch0.new Node();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch18 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node19 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node21 = monteCarloTreeSearch18.new Node(node19, false);
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch22 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch23 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node24 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node26 = monteCarloTreeSearch23.new Node(node24, false);
        monteCarloTreeSearch22.addChildNodes(node26, (-1));
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch29 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node30 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node32 = monteCarloTreeSearch29.new Node(node30, false);
        monteCarloTreeSearch22.addChildNodes(node32, 1);
        monteCarloTreeSearch18.addChildNodes(node32, (-1));
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch37 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch38 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node39 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node41 = monteCarloTreeSearch38.new Node(node39, false);
        monteCarloTreeSearch37.addChildNodes(node41, (-1));
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch44 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch45 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node46 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node48 = monteCarloTreeSearch45.new Node(node46, false);
        monteCarloTreeSearch44.addChildNodes(node48, (-1));
        monteCarloTreeSearch37.simulateRandomPlay(node48);
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node52 = monteCarloTreeSearch18.monteCarloTreeSearch(node48);
        monteCarloTreeSearch0.printScores(node48);
        org.junit.Assert.assertNotNull(node52);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch0 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node1 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node3 = monteCarloTreeSearch0.new Node(node1, false);
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch4 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch5 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node6 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node8 = monteCarloTreeSearch5.new Node(node6, false);
        monteCarloTreeSearch4.addChildNodes(node8, (-1));
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch11 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node12 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node14 = monteCarloTreeSearch11.new Node(node12, false);
        monteCarloTreeSearch4.addChildNodes(node14, 1);
        monteCarloTreeSearch0.printScores(node14);
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch18 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node19 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node21 = monteCarloTreeSearch18.new Node(node19, false);
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch22 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch23 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node24 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node26 = monteCarloTreeSearch23.new Node(node24, false);
        monteCarloTreeSearch22.addChildNodes(node26, (-1));
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch29 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node30 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node32 = monteCarloTreeSearch29.new Node(node30, false);
        monteCarloTreeSearch22.addChildNodes(node32, 1);
        monteCarloTreeSearch18.addChildNodes(node32, (-1));
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch37 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch38 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node39 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node41 = monteCarloTreeSearch38.new Node(node39, false);
        monteCarloTreeSearch37.addChildNodes(node41, (-1));
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch44 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch45 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node46 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node48 = monteCarloTreeSearch45.new Node(node46, false);
        monteCarloTreeSearch44.addChildNodes(node48, (-1));
        monteCarloTreeSearch37.simulateRandomPlay(node48);
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node52 = monteCarloTreeSearch18.monteCarloTreeSearch(node48);
        monteCarloTreeSearch0.addChildNodes(node48, (int) '4');
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch55 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch56 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node57 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node59 = monteCarloTreeSearch56.new Node(node57, false);
        monteCarloTreeSearch55.addChildNodes(node59, (-1));
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch62 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch63 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node64 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node66 = monteCarloTreeSearch63.new Node(node64, false);
        monteCarloTreeSearch62.addChildNodes(node66, (-1));
        monteCarloTreeSearch55.addChildNodes(node66, 0);
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node71 = monteCarloTreeSearch55.new Node();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node72 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node74 = monteCarloTreeSearch55.new Node(node72, true);
        // The following exception was thrown during execution in test generation
        try {
            monteCarloTreeSearch0.simulateRandomPlay(node72);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot assign field \"playerWon\" because \"promisingNode\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node52);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch0 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch1 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node2 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node4 = monteCarloTreeSearch1.new Node(node2, false);
        monteCarloTreeSearch0.addChildNodes(node4, (-1));
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch7 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node8 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node10 = monteCarloTreeSearch7.new Node(node8, false);
        monteCarloTreeSearch0.addChildNodes(node10, 1);
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node13 = monteCarloTreeSearch0.new Node();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch14 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node15 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node17 = monteCarloTreeSearch14.new Node(node15, false);
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch18 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node19 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node21 = monteCarloTreeSearch18.new Node(node19, false);
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch22 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch23 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node24 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node26 = monteCarloTreeSearch23.new Node(node24, false);
        monteCarloTreeSearch22.addChildNodes(node26, (-1));
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch29 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node30 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node32 = monteCarloTreeSearch29.new Node(node30, false);
        monteCarloTreeSearch22.addChildNodes(node32, 1);
        monteCarloTreeSearch18.printScores(node32);
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node36 = monteCarloTreeSearch14.getWinnerNode(node32);
        monteCarloTreeSearch0.addChildNodes(node32, (int) (byte) 10);
        org.junit.Assert.assertNotNull(node36);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch0 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node1 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node3 = monteCarloTreeSearch0.new Node(node1, false);
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch4 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch5 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node6 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node8 = monteCarloTreeSearch5.new Node(node6, false);
        monteCarloTreeSearch4.addChildNodes(node8, (-1));
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch11 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node12 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node14 = monteCarloTreeSearch11.new Node(node12, false);
        monteCarloTreeSearch4.addChildNodes(node14, 1);
        monteCarloTreeSearch0.printScores(node14);
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch18 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node19 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node21 = monteCarloTreeSearch18.new Node(node19, false);
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch22 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch23 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node24 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node26 = monteCarloTreeSearch23.new Node(node24, false);
        monteCarloTreeSearch22.addChildNodes(node26, (-1));
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch29 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node30 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node32 = monteCarloTreeSearch29.new Node(node30, false);
        monteCarloTreeSearch22.addChildNodes(node32, 1);
        monteCarloTreeSearch18.addChildNodes(node32, (-1));
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch37 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch38 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node39 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node41 = monteCarloTreeSearch38.new Node(node39, false);
        monteCarloTreeSearch37.addChildNodes(node41, (-1));
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch44 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch45 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node46 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node48 = monteCarloTreeSearch45.new Node(node46, false);
        monteCarloTreeSearch44.addChildNodes(node48, (-1));
        monteCarloTreeSearch37.simulateRandomPlay(node48);
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node52 = monteCarloTreeSearch18.monteCarloTreeSearch(node48);
        monteCarloTreeSearch0.addChildNodes(node48, (int) '4');
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch55 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch56 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch57 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node58 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node60 = monteCarloTreeSearch57.new Node(node58, false);
        monteCarloTreeSearch56.addChildNodes(node60, (-1));
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch63 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch64 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node65 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node67 = monteCarloTreeSearch64.new Node(node65, false);
        monteCarloTreeSearch63.addChildNodes(node67, (-1));
        monteCarloTreeSearch56.simulateRandomPlay(node67);
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch71 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch72 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch73 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node74 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node76 = monteCarloTreeSearch73.new Node(node74, false);
        monteCarloTreeSearch72.addChildNodes(node76, (-1));
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch79 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch80 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node81 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node83 = monteCarloTreeSearch80.new Node(node81, false);
        monteCarloTreeSearch79.addChildNodes(node83, (-1));
        monteCarloTreeSearch72.addChildNodes(node83, 0);
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node88 = monteCarloTreeSearch71.monteCarloTreeSearch(node83);
        monteCarloTreeSearch56.printScores(node88);
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node90 = monteCarloTreeSearch55.getWinnerNode(node88);
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node91 = monteCarloTreeSearch0.getPromisingNode(node90);
        java.lang.Class<?> wildcardClass92 = node91.getClass();
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertNotNull(node88);
        org.junit.Assert.assertNotNull(node90);
        org.junit.Assert.assertNotNull(node91);
        org.junit.Assert.assertNotNull(wildcardClass92);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch0 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node1 = monteCarloTreeSearch0.new Node();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch2 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch3 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node4 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node6 = monteCarloTreeSearch3.new Node(node4, false);
        monteCarloTreeSearch2.addChildNodes(node6, (-1));
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch9 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch10 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node11 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node13 = monteCarloTreeSearch10.new Node(node11, false);
        monteCarloTreeSearch9.addChildNodes(node13, (-1));
        monteCarloTreeSearch2.addChildNodes(node13, 0);
        monteCarloTreeSearch0.simulateRandomPlay(node13);
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch19 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node20 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node22 = monteCarloTreeSearch19.new Node(node20, false);
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch23 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node24 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node26 = monteCarloTreeSearch23.new Node(node24, false);
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch27 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch28 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node29 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node31 = monteCarloTreeSearch28.new Node(node29, false);
        monteCarloTreeSearch27.addChildNodes(node31, (-1));
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch34 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node35 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node37 = monteCarloTreeSearch34.new Node(node35, false);
        monteCarloTreeSearch27.addChildNodes(node37, 1);
        monteCarloTreeSearch23.printScores(node37);
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node41 = monteCarloTreeSearch19.getWinnerNode(node37);
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node43 = monteCarloTreeSearch0.new Node(node41, false);
        org.junit.Assert.assertNotNull(node41);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch0 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch1 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node2 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node4 = monteCarloTreeSearch1.new Node(node2, false);
        monteCarloTreeSearch0.addChildNodes(node4, (-1));
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch7 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch8 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node9 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node11 = monteCarloTreeSearch8.new Node(node9, false);
        monteCarloTreeSearch7.addChildNodes(node11, (-1));
        monteCarloTreeSearch0.addChildNodes(node11, 0);
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node16 = monteCarloTreeSearch0.new Node();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node17 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node19 = monteCarloTreeSearch0.new Node(node17, true);
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch20 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch21 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch22 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node23 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node25 = monteCarloTreeSearch22.new Node(node23, false);
        monteCarloTreeSearch21.addChildNodes(node25, (-1));
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch28 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch29 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node30 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node32 = monteCarloTreeSearch29.new Node(node30, false);
        monteCarloTreeSearch28.addChildNodes(node32, (-1));
        monteCarloTreeSearch21.simulateRandomPlay(node32);
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch36 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch37 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch38 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node39 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node41 = monteCarloTreeSearch38.new Node(node39, false);
        monteCarloTreeSearch37.addChildNodes(node41, (-1));
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch44 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch45 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node46 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node48 = monteCarloTreeSearch45.new Node(node46, false);
        monteCarloTreeSearch44.addChildNodes(node48, (-1));
        monteCarloTreeSearch37.addChildNodes(node48, 0);
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node53 = monteCarloTreeSearch36.monteCarloTreeSearch(node48);
        monteCarloTreeSearch21.printScores(node53);
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node55 = monteCarloTreeSearch20.getWinnerNode(node53);
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node57 = monteCarloTreeSearch0.new Node(node53, true);
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node58 = monteCarloTreeSearch0.new Node();
        org.junit.Assert.assertNotNull(node53);
        org.junit.Assert.assertNotNull(node55);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch0 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch1 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node2 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node4 = monteCarloTreeSearch1.new Node(node2, false);
        monteCarloTreeSearch0.addChildNodes(node4, (-1));
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch7 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch8 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node9 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node11 = monteCarloTreeSearch8.new Node(node9, false);
        monteCarloTreeSearch7.addChildNodes(node11, (-1));
        monteCarloTreeSearch0.simulateRandomPlay(node11);
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch15 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch16 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch17 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node18 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node20 = monteCarloTreeSearch17.new Node(node18, false);
        monteCarloTreeSearch16.addChildNodes(node20, (-1));
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch23 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch24 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node25 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node27 = monteCarloTreeSearch24.new Node(node25, false);
        monteCarloTreeSearch23.addChildNodes(node27, (-1));
        monteCarloTreeSearch16.addChildNodes(node27, 0);
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node32 = monteCarloTreeSearch15.monteCarloTreeSearch(node27);
        monteCarloTreeSearch0.printScores(node32);
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch34 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch35 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node36 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node38 = monteCarloTreeSearch35.new Node(node36, false);
        monteCarloTreeSearch34.addChildNodes(node38, (-1));
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch41 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch42 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node43 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node45 = monteCarloTreeSearch42.new Node(node43, false);
        monteCarloTreeSearch41.addChildNodes(node45, (-1));
        monteCarloTreeSearch34.addChildNodes(node45, 0);
        monteCarloTreeSearch0.simulateRandomPlay(node45);
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch51 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node52 = monteCarloTreeSearch51.new Node();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch53 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch54 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node55 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node57 = monteCarloTreeSearch54.new Node(node55, false);
        monteCarloTreeSearch53.addChildNodes(node57, (-1));
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch60 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch61 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node62 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node64 = monteCarloTreeSearch61.new Node(node62, false);
        monteCarloTreeSearch60.addChildNodes(node64, (-1));
        monteCarloTreeSearch53.addChildNodes(node64, 0);
        monteCarloTreeSearch51.simulateRandomPlay(node64);
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node70 = monteCarloTreeSearch0.monteCarloTreeSearch(node64);
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch71 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch72 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node73 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node75 = monteCarloTreeSearch72.new Node(node73, false);
        monteCarloTreeSearch71.addChildNodes(node75, (-1));
        monteCarloTreeSearch0.printScores(node75);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNotNull(node70);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch0 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node1 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node3 = monteCarloTreeSearch0.new Node(node1, false);
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch4 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch5 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node6 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node8 = monteCarloTreeSearch5.new Node(node6, false);
        monteCarloTreeSearch4.addChildNodes(node8, (-1));
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch11 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node12 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node14 = monteCarloTreeSearch11.new Node(node12, false);
        monteCarloTreeSearch4.addChildNodes(node14, 1);
        monteCarloTreeSearch0.printScores(node14);
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node18 = monteCarloTreeSearch0.new Node();
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch0 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch1 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node2 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node4 = monteCarloTreeSearch1.new Node(node2, false);
        monteCarloTreeSearch0.addChildNodes(node4, (-1));
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch7 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch8 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node9 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node11 = monteCarloTreeSearch8.new Node(node9, false);
        monteCarloTreeSearch7.addChildNodes(node11, (-1));
        monteCarloTreeSearch0.addChildNodes(node11, 0);
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node16 = monteCarloTreeSearch0.new Node();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node17 = monteCarloTreeSearch0.new Node();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch18 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node19 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node21 = monteCarloTreeSearch18.new Node(node19, false);
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch22 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch23 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node24 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node26 = monteCarloTreeSearch23.new Node(node24, false);
        monteCarloTreeSearch22.addChildNodes(node26, (-1));
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch29 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node30 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node32 = monteCarloTreeSearch29.new Node(node30, false);
        monteCarloTreeSearch22.addChildNodes(node32, 1);
        monteCarloTreeSearch18.printScores(node32);
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch36 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node37 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node39 = monteCarloTreeSearch36.new Node(node37, false);
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch40 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node41 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node43 = monteCarloTreeSearch40.new Node(node41, false);
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch44 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch45 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node46 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node48 = monteCarloTreeSearch45.new Node(node46, false);
        monteCarloTreeSearch44.addChildNodes(node48, (-1));
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch51 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node52 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node54 = monteCarloTreeSearch51.new Node(node52, false);
        monteCarloTreeSearch44.addChildNodes(node54, 1);
        monteCarloTreeSearch40.printScores(node54);
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node58 = monteCarloTreeSearch36.getWinnerNode(node54);
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node59 = monteCarloTreeSearch18.getWinnerNode(node54);
        monteCarloTreeSearch0.addChildNodes(node54, 0);
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch62 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node63 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node65 = monteCarloTreeSearch62.new Node(node63, false);
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch66 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch67 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node68 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node70 = monteCarloTreeSearch67.new Node(node68, false);
        monteCarloTreeSearch66.addChildNodes(node70, (-1));
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch73 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node74 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node76 = monteCarloTreeSearch73.new Node(node74, false);
        monteCarloTreeSearch66.addChildNodes(node76, 1);
        monteCarloTreeSearch62.addChildNodes(node76, (-1));
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch81 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch82 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node83 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node85 = monteCarloTreeSearch82.new Node(node83, false);
        monteCarloTreeSearch81.addChildNodes(node85, (-1));
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch88 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch89 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node90 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node92 = monteCarloTreeSearch89.new Node(node90, false);
        monteCarloTreeSearch88.addChildNodes(node92, (-1));
        monteCarloTreeSearch81.simulateRandomPlay(node92);
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node96 = monteCarloTreeSearch62.monteCarloTreeSearch(node92);
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node98 = monteCarloTreeSearch0.new Node(node96, false);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertNotNull(node59);
        org.junit.Assert.assertNotNull(node96);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch0 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch1 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch2 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node3 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node5 = monteCarloTreeSearch2.new Node(node3, false);
        monteCarloTreeSearch1.addChildNodes(node5, (-1));
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch8 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch9 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node10 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node12 = monteCarloTreeSearch9.new Node(node10, false);
        monteCarloTreeSearch8.addChildNodes(node12, (-1));
        monteCarloTreeSearch1.addChildNodes(node12, 0);
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node17 = monteCarloTreeSearch0.monteCarloTreeSearch(node12);
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch18 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node19 = monteCarloTreeSearch18.new Node();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch20 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch21 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node22 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node24 = monteCarloTreeSearch21.new Node(node22, false);
        monteCarloTreeSearch20.addChildNodes(node24, (-1));
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch27 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch28 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node29 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node31 = monteCarloTreeSearch28.new Node(node29, false);
        monteCarloTreeSearch27.addChildNodes(node31, (-1));
        monteCarloTreeSearch20.addChildNodes(node31, 0);
        monteCarloTreeSearch18.simulateRandomPlay(node31);
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node37 = monteCarloTreeSearch18.new Node();
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.searches.MonteCarloTreeSearch.Node node38 = monteCarloTreeSearch0.getWinnerNode(node37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Collection.iterator()\" because \"coll\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node17);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test39");
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch0 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch1 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node2 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node4 = monteCarloTreeSearch1.new Node(node2, false);
        monteCarloTreeSearch0.addChildNodes(node4, (-1));
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch7 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch8 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node9 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node11 = monteCarloTreeSearch8.new Node(node9, false);
        monteCarloTreeSearch7.addChildNodes(node11, (-1));
        monteCarloTreeSearch0.addChildNodes(node11, 0);
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch16 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch17 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node18 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node20 = monteCarloTreeSearch17.new Node(node18, false);
        monteCarloTreeSearch16.addChildNodes(node20, (-1));
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch23 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch24 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node25 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node27 = monteCarloTreeSearch24.new Node(node25, false);
        monteCarloTreeSearch23.addChildNodes(node27, (-1));
        monteCarloTreeSearch16.simulateRandomPlay(node27);
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch31 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch32 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch33 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node34 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node36 = monteCarloTreeSearch33.new Node(node34, false);
        monteCarloTreeSearch32.addChildNodes(node36, (-1));
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch39 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch40 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node41 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node43 = monteCarloTreeSearch40.new Node(node41, false);
        monteCarloTreeSearch39.addChildNodes(node43, (-1));
        monteCarloTreeSearch32.addChildNodes(node43, 0);
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node48 = monteCarloTreeSearch31.monteCarloTreeSearch(node43);
        monteCarloTreeSearch16.printScores(node48);
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch50 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch51 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node52 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node54 = monteCarloTreeSearch51.new Node(node52, false);
        monteCarloTreeSearch50.addChildNodes(node54, (-1));
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch57 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch58 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node59 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node61 = monteCarloTreeSearch58.new Node(node59, false);
        monteCarloTreeSearch57.addChildNodes(node61, (-1));
        monteCarloTreeSearch50.addChildNodes(node61, 0);
        monteCarloTreeSearch16.simulateRandomPlay(node61);
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node67 = monteCarloTreeSearch0.getPromisingNode(node61);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNotNull(node67);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test40");
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch0 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch1 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node2 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node4 = monteCarloTreeSearch1.new Node(node2, false);
        monteCarloTreeSearch0.addChildNodes(node4, (-1));
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch7 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch8 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node9 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node11 = monteCarloTreeSearch8.new Node(node9, false);
        monteCarloTreeSearch7.addChildNodes(node11, (-1));
        monteCarloTreeSearch0.simulateRandomPlay(node11);
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch15 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch16 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch17 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node18 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node20 = monteCarloTreeSearch17.new Node(node18, false);
        monteCarloTreeSearch16.addChildNodes(node20, (-1));
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch23 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch24 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node25 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node27 = monteCarloTreeSearch24.new Node(node25, false);
        monteCarloTreeSearch23.addChildNodes(node27, (-1));
        monteCarloTreeSearch16.addChildNodes(node27, 0);
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node32 = monteCarloTreeSearch15.monteCarloTreeSearch(node27);
        monteCarloTreeSearch0.printScores(node32);
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch34 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node35 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node37 = monteCarloTreeSearch34.new Node(node35, false);
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch38 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch39 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node40 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node42 = monteCarloTreeSearch39.new Node(node40, false);
        monteCarloTreeSearch38.addChildNodes(node42, (-1));
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch45 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch46 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node47 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node49 = monteCarloTreeSearch46.new Node(node47, false);
        monteCarloTreeSearch45.addChildNodes(node49, (-1));
        monteCarloTreeSearch38.addChildNodes(node49, 0);
        monteCarloTreeSearch34.simulateRandomPlay(node49);
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch55 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch56 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node57 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node59 = monteCarloTreeSearch56.new Node(node57, false);
        monteCarloTreeSearch55.addChildNodes(node59, (-1));
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch62 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch63 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node64 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node66 = monteCarloTreeSearch63.new Node(node64, false);
        monteCarloTreeSearch62.addChildNodes(node66, (-1));
        monteCarloTreeSearch55.addChildNodes(node66, 0);
        monteCarloTreeSearch34.addChildNodes(node66, (int) (byte) -1);
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch73 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch74 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch75 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node76 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node78 = monteCarloTreeSearch75.new Node(node76, false);
        monteCarloTreeSearch74.addChildNodes(node78, (-1));
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch81 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch82 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node83 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node85 = monteCarloTreeSearch82.new Node(node83, false);
        monteCarloTreeSearch81.addChildNodes(node85, (-1));
        monteCarloTreeSearch74.addChildNodes(node85, 0);
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node90 = monteCarloTreeSearch73.monteCarloTreeSearch(node85);
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node92 = monteCarloTreeSearch34.new Node(node90, false);
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node93 = monteCarloTreeSearch0.monteCarloTreeSearch(node92);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNotNull(node90);
        org.junit.Assert.assertNotNull(node93);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test41");
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch0 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch1 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node2 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node4 = monteCarloTreeSearch1.new Node(node2, false);
        monteCarloTreeSearch0.addChildNodes(node4, (-1));
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch7 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node8 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node10 = monteCarloTreeSearch7.new Node(node8, false);
        monteCarloTreeSearch0.addChildNodes(node10, 1);
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node13 = monteCarloTreeSearch0.new Node();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch14 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch15 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node16 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node18 = monteCarloTreeSearch15.new Node(node16, false);
        monteCarloTreeSearch14.addChildNodes(node18, (-1));
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch21 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch22 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node23 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node25 = monteCarloTreeSearch22.new Node(node23, false);
        monteCarloTreeSearch21.addChildNodes(node25, (-1));
        monteCarloTreeSearch14.simulateRandomPlay(node25);
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node29 = monteCarloTreeSearch0.getPromisingNode(node25);
        java.lang.Class<?> wildcardClass30 = node29.getClass();
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test42");
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch0 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node1 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node3 = monteCarloTreeSearch0.new Node(node1, false);
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch4 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch5 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node6 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node8 = monteCarloTreeSearch5.new Node(node6, false);
        monteCarloTreeSearch4.addChildNodes(node8, (-1));
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch11 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node12 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node14 = monteCarloTreeSearch11.new Node(node12, false);
        monteCarloTreeSearch4.addChildNodes(node14, 1);
        monteCarloTreeSearch0.printScores(node14);
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch18 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node19 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node21 = monteCarloTreeSearch18.new Node(node19, false);
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch22 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch23 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node24 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node26 = monteCarloTreeSearch23.new Node(node24, false);
        monteCarloTreeSearch22.addChildNodes(node26, (-1));
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch29 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node30 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node32 = monteCarloTreeSearch29.new Node(node30, false);
        monteCarloTreeSearch22.addChildNodes(node32, 1);
        monteCarloTreeSearch18.addChildNodes(node32, (-1));
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch37 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch38 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node39 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node41 = monteCarloTreeSearch38.new Node(node39, false);
        monteCarloTreeSearch37.addChildNodes(node41, (-1));
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch44 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch45 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node46 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node48 = monteCarloTreeSearch45.new Node(node46, false);
        monteCarloTreeSearch44.addChildNodes(node48, (-1));
        monteCarloTreeSearch37.simulateRandomPlay(node48);
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node52 = monteCarloTreeSearch18.monteCarloTreeSearch(node48);
        monteCarloTreeSearch0.addChildNodes(node48, (int) '4');
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch55 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch56 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch57 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node58 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node60 = monteCarloTreeSearch57.new Node(node58, false);
        monteCarloTreeSearch56.addChildNodes(node60, (-1));
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch63 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch64 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node65 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node67 = monteCarloTreeSearch64.new Node(node65, false);
        monteCarloTreeSearch63.addChildNodes(node67, (-1));
        monteCarloTreeSearch56.simulateRandomPlay(node67);
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch71 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch72 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch73 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node74 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node76 = monteCarloTreeSearch73.new Node(node74, false);
        monteCarloTreeSearch72.addChildNodes(node76, (-1));
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch79 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch80 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node81 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node83 = monteCarloTreeSearch80.new Node(node81, false);
        monteCarloTreeSearch79.addChildNodes(node83, (-1));
        monteCarloTreeSearch72.addChildNodes(node83, 0);
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node88 = monteCarloTreeSearch71.monteCarloTreeSearch(node83);
        monteCarloTreeSearch56.printScores(node88);
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node90 = monteCarloTreeSearch55.getWinnerNode(node88);
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node91 = monteCarloTreeSearch0.getPromisingNode(node90);
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node92 = monteCarloTreeSearch0.new Node();
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertNotNull(node88);
        org.junit.Assert.assertNotNull(node90);
        org.junit.Assert.assertNotNull(node91);
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test43");
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch0 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch1 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node2 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node4 = monteCarloTreeSearch1.new Node(node2, false);
        monteCarloTreeSearch0.addChildNodes(node4, (-1));
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch7 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch8 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node9 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node11 = monteCarloTreeSearch8.new Node(node9, false);
        monteCarloTreeSearch7.addChildNodes(node11, (-1));
        monteCarloTreeSearch0.simulateRandomPlay(node11);
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch15 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch16 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node17 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node19 = monteCarloTreeSearch16.new Node(node17, false);
        monteCarloTreeSearch15.addChildNodes(node19, (-1));
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch22 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch23 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node24 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node26 = monteCarloTreeSearch23.new Node(node24, false);
        monteCarloTreeSearch22.addChildNodes(node26, (-1));
        monteCarloTreeSearch15.simulateRandomPlay(node26);
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch30 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch31 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch32 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node33 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node35 = monteCarloTreeSearch32.new Node(node33, false);
        monteCarloTreeSearch31.addChildNodes(node35, (-1));
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch38 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch39 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node40 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node42 = monteCarloTreeSearch39.new Node(node40, false);
        monteCarloTreeSearch38.addChildNodes(node42, (-1));
        monteCarloTreeSearch31.addChildNodes(node42, 0);
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node47 = monteCarloTreeSearch30.monteCarloTreeSearch(node42);
        monteCarloTreeSearch15.printScores(node47);
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch49 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch50 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node51 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node53 = monteCarloTreeSearch50.new Node(node51, false);
        monteCarloTreeSearch49.addChildNodes(node53, (-1));
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch56 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch57 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node58 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node60 = monteCarloTreeSearch57.new Node(node58, false);
        monteCarloTreeSearch56.addChildNodes(node60, (-1));
        monteCarloTreeSearch49.addChildNodes(node60, 0);
        monteCarloTreeSearch15.simulateRandomPlay(node60);
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node66 = monteCarloTreeSearch15.new Node();
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.searches.MonteCarloTreeSearch.Node node67 = monteCarloTreeSearch0.monteCarloTreeSearch(node66);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.ArrayList.add(Object)\" because \"node.childNodes\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node47);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test44");
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch0 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch1 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node2 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node4 = monteCarloTreeSearch1.new Node(node2, false);
        monteCarloTreeSearch0.addChildNodes(node4, (-1));
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch7 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node8 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node10 = monteCarloTreeSearch7.new Node(node8, false);
        monteCarloTreeSearch0.addChildNodes(node10, 1);
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node13 = monteCarloTreeSearch0.new Node();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node14 = monteCarloTreeSearch0.new Node();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node15 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.searches.MonteCarloTreeSearch.Node node16 = monteCarloTreeSearch0.monteCarloTreeSearch(node15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test45");
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch0 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node1 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node3 = monteCarloTreeSearch0.new Node(node1, false);
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch4 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch5 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch6 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node7 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node9 = monteCarloTreeSearch6.new Node(node7, false);
        monteCarloTreeSearch5.addChildNodes(node9, (-1));
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch12 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch13 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node14 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node16 = monteCarloTreeSearch13.new Node(node14, false);
        monteCarloTreeSearch12.addChildNodes(node16, (-1));
        monteCarloTreeSearch5.addChildNodes(node16, 0);
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node21 = monteCarloTreeSearch4.monteCarloTreeSearch(node16);
        monteCarloTreeSearch0.simulateRandomPlay(node21);
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch23 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch24 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node25 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node27 = monteCarloTreeSearch24.new Node(node25, false);
        monteCarloTreeSearch23.addChildNodes(node27, (-1));
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch30 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch31 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node32 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node34 = monteCarloTreeSearch31.new Node(node32, false);
        monteCarloTreeSearch30.addChildNodes(node34, (-1));
        monteCarloTreeSearch23.addChildNodes(node34, 0);
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node39 = monteCarloTreeSearch23.new Node();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node40 = monteCarloTreeSearch23.new Node();
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.searches.MonteCarloTreeSearch.Node node41 = monteCarloTreeSearch0.getWinnerNode(node40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Collection.iterator()\" because \"coll\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node21);
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test46");
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch0 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch1 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch2 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node3 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node5 = monteCarloTreeSearch2.new Node(node3, false);
        monteCarloTreeSearch1.addChildNodes(node5, (-1));
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch8 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch9 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node10 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node12 = monteCarloTreeSearch9.new Node(node10, false);
        monteCarloTreeSearch8.addChildNodes(node12, (-1));
        monteCarloTreeSearch1.addChildNodes(node12, 0);
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node17 = monteCarloTreeSearch0.monteCarloTreeSearch(node12);
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch18 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node19 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node21 = monteCarloTreeSearch18.new Node(node19, false);
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch22 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch23 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node24 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node26 = monteCarloTreeSearch23.new Node(node24, false);
        monteCarloTreeSearch22.addChildNodes(node26, (-1));
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch29 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node30 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node32 = monteCarloTreeSearch29.new Node(node30, false);
        monteCarloTreeSearch22.addChildNodes(node32, 1);
        monteCarloTreeSearch18.addChildNodes(node32, (-1));
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch37 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch38 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node39 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node41 = monteCarloTreeSearch38.new Node(node39, false);
        monteCarloTreeSearch37.addChildNodes(node41, (-1));
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch44 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch45 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node46 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node48 = monteCarloTreeSearch45.new Node(node46, false);
        monteCarloTreeSearch44.addChildNodes(node48, (-1));
        monteCarloTreeSearch37.simulateRandomPlay(node48);
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch52 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch53 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch54 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node55 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node57 = monteCarloTreeSearch54.new Node(node55, false);
        monteCarloTreeSearch53.addChildNodes(node57, (-1));
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch60 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch61 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node62 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node64 = monteCarloTreeSearch61.new Node(node62, false);
        monteCarloTreeSearch60.addChildNodes(node64, (-1));
        monteCarloTreeSearch53.addChildNodes(node64, 0);
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node69 = monteCarloTreeSearch52.monteCarloTreeSearch(node64);
        monteCarloTreeSearch37.printScores(node69);
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node72 = monteCarloTreeSearch18.new Node(node69, false);
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node73 = monteCarloTreeSearch0.getPromisingNode(node72);
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch74 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch75 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node76 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node78 = monteCarloTreeSearch75.new Node(node76, false);
        monteCarloTreeSearch74.addChildNodes(node78, (-1));
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch81 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node82 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node84 = monteCarloTreeSearch81.new Node(node82, false);
        monteCarloTreeSearch74.addChildNodes(node84, 1);
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node87 = monteCarloTreeSearch74.new Node();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node88 = monteCarloTreeSearch74.new Node();
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.searches.MonteCarloTreeSearch.Node node89 = monteCarloTreeSearch0.monteCarloTreeSearch(node88);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.ArrayList.add(Object)\" because \"node.childNodes\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node69);
        org.junit.Assert.assertNotNull(node73);
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test47");
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch0 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node1 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node3 = monteCarloTreeSearch0.new Node(node1, false);
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch4 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch5 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node6 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node8 = monteCarloTreeSearch5.new Node(node6, false);
        monteCarloTreeSearch4.addChildNodes(node8, (-1));
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch11 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node12 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node14 = monteCarloTreeSearch11.new Node(node12, false);
        monteCarloTreeSearch4.addChildNodes(node14, 1);
        monteCarloTreeSearch0.addChildNodes(node14, (-1));
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch19 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch20 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node21 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node23 = monteCarloTreeSearch20.new Node(node21, false);
        monteCarloTreeSearch19.addChildNodes(node23, (-1));
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch26 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch27 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node28 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node30 = monteCarloTreeSearch27.new Node(node28, false);
        monteCarloTreeSearch26.addChildNodes(node30, (-1));
        monteCarloTreeSearch19.simulateRandomPlay(node30);
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node34 = monteCarloTreeSearch0.monteCarloTreeSearch(node30);
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch35 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch36 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node37 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node39 = monteCarloTreeSearch36.new Node(node37, false);
        monteCarloTreeSearch35.addChildNodes(node39, (-1));
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch42 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch43 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node44 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node46 = monteCarloTreeSearch43.new Node(node44, false);
        monteCarloTreeSearch42.addChildNodes(node46, (-1));
        monteCarloTreeSearch35.simulateRandomPlay(node46);
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch50 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch51 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch52 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node53 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node55 = monteCarloTreeSearch52.new Node(node53, false);
        monteCarloTreeSearch51.addChildNodes(node55, (-1));
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch58 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch59 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node60 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node62 = monteCarloTreeSearch59.new Node(node60, false);
        monteCarloTreeSearch58.addChildNodes(node62, (-1));
        monteCarloTreeSearch51.addChildNodes(node62, 0);
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node67 = monteCarloTreeSearch50.monteCarloTreeSearch(node62);
        monteCarloTreeSearch35.printScores(node67);
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch69 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch70 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node71 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node73 = monteCarloTreeSearch70.new Node(node71, false);
        monteCarloTreeSearch69.addChildNodes(node73, (-1));
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch76 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch77 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node78 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node80 = monteCarloTreeSearch77.new Node(node78, false);
        monteCarloTreeSearch76.addChildNodes(node80, (-1));
        monteCarloTreeSearch69.addChildNodes(node80, 0);
        monteCarloTreeSearch35.simulateRandomPlay(node80);
        monteCarloTreeSearch0.simulateRandomPlay(node80);
        java.lang.Class<?> wildcardClass87 = node80.getClass();
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNotNull(node67);
        org.junit.Assert.assertNotNull(wildcardClass87);
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test48");
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch0 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch1 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch2 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node3 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node5 = monteCarloTreeSearch2.new Node(node3, false);
        monteCarloTreeSearch1.addChildNodes(node5, (-1));
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch8 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch9 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node10 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node12 = monteCarloTreeSearch9.new Node(node10, false);
        monteCarloTreeSearch8.addChildNodes(node12, (-1));
        monteCarloTreeSearch1.simulateRandomPlay(node12);
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch16 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch17 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch18 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node19 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node21 = monteCarloTreeSearch18.new Node(node19, false);
        monteCarloTreeSearch17.addChildNodes(node21, (-1));
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch24 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch25 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node26 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node28 = monteCarloTreeSearch25.new Node(node26, false);
        monteCarloTreeSearch24.addChildNodes(node28, (-1));
        monteCarloTreeSearch17.addChildNodes(node28, 0);
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node33 = monteCarloTreeSearch16.monteCarloTreeSearch(node28);
        monteCarloTreeSearch1.printScores(node33);
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node35 = monteCarloTreeSearch0.getWinnerNode(node33);
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch36 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch37 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node38 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node40 = monteCarloTreeSearch37.new Node(node38, false);
        monteCarloTreeSearch36.addChildNodes(node40, (-1));
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch43 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch44 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node45 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node47 = monteCarloTreeSearch44.new Node(node45, false);
        monteCarloTreeSearch43.addChildNodes(node47, (-1));
        monteCarloTreeSearch36.addChildNodes(node47, 0);
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node52 = monteCarloTreeSearch36.new Node();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node53 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node55 = monteCarloTreeSearch36.new Node(node53, true);
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node56 = monteCarloTreeSearch36.new Node();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node58 = monteCarloTreeSearch0.new Node(node56, false);
        java.lang.Class<?> wildcardClass59 = node56.getClass();
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNotNull(wildcardClass59);
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test49");
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch0 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node1 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node3 = monteCarloTreeSearch0.new Node(node1, false);
        java.lang.Class<?> wildcardClass4 = monteCarloTreeSearch0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test50");
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch0 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch1 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch2 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node3 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node5 = monteCarloTreeSearch2.new Node(node3, false);
        monteCarloTreeSearch1.addChildNodes(node5, (-1));
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch8 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch9 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node10 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node12 = monteCarloTreeSearch9.new Node(node10, false);
        monteCarloTreeSearch8.addChildNodes(node12, (-1));
        monteCarloTreeSearch1.addChildNodes(node12, 0);
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node17 = monteCarloTreeSearch0.monteCarloTreeSearch(node12);
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch18 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node19 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node21 = monteCarloTreeSearch18.new Node(node19, false);
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch22 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch23 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node24 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node26 = monteCarloTreeSearch23.new Node(node24, false);
        monteCarloTreeSearch22.addChildNodes(node26, (-1));
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch29 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node30 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node32 = monteCarloTreeSearch29.new Node(node30, false);
        monteCarloTreeSearch22.addChildNodes(node32, 1);
        monteCarloTreeSearch18.addChildNodes(node32, (-1));
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch37 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch38 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node39 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node41 = monteCarloTreeSearch38.new Node(node39, false);
        monteCarloTreeSearch37.addChildNodes(node41, (-1));
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch44 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch45 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node46 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node48 = monteCarloTreeSearch45.new Node(node46, false);
        monteCarloTreeSearch44.addChildNodes(node48, (-1));
        monteCarloTreeSearch37.simulateRandomPlay(node48);
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch52 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch53 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch54 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node55 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node57 = monteCarloTreeSearch54.new Node(node55, false);
        monteCarloTreeSearch53.addChildNodes(node57, (-1));
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch60 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch61 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node62 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node64 = monteCarloTreeSearch61.new Node(node62, false);
        monteCarloTreeSearch60.addChildNodes(node64, (-1));
        monteCarloTreeSearch53.addChildNodes(node64, 0);
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node69 = monteCarloTreeSearch52.monteCarloTreeSearch(node64);
        monteCarloTreeSearch37.printScores(node69);
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node72 = monteCarloTreeSearch18.new Node(node69, false);
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node73 = monteCarloTreeSearch0.getPromisingNode(node72);
        java.lang.Class<?> wildcardClass74 = node73.getClass();
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node69);
        org.junit.Assert.assertNotNull(node73);
        org.junit.Assert.assertNotNull(wildcardClass74);
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test51");
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch0 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch1 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node2 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node4 = monteCarloTreeSearch1.new Node(node2, false);
        monteCarloTreeSearch0.addChildNodes(node4, (-1));
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch7 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node8 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node10 = monteCarloTreeSearch7.new Node(node8, false);
        monteCarloTreeSearch0.addChildNodes(node10, 1);
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node13 = monteCarloTreeSearch0.new Node();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch14 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch15 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node16 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node18 = monteCarloTreeSearch15.new Node(node16, false);
        monteCarloTreeSearch14.addChildNodes(node18, (-1));
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch21 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch22 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node23 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node25 = monteCarloTreeSearch22.new Node(node23, false);
        monteCarloTreeSearch21.addChildNodes(node25, (-1));
        monteCarloTreeSearch14.simulateRandomPlay(node25);
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node29 = monteCarloTreeSearch0.getPromisingNode(node25);
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch30 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch31 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node32 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node34 = monteCarloTreeSearch31.new Node(node32, false);
        monteCarloTreeSearch30.addChildNodes(node34, (-1));
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node37 = monteCarloTreeSearch30.new Node();
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.searches.MonteCarloTreeSearch.Node node38 = monteCarloTreeSearch0.getWinnerNode(node37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Collection.iterator()\" because \"coll\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node29);
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test52");
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch0 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch1 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node2 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node4 = monteCarloTreeSearch1.new Node(node2, false);
        monteCarloTreeSearch0.addChildNodes(node4, (-1));
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch7 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch8 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node9 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node11 = monteCarloTreeSearch8.new Node(node9, false);
        monteCarloTreeSearch7.addChildNodes(node11, (-1));
        monteCarloTreeSearch0.simulateRandomPlay(node11);
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch15 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch16 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch17 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node18 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node20 = monteCarloTreeSearch17.new Node(node18, false);
        monteCarloTreeSearch16.addChildNodes(node20, (-1));
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch23 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch24 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node25 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node27 = monteCarloTreeSearch24.new Node(node25, false);
        monteCarloTreeSearch23.addChildNodes(node27, (-1));
        monteCarloTreeSearch16.addChildNodes(node27, 0);
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node32 = monteCarloTreeSearch15.monteCarloTreeSearch(node27);
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch33 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node34 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node36 = monteCarloTreeSearch33.new Node(node34, false);
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch37 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch38 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node39 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node41 = monteCarloTreeSearch38.new Node(node39, false);
        monteCarloTreeSearch37.addChildNodes(node41, (-1));
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch44 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node45 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node47 = monteCarloTreeSearch44.new Node(node45, false);
        monteCarloTreeSearch37.addChildNodes(node47, 1);
        monteCarloTreeSearch33.addChildNodes(node47, (-1));
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch52 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch53 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node54 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node56 = monteCarloTreeSearch53.new Node(node54, false);
        monteCarloTreeSearch52.addChildNodes(node56, (-1));
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch59 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch60 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node61 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node63 = monteCarloTreeSearch60.new Node(node61, false);
        monteCarloTreeSearch59.addChildNodes(node63, (-1));
        monteCarloTreeSearch52.simulateRandomPlay(node63);
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch67 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch68 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch69 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node70 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node72 = monteCarloTreeSearch69.new Node(node70, false);
        monteCarloTreeSearch68.addChildNodes(node72, (-1));
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch75 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch76 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node77 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node79 = monteCarloTreeSearch76.new Node(node77, false);
        monteCarloTreeSearch75.addChildNodes(node79, (-1));
        monteCarloTreeSearch68.addChildNodes(node79, 0);
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node84 = monteCarloTreeSearch67.monteCarloTreeSearch(node79);
        monteCarloTreeSearch52.printScores(node84);
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node87 = monteCarloTreeSearch33.new Node(node84, false);
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node88 = monteCarloTreeSearch15.getPromisingNode(node87);
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node90 = monteCarloTreeSearch0.new Node(node87, false);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNotNull(node84);
        org.junit.Assert.assertNotNull(node88);
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test53");
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch0 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch1 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node2 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node4 = monteCarloTreeSearch1.new Node(node2, false);
        monteCarloTreeSearch0.addChildNodes(node4, (-1));
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch7 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch8 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node9 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node11 = monteCarloTreeSearch8.new Node(node9, false);
        monteCarloTreeSearch7.addChildNodes(node11, (-1));
        monteCarloTreeSearch0.addChildNodes(node11, 0);
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node16 = monteCarloTreeSearch0.new Node();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch17 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node18 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node20 = monteCarloTreeSearch17.new Node(node18, false);
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch21 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node22 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node24 = monteCarloTreeSearch21.new Node(node22, false);
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch25 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch26 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node27 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node29 = monteCarloTreeSearch26.new Node(node27, false);
        monteCarloTreeSearch25.addChildNodes(node29, (-1));
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch32 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node33 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node35 = monteCarloTreeSearch32.new Node(node33, false);
        monteCarloTreeSearch25.addChildNodes(node35, 1);
        monteCarloTreeSearch21.printScores(node35);
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node39 = monteCarloTreeSearch17.getWinnerNode(node35);
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch40 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch41 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node42 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node44 = monteCarloTreeSearch41.new Node(node42, false);
        monteCarloTreeSearch40.addChildNodes(node44, (-1));
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch47 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch48 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node49 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node51 = monteCarloTreeSearch48.new Node(node49, false);
        monteCarloTreeSearch47.addChildNodes(node51, (-1));
        monteCarloTreeSearch40.addChildNodes(node51, 0);
        monteCarloTreeSearch17.addChildNodes(node51, (int) (byte) 0);
        monteCarloTreeSearch0.printScores(node51);
        org.junit.Assert.assertNotNull(node39);
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test54");
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch0 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch1 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node2 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node4 = monteCarloTreeSearch1.new Node(node2, false);
        monteCarloTreeSearch0.addChildNodes(node4, (-1));
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch7 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node8 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node10 = monteCarloTreeSearch7.new Node(node8, false);
        monteCarloTreeSearch0.addChildNodes(node10, 1);
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node13 = monteCarloTreeSearch0.new Node();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch14 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch15 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch16 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node17 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node19 = monteCarloTreeSearch16.new Node(node17, false);
        monteCarloTreeSearch15.addChildNodes(node19, (-1));
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch22 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch23 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node24 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node26 = monteCarloTreeSearch23.new Node(node24, false);
        monteCarloTreeSearch22.addChildNodes(node26, (-1));
        monteCarloTreeSearch15.simulateRandomPlay(node26);
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch30 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch31 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch32 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node33 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node35 = monteCarloTreeSearch32.new Node(node33, false);
        monteCarloTreeSearch31.addChildNodes(node35, (-1));
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch38 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch39 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node40 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node42 = monteCarloTreeSearch39.new Node(node40, false);
        monteCarloTreeSearch38.addChildNodes(node42, (-1));
        monteCarloTreeSearch31.addChildNodes(node42, 0);
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node47 = monteCarloTreeSearch30.monteCarloTreeSearch(node42);
        monteCarloTreeSearch15.printScores(node47);
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node49 = monteCarloTreeSearch14.getWinnerNode(node47);
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node51 = monteCarloTreeSearch0.new Node(node49, false);
        java.lang.Class<?> wildcardClass52 = node49.getClass();
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertNotNull(wildcardClass52);
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test55");
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch0 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node1 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node3 = monteCarloTreeSearch0.new Node(node1, false);
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch4 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch5 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node6 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node8 = monteCarloTreeSearch5.new Node(node6, false);
        monteCarloTreeSearch4.addChildNodes(node8, (-1));
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch11 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node12 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node14 = monteCarloTreeSearch11.new Node(node12, false);
        monteCarloTreeSearch4.addChildNodes(node14, 1);
        monteCarloTreeSearch0.printScores(node14);
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch18 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node19 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node21 = monteCarloTreeSearch18.new Node(node19, false);
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch22 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch23 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node24 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node26 = monteCarloTreeSearch23.new Node(node24, false);
        monteCarloTreeSearch22.addChildNodes(node26, (-1));
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch29 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node30 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node32 = monteCarloTreeSearch29.new Node(node30, false);
        monteCarloTreeSearch22.addChildNodes(node32, 1);
        monteCarloTreeSearch18.addChildNodes(node32, (-1));
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch37 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch38 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node39 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node41 = monteCarloTreeSearch38.new Node(node39, false);
        monteCarloTreeSearch37.addChildNodes(node41, (-1));
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch44 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch45 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node46 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node48 = monteCarloTreeSearch45.new Node(node46, false);
        monteCarloTreeSearch44.addChildNodes(node48, (-1));
        monteCarloTreeSearch37.simulateRandomPlay(node48);
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node52 = monteCarloTreeSearch18.monteCarloTreeSearch(node48);
        monteCarloTreeSearch0.addChildNodes(node48, (int) '4');
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch55 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch56 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch57 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node58 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node60 = monteCarloTreeSearch57.new Node(node58, false);
        monteCarloTreeSearch56.addChildNodes(node60, (-1));
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch63 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch64 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node65 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node67 = monteCarloTreeSearch64.new Node(node65, false);
        monteCarloTreeSearch63.addChildNodes(node67, (-1));
        monteCarloTreeSearch56.simulateRandomPlay(node67);
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch71 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch72 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch73 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node74 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node76 = monteCarloTreeSearch73.new Node(node74, false);
        monteCarloTreeSearch72.addChildNodes(node76, (-1));
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch79 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch80 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node81 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node83 = monteCarloTreeSearch80.new Node(node81, false);
        monteCarloTreeSearch79.addChildNodes(node83, (-1));
        monteCarloTreeSearch72.addChildNodes(node83, 0);
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node88 = monteCarloTreeSearch71.monteCarloTreeSearch(node83);
        monteCarloTreeSearch56.printScores(node88);
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node90 = monteCarloTreeSearch55.getWinnerNode(node88);
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node91 = monteCarloTreeSearch0.getPromisingNode(node90);
        java.lang.Class<?> wildcardClass92 = node90.getClass();
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertNotNull(node88);
        org.junit.Assert.assertNotNull(node90);
        org.junit.Assert.assertNotNull(node91);
        org.junit.Assert.assertNotNull(wildcardClass92);
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test56");
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch0 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node1 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node3 = monteCarloTreeSearch0.new Node(node1, false);
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch4 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch5 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node6 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node8 = monteCarloTreeSearch5.new Node(node6, false);
        monteCarloTreeSearch4.addChildNodes(node8, (-1));
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch11 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch12 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node13 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node15 = monteCarloTreeSearch12.new Node(node13, false);
        monteCarloTreeSearch11.addChildNodes(node15, (-1));
        monteCarloTreeSearch4.addChildNodes(node15, 0);
        monteCarloTreeSearch0.simulateRandomPlay(node15);
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch21 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch22 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node23 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node25 = monteCarloTreeSearch22.new Node(node23, false);
        monteCarloTreeSearch21.addChildNodes(node25, (-1));
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch28 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch29 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node30 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node32 = monteCarloTreeSearch29.new Node(node30, false);
        monteCarloTreeSearch28.addChildNodes(node32, (-1));
        monteCarloTreeSearch21.addChildNodes(node32, 0);
        monteCarloTreeSearch0.addChildNodes(node32, (int) (byte) -1);
        java.lang.Class<?> wildcardClass39 = monteCarloTreeSearch0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test57");
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch0 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch1 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node2 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node4 = monteCarloTreeSearch1.new Node(node2, false);
        monteCarloTreeSearch0.addChildNodes(node4, (-1));
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch7 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node8 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node10 = monteCarloTreeSearch7.new Node(node8, false);
        monteCarloTreeSearch0.addChildNodes(node10, 1);
        java.lang.Class<?> wildcardClass13 = node10.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test58");
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch0 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch1 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node2 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node4 = monteCarloTreeSearch1.new Node(node2, false);
        monteCarloTreeSearch0.addChildNodes(node4, (-1));
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch7 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch8 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node9 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node11 = monteCarloTreeSearch8.new Node(node9, false);
        monteCarloTreeSearch7.addChildNodes(node11, (-1));
        monteCarloTreeSearch0.addChildNodes(node11, 0);
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node16 = monteCarloTreeSearch0.new Node();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch17 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch18 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node19 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node21 = monteCarloTreeSearch18.new Node(node19, false);
        monteCarloTreeSearch17.addChildNodes(node21, (-1));
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch24 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node25 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node27 = monteCarloTreeSearch24.new Node(node25, false);
        monteCarloTreeSearch17.addChildNodes(node27, 1);
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node30 = monteCarloTreeSearch17.new Node();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node31 = monteCarloTreeSearch17.new Node();
        // The following exception was thrown during execution in test generation
        try {
            monteCarloTreeSearch0.printScores(node31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.ArrayList.size()\" because \"rootNode.childNodes\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test59() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test59");
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch0 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch1 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node2 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node4 = monteCarloTreeSearch1.new Node(node2, false);
        monteCarloTreeSearch0.addChildNodes(node4, (-1));
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch7 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node8 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node10 = monteCarloTreeSearch7.new Node(node8, false);
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch11 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch12 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node13 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node15 = monteCarloTreeSearch12.new Node(node13, false);
        monteCarloTreeSearch11.addChildNodes(node15, (-1));
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch18 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch19 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node20 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node22 = monteCarloTreeSearch19.new Node(node20, false);
        monteCarloTreeSearch18.addChildNodes(node22, (-1));
        monteCarloTreeSearch11.addChildNodes(node22, 0);
        monteCarloTreeSearch7.simulateRandomPlay(node22);
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch28 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch29 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node30 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node32 = monteCarloTreeSearch29.new Node(node30, false);
        monteCarloTreeSearch28.addChildNodes(node32, (-1));
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch35 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch36 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node37 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node39 = monteCarloTreeSearch36.new Node(node37, false);
        monteCarloTreeSearch35.addChildNodes(node39, (-1));
        monteCarloTreeSearch28.addChildNodes(node39, 0);
        monteCarloTreeSearch7.addChildNodes(node39, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.searches.MonteCarloTreeSearch.Node node46 = monteCarloTreeSearch0.getWinnerNode(node39);
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
    }

    @Test
    public void test60() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test60");
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch0 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node1 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node3 = monteCarloTreeSearch0.new Node(node1, false);
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch4 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node5 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node7 = monteCarloTreeSearch4.new Node(node5, false);
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch8 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch9 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node10 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node12 = monteCarloTreeSearch9.new Node(node10, false);
        monteCarloTreeSearch8.addChildNodes(node12, (-1));
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch15 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node16 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node18 = monteCarloTreeSearch15.new Node(node16, false);
        monteCarloTreeSearch8.addChildNodes(node18, 1);
        monteCarloTreeSearch4.addChildNodes(node18, (-1));
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch23 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch24 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node25 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node27 = monteCarloTreeSearch24.new Node(node25, false);
        monteCarloTreeSearch23.addChildNodes(node27, (-1));
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch30 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch31 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node32 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node34 = monteCarloTreeSearch31.new Node(node32, false);
        monteCarloTreeSearch30.addChildNodes(node34, (-1));
        monteCarloTreeSearch23.simulateRandomPlay(node34);
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch38 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch39 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch40 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node41 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node43 = monteCarloTreeSearch40.new Node(node41, false);
        monteCarloTreeSearch39.addChildNodes(node43, (-1));
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch46 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch47 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node48 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node50 = monteCarloTreeSearch47.new Node(node48, false);
        monteCarloTreeSearch46.addChildNodes(node50, (-1));
        monteCarloTreeSearch39.addChildNodes(node50, 0);
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node55 = monteCarloTreeSearch38.monteCarloTreeSearch(node50);
        monteCarloTreeSearch23.printScores(node55);
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node58 = monteCarloTreeSearch4.new Node(node55, false);
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node59 = monteCarloTreeSearch0.getWinnerNode(node55);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertNotNull(node59);
    }

    @Test
    public void test61() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test61");
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch0 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node1 = monteCarloTreeSearch0.new Node();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch2 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch3 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node4 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node6 = monteCarloTreeSearch3.new Node(node4, false);
        monteCarloTreeSearch2.addChildNodes(node6, (-1));
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch9 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch10 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node11 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node13 = monteCarloTreeSearch10.new Node(node11, false);
        monteCarloTreeSearch9.addChildNodes(node13, (-1));
        monteCarloTreeSearch2.addChildNodes(node13, 0);
        monteCarloTreeSearch0.simulateRandomPlay(node13);
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node19 = monteCarloTreeSearch0.new Node();
        java.lang.Class<?> wildcardClass20 = monteCarloTreeSearch0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test62() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test62");
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch0 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node1 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node3 = monteCarloTreeSearch0.new Node(node1, false);
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch4 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node5 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node7 = monteCarloTreeSearch4.new Node(node5, false);
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch8 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch9 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node10 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node12 = monteCarloTreeSearch9.new Node(node10, false);
        monteCarloTreeSearch8.addChildNodes(node12, (-1));
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch15 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node16 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node18 = monteCarloTreeSearch15.new Node(node16, false);
        monteCarloTreeSearch8.addChildNodes(node18, 1);
        monteCarloTreeSearch4.printScores(node18);
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node22 = monteCarloTreeSearch0.getWinnerNode(node18);
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch23 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch24 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node25 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node27 = monteCarloTreeSearch24.new Node(node25, false);
        monteCarloTreeSearch23.addChildNodes(node27, (-1));
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch30 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch31 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node32 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node34 = monteCarloTreeSearch31.new Node(node32, false);
        monteCarloTreeSearch30.addChildNodes(node34, (-1));
        monteCarloTreeSearch23.simulateRandomPlay(node34);
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch38 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch39 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch40 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node41 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node43 = monteCarloTreeSearch40.new Node(node41, false);
        monteCarloTreeSearch39.addChildNodes(node43, (-1));
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch46 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch47 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node48 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node50 = monteCarloTreeSearch47.new Node(node48, false);
        monteCarloTreeSearch46.addChildNodes(node50, (-1));
        monteCarloTreeSearch39.simulateRandomPlay(node50);
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch54 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch55 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch56 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node57 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node59 = monteCarloTreeSearch56.new Node(node57, false);
        monteCarloTreeSearch55.addChildNodes(node59, (-1));
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch62 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch63 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node64 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node66 = monteCarloTreeSearch63.new Node(node64, false);
        monteCarloTreeSearch62.addChildNodes(node66, (-1));
        monteCarloTreeSearch55.addChildNodes(node66, 0);
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node71 = monteCarloTreeSearch54.monteCarloTreeSearch(node66);
        monteCarloTreeSearch39.printScores(node71);
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node73 = monteCarloTreeSearch38.getWinnerNode(node71);
        monteCarloTreeSearch23.printScores(node73);
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch75 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node76 = monteCarloTreeSearch75.new Node();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch77 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch78 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node79 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node81 = monteCarloTreeSearch78.new Node(node79, false);
        monteCarloTreeSearch77.addChildNodes(node81, (-1));
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch84 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch85 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node86 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node88 = monteCarloTreeSearch85.new Node(node86, false);
        monteCarloTreeSearch84.addChildNodes(node88, (-1));
        monteCarloTreeSearch77.addChildNodes(node88, 0);
        monteCarloTreeSearch75.simulateRandomPlay(node88);
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node94 = monteCarloTreeSearch23.getPromisingNode(node88);
        monteCarloTreeSearch0.printScores(node94);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(node71);
        org.junit.Assert.assertNotNull(node73);
        org.junit.Assert.assertNotNull(node94);
    }

    @Test
    public void test63() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test63");
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch0 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node1 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node3 = monteCarloTreeSearch0.new Node(node1, false);
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch4 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch5 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node6 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node8 = monteCarloTreeSearch5.new Node(node6, false);
        monteCarloTreeSearch4.addChildNodes(node8, (-1));
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch11 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node12 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node14 = monteCarloTreeSearch11.new Node(node12, false);
        monteCarloTreeSearch4.addChildNodes(node14, 1);
        monteCarloTreeSearch0.addChildNodes(node14, (-1));
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch19 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch20 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node21 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node23 = monteCarloTreeSearch20.new Node(node21, false);
        monteCarloTreeSearch19.addChildNodes(node23, (-1));
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch26 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch27 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node28 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node30 = monteCarloTreeSearch27.new Node(node28, false);
        monteCarloTreeSearch26.addChildNodes(node30, (-1));
        monteCarloTreeSearch19.simulateRandomPlay(node30);
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node34 = monteCarloTreeSearch0.monteCarloTreeSearch(node30);
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch35 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node36 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node38 = monteCarloTreeSearch35.new Node(node36, false);
        monteCarloTreeSearch0.addChildNodes(node38, (int) ' ');
        org.junit.Assert.assertNotNull(node34);
    }

    @Test
    public void test64() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test64");
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch0 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node1 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node3 = monteCarloTreeSearch0.new Node(node1, false);
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch4 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch5 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node6 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node8 = monteCarloTreeSearch5.new Node(node6, false);
        monteCarloTreeSearch4.addChildNodes(node8, (-1));
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch11 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node12 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node14 = monteCarloTreeSearch11.new Node(node12, false);
        monteCarloTreeSearch4.addChildNodes(node14, 1);
        monteCarloTreeSearch0.addChildNodes(node14, (-1));
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch19 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node20 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node22 = monteCarloTreeSearch19.new Node(node20, false);
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch23 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node24 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node26 = monteCarloTreeSearch23.new Node(node24, false);
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch27 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch28 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node29 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node31 = monteCarloTreeSearch28.new Node(node29, false);
        monteCarloTreeSearch27.addChildNodes(node31, (-1));
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch34 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node35 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node37 = monteCarloTreeSearch34.new Node(node35, false);
        monteCarloTreeSearch27.addChildNodes(node37, 1);
        monteCarloTreeSearch23.printScores(node37);
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node41 = monteCarloTreeSearch19.getWinnerNode(node37);
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node42 = monteCarloTreeSearch19.new Node();
        monteCarloTreeSearch0.simulateRandomPlay(node42);
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node44 = monteCarloTreeSearch0.new Node();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch45 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node46 = monteCarloTreeSearch45.new Node();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch47 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch48 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node49 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node51 = monteCarloTreeSearch48.new Node(node49, false);
        monteCarloTreeSearch47.addChildNodes(node51, (-1));
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch54 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch55 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node56 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node58 = monteCarloTreeSearch55.new Node(node56, false);
        monteCarloTreeSearch54.addChildNodes(node58, (-1));
        monteCarloTreeSearch47.addChildNodes(node58, 0);
        monteCarloTreeSearch45.simulateRandomPlay(node58);
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch64 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch65 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node66 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node68 = monteCarloTreeSearch65.new Node(node66, false);
        monteCarloTreeSearch64.addChildNodes(node68, (-1));
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch71 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node72 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node74 = monteCarloTreeSearch71.new Node(node72, false);
        monteCarloTreeSearch64.addChildNodes(node74, 1);
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node77 = monteCarloTreeSearch64.new Node();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node78 = monteCarloTreeSearch64.new Node();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node80 = monteCarloTreeSearch45.new Node(node78, false);
        monteCarloTreeSearch0.addChildNodes(node80, (int) (byte) 100);
        org.junit.Assert.assertNotNull(node41);
    }

    @Test
    public void test65() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test65");
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch0 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node1 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node3 = monteCarloTreeSearch0.new Node(node1, false);
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.searches.MonteCarloTreeSearch.Node node5 = monteCarloTreeSearch0.getWinnerNode(node4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"childNodes\" because \"rootNode\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test66() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test66");
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch0 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node1 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node3 = monteCarloTreeSearch0.new Node(node1, false);
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch4 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch5 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node6 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node8 = monteCarloTreeSearch5.new Node(node6, false);
        monteCarloTreeSearch4.addChildNodes(node8, (-1));
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch11 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node12 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node14 = monteCarloTreeSearch11.new Node(node12, false);
        monteCarloTreeSearch4.addChildNodes(node14, 1);
        monteCarloTreeSearch0.printScores(node14);
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch18 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch19 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch20 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node21 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node23 = monteCarloTreeSearch20.new Node(node21, false);
        monteCarloTreeSearch19.addChildNodes(node23, (-1));
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch26 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch27 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node28 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node30 = monteCarloTreeSearch27.new Node(node28, false);
        monteCarloTreeSearch26.addChildNodes(node30, (-1));
        monteCarloTreeSearch19.simulateRandomPlay(node30);
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch34 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch35 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch36 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node37 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node39 = monteCarloTreeSearch36.new Node(node37, false);
        monteCarloTreeSearch35.addChildNodes(node39, (-1));
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch42 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch43 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node44 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node46 = monteCarloTreeSearch43.new Node(node44, false);
        monteCarloTreeSearch42.addChildNodes(node46, (-1));
        monteCarloTreeSearch35.addChildNodes(node46, 0);
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node51 = monteCarloTreeSearch34.monteCarloTreeSearch(node46);
        monteCarloTreeSearch19.printScores(node51);
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node53 = monteCarloTreeSearch18.getWinnerNode(node51);
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch54 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch55 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node56 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node58 = monteCarloTreeSearch55.new Node(node56, false);
        monteCarloTreeSearch54.addChildNodes(node58, (-1));
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch61 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch62 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node63 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node65 = monteCarloTreeSearch62.new Node(node63, false);
        monteCarloTreeSearch61.addChildNodes(node65, (-1));
        monteCarloTreeSearch54.addChildNodes(node65, 0);
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node70 = monteCarloTreeSearch54.new Node();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node71 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node73 = monteCarloTreeSearch54.new Node(node71, true);
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node74 = monteCarloTreeSearch54.new Node();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node76 = monteCarloTreeSearch18.new Node(node74, false);
        // The following exception was thrown during execution in test generation
        try {
            monteCarloTreeSearch0.printScores(node74);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.ArrayList.size()\" because \"rootNode.childNodes\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertNotNull(node53);
    }

    @Test
    public void test67() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test67");
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch0 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch1 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node2 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node4 = monteCarloTreeSearch1.new Node(node2, false);
        monteCarloTreeSearch0.addChildNodes(node4, (-1));
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch7 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node8 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node10 = monteCarloTreeSearch7.new Node(node8, false);
        monteCarloTreeSearch0.addChildNodes(node10, 1);
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node13 = monteCarloTreeSearch0.new Node();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch14 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch15 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch16 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node17 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node19 = monteCarloTreeSearch16.new Node(node17, false);
        monteCarloTreeSearch15.addChildNodes(node19, (-1));
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch22 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch23 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node24 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node26 = monteCarloTreeSearch23.new Node(node24, false);
        monteCarloTreeSearch22.addChildNodes(node26, (-1));
        monteCarloTreeSearch15.simulateRandomPlay(node26);
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch30 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch31 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch32 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node33 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node35 = monteCarloTreeSearch32.new Node(node33, false);
        monteCarloTreeSearch31.addChildNodes(node35, (-1));
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch38 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch39 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node40 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node42 = monteCarloTreeSearch39.new Node(node40, false);
        monteCarloTreeSearch38.addChildNodes(node42, (-1));
        monteCarloTreeSearch31.addChildNodes(node42, 0);
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node47 = monteCarloTreeSearch30.monteCarloTreeSearch(node42);
        monteCarloTreeSearch15.printScores(node47);
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node49 = monteCarloTreeSearch14.getWinnerNode(node47);
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node51 = monteCarloTreeSearch0.new Node(node49, false);
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node52 = monteCarloTreeSearch0.new Node();
        java.lang.Class<?> wildcardClass53 = node52.getClass();
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertNotNull(wildcardClass53);
    }

    @Test
    public void test68() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test68");
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch0 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node1 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node3 = monteCarloTreeSearch0.new Node(node1, false);
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch4 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch5 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node6 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node8 = monteCarloTreeSearch5.new Node(node6, false);
        monteCarloTreeSearch4.addChildNodes(node8, (-1));
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch11 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node12 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node14 = monteCarloTreeSearch11.new Node(node12, false);
        monteCarloTreeSearch4.addChildNodes(node14, 1);
        monteCarloTreeSearch0.addChildNodes(node14, (-1));
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch19 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node20 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node22 = monteCarloTreeSearch19.new Node(node20, false);
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch23 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node24 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node26 = monteCarloTreeSearch23.new Node(node24, false);
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch27 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch28 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node29 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node31 = monteCarloTreeSearch28.new Node(node29, false);
        monteCarloTreeSearch27.addChildNodes(node31, (-1));
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch34 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node35 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node37 = monteCarloTreeSearch34.new Node(node35, false);
        monteCarloTreeSearch27.addChildNodes(node37, 1);
        monteCarloTreeSearch23.printScores(node37);
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node41 = monteCarloTreeSearch19.getWinnerNode(node37);
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node42 = monteCarloTreeSearch19.new Node();
        monteCarloTreeSearch0.simulateRandomPlay(node42);
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node44 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.searches.MonteCarloTreeSearch.Node node45 = monteCarloTreeSearch0.monteCarloTreeSearch(node44);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node41);
    }

    @Test
    public void test69() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test69");
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch0 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch1 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch2 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node3 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node5 = monteCarloTreeSearch2.new Node(node3, false);
        monteCarloTreeSearch1.addChildNodes(node5, (-1));
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch8 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch9 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node10 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node12 = monteCarloTreeSearch9.new Node(node10, false);
        monteCarloTreeSearch8.addChildNodes(node12, (-1));
        monteCarloTreeSearch1.addChildNodes(node12, 0);
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node17 = monteCarloTreeSearch0.monteCarloTreeSearch(node12);
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch18 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node19 = monteCarloTreeSearch18.new Node();
        monteCarloTreeSearch0.simulateRandomPlay(node19);
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch21 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch22 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node23 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node25 = monteCarloTreeSearch22.new Node(node23, false);
        monteCarloTreeSearch21.addChildNodes(node25, (-1));
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch28 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch29 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node30 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node32 = monteCarloTreeSearch29.new Node(node30, false);
        monteCarloTreeSearch28.addChildNodes(node32, (-1));
        monteCarloTreeSearch21.addChildNodes(node32, 0);
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node37 = monteCarloTreeSearch21.new Node();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node38 = monteCarloTreeSearch21.new Node();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch39 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node40 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node42 = monteCarloTreeSearch39.new Node(node40, false);
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch43 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch44 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node45 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node47 = monteCarloTreeSearch44.new Node(node45, false);
        monteCarloTreeSearch43.addChildNodes(node47, (-1));
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch50 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node51 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node53 = monteCarloTreeSearch50.new Node(node51, false);
        monteCarloTreeSearch43.addChildNodes(node53, 1);
        monteCarloTreeSearch39.printScores(node53);
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch57 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node58 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node60 = monteCarloTreeSearch57.new Node(node58, false);
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch61 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node62 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node64 = monteCarloTreeSearch61.new Node(node62, false);
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch65 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch66 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node67 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node69 = monteCarloTreeSearch66.new Node(node67, false);
        monteCarloTreeSearch65.addChildNodes(node69, (-1));
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch72 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node73 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node75 = monteCarloTreeSearch72.new Node(node73, false);
        monteCarloTreeSearch65.addChildNodes(node75, 1);
        monteCarloTreeSearch61.printScores(node75);
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node79 = monteCarloTreeSearch57.getWinnerNode(node75);
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node80 = monteCarloTreeSearch39.getWinnerNode(node75);
        monteCarloTreeSearch21.addChildNodes(node75, 0);
        monteCarloTreeSearch0.printScores(node75);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node79);
        org.junit.Assert.assertNotNull(node80);
    }

    @Test
    public void test70() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test70");
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch0 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch1 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node2 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node4 = monteCarloTreeSearch1.new Node(node2, false);
        monteCarloTreeSearch0.addChildNodes(node4, (-1));
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch7 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch8 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node9 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node11 = monteCarloTreeSearch8.new Node(node9, false);
        monteCarloTreeSearch7.addChildNodes(node11, (-1));
        monteCarloTreeSearch0.addChildNodes(node11, 0);
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch16 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node17 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node19 = monteCarloTreeSearch16.new Node(node17, false);
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch20 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch21 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch22 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node23 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node25 = monteCarloTreeSearch22.new Node(node23, false);
        monteCarloTreeSearch21.addChildNodes(node25, (-1));
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch28 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch29 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node30 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node32 = monteCarloTreeSearch29.new Node(node30, false);
        monteCarloTreeSearch28.addChildNodes(node32, (-1));
        monteCarloTreeSearch21.addChildNodes(node32, 0);
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node37 = monteCarloTreeSearch20.monteCarloTreeSearch(node32);
        monteCarloTreeSearch16.simulateRandomPlay(node37);
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch39 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch40 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node41 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node43 = monteCarloTreeSearch40.new Node(node41, false);
        monteCarloTreeSearch39.addChildNodes(node43, (-1));
        monteCarloTreeSearch16.printScores(node43);
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node48 = monteCarloTreeSearch0.new Node(node43, false);
        org.junit.Assert.assertNotNull(node37);
    }

    @Test
    public void test71() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test71");
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch0 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch1 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch2 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node3 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node5 = monteCarloTreeSearch2.new Node(node3, false);
        monteCarloTreeSearch1.addChildNodes(node5, (-1));
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch8 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch9 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node10 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node12 = monteCarloTreeSearch9.new Node(node10, false);
        monteCarloTreeSearch8.addChildNodes(node12, (-1));
        monteCarloTreeSearch1.addChildNodes(node12, 0);
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node17 = monteCarloTreeSearch0.monteCarloTreeSearch(node12);
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch18 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node19 = monteCarloTreeSearch18.new Node();
        monteCarloTreeSearch0.simulateRandomPlay(node19);
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node21 = monteCarloTreeSearch0.new Node();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch22 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node23 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node25 = monteCarloTreeSearch22.new Node(node23, false);
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch26 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch27 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node28 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node30 = monteCarloTreeSearch27.new Node(node28, false);
        monteCarloTreeSearch26.addChildNodes(node30, (-1));
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch33 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node34 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node36 = monteCarloTreeSearch33.new Node(node34, false);
        monteCarloTreeSearch26.addChildNodes(node36, 1);
        monteCarloTreeSearch22.addChildNodes(node36, (-1));
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch41 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch42 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node43 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node45 = monteCarloTreeSearch42.new Node(node43, false);
        monteCarloTreeSearch41.addChildNodes(node45, (-1));
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch48 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch49 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node50 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node52 = monteCarloTreeSearch49.new Node(node50, false);
        monteCarloTreeSearch48.addChildNodes(node52, (-1));
        monteCarloTreeSearch41.simulateRandomPlay(node52);
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node56 = monteCarloTreeSearch22.monteCarloTreeSearch(node52);
        monteCarloTreeSearch0.printScores(node56);
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node58 = monteCarloTreeSearch0.new Node();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch59 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node60 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node62 = monteCarloTreeSearch59.new Node(node60, false);
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch63 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node64 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node66 = monteCarloTreeSearch63.new Node(node64, false);
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch67 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch68 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node69 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node71 = monteCarloTreeSearch68.new Node(node69, false);
        monteCarloTreeSearch67.addChildNodes(node71, (-1));
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch74 = new com.thealgorithms.searches.MonteCarloTreeSearch();
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node75 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node77 = monteCarloTreeSearch74.new Node(node75, false);
        monteCarloTreeSearch67.addChildNodes(node77, 1);
        monteCarloTreeSearch63.printScores(node77);
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node81 = monteCarloTreeSearch59.getWinnerNode(node77);
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node82 = monteCarloTreeSearch59.new Node();
        // The following exception was thrown during execution in test generation
        try {
            monteCarloTreeSearch0.addChildNodes(node82, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node56);
        org.junit.Assert.assertNotNull(node81);
    }

    @Test
    public void test72() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test72");
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch0 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.searches.MonteCarloTreeSearch.Node node3 = monteCarloTreeSearch0.new Node(node1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to com.thealgorithms.searches.MonteCarloTreeSearch$Node with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test73() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test73");
        com.thealgorithms.searches.MonteCarloTreeSearch monteCarloTreeSearch0 = null;
        com.thealgorithms.searches.MonteCarloTreeSearch.Node node1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.searches.MonteCarloTreeSearch.Node node3 = monteCarloTreeSearch0.new Node(node1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to com.thealgorithms.searches.MonteCarloTreeSearch$Node with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }
}

