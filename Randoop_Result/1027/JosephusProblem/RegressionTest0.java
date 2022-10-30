package JosephusProblem;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0001");
        com.thealgorithms.maths.JosephusProblem josephusProblem0 = new com.thealgorithms.maths.JosephusProblem();
        java.lang.Class<?> wildcardClass1 = josephusProblem0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner((int) '4', (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 41 + "'", int2 == 41);
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner((int) (byte) 10, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner((int) (byte) 10, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(41, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner((int) '4', 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner((int) (short) 1, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner((int) 'a', (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-95) + "'", int2 == (-95));
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner((int) (short) 1, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner((int) (short) 100, (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner((int) 'a', (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner((int) 'a', (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 96 + "'", int2 == 96);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner((int) (short) 1, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(52, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner((int) (short) 1, 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner((int) '4', 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner((int) (short) 100, 41);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 17 + "'", int2 == 17);
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner((int) (byte) 100, (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-99) + "'", int2 == (-99));
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(100, 17);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 53 + "'", int2 == 53);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(52, (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 41 + "'", int2 == 41);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner((int) (short) 1, 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(35, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 12 + "'", int2 == 12);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(41, 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 28 + "'", int2 == 28);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(1, (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(28, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(35, (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner((int) (byte) 100, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 21 + "'", int2 == 21);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner((int) (byte) 1, (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner((int) ' ', 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(35, 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 22 + "'", int2 == 22);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(22, 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 22 + "'", int2 == 22);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(28, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner((int) (short) 1, (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(100, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(100, (-95));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-16) + "'", int2 == (-16));
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(28, (-95));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(22, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner((int) (byte) 1, 28);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(41, 53);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner((int) 'a', 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(1, (int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(96, 8);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner((int) (byte) 1, (-99));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(100, 21);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 25 + "'", int2 == 25);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(52, 28);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 50 + "'", int2 == 50);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner((int) (short) 1, 8);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(4, 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(35, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 34 + "'", int2 == 34);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(52, (-99));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-48) + "'", int2 == (-48));
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(25, 64);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 11 + "'", int2 == 11);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner((int) (byte) 10, 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7 + "'", int2 == 7);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(50, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 50 + "'", int2 == 50);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(53, (-16));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-51) + "'", int2 == (-51));
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(64, 17);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 12 + "'", int2 == 12);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(17, (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-16) + "'", int2 == (-16));
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner((int) (short) 10, (-48));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2) + "'", int2 == (-2));
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner((int) '4', 50);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 43 + "'", int2 == 43);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(41, (-48));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-24) + "'", int2 == (-24));
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(8, 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7 + "'", int2 == 7);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(10, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(21, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-19) + "'", int2 == (-19));
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(50, (-51));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-7) + "'", int2 == (-7));
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(22, 28);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 13 + "'", int2 == 13);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(7, 22);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(5, (-2));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner((int) '4', 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(52, 43);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 29 + "'", int2 == 29);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(96, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 16 + "'", int2 == 16);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(25, 7);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 14 + "'", int2 == 14);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(5, 34);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner((int) (short) 10, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-8) + "'", int2 == (-8));
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(96, 12);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 33 + "'", int2 == 33);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner((int) '#', 33);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 23 + "'", int2 == 23);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(25, (-2));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-17) + "'", int2 == (-17));
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(53, 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7 + "'", int2 == 7);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(17, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(22, (-48));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-11) + "'", int2 == (-11));
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(64, (-48));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-29) + "'", int2 == (-29));
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner((int) '4', 14);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(23, 23);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 22 + "'", int2 == 22);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner((int) '4', (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 48 + "'", int2 == 48);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(34, 5);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 22 + "'", int2 == 22);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner((int) ' ', 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(43, 34);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 43 + "'", int2 == 43);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(43, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 43 + "'", int2 == 43);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(21, 5);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 12 + "'", int2 == 12);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(33, 7);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 12 + "'", int2 == 12);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(33, 50);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 21 + "'", int2 == 21);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner((int) (short) 1, 29);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(64, (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-62) + "'", int2 == (-62));
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner((int) (byte) 10, 50);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner((int) '#', 21);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 31 + "'", int2 == 31);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner((int) (byte) 10, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(50, 35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(21, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-19) + "'", int2 == (-19));
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner((int) (byte) 10, 21);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner((int) '4', 21);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 49 + "'", int2 == 49);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(7, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(5, 11);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(5, (-8));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(64, 7);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 39 + "'", int2 == 39);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(5, 14);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(35, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner((int) (byte) 10, (-11));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-6) + "'", int2 == (-6));
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(4, 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner((int) 'a', (-6));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-48) + "'", int2 == (-48));
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(52, (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 48 + "'", int2 == 48);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(14, (-16));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-9) + "'", int2 == (-9));
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(100, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 22 + "'", int2 == 22);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(22, 11);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(25, 13);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 14 + "'", int2 == 14);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(28, 11);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(50, (-2));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-35) + "'", int2 == (-35));
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(31, (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 18 + "'", int2 == 18);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(48, (-11));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-36) + "'", int2 == (-36));
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(39, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(17, (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7 + "'", int2 == 7);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(12, 25);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner((int) (short) 100, 17);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 53 + "'", int2 == 53);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(39, 96);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 13 + "'", int2 == 13);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(23, 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 16 + "'", int2 == 16);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(11, 96);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(9, 7);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(13, 21);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(33, (-7));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-11) + "'", int2 == (-11));
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner((int) ' ', 21);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(13, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(3, 3);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner((int) (byte) 100, 3);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 90 + "'", int2 == 90);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(28, 6);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 22 + "'", int2 == 22);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(7, 2);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(25, 49);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 18 + "'", int2 == 18);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(43, 41);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner((int) (byte) 1, 29);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(39, (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(18, 28);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(50, 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 49 + "'", int2 == 49);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(22, (-7));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-16) + "'", int2 == (-16));
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner((int) (short) 100, 90);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(41, 48);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 24 + "'", int2 == 24);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(52, (-48));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-34) + "'", int2 == (-34));
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(49, 50);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 45 + "'", int2 == 45);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(8, 50);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(12, 16);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner((int) '#', 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(23, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 23 + "'", int2 == 23);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(15, (-99));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-12) + "'", int2 == (-12));
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(3, 53);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner((int) (short) 100, 16);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 75 + "'", int2 == 75);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(5, 23);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner((int) ' ', 7);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner((int) ' ', (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-30) + "'", int2 == (-30));
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner((int) '#', 14);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 31 + "'", int2 == 31);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(14, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-13) + "'", int2 == (-13));
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(9, 75);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7 + "'", int2 == 7);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(3, (-62));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2) + "'", int2 == (-2));
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(90, (-7));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-71) + "'", int2 == (-71));
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(64, (-19));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-46) + "'", int2 == (-46));
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(41, (-17));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-37) + "'", int2 == (-37));
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(8, 34);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(13, (-7));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-4) + "'", int2 == (-4));
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(43, (-17));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-28) + "'", int2 == (-28));
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(31, (-19));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-13) + "'", int2 == (-13));
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(43, (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(3, 3);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(17, 34);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7 + "'", int2 == 7);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner((int) (short) 100, (-28));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-78) + "'", int2 == (-78));
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(28, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner((int) ' ', 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner((int) (short) 100, (-4));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-32) + "'", int2 == (-32));
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(6, 22);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(31, (int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 26 + "'", int2 == 26);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(35, 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 12 + "'", int2 == 12);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(48, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(1, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(8, (-29));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-3) + "'", int2 == (-3));
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(52, 22);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 27 + "'", int2 == 27);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(39, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(52, (-78));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-47) + "'", int2 == (-47));
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(26, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(48, (-48));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-44) + "'", int2 == (-44));
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(12, (-2));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-8) + "'", int2 == (-8));
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner((int) '4', 7);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 14 + "'", int2 == 14);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(53, 35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(7, (-8));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-3) + "'", int2 == (-3));
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(3, (-24));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(64, 6);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(23, 90);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(2, 49);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(2, (-17));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(2, 9);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(90, (-17));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-70) + "'", int2 == (-70));
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner((int) (byte) 1, 5);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(8, 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner((int) '#', 35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 33 + "'", int2 == 33);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(75, 45);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(100, 33);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 48 + "'", int2 == 48);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner((int) (short) 10, 5);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(16, 50);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(16, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-15) + "'", int2 == (-15));
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(29, (-24));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-12) + "'", int2 == (-12));
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner((int) (byte) 1, (-32));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner((int) (byte) 1, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(52, 16);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(8, 45);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(25, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(64, 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(1, 75);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner((int) ' ', 90);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 14 + "'", int2 == 14);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(50, (-99));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-5) + "'", int2 == (-5));
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(35, 64);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 13 + "'", int2 == 13);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner((int) (byte) 100, (-95));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-16) + "'", int2 == (-16));
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(12, 43);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner((int) 'a', 9);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 54 + "'", int2 == 54);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(50, (-12));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-44) + "'", int2 == (-44));
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(29, (-37));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-17) + "'", int2 == (-17));
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(2, (-46));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(34, (-4));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-20) + "'", int2 == (-20));
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner((int) (byte) 1, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(49, 18);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 34 + "'", int2 == 34);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(9, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(18, (-20));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(28, 50);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 17 + "'", int2 == 17);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(1, (-34));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(32, (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-31) + "'", int2 == (-31));
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(29, 23);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(34, 18);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 12 + "'", int2 == 12);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(6, (-29));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-5) + "'", int2 == (-5));
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(22, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-21) + "'", int2 == (-21));
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(18, 2);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(17, 5);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 11 + "'", int2 == 11);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(35, 90);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 12 + "'", int2 == 12);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(2, (-11));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(22, 34);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 18 + "'", int2 == 18);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(49, (-15));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-5) + "'", int2 == (-5));
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(5, 7);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(11, (-28));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(41, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7 + "'", int2 == 7);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(22, (-3));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-3) + "'", int2 == (-3));
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(1, (-48));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(34, 5);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 23 + "'", int2 == 23);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(2, (-2));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(22, (-99));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-11) + "'", int2 == (-11));
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(4, (-99));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(45, (-24));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-27) + "'", int2 == (-27));
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner((int) (byte) 10, (-78));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(23, 53);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 22 + "'", int2 == 22);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(50, 11);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(53, (-17));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-4) + "'", int2 == (-4));
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(7, (-12));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner((int) 'a', (-37));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-31) + "'", int2 == (-31));
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(32, 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 29 + "'", int2 == 29);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(15, (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 13 + "'", int2 == 13);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner((int) (short) 1, (-7));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(16, (-70));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-13) + "'", int2 == (-13));
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner((int) ' ', (-34));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-5) + "'", int2 == (-5));
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner((int) (short) 10, 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(34, 3);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(39, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-38) + "'", int2 == (-38));
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(8, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(14, (-9));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-5) + "'", int2 == (-5));
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(11, (-78));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2) + "'", int2 == (-2));
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(96, 48);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 58 + "'", int2 == 58);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(34, (-31));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-10) + "'", int2 == (-10));
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(15, 64);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 12 + "'", int2 == 12);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(90, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(12, 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 11 + "'", int2 == 11);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(3, 49);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(33, (-34));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-5) + "'", int2 == (-5));
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner((int) ' ', (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 29 + "'", int2 == 29);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(54, (-10));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-23) + "'", int2 == (-23));
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(43, 13);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(31, (-47));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-6) + "'", int2 == (-6));
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(64, 48);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 30 + "'", int2 == 30);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner((int) (byte) 1, (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(33, (-70));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner((int) '#', (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 34 + "'", int2 == 34);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(50, (-38));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-38) + "'", int2 == (-38));
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner((int) (byte) 10, (-21));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-9) + "'", int2 == (-9));
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(64, 12);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 46 + "'", int2 == 46);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(29, (-8));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-22) + "'", int2 == (-22));
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner((int) (short) 10, 16);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7 + "'", int2 == 7);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(45, 64);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(14, 11);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(52, 25);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(96, (-37));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-92) + "'", int2 == (-92));
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(39, (-2));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-14) + "'", int2 == (-14));
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(2, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(96, (-10));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-82) + "'", int2 == (-82));
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(41, 53);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 36 + "'", int2 == 36);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner((int) (byte) 100, 5);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 47 + "'", int2 == 47);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(41, 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 41 + "'", int2 == 41);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(13, (-32));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(49, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 26 + "'", int2 == 26);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner((int) (short) 1, (-44));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(75, (-10));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-39) + "'", int2 == (-39));
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(48, 11);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 38 + "'", int2 == 38);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(22, 21);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 11 + "'", int2 == 11);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner((int) (byte) 10, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(96, (-70));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-52) + "'", int2 == (-52));
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(16, (-21));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2) + "'", int2 == (-2));
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(41, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 34 + "'", int2 == 34);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(14, 45);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(96, (-5));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-25) + "'", int2 == (-25));
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(9, 58);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7 + "'", int2 == 7);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(32, (-38));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-5) + "'", int2 == (-5));
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner((int) 'a', 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 38 + "'", int2 == 38);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(75, 26);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 12 + "'", int2 == 12);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(36, (-36));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-18) + "'", int2 == (-18));
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(30, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(50, 27);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(38, 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 27 + "'", int2 == 27);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(7, 14);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner((int) (byte) 10, (-24));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(58, 30);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(31, 58);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 14 + "'", int2 == 14);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(90, 53);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 75 + "'", int2 == 75);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(96, (-28));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-63) + "'", int2 == (-63));
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(50, (-32));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-34) + "'", int2 == (-34));
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(31, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 24 + "'", int2 == 24);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner((int) (byte) 1, (-6));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(9, 14);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(96, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-95) + "'", int2 == (-95));
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(36, 33);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 19 + "'", int2 == 19);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(29, (-46));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(22, 9);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(5, 18);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(24, (-31));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-19) + "'", int2 == (-19));
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner((int) (byte) 10, (-23));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-8) + "'", int2 == (-8));
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(27, (-32));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-16) + "'", int2 == (-16));
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(50, (-30));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-40) + "'", int2 == (-40));
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(6, (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(2, (-27));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(16, (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(50, 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 40 + "'", int2 == 40);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(33, 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 16 + "'", int2 == 16);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner((int) '#', 17);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 12 + "'", int2 == 12);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(21, (-7));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-9) + "'", int2 == (-9));
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner((int) (byte) 1, 48);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner((int) (byte) 10, (-46));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(15, 26);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 12 + "'", int2 == 12);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(1, (-51));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(54, 27);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(32, (-4));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-13) + "'", int2 == (-13));
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner((int) (short) 100, 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 26 + "'", int2 == 26);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner((int) (byte) 10, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(58, (-35));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-6) + "'", int2 == (-6));
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(31, (-95));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-15) + "'", int2 == (-15));
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(25, 41);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 13 + "'", int2 == 13);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(75, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(8, 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(100, (-32));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-35) + "'", int2 == (-35));
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(41, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(9, (-27));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-6) + "'", int2 == (-6));
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner((int) '4', (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(17, 3);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(13, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(48, 33);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 38 + "'", int2 == 38);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(3, 50);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(39, (-32));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-37) + "'", int2 == (-37));
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(10, 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(9, (-52));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-6) + "'", int2 == (-6));
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(12, (-31));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-4) + "'", int2 == (-4));
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(40, (-27));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-5) + "'", int2 == (-5));
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(38, 45);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(19, (-28));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-12) + "'", int2 == (-12));
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(4, 22);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(21, (-22));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-5) + "'", int2 == (-5));
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner((int) '#', (-6));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-33) + "'", int2 == (-33));
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(45, (-99));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-36) + "'", int2 == (-36));
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(11, (-99));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-4) + "'", int2 == (-4));
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(12, (-99));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-6) + "'", int2 == (-6));
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner((int) (short) 1, 26);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(7, 90);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(34, (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-32) + "'", int2 == (-32));
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner((int) '4', (-28));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-48) + "'", int2 == (-48));
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(3, (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(5, 3);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(54, 50);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 36 + "'", int2 == 36);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(75, 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 75 + "'", int2 == 75);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(15, (-5));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(34, 36);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 18 + "'", int2 == 18);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(31, (-51));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-10) + "'", int2 == (-10));
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(1, 8);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(25, 34);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(40, (-36));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-8) + "'", int2 == (-8));
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(10, (-34));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(43, 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 18 + "'", int2 == 18);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(21, (-34));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-6) + "'", int2 == (-6));
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(38, 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 31 + "'", int2 == 31);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(18, 19);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 11 + "'", int2 == 11);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(29, (-62));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-23) + "'", int2 == (-23));
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(58, (-30));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-9) + "'", int2 == (-9));
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(18, 39);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(33, 49);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 31 + "'", int2 == 31);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(2, (-36));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(58, (-24));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-31) + "'", int2 == (-31));
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner((int) (short) 1, (-20));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(33, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 33 + "'", int2 == 33);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(16, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-15) + "'", int2 == (-15));
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(14, 16);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner((int) (short) 1, (-23));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner((int) 'a', (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(31, 48);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(45, (-36));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-16) + "'", int2 == (-16));
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(35, 16);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 20 + "'", int2 == 20);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(43, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-42) + "'", int2 == (-42));
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(15, (-42));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-9) + "'", int2 == (-9));
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(48, (-62));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-17) + "'", int2 == (-17));
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(49, (-13));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-41) + "'", int2 == (-41));
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(28, 25);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(5, 38);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(40, 9);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(26, (-62));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-5) + "'", int2 == (-5));
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(22, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner((int) (short) 100, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 22 + "'", int2 == 22);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(15, (-32));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-7) + "'", int2 == (-7));
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner((int) '4', (-99));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-48) + "'", int2 == (-48));
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(13, 75);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(14, (-62));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(45, (-22));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-18) + "'", int2 == (-18));
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(75, (-14));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2) + "'", int2 == (-2));
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(100, (-39));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-70) + "'", int2 == (-70));
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(7, (-40));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-3) + "'", int2 == (-3));
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(90, 27);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 44 + "'", int2 == 44);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(4, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(22, (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner((int) (short) 10, 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(28, (-19));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-16) + "'", int2 == (-16));
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner((int) (short) 100, 54);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 85 + "'", int2 == 85);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner((int) ' ', (-29));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-18) + "'", int2 == (-18));
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(39, 8);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 38 + "'", int2 == 38);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(64, 31);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 25 + "'", int2 == 25);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(14, (-20));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-4) + "'", int2 == (-4));
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner((int) (short) 100, 46);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 89 + "'", int2 == 89);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(85, 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(50, (-23));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-5) + "'", int2 == (-5));
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(4, (-36));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(35, 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 11 + "'", int2 == 11);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(29, (int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 18 + "'", int2 == 18);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(34, (-46));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-7) + "'", int2 == (-7));
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner((int) '4', (-70));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-12) + "'", int2 == (-12));
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(17, 28);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 12 + "'", int2 == 12);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner((int) (byte) 1, (-31));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(19, (-14));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-15) + "'", int2 == (-15));
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(52, 48);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 36 + "'", int2 == 36);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(47, (-12));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-8) + "'", int2 == (-8));
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(48, 48);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 46 + "'", int2 == 46);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(54, (-25));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-52) + "'", int2 == (-52));
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(44, 6);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(26, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(21, (-27));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-9) + "'", int2 == (-9));
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(31, 43);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 27 + "'", int2 == 27);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(75, 29);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 48 + "'", int2 == 48);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(58, 16);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 20 + "'", int2 == 20);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(27, 40);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 21 + "'", int2 == 21);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(47, 49);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 40 + "'", int2 == 40);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(1, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner((int) ' ', 33);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 26 + "'", int2 == 26);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(16, 46);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 12 + "'", int2 == 12);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(89, (-6));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(54, 28);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 53 + "'", int2 == 53);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(2, (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(17, 9);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 17 + "'", int2 == 17);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(36, 35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 31 + "'", int2 == 31);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(29, (-23));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(17, 33);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 12 + "'", int2 == 12);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(43, 28);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 33 + "'", int2 == 33);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(23, 7);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner((int) '4', (-17));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-41) + "'", int2 == (-41));
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(47, 89);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 38 + "'", int2 == 38);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(12, (-44));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner((int) (byte) 100, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(49, 35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 18 + "'", int2 == 18);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(45, 31);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(4, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(53, 27);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 29 + "'", int2 == 29);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(7, (-2));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-6) + "'", int2 == (-6));
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(2, (-11));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(21, 40);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(100, (-46));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-87) + "'", int2 == (-87));
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(34, (-9));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-23) + "'", int2 == (-23));
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(24, (-38));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-13) + "'", int2 == (-13));
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner((int) (short) 1, (-20));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(52, 25);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(22, (-63));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-12) + "'", int2 == (-12));
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(41, 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 20 + "'", int2 == 20);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(36, (-3));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-15) + "'", int2 == (-15));
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(4, (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(23, (-38));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(22, (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(15, 30);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(52, 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 51 + "'", int2 == 51);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(16, 51);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 11 + "'", int2 == 11);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner((int) ' ', 58);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(58, 25);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 40 + "'", int2 == 40);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        int int2 = com.thealgorithms.maths.JosephusProblem.winner(52, 51);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7 + "'", int2 == 7);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(22, (int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        int int2 = com.thealgorithms.maths.JosephusProblem.findTheWinner(27, 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 23 + "'", int2 == 23);
    }
}

