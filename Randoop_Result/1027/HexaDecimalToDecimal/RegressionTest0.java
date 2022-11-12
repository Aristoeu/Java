package HexaDecimalToDecimal;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test1");
        int int1 = com.thealgorithms.conversions.HexaDecimalToDecimal.getHexaToDec("hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-273) + "'", int1 == (-273));
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test2");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test3");
        com.thealgorithms.conversions.HexaDecimalToDecimal hexaDecimalToDecimal0 = new com.thealgorithms.conversions.HexaDecimalToDecimal();
        java.lang.Class<?> wildcardClass1 = hexaDecimalToDecimal0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test4");
        int int1 = com.thealgorithms.conversions.HexaDecimalToDecimal.getHexaToDec("");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }
}
