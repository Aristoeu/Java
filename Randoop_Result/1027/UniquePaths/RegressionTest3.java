package UniquePaths;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest3 {

    public static boolean debug = false;

    @Test
    public void test1501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1501");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths(1, (int) (short) -1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) ' ', (int) (byte) 100, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (byte) -1, 1, 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((-1), 1, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths(0, 100, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (short) 10, (int) (byte) 100, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2(0, (int) '4', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (short) -1, (int) (byte) 100, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (short) 0, (int) (byte) 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2(0, (int) (byte) -1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (byte) 100, (int) (byte) 10, (int) ' ');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2(100, (int) (short) 10, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (short) 0, (int) ' ', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2(0, 0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (short) 100, (int) '#', (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2(0, (int) '#', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2(10, (int) 'a', (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) 'a', 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (byte) 1, (int) ' ', (int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (short) 100, (int) (short) 1, (int) ' ');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (byte) 1, 1, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (byte) 0, (int) 'a', (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) '#', (int) (byte) 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (byte) 10, (int) (short) 100, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2(0, (int) (byte) 100, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) 'a', (int) (short) 10, (int) '#');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (byte) 0, 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (short) 100, (int) (byte) -1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1529");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths(1, (int) (short) 10, 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1530");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2(0, (int) (short) 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1531");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths(0, (int) '#', (-1));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1532");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (short) 10, (int) (byte) -1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((-1), (int) (short) 1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1534");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((-1), 100, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2(0, (int) (short) 10, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1536");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) '4', (int) (byte) 0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1537");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (byte) 100, (int) (short) 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1538");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (byte) 10, (int) (short) -1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1539");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) '#', (int) '#', (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1540");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (byte) -1, (int) (short) 1, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1541");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) '#', 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1542");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((-1), (int) '#', (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1543");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) '#', (int) (byte) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1544");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2(1, (int) (short) 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1545");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (byte) 100, 100, (int) '4');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1546");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths(1, 10, (int) '#');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1547");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (byte) -1, (int) (byte) -1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1548");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (short) 1, 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1549");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (byte) 0, 1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1550");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (short) -1, (int) (byte) -1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1551");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) 'a', (int) (byte) -1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1552");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (byte) 0, (int) (byte) 1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1553");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (byte) -1, 1, (int) 'a');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1554");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (byte) -1, (int) (byte) -1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1555");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2(100, (int) (byte) 1, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1556");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (byte) 0, (int) (short) -1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1557");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) 'a', (int) (byte) -1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1558");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (short) 0, (int) (short) 0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1559");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (byte) 1, (int) '4', 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1560");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2(0, (int) (short) 10, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1561");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (short) -1, (int) (short) 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1562");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (short) 10, (int) (byte) -1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1563");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (byte) -1, (int) (short) 10, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1564");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (short) -1, (int) (byte) 100, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1565");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (byte) 10, (int) '4', (int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1566");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths(0, (int) (byte) 10, 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1567");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (short) 1, (int) (byte) 1, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1568");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) 'a', (int) '4', 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1569");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths(1, 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1570");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (short) 10, (int) (short) 100, (-1));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1571");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) 'a', 1, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1572");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((-1), (-1), (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1573");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((-1), (int) (byte) 10, 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1574");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (byte) -1, (int) (byte) 100, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1575");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (byte) 10, (int) (byte) 1, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1576");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (short) 100, (int) (short) 100, (-1));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1577");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) 'a', 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1578");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (short) 10, (int) (short) 100, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1579");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (byte) -1, (int) '#', (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1580");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (short) 10, (int) (byte) 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1581");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2(1, (int) ' ', (int) '4');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1582");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2(1, (int) '4', 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1583");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths(10, (int) (byte) -1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1584");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) 'a', (int) (short) 10, (int) ' ');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1585");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths(10, 0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1586");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (short) -1, (int) ' ', (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1587");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (short) 10, (int) (byte) -1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1588");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (short) -1, (int) (short) 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1589");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2(10, (int) (short) 100, 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1590");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2(1, (int) (short) 10, 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1591");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) '#', (int) (short) 10, 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1592");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (byte) 1, (int) 'a', (int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1593");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (byte) 10, 1, 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1594");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (short) 10, 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1595");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (short) -1, (int) (short) 1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1596");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) ' ', (int) (byte) 100, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1597");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (byte) 1, (int) (byte) 1, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1598");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (byte) 10, 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1599");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths(0, (int) (byte) 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1600");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (byte) 100, (int) 'a', 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1601");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) '#', 10, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1602");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2(100, (int) 'a', 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1603");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2(0, (int) (short) 10, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1604");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) 'a', (int) '4', (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1605");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (short) -1, (int) (short) 0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1606");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2(100, (int) 'a', (int) '4');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1607");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (byte) 1, (int) (byte) -1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1608");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (byte) 10, (-1), 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1609");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (short) 10, (int) (short) 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1610");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (short) -1, 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1611");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (byte) 0, (int) ' ', (int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1612");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) ' ', 100, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1613");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2(100, (int) ' ', (int) '4');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1614");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2(100, (int) (short) 1, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1615");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (short) 0, (int) (byte) 100, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1616");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) '#', (int) (byte) 10, (-1));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1617");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (byte) 0, (int) (short) 100, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1618");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) '#', 10, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1619");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths(100, (int) (byte) 1, 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1620");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (short) 100, (int) (short) -1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1621");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (short) 0, (int) 'a', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1622");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (byte) 100, (int) (short) 100, 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1623");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (short) 0, (int) (short) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1624");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (short) 1, (int) '4', (int) 'a');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1625");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (byte) 1, (int) (short) 1, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1626");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) '#', (int) (short) -1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1627");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (byte) -1, (int) ' ', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1628");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (byte) -1, 100, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1629");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (byte) 100, (int) '#', 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1630");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (short) -1, 100, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1631");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (byte) -1, 1, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1632");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths(10, (int) (byte) 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1633");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) ' ', 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1634");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) ' ', (int) (short) 100, 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1635");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2(100, (int) (short) -1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1636");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (byte) 0, 1, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1637");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) 'a', (int) (byte) 1, 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1638");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (short) -1, (int) (byte) 0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1639");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (short) -1, 1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1640");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (byte) 100, (int) (byte) 10, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1641");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((-1), (int) 'a', 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1642");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((-1), (int) 'a', (int) '#');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1643");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) '#', (-1), (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1644");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths(1, (int) (byte) -1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1645");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths(1, (int) ' ', (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1646");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (byte) 1, 10, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1647");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (byte) 10, (int) (short) -1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1648");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (byte) 0, 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1649");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((-1), (int) (short) 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1650");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (short) -1, (int) '4', 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1651");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) '#', (int) (byte) 10, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1652");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (short) 10, (int) (short) 10, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1653");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (byte) 1, 10, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1654");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (short) 10, (int) (byte) 100, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1655");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (byte) 1, (int) (byte) 1, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1656");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2(100, (int) (short) 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1657");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (byte) 0, 0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1658");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((-1), (int) (byte) -1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1659");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((-1), (int) (short) -1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1660");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (short) 0, 1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1661");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths(100, (int) (byte) 100, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1662");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (byte) -1, 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1663");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (byte) -1, (int) (short) 1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1664");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths(0, (int) (byte) 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1665");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) ' ', (int) (byte) 100, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1666");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2(0, (int) (byte) 1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1667");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2(1, 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1668");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths(0, 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1669");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((-1), (int) '4', (int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test1670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1670");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths(0, (int) (byte) 100, 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test1671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1671");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (short) 0, (int) (short) 1, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1672");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) '#', 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1673");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) '4', (-1), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1674");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (short) 100, (int) '4', (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1675");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (short) 1, (int) (byte) 0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1676");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (short) 10, (int) (short) 1, 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1677");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) '#', (int) (byte) 100, 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1678");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2(0, 100, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1679");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (byte) 0, (int) 'a', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1680");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths(0, 10, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1681");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (short) 10, (int) (short) 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1682");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (short) 10, 1, 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1683");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (byte) 1, 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1684");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (short) -1, (int) (short) 1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1685");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (short) 100, (int) (short) 100, (int) ' ');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1686");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (short) 1, 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1687");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) 'a', (-1), (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1688");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (short) 1, 1, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1689");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) 'a', (int) (short) 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1690");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (short) 100, 100, (int) ' ');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1691");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2(0, 10, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1692");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((-1), 1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1693");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (short) 0, (int) (byte) 1, (-1));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1694");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (byte) 100, (int) (short) -1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1695");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths(0, 10, (-1));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1696");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2(1, 1, (int) '#');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1697");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (short) -1, (int) (short) 100, 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test1698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1698");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (short) 0, (int) (short) 10, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1699");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((-1), (int) 'a', (int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1700");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (byte) 10, (int) (short) 100, (-1));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1701");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (short) 1, (int) (short) 1, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1702");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths(1, (int) (short) 10, (int) ' ');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1703");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (byte) 0, (int) ' ', (int) '4');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1704");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths(0, (int) (short) 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1705");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths(1, (int) (byte) 10, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test1706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1706");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths(0, (int) 'a', (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test1707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1707");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (byte) 0, (int) (byte) 1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1708");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((-1), (int) ' ', (int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1709");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) '#', (int) (short) 1, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1710");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths(0, (int) ' ', 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1711");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (byte) 100, 100, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1712");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((-1), 10, 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1713");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (byte) 10, (int) (short) 100, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1714");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths(10, 1, (int) 'a');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1715");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (short) 1, (int) 'a', (-1));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1716");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths(0, (int) '4', (int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1717");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) 'a', (int) '#', (int) ' ');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1718");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (byte) -1, (int) 'a', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1719");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (byte) 10, (int) '4', (-1));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1720");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (byte) 10, 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1721");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths(10, (-1), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1722");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (byte) 0, (int) (byte) 1, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1723");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2(100, (int) '4', (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1724");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) '4', (-1), (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1725");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (byte) 0, (int) (short) 100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1726");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (short) 1, (int) (byte) 1, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test1727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1727");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (byte) -1, (int) (short) 10, (-1));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1728");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) '#', (int) (short) 100, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1729");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (byte) 10, (int) (byte) 100, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1730");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) '#', (int) (byte) -1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1731");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (short) 100, 100, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1732");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (short) 1, (int) (short) -1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1733");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths(100, (int) (byte) 100, (int) '4');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1734");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) '#', (int) (short) -1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1735");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths(10, 100, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1736");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (short) 100, (int) (short) 100, (int) '#');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1737");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (short) 1, (int) 'a', (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test1738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1738");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths(0, (int) (byte) 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1739");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) '#', (int) (byte) 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1740");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) ' ', (int) (short) 10, 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1741");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (short) 1, (int) (short) -1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1742");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (byte) 100, (int) (byte) 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1743");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (byte) 100, 10, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1744");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (byte) -1, 10, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1745");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths(100, 10, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1746");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (short) 1, (int) '#', 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1747");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2(100, (-1), (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1748");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (byte) 0, (int) (short) 0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1749");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (byte) 1, (int) (short) 1, 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test1750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1750");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) '4', (int) 'a', (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1751");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2(0, (int) (byte) 10, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1752");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths(1, 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1753");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (byte) 10, (int) (short) -1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1754");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (short) -1, (-1), (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1755");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((-1), (int) 'a', 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1756");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2(0, 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1757");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) '4', (int) 'a', (int) 'a');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1758");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (byte) 100, (int) ' ', (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1759");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (short) -1, (int) (byte) 100, 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1760");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (byte) 0, (int) (byte) 10, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1761");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (byte) 1, 100, (int) ' ');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1762");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (short) -1, 100, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1763");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (byte) 0, (int) (short) 100, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1764");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) '#', (int) (byte) 100, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1765");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (short) 1, 1, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1766");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (short) -1, (int) (short) -1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1767");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (short) 100, 0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1768");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((-1), (int) (byte) -1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1769");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) ' ', (int) (byte) 100, (int) '#');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1770");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths(1, (int) (short) 100, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test1771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1771");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2(0, 1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1772");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2(1, 100, (-1));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1773");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) 'a', (int) (short) 10, (-1));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1774");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) ' ', (int) (byte) -1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1775");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((-1), (int) (short) 10, (int) 'a');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1776");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) '#', (int) 'a', (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1777");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (short) 1, 1, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1778");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) '#', (int) ' ', (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1779");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (byte) 1, (-1), 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1780");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (short) 1, 10, 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1781");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (short) 0, (int) (byte) -1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1782");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) 'a', (int) (short) 10, 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1783");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (byte) -1, (int) (byte) 100, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1784");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (short) 100, 10, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1785");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (short) 1, (int) (short) 1, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1786");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (byte) 10, (int) (short) 10, 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1787");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) '4', (int) '4', (int) '4');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1788");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths(100, (int) (short) -1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1789");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((-1), (int) (short) -1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1790");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (byte) 1, 1, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test1791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1791");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (byte) 10, (int) (byte) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1792");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (short) 100, (int) (byte) 10, 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1793");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (short) -1, (int) 'a', (int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1794");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (byte) 10, 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1795");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (short) 0, (int) (byte) 1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1796");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) ' ', (int) (byte) -1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1797");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (short) -1, (int) ' ', (int) 'a');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1798");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (short) -1, (-1), (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1799");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2(10, (int) (short) 1, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1800");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) '#', (int) (byte) 0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1801");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths(100, (int) '#', 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1802");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (byte) 0, (int) (short) 10, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1803");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (short) 100, (int) (byte) 1, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1804");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) ' ', 1, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1805");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (byte) 0, (int) (short) -1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1806");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) ' ', (int) (short) 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1807");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (short) -1, 1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1808");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (byte) 10, (int) (short) 1, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test1809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1809");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) '4', (int) ' ', 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1810");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (byte) 100, 10, 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1811");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (byte) -1, 1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1812");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (short) 0, (int) (byte) 1, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1813");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (byte) -1, 10, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1814");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2(0, (int) '4', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1815");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (short) 100, (int) '#', (int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1816");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (short) 100, (int) (byte) 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1817");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (byte) -1, (int) (byte) -1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1818");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2(0, (int) (short) 100, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1819");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths(100, (int) (byte) 1, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1820");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2(10, (int) (byte) 100, 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1821");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2(1, (int) (short) 100, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1822");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) '4', (int) (byte) 10, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1823");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (byte) 1, 100, 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1824");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (short) 10, 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1825");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (short) -1, (int) (byte) 1, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1826");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (short) 0, (int) '4', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1827");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (byte) 1, (int) (byte) 1, (int) 'a');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1828");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths(0, (int) ' ', (int) '#');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1829");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths(10, (int) (byte) 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1830");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((-1), (int) (short) 1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1831");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((-1), 1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1832");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (byte) 10, 1, (int) '4');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1833");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (short) 0, (int) '4', (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1834");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2(0, (int) (byte) 100, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1835");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (short) 100, (int) (byte) 1, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1836");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((-1), 1, 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test1837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1837");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (short) 1, (int) (byte) 10, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test1838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1838");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (byte) 1, (int) '#', (int) 'a');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1839");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (byte) -1, (int) '4', (int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1840");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) ' ', (int) '#', (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1841");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (short) 100, (int) '4', 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1842");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (short) 10, 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1843");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2(10, (-1), (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1844");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (byte) -1, 0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1845");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (byte) 1, (int) (byte) 1, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1846");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (short) 1, (int) '#', (int) 'a');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1847");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2(1, (int) (short) 0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1848");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (short) 0, 100, (int) '4');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1849");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) ' ', (int) '4', (int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1850");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) '#', (-1), 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1851");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) 'a', (int) ' ', 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1852");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (short) 0, (int) (byte) 100, (-1));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1853");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (byte) 100, (int) (byte) 100, 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1854");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) '4', 0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1855");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (short) 100, 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1856");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) ' ', (-1), (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1857");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (short) 10, (int) (byte) 10, (int) 'a');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1858");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (short) 1, 1, 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1859");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (short) 1, (int) 'a', (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1860");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (byte) -1, 100, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test1861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1861");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) ' ', 100, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1862");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (short) -1, 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1863");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths(100, (int) (short) -1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1864");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) ' ', (int) 'a', (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1865");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths(1, (int) 'a', 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1866");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((-1), (int) (short) 1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1867");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (short) 1, (int) (byte) 10, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1868");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2(10, (int) '#', (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1869");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (short) 100, (int) (short) 100, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1870");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths(0, (-1), 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1871");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2(100, (int) (short) 10, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1872");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) ' ', 100, (int) '4');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1873");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths(1, (int) (byte) 1, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test1874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1874");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (short) 100, (int) '#', (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1875");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (short) 100, (int) (byte) -1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1876");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (byte) 100, (int) (short) 10, 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1877");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths(10, 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1878");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths(10, (int) (short) 0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1879");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (byte) 0, (int) '#', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1880");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (byte) 10, (int) (byte) 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1881");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) '#', 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1882");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) 'a', 100, 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1883");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) '4', (int) (short) -1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1884");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((-1), (int) ' ', 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1885");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (byte) 0, (int) (byte) 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1886");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths(0, (int) (short) 0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1887");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (short) 0, (int) (byte) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1888");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (short) 10, (int) '4', 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1889");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths(0, (int) (short) 0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1890");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (short) 0, (int) '#', (int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1891");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (byte) 10, (int) (short) 100, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1892");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) '#', (int) 'a', (int) ' ');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1893");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (short) 0, (int) (byte) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1894");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (byte) 1, 1, (int) ' ');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1895");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (byte) 1, (int) (byte) -1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1896");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (short) 0, 1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1897");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((-1), (int) '#', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1898");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2(10, (int) (byte) 1, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test1899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1899");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths(1, (int) (byte) -1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1900");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (byte) 100, (int) (short) 1, (int) '#');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1901");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths(0, (int) (short) 1, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test1902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1902");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) '4', (int) (short) 10, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1903");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) '4', (int) (short) 10, (int) '#');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1904");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (short) 10, (-1), (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1905");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (short) 1, 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1906");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) ' ', 1, 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1907");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (byte) 10, (-1), 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1908");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (byte) 100, (int) (byte) -1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1909");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (short) 10, 100, 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1910");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (byte) 0, (int) ' ', (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1911");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (byte) 100, (int) (short) 10, 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1912");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (short) 100, (int) (short) 1, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1913");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths(100, 1, (int) 'a');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1914");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (byte) 100, (int) (byte) 100, (-1));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1915");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((-1), (int) (byte) -1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1916");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (byte) 100, 10, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1917");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (short) 100, (int) (byte) 100, 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1918");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (byte) 10, 10, 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1919");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (byte) 0, (int) (byte) -1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1920");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((-1), (int) '#', (int) ' ');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1921");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((-1), (int) '#', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1922");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths(10, 0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1923");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (short) 100, (int) 'a', (int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1924");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((-1), 100, (int) ' ');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1925");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2(1, 100, (int) ' ');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1926");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (short) 100, (int) '#', 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1927");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) ' ', (int) '#', (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1928");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths(0, (int) (byte) 100, (int) '#');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1929");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (short) -1, 10, 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1930");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2(100, (int) (short) 100, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1931");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) '4', (int) (short) 1, (-1));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1932");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (short) 0, (int) ' ', 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test1933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1933");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) '#', (int) '4', (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1934");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (byte) 100, (int) (byte) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1935");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) '#', (int) '#', (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1936");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (short) 100, (int) 'a', (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1937");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (byte) 1, 100, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1938");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) 'a', 10, (-1));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1939");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths(1, 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1940");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2(1, (int) (byte) 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1941");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2(0, (int) (byte) 100, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1942");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths(0, (int) (short) 1, 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1943");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths(100, (int) (byte) 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1944");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (short) 100, (int) (short) 1, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test1945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1945");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths(1, (int) (byte) -1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1946");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (short) 100, (int) (short) 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1947");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths(0, (int) ' ', (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1948");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (byte) 0, (int) (byte) 10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1949");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths(1, (-1), 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1950");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (short) 100, 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1951");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) ' ', (int) (byte) 1, 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1952");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (short) 1, (-1), (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1953");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) '4', (int) (byte) 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1954");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (short) 100, (int) (short) 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1955");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (byte) 10, (int) (byte) 10, (int) '4');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1956");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (short) -1, 10, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1957");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (short) 10, (int) '#', 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1958");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (short) 1, (-1), (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1959");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (byte) 0, (int) (byte) -1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1960");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2(0, (int) (short) -1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1961");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) ' ', (int) (byte) 10, (int) 'a');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1962");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((-1), (int) (short) 100, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1963");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) ' ', (int) 'a', 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1964");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (byte) 1, (int) (short) 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1965");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) '#', (int) (byte) 1, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1966");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (short) 100, (int) (short) 1, 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test1967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1967");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths(10, (int) '#', 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1968");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (byte) 10, 0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1969");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2(0, (int) (byte) 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1970");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (byte) 10, (int) (short) 10, (-1));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1971");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((-1), 0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1972");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (byte) 1, (int) (byte) 100, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1973");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) 'a', (int) ' ', 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1974");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (byte) -1, 10, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1975");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2(10, (int) (byte) 10, (int) '4');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1976");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((-1), (int) '#', (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test1977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1977");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (short) 1, (int) 'a', 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test1978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1978");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) '4', 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1979");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) ' ', 100, 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1980");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (byte) 0, (int) (short) 100, 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test1981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1981");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (short) 10, (-1), (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1982");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (short) 1, (int) (short) 1, (int) '#');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1983");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) 'a', 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1984");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (byte) 10, (int) (short) 1, (-1));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1985");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (short) 1, (int) (byte) 1, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1986");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((-1), 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1987");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (byte) 10, 10, 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1988");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (byte) 100, (int) (short) 100, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1989");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) ' ', (int) (short) 1, 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1990");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (byte) 0, (int) (short) 10, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1991");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) '4', (-1), (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1992");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (byte) 0, (int) (short) 100, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test1993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1993");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (short) 10, (int) (short) 10, (int) ' ');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1994");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2(100, (int) (short) 100, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1995");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths(0, (int) (short) 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1996");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((-1), 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1997");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (short) 1, 100, 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1998");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) ' ', 10, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1999");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (byte) 100, (int) (byte) 10, 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test2000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test2000");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (byte) 100, (int) 'a', (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }
}

