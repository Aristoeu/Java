package PowRecursion;

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
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        long long2 = com.thealgorithms.maths.PowRecursion.pow((int) '4', 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        long long2 = com.thealgorithms.maths.PowRecursion.pow((int) (byte) -1, (int) '#');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        long long2 = com.thealgorithms.maths.PowRecursion.pow(1, 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        com.thealgorithms.maths.PowRecursion powRecursion0 = new com.thealgorithms.maths.PowRecursion();
        java.lang.Class<?> wildcardClass1 = powRecursion0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        long long2 = com.thealgorithms.maths.PowRecursion.pow((int) (byte) 100, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        long long2 = com.thealgorithms.maths.PowRecursion.pow((int) 'a', (int) 'a');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 4593512421086651489L + "'", long2 == 4593512421086651489L);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        long long2 = com.thealgorithms.maths.PowRecursion.pow(1, 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        long long2 = com.thealgorithms.maths.PowRecursion.pow((int) 'a', (int) (short) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        long long2 = com.thealgorithms.maths.PowRecursion.pow((int) '#', (int) (short) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 35L + "'", long2 == 35L);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        long long2 = com.thealgorithms.maths.PowRecursion.pow((int) '4', (int) (short) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        long long2 = com.thealgorithms.maths.PowRecursion.pow((int) (short) 0, (int) '4');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        long long2 = com.thealgorithms.maths.PowRecursion.pow((int) (short) -1, (int) '4');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        long long2 = com.thealgorithms.maths.PowRecursion.pow((int) (short) 10, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10000000000L + "'", long2 == 10000000000L);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        long long2 = com.thealgorithms.maths.PowRecursion.pow((int) (byte) 1, 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        long long2 = com.thealgorithms.maths.PowRecursion.pow((int) (short) 100, 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        long long2 = com.thealgorithms.maths.PowRecursion.pow(1, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        long long2 = com.thealgorithms.maths.PowRecursion.pow((int) (short) 1, 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        long long2 = com.thealgorithms.maths.PowRecursion.pow(0, (int) '4');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        long long2 = com.thealgorithms.maths.PowRecursion.pow(10, (int) ' ');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-8814407033341083648L) + "'", long2 == (-8814407033341083648L));
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        long long2 = com.thealgorithms.maths.PowRecursion.pow((int) 'a', (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        long long2 = com.thealgorithms.maths.PowRecursion.pow((int) (byte) 0, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        long long2 = com.thealgorithms.maths.PowRecursion.pow((int) (short) 100, 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        long long2 = com.thealgorithms.maths.PowRecursion.pow(100, 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 7766279631452241920L + "'", long2 == 7766279631452241920L);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        long long2 = com.thealgorithms.maths.PowRecursion.pow(100, (int) ' ');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        long long2 = com.thealgorithms.maths.PowRecursion.pow((int) 'a', (int) '4');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-8934108775301215359L) + "'", long2 == (-8934108775301215359L));
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        long long2 = com.thealgorithms.maths.PowRecursion.pow((int) (short) -1, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        long long2 = com.thealgorithms.maths.PowRecursion.pow(0, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        long long2 = com.thealgorithms.maths.PowRecursion.pow(10, 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10000000000L + "'", long2 == 10000000000L);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        long long2 = com.thealgorithms.maths.PowRecursion.pow((int) '#', (int) (short) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2758547353515625L + "'", long2 == 2758547353515625L);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        long long2 = com.thealgorithms.maths.PowRecursion.pow((int) (byte) -1, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        long long2 = com.thealgorithms.maths.PowRecursion.pow((int) (short) -1, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        long long2 = com.thealgorithms.maths.PowRecursion.pow((int) (short) 0, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        long long2 = com.thealgorithms.maths.PowRecursion.pow(100, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 7766279631452241920L + "'", long2 == 7766279631452241920L);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        long long2 = com.thealgorithms.maths.PowRecursion.pow((int) '#', 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2758547353515625L + "'", long2 == 2758547353515625L);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        long long2 = com.thealgorithms.maths.PowRecursion.pow((int) (short) 0, (int) ' ');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        long long2 = com.thealgorithms.maths.PowRecursion.pow(100, (int) '#');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        long long2 = com.thealgorithms.maths.PowRecursion.pow((int) (byte) -1, (int) ' ');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        long long2 = com.thealgorithms.maths.PowRecursion.pow((int) (short) -1, 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        long long2 = com.thealgorithms.maths.PowRecursion.pow((-1), (int) '4');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        long long2 = com.thealgorithms.maths.PowRecursion.pow((int) ' ', (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        long long2 = com.thealgorithms.maths.PowRecursion.pow((int) 'a', (int) (short) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1683002521388203393L + "'", long2 == 1683002521388203393L);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        long long2 = com.thealgorithms.maths.PowRecursion.pow((int) (byte) 1, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        long long2 = com.thealgorithms.maths.PowRecursion.pow(0, (int) ' ');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        long long2 = com.thealgorithms.maths.PowRecursion.pow((int) ' ', (int) (short) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        long long2 = com.thealgorithms.maths.PowRecursion.pow((int) (byte) 100, 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        long long2 = com.thealgorithms.maths.PowRecursion.pow((int) (byte) 10, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        long long2 = com.thealgorithms.maths.PowRecursion.pow((int) (byte) -1, 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        long long2 = com.thealgorithms.maths.PowRecursion.pow((int) (byte) 10, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        long long2 = com.thealgorithms.maths.PowRecursion.pow((int) (byte) 100, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        long long2 = com.thealgorithms.maths.PowRecursion.pow(1, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        long long2 = com.thealgorithms.maths.PowRecursion.pow(100, (int) 'a');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        long long2 = com.thealgorithms.maths.PowRecursion.pow((int) (short) -1, 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        long long2 = com.thealgorithms.maths.PowRecursion.pow((int) (short) 100, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        long long2 = com.thealgorithms.maths.PowRecursion.pow((int) (byte) 1, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        long long2 = com.thealgorithms.maths.PowRecursion.pow((int) '#', (int) (short) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        long long2 = com.thealgorithms.maths.PowRecursion.pow((int) (byte) 1, 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        long long2 = com.thealgorithms.maths.PowRecursion.pow((int) (short) -1, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        long long2 = com.thealgorithms.maths.PowRecursion.pow(1, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        long long2 = com.thealgorithms.maths.PowRecursion.pow((int) '4', (int) 'a');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        long long2 = com.thealgorithms.maths.PowRecursion.pow((int) (short) 10, 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        long long2 = com.thealgorithms.maths.PowRecursion.pow((int) (short) -1, (int) ' ');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        long long2 = com.thealgorithms.maths.PowRecursion.pow(1, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        long long2 = com.thealgorithms.maths.PowRecursion.pow((int) ' ', (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        long long2 = com.thealgorithms.maths.PowRecursion.pow((int) (short) -1, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        long long2 = com.thealgorithms.maths.PowRecursion.pow((int) ' ', (int) ' ');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        long long2 = com.thealgorithms.maths.PowRecursion.pow(100, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        long long2 = com.thealgorithms.maths.PowRecursion.pow((int) (short) 1, (int) '4');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        long long2 = com.thealgorithms.maths.PowRecursion.pow(0, 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        long long2 = com.thealgorithms.maths.PowRecursion.pow((int) 'a', 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1683002521388203393L + "'", long2 == 1683002521388203393L);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        long long2 = com.thealgorithms.maths.PowRecursion.pow((int) '4', (int) (short) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        long long2 = com.thealgorithms.maths.PowRecursion.pow((int) '4', (int) (short) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 144555105949057024L + "'", long2 == 144555105949057024L);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        long long2 = com.thealgorithms.maths.PowRecursion.pow((int) ' ', 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1125899906842624L + "'", long2 == 1125899906842624L);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        long long2 = com.thealgorithms.maths.PowRecursion.pow(0, (int) '#');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        long long2 = com.thealgorithms.maths.PowRecursion.pow(0, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        long long2 = com.thealgorithms.maths.PowRecursion.pow((int) '4', (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 144555105949057024L + "'", long2 == 144555105949057024L);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        long long2 = com.thealgorithms.maths.PowRecursion.pow(0, (int) 'a');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        long long2 = com.thealgorithms.maths.PowRecursion.pow((int) (short) -1, 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        long long2 = com.thealgorithms.maths.PowRecursion.pow(1, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        long long2 = com.thealgorithms.maths.PowRecursion.pow((int) (short) 10, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10000000000L + "'", long2 == 10000000000L);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        long long2 = com.thealgorithms.maths.PowRecursion.pow((int) '4', (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 52L + "'", long2 == 52L);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        long long2 = com.thealgorithms.maths.PowRecursion.pow((int) '#', 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        long long2 = com.thealgorithms.maths.PowRecursion.pow(0, 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        long long2 = com.thealgorithms.maths.PowRecursion.pow((int) (short) 10, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        long long2 = com.thealgorithms.maths.PowRecursion.pow((-1), (int) (short) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        long long2 = com.thealgorithms.maths.PowRecursion.pow((int) 'a', (int) ' ');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1149987972776840193L + "'", long2 == 1149987972776840193L);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        long long2 = com.thealgorithms.maths.PowRecursion.pow((int) '#', 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 8170176069297290577L + "'", long2 == 8170176069297290577L);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        long long2 = com.thealgorithms.maths.PowRecursion.pow(100, 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        long long2 = com.thealgorithms.maths.PowRecursion.pow(0, 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        long long2 = com.thealgorithms.maths.PowRecursion.pow((int) '4', (int) ' ');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        long long2 = com.thealgorithms.maths.PowRecursion.pow((int) (short) 10, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        long long2 = com.thealgorithms.maths.PowRecursion.pow((int) (byte) -1, (int) '4');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        long long2 = com.thealgorithms.maths.PowRecursion.pow((int) (byte) 100, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 7766279631452241920L + "'", long2 == 7766279631452241920L);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        long long2 = com.thealgorithms.maths.PowRecursion.pow((int) '4', (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        long long2 = com.thealgorithms.maths.PowRecursion.pow((int) (short) 10, (int) '4');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2661627379775963136L) + "'", long2 == (-2661627379775963136L));
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        long long2 = com.thealgorithms.maths.PowRecursion.pow((int) (short) 1, (int) ' ');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        long long2 = com.thealgorithms.maths.PowRecursion.pow((-1), (int) (short) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        long long2 = com.thealgorithms.maths.PowRecursion.pow((int) (short) 0, 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        long long2 = com.thealgorithms.maths.PowRecursion.pow((int) 'a', 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        long long2 = com.thealgorithms.maths.PowRecursion.pow((int) (short) 0, (int) 'a');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        long long2 = com.thealgorithms.maths.PowRecursion.pow((int) (short) 0, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        long long2 = com.thealgorithms.maths.PowRecursion.pow((int) ' ', (int) (short) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        long long2 = com.thealgorithms.maths.PowRecursion.pow((int) (byte) 0, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        long long2 = com.thealgorithms.maths.PowRecursion.pow((int) (short) 10, 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        long long2 = com.thealgorithms.maths.PowRecursion.pow((int) (byte) 1, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        long long2 = com.thealgorithms.maths.PowRecursion.pow((int) (byte) -1, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        long long2 = com.thealgorithms.maths.PowRecursion.pow((-1), (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        long long2 = com.thealgorithms.maths.PowRecursion.pow((int) 'a', 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-44563605345380415L) + "'", long2 == (-44563605345380415L));
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        long long2 = com.thealgorithms.maths.PowRecursion.pow(10, (int) 'a');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        long long2 = com.thealgorithms.maths.PowRecursion.pow((int) (short) 0, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        long long2 = com.thealgorithms.maths.PowRecursion.pow((int) (short) 0, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        long long2 = com.thealgorithms.maths.PowRecursion.pow((int) (byte) 0, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        long long2 = com.thealgorithms.maths.PowRecursion.pow((int) (byte) 100, (int) 'a');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        long long2 = com.thealgorithms.maths.PowRecursion.pow(10, 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        long long2 = com.thealgorithms.maths.PowRecursion.pow((int) (short) 0, 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        long long2 = com.thealgorithms.maths.PowRecursion.pow((int) (byte) 10, (int) '#');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3136633892082024448L + "'", long2 == 3136633892082024448L);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        long long2 = com.thealgorithms.maths.PowRecursion.pow(10, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        long long2 = com.thealgorithms.maths.PowRecursion.pow((int) (short) 100, 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        long long2 = com.thealgorithms.maths.PowRecursion.pow((int) (byte) 0, (int) 'a');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        long long2 = com.thealgorithms.maths.PowRecursion.pow((int) (byte) 0, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        long long2 = com.thealgorithms.maths.PowRecursion.pow((int) (byte) 100, 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 7766279631452241920L + "'", long2 == 7766279631452241920L);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        long long2 = com.thealgorithms.maths.PowRecursion.pow((int) (byte) 10, (int) '4');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2661627379775963136L) + "'", long2 == (-2661627379775963136L));
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        long long2 = com.thealgorithms.maths.PowRecursion.pow((int) (short) 10, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        long long2 = com.thealgorithms.maths.PowRecursion.pow(10, (int) '#');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3136633892082024448L + "'", long2 == 3136633892082024448L);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        long long2 = com.thealgorithms.maths.PowRecursion.pow((-1), (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        long long2 = com.thealgorithms.maths.PowRecursion.pow(1, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        long long2 = com.thealgorithms.maths.PowRecursion.pow(0, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        long long2 = com.thealgorithms.maths.PowRecursion.pow(10, (int) '4');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2661627379775963136L) + "'", long2 == (-2661627379775963136L));
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        long long2 = com.thealgorithms.maths.PowRecursion.pow(1, (int) '#');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        long long2 = com.thealgorithms.maths.PowRecursion.pow((int) (short) 100, 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 7766279631452241920L + "'", long2 == 7766279631452241920L);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        long long2 = com.thealgorithms.maths.PowRecursion.pow(10, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        long long2 = com.thealgorithms.maths.PowRecursion.pow(10, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10000000000L + "'", long2 == 10000000000L);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        long long2 = com.thealgorithms.maths.PowRecursion.pow((int) ' ', (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        long long2 = com.thealgorithms.maths.PowRecursion.pow((int) (short) 1, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        long long2 = com.thealgorithms.maths.PowRecursion.pow((int) ' ', (int) '#');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        long long2 = com.thealgorithms.maths.PowRecursion.pow((int) (byte) -1, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        long long2 = com.thealgorithms.maths.PowRecursion.pow((-1), (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        long long2 = com.thealgorithms.maths.PowRecursion.pow((int) (short) 1, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        long long2 = com.thealgorithms.maths.PowRecursion.pow((int) (byte) 100, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        long long2 = com.thealgorithms.maths.PowRecursion.pow((int) (short) -1, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        long long2 = com.thealgorithms.maths.PowRecursion.pow((int) 'a', 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        long long2 = com.thealgorithms.maths.PowRecursion.pow((int) (byte) 100, (int) ' ');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        long long2 = com.thealgorithms.maths.PowRecursion.pow((int) (byte) 100, (int) '#');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        long long2 = com.thealgorithms.maths.PowRecursion.pow(0, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        long long2 = com.thealgorithms.maths.PowRecursion.pow((int) 'a', (int) '#');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1424483695288829663L) + "'", long2 == (-1424483695288829663L));
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        long long2 = com.thealgorithms.maths.PowRecursion.pow((int) (byte) 10, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        long long2 = com.thealgorithms.maths.PowRecursion.pow((int) 'a', (int) (short) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        long long2 = com.thealgorithms.maths.PowRecursion.pow((int) (byte) -1, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        long long2 = com.thealgorithms.maths.PowRecursion.pow((int) (short) 1, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        long long2 = com.thealgorithms.maths.PowRecursion.pow((int) (byte) 0, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        long long2 = com.thealgorithms.maths.PowRecursion.pow(1, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        long long2 = com.thealgorithms.maths.PowRecursion.pow((int) ' ', (int) '4');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        long long2 = com.thealgorithms.maths.PowRecursion.pow((int) (byte) 0, 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        long long2 = com.thealgorithms.maths.PowRecursion.pow((int) '4', 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 52L + "'", long2 == 52L);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        long long2 = com.thealgorithms.maths.PowRecursion.pow((int) (byte) 10, (int) ' ');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-8814407033341083648L) + "'", long2 == (-8814407033341083648L));
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        long long2 = com.thealgorithms.maths.PowRecursion.pow((int) (short) 100, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 7766279631452241920L + "'", long2 == 7766279631452241920L);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        long long2 = com.thealgorithms.maths.PowRecursion.pow((int) (byte) 0, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        long long2 = com.thealgorithms.maths.PowRecursion.pow((int) (short) 0, (int) '#');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        long long2 = com.thealgorithms.maths.PowRecursion.pow((int) (byte) 100, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        long long2 = com.thealgorithms.maths.PowRecursion.pow((int) (byte) -1, 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        long long2 = com.thealgorithms.maths.PowRecursion.pow((int) (byte) -1, (int) 'a');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        long long2 = com.thealgorithms.maths.PowRecursion.pow((int) 'a', (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-44563605345380415L) + "'", long2 == (-44563605345380415L));
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        long long2 = com.thealgorithms.maths.PowRecursion.pow(10, 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        long long2 = com.thealgorithms.maths.PowRecursion.pow((int) (byte) 1, 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        long long2 = com.thealgorithms.maths.PowRecursion.pow(1, 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        long long2 = com.thealgorithms.maths.PowRecursion.pow(0, 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        long long2 = com.thealgorithms.maths.PowRecursion.pow(0, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        long long2 = com.thealgorithms.maths.PowRecursion.pow((-1), 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        long long2 = com.thealgorithms.maths.PowRecursion.pow((int) (byte) 10, 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        long long2 = com.thealgorithms.maths.PowRecursion.pow(100, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        long long2 = com.thealgorithms.maths.PowRecursion.pow((int) (short) 10, (int) ' ');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-8814407033341083648L) + "'", long2 == (-8814407033341083648L));
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        long long2 = com.thealgorithms.maths.PowRecursion.pow((int) (short) 1, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        long long2 = com.thealgorithms.maths.PowRecursion.pow(0, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        long long2 = com.thealgorithms.maths.PowRecursion.pow((int) (byte) -1, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        long long2 = com.thealgorithms.maths.PowRecursion.pow((int) (short) 1, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        long long2 = com.thealgorithms.maths.PowRecursion.pow((int) (byte) 10, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10000000000L + "'", long2 == 10000000000L);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        long long2 = com.thealgorithms.maths.PowRecursion.pow((int) (byte) -1, 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        long long2 = com.thealgorithms.maths.PowRecursion.pow((-1), 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        long long2 = com.thealgorithms.maths.PowRecursion.pow((int) (short) -1, (int) 'a');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        long long2 = com.thealgorithms.maths.PowRecursion.pow((int) (byte) 10, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        long long2 = com.thealgorithms.maths.PowRecursion.pow((int) ' ', (int) (short) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1125899906842624L + "'", long2 == 1125899906842624L);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        long long2 = com.thealgorithms.maths.PowRecursion.pow(100, 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        long long2 = com.thealgorithms.maths.PowRecursion.pow((int) (byte) 1, 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        long long2 = com.thealgorithms.maths.PowRecursion.pow((int) (byte) 1, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        long long2 = com.thealgorithms.maths.PowRecursion.pow((int) (byte) 1, (int) ' ');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        long long2 = com.thealgorithms.maths.PowRecursion.pow((int) (byte) 100, 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        long long2 = com.thealgorithms.maths.PowRecursion.pow((int) (byte) 10, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        long long2 = com.thealgorithms.maths.PowRecursion.pow((int) (byte) 0, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        long long2 = com.thealgorithms.maths.PowRecursion.pow(0, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        long long2 = com.thealgorithms.maths.PowRecursion.pow((int) (short) 10, (int) '#');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3136633892082024448L + "'", long2 == 3136633892082024448L);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        long long2 = com.thealgorithms.maths.PowRecursion.pow((int) (byte) -1, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        long long2 = com.thealgorithms.maths.PowRecursion.pow((int) '4', (int) '#');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        long long2 = com.thealgorithms.maths.PowRecursion.pow((int) (byte) 0, 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        long long2 = com.thealgorithms.maths.PowRecursion.pow((-1), 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        long long2 = com.thealgorithms.maths.PowRecursion.pow((int) (short) 10, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        long long2 = com.thealgorithms.maths.PowRecursion.pow((int) (short) 10, 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        long long2 = com.thealgorithms.maths.PowRecursion.pow((int) '#', (int) '#');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 8407224849895527163L + "'", long2 == 8407224849895527163L);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        long long2 = com.thealgorithms.maths.PowRecursion.pow(100, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        long long2 = com.thealgorithms.maths.PowRecursion.pow(100, (int) '4');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        long long2 = com.thealgorithms.maths.PowRecursion.pow((int) (short) 1, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        long long2 = com.thealgorithms.maths.PowRecursion.pow((int) (byte) 1, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        long long2 = com.thealgorithms.maths.PowRecursion.pow((int) 'a', (int) (short) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-44563605345380415L) + "'", long2 == (-44563605345380415L));
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        long long2 = com.thealgorithms.maths.PowRecursion.pow((int) (byte) 10, 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10000000000L + "'", long2 == 10000000000L);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        long long2 = com.thealgorithms.maths.PowRecursion.pow((int) '#', 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 35L + "'", long2 == 35L);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        long long2 = com.thealgorithms.maths.PowRecursion.pow((int) (short) 100, (int) ' ');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        long long2 = com.thealgorithms.maths.PowRecursion.pow(100, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        long long2 = com.thealgorithms.maths.PowRecursion.pow((int) (short) 0, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        long long2 = com.thealgorithms.maths.PowRecursion.pow((int) ' ', 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        long long2 = com.thealgorithms.maths.PowRecursion.pow((int) (short) 10, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        long long2 = com.thealgorithms.maths.PowRecursion.pow((int) (short) 10, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        long long2 = com.thealgorithms.maths.PowRecursion.pow((int) (short) 100, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        long long2 = com.thealgorithms.maths.PowRecursion.pow((int) (byte) 1, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        long long2 = com.thealgorithms.maths.PowRecursion.pow((int) (byte) 10, 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        long long2 = com.thealgorithms.maths.PowRecursion.pow((int) ' ', (int) (short) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        long long2 = com.thealgorithms.maths.PowRecursion.pow((-1), (int) '#');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        long long2 = com.thealgorithms.maths.PowRecursion.pow((int) (byte) 10, (int) 'a');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        long long2 = com.thealgorithms.maths.PowRecursion.pow((int) (short) -1, (int) '#');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        long long2 = com.thealgorithms.maths.PowRecursion.pow((int) (short) 0, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        long long2 = com.thealgorithms.maths.PowRecursion.pow(1, (int) 'a');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        long long2 = com.thealgorithms.maths.PowRecursion.pow((int) ' ', 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        long long2 = com.thealgorithms.maths.PowRecursion.pow((int) (byte) 100, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 7766279631452241920L + "'", long2 == 7766279631452241920L);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        long long2 = com.thealgorithms.maths.PowRecursion.pow((-1), (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        long long2 = com.thealgorithms.maths.PowRecursion.pow(10, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        long long2 = com.thealgorithms.maths.PowRecursion.pow((int) (byte) 0, (int) ' ');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        long long2 = com.thealgorithms.maths.PowRecursion.pow((int) '4', (int) '4');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        long long2 = com.thealgorithms.maths.PowRecursion.pow((-1), (int) (short) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        long long2 = com.thealgorithms.maths.PowRecursion.pow(1, (int) '4');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        long long2 = com.thealgorithms.maths.PowRecursion.pow((int) '#', (int) (short) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 8170176069297290577L + "'", long2 == 8170176069297290577L);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        long long2 = com.thealgorithms.maths.PowRecursion.pow(0, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        long long2 = com.thealgorithms.maths.PowRecursion.pow((-1), 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        long long2 = com.thealgorithms.maths.PowRecursion.pow((int) (short) 0, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        long long2 = com.thealgorithms.maths.PowRecursion.pow(10, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        long long2 = com.thealgorithms.maths.PowRecursion.pow((int) (short) 10, (int) 'a');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        long long2 = com.thealgorithms.maths.PowRecursion.pow((int) (short) 100, (int) '#');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        long long2 = com.thealgorithms.maths.PowRecursion.pow((int) (short) 0, 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        long long2 = com.thealgorithms.maths.PowRecursion.pow((int) (byte) 100, 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        long long2 = com.thealgorithms.maths.PowRecursion.pow((int) (byte) 1, (int) '4');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        long long2 = com.thealgorithms.maths.PowRecursion.pow((int) (byte) 10, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10000000000L + "'", long2 == 10000000000L);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        long long2 = com.thealgorithms.maths.PowRecursion.pow((int) (short) 1, 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        long long2 = com.thealgorithms.maths.PowRecursion.pow((int) (byte) 100, (int) '4');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        long long2 = com.thealgorithms.maths.PowRecursion.pow((int) (byte) 100, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        long long2 = com.thealgorithms.maths.PowRecursion.pow((int) (byte) 10, 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        long long2 = com.thealgorithms.maths.PowRecursion.pow((int) '#', (int) 'a');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2453876422820638371L + "'", long2 == 2453876422820638371L);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        long long2 = com.thealgorithms.maths.PowRecursion.pow(10, 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        long long2 = com.thealgorithms.maths.PowRecursion.pow((int) '#', (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        long long2 = com.thealgorithms.maths.PowRecursion.pow((int) (short) 100, (int) 'a');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        long long2 = com.thealgorithms.maths.PowRecursion.pow((int) '#', (int) '4');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 8625328718985906577L + "'", long2 == 8625328718985906577L);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        long long2 = com.thealgorithms.maths.PowRecursion.pow((int) (byte) 10, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        long long2 = com.thealgorithms.maths.PowRecursion.pow(1, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        long long2 = com.thealgorithms.maths.PowRecursion.pow(1, (int) ' ');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        long long2 = com.thealgorithms.maths.PowRecursion.pow((int) (byte) 0, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        long long2 = com.thealgorithms.maths.PowRecursion.pow((int) (short) 10, 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10000000000L + "'", long2 == 10000000000L);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        long long2 = com.thealgorithms.maths.PowRecursion.pow((int) '#', (int) ' ');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 7865930784382691969L + "'", long2 == 7865930784382691969L);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        long long2 = com.thealgorithms.maths.PowRecursion.pow(1, 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        long long2 = com.thealgorithms.maths.PowRecursion.pow(100, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        long long2 = com.thealgorithms.maths.PowRecursion.pow((int) '4', (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        long long2 = com.thealgorithms.maths.PowRecursion.pow((int) '4', 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        long long2 = com.thealgorithms.maths.PowRecursion.pow((int) (byte) 100, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        long long2 = com.thealgorithms.maths.PowRecursion.pow((-1), (int) ' ');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        long long2 = com.thealgorithms.maths.PowRecursion.pow(10, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        long long2 = com.thealgorithms.maths.PowRecursion.pow((int) (short) 100, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 7766279631452241920L + "'", long2 == 7766279631452241920L);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        long long2 = com.thealgorithms.maths.PowRecursion.pow((int) (short) 0, 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        long long2 = com.thealgorithms.maths.PowRecursion.pow((int) (short) -1, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        long long2 = com.thealgorithms.maths.PowRecursion.pow((int) (short) 100, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        long long2 = com.thealgorithms.maths.PowRecursion.pow(100, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 7766279631452241920L + "'", long2 == 7766279631452241920L);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        long long2 = com.thealgorithms.maths.PowRecursion.pow((int) (short) -1, 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        long long2 = com.thealgorithms.maths.PowRecursion.pow((int) (byte) -1, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        long long2 = com.thealgorithms.maths.PowRecursion.pow((int) (short) 100, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        long long2 = com.thealgorithms.maths.PowRecursion.pow((int) (byte) 1, (int) 'a');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        long long2 = com.thealgorithms.maths.PowRecursion.pow((int) ' ', (int) 'a');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        long long2 = com.thealgorithms.maths.PowRecursion.pow((int) (short) 1, 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        long long2 = com.thealgorithms.maths.PowRecursion.pow((int) (byte) 0, 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
        long long2 = com.thealgorithms.maths.PowRecursion.pow((int) ' ', 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        long long2 = com.thealgorithms.maths.PowRecursion.pow(100, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
        long long2 = com.thealgorithms.maths.PowRecursion.pow((int) (short) -1, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        long long2 = com.thealgorithms.maths.PowRecursion.pow((int) '4', 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 144555105949057024L + "'", long2 == 144555105949057024L);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
        long long2 = com.thealgorithms.maths.PowRecursion.pow((int) '#', (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 35L + "'", long2 == 35L);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
        long long2 = com.thealgorithms.maths.PowRecursion.pow((int) (short) 100, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
        long long2 = com.thealgorithms.maths.PowRecursion.pow((int) (byte) 1, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
        long long2 = com.thealgorithms.maths.PowRecursion.pow((int) (short) 1, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test281");
        long long2 = com.thealgorithms.maths.PowRecursion.pow((int) ' ', (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1125899906842624L + "'", long2 == 1125899906842624L);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test282");
        long long2 = com.thealgorithms.maths.PowRecursion.pow(10, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10000000000L + "'", long2 == 10000000000L);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test283");
        long long2 = com.thealgorithms.maths.PowRecursion.pow((int) (short) 1, (int) 'a');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test284");
        long long2 = com.thealgorithms.maths.PowRecursion.pow((int) (byte) 0, (int) '#');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test285");
        long long2 = com.thealgorithms.maths.PowRecursion.pow((int) (short) 1, 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test286");
        long long2 = com.thealgorithms.maths.PowRecursion.pow((int) (byte) 1, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test287");
        long long2 = com.thealgorithms.maths.PowRecursion.pow((int) (byte) -1, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test288");
        long long2 = com.thealgorithms.maths.PowRecursion.pow((int) (short) 1, (int) '#');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test289");
        long long2 = com.thealgorithms.maths.PowRecursion.pow((int) '4', (int) (short) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 52L + "'", long2 == 52L);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test290");
        long long2 = com.thealgorithms.maths.PowRecursion.pow((int) (byte) 1, (int) '#');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test291");
        long long2 = com.thealgorithms.maths.PowRecursion.pow((int) 'a', (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test292");
        long long2 = com.thealgorithms.maths.PowRecursion.pow((int) (short) 1, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test293");
        long long2 = com.thealgorithms.maths.PowRecursion.pow(10, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test294");
        long long2 = com.thealgorithms.maths.PowRecursion.pow((int) (byte) -1, 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test295");
        long long2 = com.thealgorithms.maths.PowRecursion.pow((int) (byte) 0, 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test296");
        long long2 = com.thealgorithms.maths.PowRecursion.pow((-1), (int) 'a');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test297");
        long long2 = com.thealgorithms.maths.PowRecursion.pow((int) (short) 100, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test298");
        long long2 = com.thealgorithms.maths.PowRecursion.pow(100, 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test299");
        long long2 = com.thealgorithms.maths.PowRecursion.pow((int) 'a', (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1683002521388203393L + "'", long2 == 1683002521388203393L);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test300");
        long long2 = com.thealgorithms.maths.PowRecursion.pow((int) (byte) 0, (int) '4');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test301");
        long long2 = com.thealgorithms.maths.PowRecursion.pow((int) (short) 0, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test302");
        long long2 = com.thealgorithms.maths.PowRecursion.pow((int) (short) -1, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test303");
        long long2 = com.thealgorithms.maths.PowRecursion.pow((int) '#', (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2758547353515625L + "'", long2 == 2758547353515625L);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test304");
        long long2 = com.thealgorithms.maths.PowRecursion.pow((int) (short) 100, (int) '4');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test305");
        long long2 = com.thealgorithms.maths.PowRecursion.pow((int) '#', (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 8170176069297290577L + "'", long2 == 8170176069297290577L);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test306");
        long long2 = com.thealgorithms.maths.PowRecursion.pow((-1), (int) (short) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }
}

