package CollatzConjecture;

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
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture(50);
        int int6 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture(53);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(1);
        int int12 = collatzConjecture0.nextNumber(16);
        int int14 = collatzConjecture0.nextNumber(100);
        int int16 = collatzConjecture0.nextNumber((int) (byte) -1);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture(16);
        int int20 = collatzConjecture0.nextNumber(10);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 50 + "'", int14 == 50);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-2) + "'", int16 == (-2));
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 5 + "'", int20 == 5);
    }
}

